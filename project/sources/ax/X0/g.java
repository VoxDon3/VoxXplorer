package ax.X0;

import ax.H9.l;
import ax.I9.A;
import ax.I9.B;
import ax.I9.C0738a;
import ax.I9.C0739b;
import ax.I9.y;
import ax.I9.z;
import ax.S0.C0968a;
import ax.X0.i;

/* loaded from: classes.dex */
final class g extends C0739b implements y {
    private final ax.B9.d j;
    private final ax.H9.k k;
    private final ax.H9.k l;
    private final z m;
    private final B n;
    private final ax.I9.g o;
    private final ax.I9.c p;
    private final ax.I9.c q;
    private final ax.I9.j r;
    private final ax.H9.k s;
    private final ax.H9.k t;
    private int u;
    private int v;
    private int w;
    private i.c x;

    public g(short[] sArr) {
        this.j = new ax.B9.d(sArr);
        ax.I9.j jVar = new ax.I9.j();
        this.r = jVar;
        A a = new A();
        this.m = a;
        B b = new B();
        this.n = b;
        ax.I9.c cVar = new ax.I9.c();
        this.p = cVar;
        ax.I9.c cVar2 = new ax.I9.c();
        this.q = cVar2;
        ax.H9.k kVar = cVar2.p;
        this.t = kVar;
        ax.I9.g gVar = new ax.I9.g();
        this.o = gVar;
        ax.H9.k kVar2 = jVar.i;
        this.k = kVar2;
        ax.I9.j jVar2 = new ax.I9.j();
        ax.H9.k kVar3 = jVar2.h;
        this.l = kVar3;
        C0738a c0738a = new C0738a();
        ax.H9.k kVar4 = c0738a.i;
        this.s = kVar4;
        ax.H9.k kVar5 = jVar2.i;
        ax.I9.j jVar3 = new ax.I9.j();
        z(jVar2);
        z(jVar);
        z(jVar3);
        z(a);
        z(b);
        z(cVar);
        z(cVar2);
        z(gVar);
        z(c0738a);
        cVar2.i.r(c0738a.h);
        c0738a.j.r(gVar.j);
        jVar2.j.r(a.k);
        jVar.j.r(jVar3.h);
        jVar3.j.r(cVar.p);
        g(kVar2, "Amplitude");
        g(kVar3, "Frequency");
        g(kVar4, "Cutoff");
        A(kVar4, "Timbre");
        g(kVar5, "FreqScaler");
        g(kVar, "FilterEnvDepth");
        cVar2.A(this, "Filter");
        cVar.A(this, "Amp");
        kVar3.D(a.k);
        kVar5.C(0.2d, 1.0d, 4.0d);
        kVar4.D(gVar.j);
        kVar.C(-4000.0d, 2000.0d, 4000.0d);
        a.i.u(0.5d);
        cVar.z(this);
        jVar3.i.C(1.0d, 1.0d, 4.0d);
        A(jVar3.i, "Pressure");
        c(0);
    }

    private static void B(i.b bVar, ax.I9.c cVar, ax.Qa.c cVar2) {
        cVar.k.v(bVar.b(), cVar2);
        cVar.m.v(bVar.c(), cVar2);
        cVar.n.v(bVar.e(), cVar2);
        cVar.o.v(bVar.d(), cVar2);
    }

    private static double C(i.c cVar, double d) {
        return Math.pow(2.0d, (d + (cVar.h * 0.01d)) / 12.0d);
    }

    private void D() {
        this.p.k.u(0.1d);
        this.p.m.u(0.9d);
        this.p.n.u(0.1d);
        this.p.o.u(0.1d);
        this.q.k.u(0.01d);
        this.q.m.u(0.6d);
        this.q.n.u(0.4d);
        this.q.o.u(1.0d);
        this.o.y.u(1.0d);
        this.s.u(5000.0d);
        this.t.u(500.0d);
        this.x = null;
    }

    private i.c E(i.c cVar, int i, ax.Qa.c cVar2) {
        if (cVar == null || !cVar.c(i)) {
            int d = i.d(this.w);
            int i2 = d;
            cVar = i.b(d);
            while (!cVar.c(i) && !cVar.a()) {
                i2++;
                cVar = i.b(i2);
            }
        }
        int i3 = cVar.c;
        if (cVar.d()) {
            this.u = -1;
            this.v = 0;
        } else {
            if (i3 >= i.e()) {
                return null;
            }
            this.u = i.f(i3);
            this.v = i.g(i3);
        }
        i.a a = i.a(cVar.d);
        B(a.a, this.p, cVar2);
        B(a.b, this.q, cVar2);
        short s = a.h;
        if (s <= 0) {
            this.s.u(4000.0d);
            return cVar;
        }
        this.s.u(ax.Pa.a.b(s * 0.01d));
        return cVar;
    }

    @Override // ax.I9.y
    public void a(double d, double d2, ax.Qa.c cVar) {
        double a = ax.Pa.a.a(d);
        i.c E = E(this.x, (int) (0.5d + a), cVar);
        this.x = E;
        if (E == null) {
            return;
        }
        i.c cVar2 = (i.c) C0968a.e(E);
        this.l.v(C(cVar2, a) * 22050.0d, cVar);
        this.k.v(d2 * d2 * cVar2.i * 3.0517578125E-5d * 10.0d, cVar);
        this.p.h.K(cVar);
        this.q.h.K(cVar);
        this.m.j.i();
        this.n.j.i();
        if (cVar2.d()) {
            this.n.j.r(this.r.h);
            return;
        }
        this.m.j.r(this.r.h);
        this.m.h.o(cVar);
        if (!cVar2.b()) {
            this.m.h.y(this.j, this.u, this.v, cVar);
            return;
        }
        int i = this.u;
        int i2 = cVar2.a + i;
        int i3 = (cVar2.b + i) - i2;
        if (i2 > i) {
            this.m.h.y(this.j, i, i2 - i, cVar);
        }
        this.m.h.A(this.j, i2, i3, cVar);
    }

    @Override // ax.I9.w
    public l b() {
        return this.p.i;
    }

    @Override // ax.I9.y
    public void c(int i) {
        if (this.w == i) {
            return;
        }
        D();
        this.w = i;
        if (i == 0) {
            this.p.k.u(0.1d);
            this.p.m.u(0.9d);
            this.p.n.u(0.1d);
            this.p.o.u(0.1d);
            this.s.u(300.0d);
            this.t.u(500.0d);
            this.o.y.u(3.0d);
        }
    }

    @Override // ax.I9.y
    public void e(ax.Qa.c cVar) {
        if (this.x == null) {
            return;
        }
        this.p.h.J(cVar);
        this.q.h.J(cVar);
        i.c cVar2 = (i.c) C0968a.e(this.x);
        if (cVar2.d() && cVar2.b()) {
            int i = cVar2.b;
            int i2 = i + 1;
            int i3 = this.v;
            if (i2 < i3) {
                int i4 = this.u + i;
                this.m.h.y(this.j, i4, i3 - i4, cVar);
            }
        }
    }
}
