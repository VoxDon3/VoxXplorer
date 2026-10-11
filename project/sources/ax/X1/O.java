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
final class O {
    private final List<C0912v> a;
    private final String b;
    private final U[] c;
    private final ax.T0.k d;

    public O(List<C0912v> list, String str) {
        this.a = list;
        this.b = str;
        this.c = new U[list.size()];
        ax.T0.k kVar = new ax.T0.k(new k.b() { // from class: ax.X1.N
            @Override // ax.T0.k.b
            public final void a(long j, ax.S0.G g) {
                C2847g.b(j, g, O.this.c);
            }
        });
        this.d = kVar;
        kVar.g(3);
    }

    public void b(long j, ax.S0.G g) {
        if (g.a() < 9) {
            return;
        }
        int v = g.v();
        int v2 = g.v();
        int M = g.M();
        if (v == 434 && v2 == 1195456820 && M == 3) {
            this.d.a(j, g);
        }
    }

    public void c(InterfaceC2859t interfaceC2859t, L.d dVar) {
        for (int i = 0; i < this.c.length; i++) {
            dVar.a();
            U u = interfaceC2859t.u(dVar.c(), 3);
            C0912v c0912v = this.a.get(i);
            String str = c0912v.o;
            C0968a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            u.e(new C0912v.b().j0(dVar.b()).W(this.b).y0(str).A0(c0912v.e).n0(c0912v.d).Q(c0912v.L).k0(c0912v.r).P());
            this.c[i] = u;
        }
    }
}
