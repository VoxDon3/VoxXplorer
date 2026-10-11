/*
 * Decompiled with CFR 0.152.
 */
package ax.H9;

import ax.H9.d;
import ax.H9.e;
import ax.H9.m;
import ax.Qa.c;
import java.util.LinkedList;

public class i
extends m {
    private final LinkedList<b> c = new LinkedList();
    private d d;
    private int e;
    private int f = 1;
    private double g;
    private long h;
    private boolean i;
    private boolean j;
    private d k;
    private d l;

    public i(String string) {
        super(string);
    }

    private void l() {
        int n8;
        this.e = n8 = this.e + 1;
        ++this.h;
        if (n8 >= this.d.d() + this.d.b()) {
            d d8 = this.d;
            n8 = d8.f0;
            if (n8 > 0) {
                d8.f0 = n8 - 1;
                this.x();
                return;
            }
            if (this.c.size() == 0 && this.d.f0 < 0) {
                this.x();
                return;
            }
            if (this.d.e()) {
                this.i = true;
            }
            this.k = this.d;
            this.C(null);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void n() {
        if (this.d == null) {
            LinkedList<b> linkedList = this.c;
            synchronized (linkedList) {
                this.C(this.c.remove());
                this.e = this.d.d();
                d d8 = this.d;
                d8.f0 = d8.c();
                this.d.h();
                return;
            }
        }
    }

    private void x() {
        if (this.d.a() > 0) {
            d d8 = this.d;
            this.D(d8, this.e, d8);
        }
        this.e = this.d.d();
        this.l = this.d;
    }

    public void A(ax.B9.b b8, int n8, int n9, c c8) {
        this.z(b8, n8, n9, -1, c8);
    }

    public double B(double d8) {
        this.m(d8);
        d8 = this.d.l0.a(this.e);
        this.r();
        return d8;
    }

    public void C(d d8) {
        this.d = d8;
    }

    protected void D(d object, int n8, d d8) {
        int n9 = d8.a();
        object = ((d)object).i();
        ax.B9.b b8 = d8.i();
        int n10 = object.b() - n8;
        if (n9 > n10) {
            n9 = n10;
        }
        if (n9 > 0) {
            n10 = b8.b();
            int n11 = d8.d();
            d8.k0.e((ax.B9.b)object, n8, n9, b8, d8.d(), n10 - n11);
            d8.l0 = d8.k0;
            d8.c0 = 0;
        }
    }

    public boolean E() {
        boolean bl = this.i;
        this.i = false;
        return bl;
    }

    public void m(double d8) {
        this.n();
        this.g = this.d.l0.c(this.e, d8);
    }

    public void o(c c8) {
        this.f(c8, new a(this));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void p() {
        LinkedList<b> linkedList = this.c;
        synchronized (linkedList) {
            this.c.clear();
            this.C(null);
            this.j = false;
            this.i = false;
            return;
        }
    }

    public d q(ax.B9.b b8, int n8, int n9) {
        if (b8.d() == this.f) {
            return new b(this, b8, n8, n9);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Tried to queue ");
        stringBuilder.append(b8.d());
        stringBuilder.append(" channel data to a ");
        stringBuilder.append(this.f);
        stringBuilder.append(" channel port.");
        throw new ax.E9.a(stringBuilder.toString());
    }

    public void r() {
        this.l();
        this.j = true;
    }

    public void s() {
        d d8 = this.l;
        if (d8 != null) {
            d8.h();
            this.l = null;
        }
        if ((d8 = this.k) != null) {
            d8.h();
            this.k = null;
        }
    }

    public d t() {
        if (this.c.size() > 0) {
            return this.c.getLast();
        }
        d d8 = this.d;
        if (d8 != null) {
            return d8;
        }
        return null;
    }

    public double u() {
        return this.g;
    }

    public boolean v() {
        return this.d != null || this.c.size() > 0;
        {
        }
    }

    public boolean w() {
        return this.j;
    }

    public void y(ax.B9.b b8, int n8, int n9, c c8) {
        this.f(c8, this.q(b8, n8, n9));
    }

    public void z(ax.B9.b object, int n8, int n9, int n10, c c8) {
        object = this.q((ax.B9.b)object, n8, n9);
        ((d)object).j(n10);
        this.f(c8, (ax.Qa.a)object);
    }

    class a
    implements ax.Qa.a {
        final i q;

        a(i i8) {
            this.q = i8;
        }

        @Override
        public void run() {
            this.q.p();
        }
    }

    private class b
    extends d {
        final i m0;

        public b(i i8, ax.B9.b b8, int n8, int n9) {
            this.m0 = i8;
            super(i8, b8, n8, n9);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void run() {
            LinkedList linkedList = this.m0.c;
            synchronized (linkedList) {
                Throwable throwable2;
                block10: {
                    block9: {
                        try {
                            if (this.m0.c.size() <= 0 || !((e)this.m0.c.getLast()).g()) break block9;
                            this.m0.c.removeLast();
                        }
                        catch (Throwable throwable2) {
                            break block10;
                        }
                    }
                    if (this.a() > 0) {
                        if (this.f()) {
                            if (this.m0.d != null) {
                                i i8 = this.m0;
                                i8.D(i8.d, this.m0.e, this);
                            }
                        } else {
                            d d8 = this.m0.t();
                            if (d8 != null) {
                                this.m0.D(d8, d8.d() + d8.b(), this);
                            }
                        }
                    }
                    if (this.f()) {
                        this.m0.p();
                    }
                    this.m0.c.add(this);
                    return;
                }
                throw throwable2;
            }
        }
    }
}

