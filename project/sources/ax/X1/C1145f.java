package ax.X1;

import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.X1.L;
import ax.q1.C2843c;
import ax.q1.InterfaceC2859t;
import ax.q1.U;

/* renamed from: ax.X1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1145f implements InterfaceC1152m {
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
    private boolean k;
    private long l;
    private C0912v m;
    private int n;
    private long o;

    public C1145f(String str) {
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
        C2843c.C0425c g = C2843c.g(this.a);
        C0912v c0912v = this.m;
        if (c0912v == null || g.c != c0912v.G || g.b != c0912v.H || !"audio/ac4".equals(c0912v.o)) {
            C0912v P = new C0912v.b().j0(this.f).W(this.e).y0("audio/ac4").T(g.c).z0(g.b).n0(this.c).w0(this.d).P();
            this.m = P;
            this.g.e(P);
        }
        this.n = g.d;
        this.l = (g.e * 1000000) / this.m.H;
    }

    private boolean h(ax.S0.G g) {
        int M;
        while (true) {
            if (g.a() <= 0) {
                return false;
            }
            if (this.j) {
                M = g.M();
                this.j = M == 172;
                if (M == 64 || M == 65) {
                    break;
                }
            } else {
                this.j = g.M() == 172;
            }
        }
        this.k = M == 65;
        return true;
    }

    @Override // ax.X1.InterfaceC1152m
    public void b() {
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.k = false;
        this.o = -9223372036854775807L;
    }

    @Override // ax.X1.InterfaceC1152m
    public void c(ax.S0.G g) {
        C0968a.i(this.g);
        while (g.a() > 0) {
            int i = this.h;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(g.a(), this.n - this.i);
                        this.g.g(g, min);
                        int i2 = this.i + min;
                        this.i = i2;
                        if (i2 == this.n) {
                            C0968a.g(this.o != -9223372036854775807L);
                            this.g.f(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.h = 0;
                        }
                    }
                } else if (a(g, this.b.f(), 16)) {
                    g();
                    this.b.b0(0);
                    this.g.g(this.b, 16);
                    this.h = 2;
                }
            } else if (h(g)) {
                this.h = 1;
                this.b.f()[0] = -84;
                this.b.f()[1] = (byte) (this.k ? 65 : 64);
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
        this.o = j;
    }

    public C1145f(String str, int i, String str2) {
        ax.S0.F f = new ax.S0.F(new byte[16]);
        this.a = f;
        this.b = new ax.S0.G(f.a);
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.k = false;
        this.o = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // ax.X1.InterfaceC1152m
    public void e(boolean z) {
    }
}
