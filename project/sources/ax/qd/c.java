package ax.qd;

import ax.Nd.j;
import ax.Wc.A;
import ax.Wc.C1130v;
import ax.Wc.G;
import ax.Wc.InterfaceC1101g;
import ax.Wc.N;
import ax.pd.C2827a;
import ax.pd.C2828b;
import ax.pd.e;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes3.dex */
public class c {
    public static void a(StringBuffer stringBuffer, C2828b c2828b, Hashtable hashtable) {
        if (!c2828b.u()) {
            if (c2828b.r() != null) {
                b(stringBuffer, c2828b.r(), hashtable);
                return;
            }
            return;
        }
        C2827a[] t = c2828b.t();
        boolean z = true;
        for (int i = 0; i != t.length; i++) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append('+');
            }
            b(stringBuffer, t[i], hashtable);
        }
    }

    public static void b(StringBuffer stringBuffer, C2827a c2827a, Hashtable hashtable) {
        String str = (String) hashtable.get(c2827a.s());
        if (str == null) {
            str = c2827a.s().I();
        }
        stringBuffer.append(str);
        stringBuffer.append('=');
        stringBuffer.append(q(c2827a.t()));
    }

    private static boolean c(C2827a c2827a, C2827a c2827a2) {
        if (c2827a == c2827a2) {
            return true;
        }
        return c2827a != null && c2827a2 != null && c2827a.s().y(c2827a2.s()) && d(c2827a.t()).equals(d(c2827a2.t()));
    }

    public static String d(InterfaceC1101g interfaceC1101g) {
        return e(q(interfaceC1101g));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        if (r5 >= r0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String e(java.lang.String r7) {
        /*
            int r0 = r7.length()
            r1 = 0
            if (r0 <= 0) goto L1d
            char r0 = r7.charAt(r1)
            r2 = 35
            if (r0 != r2) goto L1d
            ax.Wc.A r0 = h(r7)
            boolean r2 = r0 instanceof ax.Wc.G
            if (r2 == 0) goto L1d
            ax.Wc.G r0 = (ax.Wc.G) r0
            java.lang.String r7 = r0.h()
        L1d:
            java.lang.String r7 = ax.Nd.j.f(r7)
            int r0 = r7.length()
            r2 = 2
            if (r0 >= r2) goto L29
            return r7
        L29:
            int r0 = r0 + (-1)
        L2b:
            r2 = 32
            r3 = 92
            if (r1 >= r0) goto L42
            char r4 = r7.charAt(r1)
            if (r4 != r3) goto L42
            int r4 = r1 + 1
            char r4 = r7.charAt(r4)
            if (r4 != r2) goto L42
            int r1 = r1 + 2
            goto L2b
        L42:
            int r4 = r1 + 1
            r5 = r0
        L45:
            if (r5 <= r4) goto L58
            int r6 = r5 + (-1)
            char r6 = r7.charAt(r6)
            if (r6 != r3) goto L58
            char r6 = r7.charAt(r5)
            if (r6 != r2) goto L58
            int r5 = r5 + (-2)
            goto L45
        L58:
            if (r1 > 0) goto L5c
            if (r5 >= r0) goto L62
        L5c:
            int r5 = r5 + 1
            java.lang.String r7 = r7.substring(r1, r5)
        L62:
            java.lang.String r7 = l(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.qd.c.e(java.lang.String):java.lang.String");
    }

    private static int f(char c) {
        return ('0' > c || c > '9') ? ('a' > c || c > 'f') ? c - '7' : c - 'W' : c - '0';
    }

    public static C1130v g(String str, Hashtable hashtable) {
        if (j.j(str).startsWith("OID.")) {
            return new C1130v(str.substring(4));
        }
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            return new C1130v(str);
        }
        C1130v c1130v = (C1130v) hashtable.get(j.f(str));
        if (c1130v != null) {
            return c1130v;
        }
        throw new IllegalArgumentException("Unknown object id - " + str + " - passed to distinguished name");
    }

    private static A h(String str) {
        try {
            return A.z(ax.Od.c.a(str, 1, str.length() - 1));
        } catch (IOException e) {
            throw new IllegalStateException("unknown encoding in name: " + e);
        }
    }

    private static boolean i(char c) {
        if ('0' <= c && c <= '9') {
            return true;
        }
        if ('a' > c || c > 'f') {
            return 'A' <= c && c <= 'F';
        }
        return true;
    }

    public static boolean j(C2828b c2828b, C2828b c2828b2) {
        if (c2828b.size() != c2828b2.size()) {
            return false;
        }
        C2827a[] t = c2828b.t();
        C2827a[] t2 = c2828b2.t();
        if (t.length != t2.length) {
            return false;
        }
        for (int i = 0; i != t.length; i++) {
            if (!c(t[i], t2[i])) {
                return false;
            }
        }
        return true;
    }

    public static C2828b[] k(String str, e eVar) {
        d dVar = new d(str);
        ax.pd.d dVar2 = new ax.pd.d(eVar);
        while (dVar.a()) {
            String b = dVar.b();
            if (b.indexOf(43) > 0) {
                d dVar3 = new d(b, '+');
                d dVar4 = new d(dVar3.b(), '=');
                String b2 = dVar4.b();
                if (!dVar4.a()) {
                    throw new IllegalArgumentException("badly formatted directory string");
                }
                String b3 = dVar4.b();
                C1130v d = eVar.d(b2.trim());
                if (dVar3.a()) {
                    Vector vector = new Vector();
                    Vector vector2 = new Vector();
                    while (true) {
                        vector.addElement(d);
                        vector2.addElement(o(b3));
                        if (!dVar3.a()) {
                            dVar2.b(m(vector), n(vector2));
                            break;
                        }
                        d dVar5 = new d(dVar3.b(), '=');
                        String b4 = dVar5.b();
                        if (!dVar5.a()) {
                            throw new IllegalArgumentException("badly formatted directory string");
                        }
                        b3 = dVar5.b();
                        d = eVar.d(b4.trim());
                    }
                } else {
                    dVar2.e(d, o(b3));
                }
            } else {
                d dVar6 = new d(b, '=');
                String b5 = dVar6.b();
                if (!dVar6.a()) {
                    throw new IllegalArgumentException("badly formatted directory string");
                }
                dVar2.e(eVar.d(b5.trim()), o(dVar6.b()));
            }
        }
        return dVar2.f().s();
    }

    public static String l(String str) {
        if (str.indexOf("  ") < 0) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        char charAt = str.charAt(0);
        stringBuffer.append(charAt);
        for (int i = 1; i < str.length(); i++) {
            char charAt2 = str.charAt(i);
            if (charAt != ' ' || charAt2 != ' ') {
                stringBuffer.append(charAt2);
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    private static C1130v[] m(Vector vector) {
        int size = vector.size();
        C1130v[] c1130vArr = new C1130v[size];
        for (int i = 0; i != size; i++) {
            c1130vArr[i] = (C1130v) vector.elementAt(i);
        }
        return c1130vArr;
    }

    private static String[] n(Vector vector) {
        int size = vector.size();
        String[] strArr = new String[size];
        for (int i = 0; i != size; i++) {
            strArr[i] = (String) vector.elementAt(i);
        }
        return strArr;
    }

    private static String o(String str) {
        int i;
        if (str.length() == 0 || (str.indexOf(92) < 0 && str.indexOf(34) < 0)) {
            return str.trim();
        }
        char[] charArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer(str.length());
        if (charArray[0] == '\\' && charArray[1] == '#') {
            stringBuffer.append("\\#");
            i = 2;
        } else {
            i = 0;
        }
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        char c = 0;
        while (i != charArray.length) {
            char c2 = charArray[i];
            if (c2 != ' ') {
                z3 = true;
            }
            if (c2 != '\"') {
                if (c2 == '\\' && !z && !z2) {
                    i2 = stringBuffer.length();
                    z = true;
                } else if (c2 != ' ' || z || z3) {
                    if (z && i(c2)) {
                        if (c != 0) {
                            stringBuffer.append((char) ((f(c) * 16) + f(c2)));
                            z = false;
                            c = 0;
                        } else {
                            c = c2;
                        }
                    }
                }
                i++;
            } else if (!z) {
                z2 = !z2;
                z = false;
                i++;
            }
            stringBuffer.append(c2);
            z = false;
            i++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.charAt(stringBuffer.length() - 1) == ' ' && i2 != stringBuffer.length() - 1) {
                stringBuffer.setLength(stringBuffer.length() - 1);
            }
        }
        return stringBuffer.toString();
    }

    public static InterfaceC1101g p(String str, int i) throws IOException {
        int length = (str.length() - i) / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 != length; i2++) {
            int i3 = (i2 * 2) + i;
            char charAt = str.charAt(i3);
            char charAt2 = str.charAt(i3 + 1);
            bArr[i2] = (byte) (f(charAt2) | (f(charAt) << 4));
        }
        return A.z(bArr);
    }

    public static String q(InterfaceC1101g interfaceC1101g) {
        StringBuffer stringBuffer = new StringBuffer();
        if (!(interfaceC1101g instanceof G) || (interfaceC1101g instanceof N)) {
            try {
                stringBuffer.append('#');
                stringBuffer.append(ax.Od.c.d(interfaceC1101g.g().q("DER")));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            String h = ((G) interfaceC1101g).h();
            if (h.length() > 0 && h.charAt(0) == '#') {
                stringBuffer.append('\\');
            }
            stringBuffer.append(h);
        }
        int length = stringBuffer.length();
        int i = (stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#') ? 2 : 0;
        while (i != length) {
            char charAt = stringBuffer.charAt(i);
            if (charAt != '\"' && charAt != '\\' && charAt != '+' && charAt != ',') {
                switch (charAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        i++;
                        continue;
                }
            }
            stringBuffer.insert(i, "\\");
            i += 2;
            length++;
        }
        if (stringBuffer.length() > 0) {
            for (int i2 = 0; stringBuffer.length() > i2 && stringBuffer.charAt(i2) == ' '; i2 += 2) {
                stringBuffer.insert(i2, "\\");
            }
        }
        for (int length2 = stringBuffer.length() - 1; length2 >= 0 && stringBuffer.charAt(length2) == ' '; length2--) {
            stringBuffer.insert(length2, '\\');
        }
        return stringBuffer.toString();
    }
}
