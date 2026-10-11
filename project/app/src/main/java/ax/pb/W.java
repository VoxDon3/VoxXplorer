/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.jb.a;
import ax.pb.b;
import ax.pb.s;

class W
extends b {
    private static final int O0 = a.d("jcifs.smb.client.WriteAndX.ReadAndX", 1);
    private static final int P0 = a.d("jcifs.smb.client.WriteAndX.Close", 1);
    private int F0;
    private int G0;
    private int H0;
    private int I0;
    private int J0;
    private byte[] K0;
    private long L0;
    private int M0;
    int N0;

    W() {
        super(null);
        this.d0 = (byte)47;
    }

    W(int n8, long l8, int n9, byte[] byArray, int n10, int n11, s s8) {
        super(s8);
        this.F0 = n8;
        this.L0 = l8;
        this.G0 = n9;
        this.K0 = byArray;
        this.J0 = n10;
        this.H0 = n11;
        this.d0 = (byte)47;
    }

    @Override
    int E(byte by) {
        if (by == 46) {
            return O0;
        }
        if (by == 4) {
            return P0;
        }
        return 0;
    }

    void H(int n8, long l8, int n9, byte[] byArray, int n10, int n11) {
        this.F0 = n8;
        this.L0 = l8;
        this.G0 = n9;
        this.K0 = byArray;
        this.J0 = n10;
        this.H0 = n11;
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
        stringBuilder.append("SmbComWriteAndX[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",fid=");
        stringBuilder.append(this.F0);
        stringBuilder.append(",offset=");
        stringBuilder.append(this.L0);
        stringBuilder.append(",writeMode=");
        stringBuilder.append(this.N0);
        stringBuilder.append(",remaining=");
        stringBuilder.append(this.G0);
        stringBuilder.append(",dataLength=");
        stringBuilder.append(this.H0);
        stringBuilder.append(",dataOffset=");
        stringBuilder.append(this.I0);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }

    @Override
    int u(byte[] byArray, int n8) {
        int n9 = n8;
        while (true) {
            int n10 = this.M0;
            this.M0 = n10 - 1;
            if (n10 <= 0) break;
            byArray[n9] = -18;
            ++n9;
        }
        System.arraycopy(this.K0, this.J0, byArray, n9, this.H0);
        return n9 + this.H0 - n8;
    }

    @Override
    int z(byte[] byArray, int n8) {
        int n9;
        int n10 = this.f0;
        this.I0 = n9 = n8 - n10 + 26;
        this.M0 = n10 = (n9 - n10) % 4;
        n10 = n10 == 0 ? 0 : 4 - n10;
        this.M0 = n10;
        this.I0 = n9 + n10;
        s.w(this.F0, byArray, n8);
        s.x(this.L0, byArray, n8 + 2);
        n10 = n8 + 6;
        n9 = 0;
        while (n9 < 4) {
            byArray[n10] = -1;
            ++n9;
            ++n10;
        }
        s.w(this.N0, byArray, n10);
        s.w(this.G0, byArray, n10 + 2);
        byArray[n10 + 4] = 0;
        byArray[n10 + 5] = 0;
        s.w(this.H0, byArray, n10 + 6);
        s.w(this.I0, byArray, n10 + 8);
        s.x(this.L0 >> 32, byArray, n10 + 10);
        return n10 + 14 - n8;
    }
}

