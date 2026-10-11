/*
 * Decompiled with CFR 0.152.
 */
package ax.s1;

import ax.S0.G;
import ax.r7.j0;
import ax.r7.z;
import ax.s1.a;
import ax.s1.c;
import ax.s1.d;
import ax.s1.g;
import ax.s1.h;

final class f
implements a {
    public final z<a> a;
    private final int b;

    private f(int n8, z<a> z8) {
        this.b = n8;
        this.a = z8;
    }

    private static a b(int n8, int n9, G g8) {
        switch (n8) {
            default: {
                return null;
            }
            case 1852994675: {
                return h.b(g8);
            }
            case 1752331379: {
                return d.d(g8);
            }
            case 1751742049: {
                return c.c(g8);
            }
            case 1718776947: 
        }
        return g.e(n9, g8);
    }

    public static f d(int n8, G g8) {
        z.a<a> a8 = new z.a<a>();
        int n9 = g8.j();
        int n10 = -2;
        while (g8.a() > 8) {
            int n11 = g8.z();
            int n12 = g8.z();
            n12 = g8.g() + n12;
            g8.a0(n12);
            a a9 = n11 == 1414744396 ? f.d(g8.z(), g8) : f.b(n11, n10, g8);
            n11 = n10;
            if (a9 != null) {
                if (a9.a() == 1752331379) {
                    n10 = ((d)a9).c();
                }
                a8.h(a9);
                n11 = n10;
            }
            g8.b0(n12);
            g8.a0(n9);
            n10 = n11;
        }
        return new f(n8, a8.k());
    }

    @Override
    public int a() {
        return this.b;
    }

    public <T extends a> T c(Class<T> clazz) {
        j0<a> j02 = this.a.n();
        while (j02.hasNext()) {
            a a8 = (a)j02.next();
            if (a8.getClass() != clazz) continue;
            return (T)a8;
        }
        return null;
    }
}

