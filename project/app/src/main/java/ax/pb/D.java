/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.b;
import ax.pb.s;
import ax.qb.d;
import java.util.Date;

class D
extends b {
    byte F0;
    int G0;
    int H0;
    int I0;
    int J0;
    int K0;
    long L0;
    long M0;
    long N0;
    long O0;
    long P0;
    long Q0;
    boolean R0;
    boolean S0;

    D() {
    }

    @Override
    int g(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    int l(byte[] byArray, int n8) {
        this.F0 = byArray[n8];
        this.G0 = s.i(byArray, n8 + 1);
        this.H0 = s.j(byArray, n8 + 3);
        this.L0 = s.q(byArray, n8 + 7);
        this.M0 = s.q(byArray, n8 + 15);
        this.N0 = s.q(byArray, n8 + 23);
        this.O0 = s.q(byArray, n8 + 31);
        this.I0 = s.j(byArray, n8 + 39);
        this.P0 = s.k(byArray, n8 + 43);
        this.Q0 = s.k(byArray, n8 + 51);
        this.J0 = s.i(byArray, n8 + 59);
        this.K0 = s.i(byArray, n8 + 61);
        boolean bl = (byArray[n8 + 63] & 0xFF) > 0;
        this.R0 = bl;
        return n8 + 64 - n8;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SmbComNTCreateAndXResponse[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",oplockLevel=");
        stringBuilder.append(this.F0);
        stringBuilder.append(",fid=");
        stringBuilder.append(this.G0);
        stringBuilder.append(",createAction=0x");
        stringBuilder.append(d.c(this.H0, 4));
        stringBuilder.append(",creationTime=");
        stringBuilder.append(new Date(this.L0));
        stringBuilder.append(",lastAccessTime=");
        stringBuilder.append(new Date(this.M0));
        stringBuilder.append(",lastWriteTime=");
        stringBuilder.append(new Date(this.N0));
        stringBuilder.append(",changeTime=");
        stringBuilder.append(new Date(this.O0));
        stringBuilder.append(",extFileAttributes=0x");
        stringBuilder.append(d.c(this.I0, 4));
        stringBuilder.append(",allocationSize=");
        stringBuilder.append(this.P0);
        stringBuilder.append(",endOfFile=");
        stringBuilder.append(this.Q0);
        stringBuilder.append(",fileType=");
        stringBuilder.append(this.J0);
        stringBuilder.append(",deviceState=");
        stringBuilder.append(this.K0);
        stringBuilder.append(",directory=");
        stringBuilder.append(this.R0);
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

