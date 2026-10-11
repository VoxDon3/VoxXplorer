package ax.H9;

/* loaded from: classes3.dex */
class f extends ax.B9.c {
    private ax.B9.b f;
    private int g;
    private ax.B9.b h;
    private int i;
    private int j;
    private double k;

    f() {
    }

    @Override // ax.B9.b
    public double a(int i) {
        int d = i / this.f.d();
        if (d >= this.j) {
            return this.h.a(i + this.i);
        }
        double d2 = d * this.k;
        return ((1.0d - d2) * this.f.a(this.g + i)) + (d2 * this.h.a(i + this.i));
    }

    @Override // ax.B9.b
    public double c(int i, double d) {
        return this.h.c(i, d);
    }

    @Override // ax.B9.b
    public int d() {
        return this.h.d();
    }

    public void e(ax.B9.b bVar, int i, int i2, ax.B9.b bVar2, int i3, int i4) {
        if (bVar instanceof f) {
            f fVar = (f) bVar;
            if (i >= fVar.j) {
                bVar = fVar.h;
                i += fVar.i / bVar.d();
            }
        }
        if (bVar2 instanceof f) {
            f fVar2 = (f) bVar2;
            ax.B9.b bVar3 = fVar2.h;
            i3 += fVar2.i / bVar3.d();
            bVar2 = bVar3;
        }
        this.f = bVar;
        this.h = bVar2;
        this.g = i * bVar.d();
        this.j = i2;
        this.i = i3 * bVar2.d();
        this.k = i2 != 0 ? 1.0d / i2 : 1.0d;
        this.a = i4;
    }
}
