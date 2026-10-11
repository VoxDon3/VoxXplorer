package ax.X1;

import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.X1.L;
import ax.q1.InterfaceC2859t;
import ax.q1.U;
import java.util.Collections;
import java.util.List;

/* renamed from: ax.X1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1151l implements InterfaceC1152m {
    private final List<L.a> a;
    private final String b;
    private final U[] c;
    private boolean d;
    private int e;
    private int f;
    private long g = -9223372036854775807L;

    public C1151l(List<L.a> list, String str) {
        this.a = list;
        this.b = str;
        this.c = new U[list.size()];
    }

    private boolean a(ax.S0.G g, int i) {
        if (g.a() == 0) {
            return false;
        }
        if (g.M() != i) {
            this.d = false;
        }
        this.e--;
        return this.d;
    }

    @Override // ax.X1.InterfaceC1152m
    public void b() {
        this.d = false;
        this.g = -9223372036854775807L;
    }

    @Override // ax.X1.InterfaceC1152m
    public void c(ax.S0.G g) {
        if (this.d) {
            if (this.e != 2 || a(g, 32)) {
                if (this.e != 1 || a(g, 0)) {
                    int g2 = g.g();
                    int a = g.a();
                    for (U u : this.c) {
                        g.b0(g2);
                        u.g(g, a);
                    }
                    this.f += a;
                }
            }
        }
    }

    @Override // ax.X1.InterfaceC1152m
    public void d(InterfaceC2859t interfaceC2859t, L.d dVar) {
        for (int i = 0; i < this.c.length; i++) {
            L.a aVar = this.a.get(i);
            dVar.a();
            U u = interfaceC2859t.u(dVar.c(), 3);
            u.e(new C0912v.b().j0(dVar.b()).W(this.b).y0("application/dvbsubs").k0(Collections.singletonList(aVar.c)).n0(aVar.a).P());
            this.c[i] = u;
        }
    }

    @Override // ax.X1.InterfaceC1152m
    public void e(boolean z) {
        if (this.d) {
            C0968a.g(this.g != -9223372036854775807L);
            for (U u : this.c) {
                u.f(this.g, 1, this.f, 0, null);
            }
            this.d = false;
        }
    }

    @Override // ax.X1.InterfaceC1152m
    public void f(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.d = true;
        this.g = j;
        this.f = 0;
        this.e = 2;
    }
}
