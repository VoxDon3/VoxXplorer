/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.s;

class w
extends s {
    private int C0;
    private long D0;

    w(int n8, long l8) {
        this.C0 = n8;
        this.D0 = l8;
        this.d0 = (byte)4;
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
        stringBuilder.append("SmbComClose[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",fid=");
        stringBuilder.append(this.C0);
        stringBuilder.append(",lastWriteTime=");
        stringBuilder.append(this.D0);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }

    @Override
    int u(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    int z(byte[] byArray, int n8) {
        s.w(this.C0, byArray, n8);
        s.D(this.D0, byArray, n8 + 2);
        return 6;
    }
}

