/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.s;

class A
extends s {
    private int C0;

    A(int n8) {
        this.C0 = n8;
        this.d0 = (byte)52;
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
        stringBuilder.append("SmbComFindClose2[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",sid=");
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
        s.w(this.C0, byArray, n8);
        return 2;
    }
}

