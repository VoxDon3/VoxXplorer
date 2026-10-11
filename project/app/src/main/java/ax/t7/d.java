/*
 * Decompiled with CFR 0.152.
 */
package ax.t7;

import ax.q7.n;
import ax.t7.e;
import java.math.RoundingMode;

public final class d {
    static final byte[] a = new byte[]{19, 18, 18, 18, 18, 17, 17, 17, 16, 16, 16, 15, 15, 15, 15, 14, 14, 14, 13, 13, 13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};
    static final long[] b = new long[]{1L, 10L, 100L, 1000L, 10000L, 100000L, 1000000L, 10000000L, 100000000L, 1000000000L, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};
    static final long[] c = new long[]{3L, 31L, 316L, 3162L, 31622L, 316227L, 3162277L, 31622776L, 316227766L, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};
    static final long[] d = new long[]{1L, 1L, 2L, 6L, 24L, 120L, 720L, 5040L, 40320L, 362880L, 3628800L, 39916800L, 479001600L, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};
    static final int[] e = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, 206, 169, 143, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};
    static final int[] f = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, 419, 287, 214, 169, 139, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};
    private static final long[][] g = new long[][]{{291830L, 126401071349994536L}, {885594168L, 725270293939359937L, 3569819667048198375L}, {273919523040L, 15L, 7363882082L, 992620450144556L}, {47636622961200L, 2L, 2570940L, 211991001L, 3749873356L}, {7999252175582850L, 2L, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, {585226005592931976L, 2L, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, {Long.MAX_VALUE, 2L, 325L, 9375L, 28178L, 450775L, 9780504L, 1795265022L}};

    public static long a(long l8, long l9) {
        long l10 = l8 + l9;
        boolean bl = false;
        boolean bl2 = (l8 ^ l9) < 0L;
        if ((l8 ^ l10) >= 0L) {
            bl = true;
        }
        ax.t7.e.c(bl2 | bl, "checkedAdd", l8, l9);
        return l10;
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    public static long b(long l8, long l9, RoundingMode roundingMode) {
        n.n(roundingMode);
        long l10 = l8 / l9;
        long l11 = l8 - l9 * l10;
        long l12 = l11 - 0L;
        long l13 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (l13 == false) {
            return l10;
        }
        int n8 = (int)((l8 ^ l9) >> 63);
        boolean bl = true;
        n8 |= 1;
        int n9 = 0;
        block8: do {
            switch (n9 == 0 ? ax.t7.d$a.a[roundingMode.ordinal()] : n9) {
                default: {
                    throw new AssertionError();
                }
                case 6: 
                case 7: 
                case 8: {
                    l8 = Math.abs(l11);
                    long l14 = l8 - (Math.abs(l9) - l8) - 0L;
                    l13 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                    if (l13 == false) {
                        n9 = 4;
                        if (roundingMode == RoundingMode.HALF_UP) continue block8;
                        if (roundingMode != RoundingMode.HALF_EVEN) return l10;
                        if ((1L & l10) == 0L) return l10;
                        n9 = 4;
                        continue block8;
                    }
                    n9 = 4;
                    if (l13 > 0) continue block8;
                    return l10;
                }
                case 5: {
                    n9 = 4;
                    if (n8 > 0) continue block8;
                    return l10;
                }
                case 3: {
                    l8 = l10;
                    if (n8 >= 0) return l8;
                }
                case 4: {
                    return l10 + (long)n8;
                }
                case 1: {
                    if (l13 != false) {
                        bl = false;
                    }
                    ax.t7.e.g(bl);
                    return l10;
                }
                case 2: 
            }
            return l10;
        } while (true);
        return l10;
    }

    public static long c(long l8, long l9) {
        ax.t7.e.e("a", l8);
        ax.t7.e.e("b", l9);
        if (l8 == 0L) {
            return l9;
        }
        if (l9 == 0L) {
            return l8;
        }
        int n8 = Long.numberOfTrailingZeros(l8);
        long l10 = l8 >> n8;
        int n9 = Long.numberOfTrailingZeros(l9);
        l8 = l9 >> n9;
        for (l9 = l10; l9 != l8; l8 += l10, l9 >>= Long.numberOfTrailingZeros(l9)) {
            l10 = (l9 -= l8) >> 63 & l9;
            l9 = l9 - l10 - l10;
        }
        return l9 << Math.min(n8, n9);
    }

    public static long d(long l8, long l9) {
        long l10;
        block6: {
            block5: {
                int n8 = Long.numberOfLeadingZeros(l8) + Long.numberOfLeadingZeros(l8 ^ 0xFFFFFFFFFFFFFFFFL) + Long.numberOfLeadingZeros(l9) + Long.numberOfLeadingZeros(l9 ^ 0xFFFFFFFFFFFFFFFFL);
                if (n8 > 65) {
                    return l8 * l9;
                }
                int n9 = 0;
                n8 = n8 < 64 ? 1 : 0;
                long l11 = l8 - 0L;
                long l12 = l11 == 0L ? 0 : (l11 < 0L ? -1 : 1);
                int n10 = l12 < 0 ? 1 : 0;
                if (l9 == Long.MIN_VALUE) {
                    n9 = 1;
                }
                if ((n8 | n9 & n10) != 0) break block5;
                l10 = l8 * l9;
                if (l12 == false || l10 / l8 == l9) break block6;
            }
            return ((l8 ^ l9) >>> 63) + Long.MAX_VALUE;
        }
        return l10;
    }
}

