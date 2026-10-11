/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import ax.S0.G;
import ax.S0.d0;
import ax.X1.M;
import ax.q1.e;
import ax.q1.s;
import java.io.IOException;

final class H
extends e {
    public H(ax.S0.M m8, long l8, long l9, int n8, int n9) {
        super(new e.b(), new a(n8, m8, n9), l8, 0L, l8 + 1L, 0L, l9, 188L, 940);
    }

    private static final class a
    implements e.f {
        private final ax.S0.M a;
        private final G b;
        private final int c;
        private final int d;

        public a(int n8, ax.S0.M m8, int n9) {
            this.c = n8;
            this.a = m8;
            this.d = n9;
            this.b = new G();
        }

        private e.e c(G g8, long l8, long l9) {
            int n8;
            int n9;
            int n10 = g8.j();
            long l10 = -1L;
            long l11 = -1L;
            long l12 = -9223372036854775807L;
            while (g8.a() >= 188 && (n9 = (n8 = M.a(g8.f(), g8.g(), n10)) + 188) <= n10) {
                l10 = M.c(g8, n8, this.c);
                long l13 = l11;
                long l14 = l12;
                if (l10 != -9223372036854775807L) {
                    l14 = this.a.b(l10);
                    if (l14 > l8) {
                        if (l12 == -9223372036854775807L) {
                            return e.e.d(l14, l9);
                        }
                        return e.e.e(l9 + l11);
                    }
                    if (100000L + l14 > l8) {
                        return e.e.e(l9 + (long)n8);
                    }
                    l13 = n8;
                }
                g8.b0(n9);
                l10 = n9;
                l11 = l13;
                l12 = l14;
            }
            if (l12 != -9223372036854775807L) {
                return e.e.f(l12, l9 + l10);
            }
            return e.e.d;
        }

        @Override
        public e.e a(s s8, long l8) throws IOException {
            long l9 = s8.getPosition();
            int n8 = (int)Math.min((long)this.d, s8.getLength() - l9);
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

