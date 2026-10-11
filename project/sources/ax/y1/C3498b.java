package ax.y1;

import ax.K1.n;
import ax.N1.t;
import ax.P0.C;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.S0.G;
import ax.q1.C2857q;
import ax.q1.InterfaceC2858s;
import ax.q1.InterfaceC2859t;
import ax.q1.M;
import ax.q1.N;
import ax.q1.r;
import java.io.IOException;
import java.util.List;

/* renamed from: ax.y1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3498b implements r {
    private InterfaceC2859t b;
    private int c;
    private int d;
    private int e;
    private ax.F1.a g;
    private InterfaceC2858s h;
    private C3500d i;
    private n j;
    private final G a = new G(2);
    private long f = -1;

    private void g(InterfaceC2858s interfaceC2858s) throws IOException {
        this.a.X(2);
        interfaceC2858s.p(this.a.f(), 0, 2);
        interfaceC2858s.j(this.a.U() - 2);
    }

    private void h() {
        ((InterfaceC2859t) C0968a.e(this.b)).o();
        this.b.h(new N.b(-9223372036854775807L));
        this.c = 6;
    }

    private static ax.F1.a i(String str, long j) throws IOException {
        C3499c a;
        if (j == -1 || (a = f.a(str)) == null) {
            return null;
        }
        return a.a(j);
    }

    private void j(ax.F1.a aVar) {
        ((InterfaceC2859t) C0968a.e(this.b)).u(1024, 4).e(new C0912v.b().W("image/jpeg").r0(new C(aVar)).P());
    }

    private int l(InterfaceC2858s interfaceC2858s) throws IOException {
        this.a.X(2);
        interfaceC2858s.p(this.a.f(), 0, 2);
        return this.a.U();
    }

    private void m(InterfaceC2858s interfaceC2858s) throws IOException {
        this.a.X(2);
        interfaceC2858s.readFully(this.a.f(), 0, 2);
        int U = this.a.U();
        this.d = U;
        if (U == 65498) {
            if (this.f != -1) {
                this.c = 4;
                return;
            } else {
                h();
                return;
            }
        }
        if ((U < 65488 || U > 65497) && U != 65281) {
            this.c = 1;
        }
    }

    private void n(InterfaceC2858s interfaceC2858s) throws IOException {
        String G;
        if (this.d == 65505) {
            G g = new G(this.e);
            interfaceC2858s.readFully(g.f(), 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(g.G()) && (G = g.G()) != null) {
                ax.F1.a i = i(G, interfaceC2858s.getLength());
                this.g = i;
                if (i != null) {
                    this.f = i.d;
                }
            }
        } else {
            interfaceC2858s.n(this.e);
        }
        this.c = 0;
    }

    private void o(InterfaceC2858s interfaceC2858s) throws IOException {
        this.a.X(2);
        interfaceC2858s.readFully(this.a.f(), 0, 2);
        this.e = this.a.U() - 2;
        this.c = 2;
    }

    private void p(InterfaceC2858s interfaceC2858s) throws IOException {
        if (!interfaceC2858s.h(this.a.f(), 0, 1, true)) {
            h();
            return;
        }
        interfaceC2858s.m();
        if (this.j == null) {
            this.j = new n(t.a.a, 8);
        }
        C3500d c3500d = new C3500d(interfaceC2858s, this.f);
        this.i = c3500d;
        if (!this.j.c(c3500d)) {
            h();
        } else {
            this.j.a(new C3501e(this.f, (InterfaceC2859t) C0968a.e(this.b)));
            q();
        }
    }

    private void q() {
        j((ax.F1.a) C0968a.e(this.g));
        this.c = 5;
    }

    @Override // ax.q1.r
    public void a(InterfaceC2859t interfaceC2859t) {
        this.b = interfaceC2859t;
    }

    @Override // ax.q1.r
    public void b(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            ((n) C0968a.e(this.j)).b(j, j2);
        }
    }

    @Override // ax.q1.r
    public boolean c(InterfaceC2858s interfaceC2858s) throws IOException {
        if (l(interfaceC2858s) != 65496) {
            return false;
        }
        int l = l(interfaceC2858s);
        this.d = l;
        if (l == 65504) {
            g(interfaceC2858s);
            this.d = l(interfaceC2858s);
        }
        return this.d == 65505;
    }

    @Override // ax.q1.r
    public void d() {
        n nVar = this.j;
        if (nVar != null) {
            nVar.d();
        }
    }

    @Override // ax.q1.r
    public /* synthetic */ r e() {
        return C2857q.b(this);
    }

    @Override // ax.q1.r
    public int f(InterfaceC2858s interfaceC2858s, M m) throws IOException {
        int i = this.c;
        if (i == 0) {
            m(interfaceC2858s);
            return 0;
        }
        if (i == 1) {
            o(interfaceC2858s);
            return 0;
        }
        if (i == 2) {
            n(interfaceC2858s);
            return 0;
        }
        if (i == 4) {
            long position = interfaceC2858s.getPosition();
            long j = this.f;
            if (position != j) {
                m.a = j;
                return 1;
            }
            p(interfaceC2858s);
            return 0;
        }
        if (i != 5) {
            if (i == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.i == null || interfaceC2858s != this.h) {
            this.h = interfaceC2858s;
            this.i = new C3500d(interfaceC2858s, this.f);
        }
        int f = ((n) C0968a.e(this.j)).f(this.i, m);
        if (f == 1) {
            m.a += this.f;
        }
        return f;
    }

    @Override // ax.q1.r
    public /* synthetic */ List k() {
        return C2857q.a(this);
    }
}
