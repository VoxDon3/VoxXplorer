/*
 * Decompiled with CFR 0.152.
 */
package ax.Ob;

import ax.Gb.l;
import ax.Nb.h;
import ax.Ob.b;
import ax.Ob.c;
import ax.Ob.e;
import ax.Ob.f;
import ax.Ob.s;
import ax.Ob.t;
import ax.sb.m;
import ax.sb.q;
import ax.tb.i;
import ax.tb.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class u
extends s {
    public static CharSequence A0(CharSequence charSequence) {
        l.f(charSequence, "<this>");
        int n8 = charSequence.length() - 1;
        int n9 = 0;
        boolean bl = false;
        while (n9 <= n8) {
            int n10 = !bl ? n9 : n8;
            boolean bl2 = b.c(charSequence.charAt(n10));
            if (!bl) {
                if (!bl2) {
                    bl = true;
                    continue;
                }
                ++n9;
                continue;
            }
            if (!bl2) break;
            --n8;
        }
        return charSequence.subSequence(n9, n8 + 1);
    }

    public static /* synthetic */ m I(char[] cArray, boolean bl, CharSequence charSequence, int n8) {
        return u.h0(cArray, bl, charSequence, n8);
    }

    public static final boolean J(CharSequence charSequence, char c8, boolean bl) {
        l.f(charSequence, "<this>");
        return u.U(charSequence, c8, 0, bl, 2, null) >= 0;
    }

    public static final boolean K(CharSequence charSequence, CharSequence charSequence2, boolean bl) {
        l.f(charSequence, "<this>");
        l.f(charSequence2, "other");
        if (charSequence2 instanceof String) {
            return u.V(charSequence, (String)charSequence2, 0, bl, 2, null) >= 0;
        }
        return u.T(charSequence, charSequence2, 0, charSequence.length(), bl, false, 16, null) >= 0;
    }

    public static /* synthetic */ boolean L(CharSequence charSequence, char c8, boolean bl, int n8, Object object) {
        if ((n8 & 2) != 0) {
            bl = false;
        }
        return u.J(charSequence, c8, bl);
    }

    public static /* synthetic */ boolean M(CharSequence charSequence, CharSequence charSequence2, boolean bl, int n8, Object object) {
        if ((n8 & 2) != 0) {
            bl = false;
        }
        return u.K(charSequence, charSequence2, bl);
    }

    public static final boolean N(CharSequence charSequence, CharSequence charSequence2, boolean bl) {
        l.f(charSequence, "<this>");
        l.f(charSequence2, "suffix");
        if (!bl && charSequence instanceof String && charSequence2 instanceof String) {
            return s.u((String)charSequence, (String)charSequence2, false, 2, null);
        }
        return u.i0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), bl);
    }

    public static /* synthetic */ boolean O(CharSequence charSequence, CharSequence charSequence2, boolean bl, int n8, Object object) {
        if ((n8 & 2) != 0) {
            bl = false;
        }
        return u.N(charSequence, charSequence2, bl);
    }

    public static final int P(CharSequence charSequence) {
        l.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int Q(CharSequence charSequence, char c8, int n8, boolean bl) {
        l.f(charSequence, "<this>");
        if (!bl && charSequence instanceof String) {
            return ((String)charSequence).indexOf(c8, n8);
        }
        return u.W(charSequence, new char[]{c8}, n8, bl);
    }

    public static final int R(CharSequence charSequence, String string, int n8, boolean bl) {
        l.f(charSequence, "<this>");
        l.f(string, "string");
        if (!bl && charSequence instanceof String) {
            return ((String)charSequence).indexOf(string, n8);
        }
        return u.T(charSequence, string, n8, charSequence.length(), bl, false, 16, null);
    }

    private static final int S(CharSequence charSequence, CharSequence charSequence2, int n8, int n9, boolean bl, boolean bl2) {
        Object object = !bl2 ? new ax.Lb.e(ax.Lb.f.b(n8, 0), ax.Lb.f.d(n9, charSequence.length())) : ax.Lb.f.j(ax.Lb.f.d(n8, u.P(charSequence)), ax.Lb.f.b(n9, 0));
        if (charSequence instanceof String && charSequence2 instanceof String) {
            n8 = ((ax.Lb.c)object).k();
            int n10 = ((ax.Lb.c)object).l();
            n9 = ((ax.Lb.c)object).n();
            if (n9 > 0 && n8 <= n10 || n9 < 0 && n10 <= n8) {
                while (true) {
                    if (s.x((String)(object = (String)charSequence2), 0, (String)charSequence, n8, ((String)object).length(), bl)) {
                        return n8;
                    }
                    if (n8 != n10) {
                        n8 += n9;
                        continue;
                    }
                    break;
                }
            }
        } else {
            n8 = ((ax.Lb.c)object).k();
            n9 = ((ax.Lb.c)object).l();
            int n11 = ((ax.Lb.c)object).n();
            if (n11 > 0 && n8 <= n9 || n11 < 0 && n9 <= n8) {
                while (true) {
                    if (bl2 = u.i0(charSequence2, 0, charSequence, n8, charSequence2.length(), bl)) {
                        return n8;
                    }
                    if (n8 == n9) break;
                    n8 += n11;
                }
            }
        }
        return -1;
    }

    static /* synthetic */ int T(CharSequence charSequence, CharSequence charSequence2, int n8, int n9, boolean bl, boolean bl2, int n10, Object object) {
        block0: {
            if ((n10 & 0x10) == 0) break block0;
            bl2 = false;
        }
        return u.S(charSequence, charSequence2, n8, n9, bl, bl2);
    }

    public static /* synthetic */ int U(CharSequence charSequence, char c8, int n8, boolean bl, int n9, Object object) {
        if ((n9 & 2) != 0) {
            n8 = 0;
        }
        if ((n9 & 4) != 0) {
            bl = false;
        }
        return u.Q(charSequence, c8, n8, bl);
    }

    public static /* synthetic */ int V(CharSequence charSequence, String string, int n8, boolean bl, int n9, Object object) {
        if ((n9 & 2) != 0) {
            n8 = 0;
        }
        if ((n9 & 4) != 0) {
            bl = false;
        }
        return u.R(charSequence, string, n8, bl);
    }

    public static final int W(CharSequence charSequence, char[] cArray, int n8, boolean bl) {
        int n9;
        l.f(charSequence, "<this>");
        l.f(cArray, "chars");
        if (!bl && cArray.length == 1 && charSequence instanceof String) {
            char c8 = i.B(cArray);
            return ((String)charSequence).indexOf(c8, n8);
        }
        if ((n8 = ax.Lb.f.b(n8, 0)) <= (n9 = u.P(charSequence))) {
            while (true) {
                char c9 = charSequence.charAt(n8);
                int n10 = cArray.length;
                for (int i8 = 0; i8 < n10; ++i8) {
                    if (!c.d(cArray[i8], c9, bl)) continue;
                    return n8;
                }
                if (n8 == n9) break;
                ++n8;
            }
        }
        return -1;
    }

    public static boolean X(CharSequence charSequence) {
        l.f(charSequence, "<this>");
        for (int i8 = 0; i8 < charSequence.length(); ++i8) {
            if (b.c(charSequence.charAt(i8))) continue;
            return false;
        }
        return true;
    }

    public static final int Y(CharSequence charSequence, char c8, int n8, boolean bl) {
        l.f(charSequence, "<this>");
        if (!bl && charSequence instanceof String) {
            return ((String)charSequence).lastIndexOf(c8, n8);
        }
        return u.a0(charSequence, new char[]{c8}, n8, bl);
    }

    public static /* synthetic */ int Z(CharSequence charSequence, char c8, int n8, boolean bl, int n9, Object object) {
        if ((n9 & 2) != 0) {
            n8 = u.P(charSequence);
        }
        if ((n9 & 4) != 0) {
            bl = false;
        }
        return u.Y(charSequence, c8, n8, bl);
    }

    public static final int a0(CharSequence charSequence, char[] cArray, int n8, boolean bl) {
        l.f(charSequence, "<this>");
        l.f(cArray, "chars");
        if (!bl && cArray.length == 1 && charSequence instanceof String) {
            char c8 = i.B(cArray);
            return ((String)charSequence).lastIndexOf(c8, n8);
        }
        for (n8 = ax.Lb.f.d(n8, u.P(charSequence)); -1 < n8; --n8) {
            char c9 = charSequence.charAt(n8);
            int n9 = cArray.length;
            for (int i8 = 0; i8 < n9; ++i8) {
                if (!c.d(cArray[i8], c9, bl)) continue;
                return n8;
            }
        }
        return -1;
    }

    public static final ax.Nb.e<String> b0(CharSequence charSequence) {
        l.f(charSequence, "<this>");
        return new ax.Nb.e<String>(charSequence){
            final CharSequence a;
            {
                this.a = charSequence;
            }

            @Override
            public Iterator<String> iterator() {
                return new f(this.a);
            }
        };
    }

    public static final List<String> c0(CharSequence charSequence) {
        l.f(charSequence, "<this>");
        return h.m(u.b0(charSequence));
    }

    public static final CharSequence d0(CharSequence charSequence, int n8, char c8) {
        l.f(charSequence, "<this>");
        if (n8 >= 0) {
            if (n8 <= charSequence.length()) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder stringBuilder = new StringBuilder(n8);
            int n9 = n8 - charSequence.length();
            n8 = 1;
            if (1 <= n9) {
                while (true) {
                    stringBuilder.append(c8);
                    if (n8 == n9) break;
                    ++n8;
                }
            }
            stringBuilder.append(charSequence);
            return stringBuilder;
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("Desired length ");
        ((StringBuilder)charSequence).append(n8);
        ((StringBuilder)charSequence).append(" is less than zero.");
        throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
    }

    public static String e0(String string, int n8, char c8) {
        l.f(string, "<this>");
        return ((Object)u.d0(string, n8, c8)).toString();
    }

    private static final ax.Nb.e<ax.Lb.e> f0(CharSequence charSequence, char[] cArray, int n8, boolean bl, int n9) {
        u.n0(n9);
        return new e(charSequence, n8, n9, new t(cArray, bl));
    }

    static /* synthetic */ ax.Nb.e g0(CharSequence charSequence, char[] cArray, int n8, boolean bl, int n9, int n10, Object object) {
        if ((n10 & 2) != 0) {
            n8 = 0;
        }
        if ((n10 & 4) != 0) {
            bl = false;
        }
        if ((n10 & 8) != 0) {
            n9 = 0;
        }
        return u.f0(charSequence, cArray, n8, bl, n9);
    }

    private static final m h0(char[] cArray, boolean bl, CharSequence charSequence, int n8) {
        l.f(charSequence, "$this$DelimitedRangesSequence");
        n8 = u.W(charSequence, cArray, n8, bl);
        if (n8 < 0) {
            return null;
        }
        return q.a(n8, 1);
    }

    public static final boolean i0(CharSequence charSequence, int n8, CharSequence charSequence2, int n9, int n10, boolean bl) {
        l.f(charSequence, "<this>");
        l.f(charSequence2, "other");
        if (n9 >= 0 && n8 >= 0 && n8 <= charSequence.length() - n10 && n9 <= charSequence2.length() - n10) {
            for (int i8 = 0; i8 < n10; ++i8) {
                if (c.d(charSequence.charAt(n8 + i8), charSequence2.charAt(n9 + i8), bl)) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public static String j0(String string, CharSequence charSequence) {
        l.f(string, "<this>");
        l.f(charSequence, "prefix");
        String string2 = string;
        if (u.s0(string, charSequence, false, 2, null)) {
            string2 = string.substring(charSequence.length());
            l.e(string2, "substring(...)");
        }
        return string2;
    }

    public static String k0(String string, CharSequence charSequence) {
        l.f(string, "<this>");
        l.f(charSequence, "suffix");
        String string2 = string;
        if (u.O(string, charSequence, false, 2, null)) {
            string2 = string.substring(0, string.length() - charSequence.length());
            l.e(string2, "substring(...)");
        }
        return string2;
    }

    public static String l0(String string, CharSequence charSequence) {
        l.f(string, "<this>");
        l.f(charSequence, "delimiter");
        return u.m0(string, charSequence, charSequence);
    }

    public static final String m0(String string, CharSequence charSequence, CharSequence charSequence2) {
        l.f(string, "<this>");
        l.f(charSequence, "prefix");
        l.f(charSequence2, "suffix");
        String string2 = string;
        if (string.length() >= charSequence.length() + charSequence2.length()) {
            string2 = string;
            if (u.s0(string, charSequence, false, 2, null)) {
                string2 = string;
                if (u.O(string, charSequence2, false, 2, null)) {
                    string2 = string.substring(charSequence.length(), string.length() - charSequence2.length());
                    l.e(string2, "substring(...)");
                }
            }
        }
        return string2;
    }

    public static final void n0(int n8) {
        if (n8 >= 0) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Limit must be non-negative, but was ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    public static final List<String> o0(CharSequence charSequence, char[] object, boolean bl, int n8) {
        l.f(charSequence, "<this>");
        l.f(object, "delimiters");
        if (((char[])object).length == 1) {
            return u.p0(charSequence, String.valueOf(object[0]), bl, n8);
        }
        Object object2 = h.h(u.g0(charSequence, (char[])object, 0, bl, n8, 2, null));
        object = new ArrayList(o.s(object2, 10));
        object2 = object2.iterator();
        while (object2.hasNext()) {
            object.add(u.t0(charSequence, (ax.Lb.e)object2.next()));
        }
        return object;
    }

    private static final List<String> p0(CharSequence charSequence, String string, boolean bl, int n8) {
        u.n0(n8);
        int n9 = 0;
        int n10 = u.R(charSequence, string, 0, bl);
        if (n10 != -1 && n8 != 1) {
            int n11;
            boolean bl2 = n8 > 0;
            int n12 = 10;
            if (bl2) {
                n12 = ax.Lb.f.d(n8, 10);
            }
            ArrayList<String> arrayList = new ArrayList<String>(n12);
            n12 = n10;
            do {
                arrayList.add(((Object)charSequence.subSequence(n9, n12)).toString());
                n10 = string.length() + n12;
                if (bl2 && arrayList.size() == n8 - 1) break;
                n11 = u.R(charSequence, string, n10, bl);
                n9 = n10;
                n12 = n11;
            } while (n11 != -1);
            arrayList.add(((Object)charSequence.subSequence(n10, charSequence.length())).toString());
            return arrayList;
        }
        return o.d(((Object)charSequence).toString());
    }

    public static /* synthetic */ List q0(CharSequence charSequence, char[] cArray, boolean bl, int n8, int n9, Object object) {
        if ((n9 & 2) != 0) {
            bl = false;
        }
        if ((n9 & 4) != 0) {
            n8 = 0;
        }
        return u.o0(charSequence, cArray, bl, n8);
    }

    public static final boolean r0(CharSequence charSequence, CharSequence charSequence2, boolean bl) {
        l.f(charSequence, "<this>");
        l.f(charSequence2, "prefix");
        if (!bl && charSequence instanceof String && charSequence2 instanceof String) {
            return s.H((String)charSequence, (String)charSequence2, false, 2, null);
        }
        return u.i0(charSequence, 0, charSequence2, 0, charSequence2.length(), bl);
    }

    public static /* synthetic */ boolean s0(CharSequence charSequence, CharSequence charSequence2, boolean bl, int n8, Object object) {
        if ((n8 & 2) != 0) {
            bl = false;
        }
        return u.r0(charSequence, charSequence2, bl);
    }

    public static final String t0(CharSequence charSequence, ax.Lb.e e8) {
        l.f(charSequence, "<this>");
        l.f(e8, "range");
        return ((Object)charSequence.subSequence(e8.t(), e8.s() + 1)).toString();
    }

    public static final String u0(String string, char c8, String string2) {
        l.f(string, "<this>");
        l.f(string2, "missingDelimiterValue");
        int n8 = u.U(string, c8, 0, false, 6, null);
        if (n8 == -1) {
            return string2;
        }
        string = string.substring(n8 + 1, string.length());
        l.e(string, "substring(...)");
        return string;
    }

    public static final String v0(String string, String string2, String string3) {
        l.f(string, "<this>");
        l.f(string2, "delimiter");
        l.f(string3, "missingDelimiterValue");
        int n8 = u.V(string, string2, 0, false, 6, null);
        if (n8 == -1) {
            return string3;
        }
        string = string.substring(n8 + string2.length(), string.length());
        l.e(string, "substring(...)");
        return string;
    }

    public static /* synthetic */ String w0(String string, char c8, String string2, int n8, Object object) {
        if ((n8 & 2) != 0) {
            string2 = string;
        }
        return u.u0(string, c8, string2);
    }

    public static /* synthetic */ String x0(String string, String string2, String string3, int n8, Object object) {
        if ((n8 & 2) != 0) {
            string3 = string;
        }
        return u.v0(string, string2, string3);
    }

    public static String y0(String string, char c8, String string2) {
        l.f(string, "<this>");
        l.f(string2, "missingDelimiterValue");
        int n8 = u.Z(string, c8, 0, false, 6, null);
        if (n8 == -1) {
            return string2;
        }
        string = string.substring(n8 + 1, string.length());
        l.e(string, "substring(...)");
        return string;
    }

    public static /* synthetic */ String z0(String string, char c8, String string2, int n8, Object object) {
        if ((n8 & 2) != 0) {
            string2 = string;
        }
        return u.y0(string, c8, string2);
    }
}

