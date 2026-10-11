/*
 * Decompiled with CFR 0.152.
 */
package ax.je;

import ax.je.f;

public final class g
implements f {
    private static final boolean[] d = new boolean[]{true, true, true, false, true, false, false, false};
    private static final int[] e = new int[]{0, 1, 2, 2, 3, 3, 3, 3};
    private final boolean a;
    private int b;
    private int c = 0;

    public g(boolean bl, int n8) {
        this.a = bl;
        this.b = n8 + 5;
    }

    private static boolean b(byte by) {
        return (by = (byte)(by & 0xFF)) == 0 || by == 255;
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int a(byte[] byArray, int n8, int n9) {
        int n10 = n8 - 1;
        int n11 = n8;
        while (true) {
            block4: {
                int n12;
                block8: {
                    block3: {
                        block7: {
                            block6: {
                                block5: {
                                    n12 = 0;
                                    if (n11 > n9 + n8 - 5) break block3;
                                    if ((byArray[n11] & 0xFE) != 232) break block4;
                                    if (((n10 = n11 - n10) & 0xFFFFFFFC) == 0) break block5;
                                    this.c = 0;
                                    break block6;
                                }
                                this.c = n10 = this.c << n10 - 1 & 7;
                                if (n10 != 0 && (!d[n10] || g.b(byArray[n11 + 4 - e[n10]]))) break block7;
                            }
                            if (g.b(byArray[n12 = n11 + 4])) break block8;
                        }
                        this.c = this.c << 1 | 1;
                        n10 = n11;
                        break block4;
                    }
                    n9 = n11 - n10;
                    n9 = (n9 & 0xFFFFFFFC) != 0 ? n12 : this.c << n9 - 1;
                    this.c = n9;
                    n8 = n11 - n8;
                    this.b += n8;
                    return n8;
                }
                int n13 = n11 + 1;
                n10 = byArray[n13];
                int n14 = n11 + 2;
                int n15 = byArray[n14];
                int n16 = n11 + 3;
                n10 = n10 & 0xFF | (n15 & 0xFF) << 8 | (byArray[n16] & 0xFF) << 16 | (byArray[n12] & 0xFF) << 24;
                while (true) {
                    n10 = this.a ? (n10 += this.b + n11 - n8) : (n10 -= this.b + n11 - n8);
                    n15 = this.c;
                    if (n15 == 0 || !g.b((byte)(n10 >>> 24 - (n15 = e[n15] * 8)))) {
                        byArray[n13] = (byte)n10;
                        byArray[n14] = (byte)(n10 >>> 8);
                        byArray[n16] = (byte)(n10 >>> 16);
                        byArray[n12] = (byte)(~((n10 >>> 24 & 1) - 1));
                        n10 = n11;
                        n11 = n12;
                        break;
                    }
                    n10 ^= (1 << 32 - n15) - 1;
                }
            }
            ++n11;
        }
    }
}

