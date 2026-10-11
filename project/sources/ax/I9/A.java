package ax.I9;

/* loaded from: classes3.dex */
public class A extends z {
    private double l;
    private double m;
    private double n;
    private double o;
    private double p;
    private boolean q;
    private boolean r;

    public A() {
        ax.H9.l lVar = new ax.H9.l("Output");
        this.j = lVar;
        f(lVar);
        this.q = true;
        this.m = 1.0d;
    }

    private double z() {
        this.h.s();
        if (this.h.v()) {
            this.q = false;
            this.p = this.h.B(m());
            return m() * this.h.u();
        }
        this.q = true;
        this.r = true;
        this.l = 0.0d;
        return 0.0d;
    }

    @Override // ax.I9.u
    public void k(int i, int i2) {
        double[] l = this.i.l();
        double[] l2 = this.k.l();
        double[] l3 = this.j.l();
        while (i < i2) {
            if (this.l >= 1.0d) {
                while (true) {
                    double d = this.l;
                    if (d >= 1.0d) {
                        this.n = this.p;
                        this.l = d - 1.0d;
                        this.m = z();
                    }
                }
            } else if (i == 0 && (this.q || !this.h.w())) {
                double d2 = this.o;
                this.p = d2;
                this.n = d2;
                this.l = 0.0d;
                this.m = z();
            }
            double d3 = this.p;
            double d4 = this.n;
            double d5 = this.l;
            double d6 = ((d3 - d4) * d5) + d4;
            this.o = d6;
            l3[i] = d6 * l[i];
            this.l = d5 + A(this.m * l2[i]);
            i++;
        }
        if (this.r) {
            this.r = false;
            if (this.h.E()) {
                h();
            }
        }
    }

    public double A(double d) {
        return d;
    }
}
