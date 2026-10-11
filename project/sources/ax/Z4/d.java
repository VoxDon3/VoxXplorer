package ax.Z4;

import ax.T4.k;
import ax.T4.l;

/* loaded from: classes.dex */
public final class d extends l {
    protected final d d;
    protected b e;
    protected d f;
    protected String g;
    protected Object h;
    protected int i;
    protected int j;

    public d(d dVar, int i, b bVar, int i2, int i3, int i4) {
        this.d = dVar;
        this.e = bVar;
        this.a = i2;
        this.i = i3;
        this.j = i4;
        this.b = -1;
        this.c = i;
    }

    private void i(b bVar, String str) throws k {
        if (bVar.c(str)) {
            Object b = bVar.b();
            throw new ax.T4.i(b instanceof ax.T4.j ? (ax.T4.j) b : null, "Duplicate field '" + str + "'");
        }
    }

    public static d m(b bVar) {
        return new d(null, 0, bVar, 0, 1, 0);
    }

    @Override // ax.T4.l
    public String b() {
        return this.g;
    }

    public d j() {
        this.h = null;
        return this.d;
    }

    public d k(int i, int i2) {
        d dVar = this.f;
        if (dVar != null) {
            dVar.p(1, i, i2);
            return dVar;
        }
        int i3 = this.c + 1;
        b bVar = this.e;
        d dVar2 = new d(this, i3, bVar == null ? null : bVar.a(), 1, i, i2);
        this.f = dVar2;
        return dVar2;
    }

    public d l(int i, int i2) {
        d dVar = this.f;
        if (dVar != null) {
            dVar.p(2, i, i2);
            return dVar;
        }
        int i3 = this.c + 1;
        b bVar = this.e;
        d dVar2 = new d(this, i3, bVar == null ? null : bVar.a(), 2, i, i2);
        this.f = dVar2;
        return dVar2;
    }

    public boolean n() {
        int i = this.b + 1;
        this.b = i;
        return this.a != 0 && i > 0;
    }

    public d o() {
        return this.d;
    }

    public void p(int i, int i2, int i3) {
        this.a = i;
        this.b = -1;
        this.i = i2;
        this.j = i3;
        this.g = null;
        this.h = null;
        b bVar = this.e;
        if (bVar != null) {
            bVar.d();
        }
    }

    public void q(String str) throws k {
        this.g = str;
        b bVar = this.e;
        if (bVar != null) {
            i(bVar, str);
        }
    }

    public ax.T4.h r(ax.W4.d dVar) {
        return new ax.T4.h(dVar, -1L, this.i, this.j);
    }
}
