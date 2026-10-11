/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.P;
import ax.pb.s;

class v0
extends P {
    private int d1;
    private int e1;
    private long f1;
    private long g1;

    v0(int n8, int n9, long l8, long l9) {
        this.d1 = n8;
        this.e1 = n9;
        this.f1 = l8;
        this.g1 = l9;
        this.d0 = (byte)50;
        this.Y0 = (byte)8;
        this.T0 = 6;
        this.U0 = 0;
        this.V0 = 0;
    }

    @Override
    int F(byte[] byArray, int n8) {
        s.C(this.f1, byArray, n8);
        s.y(0L, byArray, n8 + 8);
        s.C(this.g1, byArray, n8 + 16);
        s.y(0L, byArray, n8 + 24);
        s.w(this.e1 | 0x80, byArray, n8 + 32);
        s.y(0L, byArray, n8 + 34);
        return n8 + 40 - n8;
    }

    @Override
    int G(byte[] byArray, int n8) {
        s.w(this.d1, byArray, n8);
        s.w(257L, byArray, n8 + 2);
        s.w(0L, byArray, n8 + 4);
        return n8 + 6 - n8;
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
        stringBuilder.append("Trans2SetFileInformation[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",fid=");
        stringBuilder.append(this.d1);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }
}

