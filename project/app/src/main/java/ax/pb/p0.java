/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.P;
import ax.pb.s;

class p0
extends P {
    private int d1 = 3;

    p0(String string) {
        this.x0 = string;
        this.d0 = (byte)50;
        this.Y0 = (byte)16;
        this.S0 = 0;
        this.T0 = 0;
        this.U0 = 4096;
        this.V0 = 0;
    }

    @Override
    int F(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    int G(byte[] byArray, int n8) {
        s.w(this.d1, byArray, n8);
        int n9 = n8 + 2;
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
        stringBuilder.append("Trans2GetDfsReferral[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",maxReferralLevel=0x");
        stringBuilder.append(this.d1);
        stringBuilder.append(",filename=");
        stringBuilder.append(this.x0);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }
}

