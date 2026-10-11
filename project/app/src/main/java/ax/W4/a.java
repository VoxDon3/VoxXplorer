/*
 * Decompiled with CFR 0.152.
 */
package ax.W4;

import ax.X4.p;
import java.math.BigDecimal;
import java.util.Arrays;

public final class a {
    private static int a(int n8, long l8) {
        long l9 = (long)n8 - l8;
        if (l9 <= Integer.MAX_VALUE && l9 >= Integer.MIN_VALUE) {
            return (int)l9;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Scale out of range: ");
        stringBuilder.append(l9);
        stringBuilder.append(" while adjusting scale ");
        stringBuilder.append(n8);
        stringBuilder.append(" to exponent ");
        stringBuilder.append(l8);
        throw new NumberFormatException(stringBuilder.toString());
    }

    public static BigDecimal b(String string) {
        return a.c(string.toCharArray());
    }

    public static BigDecimal c(char[] cArray) {
        return a.d(cArray, 0, cArray.length);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static BigDecimal d(char[] object, int n8, int n9) {
        String string;
        if (n9 >= 500) return a.e(object, n8, n9, n9 / 10);
        try {
            return new BigDecimal((char[])object, n8, n9);
        }
        catch (NumberFormatException numberFormatException) {
        }
        catch (ArithmeticException arithmeticException) {}
        CharSequence charSequence = ((Throwable)((Object)string)).getMessage();
        string = charSequence;
        if (charSequence == null) {
            string = "Not a valid number representation";
        }
        if (n9 <= 1000) {
            object = new String((char[])object, n8, n9);
        } else {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(new String(Arrays.copyOfRange(object, n8, 1000)));
            ((StringBuilder)charSequence).append("(truncated, full length is ");
            ((StringBuilder)charSequence).append(((char[])object).length);
            ((StringBuilder)charSequence).append(" chars)");
            object = ((StringBuilder)charSequence).toString();
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("Value \"");
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append("\" can not be represented as `java.math.BigDecimal`, reason: ");
        ((StringBuilder)charSequence).append(string);
        throw new NumberFormatException(((StringBuilder)charSequence).toString());
    }

    /*
     * Unable to fully structure code
     */
    private static BigDecimal e(char[] var0, int var1_1, int var2_2, int var3_3) {
        var17_4 = var1_1 + var2_2;
        var10_5 = var1_1;
        var4_6 = -1;
        var2_2 = 0;
        var8_7 = -1;
        var11_8 = false;
        var9_9 = false;
        var7_10 = false;
        while (var1_1 < var17_4) {
            block26: {
                block18: {
                    block19: {
                        block25: {
                            block20: {
                                block24: {
                                    block21: {
                                        block23: {
                                            block22: {
                                                var5_11 = var0[var1_1];
                                                if (var5_11 == 43) break block19;
                                                if (var5_11 == 69 || var5_11 == 101) break block20;
                                                if (var5_11 == 45) break block21;
                                                if (var5_11 == 46) break block22;
                                                var5_11 = var10_5;
                                                var12_13 = var4_6;
                                                var13_14 = var2_2;
                                                var14_15 = var8_7;
                                                var6_12 = var11_8;
                                                var15_16 = var9_9;
                                                var16_17 = var7_10;
                                                if (var8_7 >= 0) {
                                                    var5_11 = var10_5;
                                                    var12_13 = var4_6;
                                                    var13_14 = var2_2;
                                                    var14_15 = var8_7;
                                                    var6_12 = var11_8;
                                                    var15_16 = var9_9;
                                                    var16_17 = var7_10;
                                                    if (var4_6 == -1) {
                                                        var13_14 = var2_2 + 1;
                                                        var5_11 = var10_5;
                                                        var12_13 = var4_6;
                                                        var14_15 = var8_7;
                                                        var6_12 = var11_8;
                                                        var15_16 = var9_9;
                                                        var16_17 = var7_10;
                                                    }
                                                }
                                                break block18;
                                            }
                                            if (var8_7 >= 0) break block23;
                                            var14_15 = var1_1;
                                            var5_11 = var10_5;
                                            var12_13 = var4_6;
                                            var13_14 = var2_2;
                                            var6_12 = var11_8;
                                            var15_16 = var9_9;
                                            var16_17 = var7_10;
                                            break block18;
                                        }
                                        throw new NumberFormatException("Multiple decimal points");
                                    }
                                    if (var4_6 >= 0) {
                                        if (!var9_9) {
                                            while (true) {
                                                var15_16 = true;
                                                var5_11 = var10_5;
                                                var12_13 = var4_6;
                                                var13_14 = var2_2;
                                                var14_15 = var8_7;
                                                var6_12 = var11_8;
                                                var16_17 = var7_10;
                                                break block18;
                                                break;
                                            }
                                        }
                                        throw new NumberFormatException("Multiple signs in exponent");
                                    }
                                    if (var11_8) break block24;
                                    var5_11 = var1_1 + 1;
                                    var6_12 = true;
                                    var16_17 = true;
                                    var12_13 = var4_6;
                                    var13_14 = var2_2;
                                    var14_15 = var8_7;
                                    var15_16 = var9_9;
                                    break block18;
                                }
                                throw new NumberFormatException("Multiple signs in number");
                            }
                            if (var4_6 >= 0) break block25;
                            var12_13 = var1_1;
                            var5_11 = var10_5;
                            var13_14 = var2_2;
                            var14_15 = var8_7;
                            var6_12 = var11_8;
                            var15_16 = var9_9;
                            var16_17 = var7_10;
                            break block18;
                        }
                        throw new NumberFormatException("Multiple exponent markers");
                    }
                    if (var4_6 >= 0) {
                        if (!var9_9) ** continue;
                        throw new NumberFormatException("Multiple signs in exponent");
                    }
                    if (var11_8) break block26;
                    var5_11 = var1_1 + 1;
                    var6_12 = true;
                    var16_17 = var7_10;
                    var15_16 = var9_9;
                    var14_15 = var8_7;
                    var13_14 = var2_2;
                    var12_13 = var4_6;
                }
                ++var1_1;
                var10_5 = var5_11;
                var4_6 = var12_13;
                var2_2 = var13_14;
                var8_7 = var14_15;
                var11_8 = var6_12;
                var9_9 = var15_16;
                var7_10 = var16_17;
                continue;
            }
            throw new NumberFormatException("Multiple signs in number");
        }
        if (var4_6 >= 0) {
            var1_1 = Integer.parseInt(new String((char[])var0, var4_6 + 1, var17_4 - var4_6 - 1));
            var2_2 = a.a(var2_2, var1_1);
        } else {
            var1_1 = 0;
            var4_6 = var17_4;
        }
        if (var8_7 >= 0) {
            var18_18 = a.g((char[])var0, var10_5, var8_7 - var10_5, var1_1, var3_3);
            var4_6 = var4_6 - var8_7 - 1;
            var18_18 = var18_18.add(a.g((char[])var0, var8_7 + 1, var4_6, var1_1 - var4_6, var3_3));
        } else {
            var18_18 = a.g((char[])var0, var10_5, var4_6 - var10_5, var1_1, var3_3);
        }
        var0 = var18_18;
        if (var2_2 != 0) {
            var0 = var18_18.setScale(var2_2);
        }
        var18_18 = var0;
        if (var7_10) {
            var18_18 = var0.negate();
        }
        return var18_18;
    }

    public static BigDecimal f(String string) {
        try {
            BigDecimal bigDecimal = p.a(string);
            return bigDecimal;
        }
        catch (NumberFormatException numberFormatException) {
            StringBuilder stringBuilder;
            if (string.length() > 1000) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(string.substring(0, 1000));
                stringBuilder.append(" [truncated]");
                string = stringBuilder.toString();
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Value \"");
            stringBuilder.append(string);
            stringBuilder.append("\" can not be represented as `java.math.BigDecimal`, reason: ");
            stringBuilder.append(numberFormatException.getMessage());
            throw new NumberFormatException(stringBuilder.toString());
        }
    }

    private static BigDecimal g(char[] cArray, int n8, int n9, int n10, int n11) {
        if (n9 > n11) {
            int n12 = n9 / 2;
            return a.g(cArray, n8, n12, n10 + n9 - n12, n11).add(a.g(cArray, n8 + n12, n9 - n12, n10, n11));
        }
        if (n9 == 0) {
            return BigDecimal.ZERO;
        }
        return new BigDecimal(cArray, n8, n9).scaleByPowerOfTen(n10);
    }
}

