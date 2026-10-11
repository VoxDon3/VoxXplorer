/*
 * Decompiled with CFR 0.152.
 */
package ax.Kd;

import ax.Kd.e;
import ax.Nd.d;

public abstract class c {
    private static int a(int n8, int[] nArray, int[] nArray2) {
        int n9 = n8 - 1;
        int n10 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            nArray[n8] = 0x3FFFFFFF & (n10 += nArray[n8] + nArray2[n8]);
            n10 >>= 30;
        }
        nArray[n9] = n8 = n10 + (nArray[n9] + nArray2[n9]);
        return n8 >> 30;
    }

    private static void b(int n8, int n9, int[] nArray) {
        int n10 = n8 - 1;
        int n11 = 0;
        for (n8 = 0; n8 < n10; ++n8) {
            nArray[n8] = 0x3FFFFFFF & (n11 += (nArray[n8] ^ n9) - n9);
            n11 >>= 30;
        }
        nArray[n10] = n11 + ((nArray[n10] ^ n9) - n9);
    }

    private static void c(int n8, int n9, int[] nArray, int[] nArray2) {
        int n10 = n8 - 1;
        int n11 = nArray[n10] >> 31;
        int n12 = 0;
        int n13 = 0;
        for (n8 = 0; n8 < n10; ++n8) {
            nArray[n8] = 0x3FFFFFFF & (n13 += (nArray[n8] + (nArray2[n8] & n11) ^ n9) - n9);
            n13 >>= 30;
        }
        nArray[n10] = n8 = n13 + ((nArray[n10] + (n11 & nArray2[n10]) ^ n9) - n9);
        n13 = n8 >> 31;
        n9 = 0;
        for (n8 = n12; n8 < n10; ++n8) {
            nArray[n8] = (n9 += nArray[n8] + (nArray2[n8] & n13)) & 0x3FFFFFFF;
            n9 >>= 30;
        }
        nArray[n10] = n9 + (nArray[n10] + (n13 & nArray2[n10]));
    }

    private static void d(int n8, int[] nArray, int n9, int[] nArray2, int n10) {
        int n11 = 0;
        long l8 = 0L;
        int n12 = n9;
        n9 = n8;
        n8 = n11;
        while (n9 > 0) {
            while (n8 < Math.min(32, n9)) {
                l8 |= (long)nArray[n12] << n8;
                n8 += 30;
                ++n12;
            }
            nArray2[n10] = (int)l8;
            l8 >>>= 32;
            n8 -= 32;
            n9 -= 32;
            ++n10;
        }
    }

    private static int e(int n8, int n9, int n10, int[] nArray) {
        int n11 = 1;
        int n12 = 0;
        int n13 = 0;
        int n14 = 1;
        int n15 = n10;
        n10 = n12;
        for (int i8 = 0; i8 < 30; ++i8) {
            int n16 = n8 >> 31;
            n12 = -(n15 & 1);
            n15 += (n9 ^ n16) - n16 & n12;
            n13 += (n11 ^ n16) - n16 & n12;
            n14 += (n10 ^ n16) - n16 & n12;
            n12 = n16 & n12;
            n8 = (n8 ^ n12) - (n12 + 1);
            n9 += n15 & n12;
            n15 >>= 1;
            n11 = n11 + (n13 & n12) << 1;
            n10 = n10 + (n12 & n14) << 1;
        }
        nArray[0] = n11;
        nArray[1] = n10;
        nArray[2] = n13;
        nArray[3] = n14;
        return n8;
    }

    private static int f(int n8, int n9, int n10, int[] nArray) {
        int n11 = 30;
        int n12 = 1;
        int n13 = 0;
        int n14 = 0;
        int n15 = 1;
        int n16 = n10;
        int n17 = n9;
        int n18 = n8;
        n8 = n15;
        n9 = n14;
        n10 = n11;
        while (true) {
            n11 = d.b(-1 << n10 | n16);
            n16 >>= n11;
            n15 = n12 << n11;
            int n19 = n13 << n11;
            n13 = n18 - n11;
            if ((n10 -= n11) <= 0) {
                nArray[0] = n15;
                nArray[1] = n19;
                nArray[2] = n9;
                nArray[3] = n8;
                return n13;
            }
            if (n13 < 0) {
                n14 = -n13;
                n18 = -n17;
                n11 = -n15;
                n13 = -n19;
                n17 = n12 = n14 + 1;
                if (n12 > n10) {
                    n17 = n10;
                }
                n12 = -1 >>> 32 - n17 & 0x3F & n16 * n18 * (n16 * n16 - 2);
                n17 = n14;
            } else {
                n18 = n12 = n13 + 1;
                if (n12 > n10) {
                    n18 = n10;
                }
                n12 = -1 >>> 32 - n18 & 0xF & -(((n17 + 1 & 4) << 1) + n17) * n16;
                n18 = n16;
                n16 = n17;
                n17 = n13;
                n13 = n8;
                n11 = n9;
                n8 = n19;
                n9 = n15;
            }
            n14 = n18 + n16 * n12;
            n18 = n11 + n9 * n12;
            n11 = n13 + n12 * n8;
            n12 = n9;
            n13 = n8;
            n9 = n18;
            n8 = n11;
            n18 = n17;
            n17 = n16;
            n16 = n14;
        }
    }

    private static void g(int n8, int[] nArray, int n9, int[] nArray2, int n10) {
        int n11 = 0;
        long l8 = 0L;
        int n12 = n9;
        n9 = n8;
        n8 = n11;
        while (n9 > 0) {
            int n13 = n8;
            long l9 = l8;
            n11 = n12;
            if (n8 < Math.min(30, n9)) {
                l9 = l8 | ((long)nArray[n12] & 0xFFFFFFFFL) << n8;
                n13 = n8 + 32;
                n11 = n12 + 1;
            }
            nArray2[n10] = (int)l9 & 0x3FFFFFFF;
            l8 = l9 >>> 30;
            n8 = n13 - 30;
            n9 -= 30;
            ++n10;
            n12 = n11;
        }
    }

    private static int h(int n8) {
        int n9 = n8 < 46 ? 80 : 47;
        return (n8 * 49 + n9) / 17;
    }

    public static int i(int n8) {
        int n9 = (2 - n8 * n8) * n8;
        n9 *= 2 - n8 * n9;
        n9 *= 2 - n8 * n9;
        return n9 * (2 - n8 * n9);
    }

    public static int j(int[] nArray, int[] nArray2, int[] nArray3) {
        int n8 = nArray.length;
        int n9 = (n8 << 5) - d.a(nArray[n8 - 1]);
        int n10 = (n9 + 29) / 30;
        int[] nArray4 = new int[4];
        int[] nArray5 = new int[n10];
        int[] nArray6 = new int[n10];
        int[] nArray7 = new int[n10];
        int[] nArray8 = new int[n10];
        int[] nArray9 = new int[n10];
        nArray6[0] = 1;
        c.g(n9, nArray2, 0, nArray8, 0);
        c.g(n9, nArray, 0, nArray9, 0);
        System.arraycopy(nArray9, 0, nArray7, 0, n10);
        int n11 = c.i(nArray9[0]);
        int n12 = c.h(n9);
        int n13 = -1;
        for (n8 = 0; n8 < n12; n8 += 30) {
            n13 = c.e(n13, nArray7[0], nArray8[0], nArray4);
            c.m(n10, nArray5, nArray6, nArray4, n11, nArray9);
            c.n(n10, nArray7, nArray8, nArray4);
        }
        n8 = nArray7[n10 - 1] >> 31;
        c.b(n10, n8, nArray7);
        c.c(n10, n8, nArray5, nArray9);
        c.d(n9, nArray5, 0, nArray3, 0);
        return e.b(n10, nArray7, 1) & e.c(n10, nArray8);
    }

    public static boolean k(int[] nArray, int[] nArray2, int[] nArray3) {
        int n8 = nArray.length;
        int n9 = (n8 << 5) - d.a(nArray[n8 - 1]);
        int n10 = (n9 + 29) / 30;
        int[] nArray4 = new int[4];
        int[] nArray5 = new int[n10];
        int[] nArray6 = new int[n10];
        int[] nArray7 = new int[n10];
        int[] nArray8 = new int[n10];
        int[] nArray9 = new int[n10];
        nArray6[0] = 1;
        c.g(n9, nArray2, 0, nArray8, 0);
        c.g(n9, nArray, 0, nArray9, 0);
        System.arraycopy(nArray9, 0, nArray7, 0, n10);
        int n11 = n10 - 1;
        int n12 = -1 - (d.a(nArray8[n11] | 1) - (n10 * 30 + 2 - n9));
        n8 = c.i(nArray9[0]);
        int n13 = c.h(n9);
        int n14 = n10;
        int n15 = 0;
        while (!e.f(n14, nArray8)) {
            if (n15 >= n13) {
                return false;
            }
            int n16 = n15 + 30;
            n12 = c.f(n12, nArray7[0], nArray8[0], nArray4);
            c.m(n10, nArray5, nArray6, nArray4, n8, nArray9);
            c.n(n14, nArray7, nArray8, nArray4);
            n15 = n14 - 1;
            int n17 = nArray7[n15];
            int n18 = nArray8[n15];
            int n19 = n14 - 2;
            n15 = n14;
            if ((n19 >> 31 | n17 ^ n17 >> 31 | n18 ^ n18 >> 31) == 0) {
                nArray7[n19] = nArray7[n19] | n17 << 30;
                nArray8[n19] = n18 << 30 | nArray8[n19];
                n15 = n14 - 1;
            }
            n14 = n15;
            n15 = n16;
        }
        n12 = nArray7[n14 - 1];
        n8 = n15 = nArray5[n11] >> 31;
        if (n15 < 0) {
            n8 = c.a(n10, nArray5, nArray9);
        }
        if (n12 >> 31 < 0) {
            n8 = c.l(n10, nArray5);
            c.l(n14, nArray7);
        }
        if (!e.e(n14, nArray7)) {
            return false;
        }
        if (n8 < 0) {
            c.a(n10, nArray5, nArray9);
        }
        c.d(n9, nArray5, 0, nArray3, 0);
        return true;
    }

    private static int l(int n8, int[] nArray) {
        int n9 = n8 - 1;
        int n10 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            nArray[n8] = 0x3FFFFFFF & (n10 -= nArray[n8]);
            n10 >>= 30;
        }
        nArray[n9] = n8 = n10 - nArray[n9];
        return n8 >> 30;
    }

    private static void m(int n8, int[] nArray, int[] nArray2, int[] nArray3, int n9, int[] nArray4) {
        int n10 = nArray3[0];
        int n11 = nArray3[1];
        int n12 = nArray3[2];
        int n13 = nArray3[3];
        int n14 = n8 - 1;
        int n15 = nArray[n14] >> 31;
        int n16 = nArray2[n14] >> 31;
        int n17 = (n10 & n15) + (n11 & n16);
        n16 = (n15 & n12) + (n16 & n13);
        n15 = nArray4[0];
        int n18 = nArray[0];
        int n19 = nArray2[0];
        long l8 = n10;
        long l9 = n18;
        long l10 = n11;
        long l11 = n19;
        long l12 = l8 * l9 + l10 * l11;
        long l13 = n12;
        long l14 = n13;
        l11 = l9 * l13 + l14 * l11;
        n11 = (int)l12;
        n13 = (int)l11;
        long l15 = n15;
        long l16 = n17 - (n11 * n9 + n17 & 0x3FFFFFFF);
        l9 = n16 - (n13 * n9 + n16 & 0x3FFFFFFF);
        l11 = l11 + l15 * l9 >> 30;
        l12 = l12 + l15 * l16 >> 30;
        for (n9 = 1; n9 < n8; ++n9) {
            n16 = nArray4[n9];
            n17 = nArray[n9];
            n11 = nArray2[n9];
            l15 = n17;
            long l17 = n11;
            long l18 = n16;
            n17 = n9 - 1;
            nArray[n17] = (int)(l12 += l8 * l15 + l10 * l17 + l18 * l16) & 0x3FFFFFFF;
            l12 >>= 30;
            nArray2[n17] = (int)(l11 += l13 * l15 + l14 * l17 + l18 * l9) & 0x3FFFFFFF;
            l11 >>= 30;
        }
        nArray[n14] = (int)l12;
        nArray2[n14] = (int)l11;
    }

    private static void n(int n8, int[] nArray, int[] nArray2, int[] nArray3) {
        int n9 = nArray3[0];
        int n10 = nArray3[1];
        int n11 = nArray3[2];
        int n12 = nArray3[3];
        int n13 = nArray[0];
        int n14 = nArray2[0];
        long l8 = n9;
        long l9 = n13;
        long l10 = n10;
        long l11 = n14;
        long l12 = n11;
        long l13 = n12;
        long l14 = l8 * l9 + l10 * l11 >> 30;
        l11 = l9 * l12 + l11 * l13 >> 30;
        for (n12 = 1; n12 < n8; ++n12) {
            n11 = nArray[n12];
            n10 = nArray2[n12];
            l9 = n11;
            long l15 = n10;
            n10 = n12 - 1;
            nArray[n10] = (int)(l14 += l8 * l9 + l10 * l15) & 0x3FFFFFFF;
            l14 >>= 30;
            nArray2[n10] = (int)(l11 += l12 * l9 + l15 * l13) & 0x3FFFFFFF;
            l11 >>= 30;
        }
        nArray[--n8] = (int)l14;
        nArray2[n8] = (int)l11;
    }
}

