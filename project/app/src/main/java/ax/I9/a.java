/*
 * Decompiled with CFR 0.152.
 */
package ax.I9;

import ax.I9.r;

public class a
extends r {
    @Override
    public void k(int n8, int n9) {
        double[] dArray = this.h.l();
        double[] dArray2 = this.i.l();
        double[] dArray3 = this.j.l();
        while (n8 < n9) {
            dArray3[n8] = dArray[n8] + dArray2[n8];
            ++n8;
        }
    }
}

