package ax.Lc;

import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class b {
    private static final String[] a = new String[0];
    public static final String b = Character.toString('.');
    private static final char c;
    private static final char d;
    private static final Pattern e;
    private static final Pattern f;

    static {
        char c2 = File.separatorChar;
        c = c2;
        d = a(c2);
        e = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
        f = Pattern.compile("^[a-zA-Z0-9][a-zA-Z0-9-]*$");
    }

    static char a(char c2) {
        if (c2 == '/') {
            return '\\';
        }
        if (c2 == '\\') {
            return '/';
        }
        throw new IllegalArgumentException(String.valueOf(c2));
    }

    static String[] b(String str) {
        if (str.indexOf(63) == -1 && str.indexOf(42) == -1) {
            return new String[]{str};
        }
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int length = charArray.length;
        int i = 0;
        char c2 = 0;
        while (i < length) {
            char c3 = charArray[i];
            if (c3 == '?' || c3 == '*') {
                if (sb.length() != 0) {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                }
                if (c3 == '?') {
                    arrayList.add("?");
                } else if (c2 != '*') {
                    arrayList.add("*");
                }
            } else {
                sb.append(c3);
            }
            i++;
            c2 = c3;
        }
        if (sb.length() != 0) {
            arrayList.add(sb.toString());
        }
        return (String[]) arrayList.toArray(a);
    }

    public static boolean c(String str, String str2, c cVar) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null && str2 != null) {
            c l = c.l(cVar, c.SENSITIVE);
            String[] b2 = b(str2);
            ArrayDeque arrayDeque = new ArrayDeque(b2.length);
            boolean z = false;
            int i = 0;
            int i2 = 0;
            do {
                if (!arrayDeque.isEmpty()) {
                    int[] iArr = (int[]) arrayDeque.pop();
                    i2 = iArr[0];
                    i = iArr[1];
                    z = true;
                }
                while (i2 < b2.length) {
                    if (b2[i2].equals("?")) {
                        i++;
                        if (i > str.length()) {
                            break;
                        }
                        z = false;
                        i2++;
                    } else if (b2[i2].equals("*")) {
                        if (i2 == b2.length - 1) {
                            i = str.length();
                        }
                        z = true;
                        i2++;
                    } else {
                        if (z) {
                            i = l.h(str, i, b2[i2]);
                            if (i == -1) {
                                break;
                            }
                            int h = l.h(str, i + 1, b2[i2]);
                            if (h >= 0) {
                                arrayDeque.push(new int[]{i2, h});
                            }
                            i += b2[i2].length();
                            z = false;
                        } else {
                            if (!l.j(str, i, b2[i2])) {
                                break;
                            }
                            i += b2[i2].length();
                            z = false;
                        }
                        i2++;
                    }
                }
                if (i2 == b2.length && i == str.length()) {
                    return true;
                }
            } while (!arrayDeque.isEmpty());
        }
        return false;
    }
}
