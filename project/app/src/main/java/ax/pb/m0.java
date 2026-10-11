/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.jb.a;
import ax.pb.P;
import ax.pb.s;
import ax.qb.d;

class m0
extends P {
    static final int i1 = a.d("jcifs.smb.client.listSize", 65535);
    static final int j1 = a.d("jcifs.smb.client.listCount", 200);
    private int d1;
    private int e1;
    private int f1;
    private int g1 = 0;
    private String h1;

    m0(String string, String string2, int n8) {
        if (string.equals("\\")) {
            this.x0 = string;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("\\");
            this.x0 = stringBuilder.toString();
        }
        this.h1 = string2;
        this.d1 = n8 & 0x37;
        this.d0 = (byte)50;
        this.Y0 = 1;
        this.e1 = 0;
        this.f1 = 260;
        this.S0 = 0;
        this.T0 = 10;
        this.U0 = i1;
        this.V0 = 0;
    }

    @Override
    int F(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    int G(byte[] byArray, int n8) {
        s.w(this.d1, byArray, n8);
        s.w(j1, byArray, n8 + 2);
        s.w(this.e1, byArray, n8 + 4);
        s.w(this.f1, byArray, n8 + 6);
        s.x(this.g1, byArray, n8 + 8);
        int n9 = n8 + 12;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.x0);
        stringBuilder.append(this.h1);
        return n9 + this.A(stringBuilder.toString(), byArray, n9) - n8;
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
        stringBuilder.append("Trans2FindFirst2[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",searchAttributes=0x");
        stringBuilder.append(d.c(this.d1, 2));
        stringBuilder.append(",searchCount=");
        stringBuilder.append(j1);
        stringBuilder.append(",flags=0x");
        stringBuilder.append(d.c(this.e1, 2));
        stringBuilder.append(",informationLevel=0x");
        stringBuilder.append(d.c(this.f1, 3));
        stringBuilder.append(",searchStorageType=");
        stringBuilder.append(this.g1);
        stringBuilder.append(",filename=");
        stringBuilder.append(this.x0);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }
}

