package ax.u7;

import ax.q7.n;

/* loaded from: classes3.dex */
public final class k {
    public static int a(long j, long j2) {
        return h.d(c(j), c(j2));
    }

    public static long b(long j, long j2) {
        if (j2 < 0) {
            return a(j, j2) < 0 ? 0L : 1L;
        }
        if (j >= 0) {
            return j / j2;
        }
        long j3 = ((j >>> 1) / j2) << 1;
        return j3 + (a(j - (j3 * j2), j2) < 0 ? 0 : 1);
    }

    private static long c(long j) {
        return j ^ Long.MIN_VALUE;
    }

    public static String d(long j) {
        return e(j, 10);
    }

    public static String e(long j, int i) {
        n.g(i >= 2 && i <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i);
        if (j == 0) {
            return "0";
        }
        if (j > 0) {
            return Long.toString(j, i);
        }
        int i2 = 64;
        char[] cArr = new char[64];
        int i3 = i - 1;
        if ((i & i3) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
            do {
                i2--;
                cArr[i2] = Character.forDigit(((int) j) & i3, i);
                j >>>= numberOfTrailingZeros;
            } while (j != 0);
        } else {
            long b = (i & 1) == 0 ? (j >>> 1) / (i >>> 1) : b(j, i);
            long j2 = i;
            int i4 = 63;
            cArr[63] = Character.forDigit((int) (j - (b * j2)), i);
            while (b > 0) {
                i4--;
                cArr[i4] = Character.forDigit((int) (b % j2), i);
                b /= j2;
            }
            i2 = i4;
        }
        return new String(cArr, i2, 64 - i2);
    }
}
