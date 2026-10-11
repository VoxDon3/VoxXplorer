/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.s;
import ax.qb.d;

class y
extends s {
    private int C0;

    y(String string) {
        this.x0 = string;
        this.d0 = (byte)6;
        this.C0 = 6;
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
        stringBuilder.append("SmbComDelete[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",searchAttributes=0x");
        stringBuilder.append(d.c(this.C0, 4));
        stringBuilder.append(",fileName=");
        stringBuilder.append(this.x0);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }

    @Override
    int u(byte[] byArray, int n8) {
        int n9 = n8 + 1;
        byArray[n8] = 4;
        return n9 + this.A(this.x0, byArray, n9) - n8;
    }

    @Override
    int z(byte[] byArray, int n8) {
        s.w(this.C0, byArray, n8);
        return 2;
    }
}

