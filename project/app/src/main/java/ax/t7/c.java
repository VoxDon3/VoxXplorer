/*
 * Decompiled with CFR 0.152.
 */
package ax.t7;

import ax.q7.n;
import ax.t7.e;
import ax.u7.f;
import java.math.RoundingMode;

public final class c {
    static final byte[] a = new byte[]{9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};
    static final int[] b = new int[]{1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    static final int[] c = new int[]{3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
    private static final int[] d = new int[]{1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
    static int[] e = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    public static int a(int n8, int n9) {
        long l8 = (long)n8 + (long)n9;
        int n10 = (int)l8;
        boolean bl = l8 == (long)n10;
        ax.t7.e.b(bl, "checkedAdd", n8, n9);
        return n10;
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    public static int b(int n8, int n9, RoundingMode roundingMode) {
        n.n(roundingMode);
        if (n9 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int n10 = n8 / n9;
        int n11 = n8 - n9 * n10;
        if (n11 == 0) {
            return n10;
        }
        boolean bl = true;
        int n12 = 1;
        int n13 = (n8 ^ n9) >> 31 | 1;
        int n14 = 0;
        block8: do {
            switch (n14 == 0 ? ax.t7.c$a.a[roundingMode.ordinal()] : n14) {
                default: {
                    throw new AssertionError();
                }
                case 6: 
                case 7: 
                case 8: {
                    n8 = Math.abs(n11);
                    n8 -= Math.abs(n9) - n8;
                    if (n8 == 0) {
                        n14 = 4;
                        if (roundingMode == RoundingMode.HALF_UP) continue block8;
                        n8 = roundingMode == RoundingMode.HALF_EVEN ? 1 : 0;
                        n9 = (n10 & 1) != 0 ? n12 : 0;
                        n14 = 4;
                        if ((n8 & n9) != 0) continue block8;
                        return n10;
                    }
                    n14 = 4;
                    if (n8 > 0) continue block8;
                    return n10;
                }
                case 5: {
                    n14 = 4;
                    if (n13 > 0) continue block8;
                    return n10;
                }
                case 3: {
                    n8 = n10;
                    if (n13 >= 0) return n8;
                }
                case 4: {
                    return n10 + n13;
                }
                case 1: {
                    if (n11 != 0) {
                        bl = false;
                    }
                    ax.t7.e.g(bl);
                    return n10;
                }
                case 2: 
            }
            return n10;
        } while (true);
        return n10;
    }

    public static boolean c(int n8) {
        boolean bl = false;
        boolean bl2 = n8 > 0;
        if ((n8 & n8 - 1) == 0) {
            bl = true;
        }
        return bl2 & bl;
    }

    static int d(int n8, int n9) {
        return ~(~(n8 - n9)) >>> 31;
    }

    public static int e(int n8, RoundingMode roundingMode) {
        ax.t7.e.f("x", n8);
        switch (ax.t7.c$a.a[roundingMode.ordinal()]) {
            default: {
                throw new AssertionError();
            }
            case 6: 
            case 7: 
            case 8: {
                int n9 = Integer.numberOfLeadingZeros(n8);
                return 31 - n9 + ax.t7.c.d(-1257966797 >>> n9, n8);
            }
            case 4: 
            case 5: {
                return 32 - Integer.numberOfLeadingZeros(n8 - 1);
            }
            case 1: {
                ax.t7.e.g(ax.t7.c.c(n8));
            }
            case 2: 
            case 3: 
        }
        return 31 - Integer.numberOfLeadingZeros(n8);
    }

    public static int f(int n8, int n9) {
        return f.n((long)n8 * (long)n9);
    }
}

