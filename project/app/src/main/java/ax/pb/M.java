/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.s;
import ax.qb.d;

class M
extends s {
    private int C0;
    private String D0;
    private String E0;

    M(String string, String string2) {
        this.d0 = (byte)7;
        this.D0 = string;
        this.E0 = string2;
        this.C0 = 22;
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
        stringBuilder.append("SmbComRename[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",searchAttributes=0x");
        stringBuilder.append(d.c(this.C0, 4));
        stringBuilder.append(",oldFileName=");
        stringBuilder.append(this.D0);
        stringBuilder.append(",newFileName=");
        stringBuilder.append(this.E0);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }

    @Override
    int u(byte[] byArray, int n8) {
        int n9 = n8 + 1;
        byArray[n8] = 4;
        int n10 = n9 + this.A(this.D0, byArray, n9);
        int n11 = n10 + 1;
        byArray[n10] = 4;
        n9 = n11;
        if (this.q0) {
            byArray[n11] = 0;
            n9 = n10 + 2;
        }
        return n9 + this.A(this.E0, byArray, n9) - n8;
    }

    @Override
    int z(byte[] byArray, int n8) {
        s.w(this.C0, byArray, n8);
        return 2;
    }
}

