package ax.rd;

import ax.Wc.A0;
import ax.Wc.C1103h;
import ax.Wc.C1110k0;
import ax.Wc.C1121q;
import ax.Wc.C1135x0;
import ax.Wc.InterfaceC1101g;

/* loaded from: classes3.dex */
public class o {
    A0 a = new A0(true, 0, new C1121q(2));
    C1121q b;
    C3031a c;
    ax.pd.c d;
    n e;
    n f;
    ax.pd.c g;
    l h;
    f i;
    private boolean j;
    private C1110k0 k;
    private C1110k0 l;

    public m a() {
        if (this.b == null || this.c == null || this.d == null || this.e == null || this.f == null || ((this.g == null && !this.j) || this.h == null)) {
            throw new IllegalStateException("not all mandatory fields set in V3 TBScertificate generator");
        }
        C1103h c1103h = new C1103h(10);
        c1103h.a(this.a);
        c1103h.a(this.b);
        c1103h.a(this.c);
        c1103h.a(this.d);
        C1103h c1103h2 = new C1103h(2);
        c1103h2.a(this.e);
        c1103h2.a(this.f);
        c1103h.a(new C1135x0(c1103h2));
        InterfaceC1101g interfaceC1101g = this.g;
        if (interfaceC1101g == null) {
            interfaceC1101g = new C1135x0();
        }
        c1103h.a(interfaceC1101g);
        c1103h.a(this.h);
        C1110k0 c1110k0 = this.k;
        if (c1110k0 != null) {
            c1103h.a(new A0(false, 1, c1110k0));
        }
        C1110k0 c1110k02 = this.l;
        if (c1110k02 != null) {
            c1103h.a(new A0(false, 2, c1110k02));
        }
        f fVar = this.i;
        if (fVar != null) {
            c1103h.a(new A0(true, 3, fVar));
        }
        return m.s(new C1135x0(c1103h));
    }

    public void b(n nVar) {
        this.f = nVar;
    }

    public void c(f fVar) {
        e r;
        this.i = fVar;
        if (fVar == null || (r = fVar.r(e.i0)) == null || !r.u()) {
            return;
        }
        this.j = true;
    }

    public void d(ax.pd.c cVar) {
        this.d = cVar;
    }

    public void e(C1121q c1121q) {
        this.b = c1121q;
    }

    public void f(C3031a c3031a) {
        this.c = c3031a;
    }

    public void g(n nVar) {
        this.e = nVar;
    }

    public void h(ax.pd.c cVar) {
        this.g = cVar;
    }

    public void i(l lVar) {
        this.h = lVar;
    }
}
