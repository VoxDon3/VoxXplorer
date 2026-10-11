package ax.I9;

/* loaded from: classes3.dex */
public abstract class e extends p {
    public ax.H9.k k;
    protected double l;
    protected double m;
    protected double n;
    protected double o;
    protected double p;
    private double q;
    private double r;
    private double s;
    private double t;
    protected double u;
    protected double v;
    protected double w;
    protected double x;

    public e() {
        ax.H9.k kVar = new ax.H9.k("Amplitude", 1.0d);
        this.k = kVar;
        f(kVar);
    }

    protected abstract void A();

    @Override // ax.I9.u
    public void k(int i, int i2) {
        A();
        z(i, i2);
    }

    public void z(int i, int i2) {
        double[] l = this.h.l();
        double[] l2 = this.k.l();
        double[] l3 = this.i.l();
        double d = this.q;
        double d2 = this.r;
        double d3 = this.s;
        double d4 = this.t;
        double d5 = this.l;
        double d6 = this.m;
        double d7 = this.n;
        double d8 = this.o;
        double d9 = this.p;
        double d10 = d4;
        double d11 = d3;
        double d12 = d2;
        double d13 = d;
        int i3 = i;
        while (i3 < i2) {
            double d14 = l[i3];
            d10 = ((((d5 * d14) + (d6 * d13)) + (d12 * d7)) - (d8 * d11)) - (d10 * d9);
            l3[i3] = l2[i3] * d10;
            int i4 = i3 + 1;
            double d15 = l[i4];
            d11 = ((((d5 * d15) + (d6 * d14)) + (d13 * d7)) - (d8 * d10)) - (d11 * d9);
            l3[i4] = l2[i4] * d11;
            i3 += 2;
            d12 = d14;
            d13 = d15;
        }
        this.q = d13;
        this.r = d12;
        this.s = d11 + 1.0E-26d;
        this.t = d10 - 1.0E-26d;
    }
}
