package ax.q1;

import ax.P0.C0912v;
import ax.S0.C0968a;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class P implements r {
    private final int a;
    private final int b;
    private final String c;
    private int d;
    private int e;
    private InterfaceC2859t f;
    private U g;

    public P(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    private void g(String str) {
        U u = this.f.u(1024, 4);
        this.g = u;
        u.e(new C0912v.b().W(str).y0(str).P());
        this.f.o();
        this.f.h(new Q(-9223372036854775807L));
        this.e = 1;
    }

    private void h(InterfaceC2858s interfaceC2858s) throws IOException {
        int a = ((U) C0968a.e(this.g)).a(interfaceC2858s, 1024, true);
        if (a != -1) {
            this.d += a;
            return;
        }
        this.e = 2;
        this.g.f(0L, 1, this.d, 0, null);
        this.d = 0;
    }

    @Override // ax.q1.r
    public void a(InterfaceC2859t interfaceC2859t) {
        this.f = interfaceC2859t;
        g(this.c);
    }

    @Override // ax.q1.r
    public void b(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // ax.q1.r
    public boolean c(InterfaceC2858s interfaceC2858s) throws IOException {
        C0968a.g((this.a == -1 || this.b == -1) ? false : true);
        ax.S0.G g = new ax.S0.G(this.b);
        interfaceC2858s.p(g.f(), 0, this.b);
        return g.U() == this.a;
    }

    @Override // ax.q1.r
    public /* synthetic */ r e() {
        return C2857q.b(this);
    }

    @Override // ax.q1.r
    public int f(InterfaceC2858s interfaceC2858s, M m) throws IOException {
        int i = this.e;
        if (i == 1) {
            h(interfaceC2858s);
            return 0;
        }
        if (i == 2) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @Override // ax.q1.r
    public /* synthetic */ List k() {
        return C2857q.a(this);
    }

    @Override // ax.q1.r
    public void d() {
    }
}
