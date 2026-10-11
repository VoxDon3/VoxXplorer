/*
 * Decompiled with CFR 0.152.
 */
package ax.Kd;

public abstract class e {
    public static int a(int n8, int n9, int[] nArray, int[] nArray2, int[] nArray3) {
        long l8 = -(n9 & 1);
        long l9 = 0L;
        for (n9 = 0; n9 < n8; ++n9) {
            nArray3[n9] = (int)(l9 += ((long)nArray[n9] & 0xFFFFFFFFL) + ((long)nArray2[n9] & (l8 & 0xFFFFFFFFL)));
            l9 >>>= 32;
        }
        return (int)l9;
    }

    public static int b(int n8, int[] nArray, int n9) {
        n9 ^= nArray[0];
        for (int i8 = 1; i8 < n8; ++i8) {
            n9 |= nArray[i8];
        }
        return (n9 >>> 1 | n9 & 1) - 1 >> 31;
    }

    public static int c(int n8, int[] nArray) {
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 |= nArray[i8];
        }
        return (n9 >>> 1 | n9 & 1) - 1 >> 31;
    }

    public static boolean d(int n8, int[] nArray, int[] nArray2) {
        --n8;
        while (n8 >= 0) {
            int n9 = nArray[n8] ^ Integer.MIN_VALUE;
            int n10 = Integer.MIN_VALUE ^ nArray2[n8];
            if (n9 < n10) {
                return false;
            }
            if (n9 > n10) {
                return true;
            }
            --n8;
        }
        return true;
    }

    public static boolean e(int n8, int[] nArray) {
        if (nArray[0] != 1) {
            return false;
        }
        for (int i8 = 1; i8 < n8; ++i8) {
            if (nArray[i8] == 0) continue;
            return false;
        }
        return true;
    }

    public static boolean f(int n8, int[] nArray) {
        for (int i8 = 0; i8 < n8; ++i8) {
            if (nArray[i8] == 0) continue;
            return false;
        }
        return true;
    }

    public static int g(int n8, int[] nArray, int[] nArray2, int[] nArray3) {
        long l8 = 0L;
        for (int i8 = 0; i8 < n8; ++i8) {
            long l9 = e.h(n8, nArray[i8], nArray2, 0, nArray3, i8);
            int n9 = i8 + n8;
            l8 = l8 + (l9 & 0xFFFFFFFFL) + ((long)nArray3[n9] & 0xFFFFFFFFL);
            nArray3[n9] = (int)l8;
            l8 >>>= 32;
        }
        return (int)l8;
    }

    public static int h(int n8, int n9, int[] nArray, int n10, int[] nArray2, int n11) {
        long l8;
        int n12;
        long l9 = n9;
        long l10 = 0L;
        n9 = 0;
        do {
            l8 = nArray[n10 + n9];
            n12 = n11 + n9;
            nArray2[n12] = (int)(l10 += (l8 & 0xFFFFFFFFL) * (l9 & 0xFFFFFFFFL) + ((long)nArray2[n12] & 0xFFFFFFFFL));
            l8 = l10 >>> 32;
            n12 = n9 + 1;
            l10 = l8;
            n9 = n12;
        } while (n12 < n8);
        return (int)l8;
    }

    public static int i(int n8, int[] nArray, int n9) {
        while (--n8 >= 0) {
            int n10 = nArray[n8];
            nArray[n8] = n9 << 31 | n10 >>> 1;
            n9 = n10;
        }
        return n9 << 31;
    }
}

