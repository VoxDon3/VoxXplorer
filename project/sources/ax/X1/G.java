package ax.X1;

import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.T0.k;
import ax.X1.L;
import ax.q1.C2847g;
import ax.q1.InterfaceC2859t;
import ax.q1.U;
import java.util.List;

/* loaded from: classes.dex */
public final class G {
    private final List<C0912v> a;
    private final String b;
    private final U[] c;
    private final ax.T0.k d = new ax.T0.k(new k.b() { // from class: ax.X1.F
        @Override // ax.T0.k.b
        public final void a(long j, ax.S0.G g) {
            C2847g.a(j, g, G.this.c);
        }
    });

    public G(List<C0912v> list, String str) {
        this.a = list;
        this.b = str;
        this.c = new U[list.size()];
    }

    public void b() {
        this.d.d();
    }

    public void c(long j, ax.S0.G g) {
        this.d.a(j, g);
    }

    public void d(InterfaceC2859t interfaceC2859t, L.d dVar) {
        for (int i = 0; i < this.c.length; i++) {
            dVar.a();
            U u = interfaceC2859t.u(dVar.c(), 3);
            C0912v c0912v = this.a.get(i);
            String str = c0912v.o;
            C0968a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            String str2 = c0912v.a;
            if (str2 == null) {
                str2 = dVar.b();
            }
            u.e(new C0912v.b().j0(str2).W(this.b).y0(str).A0(c0912v.e).n0(c0912v.d).Q(c0912v.L).k0(c0912v.r).P());
            this.c[i] = u;
        }
    }

    public void e() {
        this.d.d();
    }

    public void f(int i) {
        this.d.g(i);
    }
}
