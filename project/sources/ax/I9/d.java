package ax.I9;

/* loaded from: classes3.dex */
public class d extends s {
    public ax.H9.k j;
    public ax.H9.n k;
    private double l;
    private double m = 0.0d;
    private double n = 1.0d;
    private double o = 1.0E-5d;

    public d() {
        ax.H9.k kVar = new ax.H9.k("Time");
        this.j = kVar;
        f(kVar);
        this.h.C(this.o, 1.0d, 1.0d);
        ax.H9.n nVar = new ax.H9.n("Current", 1.0d);
        this.k = nVar;
        f(nVar);
    }

    private double z(double d, double d2, double d3) {
        return Math.pow(d3 / d2, 1.0d / (d * n()));
    }

    @Override // ax.I9.u
    public void k(int i, int i2) {
        double[] l = this.i.l();
        double d = this.h.l()[0];
        double d2 = this.j.l()[0];
        double i3 = this.k.i();
        double max = Math.max(this.o, d);
        double max2 = Math.max(this.o, i3);
        if (d2 != this.m) {
            this.n = z(d2, max2, max);
            this.m = d2;
        }
        if (max != this.l) {
            this.n = z(d2, max2, max);
            this.l = max;
        }
        double d3 = this.l;
        if (max2 < d3) {
            while (i < i2) {
                max2 *= this.n;
                double d4 = this.l;
                if (max2 > d4) {
                    this.n = 1.0d;
                    max2 = d4;
                }
                l[i] = max2;
                i++;
            }
        } else if (max2 > d3) {
            while (i < i2) {
                max2 *= this.n;
                double d5 = this.l;
                if (max2 < d5) {
                    this.n = 1.0d;
                    max2 = d5;
                }
                l[i] = max2;
                i++;
            }
        } else if (max2 == d3) {
            while (i < i2) {
                l[i] = this.l;
                i++;
            }
        }
        this.k.j(max2);
    }
}
