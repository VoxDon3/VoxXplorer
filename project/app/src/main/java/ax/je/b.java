/*
 * Decompiled with CFR 0.152.
 */
package ax.je;

import ax.je.f;

public final class b
implements f {
    private final boolean a;
    private int b;

    public b(boolean bl, int n8) {
        this.a = bl;
        this.b = n8 + 4;
    }

    @Override
    public int a(byte[] byArray, int n8, int n9) {
        int n10 = n8;
        while (n10 <= n9 + n8 - 4) {
            int n11 = n10 + 1;
            byte by = byArray[n11];
            int n12 = n10;
            if ((by & 0xF8) == 240) {
                int n13 = n10 + 3;
                byte by2 = byArray[n13];
                n12 = n10;
                if ((by2 & 0xF8) == 248) {
                    n12 = byArray[n10];
                    int n14 = n10 + 2;
                    n12 = ((by & 7) << 19 | (n12 & 0xFF) << 11 | (by2 & 7) << 8 | byArray[n14] & 0xFF) << 1;
                    n12 = this.a ? (n12 += this.b + n10 - n8) : (n12 -= this.b + n10 - n8);
                    byArray[n11] = (byte)(0xF0 | n12 >>> 20 & 7);
                    byArray[n10] = (byte)(n12 >>> 12);
                    byArray[n13] = (byte)(n12 >>> 9 & 7 | 0xF8);
                    byArray[n14] = (byte)(n12 >>> 1);
                    n12 = n14;
                }
            }
            n10 = n12 + 2;
        }
        n8 = n10 - n8;
        this.b += n8;
        return n8;
    }
}

