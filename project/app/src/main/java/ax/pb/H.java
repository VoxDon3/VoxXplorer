/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.b;
import ax.pb.s;

class H
extends b {
    int F0;
    int G0;
    int H0;
    int I0;
    int J0;
    int K0;
    int L0;
    int M0;
    long N0;

    H() {
    }

    @Override
    int g(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    int l(byte[] byArray, int n8) {
        this.F0 = s.i(byArray, n8);
        this.G0 = s.i(byArray, n8 + 2);
        this.N0 = s.r(byArray, n8 + 4);
        this.H0 = s.j(byArray, n8 + 8);
        this.I0 = s.i(byArray, n8 + 12);
        this.J0 = s.i(byArray, n8 + 14);
        this.K0 = s.i(byArray, n8 + 16);
        this.L0 = s.i(byArray, n8 + 18);
        this.M0 = s.j(byArray, n8 + 20);
        return n8 + 26 - n8;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SmbComOpenAndXResponse[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",fid=");
        stringBuilder.append(this.F0);
        stringBuilder.append(",fileAttributes=");
        stringBuilder.append(this.G0);
        stringBuilder.append(",lastWriteTime=");
        stringBuilder.append(this.N0);
        stringBuilder.append(",dataSize=");
        stringBuilder.append(this.H0);
        stringBuilder.append(",grantedAccess=");
        stringBuilder.append(this.I0);
        stringBuilder.append(",fileType=");
        stringBuilder.append(this.J0);
        stringBuilder.append(",deviceState=");
        stringBuilder.append(this.K0);
        stringBuilder.append(",action=");
        stringBuilder.append(this.L0);
        stringBuilder.append(",serverFid=");
        stringBuilder.append(this.M0);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }

    @Override
    int u(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    int z(byte[] byArray, int n8) {
        return 0;
    }
}

