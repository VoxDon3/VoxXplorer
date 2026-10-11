/*
 * Decompiled with CFR 0.152.
 */
package ax.je;

import ax.je.f;

public final class c
implements f {
    private static final int[] c = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 6, 6, 0, 0, 7, 7, 4, 4, 0, 0, 4, 4, 0, 0};
    private final boolean a;
    private int b;

    public c(boolean bl, int n8) {
        this.a = bl;
        this.b = n8;
    }

    @Override
    public int a(byte[] byArray, int n8, int n9) {
        int n10;
        for (n10 = n8; n10 <= n8 + n9 - 16; n10 += 16) {
            int n11 = byArray[n10];
            int n12 = c[n11 & 0x1F];
            n11 = 5;
            for (int i8 = 0; i8 < 3; ++i8) {
                int n13;
                if ((n12 >>> i8 & 1) == 0) {
                    n13 = n11;
                } else {
                    int n14 = n11 >>> 3;
                    int n15 = n11 & 7;
                    long l8 = 0L;
                    for (n13 = 0; n13 < 6; ++n13) {
                        l8 |= ((long)byArray[n10 + n14 + n13] & 0xFFL) << n13 * 8;
                    }
                    long l9 = l8 >>> n15;
                    n13 = n11;
                    if ((l9 >>> 37 & 0xFL) == 5L) {
                        if ((l9 >>> 9 & 7L) != 0L) {
                            n13 = n11;
                        } else {
                            n13 = (int)(l9 >>> 13 & 0xFFFFFL);
                            n13 = (((int)(l9 >>> 36) & 1) << 20 | n13) << 4;
                            n13 = this.a ? (n13 += this.b + n10 - n8) : (n13 -= this.b + n10 - n8);
                            long l10 = n13 >>> 4;
                            long l11 = (1 << n15) - 1;
                            int n16 = 0;
                            while (true) {
                                n13 = n11;
                                if (n16 >= 6) break;
                                byArray[n10 + n14 + n16] = (byte)(((l9 & 0xFFFFFFEE00001FFFL | (l10 & 0xFFFFFL) << 13 | (l10 & 0x100000L) << 16) << n15 | l11 & l8) >>> n16 * 8);
                                ++n16;
                            }
                        }
                    }
                }
                n11 = n13 + 41;
            }
        }
        n8 = n10 - n8;
        this.b += n8;
        return n8;
    }
}

