/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.jb.a;
import ax.pb.b;
import ax.pb.s;

class K
extends b {
    private static final int L0 = a.d("jcifs.smb.client.ReadAndX.Close", 1);
    private long F0;
    private int G0;
    private int H0;
    int I0;
    int J0;
    int K0;

    K(int n8, long l8, int n9, s s8) {
        super(s8);
        this.G0 = n8;
        this.F0 = l8;
        this.J0 = n9;
        this.I0 = n9;
        this.d0 = (byte)46;
        this.H0 = -1;
    }

    @Override
    int E(byte by) {
        if (by == 4) {
            return L0;
        }
        return 0;
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
        stringBuilder.append("SmbComReadAndX[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",fid=");
        stringBuilder.append(this.G0);
        stringBuilder.append(",offset=");
        stringBuilder.append(this.F0);
        stringBuilder.append(",maxCount=");
        stringBuilder.append(this.I0);
        stringBuilder.append(",minCount=");
        stringBuilder.append(this.J0);
        stringBuilder.append(",openTimeout=");
        stringBuilder.append(this.H0);
        stringBuilder.append(",remaining=");
        stringBuilder.append(this.K0);
        stringBuilder.append(",offset=");
        stringBuilder.append(this.F0);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }

    @Override
    int u(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    int z(byte[] byArray, int n8) {
        s.w(this.G0, byArray, n8);
        s.x(this.F0, byArray, n8 + 2);
        s.w(this.I0, byArray, n8 + 6);
        s.w(this.J0, byArray, n8 + 8);
        s.x(this.H0, byArray, n8 + 10);
        s.w(this.K0, byArray, n8 + 14);
        s.x(this.F0 >> 32, byArray, n8 + 16);
        return n8 + 20 - n8;
    }
}

