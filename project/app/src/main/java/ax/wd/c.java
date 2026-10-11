/*
 * Decompiled with CFR 0.152.
 */
package ax.wd;

import ax.Nd.a;
import ax.Nd.h;
import ax.vd.j;

public class c
implements j {
    private static long[] g = new long[]{1L, 32898L, -9223372036854742902L, -9223372034707259392L, 32907L, 0x80000001L, -9223372034707259263L, -9223372036854743031L, 138L, 136L, 0x80008009L, 0x8000000AL, 0x8000808BL, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778L, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 0x80000001L, -9223372034707259384L};
    protected long[] a = new long[25];
    protected byte[] b = new byte[192];
    protected int c;
    protected int d;
    protected int e;
    protected boolean f;

    public c(int n8) {
        this.o(n8);
    }

    private void g(byte[] byArray, int n8) {
        int n9 = this.c;
        for (int i8 = 0; i8 < n9 >>> 6; ++i8) {
            long[] lArray = this.a;
            lArray[i8] = lArray[i8] ^ h.l(byArray, n8);
            n8 += 8;
        }
        this.k();
    }

    private void j() {
        this.k();
        h.q(this.a, 0, this.c >>> 6, this.b, 0);
        this.d = this.c;
    }

    private void k() {
        long[] lArray = this.a;
        long l8 = lArray[0];
        long l9 = lArray[1];
        long l10 = lArray[2];
        long l11 = lArray[3];
        long l12 = lArray[4];
        long l13 = lArray[5];
        long l14 = lArray[6];
        long l15 = lArray[7];
        long l16 = lArray[8];
        long l17 = lArray[9];
        long l18 = lArray[10];
        long l19 = lArray[11];
        long l20 = lArray[12];
        long l21 = lArray[13];
        long l22 = lArray[14];
        long l23 = lArray[15];
        long l24 = lArray[16];
        long l25 = lArray[17];
        long l26 = lArray[18];
        long l27 = lArray[19];
        long l28 = lArray[20];
        long l29 = lArray[21];
        long l30 = lArray[22];
        long l31 = lArray[23];
        long l32 = lArray[24];
        int n8 = 0;
        while (n8 < 24) {
            long l33 = l8 ^ l13 ^ l18 ^ l23 ^ l28;
            long l34 = l9 ^ l14 ^ l19 ^ l24 ^ l29;
            long l35 = l10 ^ l15 ^ l20 ^ l25 ^ l30;
            long l36 = l11 ^ l16 ^ l21 ^ l26 ^ l31;
            long l37 = l12 ^ l17 ^ l22 ^ l27 ^ l32;
            long l38 = (l34 << 1 | l34 >>> -1) ^ l37;
            long l39 = (l35 << 1 | l35 >>> -1) ^ l33;
            l34 = (l36 << 1 | l36 >>> -1) ^ l34;
            l37 = (l37 << 1 | l37 >>> -1) ^ l35;
            l33 = (l33 << 1 | l33 >>> -1) ^ l36;
            l36 = l8 ^ l38;
            l13 ^= l38;
            l18 ^= l38;
            l23 ^= l38;
            l28 ^= l38;
            l8 = l9 ^ l39;
            l9 = l14 ^ l39;
            l19 ^= l39;
            l24 ^= l39;
            l29 ^= l39;
            l10 ^= l34;
            l15 ^= l34;
            l39 = l20 ^ l34;
            l25 ^= l34;
            l20 = l30 ^ l34;
            l30 = l11 ^ l37;
            l14 = l16 ^ l37;
            l34 = l21 ^ l37;
            l16 = l26 ^ l37;
            l38 = l31 ^ l37;
            l31 = l12 ^ l33;
            l26 = l17 ^ l33;
            l17 = l22 ^ l33;
            l37 = l27 ^ l33;
            l22 = l32 ^ l33;
            l27 = l8 << 1 | l8 >>> 63;
            l12 = l9 << 44 | l9 >>> 20;
            l32 = l26 << 20 | l26 >>> 44;
            l21 = l20 << 61 | l20 >>> 3;
            l17 = l17 << 39 | l17 >>> 25;
            l20 = l28 << 18 | l28 >>> 46;
            l11 = l10 << 62 | l10 >>> 2;
            l10 = l39 << 43 | l39 >>> 21;
            l26 = l34 << 25 | l34 >>> 39;
            l37 = l37 << 8 | l37 >>> 56;
            l33 = l38 << 56 | l38 >>> 8;
            long l40 = l23 << 41 | l23 >>> 23;
            l23 = l31 << 27 | l31 >>> 37;
            l34 = l22 << 14 | l22 >>> 50;
            l8 = l29 << 2 | l29 >>> 62;
            l35 = l14 << 55 | l14 >>> 9;
            l14 = l24 << 45 | l24 >>> 19;
            l39 = l13 << 36 | l13 >>> 28;
            l13 = l30 << 28 | l30 >>> 36;
            l38 = l16 << 21 | l16 >>> 43;
            long l41 = l25 << 15 | l25 >>> 49;
            long l42 = l19 << 10 | l19 >>> 54;
            l19 = l15 << 6 | l15 >>> 58;
            long l43 = l18 << 3 | l18 >>> 61;
            l9 = (l10 ^ 0xFFFFFFFFFFFFFFFFL) & l38 ^ l12;
            l18 = l27 ^ (l19 ^ 0xFFFFFFFFFFFFFFFFL) & l26;
            l22 = l20 ^ (l27 ^ 0xFFFFFFFFFFFFFFFFL) & l19;
            l31 = l40 ^ (l8 ^ 0xFFFFFFFFFFFFFFFFL) & l11;
            long l44 = g[n8];
            l24 = l39 ^ (l42 ^ 0xFFFFFFFFFFFFFFFFL) & l41;
            l15 = (l14 ^ 0xFFFFFFFFFFFFFFFFL) & l21 ^ l43;
            l29 = (l17 ^ 0xFFFFFFFFFFFFFFFFL) & l40 ^ l35;
            l28 = l11 ^ (l35 ^ 0xFFFFFFFFFFFFFFFFL) & l17;
            l30 = l17 ^ (l40 ^ 0xFFFFFFFFFFFFFFFFL) & l8;
            l17 = (l13 ^ 0xFFFFFFFFFFFFFFFFL) & l32 ^ l21;
            l16 = l14 ^ (l21 ^ 0xFFFFFFFFFFFFFFFFL) & l13;
            l25 = (l41 ^ 0xFFFFFFFFFFFFFFFFL) & l33 ^ l42;
            l21 = l37 ^ (l20 ^ 0xFFFFFFFFFFFFFFFFL) & l27;
            l27 = (l23 ^ 0xFFFFFFFFFFFFFFFFL) & l39 ^ l33;
            l13 ^= (l32 ^ 0xFFFFFFFFFFFFFFFFL) & l43;
            l20 = (l37 ^ 0xFFFFFFFFFFFFFFFFL) & l20 ^ l26;
            l14 = (l43 ^ 0xFFFFFFFFFFFFFFFFL) & l14 ^ l32;
            l32 = l8 ^ (l11 ^ 0xFFFFFFFFFFFFFFFFL) & l35;
            ++n8;
            l8 = l36 ^ (l12 ^ 0xFFFFFFFFFFFFFFFFL) & l10 ^ l44;
            l11 = l38 ^ (l34 ^ 0xFFFFFFFFFFFFFFFFL) & l36;
            l12 = l34 ^ (l36 ^ 0xFFFFFFFFFFFFFFFFL) & l12;
            l19 = (l26 ^ 0xFFFFFFFFFFFFFFFFL) & l37 ^ l19;
            l26 = l41 ^ (l33 ^ 0xFFFFFFFFFFFFFFFFL) & l23;
            l23 ^= (l39 ^ 0xFFFFFFFFFFFFFFFFL) & l42;
            l10 ^= (l38 ^ 0xFFFFFFFFFFFFFFFFL) & l34;
        }
        lArray[0] = l8;
        lArray[1] = l9;
        lArray[2] = l10;
        lArray[3] = l11;
        lArray[4] = l12;
        lArray[5] = l13;
        lArray[6] = l14;
        lArray[7] = l15;
        lArray[8] = l16;
        lArray[9] = l17;
        lArray[10] = l18;
        lArray[11] = l19;
        lArray[12] = l20;
        lArray[13] = l21;
        lArray[14] = l22;
        lArray[15] = l23;
        lArray[16] = l24;
        lArray[17] = l25;
        lArray[18] = l26;
        lArray[19] = l27;
        lArray[20] = l28;
        lArray[21] = l29;
        lArray[22] = l30;
        lArray[23] = l31;
        lArray[24] = l32;
    }

    private void o(int n8) {
        if (n8 != 128 && n8 != 224 && n8 != 256 && n8 != 288 && n8 != 384 && n8 != 512) {
            throw new IllegalArgumentException("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
        }
        this.p(1600 - (n8 << 1));
    }

    private void p(int n8) {
        if (n8 > 0 && n8 < 1600 && n8 % 64 == 0) {
            long[] lArray;
            this.c = n8;
            for (int i8 = 0; i8 < (lArray = this.a).length; ++i8) {
                lArray[i8] = 0L;
            }
            ax.Nd.a.g(this.b, (byte)0);
            this.d = 0;
            this.f = false;
            this.e = (1600 - n8) / 2;
            return;
        }
        throw new IllegalStateException("invalid rate value");
    }

    private void q() {
        Object[] objectArray = this.b;
        int n8 = this.d;
        int n9 = n8 >>> 3;
        objectArray[n9] = (byte)(objectArray[n9] | (byte)(1 << (n8 & 7)));
        this.d = n9 = n8 + 1;
        if (n9 == this.c) {
            this.g((byte[])objectArray, 0);
        } else {
            int n10 = n9 >>> 6;
            int n11 = n9 & 0x3F;
            n9 = 0;
            for (n8 = 0; n8 < n10; ++n8) {
                objectArray = this.a;
                objectArray[n8] = objectArray[n8] ^ h.l(this.b, n9);
                n9 += 8;
            }
            if (n11 > 0) {
                objectArray = this.a;
                byte by = objectArray[n10];
                objectArray[n10] = (byte)((1L << n11) - 1L & h.l(this.b, n9) ^ by);
            }
        }
        objectArray = this.a;
        n9 = this.c - 1 >>> 6;
        objectArray[n9] = objectArray[n9] ^ Long.MIN_VALUE;
        this.d = 0;
        this.f = true;
    }

    @Override
    public void a() {
        this.o(this.e);
    }

    @Override
    public void b(byte[] byArray, int n8, int n9) {
        this.m(byArray, n8, n9);
    }

    @Override
    public void d(byte by) {
        this.l(by);
    }

    @Override
    public int h() {
        return this.c / 8;
    }

    protected void l(byte by) {
        int n8 = this.d;
        if (n8 % 8 == 0) {
            if (!this.f) {
                byte[] byArray = this.b;
                byArray[n8 >>> 3] = by;
                this.d = n8 += 8;
                if (n8 == this.c) {
                    this.g(byArray, 0);
                    this.d = 0;
                }
                return;
            }
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        throw new IllegalStateException("attempt to absorb with odd length queue");
    }

    /*
     * Enabled aggressive block sorting
     */
    protected void m(byte[] byArray, int n8, int n9) {
        int n10 = this.d;
        if (n10 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.f) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        int n11 = this.c >>> 3;
        int n12 = n10 >>> 3;
        if (n9 < (n10 = n11 - n12)) {
            System.arraycopy(byArray, n8, this.b, n12, n9);
            n8 = this.d + (n9 << 3);
        } else {
            if (n12 > 0) {
                System.arraycopy(byArray, n8, this.b, n12, n10);
                this.g(this.b, 0);
            } else {
                n10 = 0;
            }
            while ((n12 = n9 - n10) >= n11) {
                this.g(byArray, n8 + n10);
                n10 += n11;
            }
            System.arraycopy(byArray, n8 + n10, this.b, 0, n12);
            n8 = n12 << 3;
        }
        this.d = n8;
    }

    protected void n(int n8, int n9) {
        if (n9 >= 1 && n9 <= 7) {
            int n10 = this.d;
            if (n10 % 8 == 0) {
                if (!this.f) {
                    this.b[n10 >>> 3] = (byte)(n8 & (1 << n9) - 1);
                    this.d = n10 + n9;
                    return;
                }
                throw new IllegalStateException("attempt to absorb while squeezing");
            }
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        throw new IllegalArgumentException("'bits' must be in the range 1 to 7");
    }

    protected void r(byte[] byArray, int n8, long l8) {
        if (!this.f) {
            this.q();
        }
        if (l8 % 8L == 0L) {
            int n9;
            for (long i8 = 0L; i8 < l8; i8 += (long)n9) {
                if (this.d == 0) {
                    this.j();
                }
                n9 = (int)Math.min((long)this.d, l8 - i8);
                System.arraycopy(this.b, (this.c - this.d) / 8, byArray, (int)(i8 / 8L) + n8, n9 / 8);
                this.d -= n9;
            }
            return;
        }
        throw new IllegalStateException("outputLength not a multiple of 8");
    }
}

