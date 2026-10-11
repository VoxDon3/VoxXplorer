/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.s;

class Y
extends s {
    long C0;

    Y() {
    }

    @Override
    int g(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    int l(byte[] byArray, int n8) {
        this.C0 = (long)s.i(byArray, n8) & 0xFFFFL;
        return 8;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SmbComWriteResponse[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",count=");
        stringBuilder.append(this.C0);
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

