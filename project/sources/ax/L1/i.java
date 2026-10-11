package ax.L1;

import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.S0.G;
import ax.S0.d0;
import ax.q1.InterfaceC2858s;
import ax.q1.InterfaceC2859t;
import ax.q1.M;
import ax.q1.N;
import ax.q1.U;
import java.io.IOException;

/* loaded from: classes.dex */
abstract class i {
    private U b;
    private InterfaceC2859t c;
    private g d;
    private long e;
    private long f;
    private long g;
    private int h;
    private int i;
    private long k;
    private boolean l;
    private boolean m;
    private final e a = new e();
    private b j = new b();

    static class b {
        C0912v a;
        g b;

        b() {
        }
    }

    private void a() {
        C0968a.i(this.b);
        d0.i(this.c);
    }

    private boolean i(InterfaceC2858s interfaceC2858s) throws IOException {
        while (this.a.d(interfaceC2858s)) {
            this.k = interfaceC2858s.getPosition() - this.f;
            if (!h(this.a.c(), this.f, this.j)) {
                return true;
            }
            this.f = interfaceC2858s.getPosition();
        }
        this.h = 3;
        return false;
    }

    private int j(InterfaceC2858s interfaceC2858s) throws IOException {
        if (!i(interfaceC2858s)) {
            return -1;
        }
        C0912v c0912v = this.j.a;
        this.i = c0912v.H;
        if (!this.m) {
            this.b.e(c0912v);
            this.m = true;
        }
        g gVar = this.j.b;
        if (gVar != null) {
            this.d = gVar;
        } else if (interfaceC2858s.getLength() == -1) {
            this.d = new c();
        } else {
            f b2 = this.a.b();
            this.d = new ax.L1.a(this, this.f, interfaceC2858s.getLength(), b2.h + b2.i, b2.c, (b2.b & 4) != 0);
        }
        this.h = 2;
        this.a.f();
        return 0;
    }

    private int k(InterfaceC2858s interfaceC2858s, M m) throws IOException {
        long b2 = this.d.b(interfaceC2858s);
        if (b2 >= 0) {
            m.a = b2;
            return 1;
        }
        if (b2 < -1) {
            e(-(b2 + 2));
        }
        if (!this.l) {
            N n = (N) C0968a.i(this.d.a());
            this.c.h(n);
            this.b.d(n.n());
            this.l = true;
        }
        if (this.k <= 0 && !this.a.d(interfaceC2858s)) {
            this.h = 3;
            return -1;
        }
        this.k = 0L;
        G c2 = this.a.c();
        long f = f(c2);
        if (f >= 0) {
            long j = this.g;
            if (j + f >= this.e) {
                long b3 = b(j);
                this.b.g(c2, c2.j());
                this.b.f(b3, 1, c2.j(), 0, null);
                this.e = -1L;
            }
        }
        this.g += f;
        return 0;
    }

    protected long b(long j) {
        return (j * 1000000) / this.i;
    }

    protected long c(long j) {
        return (this.i * j) / 1000000;
    }

    void d(InterfaceC2859t interfaceC2859t, U u) {
        this.c = interfaceC2859t;
        this.b = u;
        l(true);
    }

    protected void e(long j) {
        this.g = j;
    }

    protected abstract long f(G g);

    final int g(InterfaceC2858s interfaceC2858s, M m) throws IOException {
        a();
        int i = this.h;
        if (i == 0) {
            return j(interfaceC2858s);
        }
        if (i == 1) {
            interfaceC2858s.n((int) this.f);
            this.h = 2;
            return 0;
        }
        if (i == 2) {
            d0.i(this.d);
            return k(interfaceC2858s, m);
        }
        if (i == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    protected abstract boolean h(G g, long j, b bVar) throws IOException;

    protected void l(boolean z) {
        if (z) {
            this.j = new b();
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }

    final void m(long j, long j2) {
        this.a.e();
        if (j == 0) {
            l(!this.l);
        } else if (this.h != 0) {
            this.e = c(j2);
            ((g) d0.i(this.d)).c(this.e);
            this.h = 2;
        }
    }

    private static final class c implements g {
        private c() {
        }

        @Override // ax.L1.g
        public N a() {
            return new N.b(-9223372036854775807L);
        }

        @Override // ax.L1.g
        public long b(InterfaceC2858s interfaceC2858s) {
            return -1L;
        }

        @Override // ax.L1.g
        public void c(long j) {
        }
    }
}
