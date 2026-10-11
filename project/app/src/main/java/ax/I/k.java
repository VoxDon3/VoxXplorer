/*
 * Decompiled with CFR 0.152.
 */
package ax.I;

import ax.H.a;
import ax.H.e;
import ax.H.j;
import ax.I.d;
import ax.I.f;
import ax.I.p;

class k
extends p {
    public k(e e8) {
        super(e8);
    }

    private void q(f f8) {
        this.h.k.add(f8);
        f8.l.add(this.h);
    }

    @Override
    public void a(d object) {
        a a8 = (a)this.b;
        int n8 = a8.v1();
        object = this.h.l.iterator();
        int n9 = 0;
        int n10 = -1;
        while (object.hasNext()) {
            int n11;
            int n12;
            block6: {
                block5: {
                    n12 = ((f)object.next()).g;
                    if (n10 == -1) break block5;
                    n11 = n10;
                    if (n12 >= n10) break block6;
                }
                n11 = n12;
            }
            n10 = n11;
            if (n9 >= n12) continue;
            n9 = n12;
            n10 = n11;
        }
        if (n8 != 0 && n8 != 2) {
            this.h.d(n9 + a8.w1());
            return;
        }
        this.h.d(n10 + a8.w1());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    void d() {
        int n8;
        e e8 = this.b;
        if (!(e8 instanceof a)) return;
        this.h.b = true;
        e8 = (a)e8;
        int n9 = ((a)e8).v1();
        boolean bl = ((a)e8).u1();
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        if (n9 != 0) {
            if (n9 != 1) {
                if (n9 != 2) {
                    if (n9 != 3) return;
                    this.h.e = f.a.h0;
                    for (n8 = n12; n8 < ((j)e8).M0; ++n8) {
                        Object object = ((j)e8).L0[n8];
                        if (!bl && ((e)object).V() == 8) continue;
                        object = ((e)object).f.i;
                        ((f)object).k.add(this.h);
                        this.h.l.add((f)object);
                    }
                    this.q(this.b.f.h);
                    this.q(this.b.f.i);
                    return;
                }
                this.h.e = f.a.g0;
                for (n8 = 0; n8 < ((j)e8).M0; ++n8) {
                    Object object = ((j)e8).L0[n8];
                    if (!bl && ((e)object).V() == 8) continue;
                    object = ((e)object).f.h;
                    ((f)object).k.add(this.h);
                    this.h.l.add((f)object);
                }
                this.q(this.b.f.h);
                this.q(this.b.f.i);
                return;
            }
            this.h.e = f.a.f0;
            for (n8 = n10; n8 < ((j)e8).M0; ++n8) {
                Object object = ((j)e8).L0[n8];
                if (!bl && ((e)object).V() == 8) continue;
                object = ((e)object).e.i;
                ((f)object).k.add(this.h);
                this.h.l.add((f)object);
            }
            this.q(this.b.e.h);
            this.q(this.b.e.i);
            return;
        }
        this.h.e = f.a.e0;
        for (n8 = n11; n8 < ((j)e8).M0; ++n8) {
            Object object = ((j)e8).L0[n8];
            if (!bl && ((e)object).V() == 8) continue;
            object = ((e)object).e.h;
            ((f)object).k.add(this.h);
            this.h.l.add((f)object);
        }
        this.q(this.b.e.h);
        this.q(this.b.e.i);
    }

    @Override
    public void e() {
        e e8 = this.b;
        if (e8 instanceof a) {
            int n8 = ((a)e8).v1();
            if (n8 != 0 && n8 != 1) {
                this.b.n1(this.h.g);
                return;
            }
            this.b.m1(this.h.g);
        }
    }

    @Override
    void f() {
        this.c = null;
        this.h.c();
    }

    @Override
    boolean m() {
        return false;
    }
}

