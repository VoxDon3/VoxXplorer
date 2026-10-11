/*
 * Decompiled with CFR 0.152.
 */
package ax.t7;

import ax.q7.n;
import ax.t7.b;
import ax.t7.e;
import java.math.RoundingMode;

public final class a {
    private static final double a = Math.log(2.0);
    static final double[] b = new double[]{1.0, 2.0922789888E13, 2.631308369336935E35, 1.2413915592536073E61, 1.2688693218588417E89, 7.156945704626381E118, 9.916779348709496E149, 1.974506857221074E182, 3.856204823625804E215, 5.5502938327393044E249, 4.7147236359920616E284};

    public static boolean a(double d8, double d9, double d10) {
        e.d("tolerance", d10);
        return Math.copySign(d8 - d9, 1.0) <= d10 || d8 == d9 || Double.isNaN(d8) && Double.isNaN(d9);
        {
        }
    }

    public static boolean b(double d8) {
        return ax.t7.b.b(d8) && (d8 == 0.0 || 52 - Long.numberOfTrailingZeros(ax.t7.b.a(d8)) <= Math.getExponent(d8));
    }

    public static boolean c(double d8) {
        long l8;
        return d8 > 0.0 && ax.t7.b.b(d8) && ((l8 = ax.t7.b.a(d8)) & l8 - 1L) == 0L;
    }

    /*
     * Unable to fully structure code
     */
    public static int d(double var0, RoundingMode var2_1) {
        var6_2 = 0;
        var4_3 = 0;
        var7_4 = 0;
        var8_5 = var0 > 0.0 && ax.t7.b.b(var0) != false ? 1 : 0;
        n.e((boolean)var8_5, "x must be positive and finite");
        var5_6 = Math.getExponent(var0);
        if (!ax.t7.b.c(var0)) {
            return ax.t7.a.d(var0 * 4.503599627370496E15, var2_1) - 52;
        }
        var3_7 = var4_3;
        block0 : switch (ax.t7.a$a.a[var2_1.ordinal()]) {
            default: {
                throw new AssertionError();
            }
            case 6: 
            case 7: 
            case 8: {
                var0 = ax.t7.b.d(var0);
                var3_7 = var4_3;
                if (!(var0 * var0 > 2.0)) break;
                var3_7 = 1;
                break;
            }
            case 5: {
                var3_7 = var7_4;
                if (var5_6 >= 0) {
                    var3_7 = 1;
                }
                var8_5 = ax.t7.a.c(var0);
lbl24:
                // 2 sources

                while (true) {
                    var3_7 &= var8_5 ^ 1;
                    break block0;
                    break;
                }
            }
            case 4: {
                var3_7 = var6_2;
                if (var5_6 < 0) {
                    var3_7 = 1;
                }
                var8_5 = ax.t7.a.c(var0);
                ** continue;
            }
            case 3: {
                var3_7 = ax.t7.a.c(var0) ^ 1;
                break;
            }
            case 1: {
                e.g(ax.t7.a.c(var0));
                var3_7 = var4_3;
            }
            case 2: 
        }
        var4_3 = var5_6;
        if (var3_7 != 0) {
            var4_3 = var5_6 + 1;
        }
        return var4_3;
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    static double e(double d8, RoundingMode roundingMode) {
        if (!ax.t7.b.b(d8)) throw new ArithmeticException("input is infinite or NaN");
        double d9 = d8;
        int n8 = 0;
        block10: do {
            switch (n8 == 0 ? ax.t7.a$a.a[roundingMode.ordinal()] : n8) {
                default: {
                    throw new AssertionError();
                }
                case 8: {
                    d9 = Math.rint(d8);
                    if (Math.abs(d8 - d9) != 0.5) return d9;
                    d9 = d8;
                    n8 = 4;
                    continue block10;
                }
                case 7: {
                    d9 = Math.rint(d8);
                    if (Math.abs(d8 - d9) != 0.5) return d9;
                    return d8 + Math.copySign(0.5, d8);
                }
                case 6: {
                    return Math.rint(d8);
                }
                case 5: {
                    int n9;
                    if (ax.t7.a.b(d8)) {
                        d9 = d8;
                        n8 = 4;
                        continue block10;
                    }
                    long l8 = (long)d8;
                    if (d8 > 0.0) {
                        n9 = 1;
                        return l8 + (long)n9;
                    }
                    n9 = -1;
                    return l8 + (long)n9;
                }
                case 3: {
                    d9 = d8;
                    if (d8 <= 0.0) return d9;
                    if (!ax.t7.a.b(d8)) return (long)d8 + 1L;
                    d9 = d8;
                    n8 = 4;
                    continue block10;
                }
                case 2: {
                    d9 = d8;
                    if (d8 >= 0.0) return d9;
                    d9 = ax.t7.a.b(d8) ? d8 : (double)((long)d8 - 1L);
                }
                case 4: {
                    return d9;
                }
                case 1: 
            }
            break;
        } while (true);
        e.g(ax.t7.a.b(d8));
        return d8;
    }

    public static long f(double d8, RoundingMode roundingMode) {
        double d9 = ax.t7.a.e(d8, roundingMode);
        boolean bl = false;
        boolean bl2 = -9.223372036854776E18 - d9 < 1.0;
        if (d9 < 9.223372036854776E18) {
            bl = true;
        }
        e.a(bl2 & bl, d8, roundingMode);
        return (long)d9;
    }
}

