package ax.I9;

/* loaded from: classes3.dex */
public abstract class f extends e {
    protected double A;
    public ax.H9.k y;
    private double z;

    public f() {
        ax.H9.k kVar = new ax.H9.k("Q");
        this.y = kVar;
        f(kVar);
        this.y.C(0.1d, 1.0d, 10.0d);
    }

    @Override // ax.I9.e
    public void A() {
        double d = this.j.l()[0];
        double d2 = this.y.l()[0];
        if (d < 1.0E-5d) {
            d = 1.0E-5d;
        }
        if (d2 < 1.0E-5d) {
            d2 = 1.0E-5d;
        }
        if (C(d, d2)) {
            this.u = d;
            this.z = d2;
            B(d * m(), d2);
            D();
        }
    }

    public void B(double d, double d2) {
        if (d >= 0.499d) {
            d = 0.499d;
        }
        double d3 = d * 6.283185307179586d;
        this.v = d3;
        this.x = Math.cos(d3);
        double sin = Math.sin(this.v);
        this.w = sin;
        this.A = sin / (d2 * 2.0d);
    }

    protected boolean C(double d, double d2) {
        return (d == this.u && d2 == this.z) ? false : true;
    }

    public abstract void D();
}
