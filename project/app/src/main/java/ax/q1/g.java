/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import ax.S0.G;
import ax.S0.a;
import ax.S0.u;
import ax.q1.U;

public final class g {
    public static void a(long l8, G g8, U[] uArray) {
        while (true) {
            int n8 = g8.a();
            int n9 = 1;
            if (n8 <= 1) break;
            int n10 = g.c(g8);
            int n11 = g.c(g8);
            int n12 = g8.g() + n11;
            if (n11 != -1 && n11 <= g8.a()) {
                n8 = n12;
                if (n10 == 4) {
                    n8 = n12;
                    if (n11 >= 8) {
                        n8 = g8.M();
                        int n13 = g8.U();
                        n10 = n13 == 49 ? g8.v() : 0;
                        n11 = g8.M();
                        if (n13 == 47) {
                            g8.c0(1);
                        }
                        n8 = n8 == 181 && (n13 == 49 || n13 == 47) && n11 == 3 ? 1 : 0;
                        n11 = n8;
                        if (n13 == 49) {
                            n10 = n10 == 1195456820 ? n9 : 0;
                            n11 = n8 & n10;
                        }
                        n8 = n12;
                        if (n11 != 0) {
                            g.b(l8, g8, uArray);
                            n8 = n12;
                        }
                    }
                }
            } else {
                u.h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                n8 = g8.j();
            }
            g8.b0(n8);
        }
    }

    public static void b(long l8, G g8, U[] uArray) {
        int n8 = g8.M();
        if ((n8 & 0x40) != 0) {
            g8.c0(1);
            int n9 = (n8 & 0x1F) * 3;
            int n10 = g8.g();
            for (U u8 : uArray) {
                g8.b0(n10);
                u8.g(g8, n9);
                boolean bl = l8 != -9223372036854775807L;
                a.g(bl);
                u8.f(l8, 1, n9, 0, null);
            }
        }
    }

    private static int c(G g8) {
        int n8;
        int n9;
        int n10 = 0;
        do {
            if (g8.a() == 0) {
                return -1;
            }
            n9 = g8.M();
            n10 = n8 = n10 + n9;
        } while (n9 == 255);
        return n8;
    }
}

