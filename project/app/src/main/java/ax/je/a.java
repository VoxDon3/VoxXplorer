/*
 * Decompiled with CFR 0.152.
 */
package ax.je;

import ax.je.f;

public final class a
implements f {
    private final boolean a;
    private int b;

    public a(boolean bl, int n8) {
        this.a = bl;
        this.b = n8 + 8;
    }

    @Override
    public int a(byte[] byArray, int n8, int n9) {
        int n10;
        for (n10 = n8; n10 <= n9 + n8 - 4; n10 += 4) {
            if ((byArray[n10 + 3] & 0xFF) != 235) continue;
            int n11 = n10 + 2;
            int n12 = byArray[n11];
            int n13 = n10 + 1;
            n12 = ((n12 & 0xFF) << 16 | (byArray[n13] & 0xFF) << 8 | byArray[n10] & 0xFF) << 2;
            n12 = this.a ? (n12 += this.b + n10 - n8) : (n12 -= this.b + n10 - n8);
            byArray[n11] = (byte)(n12 >>> 18);
            byArray[n13] = (byte)(n12 >>> 10);
            byArray[n10] = (byte)(n12 >>> 2);
        }
        n8 = n10 - n8;
        this.b += n8;
        return n8;
    }
}

