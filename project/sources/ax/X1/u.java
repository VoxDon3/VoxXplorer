package ax.X1;

import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.S0.d0;
import ax.X1.L;
import ax.X1.v;
import ax.q1.InterfaceC2859t;
import ax.q1.U;
import ax.r7.AbstractC2991z;

/* loaded from: classes.dex */
public final class u implements InterfaceC1152m {
    private final String a;
    private String f;
    private U g;
    private boolean j;
    private int l;
    private int m;
    private int o;
    private int p;
    private int t;
    private boolean v;
    private int e = 0;
    private final ax.S0.G b = new ax.S0.G(new byte[15], 2);
    private final ax.S0.F c = new ax.S0.F();
    private final ax.S0.G d = new ax.S0.G();
    private v.b q = new v.b();
    private int r = -2147483647;
    private int s = -1;
    private long u = -1;
    private boolean k = true;
    private boolean n = true;
    private double h = -9.223372036854776E18d;
    private double i = -9.223372036854776E18d;

    public u(String str) {
        this.a = str;
    }

    private void a(ax.S0.G g, ax.S0.G g2, boolean z) {
        int g3 = g.g();
        int min = Math.min(g.a(), g2.a());
        g.q(g2.f(), g2.g(), min);
        g2.c0(min);
        if (z) {
            g.b0(g3);
        }
    }

    private void g() {
        int i;
        if (this.v) {
            this.k = false;
            i = 1;
        } else {
            i = 0;
        }
        double d = ((this.s - this.t) * 1000000.0d) / this.r;
        long round = Math.round(this.h);
        if (this.j) {
            this.j = false;
            this.h = this.i;
        } else {
            this.h += d;
        }
        this.g.f(round, i, this.p, 0, null);
        this.v = false;
        this.t = 0;
        this.p = 0;
    }

    private void h(ax.S0.F f) throws ax.P0.E {
        v.c h = v.h(f);
        this.r = h.b;
        this.s = h.c;
        long j = this.u;
        long j2 = this.q.b;
        if (j != j2) {
            this.u = j2;
            String str = "mhm1";
            if (h.a != -1) {
                str = "mhm1" + String.format(".%02X", Integer.valueOf(h.a));
            }
            byte[] bArr = h.d;
            this.g.e(new C0912v.b().j0(this.f).W(this.a).y0("audio/mhm1").z0(this.r).U(str).k0((bArr == null || bArr.length <= 0) ? null : AbstractC2991z.B(d0.f, bArr)).P());
        }
        this.v = true;
    }

    private boolean i() throws ax.P0.E {
        int j = this.b.j();
        this.c.o(this.b.f(), j);
        boolean g = v.g(this.c, this.q);
        if (g) {
            this.o = 0;
            this.p += this.q.c + j;
        }
        return g;
    }

    private boolean j(int i) {
        return i == 1 || i == 17;
    }

    private boolean k(ax.S0.G g) {
        int i = this.l;
        if ((i & 2) == 0) {
            g.b0(g.j());
            return false;
        }
        if ((i & 4) != 0) {
            return true;
        }
        while (g.a() > 0) {
            int i2 = this.m << 8;
            this.m = i2;
            int M = i2 | g.M();
            this.m = M;
            if (v.e(M)) {
                g.b0(g.g() - 3);
                this.m = 0;
                return true;
            }
        }
        return false;
    }

    private void l(ax.S0.G g) {
        int min = Math.min(g.a(), this.q.c - this.o);
        this.g.g(g, min);
        this.o += min;
    }

    @Override // ax.X1.InterfaceC1152m
    public void b() {
        this.e = 0;
        this.m = 0;
        this.b.X(2);
        this.o = 0;
        this.p = 0;
        this.r = -2147483647;
        this.s = -1;
        this.t = 0;
        this.u = -1L;
        this.v = false;
        this.j = false;
        this.n = true;
        this.k = true;
        this.h = -9.223372036854776E18d;
        this.i = -9.223372036854776E18d;
    }

    @Override // ax.X1.InterfaceC1152m
    public void c(ax.S0.G g) throws ax.P0.E {
        C0968a.i(this.g);
        while (g.a() > 0) {
            int i = this.e;
            if (i != 0) {
                if (i == 1) {
                    a(g, this.b, false);
                    if (this.b.a() != 0) {
                        this.n = false;
                    } else if (i()) {
                        this.b.b0(0);
                        U u = this.g;
                        ax.S0.G g2 = this.b;
                        u.g(g2, g2.j());
                        this.b.X(2);
                        this.d.X(this.q.c);
                        this.n = true;
                        this.e = 2;
                    } else if (this.b.j() < 15) {
                        ax.S0.G g3 = this.b;
                        g3.a0(g3.j() + 1);
                        this.n = false;
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException();
                    }
                    if (j(this.q.a)) {
                        a(g, this.d, true);
                    }
                    l(g);
                    int i2 = this.o;
                    v.b bVar = this.q;
                    if (i2 == bVar.c) {
                        int i3 = bVar.a;
                        if (i3 == 1) {
                            h(new ax.S0.F(this.d.f()));
                        } else if (i3 == 17) {
                            this.t = v.f(new ax.S0.F(this.d.f()));
                        } else if (i3 == 2) {
                            g();
                        }
                        this.e = 1;
                    }
                }
            } else if (k(g)) {
                this.e = 1;
            }
        }
    }

    @Override // ax.X1.InterfaceC1152m
    public void d(InterfaceC2859t interfaceC2859t, L.d dVar) {
        dVar.a();
        this.f = dVar.b();
        this.g = interfaceC2859t.u(dVar.c(), 1);
    }

    @Override // ax.X1.InterfaceC1152m
    public void f(long j, int i) {
        this.l = i;
        if (!this.k && (this.p != 0 || !this.n)) {
            this.j = true;
        }
        if (j != -9223372036854775807L) {
            if (this.j) {
                this.i = j;
            } else {
                this.h = j;
            }
        }
    }

    @Override // ax.X1.InterfaceC1152m
    public void e(boolean z) {
    }
}
