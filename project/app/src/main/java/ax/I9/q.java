/*
 * Decompiled with CFR 0.152.
 */
package ax.I9;

import ax.H9.g;
import ax.H9.k;
import ax.H9.l;
import ax.I9.u;

public class q
extends u {
    public k h;
    public k i;
    public l j;

    public q() {
        g g8;
        this.h = g8 = new k("InputA");
        this.f(g8);
        this.i = g8 = new k("InputB");
        this.f(g8);
        g8 = new l(2, "OutputB");
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
            dArray3[n8] = dArray[n8];
            dArray4[n8] = dArray2[n8];
            ++n8;
        }
    }
}

