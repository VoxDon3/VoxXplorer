package ax.I9;

/* loaded from: classes3.dex */
public class l extends u {
    private static double[] l = new double[2050];
    public ax.H9.k h;
    public ax.H9.l i;
    private double j = 0.0d;
    private double k = 1.0d;

    static {
        for (int i = 0; i < l.length; i++) {
            l[i] = Math.pow(2.0d, i / 2048.0d);
        }
    }

    public l() {
        ax.H9.k kVar = new ax.H9.k("Input");
        this.h = kVar;
        f(kVar);
        this.h.C(-8.0d, 0.0d, 8.0d);
        ax.H9.l lVar = new ax.H9.l("Output");
        this.i = lVar;
        f(lVar);
    }

    @Override // ax.I9.u
    public void k(int i, int i2) {
        double[] l2 = this.h.l();
        double[] l3 = this.i.l();
        while (i < i2) {
            double d = l2[i];
            if (d == this.j) {
                l3[i] = this.k;
            } else {
                this.j = d;
                double z = z(d);
                int floor = (int) Math.floor(z);
                double d2 = (z - floor) * 2048.0d;
                int i3 = (int) d2;
                double[] dArr = l;
                double d3 = dArr[i3];
                double d4 = d3 + ((d2 - i3) * (dArr[i3 + 1] - d3));
                while (floor > 0) {
                    floor--;
                    d4 *= 2.0d;
                }
                while (floor < 0) {
                    floor++;
                    d4 *= 0.5d;
                }
                double A = A(d4);
                l3[i] = A;
                this.k = A;
            }
            i++;
        }
    }

    public double A(double d) {
        return d;
    }

    public double z(double d) {
        return d;
    }
}
