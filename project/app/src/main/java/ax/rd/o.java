/*
 * Decompiled with CFR 0.152.
 */
package ax.rd;

import ax.Wc.A0;
import ax.Wc.g;
import ax.Wc.h;
import ax.Wc.k0;
import ax.Wc.q;
import ax.Wc.x0;
import ax.pd.c;
import ax.rd.a;
import ax.rd.e;
import ax.rd.f;
import ax.rd.l;
import ax.rd.m;
import ax.rd.n;

public class o {
    A0 a = new A0(true, 0, new q(2L));
    q b;
    a c;
    c d;
    n e;
    n f;
    c g;
    l h;
    f i;
    private boolean j;
    private k0 k;
    private k0 l;

    /*
     * Enabled aggressive block sorting
     */
    public m a() {
        if (this.b != null && this.c != null && this.d != null && this.e != null && this.f != null && (this.g != null || this.j) && this.h != null) {
            h h8 = new h(10);
            h8.a(this.a);
            h8.a(this.b);
            h8.a(this.c);
            h8.a(this.d);
            Object object = new h(2);
            ((h)object).a(this.e);
            ((h)object).a(this.f);
            h8.a(new x0((h)object));
            object = this.g;
            if (object == null) {
                object = new x0();
            }
            h8.a((g)object);
            h8.a(this.h);
            object = this.k;
            if (object != null) {
                h8.a(new A0(false, 1, (g)object));
            }
            if ((object = this.l) != null) {
                h8.a(new A0(false, 2, (g)object));
            }
            if ((object = this.i) != null) {
                h8.a(new A0(true, 3, (g)object));
            }
            return m.s(new x0(h8));
        }
        throw new IllegalStateException("not all mandatory fields set in V3 TBScertificate generator");
    }

    public void b(n n8) {
        this.f = n8;
    }

    public void c(f t8) {
        this.i = t8;
        if (t8 != null && (t8 = ((f)t8).r(ax.rd.e.i0)) != null && ((e)t8).u()) {
            this.j = true;
        }
    }

    public void d(c c8) {
        this.d = c8;
    }

    public void e(q q8) {
        this.b = q8;
    }

    public void f(a a8) {
        this.c = a8;
    }

    public void g(n n8) {
        this.e = n8;
    }

    public void h(c c8) {
        this.g = c8;
    }

    public void i(l l8) {
        this.h = l8;
    }
}

