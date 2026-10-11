/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.Q;
import ax.pb.g0;
import ax.pb.s;

class A0
extends Q {
    private g0 Y0;
    private int Z0;
    int a1;
    int b1;

    A0(g0 g02) {
        this.Y0 = g02;
    }

    @Override
    int E(byte[] byArray, int n8, int n9) {
        return 0;
    }

    @Override
    int F(byte[] byArray, int n8, int n9) {
        this.b1 = s.i(byArray, n8);
        this.Z0 = s.i(byArray, n8 + 2);
        this.a1 = s.i(byArray, n8 + 4);
        return 6;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TransPeekNamedPipeResponse[");
        stringBuilder.append(super.toString());
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }
}

