/*
 * Decompiled with CFR 0.152.
 */
package ax.je;

import ax.je.f;

public final class e
implements f {
    private final boolean a;
    private int b;

    public e(boolean bl, int n8) {
        this.a = bl;
        this.b = n8;
    }

    @Override
    public int a(byte[] byArray, int n8, int n9) {
        int n10;
        for (n10 = n8; n10 <= n9 + n8 - 4; n10 += 4) {
            int n11 = byArray[n10];
            if ((n11 != 64 || (byArray[n10 + 1] & 0xC0) != 0) && (n11 != 127 || (byArray[n10 + 1] & 0xC0) != 192)) continue;
            int n12 = n10 + 1;
            byte by = byArray[n12];
            int n13 = n10 + 2;
            byte by2 = byArray[n13];
            int n14 = n10 + 3;
            n11 = ((n11 & 0xFF) << 24 | (by & 0xFF) << 16 | (by2 & 0xFF) << 8 | byArray[n14] & 0xFF) << 2;
            n11 = this.a ? (n11 += this.b + n10 - n8) : (n11 -= this.b + n10 - n8);
            n11 = 0 - (n11 >>> 24 & 1) << 22 & 0x3FFFFFFF | n11 >>> 2 & 0x3FFFFF | 0x40000000;
            byArray[n10] = (byte)(n11 >>> 24);
            byArray[n12] = (byte)(n11 >>> 16);
            byArray[n13] = (byte)(n11 >>> 8);
            byArray[n14] = (byte)n11;
        }
        n8 = n10 - n8;
        this.b += n8;
        return n8;
    }
}

