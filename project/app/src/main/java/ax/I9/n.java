/*
 * Decompiled with CFR 0.152.
 */
package ax.I9;

import ax.I9.v;

public class n
extends v {
    public static double A(double d8) {
        double d9;
        if (d8 > 0.5) {
            d9 = 1.0 - d8;
        } else {
            d9 = d8;
            if (d8 < -0.5) {
                d9 = -1.0 - d8;
            }
        }
        d8 = d9 * Math.PI;
        d9 = d8 * d8;
        return d8 * (d9 * ((((-2.505210838544172E-8 * d9 + 2.7557319223985893E-6) * d9 - 1.984126984126984E-4) * d9 + 0.008333333333333333) * d9 - 0.16666666666666666) + 1.0);
    }

    @Override
    public void k(int n8, int n9) {
        double[] dArray = this.h.l();
        double[] dArray2 = this.i.l();
        double[] dArray3 = this.k.l();
        double d8 = this.j.i();
        while (n8 < n9) {
            d8 = this.s(d8, this.z(dArray[n8]));
            dArray3[n8] = n.A(d8) * dArray2[n8];
            ++n8;
        }
        this.j.j(d8);
    }
}

