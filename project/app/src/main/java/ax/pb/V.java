/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.s;

class V
extends s {
    private int C0;
    private int D0;
    private int E0;
    private int F0;
    private int G0;
    private byte[] H0;

    V() {
        this.d0 = (byte)11;
    }

    void E(int n8, long l8, int n9, byte[] byArray, int n10, int n11) {
        this.C0 = n8;
        this.E0 = (int)(l8 & 0xFFFFFFFFL);
        this.F0 = n9;
        this.H0 = byArray;
        this.G0 = n10;
        this.D0 = n11;
        this.y0 = null;
    }

    @Override
    int g(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    int l(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SmbComWrite[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",fid=");
        stringBuilder.append(this.C0);
        stringBuilder.append(",count=");
        stringBuilder.append(this.D0);
        stringBuilder.append(",offset=");
        stringBuilder.append(this.E0);
        stringBuilder.append(",remaining=");
        stringBuilder.append(this.F0);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }

    @Override
    int u(byte[] byArray, int n8) {
        byArray[n8] = 1;
        s.w(this.D0, byArray, n8 + 1);
        int n9 = n8 + 3;
        System.arraycopy(this.H0, this.G0, byArray, n9, this.D0);
        return n9 + this.D0 - n8;
    }

    @Override
    int z(byte[] byArray, int n8) {
        s.w(this.C0, byArray, n8);
        s.w(this.D0, byArray, n8 + 2);
        s.x(this.E0, byArray, n8 + 4);
        s.w(this.F0, byArray, n8 + 8);
        return n8 + 10 - n8;
    }
}

