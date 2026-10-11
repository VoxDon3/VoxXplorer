/*
 * Decompiled with CFR 0.152.
 */
package ax.H9;

import ax.H9.c;
import ax.H9.k;

public class b
extends c {
    private double[] d = new double[8];
    private double e;
    private k f;

    b(k k8, double d8) {
        super(k8, d8);
        this.f = k8;
    }

    @Override
    public double n() {
        return this.e;
    }

    @Override
    public double[] o() {
        double[] dArray;
        int n8 = this.l();
        if (n8 == 0) {
            dArray = super.o();
        } else {
            double[] dArray2;
            int n9;
            if (this.f.t()) {
                dArray = super.o();
                n9 = 0;
            } else {
                dArray = this.k(0).o();
                n9 = 1;
            }
            int n10 = 0;
            while (true) {
                dArray2 = this.d;
                if (n10 >= dArray2.length) break;
                dArray2[n10] = dArray[n10];
                ++n10;
            }
            for (int i8 = n9; i8 < n8; ++i8) {
                dArray = this.k(i8).o();
                for (n9 = 0; n9 < (dArray2 = this.d).length; ++n9) {
                    dArray2[n9] = dArray2[n9] + dArray[n9];
                }
            }
            dArray = this.d;
        }
        this.e = dArray[0];
        return dArray;
    }

    @Override
    protected void q(double d8) {
        this.e = d8;
        super.q(d8);
    }
}

