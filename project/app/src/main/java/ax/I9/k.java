/*
 * Decompiled with CFR 0.152.
 */
package ax.I9;

import ax.H9.g;
import ax.H9.l;
import ax.I9.u;

public class k
extends u {
    public ax.H9.k h;
    public ax.H9.k i;
    public l j;

    public k() {
        g g8;
        this.h = g8 = new ax.H9.k("Input");
        this.f(g8);
        this.i = g8 = new ax.H9.k("Pan");
        this.f(g8);
        this.i.C(-1.0, 0.0, 1.0);
        g8 = new l(2, "Output");
        this.j = g8;
        this.f(g8);
    }

    @Override
    public void k(int n8, int n9) {
        double[] dArray = this.h.l();
        double[] dArray2 = this.i.l();
        double[] dArray3 = this.j.m(0);
        double[] dArray4 = this.j.m(1);
        while (n8 < n9) {
            double d8 = dArray2[n8] * 0.5 + 0.5;
            double d9 = dArray[n8];
            dArray3[n8] = (1.0 - d8) * d9;
            dArray4[n8] = d9 * d8;
            ++n8;
        }
    }
}

