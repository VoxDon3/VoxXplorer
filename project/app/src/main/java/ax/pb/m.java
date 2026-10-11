/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.P;
import ax.pb.s;
import java.io.UnsupportedEncodingException;

class m
extends P {
    m() {
        this.d0 = (byte)37;
        this.Y0 = 0;
        this.Z0 = new String("\\PIPE\\LANMAN");
        this.T0 = 8;
        this.V0 = 0;
        this.X0 = 0;
        this.W0 = 5000;
    }

    @Override
    int F(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    int G(byte[] byArray, int n8) {
        byte[] byArray2;
        try {
            byArray2 = "WrLeh\u0000B13BWz\u0000".getBytes("ASCII");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return 0;
        }
        s.w(0L, byArray, n8);
        int n9 = n8 + 2;
        System.arraycopy(byArray2, 0, byArray, n9, byArray2.length);
        s.w(1L, byArray, n9 += byArray2.length);
        s.w(this.U0, byArray, n9 + 2);
        return n9 + 4 - n8;
    }

    @Override
    int H(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NetShareEnum[");
        stringBuilder.append(super.toString());
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }
}

