/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.P;
import ax.pb.s;

class z0
extends P {
    private int d1;

    z0(String string, int n8) {
        this.Z0 = string;
        this.d1 = n8;
        this.d0 = (byte)37;
        this.Y0 = (byte)35;
        this.W0 = -1;
        this.T0 = 6;
        this.U0 = 1;
        this.V0 = 0;
        this.X0 = 2;
    }

    @Override
    int F(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    int G(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    int H(byte[] byArray, int n8) {
        byArray[n8] = this.Y0;
        byArray[n8 + 1] = 0;
        s.w(this.d1, byArray, n8 + 2);
        return 4;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TransPeekNamedPipe[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",pipeName=");
        stringBuilder.append(this.Z0);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }
}

