package ax.X1;

import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.S0.d0;
import ax.X1.L;
import ax.q1.InterfaceC2859t;
import ax.q1.U;

/* loaded from: classes.dex */
public final class x implements D {
    private C0912v a;
    private ax.S0.M b;
    private U c;

    public x(String str, String str2) {
        this.a = new C0912v.b().W(str2).y0(str).P();
    }

    private void b() {
        C0968a.i(this.b);
        d0.i(this.c);
    }

    @Override // ax.X1.D
    public void a(ax.S0.M m, InterfaceC2859t interfaceC2859t, L.d dVar) {
        this.b = m;
        dVar.a();
        U u = interfaceC2859t.u(dVar.c(), 5);
        this.c = u;
        u.e(this.a);
    }

    @Override // ax.X1.D
    public void c(ax.S0.G g) {
        b();
        long e = this.b.e();
        long f = this.b.f();
        if (e == -9223372036854775807L || f == -9223372036854775807L) {
            return;
        }
        C0912v c0912v = this.a;
        if (f != c0912v.t) {
            C0912v P = c0912v.b().C0(f).P();
            this.a = P;
            this.c.e(P);
        }
        int a = g.a();
        this.c.g(g, a);
        this.c.f(e, 1, a, 0, null);
    }
}
