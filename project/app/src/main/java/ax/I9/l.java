/*
 * Decompiled with CFR 0.152.
 */
package ax.I9;

import ax.H9.g;
import ax.H9.k;
import ax.I9.u;

public class l
extends u {
    private static double[] l = new double[2050];
    public k h;
    public ax.H9.l i;
    private double j = 0.0;
    private double k = 1.0;

    static {
        for (int i8 = 0; i8 < l.length; ++i8) {
            double d8;
            ax.I9.l.l[i8] = d8 = Math.pow(2.0, (double)i8 / 2048.0);
        }
    }

    public l() {
        g g8;
        this.h = g8 = new k("Input");
        this.f(g8);
        this.h.C(-8.0, 0.0, 8.0);
        g8 = new ax.H9.l("Output");
        this.i = g8;
        this.f(g8);
    }

    public double A(double d8) {
        return d8;
    }

    @Override
    public void k(int n8, int n9) {
        double[] dArray = this.h.l();
        double[] dArray2 = this.i.l();
        for (int i8 = n8; i8 < n9; ++i8) {
            double d8 = dArray[i8];
            if (d8 == this.j) {
                dArray2[i8] = this.k;
                continue;
            }
            this.j = d8;
            d8 = this.z(d8);
            n8 = (int)Math.floor(d8);
            double d9 = (d8 - (double)n8) * 2048.0;
            int n10 = (int)d9;
            d8 = n10;
            double[] dArray3 = l;
            double d10 = dArray3[n10];
            d8 = d10 + (d9 - d8) * (dArray3[n10 + 1] - d10);
            while (true) {
                n10 = --n8;
                d9 = d8;
                if (n8 <= 0) break;
                d8 *= 2.0;
            }
            while (n10 < 0) {
                ++n10;
                d9 *= 0.5;
            }
            dArray2[i8] = d8 = this.A(d9);
            this.k = d8;
        }
    }

    public double z(double d8) {
        return d8;
    }
}

