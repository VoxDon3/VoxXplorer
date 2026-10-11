/*
 * Decompiled with CFR 0.152.
 */
package ax.qd;

import ax.Nd.j;
import ax.Wc.A;
import ax.Wc.G;
import ax.Wc.N;
import ax.Wc.g;
import ax.Wc.v;
import ax.pd.a;
import ax.pd.b;
import ax.pd.e;
import ax.qd.d;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public class c {
    public static void a(StringBuffer stringBuffer, b aArray, Hashtable hashtable) {
        if (aArray.u()) {
            aArray = aArray.t();
            boolean bl = true;
            for (int i8 = 0; i8 != aArray.length; ++i8) {
                if (bl) {
                    bl = false;
                } else {
                    stringBuffer.append('+');
                }
                c.b(stringBuffer, aArray[i8], hashtable);
            }
        } else if (aArray.r() != null) {
            c.b(stringBuffer, aArray.r(), hashtable);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void b(StringBuffer stringBuffer, a a8, Hashtable object) {
        if ((object = (String)((Hashtable)object).get(a8.s())) == null) {
            object = a8.s().I();
        }
        stringBuffer.append((String)object);
        stringBuffer.append('=');
        stringBuffer.append(c.q(a8.t()));
    }

    private static boolean c(a a8, a a9) {
        if (a8 == a9) {
            return true;
        }
        if (a8 != null && a9 != null) {
            if (!a8.s().y(a9.s())) {
                return false;
            }
            return c.d(a8.t()).equals(c.d(a9.t()));
        }
        return false;
    }

    public static String d(g g8) {
        return c.e(c.q(g8));
    }

    public static String e(String string) {
        block10: {
            String string2;
            int n8;
            int n9;
            block9: {
                n9 = string.length();
                n8 = 0;
                string2 = string;
                if (n9 > 0) {
                    string2 = string;
                    if (string.charAt(0) == '#') {
                        A a8 = c.h(string);
                        string2 = string;
                        if (a8 instanceof G) {
                            string2 = ((G)((Object)a8)).h();
                        }
                    }
                }
                if ((n9 = (string2 = j.f(string2)).length()) < 2) {
                    return string2;
                }
                int n10 = n9 - 1;
                while (n8 < n10 && string2.charAt(n8) == '\\' && string2.charAt(n8 + 1) == ' ') {
                    n8 += 2;
                }
                for (n9 = n10; n9 > n8 + 1 && string2.charAt(n9 - 1) == '\\' && string2.charAt(n9) == ' '; n9 -= 2) {
                }
                if (n8 > 0) break block9;
                string = string2;
                if (n9 >= n10) break block10;
            }
            string = string2.substring(n8, n9 + 1);
        }
        return c.l(string);
    }

    private static int f(char c8) {
        if ('0' <= c8 && c8 <= '9') {
            return c8 - 48;
        }
        if ('a' <= c8 && c8 <= 'f') {
            return c8 - 87;
        }
        return c8 - 55;
    }

    public static v g(String string, Hashtable object) {
        if (j.j(string).startsWith("OID.")) {
            return new v(string.substring(4));
        }
        if (string.charAt(0) >= '0' && string.charAt(0) <= '9') {
            return new v(string);
        }
        if ((object = (v)((Hashtable)object).get(j.f(string))) != null) {
            return object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Unknown object id - ");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(" - passed to distinguished name");
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    private static A h(String object) {
        try {
            object = A.z(ax.Od.c.a((String)object, 1, ((String)object).length() - 1));
            return object;
        }
        catch (IOException iOException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unknown encoding in name: ");
            stringBuilder.append(iOException);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private static boolean i(char c8) {
        return '0' <= c8 && c8 <= '9' || 'a' <= c8 && c8 <= 'f' || 'A' <= c8 && c8 <= 'F';
    }

    public static boolean j(b aArray, b aArray2) {
        if (aArray.size() != aArray2.size()) {
            return false;
        }
        if ((aArray = aArray.t()).length != (aArray2 = aArray2.t()).length) {
            return false;
        }
        for (int i8 = 0; i8 != aArray.length; ++i8) {
            if (c.c(aArray[i8], aArray2[i8])) continue;
            return false;
        }
        return true;
    }

    public static b[] k(String object, e e8) {
        d d8 = new d((String)object);
        ax.pd.d d9 = new ax.pd.d(e8);
        while (d8.a()) {
            Object object2;
            object = d8.b();
            if (((String)object).indexOf(43) > 0) {
                d d10 = new d((String)object, '+');
                object2 = new d(d10.b(), '=');
                object = ((d)object2).b();
                if (((d)object2).a()) {
                    object2 = ((d)object2).b();
                    object = e8.d(((String)object).trim());
                    if (d10.a()) {
                        Vector<String> vector;
                        Vector<Object> vector2;
                        block6: {
                            vector2 = new Vector<Object>();
                            vector = new Vector<String>();
                            while (true) {
                                vector2.addElement(object);
                                vector.addElement(c.o((String)object2));
                                if (!d10.a()) break block6;
                                object2 = new d(d10.b(), '=');
                                object = ((d)object2).b();
                                if (!((d)object2).a()) break;
                                object2 = ((d)object2).b();
                                object = e8.d(((String)object).trim());
                            }
                            throw new IllegalArgumentException("badly formatted directory string");
                        }
                        d9.b(c.m(vector2), c.n(vector));
                        continue;
                    }
                    d9.e((v)object, c.o((String)object2));
                    continue;
                }
                throw new IllegalArgumentException("badly formatted directory string");
            }
            object2 = new d((String)object, '=');
            object = ((d)object2).b();
            if (((d)object2).a()) {
                object2 = ((d)object2).b();
                d9.e(e8.d(((String)object).trim()), c.o((String)object2));
                continue;
            }
            throw new IllegalArgumentException("badly formatted directory string");
        }
        return d9.f().s();
    }

    public static String l(String string) {
        if (string.indexOf("  ") < 0) {
            return string;
        }
        StringBuffer stringBuffer = new StringBuffer();
        char c8 = string.charAt(0);
        stringBuffer.append(c8);
        char c9 = c8;
        for (int i8 = 1; i8 < string.length(); ++i8) {
            c8 = string.charAt(i8);
            if (c9 == ' ' && c8 == ' ') continue;
            stringBuffer.append(c8);
            c9 = c8;
        }
        return stringBuffer.toString();
    }

    private static v[] m(Vector vector) {
        int n8 = vector.size();
        v[] vArray = new v[n8];
        for (int i8 = 0; i8 != n8; ++i8) {
            vArray[i8] = (v)vector.elementAt(i8);
        }
        return vArray;
    }

    private static String[] n(Vector vector) {
        int n8 = vector.size();
        String[] stringArray = new String[n8];
        for (int i8 = 0; i8 != n8; ++i8) {
            stringArray[i8] = (String)vector.elementAt(i8);
        }
        return stringArray;
    }

    /*
     * Unable to fully structure code
     */
    private static String o(String var0) {
        block17: {
            if (var0.length() == 0 || var0.indexOf(92) < 0 && var0.indexOf(34) < 0) break block17;
            var9_1 = var0.toCharArray();
            var0 = new StringBuffer(var0.length());
            if (var9_1[0] == '\\' && var9_1[1] == '#') {
                var0.append("\\#");
                var3_2 = 2;
            } else {
                var3_2 = 0;
            }
            var8_3 = 0;
            var7_4 = 0;
            var4_5 = false;
            var6_6 = false;
            var1_7 = '\u0000';
            for (var5_8 = var3_2; var5_8 != var9_1.length; ++var5_8) {
                block16: {
                    block18: {
                        var2_9 = var9_1[var5_8];
                        if (var2_9 != ' ') {
                            var6_6 = true;
                        }
                        if (var2_9 != '\"') break block18;
                        if (var8_3 == 0) {
                            var4_5 ^= true;
lbl22:
                            // 2 sources

                            while (true) {
                                var3_2 = 0;
                                break block16;
                                break;
                            }
                        }
                        ** GOTO lbl-1000
                    }
                    if (var2_9 == '\\' && var8_3 == 0 && !var4_5) {
                        var7_4 = var0.length();
                        var3_2 = 1;
                    } else if (var2_9 == ' ' && var8_3 == 0 && !var6_6) {
                        var3_2 = var8_3;
                    } else if (var8_3 != 0 && c.i(var2_9)) {
                        if (var1_7 != '\u0000') {
                            var0.append((char)(c.f(var1_7) * 16 + c.f(var2_9)));
                            var3_2 = 0;
                            var1_7 = '\u0000';
                        } else {
                            var1_7 = var2_9;
                            var3_2 = var8_3;
                        }
                    } else lbl-1000:
                    // 2 sources

                    {
                        var0.append(var2_9);
                        ** continue;
                    }
                }
                var8_3 = var3_2;
            }
            if (var0.length() > 0) {
                while (var0.charAt(var0.length() - 1) == ' ' && var7_4 != var0.length() - 1) {
                    var0.setLength(var0.length() - 1);
                }
            }
            return var0.toString();
        }
        return var0.trim();
    }

    public static g p(String string, int n8) throws IOException {
        int n9 = (string.length() - n8) / 2;
        byte[] byArray = new byte[n9];
        for (int i8 = 0; i8 != n9; ++i8) {
            int n10 = i8 * 2 + n8;
            char c8 = string.charAt(n10);
            char c9 = string.charAt(n10 + 1);
            n10 = c.f(c8);
            byArray[i8] = (byte)(c.f(c9) | n10 << 4);
        }
        return A.z(byArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String q(g object) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean bl = object instanceof G;
        int n8 = 0;
        if (bl && !(object instanceof N)) {
            if (((String)(object = ((G)object).h())).length() > 0 && ((String)object).charAt(0) == '#') {
                stringBuffer.append('\\');
            }
            stringBuffer.append((String)object);
        } else {
            try {
                stringBuffer.append('#');
                stringBuffer.append(ax.Od.c.d(object.g().q("DER")));
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        }
        int n9 = stringBuffer.length();
        int n10 = stringBuffer.length();
        int n11 = 2;
        if (n10 < 2 || stringBuffer.charAt(0) != '\\' || stringBuffer.charAt(1) != '#') {
            n11 = 0;
        }
        block5: while (n11 != n9) {
            n10 = stringBuffer.charAt(n11);
            if (n10 != 34 && n10 != 92 && n10 != 43 && n10 != 44) {
                switch (n10) {
                    default: {
                        ++n11;
                        continue block5;
                    }
                    case 59: 
                    case 60: 
                    case 61: 
                    case 62: 
                }
            }
            stringBuffer.insert(n11, "\\");
            n11 += 2;
            ++n9;
        }
        if (stringBuffer.length() > 0) {
            for (n11 = n8; stringBuffer.length() > n11 && stringBuffer.charAt(n11) == ' '; n11 += 2) {
                stringBuffer.insert(n11, "\\");
            }
        }
        for (n11 = stringBuffer.length() - 1; n11 >= 0 && stringBuffer.charAt(n11) == ' '; --n11) {
            stringBuffer.insert(n11, '\\');
        }
        return stringBuffer.toString();
    }
}

