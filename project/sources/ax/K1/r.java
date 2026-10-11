package ax.K1;

import ax.P0.C;
import ax.S0.G;

/* loaded from: classes.dex */
public final class r {
    private static int a(int i, G g, int i2) {
        if (i == 12) {
            return 240;
        }
        if (i == 13) {
            return 120;
        }
        if (i == 21 && g.a() >= 8 && g.g() + 8 <= i2) {
            int v = g.v();
            int v2 = g.v();
            if (v >= 12 && v2 == 1936877170) {
                return g.N();
            }
        }
        return -2147483647;
    }

    public static C b(G g, int i) {
        g.c0(12);
        while (g.g() < i) {
            int g2 = g.g();
            int v = g.v();
            if (g.v() == 1935766900) {
                if (v < 16) {
                    return null;
                }
                g.c0(4);
                int i2 = -1;
                int i3 = 0;
                for (int i4 = 0; i4 < 2; i4++) {
                    int M = g.M();
                    int M2 = g.M();
                    if (M == 0) {
                        i2 = M2;
                    } else if (M == 1) {
                        i3 = M2;
                    }
                }
                int a = a(i2, g, i);
                if (a == -2147483647) {
                    return null;
                }
                return new C(new ax.F1.d(a, i3));
            }
            g.b0(g2 + v);
        }
        return null;
    }
}
