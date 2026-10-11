/*
 * Decompiled with CFR 0.152.
 */
package ax.I9;

import ax.F9.b;
import ax.H9.k;
import ax.I9.x;
import java.io.IOException;

public class o
extends x {
    public o() {
        k k8;
        this.i = k8 = new k(2, "Input");
        this.f(k8);
    }

    @Override
    public void k(int n8, int n9) {
        double[] dArray = this.i.m(0);
        double[] dArray2 = this.i.m(1);
        b b8 = this.h;
        if (b8 != null) {
            while (n8 < n9) {
                try {
                    b8.b(dArray[n8]);
                    b8.b(dArray2[n8]);
                    ++n8;
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                    break;
                }
            }
        }
    }
}

