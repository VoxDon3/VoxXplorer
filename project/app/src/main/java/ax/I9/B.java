/*
 * Decompiled with CFR 0.152.
 */
package ax.I9;

import ax.H9.g;
import ax.H9.k;
import ax.H9.l;
import ax.I9.u;
import ax.I9.w;
import ax.J9.d;

public class B
extends u
implements w {
    private d h = new d();
    public k i;
    public l j;

    public B() {
        g g8;
        this.i = g8 = new k("Amplitude", 1.0);
        this.f(g8);
        g8 = new l("Output");
        this.j = g8;
        this.f(g8);
    }

    @Override
    public void k(int n8, int n9) {
        double[] dArray = this.i.l();
        double[] dArray2 = this.j.l();
        while (n8 < n9) {
            dArray2[n8] = this.h.a() * dArray[n8];
            ++n8;
        }
    }
}

