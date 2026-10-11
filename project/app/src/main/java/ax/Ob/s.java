/*
 * Decompiled with CFR 0.152.
 */
package ax.Ob;

import ax.Gb.l;
import ax.Gb.y;
import ax.Lb.f;
import ax.Ob.c;
import ax.Ob.d;
import ax.Ob.r;
import ax.Ob.u;
import java.util.Comparator;

class s
extends r {
    public static final String A(String string, char c8, char c9, boolean bl) {
        l.f(string, "<this>");
        if (!bl) {
            string = string.replace(c8, c9);
            l.e(string, "replace(...)");
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder(string.length());
        for (int i8 = 0; i8 < string.length(); ++i8) {
            char c10;
            char c11 = c10 = string.charAt(i8);
            if (c.d(c10, c8, bl)) {
                c11 = c9;
            }
            stringBuilder.append(c11);
        }
        return stringBuilder.toString();
    }

    public static final String B(String string, String string2, String string3, boolean bl) {
        l.f(string, "<this>");
        l.f(string2, "oldValue");
        l.f(string3, "newValue");
        int n8 = 0;
        int n9 = u.R(string, string2, 0, bl);
        if (n9 < 0) {
            return string;
        }
        int n10 = string2.length();
        int n11 = f.b(n10, 1);
        int n12 = string.length() - n10 + string3.length();
        if (n12 >= 0) {
            int n13;
            StringBuilder stringBuilder = new StringBuilder(n12);
            do {
                stringBuilder.append(string, n8, n9);
                stringBuilder.append(string3);
                n13 = n9 + n10;
                if (n9 >= string.length()) break;
                n12 = u.R(string, string2, n9 + n11, bl);
                n8 = n13;
                n9 = n12;
            } while (n12 > 0);
            stringBuilder.append(string, n13, string.length());
            string = stringBuilder.toString();
            l.e(string, "toString(...)");
            return string;
        }
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ String C(String string, char c8, char c9, boolean bl, int n8, Object object) {
        if ((n8 & 4) != 0) {
            bl = false;
        }
        return s.A(string, c8, c9, bl);
    }

    public static /* synthetic */ String D(String string, String string2, String string3, boolean bl, int n8, Object object) {
        if ((n8 & 4) != 0) {
            bl = false;
        }
        return s.B(string, string2, string3, bl);
    }

    public static boolean E(String string, String string2, int n8, boolean bl) {
        l.f(string, "<this>");
        l.f(string2, "prefix");
        if (!bl) {
            return string.startsWith(string2, n8);
        }
        return s.x(string, n8, string2, 0, string2.length(), bl);
    }

    public static boolean F(String string, String string2, boolean bl) {
        l.f(string, "<this>");
        l.f(string2, "prefix");
        if (!bl) {
            return string.startsWith(string2);
        }
        return s.x(string, 0, string2, 0, string2.length(), bl);
    }

    public static /* synthetic */ boolean G(String string, String string2, int n8, boolean bl, int n9, Object object) {
        if ((n9 & 4) != 0) {
            bl = false;
        }
        return s.E(string, string2, n8, bl);
    }

    public static /* synthetic */ boolean H(String string, String string2, boolean bl, int n8, Object object) {
        if ((n8 & 2) != 0) {
            bl = false;
        }
        return s.F(string, string2, bl);
    }

    public static String q(char[] cArray) {
        l.f(cArray, "<this>");
        return new String(cArray);
    }

    public static String r(char[] cArray, int n8, int n9) {
        l.f(cArray, "<this>");
        ax.tb.c.q.a(n8, n9, cArray.length);
        return new String(cArray, n8, n9 - n8);
    }

    public static byte[] s(String object) {
        l.f(object, "<this>");
        object = ((String)object).getBytes(d.b);
        l.e(object, "getBytes(...)");
        return object;
    }

    public static final boolean t(String string, String string2, boolean bl) {
        l.f(string, "<this>");
        l.f(string2, "suffix");
        if (!bl) {
            return string.endsWith(string2);
        }
        return s.x(string, string.length() - string2.length(), string2, 0, string2.length(), true);
    }

    public static /* synthetic */ boolean u(String string, String string2, boolean bl, int n8, Object object) {
        if ((n8 & 2) != 0) {
            bl = false;
        }
        return s.t(string, string2, bl);
    }

    public static boolean v(String string, String string2, boolean bl) {
        if (string == null) {
            return string2 == null;
        }
        if (!bl) {
            return string.equals(string2);
        }
        return string.equalsIgnoreCase(string2);
    }

    public static Comparator<String> w(y object) {
        l.f(object, "<this>");
        object = String.CASE_INSENSITIVE_ORDER;
        l.e(object, "CASE_INSENSITIVE_ORDER");
        return object;
    }

    public static final boolean x(String string, int n8, String string2, int n9, int n10, boolean bl) {
        l.f(string, "<this>");
        l.f(string2, "other");
        if (!bl) {
            return string.regionMatches(n8, string2, n9, n10);
        }
        return string.regionMatches(bl, n8, string2, n9, n10);
    }

    public static /* synthetic */ boolean y(String string, int n8, String string2, int n9, int n10, boolean bl, int n11, Object object) {
        block0: {
            if ((n11 & 0x10) == 0) break block0;
            bl = false;
        }
        return s.x(string, n8, string2, n9, n10, bl);
    }

    public static String z(CharSequence object, int n8) {
        l.f(object, "<this>");
        if (n8 >= 0) {
            if (n8 != 0) {
                int n9 = 1;
                if (n8 != 1) {
                    int n10 = object.length();
                    if (n10 != 0) {
                        if (n10 != 1) {
                            StringBuilder stringBuilder = new StringBuilder(object.length() * n8);
                            if (1 <= n8) {
                                while (true) {
                                    stringBuilder.append((CharSequence)object);
                                    if (n9 == n8) break;
                                    ++n9;
                                }
                            }
                            object = stringBuilder.toString();
                            l.c(object);
                            return object;
                        }
                        char c8 = object.charAt(0);
                        object = new char[n8];
                        for (n9 = 0; n9 < n8; ++n9) {
                            object[n9] = c8;
                        }
                        return new String((char[])object);
                    }
                    return "";
                }
                return object.toString();
            }
            return "";
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Count 'n' must be non-negative, but was ");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append('.');
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }
}

