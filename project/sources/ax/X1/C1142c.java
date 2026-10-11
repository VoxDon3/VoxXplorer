package ax.X1;

import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.X1.L;
import ax.q1.C2842b;
import ax.q1.InterfaceC2859t;
import ax.q1.U;
import j$.util.Objects;

/* renamed from: ax.X1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1142c implements InterfaceC1152m {
    private final ax.S0.F a;
    private final ax.S0.G b;
    private final String c;
    private final int d;
    private final String e;
    private String f;
    private U g;
    private int h;
    private int i;
    private boolean j;
    private long k;
    private C0912v l;
    private int m;
    private long n;

    public C1142c(String str) {
        this(null, 0, str);
    }

    private boolean a(ax.S0.G g, byte[] bArr, int i) {
        int min = Math.min(g.a(), i - this.i);
        g.q(bArr, this.i, min);
        int i2 = this.i + min;
        this.i = i2;
        return i2 == i;
    }

    private void g() {
        this.a.p(0);
        C2842b.C0424b f = C2842b.f(this.a);
        C0912v c0912v = this.l;
        if (c0912v == null || f.d != c0912v.G || f.c != c0912v.H || !Objects.equals(f.a, c0912v.o)) {
            C0912v.b t0 = new C0912v.b().j0(this.f).W(this.e).y0(f.a).T(f.d).z0(f.c).n0(this.c).w0(this.d).t0(f.g);
            if ("audio/ac3".equals(f.a)) {
                t0.S(f.g);
            }
            C0912v P = t0.P();
            this.l = P;
            this.g.e(P);
        }
        this.m = f.e;
        this.k = (f.f * 1000000) / this.l.H;
    }

    private boolean h(ax.S0.G g) {
        while (true) {
            if (g.a() <= 0) {
                return false;
            }
            if (this.j) {
                int M = g.M();
                if (M == 119) {
                    this.j = false;
                    return true;
                }
                this.j = M == 11;
            } else {
                this.j = g.M() == 11;
            }
        }
    }

    @Override // ax.X1.InterfaceC1152m
    public void b() {
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.n = -9223372036854775807L;
    }

    @Override // ax.X1.InterfaceC1152m
    public void c(ax.S0.G g) {
        C0968a.i(this.g);
        while (g.a() > 0) {
            int i = this.h;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(g.a(), this.m - this.i);
                        this.g.g(g, min);
                        int i2 = this.i + min;
                        this.i = i2;
                        if (i2 == this.m) {
                            C0968a.g(this.n != -9223372036854775807L);
                            this.g.f(this.n, 1, this.m, 0, null);
                            this.n += this.k;
                            this.h = 0;
                        }
                    }
                } else if (a(g, this.b.f(), 128)) {
                    g();
                    this.b.b0(0);
                    this.g.g(this.b, 128);
                    this.h = 2;
                }
            } else if (h(g)) {
                this.h = 1;
                this.b.f()[0] = 11;
                this.b.f()[1] = 119;
                this.i = 2;
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
        this.n = j;
    }

    public C1142c(String str, int i, String str2) {
        ax.S0.F f = new ax.S0.F(new byte[128]);
        this.a = f;
        this.b = new ax.S0.G(f.a);
        this.h = 0;
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // ax.X1.InterfaceC1152m
    public void e(boolean z) {
    }
}
