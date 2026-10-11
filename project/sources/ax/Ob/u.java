package ax.Ob;

import ax.sb.C3081m;
import ax.tb.C3133i;
import ax.tb.C3139o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class u extends s {

    public static final class a implements ax.Nb.e<String> {
        final /* synthetic */ CharSequence a;

        public a(CharSequence charSequence) {
            this.a = charSequence;
        }

        @Override // ax.Nb.e
        public Iterator<String> iterator() {
            return new f(this.a);
        }
    }

    public static CharSequence A0(CharSequence charSequence) {
        ax.Gb.l.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean c = b.c(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!c) {
                    break;
                }
                length--;
            } else if (c) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final boolean J(CharSequence charSequence, char c, boolean z) {
        ax.Gb.l.f(charSequence, "<this>");
        return U(charSequence, c, 0, z, 2, null) >= 0;
    }

    public static final boolean K(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        ax.Gb.l.f(charSequence, "<this>");
        ax.Gb.l.f(charSequence2, "other");
        return charSequence2 instanceof String ? V(charSequence, (String) charSequence2, 0, z, 2, null) >= 0 : T(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) >= 0;
    }

    public static /* synthetic */ boolean L(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return J(charSequence, c, z);
    }

    public static /* synthetic */ boolean M(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return K(charSequence, charSequence2, z);
    }

    public static final boolean N(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        ax.Gb.l.f(charSequence, "<this>");
        ax.Gb.l.f(charSequence2, "suffix");
        return (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) ? s.u((String) charSequence, (String) charSequence2, false, 2, null) : i0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ boolean O(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return N(charSequence, charSequence2, z);
    }

    public static final int P(CharSequence charSequence) {
        ax.Gb.l.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int Q(CharSequence charSequence, char c, int i, boolean z) {
        ax.Gb.l.f(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? W(charSequence, new char[]{c}, i, z) : ((String) charSequence).indexOf(c, i);
    }

    public static final int R(CharSequence charSequence, String str, int i, boolean z) {
        ax.Gb.l.f(charSequence, "<this>");
        ax.Gb.l.f(str, "string");
        return (z || !(charSequence instanceof String)) ? T(charSequence, str, i, charSequence.length(), z, false, 16, null) : ((String) charSequence).indexOf(str, i);
    }

    private static final int S(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        ax.Lb.c eVar = !z2 ? new ax.Lb.e(ax.Lb.f.b(i, 0), ax.Lb.f.d(i2, charSequence.length())) : ax.Lb.f.j(ax.Lb.f.d(i, P(charSequence)), ax.Lb.f.b(i2, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int k = eVar.k();
            int l = eVar.l();
            int n = eVar.n();
            if ((n <= 0 || k > l) && (n >= 0 || l > k)) {
                return -1;
            }
            int i3 = k;
            while (true) {
                String str = (String) charSequence2;
                boolean z3 = z;
                if (s.x(str, 0, (String) charSequence, i3, str.length(), z3)) {
                    return i3;
                }
                if (i3 == l) {
                    return -1;
                }
                i3 += n;
                z = z3;
            }
        } else {
            boolean z4 = z;
            int k2 = eVar.k();
            int l2 = eVar.l();
            int n2 = eVar.n();
            if ((n2 <= 0 || k2 > l2) && (n2 >= 0 || l2 > k2)) {
                return -1;
            }
            int i4 = k2;
            while (true) {
                boolean z5 = z4;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z4 = z5;
                if (i0(charSequence4, 0, charSequence3, i4, charSequence2.length(), z5)) {
                    return i4;
                }
                if (i4 == l2) {
                    return -1;
                }
                i4 += n2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    static /* synthetic */ int T(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return S(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    public static /* synthetic */ int U(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return Q(charSequence, c, i, z);
    }

    public static /* synthetic */ int V(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return R(charSequence, str, i, z);
    }

    public static final int W(CharSequence charSequence, char[] cArr, int i, boolean z) {
        ax.Gb.l.f(charSequence, "<this>");
        ax.Gb.l.f(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(C3133i.B(cArr), i);
        }
        int b = ax.Lb.f.b(i, 0);
        int P = P(charSequence);
        if (b > P) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(b);
            for (char c : cArr) {
                if (c.d(c, charAt, z)) {
                    return b;
                }
            }
            if (b == P) {
                return -1;
            }
            b++;
        }
    }

    public static boolean X(CharSequence charSequence) {
        ax.Gb.l.f(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!b.c(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static final int Y(CharSequence charSequence, char c, int i, boolean z) {
        ax.Gb.l.f(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? a0(charSequence, new char[]{c}, i, z) : ((String) charSequence).lastIndexOf(c, i);
    }

    public static /* synthetic */ int Z(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = P(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return Y(charSequence, c, i, z);
    }

    public static final int a0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        ax.Gb.l.f(charSequence, "<this>");
        ax.Gb.l.f(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(C3133i.B(cArr), i);
        }
        for (int d = ax.Lb.f.d(i, P(charSequence)); -1 < d; d--) {
            char charAt = charSequence.charAt(d);
            for (char c : cArr) {
                if (c.d(c, charAt, z)) {
                    return d;
                }
            }
        }
        return -1;
    }

    public static final ax.Nb.e<String> b0(CharSequence charSequence) {
        ax.Gb.l.f(charSequence, "<this>");
        return new a(charSequence);
    }

    public static final List<String> c0(CharSequence charSequence) {
        ax.Gb.l.f(charSequence, "<this>");
        return ax.Nb.h.m(b0(charSequence));
    }

    public static final CharSequence d0(CharSequence charSequence, int i, char c) {
        ax.Gb.l.f(charSequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
        }
        if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i);
        int length = i - charSequence.length();
        int i2 = 1;
        if (1 <= length) {
            while (true) {
                sb.append(c);
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        sb.append(charSequence);
        return sb;
    }

    public static String e0(String str, int i, char c) {
        ax.Gb.l.f(str, "<this>");
        return d0(str, i, c).toString();
    }

    private static final ax.Nb.e<ax.Lb.e> f0(CharSequence charSequence, final char[] cArr, int i, final boolean z, int i2) {
        n0(i2);
        return new e(charSequence, i, i2, new ax.Fb.p() { // from class: ax.Ob.t
            @Override // ax.Fb.p
            public final Object j(Object obj, Object obj2) {
                C3081m h0;
                h0 = u.h0(cArr, z, (CharSequence) obj, ((Integer) obj2).intValue());
                return h0;
            }
        });
    }

    static /* synthetic */ ax.Nb.e g0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return f0(charSequence, cArr, i, z, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3081m h0(char[] cArr, boolean z, CharSequence charSequence, int i) {
        ax.Gb.l.f(charSequence, "$this$DelimitedRangesSequence");
        int W = W(charSequence, cArr, i, z);
        if (W < 0) {
            return null;
        }
        return ax.sb.q.a(Integer.valueOf(W), 1);
    }

    public static final boolean i0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        ax.Gb.l.f(charSequence, "<this>");
        ax.Gb.l.f(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!c.d(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String j0(String str, CharSequence charSequence) {
        ax.Gb.l.f(str, "<this>");
        ax.Gb.l.f(charSequence, "prefix");
        if (!s0(str, charSequence, false, 2, null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        ax.Gb.l.e(substring, "substring(...)");
        return substring;
    }

    public static String k0(String str, CharSequence charSequence) {
        ax.Gb.l.f(str, "<this>");
        ax.Gb.l.f(charSequence, "suffix");
        if (!O(str, charSequence, false, 2, null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        ax.Gb.l.e(substring, "substring(...)");
        return substring;
    }

    public static String l0(String str, CharSequence charSequence) {
        ax.Gb.l.f(str, "<this>");
        ax.Gb.l.f(charSequence, "delimiter");
        return m0(str, charSequence, charSequence);
    }

    public static final String m0(String str, CharSequence charSequence, CharSequence charSequence2) {
        ax.Gb.l.f(str, "<this>");
        ax.Gb.l.f(charSequence, "prefix");
        ax.Gb.l.f(charSequence2, "suffix");
        if (str.length() < charSequence.length() + charSequence2.length() || !s0(str, charSequence, false, 2, null) || !O(str, charSequence2, false, 2, null)) {
            return str;
        }
        String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        ax.Gb.l.e(substring, "substring(...)");
        return substring;
    }

    public static final void n0(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
    }

    public static final List<String> o0(CharSequence charSequence, char[] cArr, boolean z, int i) {
        ax.Gb.l.f(charSequence, "<this>");
        ax.Gb.l.f(cArr, "delimiters");
        if (cArr.length == 1) {
            return p0(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable h = ax.Nb.h.h(g0(charSequence, cArr, 0, z, i, 2, null));
        ArrayList arrayList = new ArrayList(C3139o.s(h, 10));
        Iterator it = h.iterator();
        while (it.hasNext()) {
            arrayList.add(t0(charSequence, (ax.Lb.e) it.next()));
        }
        return arrayList;
    }

    private static final List<String> p0(CharSequence charSequence, String str, boolean z, int i) {
        n0(i);
        int i2 = 0;
        int R = R(charSequence, str, 0, z);
        if (R == -1 || i == 1) {
            return C3139o.d(charSequence.toString());
        }
        boolean z2 = i > 0;
        ArrayList arrayList = new ArrayList(z2 ? ax.Lb.f.d(i, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(i2, R).toString());
            i2 = str.length() + R;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            R = R(charSequence, str, i2, z);
        } while (R != -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List q0(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return o0(charSequence, cArr, z, i);
    }

    public static final boolean r0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        ax.Gb.l.f(charSequence, "<this>");
        ax.Gb.l.f(charSequence2, "prefix");
        return (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) ? s.H((String) charSequence, (String) charSequence2, false, 2, null) : i0(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ boolean s0(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return r0(charSequence, charSequence2, z);
    }

    public static final String t0(CharSequence charSequence, ax.Lb.e eVar) {
        ax.Gb.l.f(charSequence, "<this>");
        ax.Gb.l.f(eVar, "range");
        return charSequence.subSequence(eVar.g().intValue(), eVar.i().intValue() + 1).toString();
    }

    public static final String u0(String str, char c, String str2) {
        ax.Gb.l.f(str, "<this>");
        ax.Gb.l.f(str2, "missingDelimiterValue");
        int U = U(str, c, 0, false, 6, null);
        if (U == -1) {
            return str2;
        }
        String substring = str.substring(U + 1, str.length());
        ax.Gb.l.e(substring, "substring(...)");
        return substring;
    }

    public static final String v0(String str, String str2, String str3) {
        ax.Gb.l.f(str, "<this>");
        ax.Gb.l.f(str2, "delimiter");
        ax.Gb.l.f(str3, "missingDelimiterValue");
        int V = V(str, str2, 0, false, 6, null);
        if (V == -1) {
            return str3;
        }
        String substring = str.substring(V + str2.length(), str.length());
        ax.Gb.l.e(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String w0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return u0(str, c, str2);
    }

    public static /* synthetic */ String x0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return v0(str, str2, str3);
    }

    public static String y0(String str, char c, String str2) {
        ax.Gb.l.f(str, "<this>");
        ax.Gb.l.f(str2, "missingDelimiterValue");
        int Z = Z(str, c, 0, false, 6, null);
        if (Z == -1) {
            return str2;
        }
        String substring = str.substring(Z + 1, str.length());
        ax.Gb.l.e(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String z0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return y0(str, c, str2);
    }
}
