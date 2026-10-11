/*
 * Decompiled with CFR 0.152.
 */
package ax.Bd;

import ax.Kd.b;
import ax.Nd.e;
import ax.Nd.h;

public abstract class d {
    public static byte a(byte[] byArray, byte[] byArray2) {
        int n8 = 0;
        for (int i8 = 0; i8 < 16; ++i8) {
            n8 |= byArray[i8] ^ byArray2[i8];
        }
        return (byte)((n8 >>> 1 | n8 & 1) - 1 >> 31);
    }

    public static void b(long[] lArray, byte[] byArray) {
        h.o(lArray, 0, 2, byArray, 0);
    }

    public static void c(byte[] byArray, long[] lArray) {
        h.c(byArray, 0, lArray, 0, 2);
    }

    public static long[] d(byte[] byArray) {
        long[] lArray = new long[2];
        h.c(byArray, 0, lArray, 0, 2);
        return lArray;
    }

    public static void e(byte[] byArray, byte[] byArray2) {
        for (int i8 = 0; i8 < 16; ++i8) {
            byArray2[i8] = byArray[i8];
        }
    }

    public static void f(long[] lArray, long[] lArray2) {
        lArray2[0] = lArray[0];
        lArray2[1] = lArray[1];
    }

    public static void g(long[] lArray, long[] lArray2) {
        long l8 = lArray[0];
        long l9 = lArray[1];
        long l10 = l8 >> 63;
        lArray2[0] = (l8 ^ 0xE100000000000000L & l10) << 1 | l9 >>> 63;
        lArray2[1] = l9 << 1 | -l10;
    }

    private static long h(long l8, long l9) {
        long l10 = l8 & 0x1111111111111111L;
        long l11 = l8 & 0x2222222222222222L;
        long l12 = l8 & 0x4444444444444444L;
        long l13 = l8 & 0x8888888888888888L;
        long l14 = l9 & 0x1111111111111111L;
        long l15 = l9 & 0x2222222222222222L;
        l8 = l9 & 0x4444444444444444L;
        return (l10 * l14 ^ l11 * (l9 &= 0x8888888888888888L) ^ l12 * l8 ^ l13 * l15) & 0x1111111111111111L | (l10 * l15 ^ l11 * l14 ^ l12 * l9 ^ l13 * l8) & 0x2222222222222222L | (l10 * l8 ^ l11 * l15 ^ l12 * l14 ^ l13 * l9) & 0x4444444444444444L | (l10 * l9 ^ l11 * l8 ^ l12 * l15 ^ l13 * l14) & 0x8888888888888888L;
    }

    public static void i(byte[] byArray, byte[] byArray2) {
        long[] lArray = d.d(byArray);
        d.j(lArray, d.d(byArray2));
        d.b(lArray, byArray);
    }

    public static void j(long[] lArray, long[] lArray2) {
        long l8 = lArray[0];
        long l9 = lArray[1];
        long l10 = lArray2[0];
        long l11 = lArray2[1];
        long l12 = e.a(l8);
        long l13 = e.a(l9);
        long l14 = e.a(l10);
        long l15 = e.a(l11);
        long l16 = e.a(d.h(l12, l14));
        long l17 = d.h(l8, l10) << 1;
        long l18 = e.a(d.h(l13, l15));
        long l19 = d.h(l9, l11);
        long l20 = l19 << 1;
        l14 = e.a(d.h(l12 ^ l13, l15 ^ l14));
        l9 = d.h(l8 ^ l9, l10 ^ l11) << 1 ^ (l18 ^ l17 ^ l20) ^ (l19 << 63 ^ l19 << 58);
        lArray[0] = l16 ^ (l9 >>> 7 ^ (l9 >>> 1 ^ l9 ^ l9 >>> 2));
        lArray[1] = l9 << 57 ^ (l9 << 63 ^ l9 << 62) ^ (l14 ^ (l17 ^ l16 ^ l18) ^ (l20 ^ l20 >>> 1 ^ l20 >>> 2 ^ l20 >>> 7));
    }

