/*
 * Decompiled with CFR 0.152.
 */
package ax.I9;

import ax.F9.b;
import ax.H9.k;
import ax.I9.x;
import java.io.IOException;

public class i
extends x {
    public i() {
        k k8;
        this.i = k8 = new k("Input");
        this.f(k8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void k(int n8, int n9) {
        double[] dArray = this.i.l();
        b b8 = this.h;
        if (b8 == null) return;
        try {
            b8.a(dArray, n8, n9 - n8);
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }
}

