/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.P;
import ax.pb.s;
import ax.qb.d;

class t0
extends P {
    private int d1;

    t0(String string, int n8) {
        this.x0 = string;
        this.d1 = n8;
        this.d0 = (byte)50;
        this.Y0 = (byte)5;
        this.S0 = 0;
        this.T0 = 2;
        this.U0 = 40;
        this.V0 = 0;
    }

    @Override
    int F(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    int G(byte[] byArray, int n8) {
        s.w(this.d1, byArray, n8);
        byArray[n8 + 2] = 0;
        byArray[n8 + 3] = 0;
        byArray[n8 + 4] = 0;
        int n9 = n8 + 6;
        byArray[n8 + 5] = 0;
        return n9 + this.A(this.x0, byArray, n9) - n8;
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
        stringBuilder.append("Trans2QueryPathInformation[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",informationLevel=0x");
        stringBuilder.append(d.c(this.d1, 3));
        stringBuilder.append(",filename=");
        stringBuilder.append(this.x0);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }
}

