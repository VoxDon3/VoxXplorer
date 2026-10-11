/*
 * Decompiled with CFR 0.152.
 */
package ax.X0;

import ax.B9.d;
import ax.H9.k;
import ax.H9.l;
import ax.H9.m;
import ax.I9.A;
import ax.I9.B;
import ax.I9.b;
import ax.I9.j;
import ax.I9.y;
import ax.I9.z;
import ax.Pa.a;
import ax.Qa.c;
import ax.X0.i;

final class g
extends b
implements y {
    private final d j;
    private final k k;
    private final k l;
    private final z m;
    private final B n;
    private final ax.I9.g o;
    private final ax.I9.c p;
    private final ax.I9.c q;
    private final j r;
    private final k s;
    private final k t;
    private int u;
    private int v;
    private int w;
    private i.c x;

    public g(short[] object) {
        k k8;
        k k9;
        ax.I9.g g8;
        k k10;
        ax.I9.c c8;
        ax.I9.c c9;
        B b8;
        j j8;
        this.j = new d((short[])object);
        this.r = j8 = new j();
        A a8 = new A();
        this.m = a8;
        this.n = b8 = new B();
        this.p = c9 = new ax.I9.c();
        this.q = c8 = new ax.I9.c();
        this.t = k10 = c8.p;
        this.o = g8 = new ax.I9.g();
        this.k = k9 = j8.i;
        j j9 = new j();
        this.l = k8 = j9.h;
        ax.I9.a a9 = new ax.I9.a();
        object = a9.i;
        this.s = object;
        k k11 = j9.i;
        j j10 = new j();
        this.z(j9);
        this.z(j8);
        this.z(j10);
        this.z(a8);
        this.z(b8);
        this.z(c9);
        this.z(c8);
        this.z(g8);
        this.z(a9);
        c8.i.r(a9.h);
        a9.j.r(g8.j);
        j9.j.r(a8.k);
        j8.j.r(j10.h);
        j10.j.r(c9.p);
        this.g(k9, "Amplitude");
        this.g(k8, "Frequency");
        this.g((m)object, "Cutoff");
        this.A((m)object, "Timbre");
        this.g(k11, "FreqScaler");
        this.g(k10, "FilterEnvDepth");
        c8.A(this, "Filter");
        c9.A(this, "Amp");
        k8.D(a8.k);
        k11.C(0.2, 1.0, 4.0);
        ((k)object).D(g8.j);
        k10.C(-4000.0, 2000.0, 4000.0);
        a8.i.u(0.5);
        c9.z(this);
        j10.i.C(1.0, 1.0, 4.0);
        this.A(j10.i, "Pressure");
        this.c(0);
    }

    private static void B(i.b b8, ax.I9.c c8, c c9) {
        c8.k.v(b8.b(), c9);
        c8.m.v(b8.c(), c9);
        c8.n.v(b8.e(), c9);
        c8.o.v(b8.d(), c9);
    }

    private static double C(i.c c8, double d8) {
        return Math.pow(2.0, (d8 + (double)c8.h * 0.01) / 12.0);
    }

    private void D() {
        this.p.k.u(0.1);
        this.p.m.u(0.9);
        this.p.n.u(0.1);
        this.p.o.u(0.1);
        this.q.k.u(0.01);
        this.q.m.u(0.6);
        this.q.n.u(0.4);
        this.q.o.u(1.0);
        this.o.y.u(1.0);
        this.s.u(5000.0);
        this.t.u(500.0);
        this.x = null;
    }

    private i.c E(i.c object, int n8, c c8) {
        i.c c9;
        block9: {
            block8: {
                if (object == null) break block8;
                c9 = object;
                if (((i.c)object).c(n8)) break block9;
            }
            int n9 = i.d(this.w);
            object = i.b(n9);
            while (true) {
                c9 = object;
                if (((i.c)object).c(n8)) break;
                c9 = object;
                if (((i.c)object).a()) break;
                object = i.b(++n9);
            }
        }
        n8 = c9.c;
        if (c9.d()) {
            this.u = -1;
            this.v = 0;
        } else {
            if (n8 >= i.e()) {
                return null;
            }
            this.u = i.f(n8);
            this.v = i.g(n8);
        }
        object = i.a(c9.d);
        g.B(((i.a)object).a, this.p, c8);
        g.B(((i.a)object).b, this.q, c8);
        n8 = ((i.a)object).h;
        if (n8 > 0) {
            double d8 = ax.Pa.a.b((double)n8 * 0.01);
            this.s.u(d8);
            return c9;
        }
        this.s.u(4000.0);
        return c9;
    }

    @Override
    public void a(double d8, double d9, c c8) {
        i.c c9;
        d8 = ax.Pa.a.a(d8);
        this.x = c9 = this.E(this.x, (int)(0.5 + d8), c8);
        if (c9 == null) {
            return;
        }
        c9 = ax.S0.a.e(c9);
        double d10 = g.C(c9, d8);
        d8 = c9.i;
        this.l.v(d10 * 22050.0, c8);
        this.k.v(d9 * d9 * (d8 * 3.0517578125E-5) * 10.0, c8);
        this.p.h.K(c8);
        this.q.h.K(c8);
        this.m.j.i();
        this.n.j.i();
        if (c9.d()) {
            this.n.j.r(this.r.h);
            return;
        }
        this.m.j.r(this.r.h);
        this.m.h.o(c8);
        if (c9.b()) {
            int n8 = this.u;
            int n9 = c9.a + n8;
            int n10 = c9.b;
            if (n9 > n8) {
                this.m.h.y(this.j, n8, n9 - n8, c8);
            }
            this.m.h.A(this.j, n9, n10 + n8 - n9, c8);
            return;
        }
        this.m.h.y(this.j, this.u, this.v, c8);
    }

    @Override
    public l b() {
        return this.p.i;
    }

    @Override
    public void c(int n8) {
        if (this.w != n8) {
            this.D();
            this.w = n8;
            if (n8 == 0) {
                this.p.k.u(0.1);
                this.p.m.u(0.9);
                this.p.n.u(0.1);
                this.p.o.u(0.1);
                this.s.u(300.0);
                this.t.u(500.0);
                this.o.y.u(3.0);
            }
        }
    }

    @Override
    public void e(c c8) {
        if (this.x != null) {
            int n8;
            int n9;
            this.p.h.J(c8);
            this.q.h.J(c8);
            i.c c9 = ax.S0.a.e(this.x);
            if (c9.d() && c9.b() && (n9 = c9.b) + 1 < (n8 = this.v)) {
                n9 = this.u + n9;
                this.m.h.y(this.j, n9, n8 - n9, c8);
            }
        }
    }
}

