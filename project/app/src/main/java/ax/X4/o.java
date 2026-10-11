/*
 * Decompiled with CFR 0.152.
 */
package ax.X4;

import ax.X4.C;
import ax.X4.f;
import ax.X4.i;
import ax.X4.k;
import ax.X4.l;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

final class o
extends f {
    /*
     * Enabled aggressive block sorting
     */
    private BigDecimal e(CharSequence object, int n8, int n9, int n10, int n11, boolean bl, int n12) {
        BigInteger bigInteger;
        Object object2;
        int n13;
        block8: {
            block9: {
                block6: {
                    block7: {
                        n13 = n11 - n9 - 1;
                        int n14 = n9 - n8;
                        if (n14 <= 0) break block6;
                        if (n14 <= 400) break block7;
                        object2 = k.c();
                        k.f(object2, n8, n9);
                        bigInteger = C.b((CharSequence)object, n8, n9, object2);
                        break block8;
                    }
                    bigInteger = C.b((CharSequence)object, n8, n9, null);
                    break block9;
                }
                bigInteger = BigInteger.ZERO;
            }
            object2 = null;
        }
        Object object3 = bigInteger;
        if (n13 > 0) {
            if (n11 - n10 > 400) {
                object3 = object2;
                if (object2 == null) {
                    object3 = k.c();
                }
                k.f(object3, n10, n11);
                object = C.b((CharSequence)object, n10, n11, (Map<Integer, BigInteger>)object3);
                object2 = object3;
            } else {
                object = C.b((CharSequence)object, n10, n11, null);
            }
            if (bigInteger.signum() != 0) {
                object = l.k(bigInteger, k.a(object2, n13)).add((BigInteger)object);
            }
            object3 = object;
        }
        object = object3;
        if (bl) {
            object = ((BigInteger)object3).negate();
        }
        return new BigDecimal((BigInteger)object, -n12);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public BigDecimal c(CharSequence var1_1, int var2_6, int var3_7) {
        block22: {
            block26: {
                var6_8 = var2_6;
                if (var3_7 < 32) ** GOTO lbl5
                try {
                    block28: {
                        block27: {
                            return this.d((CharSequence)var1_1, var2_6, var3_7);
lbl5:
                            // 1 sources

                            var11_9 = var3_7 + var6_8;
                            var7_10 = f.a((CharSequence)var1_1, var6_8, var11_9);
                            var21_11 = true;
                            if (var7_10 != 45) {
                                var21_11 = false;
                            }
                            if (var21_11) break block27;
                            var3_7 = var6_8;
                            var2_6 = var7_10;
                            if (var7_10 != 43) break block28;
                        }
                        if ((var2_6 = (int)f.a((CharSequence)var1_1, var3_7 = var6_8 + 1, var11_9)) == 0) ** GOTO lbl-1000
                    }
                    var9_12 = -1;
                    var7_10 = var3_7;
                    var13_13 = 0L;
                    var6_8 = 0;
                    var8_14 = var2_6;
                    var2_6 = var7_10;
                    var7_10 = var9_12;
                    ** GOTO lbl29
                }
                catch (ArithmeticException var1_2) {
                    break block22;
                }
lbl-1000:
                // 1 sources

                {
                    block32: {
                        block25: {
                            block29: {
                                var1_1 = new NumberFormatException("illegal syntax");
                                throw var1_1;
lbl29:
                                // 2 sources

                                while (var2_6 < var11_9) {
                                    var4_15 = var1_1.charAt(var2_6);
                                    if (i.b(var4_15)) {
                                        var13_13 = var13_13 * 10L + (long)var4_15 - 48L;
                                        var8_14 = var2_6;
                                    } else {
                                        var8_14 = var4_15;
                                        if (var4_15 != '.') break;
                                        var7_10 = var7_10 >= 0 ? 1 : 0;
                                        var7_10 = var6_8 | var7_10;
                                        {
                                            ** for (var6_8 = var2_6;
                                            ; var6_8 < var11_9 - 4 && (var8_14 = i.j((CharSequence)var1_1, (int)(var6_8 + 1))) >= 0; var6_8 += 4)
                                        }
lbl-1000:
                                        // 1 sources

                                        {
                                            var13_13 = var13_13 * 10000L + (long)var8_14;
                                            continue;
                                        }
lbl42:
                                        // 1 sources

                                        var8_14 = var6_8;
                                        var6_8 = var7_10;
                                        var7_10 = var2_6;
                                    }
                                    var2_6 = var8_14 + 1;
                                    var8_14 = var4_15;
                                }
                                if (var7_10 < 0) {
                                    var9_12 = var2_6 - var3_7;
                                    var10_16 = var2_6;
                                    var15_17 = 0L;
                                } else {
                                    var9_12 = var2_6 - var3_7 - 1;
                                    var15_17 = var7_10 - var2_6 + 1;
                                    var10_16 = var7_10;
                                }
                                if ((var8_14 | 32) != 101) break block29;
                                var8_14 = var2_6 + 1;
                                try {
                                    block31: {
                                        block30: {
                                            var5_18 = f.a((CharSequence)var1_1, var8_14, var11_9);
                                            var7_10 = var5_18 == '-' ? 1 : 0;
                                            if (var7_10 != 0) break block30;
                                            var4_15 = var5_18;
                                            if (var5_18 != '+') break block31;
                                        }
                                        var8_14 = var2_6 + 2;
                                        var4_15 = f.a((CharSequence)var1_1, var8_14, var11_9);
                                    }
                                    var6_8 |= i.b(var4_15) ^ 1;
                                    var17_19 = 0L;
                                    var12_20 = var4_15;
                                }
                                catch (ArithmeticException var1_3) {
                                    break block22;
                                }
                                while (true) lbl-1000:
                                // 2 sources

                                {
                                    if (var17_19 < 0x7FFFFFFFL) {
                                        var17_19 = var17_19 * 10L + (long)var12_20 - 48L;
                                    }
                                    ++var8_14;
                                    var4_15 = f.a((CharSequence)var1_1, var8_14, var11_9);
                                    if (i.b(var4_15)) break block23;
                                    var19_21 = var17_19;
                                    if (var7_10 == 0) break block24;
                                    break;
                                }
                                {
                                    block23: {
                                        block24: {
                                            var19_21 = -var17_19;
                                        }
                                        var15_17 += var19_21;
                                        var7_10 = var2_6;
                                        var2_6 = var8_14;
                                        break block25;
                                    }
                                    var12_20 = var4_15;
                                    ** while (true)
                                }
                            }
                            var7_10 = var11_9;
                        }
                        if (var6_8 != 0 || var2_6 < var11_9 || var9_12 == 0 || var9_12 > 1292782621) break block26;
                        if (var15_17 <= -2147483648L || var15_17 > 0x7FFFFFFFL) break block32;
                        if (var9_12 > 18) ** GOTO lbl102
                        var17_19 = var13_13;
                        if (!var21_11) ** GOTO lbl-1000
                        var17_19 = -var13_13;
lbl-1000:
                        // 2 sources

                        {
                            var1_1 = new BigDecimal(var17_19);
                            return var1_1.scaleByPowerOfTen((int)var15_17);
lbl102:
                            // 1 sources

                            return this.e((CharSequence)var1_1, var3_7, var10_16, var10_16 + 1, var7_10, var21_11, (int)var15_17);
                        }
                    }
                    ** try [egrp 6[TRYBLOCK] [13 : 592->628)] { 
lbl105:
                    // 1 sources

                    var1_1 = new NumberFormatException("value exceeds limits");
                    throw var1_1;
                }
lbl107:
                // 1 sources

                catch (ArithmeticException var1_4) {
                    break block22;
                }
            }
            var1_1 = new NumberFormatException("illegal syntax");
            throw var1_1;
        }
        var22_22 = new NumberFormatException("value exceeds limits");
        var22_22.initCause((Throwable)var1_5);
        throw var22_22;
    }

    BigDecimal d(CharSequence charSequence, int n8, int n9) {
        block25: {
            block28: {
                long l8;
                int n10;
                int n11;
                int n12;
                int n13;
                int n14;
                boolean bl;
                int n15;
                int n16;
                block24: {
                    int n17;
                    block29: {
                        char c8;
                        block31: {
                            block30: {
                                block27: {
                                    block26: {
                                        if (n9 > 1292782635) break block25;
                                        n16 = n9 + n8;
                                        n15 = f.a(charSequence, n8, n16);
                                        bl = false;
                                        if (n15 == 45) {
                                            bl = true;
                                        }
                                        if (bl) break block26;
                                        n14 = n8;
                                        n9 = n15;
                                        if (n15 != 43) break block27;
                                    }
                                    if ((n9 = (int)f.a(charSequence, n14 = n8 + 1, n16)) == 0) break block28;
                                }
                                n8 = n14;
                                while (true) {
                                    n17 = n16 - 8;
                                    n15 = n8;
                                    if (n8 >= n17) break;
                                    n15 = n8;
                                    if (!i.d(charSequence, n8)) break;
                                    n8 += 8;
                                }
                                while (n15 < n16 && charSequence.charAt(n15) == '0') {
                                    ++n15;
                                }
                                n13 = n15;
                                while (true) {
                                    n12 = n9;
                                    n8 = n13;
                                    if (n13 >= n17) break;
                                    n12 = n9;
                                    n8 = n13;
                                    if (!i.c(charSequence, n13)) break;
                                    n13 += 8;
                                }
                                while (true) {
                                    n13 = n12;
                                    if (n8 >= n16) break;
                                    c8 = charSequence.charAt(n8);
                                    n13 = c8;
                                    if (!i.b(c8)) break;
                                    ++n8;
                                    n12 = c8;
                                }
                                if (n13 == 46) {
                                    n12 = n8 + 1;
                                    while (true) {
                                        n9 = n12;
                                        if (n12 >= n17) break;
                                        n9 = n12;
                                        if (!i.d(charSequence, n12)) break;
                                        n12 += 8;
                                    }
                                    while (n9 < n16 && charSequence.charAt(n9) == '0') {
                                        ++n9;
                                    }
                                    n11 = n9;
                                    while (true) {
                                        n10 = n13;
                                        n12 = n11;
                                        if (n11 >= n17) break;
                                        n10 = n13;
                                        n12 = n11;
                                        if (!i.c(charSequence, n11)) break;
                                        n11 += 8;
                                    }
                                    while (n12 < n16) {
                                        c8 = charSequence.charAt(n12);
                                        n10 = c8;
                                        if (!i.b(c8)) break;
                                        ++n12;
                                        n10 = c8;
                                    }
                                    n13 = n8;
                                    n8 = n12;
                                    n17 = n10;
                                    n12 = n13;
                                } else {
                                    n12 = -1;
                                    n9 = -1;
                                    n17 = n13;
                                }
                                if (n12 < 0) {
                                    n11 = n8 - n15;
                                    n10 = n9 = n8;
                                    l8 = 0L;
                                    n12 = n9;
                                } else {
                                    n13 = n15 == n12 ? n8 - n9 : n8 - n15 - 1;
                                    l8 = n12 - n8 + 1;
                                    n10 = n12;
                                    n11 = n13;
                                    n12 = n9;
                                }
                                if ((n17 | 0x20) != 101) break block29;
                                n13 = n8 + 1;
                                char c9 = f.a(charSequence, n13, n16);
                                n9 = c9 == '-' ? 1 : 0;
                                if (n9 != 0) break block30;
                                c8 = c9;
                                if (c9 != '+') break block31;
                            }
                            n13 = n8 + 2;
                            c8 = f.a(charSequence, n13, n16);
                        }
                        int n18 = i.b(c8);
                        long l9 = 0L;
                        n17 = c8;
                        while (true) {
                            if (l9 < Integer.MAX_VALUE) {
                                l9 = l9 * 10L + (long)n17 - 48L;
                            }
                            c8 = f.a(charSequence, ++n13, n16);
                            if (!i.b(c8)) {
                                long l10 = l9;
                                if (n9 != 0) {
                                    l10 = -l9;
                                }
                                l8 += l10;
                                n17 = n18 ^ 1;
                                n9 = n8;
                                n8 = n17;
                                break block24;
                            }
                            n17 = c8;
                        }
                    }
                    n9 = n16;
                    n17 = 0;
                    n13 = n8;
                    n8 = n17;
                }
                if (n8 == 0 && n13 >= n16) {
                    if (n9 - n14 != 0) {
                        if (l8 >= Integer.MIN_VALUE && l8 <= Integer.MAX_VALUE && n11 <= 1292782621) {
                            return this.e(charSequence, n15, n10, n12, n9, bl, (int)l8);
                        }
                        throw new NumberFormatException("value exceeds limits");
                    }
                    throw new NumberFormatException("illegal syntax");
                }
                throw new NumberFormatException("illegal syntax");
            }
            throw new NumberFormatException("illegal syntax");
        }
        throw new NumberFormatException("illegal syntax");
    }
}

