/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.Z;
import ax.pb.s;
import java.io.UnsupportedEncodingException;

class E
extends s {
    E() {
        this.d0 = (byte)114;
        this.j0 = Z.L;
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
        stringBuilder.append("SmbComNegotiate[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",wordCount=");
        stringBuilder.append(this.o0);
        stringBuilder.append(",dialects=NT LM 0.12]");
        return new String(stringBuilder.toString());
    }

    @Override
    int u(byte[] byArray, int n8) {
        byte[] byArray2;
        try {
            byArray2 = "\u0002NT LM 0.12\u0000".getBytes("ASCII");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return 0;
        }
        System.arraycopy(byArray2, 0, byArray, n8, byArray2.length);
        return byArray2.length;
    }

    @Override
    int z(byte[] byArray, int n8) {
        return 0;
    }
}

