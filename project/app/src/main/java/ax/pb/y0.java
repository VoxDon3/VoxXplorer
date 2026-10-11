/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.F0;
import ax.pb.Q;
import ax.pb.g0;

class y0
extends Q {
    private g0 Y0;

    y0(g0 g02) {
        this.Y0 = g02;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    int E(byte[] byArray, int n8, int n9) {
        Object object = this.Y0.E0;
        if (object != null) {
            F0 f02 = (F0)object;
            object = f02.m0;
            synchronized (object) {
                f02.c(byArray, n8, n9);
                f02.m0.notify();
                return n9;
            }
        }
        return n9;
    }

    @Override
    int F(byte[] byArray, int n8, int n9) {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TransCallNamedPipeResponse[");
        stringBuilder.append(super.toString());
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }
}

