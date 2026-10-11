package ax.nb;

import ax.jb.C2345a;
import ax.pb.C2800d0;
import ax.qb.C2897e;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Hashtable;

/* renamed from: ax.nb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2638a {
    private static int d;
    private static final String a = C2345a.g("jcifs.netbios.lmhosts");
    private static final Hashtable b = new Hashtable();
    private static long c = 1;
    private static C2897e e = C2897e.a();

    static synchronized C2644g a(C2639b c2639b) {
        C2644g c2644g;
        synchronized (C2638a.class) {
            c2644g = null;
            try {
                try {
                    String str = a;
                    if (str != null) {
                        File file = new File(str);
                        long lastModified = file.lastModified();
                        if (lastModified > c) {
                            c = lastModified;
                            b.clear();
                            d = 0;
                            c(new FileReader(file));
                        }
                        c2644g = (C2644g) b.get(c2639b);
                    }
                } catch (FileNotFoundException e2) {
                    if (C2897e.c0 > 1) {
                        e.println("lmhosts file: " + a);
                        e2.printStackTrace(e);
                    }
                } catch (IOException e3) {
                    if (C2897e.c0 > 0) {
                        e3.printStackTrace(e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2644g;
    }

    public static synchronized C2644g b(String str) {
        C2644g a2;
        synchronized (C2638a.class) {
            a2 = a(new C2639b(str, 32, null));
        }
        return a2;
    }

    static void c(Reader reader) throws IOException {
        String readLine;
        int i;
        BufferedReader bufferedReader = new BufferedReader(reader);
        while (true) {
            String readLine2 = bufferedReader.readLine();
            if (readLine2 == null) {
                return;
            }
            String trim = readLine2.toUpperCase().trim();
            if (trim.length() != 0) {
                if (trim.charAt(0) == '#') {
                    if (trim.startsWith("#INCLUDE ")) {
                        String str = "smb:" + trim.substring(trim.indexOf(92)).replace('\\', '/');
                        if (d > 0) {
                            try {
                                c(new InputStreamReader(new C2800d0(str)));
                                d--;
                                do {
                                    readLine = bufferedReader.readLine();
                                    if (readLine != null) {
                                    }
                                } while (!readLine.toUpperCase().trim().startsWith("#END_ALTERNATE"));
                            } catch (IOException e2) {
                                e.println("lmhosts URL: " + str);
                                e2.printStackTrace(e);
                            }
                        } else {
                            c(new InputStreamReader(new C2800d0(str)));
                        }
                    } else if (trim.startsWith("#BEGIN_ALTERNATE")) {
                        d++;
                    } else if (trim.startsWith("#END_ALTERNATE") && (i = d) > 0) {
                        d = i - 1;
                        throw new IOException("no lmhosts alternate includes loaded");
                    }
                } else if (Character.isDigit(trim.charAt(0))) {
                    char[] charArray = trim.toCharArray();
                    int i2 = 0;
                    char c2 = '.';
                    int i3 = 0;
                    while (i2 < charArray.length && c2 == '.') {
                        int i4 = 0;
                        while (i2 < charArray.length && (c2 = charArray[i2]) >= '0' && c2 <= '9') {
                            i4 = ((i4 * 10) + c2) - 48;
                            i2++;
                        }
                        i3 = (i3 << 8) + i4;
                        i2++;
                    }
                    while (i2 < charArray.length && Character.isWhitespace(charArray[i2])) {
                        i2++;
                    }
                    int i5 = i2;
                    while (i5 < charArray.length && !Character.isWhitespace(charArray[i5])) {
                        i5++;
                    }
                    C2639b c2639b = new C2639b(trim.substring(i2, i5), 32, null);
                    b.put(c2639b, new C2644g(c2639b, i3, false, 0, false, false, true, true, C2644g.t));
                }
            }
        }
    }
}
