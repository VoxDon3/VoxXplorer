package ax.H9;

/* loaded from: classes3.dex */
public class b extends c {
    private double[] d;
    private double e;
    private k f;

    b(k kVar, double d) {
        super(kVar, d);
        this.d = new double[8];
        this.f = kVar;
    }

    @Override // ax.H9.c
    public double n() {
        return this.e;
    }

    @Override // ax.H9.c
    public double[] o() {
        double[] o;
        int i;
        double[] dArr;
        int l = l();
        if (l == 0) {
            dArr = super.o();
        } else {
            if (this.f.t()) {
                o = super.o();
                i = 0;
            } else {
                o = k(0).o();
                i = 1;
            }
            int i2 = 0;
            while (true) {
                double[] dArr2 = this.d;
                if (i2 >= dArr2.length) {
                    break;
                }
                dArr2[i2] = o[i2];
                i2++;
            }
            while (i < l) {
                double[] o2 = k(i).o();
                int i3 = 0;
                while (true) {
                    double[] dArr3 = this.d;
                    if (i3 < dArr3.length) {
                        dArr3[i3] = dArr3[i3] + o2[i3];
                        i3++;
                    }
                }
                i++;
            }
            dArr = this.d;
        }
        this.e = dArr[0];
        return dArr;
    }

    @Override // ax.H9.c
    protected void q(double d) {
        this.e = d;
        super.q(d);
    }
}
