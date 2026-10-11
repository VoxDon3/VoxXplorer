/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.b;
import ax.pb.s;
import java.io.UnsupportedEncodingException;

class T
extends b {
    boolean F0;
    boolean G0;
    String H0;
    String I0 = "";

    T(s s8) {
        super(s8);
    }

    @Override
    int g(byte[] byArray, int n8) {
        int n9 = this.p(byArray, n8, 32);
        try {
            String string;
            this.H0 = string = new String(byArray, n8, n9, "ASCII");
            return n9 + 1 + n8 - n8;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return 0;
        }
    }

    @Override
    int l(byte[] byArray, int n8) {
        n8 = byArray[n8];
        boolean bl = false;
        boolean bl2 = (n8 & 1) == 1;
        this.F0 = bl2;
        bl2 = bl;
        if ((n8 & 2) == 2) {
            bl2 = true;
        }
        this.G0 = bl2;
        return 2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SmbComTreeConnectAndXResponse[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",supportSearchBits=");
        stringBuilder.append(this.F0);
        stringBuilder.append(",shareIsInDfs=");
        stringBuilder.append(this.G0);
        stringBuilder.append(",service=");
        stringBuilder.append(this.H0);
        stringBuilder.append(",nativeFileSystem=");
        stringBuilder.append(this.I0);
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

