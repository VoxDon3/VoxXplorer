package ax.X1;

import ax.S0.d0;
import ax.q1.AbstractC2845e;
import ax.q1.InterfaceC2858s;
import java.io.IOException;

/* loaded from: classes.dex */
final class H extends AbstractC2845e {

    private static final class a implements AbstractC2845e.f {
        private final ax.S0.M a;
        private final ax.S0.G b = new ax.S0.G();
        private final int c;
        private final int d;

        public a(int i, ax.S0.M m, int i2) {
            this.c = i;
            this.a = m;
            this.d = i2;
        }

        private AbstractC2845e.C0426e c(ax.S0.G g, long j, long j2) {
            int a;
            int a2;
            int j3 = g.j();
            long j4 = -1;
            long j5 = -1;
            long j6 = -9223372036854775807L;
            while (g.a() >= 188 && (a2 = (a = M.a(g.f(), g.g(), j3)) + 188) <= j3) {
                long c = M.c(g, a, this.c);
                if (c != -9223372036854775807L) {
                    long b = this.a.b(c);
                    if (b > j) {
                        return j6 == -9223372036854775807L ? AbstractC2845e.C0426e.d(b, j2) : AbstractC2845e.C0426e.e(j2 + j5);
                    }
                    if (100000 + b > j) {
                        return AbstractC2845e.C0426e.e(j2 + a);
                    }
                    j5 = a;
                    j6 = b;
                }
                g.b0(a2);
                j4 = a2;
            }
            return j6 != -9223372036854775807L ? AbstractC2845e.C0426e.f(j6, j2 + j4) : AbstractC2845e.C0426e.d;
        }

        @Override // ax.q1.AbstractC2845e.f
        public AbstractC2845e.C0426e a(InterfaceC2858s interfaceC2858s, long j) throws IOException {
            long position = interfaceC2858s.getPosition();
            int min = (int) Math.min(this.d, interfaceC2858s.getLength() - position);
            this.b.X(min);
            interfaceC2858s.p(this.b.f(), 0, min);
            return c(this.b, j, position);
        }

        @Override // ax.q1.AbstractC2845e.f
        public void b() {
            this.b.Y(d0.f);
        }
    }

    public H(ax.S0.M m, long j, long j2, int i, int i2) {
        super(new AbstractC2845e.b(), new a(i, m, i2), j, 0L, j + 1, 0L, j2, 188L, 940);
    }
}
