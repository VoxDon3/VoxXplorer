/*
 * Decompiled with CFR 0.152.
 */
package ax.u7;

import ax.q7.n;
import ax.u7.h;

public final class k {
    public static int a(long l8, long l9) {
        return h.d(k.c(l8), k.c(l9));
    }

    public static long b(long l8, long l9) {
        if (l9 < 0L) {
            if (k.a(l8, l9) < 0) {
                return 0L;
            }
            return 1L;
        }
        if (l8 >= 0L) {
            return l8 / l9;
        }
        int n8 = 1;
        long l10 = (l8 >>> 1) / l9 << 1;
        if (k.a(l8 - l10 * l9, l9) < 0) {
            n8 = 0;
        }
        return l10 + (long)n8;
    }

    private static long c(long l8) {
        return l8 ^ Long.MIN_VALUE;
    }

    public static String d(long l8) {
        return k.e(l8, 10);
    }

    public static String e(long l8, int n8) {
        boolean bl = n8 >= 2 && n8 <= 36;
        n.g(bl, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", n8);
        long l9 = l8 - 0L;
        long l10 = l9 == 0L ? 0 : (l9 < 0L ? -1 : 1);
        if (l10 == false) {
            return "0";
        }
        if (l10 > 0) {
            return Long.toString(l8, n8);
        }
        l10 = 64;
        char[] cArray = new char[64];
        int n9 = n8 - 1;
        if ((n8 & n9) == 0) {
            long l11;
            long l12;
            int n10 = Integer.numberOfTrailingZeros(n8);
            do {
                l11 = l10 - true;
                cArray[l11] = Character.forDigit((int)l8 & n9, n8);
                l12 = l8 >>> n10;
                l10 = l11;
                l8 = l12;
            } while (l12 != 0L);
            l10 = l11;
        } else {
            long l13;
            long l14 = n8;
            char c8 = Character.forDigit((int)(l8 - l13 * l14), n8);
            l10 = 63;
            cArray[63] = c8;
            for (l13 = (n8 & 1) == 0 ? (l8 >>> 1) / (long)(n8 >>> 1) : k.b(l8, n8); l13 > 0L; l13 /= l14) {
                cArray[--l10] = Character.forDigit((int)(l13 % l14), n8);
            }
        }
        return new String(cArray, (int)l10, 64 - l10);
    }
}

