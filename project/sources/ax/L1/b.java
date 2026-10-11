package ax.L1;

import ax.L1.i;
import ax.S0.C0968a;
import ax.S0.G;
import ax.S0.d0;
import ax.q1.B;
import ax.q1.C2840A;
import ax.q1.C2864y;
import ax.q1.InterfaceC2858s;
import ax.q1.N;
import ax.q1.z;
import java.util.Arrays;

/* loaded from: classes.dex */
final class b extends i {
    private B n;
    private a o;

    private static final class a implements g {
        private B a;
        private B.a b;
        private long c = -1;
        private long d = -1;

        public a(B b, B.a aVar) {
            this.a = b;
            this.b = aVar;
        }

        @Override // ax.L1.g
        public N a() {
            C0968a.g(this.c != -1);
            return new C2840A(this.a, this.c);
        }

        @Override // ax.L1.g
        public long b(InterfaceC2858s interfaceC2858s) {
            long j = this.d;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.d = -1L;
            return j2;
        }

        @Override // ax.L1.g
        public void c(long j) {
            long[] jArr = this.b.a;
            this.d = jArr[d0.h(jArr, j, true, true)];
        }

        public void d(long j) {
            this.c = j;
        }
    }

    b() {
    }

    private int n(G g) {
        int i = (g.f()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            g.c0(4);
            g.V();
        }
        int j = C2864y.j(g, i);
        g.b0(0);
        return j;
    }

    private static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(G g) {
        return g.a() >= 5 && g.M() == 127 && g.O() == 1179402563;
    }

    @Override // ax.L1.i
    protected long f(G g) {
        if (o(g.f())) {
            return n(g);
        }
        return -1L;
    }

    @Override // ax.L1.i
    protected boolean h(G g, long j, i.b bVar) {
        byte[] f = g.f();
        B b = this.n;
        if (b == null) {
            B b2 = new B(f, 17);
            this.n = b2;
            bVar.a = b2.g(Arrays.copyOfRange(f, 9, g.j()), null).b().W("audio/ogg").P();
            return true;
        }
        if ((f[0] & Byte.MAX_VALUE) == 3) {
            B.a f2 = z.f(g);
            B b3 = b.b(f2);
            this.n = b3;
            this.o = new a(b3, f2);
            return true;
        }
        if (!o(f)) {
            return true;
        }
        a aVar = this.o;
        if (aVar != null) {
            aVar.d(j);
            bVar.b = this.o;
        }
        C0968a.e(bVar.a);
        return false;
    }

    @Override // ax.L1.i
    protected void l(boolean z) {
        super.l(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
