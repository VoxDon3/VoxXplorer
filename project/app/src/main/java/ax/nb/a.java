/*
 * Decompiled with CFR 0.152.
 */
package ax.nb;

import ax.nb.b;
import ax.nb.g;
import ax.pb.d0;
import ax.qb.e;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.util.Hashtable;

public class a {
    private static final String a = ax.jb.a.g("jcifs.netbios.lmhosts");
    private static final Hashtable b = new Hashtable();
    private static long c = 1L;
    private static int d;
    private static e e;

    static {
        e = ax.qb.e.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static g a(b b8) {
        synchronized (a.class) {
            File file = null;
            try {
                FileNotFoundException fileNotFoundException2;
                Object object;
                block7: {
                    try {
                        Object object2 = a;
                        object = file;
                        if (object2 == null) return object;
                        object = new File((String)object2);
                        long l8 = ((File)object).lastModified();
                        if (l8 <= c) return (g)b.get(b8);
                        c = l8;
                        b.clear();
                        d = 0;
                        object2 = new FileReader((File)object);
                        ax.nb.a.c((Reader)object2);
                        return (g)b.get(b8);
                    }
                    catch (IOException iOException) {
                    }
                    catch (FileNotFoundException fileNotFoundException2) {
                        break block7;
                    }
                    object = file;
                    if (ax.qb.e.c0 <= 0) return object;
                    iOException.printStackTrace(e);
                    return file;
                }
                object = file;
                if (ax.qb.e.c0 <= 1) return object;
                e e8 = e;
                object = new StringBuilder();
                ((StringBuilder)object).append("lmhosts file: ");
                ((StringBuilder)object).append(a);
                e8.println(((StringBuilder)object).toString());
                fileNotFoundException2.printStackTrace(e);
                return file;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static g b(String object) {
        synchronized (a.class) {
            b b8 = new b((String)object, 32, null);
            return ax.nb.a.a(b8);
        }
    }

    static void c(Reader reader) throws IOException {
        Object object;
        reader = new BufferedReader(reader);
        while ((object = ((BufferedReader)reader).readLine()) != null) {
            int n8;
            int n9;
            Object object2 = ((String)object).toUpperCase().trim();
            if (((String)object2).length() == 0) continue;
            if (((String)object2).charAt(0) == '#') {
                if (((String)object2).startsWith("#INCLUDE ")) {
                    object2 = ((String)object2).substring(((String)object2).indexOf(92));
                    object = new StringBuilder();
                    ((StringBuilder)object).append("smb:");
                    ((StringBuilder)object).append(((String)object2).replace('\\', '/'));
                    object = ((StringBuilder)object).toString();
                    if (d > 0) {
                        try {
                            object2 = new d0((String)object);
                            InputStreamReader inputStreamReader = new InputStreamReader((InputStream)object2);
                            ax.nb.a.c(inputStreamReader);
                            --d;
                        }
                        catch (IOException iOException) {
                            object2 = e;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("lmhosts URL: ");
                            stringBuilder.append((String)object);
                            ((PrintStream)object2).println(stringBuilder.toString());
                            iOException.printStackTrace(e);
                            continue;
                        }
                        while ((object = ((BufferedReader)reader).readLine()) != null && !((String)object).toUpperCase().trim().startsWith("#END_ALTERNATE")) {
                        }
                        continue;
                    }
                    ax.nb.a.c(new InputStreamReader(new d0((String)object)));
                    continue;
                }
                if (((String)object2).startsWith("#BEGIN_ALTERNATE")) {
                    ++d;
                    continue;
                }
                if (!((String)object2).startsWith("#END_ALTERNATE") || (n9 = d) <= 0) continue;
                d = n9 - 1;
                throw new IOException("no lmhosts alternate includes loaded");
            }
            if (!Character.isDigit(((String)object2).charAt(0))) continue;
            object = ((String)object2).toCharArray();
            n9 = 0;
            Object object3 = 46;
            int n10 = 0;
            while (true) {
                n8 = n9;
                if (n9 >= ((Object)object).length) break;
                n8 = n9;
                if (object3 != 46) break;
                n8 = 0;
                while (n9 < ((Object)object).length) {
                    Object object4 = object[n9];
                    object3 = object4;
                    if (object4 < 48) break;
                    object3 = object4;
                    if (object4 > 57) break;
                    n8 = n8 * 10 + object4 - 48;
                    ++n9;
                    object3 = object4;
                }
                n10 = (n10 << 8) + n8;
                ++n9;
            }
            while (n8 < ((Object)object).length && Character.isWhitespace((char)object[n8])) {
                ++n8;
            }
            for (n9 = n8; n9 < ((Object)object).length && !Character.isWhitespace((char)object[n9]); ++n9) {
            }
            object = new b(((String)object2).substring(n8, n9), 32, null);
            object2 = new g((b)object, n10, false, 0, false, false, true, true, g.t);
            b.put(object, object2);
        }
    }
}

