/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.P;
import ax.pb.s;
import ax.qb.e;

class B0
extends P {
    private byte[] d1;
    private int e1;
    private int f1;
    private int g1;

    B0(int n8, byte[] byArray, int n9, int n10) {
        this.e1 = n8;
        this.d1 = byArray;
        this.f1 = n9;
        this.g1 = n10;
        this.d0 = (byte)37;
        this.Y0 = (byte)38;
        this.T0 = 0;
        this.U0 = 65535;
        this.V0 = 0;
        this.X0 = 2;
        this.Z0 = "\\PIPE\\";
    }

    @Override
    int F(byte[] byArray, int n8) {
        int n9 = byArray.length;
        int n10 = this.g1;
        if (n9 - n8 < n10) {
            if (e.c0 >= 3) {
                s.A0.println("TransTransactNamedPipe data too long for buffer");
            }
            return 0;
        }
        System.arraycopy(this.d1, this.f1, byArray, n8, n10);
        return this.g1;
    }

    @Override
    int G(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    int H(byte[] byArray, int n8) {
        byArray[n8] = this.Y0;
        byArray[n8 + 1] = 0;
        s.w(this.e1, byArray, n8 + 2);
        return 4;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TransTransactNamedPipe[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",pipeFid=");
        stringBuilder.append(this.e1);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }
}

