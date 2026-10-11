package ax.X1;

import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.X1.L;
import ax.q1.InterfaceC2859t;
import ax.q1.J;
import ax.q1.U;

/* loaded from: classes.dex */
public final class t implements InterfaceC1152m {
    private final ax.S0.G a;
    private final J.a b;
    private final String c;
    private final int d;
    private final String e;
    private U f;
    private String g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private long l;
    private int m;
    private long n;

    public t(String str) {
        this(null, 0, str);
    }

    private void a(ax.S0.G g) {
        byte[] f = g.f();
        int j = g.j();
        for (int g2 = g.g(); g2 < j; g2++) {
            byte b = f[g2];
            boolean z = (b & 255) == 255;
            boolean z2 = this.k && (b & 224) == 224;
            this.k = z;
            if (z2) {
                g.b0(g2 + 1);
                this.k = false;
                this.a.f()[1] = f[g2];
                this.i = 2;
                this.h = 1;
                return;
            }
        }
        g.b0(j);
    }

    private void g(ax.S0.G g) {
        int min = Math.min(g.a(), this.m - this.i);
        this.f.g(g, min);
        int i = this.i + min;
        this.i = i;
        if (i < this.m) {
            return;
        }
        C0968a.g(this.n != -9223372036854775807L);
        this.f.f(this.n, 1, this.m, 0, null);
        this.n += this.l;
        this.i = 0;
        this.h = 0;
    }

    private void h(ax.S0.G g) {
        int min = Math.min(g.a(), 4 - this.i);
        g.q(this.a.f(), this.i, min);
        int i = this.i + min;
        this.i = i;
        if (i < 4) {
            return;
        }
        this.a.b0(0);
        if (!this.b.a(this.a.v())) {
            this.i = 0;
            this.h = 1;
            return;
        }
        this.m = this.b.c;
        if (!this.j) {
            this.l = (r8.g * 1000000) / r8.d;
            this.f.e(new C0912v.b().j0(this.g).W(this.e).y0(this.b.b).o0(4096).T(this.b.e).z0(this.b.d).n0(this.c).w0(this.d).P());
            this.j = true;
        }
        this.a.b0(0);
        this.f.g(this.a, 4);
        this.h = 2;
    }

    @Override // ax.X1.InterfaceC1152m
    public void b() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // ax.X1.InterfaceC1152m
    public void c(ax.S0.G g) {
        C0968a.i(this.f);
        while (g.a() > 0) {
            int i = this.h;
            if (i == 0) {
                a(g);
            } else if (i == 1) {
                h(g);
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                g(g);
            }
        }
    }

    @Override // ax.X1.InterfaceC1152m
    public void d(InterfaceC2859t interfaceC2859t, L.d dVar) {
        dVar.a();
        this.g = dVar.b();
        this.f = interfaceC2859t.u(dVar.c(), 1);
    }

    @Override // ax.X1.InterfaceC1152m
    public void f(long j, int i) {
        this.n = j;
    }

    public t(String str, int i, String str2) {
        this.h = 0;
        ax.S0.G g = new ax.S0.G(4);
        this.a = g;
        g.f()[0] = -1;
        this.b = new J.a();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // ax.X1.InterfaceC1152m
    public void e(boolean z) {
    }
}
