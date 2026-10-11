/*
 * Decompiled with CFR 0.152.
 */
package ax.K1;

import ax.F1.d;
import ax.P0.C;
import ax.S0.G;

public final class r {
    private static int a(int n8, G g8, int n9) {
        if (n8 == 12) {
            return 240;
        }
        if (n8 == 13) {
            return 120;
        }
        if (n8 != 21) {
            return -2147483647;
        }
        if (g8.a() >= 8 && g8.g() + 8 <= n9) {
            n9 = g8.v();
            n8 = g8.v();
            if (n9 >= 12 && n8 == 1936877170) {
                return g8.N();
            }
        }
        return -2147483647;
    }

    public static C b(G g8, int n8) {
        g8.c0(12);
        while (g8.g() < n8) {
            int n9 = g8.g();
            int n10 = g8.v();
            if (g8.v() == 1935766900) {
                if (n10 < 16) {
                    return null;
                }
                g8.c0(4);
                int n11 = -1;
                n9 = 0;
                for (n10 = 0; n10 < 2; ++n10) {
                    int n12;
                    int n13 = g8.M();
                    int n14 = g8.M();
                    if (n13 == 0) {
                        n12 = n14;
                    } else {
                        n12 = n11;
                        if (n13 == 1) {
                            n9 = n14;
                            n12 = n11;
                        }
                    }
                    n11 = n12;
                }
                if ((n8 = r.a(n11, g8, n8)) == -2147483647) {
                    return null;
                }
                return new C(new d(n8, n9));
            }
            g8.b0(n9 + n10);
        }
        return null;
    }
}

