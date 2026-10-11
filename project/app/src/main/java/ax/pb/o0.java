/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.P;
import ax.pb.m0;
import ax.pb.s;
import ax.qb.d;

class o0
extends P {
    private int d1;
    private int e1;
    private int f1;
    private int g1;
    private String h1;

    o0(int n8, int n9, String string) {
        this.d1 = n8;
        this.f1 = n9;
        this.h1 = string;
        this.d0 = (byte)50;
        this.Y0 = (byte)2;
        this.e1 = 260;
        this.g1 = 0;
        this.T0 = 8;
        this.U0 = ax.pb.m0.i1;
        this.V0 = 0;
    }

    @Override
    void E(int n8, String string) {
        super.s();
        this.f1 = n8;
        this.h1 = string;
        this.j0 = 0;
    }

    @Override
    int F(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    int G(byte[] byArray, int n8) {
        s.w(this.d1, byArray, n8);
        s.w(ax.pb.m0.j1, byArray, n8 + 2);
        s.w(this.e1, byArray, n8 + 4);
        s.x(this.f1, byArray, n8 + 6);
        s.w(this.g1, byArray, n8 + 10);
        int n9 = n8 + 12;
        return n9 + this.A(this.h1, byArray, n9) - n8;
    }

    @Override
    int H(byte[] byArray, int n8) {
        byArray[n8] = this.Y0;
        byArray[n8 + 1] = 0;
        return 2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Trans2FindNext2[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",sid=");
        stringBuilder.append(this.d1);
        stringBuilder.append(",searchCount=");
        stringBuilder.append(ax.pb.m0.i1);
        stringBuilder.append(",informationLevel=0x");
        stringBuilder.append(d.c(this.e1, 3));
        stringBuilder.append(",resumeKey=0x");
        stringBuilder.append(d.c(this.f1, 4));
        stringBuilder.append(",flags=0x");
        stringBuilder.append(d.c(this.g1, 2));
        stringBuilder.append(",filename=");
        stringBuilder.append(this.h1);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }
}

