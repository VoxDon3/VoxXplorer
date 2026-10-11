/*
 * Decompiled with CFR 0.152.
 */
package ax.G1;

import ax.G1.b;
import ax.S0.G;

public final class a
extends b {
    public final long a;
    public final long b;
    public final byte[] c;

    private a(long l8, byte[] byArray, long l9) {
        this.a = l9;
        this.b = l8;
        this.c = byArray;
    }

    static a d(G g8, int n8, long l8) {
        long l9 = g8.O();
        byte[] byArray = new byte[n8 -= 4];
        g8.q(byArray, 0, n8);
        return new a(l9, byArray, l8);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SCTE-35 PrivateCommand { ptsAdjustment=");
        stringBuilder.append(this.a);
        stringBuilder.append(", identifier= ");
        stringBuilder.append(this.b);
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}

