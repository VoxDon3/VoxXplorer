/*
 * Decompiled with CFR 0.152.
 */
package ax.je;

import ax.je.f;

public final class d
implements f {
    private final boolean a;
    private int b;

    public d(boolean bl, int n8) {
        this.a = bl;
        this.b = n8;
    }

    @Override
    public int a(byte[] byArray, int n8, int n9) {
        int n10;
        for (n10 = n8; n10 <= n9 + n8 - 4; n10 += 4) {
            int n11;
            byte by;
            int n12 = byArray[n10];
            if ((n12 & 0xFC) != 72 || ((by = byArray[n11 = n10 + 3]) & 3) != 1) continue;
            int n13 = n10 + 1;
            byte by2 = byArray[n13];
            int n14 = n10 + 2;
            n12 = (n12 & 3) << 24 | (by2 & 0xFF) << 16 | (byArray[n14] & 0xFF) << 8 | by & 0xFC;
            n12 = this.a ? (n12 += this.b + n10 - n8) : (n12 -= this.b + n10 - n8);
            byArray[n10] = (byte)(0x48 | n12 >>> 24 & 3);
            byArray[n13] = (byte)(n12 >>> 16);
            byArray[n14] = (byte)(n12 >>> 8);
            byArray[n11] = (byte)(n12 | byArray[n11] & 3);
        }
        n8 = n10 - n8;
        this.b += n8;
        return n8;
    }
}

