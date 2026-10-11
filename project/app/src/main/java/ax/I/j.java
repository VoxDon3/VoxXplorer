/*
 * Decompiled with CFR 0.152.
 */
package ax.I;

import ax.H.e;
import ax.H.h;
import ax.I.d;
import ax.I.f;
import ax.I.p;

class j
extends p {
    public j(e e8) {
        super(e8);
        e8.e.f();
        e8.f.f();
        this.f = ((h)e8).s1();
    }

    private void q(f f8) {
        this.h.k.add(f8);
        f8.l.add(this.h);
    }

    @Override
    public void a(d object) {
        object = this.h;
        if (!((f)object).c || ((f)object).j) {
            return;
        }
        f f8 = ((f)object).l.get(0);
        object = (h)this.b;
        int n8 = (int)((float)f8.g * ((h)object).v1() + 0.5f);
        this.h.d(n8);
    }

    @Override
    void d() {
        Object object = (h)this.b;
        int n8 = ((h)object).t1();
        int n9 = ((h)object).u1();
        ((h)object).v1();
        if (((h)object).s1() == 1) {
            if (n8 != -1) {
                this.h.l.add(this.b.a0.e.h);
                this.b.a0.e.h.k.add(this.h);
                this.h.f = n8;
            } else if (n9 != -1) {
                this.h.l.add(this.b.a0.e.i);
                this.b.a0.e.i.k.add(this.h);
                this.h.f = -n9;
            } else {
                object = this.h;
                ((f)object).b = true;
                ((f)object).l.add(this.b.a0.e.i);
                this.b.a0.e.i.k.add(this.h);
            }
            this.q(this.b.e.h);
            this.q(this.b.e.i);
            return;
        }
        if (n8 != -1) {
            this.h.l.add(this.b.a0.f.h);
            this.b.a0.f.h.k.add(this.h);
            this.h.f = n8;
        } else if (n9 != -1) {
            this.h.l.add(this.b.a0.f.i);
            this.b.a0.f.i.k.add(this.h);
            this.h.f = -n9;
        } else {
            object = this.h;
            ((f)object).b = true;
            ((f)object).l.add(this.b.a0.f.i);
            this.b.a0.f.i.k.add(this.h);
        }
        this.q(this.b.f.h);
        this.q(this.b.f.i);
    }

    @Override
    public void e() {
        if (((h)this.b).s1() == 1) {
            this.b.m1(this.h.g);
            return;
        }
        this.b.n1(this.h.g);
    }

    @Override
    void f() {
        this.h.c();
    }

    @Override
    boolean m() {
        return false;
    }
}

