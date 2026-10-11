/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import ax.S0.G;
import ax.S0.M;
import ax.S0.d0;
import ax.X1.A;
import ax.q1.e;
import ax.q1.s;
import java.io.IOException;

final class z
extends e {
    public z(M m8, long l8, long l9) {
        super(new e.b(), new b(m8), l8, 0L, l8 + 1L, 0L, l9, 188L, 1000);
    }

    private static int k(byte[] byArray, int n8) {
        byte by = byArray[n8];
        byte by2 = byArray[n8 + 1];
        byte by3 = byArray[n8 + 2];
        return byArray[n8 + 3] & 0xFF | ((by & 0xFF) << 24 | (by2 & 0xFF) << 16 | (by3 & 0xFF) << 8);
    }

    private static final class b
    implements e.f {
        private final M a;
        private final G b;

        private b(M m8) {
            this.a = m8;
            this.b = new G();
        }

        private e.e c(G g8, long l8, long l9) {
            int n8 = -1;
            long l10 = -9223372036854775807L;
            int n9 = -1;
            while (g8.a() >= 4) {
                if (z.k(g8.f(), g8.g()) != 442) {
                    g8.c0(1);
                    continue;
                }
                g8.c0(4);
                long l11 = A.l(g8);
                int n10 = n9;
                long l12 = l10;
                if (l11 != -9223372036854775807L) {
                    l12 = this.a.b(l11);
                    if (l12 > l8) {
                        if (l10 == -9223372036854775807L) {
                            return e.e.d(l12, l9);
                        }
                        return e.e.e(l9 + (long)n9);
                    }
                    if (100000L + l12 > l8) {
                        return e.e.e(l9 + (long)g8.g());
                    }
                    n10 = g8.g();
                }
                ax.X1.z$b.d(g8);
                n8 = g8.g();
                n9 = n10;
                l10 = l12;
            }
            if (l10 != -9223372036854775807L) {
                return e.e.f(l10, l9 + (long)n8);
            }
            return e.e.d;
        }

        private static void d(G g8) {
            int n8 = g8.j();
            if (g8.a() < 10) {
                g8.b0(n8);
                return;
            }
            g8.c0(9);
            int n9 = g8.M() & 7;
            if (g8.a() < n9) {
                g8.b0(n8);
                return;
            }
            g8.c0(n9);
            if (g8.a() < 4) {
                g8.b0(n8);
                return;
            }
            if (z.k(g8.f(), g8.g()) == 443) {
                g8.c0(4);
                n9 = g8.U();
                if (g8.a() < n9) {
                    g8.b0(n8);
                    return;
                }
                g8.c0(n9);
            }
            while (g8.a() >= 4 && (n9 = z.k(g8.f(), g8.g())) != 442 && n9 != 441 && n9 >>> 8 == 1) {
                g8.c0(4);
                if (g8.a() < 2) {
                    g8.b0(n8);
                    return;
                }
                n9 = g8.U();
                g8.b0(Math.min(g8.j(), g8.g() + n9));
            }
        }

        @Override
        public e.e a(s s8, long l8) throws IOException {
            long l9 = s8.getPosition();
            int n8 = (int)Math.min(20000L, s8.getLength() - l9);
            this.b.X(n8);
            s8.p(this.b.f(), 0, n8);
            return this.c(this.b, l8, l9);
        }

        @Override
        public void b() {
            this.b.Y(d0.f);
        }
    }
}

