package ax.I9;

/* loaded from: classes3.dex */
public class h extends s {
    public ax.H9.k j;
    public ax.H9.n k;
    private double l;
    private double m;
    private double n;
    private double o = 0.0d;
    private double p = 1.0d;

    public h() {
        ax.H9.k kVar = new ax.H9.k("Time");
        this.j = kVar;
        f(kVar);
        ax.H9.n nVar = new ax.H9.n("Current");
        this.k = nVar;
        f(nVar);
    }

    @Override // ax.I9.u
    public void k(int i, int i2) {
        double[] l = this.i.l();
        double d = this.h.l()[0];
        double i3 = this.k.i();
        if (d != this.n) {
            this.l = i3;
            this.m = 0.0d;
            this.n = d;
        }
        if (i3 == this.n) {
            while (i < i2) {
                l[i] = i3;
                i++;
            }
        } else {
            double d2 = this.j.l()[0];
            if (d2 != this.o) {
                this.p = i(d2);
                this.o = d2;
            }
            while (i < i2) {
                double d3 = this.m;
                if (d3 < 1.0d) {
                    double d4 = this.l;
                    double d5 = d4 + ((this.n - d4) * d3);
                    this.m = d3 + this.p;
                    i3 = d5;
                } else {
                    i3 = this.n;
                }
                l[i] = i3;
                i++;
            }
        }
        this.k.j(i3);
    }
}