    public static void k(long[] lArray, long[] lArray2) {
        long l8 = lArray[0];
        long l9 = lArray[1];
        long l10 = l9 << 57;
        lArray2[0] = l10 >>> 7 ^ (l8 >>> 7 ^ l10 ^ l10 >>> 1 ^ l10 >>> 2);
        lArray2[1] = l8 << 57 | l9 >>> 7;
    }

    public static long[] l() {
        long[] lArray = new long[2];
        lArray[0] = Long.MIN_VALUE;
        return lArray;
    }

    public static void m(long[] lArray, long[] lArray2) {
        long[] lArray3 = new long[4];
        b.a(lArray[0], lArray3, 0);
        b.a(lArray[1], lArray3, 2);
        long l8 = lArray3[0];
        long l9 = lArray3[1];
        long l10 = lArray3[2];
        long l11 = lArray3[3];
        lArray2[0] = l8 ^ ((l10 ^= l11 << 57 ^ (l11 << 63 ^ l11 << 62)) >>> 1 ^ l10 ^ l10 >>> 2 ^ l10 >>> 7);
        lArray2[1] = l9 ^ (l11 >>> 1 ^ l11 ^ l11 >>> 2 ^ l11 >>> 7) ^ (l10 << 57 ^ (l10 << 63 ^ l10 << 62));
    }

    public static void n(byte[] byArray, int n8, byte[] byArray2, int n9, int n10) {
        while (--n10 >= 0) {
            int n11 = n8 + n10;
            byArray[n11] = (byte)(byArray[n11] ^ byArray2[n9 + n10]);
        }
    }

    public static void o(byte[] byArray, int n8, byte[] byArray2, int n9, byte[] byArray3, int n10) {
        int n11;
        int n12 = 0;
        do {
            byArray3[n10 + n12] = (byte)(byArray[n8 + n12] ^ byArray2[n9 + n12]);
            int n13 = n12 + 1;
            n11 = byArray[n8 + n13];
            byArray3[n10 + n13] = (byte)(byArray2[n13 + n9] ^ n11);
            n13 = n12 + 2;
            n11 = byArray[n8 + n13];
            byArray3[n10 + n13] = (byte)(byArray2[n13 + n9] ^ n11);
            n13 = n12 + 3;
            n11 = byArray[n8 + n13];
            byArray3[n10 + n13] = (byte)(byArray2[n13 + n9] ^ n11);
            n12 = n11 = n12 + 4;
        } while (n11 < 16);
    }

    public static void p(byte[] byArray, byte[] byArray2) {
        int n8;
        int n9 = 0;
        do {
            byArray[n9] = (byte)(byArray[n9] ^ byArray2[n9]);
            n8 = n9 + 1;
            byArray[n8] = (byte)(byArray[n8] ^ byArray2[n8]);
            n8 = n9 + 2;
            byArray[n8] = (byte)(byArray[n8] ^ byArray2[n8]);
            n8 = n9 + 3;
            byArray[n8] = (byte)(byArray[n8] ^ byArray2[n8]);
            n9 = n8 = n9 + 4;
        } while (n8 < 16);
    }

    public static void q(byte[] byArray, byte[] byArray2, int n8) {
        int n9;
        int n10 = 0;
        do {
            byArray[n10] = (byte)(byArray[n10] ^ byArray2[n8 + n10]);
            n9 = n10 + 1;
            byArray[n9] = (byte)(byArray[n9] ^ byArray2[n8 + n9]);
            n9 = n10 + 2;
            byArray[n9] = (byte)(byArray[n9] ^ byArray2[n8 + n9]);
            n9 = n10 + 3;
            byArray[n9] = (byte)(byArray[n9] ^ byArray2[n8 + n9]);
            n10 = n9 = n10 + 4;
        } while (n9 < 16);
    }

    public static void r(byte[] byArray, byte[] byArray2, int n8, int n9) {
        while (--n9 >= 0) {
            byArray[n9] = (byte)(byArray[n9] ^ byArray2[n8 + n9]);
        }
    }

    public static void s(long[] lArray, long[] lArray2, long[] lArray3) {
        lArray3[0] = lArray[0] ^ lArray2[0];
        long l8 = lArray[1];
        lArray3[1] = lArray2[1] ^ l8;
    }
}

