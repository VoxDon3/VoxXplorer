/*
 * Decompiled with CFR 0.152.
 */
package ax.n4;

import ax.n4.a;
import ax.n4.b;
import ax.n4.e;
import ax.n4.f;
import ax.n4.g;
import ax.n4.h;
import ax.n4.k;
import ax.n4.l;
import java.util.ArrayList;

public class d {
    @Deprecated
    public static final d a = new d();
    public static final d b = new d();
    private static final char[] c = new char[]{';', ','};

    private static boolean c(char c8, char[] cArray) {
        if (cArray != null) {
            int n8 = cArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                if (c8 != cArray[i8]) continue;
                return true;
            }
        }
        return false;
    }

    protected h a(String string, String string2, k[] kArray) {
        return new b(string, string2, kArray);
    }

    protected k b(String string, String string2) {
        return new e(string, string2);
    }

    public h[] d(f f8, l l8) {
        ax.n4.a.a(f8, "Char array buffer");
        ax.n4.a.a(l8, "Parser cursor");
        ArrayList<h> arrayList = new ArrayList<h>();
        while (!l8.a()) {
            h h8 = this.e(f8, l8);
            if (h8.getName().length() == 0 && h8.getValue() == null) continue;
            arrayList.add(h8);
        }
        return arrayList.toArray(new h[arrayList.size()]);
    }

    public h e(f object, l l8) {
        ax.n4.a.a(object, "Char array buffer");
        ax.n4.a.a(l8, "Parser cursor");
        k k8 = this.f((f)object, l8);
        object = !l8.a() && object.b(l8.b() - 1) != ',' ? this.h((f)object, l8) : null;
        return this.a(k8.getName(), k8.getValue(), (k[])object);
    }

    public k f(f f8, l l8) {
        return this.g(f8, l8, c);
    }

    /*
     * Enabled aggressive block sorting
     */
    public k g(f object, l l8, char[] cArray) {
        int n8;
        int n9;
        int n10;
        String string;
        int n11;
        int n12;
        int n13;
        block16: {
            char c8;
            int n14;
            int n15;
            block15: {
                ax.n4.a.a(object, "Char array buffer");
                ax.n4.a.a(l8, "Parser cursor");
                n13 = l8.b();
                n12 = l8.b();
                n15 = l8.c();
                while (true) {
                    n14 = 1;
                    if (n13 >= n15 || (c8 = ((f)object).b(n13)) == '=') break;
                    if (d.c(c8, cArray)) {
                        n11 = 1;
                        break block15;
                    }
                    ++n13;
                }
                n11 = 0;
            }
            if (n13 == n15) {
                string = ((f)object).e(n12, n15);
                n11 = 1;
            } else {
                string = ((f)object).e(n12, n13);
                ++n13;
            }
            if (n11 != 0) {
                l8.d(n13);
                return this.b(string, null);
            }
            n10 = 0;
            n9 = 0;
            for (n12 = n13; n12 < n15; ++n12) {
                c8 = ((f)object).b(n12);
                n8 = n9;
                if (c8 == '\"') {
                    n8 = n9;
                    if (n10 == 0) {
                        n8 = n9 ^ 1;
                    }
                }
                if (n8 == 0 && n10 == 0 && d.c(c8, cArray)) {
                    n10 = n14;
                    break block16;
                }
                n10 = n10 == 0 && n8 != 0 && c8 == '\\' ? 1 : 0;
                n9 = n8;
            }
            n10 = n11;
        }
        while (n13 < n12 && g.a(((f)object).b(n13))) {
            ++n13;
        }
        for (n11 = n12; n11 > n13 && g.a(((f)object).b(n11 - 1)); --n11) {
        }
        n9 = n13;
        n8 = n11;
        if (n11 - n13 >= 2) {
            n9 = n13;
            n8 = n11;
            if (((f)object).b(n13) == '\"') {
                n9 = n13;
                n8 = n11;
                if (((f)object).b(n11 - 1) == '\"') {
                    n9 = n13 + 1;
                    n8 = n11 - 1;
                }
            }
        }
        object = ((f)object).d(n9, n8);
        n13 = n12;
        if (n10 != 0) {
            n13 = n12 + 1;
        }
        l8.d(n13);
        return this.b(string, (String)object);
    }

    public k[] h(f f8, l l8) {
        int n8;
        ax.n4.a.a(f8, "Char array buffer");
        ax.n4.a.a(l8, "Parser cursor");
        int n9 = l8.c();
        for (n8 = l8.b(); n8 < n9 && g.a(f8.b(n8)); ++n8) {
        }
        l8.d(n8);
        if (l8.a()) {
            return new k[0];
        }
        ArrayList<k> arrayList = new ArrayList<k>();
        while (!l8.a()) {
            arrayList.add(this.f(f8, l8));
            if (f8.b(l8.b() - 1) != ',') continue;
        }
        return arrayList.toArray(new k[arrayList.size()]);
    }
}

