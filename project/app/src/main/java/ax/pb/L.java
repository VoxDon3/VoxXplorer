/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.b;
import ax.pb.s;

class L
extends b {
    byte[] F0;
    int G0;
    int H0;
    int I0;
    int J0;

    L() {
    }

    L(byte[] byArray, int n8) {
        this.F0 = byArray;
        this.G0 = n8;
    }

    @Override
    int g(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    int l(byte[] byArray, int n8) {
        this.H0 = s.i(byArray, n8 + 2);
        this.I0 = s.i(byArray, n8 + 6);
        this.J0 = s.i(byArray, n8 + 8);
        return n8 + 20 - n8;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SmbComReadAndXResponse[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",dataCompactionMode=");
        stringBuilder.append(this.H0);
        stringBuilder.append(",dataLength=");
        stringBuilder.append(this.I0);
        stringBuilder.append(",dataOffset=");
        stringBuilder.append(this.J0);
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

