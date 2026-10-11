/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.s;

class I
extends s {
    I(String string) {
        this.x0 = string;
        this.d0 = (byte)8;
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
        stringBuilder.append("SmbComQueryInformation[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",filename=");
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
        return 0;
    }
}

