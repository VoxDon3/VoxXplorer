package ax.H9;

import java.util.LinkedList;

/* loaded from: classes3.dex */
public class i extends m {
    private final LinkedList<b> c;
    private d d;
    private int e;
    private int f;
    private double g;
    private long h;
    private boolean i;
    private boolean j;
    private d k;
    private d l;

    class a implements ax.Qa.a {
        a() {
        }

        @Override // ax.Qa.a
        public void run() {
            i.this.p();
        }
    }

    private class b extends d {
        public b(ax.B9.b bVar, int i, int i2) {
            super(i.this, bVar, i, i2);
        }

        @Override // ax.Qa.a
        public void run() {
            synchronized (i.this.c) {
                try {
                    if (i.this.c.size() > 0 && ((e) i.this.c.getLast()).g()) {
                        i.this.c.removeLast();
                    }
                    if (a() > 0) {
                        if (!f()) {
                            d t = i.this.t();
                            if (t != null) {
                                i.this.D(t, t.d() + t.b(), this);
                            }
                        } else if (i.this.d != null) {
                            i iVar = i.this;
                            iVar.D(iVar.d, i.this.e, this);
                        }
                    }
                    if (f()) {
                        i.this.p();
                    }
                    i.this.c.add(this);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public i(String str) {
        super(str);
        this.c = new LinkedList<>();
        this.f = 1;
    }

    private void l() {
        int i = this.e + 1;
        this.e = i;
        this.h++;
        if (i >= this.d.d() + this.d.b()) {
            d dVar = this.d;
            int i2 = dVar.f0;
            if (i2 > 0) {
                dVar.f0 = i2 - 1;
                x();
            } else {
                if (this.c.size() == 0 && this.d.f0 < 0) {
                    x();
                    return;
                }
                if (this.d.e()) {
                    this.i = true;
                }
                this.k = this.d;
                C(null);
            }
        }
    }

    private void n() {
        if (this.d == null) {
            synchronized (this.c) {
                C(this.c.remove());
                this.e = this.d.d();
                d dVar = this.d;
                dVar.f0 = dVar.c();
                this.d.h();
            }
        }
    }

    private void x() {
        if (this.d.a() > 0) {
            d dVar = this.d;
            D(dVar, this.e, dVar);
        }
        this.e = this.d.d();
        this.l = this.d;
    }

    public void A(ax.B9.b bVar, int i, int i2, ax.Qa.c cVar) {
        z(bVar, i, i2, -1, cVar);
    }

    public double B(double d) {
        m(d);
        double a2 = this.d.l0.a(this.e);
        r();
        return a2;
    }

    public void C(d dVar) {
        this.d = dVar;
    }

    protected void D(d dVar, int i, d dVar2) {
        int a2 = dVar2.a();
        ax.B9.b i2 = dVar.i();
        ax.B9.b i3 = dVar2.i();
        int b2 = i2.b() - i;
        int i4 = a2 > b2 ? b2 : a2;
        if (i4 > 0) {
            dVar2.k0.e(i2, i, i4, i3, dVar2.d(), i3.b() - dVar2.d());
            dVar2.l0 = dVar2.k0;
            dVar2.c0 = 0;
        }
    }

    public boolean E() {
        boolean z = this.i;
        this.i = false;
        return z;
    }

    public void m(double d) {
        n();
        this.g = this.d.l0.c(this.e, d);
    }

    public void o(ax.Qa.c cVar) {
        f(cVar, new a());
    }

    protected void p() {
        synchronized (this.c) {
            this.c.clear();
            C(null);
            this.j = false;
            this.i = false;
        }
    }

    public d q(ax.B9.b bVar, int i, int i2) {
        if (bVar.d() == this.f) {
            return new b(bVar, i, i2);
        }
        throw new ax.E9.a("Tried to queue " + bVar.d() + " channel data to a " + this.f + " channel port.");
    }

    public void r() {
        l();
        this.j = true;
    }

    public void s() {
        d dVar = this.l;
        if (dVar != null) {
            dVar.h();
            this.l = null;
        }
        d dVar2 = this.k;
        if (dVar2 != null) {
            dVar2.h();
            this.k = null;
        }
    }

    public d t() {
        if (this.c.size() > 0) {
            return this.c.getLast();
        }
        d dVar = this.d;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }

    public double u() {
        return this.g;
    }

    public boolean v() {
        return this.d != null || this.c.size() > 0;
    }

    public boolean w() {
        return this.j;
    }

    public void y(ax.B9.b bVar, int i, int i2, ax.Qa.c cVar) {
        f(cVar, q(bVar, i, i2));
    }

    public void z(ax.B9.b bVar, int i, int i2, int i3, ax.Qa.c cVar) {
        d q = q(bVar, i, i2);
        q.j(i3);
        f(cVar, q);
    }
}
