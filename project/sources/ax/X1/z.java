package ax.X1;

import ax.S0.d0;
import ax.q1.AbstractC2845e;
import ax.q1.InterfaceC2858s;
import java.io.IOException;

/* loaded from: classes.dex */
final class z extends AbstractC2845e {

    private static final class b implements AbstractC2845e.f {
        private final ax.S0.M a;
        private final ax.S0.G b;

        private AbstractC2845e.C0426e c(ax.S0.G g, long j, long j2) {
            int i = -1;
            long j3 = -9223372036854775807L;
            int i2 = -1;
            while (g.a() >= 4) {
                if (z.k(g.f(), g.g()) != 442) {
                    g.c0(1);
                } else {
                    g.c0(4);
                    long l = A.l(g);
                    if (l != -9223372036854775807L) {
                        long b = this.a.b(l);
                        if (b > j) {
                            return j3 == -9223372036854775807L ? AbstractC2845e.C0426e.d(b, j2) : AbstractC2845e.C0426e.e(j2 + i2);
                        }
                        if (100000 + b > j) {
                            return AbstractC2845e.C0426e.e(j2 + g.g());
                        }
                        i2 = g.g();
                        j3 = b;
                    }
                    d(g);
                    i = g.g();
                }
            }
            return j3 != -9223372036854775807L ? AbstractC2845e.C0426e.f(j3, j2 + i) : AbstractC2845e.C0426e.d;
        }

        private static void d(ax.S0.G g) {
            int k;
            int j = g.j();
            if (g.a() < 10) {
                g.b0(j);
                return;
            }
            g.c0(9);
            int M = g.M() & 7;
            if (g.a() < M) {
                g.b0(j);
                return;
            }
            g.c0(M);
            if (g.a() < 4) {
                g.b0(j);
                return;
            }
            if (z.k(g.f(), g.g()) == 443) {
                g.c0(4);
                int U = g.U();
                if (g.a() < U) {
                    g.b0(j);
                    return;
                }
                g.c0(U);
            }
            while (g.a() >= 4 && (k = z.k(g.f(), g.g())) != 442 && k != 441 && (k >>> 8) == 1) {
                g.c0(4);
                if (g.a() < 2) {
                    g.b0(j);
                    return;
                }
                g.b0(Math.min(g.j(), g.g() + g.U()));
            }
        }

        @Override // ax.q1.AbstractC2845e.f
        public AbstractC2845e.C0426e a(InterfaceC2858s interfaceC2858s, long j) throws IOException {
            long position = interfaceC2858s.getPosition();
            int min = (int) Math.min(20000L, interfaceC2858s.getLength() - position);
            this.b.X(min);
            interfaceC2858s.p(this.b.f(), 0, min);
            return c(this.b, j, position);
        }

        @Override // ax.q1.AbstractC2845e.f
        public void b() {
            this.b.Y(d0.f);
        }

        private b(ax.S0.M m) {
            this.a = m;
            this.b = new ax.S0.G();
        }
    }

    public z(ax.S0.M m, long j, long j2) {
        super(new AbstractC2845e.b(), new b(m), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
