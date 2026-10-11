package ax.X1;

import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.X1.L;
import ax.q1.C2841a;
import ax.q1.InterfaceC2859t;
import ax.q1.U;
import java.util.Collections;

/* loaded from: classes.dex */
public final class s implements InterfaceC1152m {
    private final String a;
    private final int b;
    private final String c;
    private final ax.S0.G d;
    private final ax.S0.F e;
    private U f;
    private String g;
    private C0912v h;
    private int i;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private long s;
    private int t;
    private long u;
    private int v;
    private String w;

    public s(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
        ax.S0.G g = new ax.S0.G(1024);
        this.d = g;
        this.e = new ax.S0.F(g.f());
        this.m = -9223372036854775807L;
    }

    private static long a(ax.S0.F f) {
        return f.h((f.h(2) + 1) * 8);
    }

    private void g(ax.S0.F f) throws ax.P0.E {
        if (!f.g()) {
            this.n = true;
            l(f);
        } else if (!this.n) {
            return;
        }
        if (this.o != 0) {
            throw ax.P0.E.a(null, null);
        }
        if (this.p != 0) {
            throw ax.P0.E.a(null, null);
        }
        k(f, j(f));
        if (this.r) {
            f.r((int) this.s);
        }
    }

    private int h(ax.S0.F f) throws ax.P0.E {
        int b = f.b();
        C2841a.b d = C2841a.d(f, true);
        this.w = d.c;
        this.t = d.a;
        this.v = d.b;
        return b - f.b();
    }

    private void i(ax.S0.F f) {
        int h = f.h(3);
        this.q = h;
        if (h == 0) {
            f.r(8);
            return;
        }
        if (h == 1) {
            f.r(9);
            return;
        }
        if (h == 3 || h == 4 || h == 5) {
            f.r(6);
        } else {
            if (h != 6 && h != 7) {
                throw new IllegalStateException();
            }
            f.r(1);
        }
    }

    private int j(ax.S0.F f) throws ax.P0.E {
        int h;
        if (this.q != 0) {
            throw ax.P0.E.a(null, null);
        }
        int i = 0;
        do {
            h = f.h(8);
            i += h;
        } while (h == 255);
        return i;
    }

    private void k(ax.S0.F f, int i) {
        int e = f.e();
        if ((e & 7) == 0) {
            this.d.b0(e >> 3);
        } else {
            f.i(this.d.f(), 0, i * 8);
            this.d.b0(0);
        }
        this.f.g(this.d, i);
        C0968a.g(this.m != -9223372036854775807L);
        this.f.f(this.m, 1, i, 0, null);
        this.m += this.u;
    }

    private void l(ax.S0.F f) throws ax.P0.E {
        boolean g;
        int h = f.h(1);
        int h2 = h == 1 ? f.h(1) : 0;
        this.o = h2;
        if (h2 != 0) {
            throw ax.P0.E.a(null, null);
        }
        if (h == 1) {
            a(f);
        }
        if (!f.g()) {
            throw ax.P0.E.a(null, null);
        }
        this.p = f.h(6);
        int h3 = f.h(4);
        int h4 = f.h(3);
        if (h3 != 0 || h4 != 0) {
            throw ax.P0.E.a(null, null);
        }
        if (h == 0) {
            int e = f.e();
            int h5 = h(f);
            f.p(e);
            byte[] bArr = new byte[(h5 + 7) / 8];
            f.i(bArr, 0, h5);
            C0912v P = new C0912v.b().j0(this.g).W(this.c).y0("audio/mp4a-latm").U(this.w).T(this.v).z0(this.t).k0(Collections.singletonList(bArr)).n0(this.a).w0(this.b).P();
            if (!P.equals(this.h)) {
                this.h = P;
                this.u = 1024000000 / P.H;
                this.f.e(P);
            }
        } else {
            f.r(((int) a(f)) - h(f));
        }
        i(f);
        boolean g2 = f.g();
        this.r = g2;
        this.s = 0L;
        if (g2) {
            if (h == 1) {
                this.s = a(f);
            } else {
                do {
                    g = f.g();
                    this.s = (this.s << 8) + f.h(8);
                } while (g);
            }
        }
        if (f.g()) {
            f.r(8);
        }
    }

    private void m(int i) {
        this.d.X(i);
        this.e.n(this.d.f());
    }

    @Override // ax.X1.InterfaceC1152m
    public void b() {
        this.i = 0;
        this.m = -9223372036854775807L;
        this.n = false;
    }

    @Override // ax.X1.InterfaceC1152m
    public void c(ax.S0.G g) throws ax.P0.E {
        C0968a.i(this.f);
        while (g.a() > 0) {
            int i = this.i;
            if (i != 0) {
                if (i == 1) {
                    int M = g.M();
                    if ((M & 224) == 224) {
                        this.l = M;
                        this.i = 2;
                    } else if (M != 86) {
                        this.i = 0;
                    }
                } else if (i == 2) {
                    int M2 = ((this.l & (-225)) << 8) | g.M();
                    this.k = M2;
                    if (M2 > this.d.f().length) {
                        m(this.k);
                    }
                    this.j = 0;
                    this.i = 3;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException();
                    }
                    int min = Math.min(g.a(), this.k - this.j);
                    g.q(this.e.a, this.j, min);
                    int i2 = this.j + min;
                    this.j = i2;
                    if (i2 == this.k) {
                        this.e.p(0);
                        g(this.e);
                        this.i = 0;
                    }
                }
            } else if (g.M() == 86) {
                this.i = 1;
            }
        }
    }

    @Override // ax.X1.InterfaceC1152m
    public void d(InterfaceC2859t interfaceC2859t, L.d dVar) {
        dVar.a();
        this.f = interfaceC2859t.u(dVar.c(), 1);
        this.g = dVar.b();
    }

    @Override // ax.X1.InterfaceC1152m
    public void f(long j, int i) {
        this.m = j;
    }

    @Override // ax.X1.InterfaceC1152m
    public void e(boolean z) {
    }
}
