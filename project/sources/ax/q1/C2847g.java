package ax.q1;

import ax.S0.C0968a;
import ax.S0.C0987u;

/* renamed from: ax.q1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2847g {
    public static void a(long j, ax.S0.G g, U[] uArr) {
        while (true) {
            if (g.a() <= 1) {
                return;
            }
            int c = c(g);
            int c2 = c(g);
            int g2 = g.g() + c2;
            if (c2 == -1 || c2 > g.a()) {
                C0987u.h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                g2 = g.j();
            } else if (c == 4 && c2 >= 8) {
                int M = g.M();
                int U = g.U();
                int v = U == 49 ? g.v() : 0;
                int M2 = g.M();
                if (U == 47) {
                    g.c0(1);
                }
                boolean z = M == 181 && (U == 49 || U == 47) && M2 == 3;
                if (U == 49) {
                    z &= v == 1195456820;
                }
                if (z) {
                    b(j, g, uArr);
                }
            }
            g.b0(g2);
        }
    }

    public static void b(long j, ax.S0.G g, U[] uArr) {
        int M = g.M();
        if ((M & 64) != 0) {
            g.c0(1);
            int i = (M & 31) * 3;
            int g2 = g.g();
            for (U u : uArr) {
                g.b0(g2);
                u.g(g, i);
                C0968a.g(j != -9223372036854775807L);
                u.f(j, 1, i, 0, null);
            }
        }
    }

    private static int c(ax.S0.G g) {
        int i = 0;
        while (g.a() != 0) {
            int M = g.M();
            i += M;
            if (M != 255) {
                return i;
            }
        }
        return -1;
    }
}
