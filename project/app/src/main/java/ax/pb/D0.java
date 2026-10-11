/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.P;

class D0
extends P {
    D0(String string) {
        this.Z0 = string;
        this.d0 = (byte)37;
        this.Y0 = (byte)83;
        this.W0 = -1;
        this.T0 = 0;
        this.U0 = 0;
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
        byArray[n8 + 2] = 0;
        byArray[n8 + 3] = 0;
        return 4;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TransWaitNamedPipe[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",pipeName=");
        stringBuilder.append(this.Z0);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }
}

