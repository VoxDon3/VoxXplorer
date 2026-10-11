/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.b;
import ax.pb.s;
import ax.qb.d;

class C
extends b {
    private int F0;
    private int G0;
    private int H0;
    private int I0;
    private int J0;
    private int K0;
    private long L0;
    private byte M0;
    private int N0;
    int O0;
    int P0;

    C(String string, int n8, int n9, int n10, int n11, int n12, s s8) {
        super(s8);
        this.x0 = string;
        this.d0 = (byte)-94;
        this.P0 = n9 | 0x89;
        this.G0 = n11;
        this.H0 = n10;
        this.I0 = (n8 & 0x40) == 64 ? ((n8 & 0x10) == 16 ? 5 : 4) : ((n8 & 0x10) == 16 ? ((n8 & 0x20) == 32 ? 2 : 3) : 1);
        this.J0 = (n12 & 1) == 0 ? n12 | 0x40 : n12;
        this.K0 = 2;
        this.M0 = (byte)3;
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
        stringBuilder.append("SmbComNTCreateAndX[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",flags=0x");
        stringBuilder.append(d.c(this.O0, 2));
        stringBuilder.append(",rootDirectoryFid=");
        stringBuilder.append(this.F0);
        stringBuilder.append(",desiredAccess=0x");
        stringBuilder.append(d.c(this.P0, 4));
        stringBuilder.append(",allocationSize=");
        stringBuilder.append(this.L0);
        stringBuilder.append(",extFileAttributes=0x");
        stringBuilder.append(d.c(this.G0, 4));
        stringBuilder.append(",shareAccess=0x");
        stringBuilder.append(d.c(this.H0, 4));
        stringBuilder.append(",createDisposition=0x");
        stringBuilder.append(d.c(this.I0, 4));
        stringBuilder.append(",createOptions=0x");
        stringBuilder.append(d.c(this.J0, 8));
        stringBuilder.append(",impersonationLevel=0x");
        stringBuilder.append(d.c(this.K0, 4));
        stringBuilder.append(",securityFlags=0x");
        stringBuilder.append(d.c(this.M0, 2));
        stringBuilder.append(",name=");
        stringBuilder.append(this.x0);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }

    @Override
    int u(byte[] byArray, int n8) {
        int n9 = this.A(this.x0, byArray, n8);
        n8 = this.q0 ? this.x0.length() * 2 : n9;
        s.w(n8, byArray, this.N0);
        return n9;
    }

    @Override
    int z(byte[] byArray, int n8) {
        byArray[n8] = 0;
        this.N0 = n8 + 1;
        s.x(this.O0, byArray, n8 + 3);
        s.x(this.F0, byArray, n8 + 7);
        s.x(this.P0, byArray, n8 + 11);
        s.y(this.L0, byArray, n8 + 15);
        s.x(this.G0, byArray, n8 + 23);
        s.x(this.H0, byArray, n8 + 27);
        s.x(this.I0, byArray, n8 + 31);
        s.x(this.J0, byArray, n8 + 35);
        s.x(this.K0, byArray, n8 + 39);
        byArray[n8 + 43] = this.M0;
        return n8 + 44 - n8;
    }
}

