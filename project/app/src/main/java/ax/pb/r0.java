/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.P;
import ax.pb.s;
import ax.qb.d;

class r0
extends P {
    private int d1;

    r0(int n8) {
        this.d0 = (byte)50;
        this.Y0 = (byte)3;
        this.d1 = n8;
        this.R0 = 2;
        this.S0 = 0;
        this.T0 = 0;
        this.U0 = 800;
        this.V0 = 0;
    }

    @Override
    int F(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    int G(byte[] byArray, int n8) {
        s.w(this.d1, byArray, n8);
        return n8 + 2 - n8;
    }

    @Override
    int H(byte[] byArray, int n8) {
        byArray[n8] = this.Y0;
        byArray[n8 + 1] = 0;
        return 2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Trans2QueryFSInformation[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",informationLevel=0x");
        stringBuilder.append(d.c(this.d1, 3));
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }
}

