/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.P;
import ax.pb.s;
import java.io.UnsupportedEncodingException;

class k
extends P {
    static final String[] g1 = new String[]{"WrLehDO\u0000B16BBDz\u0000", "WrLehDz\u0000B16BBDz\u0000"};
    String d1;
    String e1 = null;
    int f1;

    k(String string, int n8) {
        this.d1 = string;
        this.f1 = n8;
        this.d0 = (byte)37;
        this.Y0 = (byte)104;
        this.Z0 = "\\PIPE\\LANMAN";
        this.T0 = 8;
        this.U0 = 16384;
        this.V0 = 0;
        this.X0 = 0;
        this.W0 = 5000;
    }

    @Override
    void E(int n8, String string) {
        super.s();
        this.e1 = string;
    }

    @Override
    int F(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    int G(byte[] byArray, int n8) {
        int n9;
        byte[] byArray2;
        int n10 = this.Y0 == 104 ? 0 : 1;
        try {
            byArray2 = g1[n10].getBytes("ASCII");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return 0;
        }
        s.w(this.Y0 & 0xFF, byArray, n8);
        int n11 = n8 + 2;
        System.arraycopy(byArray2, 0, byArray, n11, byArray2.length);
        s.w(1L, byArray, n11 += byArray2.length);
        s.w(this.U0, byArray, n11 + 2);
        s.x(this.f1, byArray, n11 + 4);
        n11 += 8;
        n11 = n9 = n11 + this.B(this.d1.toUpperCase(), byArray, n11, false);
        if (n10 == 1) {
            n11 = n9 + this.B(this.e1.toUpperCase(), byArray, n9, false);
        }
        return n11 - n8;
    }

    @Override
    int H(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NetServerEnum2[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",name=");
        stringBuilder.append(this.Z0);
        stringBuilder.append(",serverTypes=");
        String string = this.f1 == -1 ? "SV_TYPE_ALL" : "SV_TYPE_DOMAIN_ENUM";
        stringBuilder.append(string);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }
}

