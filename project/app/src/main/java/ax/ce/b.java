/*
 * Decompiled with CFR 0.152.
 */
package ax.ce;

import ax.ce.c;

public class b
extends c {
    private static final long[][] d = new long[4][256];
    private long c = -1L;

    static {
        for (int i8 = 0; i8 < 4; ++i8) {
            for (int i9 = 0; i9 < 256; ++i9) {
                long l8 = i8 == 0 ? (long)i9 : d[i8 - 1][i9];
                long l9 = l8;
                for (int i10 = 0; i10 < 8; ++i10) {
                    long l10;
                    l8 = l10 = l9 >>> 1;
                    if ((l9 & 1L) == 1L) {
                        l8 = l10 ^ 0xC96C5795D7870F42L;
                    }
                    l9 = l8;
                }
                ax.ce.b.d[i8][i9] = l9;
            }
        }
    }

    public b() {
        this.a = 8;
        this.b = "CRC64";
    }

    @Override
    public byte[] a() {
        long l8 = this.c;
        this.c = -1L;
        byte[] byArray = new byte[8];
        for (int i8 = 0; i8 < 8; ++i8) {
            byArray[i8] = (byte)((l8 ^ 0xFFFFFFFFFFFFFFFFL) >> i8 * 8);
        }
        return byArray;
    }

    @Override
    public void f(byte[] byArray, int n8, int n9) {
        Object object;
        long l8;
        int n10 = n9 + n8;
        while (true) {
            if (n8 >= n10 - 3) break;
            l8 = this.c;
            n9 = (int)l8;
            object = d;
            this.c = l8 >>> 32 ^ (object[3][n9 & 0xFF ^ byArray[n8] & 0xFF] ^ object[2][n9 >>> 8 & 0xFF ^ byArray[n8 + 1] & 0xFF]) ^ object[1][n9 >>> 16 & 0xFF ^ byArray[n8 + 2] & 0xFF] ^ object[0][n9 >>> 24 & 0xFF ^ byArray[n8 + 3] & 0xFF];
            n8 += 4;
        }
        for (n9 = n8; n9 < n10; ++n9) {
            object = d[0];
            n8 = byArray[n9];
            l8 = this.c;
            this.c = l8 >>> 8 ^ object[n8 & 0xFF ^ (int)l8 & 0xFF];
        }
    }
}

