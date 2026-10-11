/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.P;
import ax.pb.s;
import ax.qb.e;

class x0
extends P {
    private byte[] d1;
    private int e1;
    private int f1;

    x0(String string, byte[] byArray, int n8, int n9) {
        this.Z0 = string;
        this.d1 = byArray;
        this.e1 = n8;
        this.f1 = n9;
        this.d0 = (byte)37;
        this.Y0 = (byte)84;
        this.W0 = -1;
        this.T0 = 0;
        this.U0 = 65535;
        this.V0 = 0;
        this.X0 = 2;
    }

    @Override
    int F(byte[] byArray, int n8) {
        int n9 = byArray.length;
        int n10 = this.f1;
        if (n9 - n8 < n10) {
            if (e.c0 >= 3) {
                s.A0.println("TransCallNamedPipe data too long for buffer");
            }
            return 0;
        }
        System.arraycopy(this.d1, this.e1, byArray, n8, n10);
        return this.f1;
    }

    @Override
    int G(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    int H(byte[] byArray, int n8) {
        byArray[n8] = this.Y0;
        byArray[n8 + 1] = 0;
        byArray[n8 + 2] = 0;
        byArray[n8 + 3] = 0;
        return 4;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TransCallNamedPipe[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",pipeName=");
        stringBuilder.append(this.Z0);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }
}

