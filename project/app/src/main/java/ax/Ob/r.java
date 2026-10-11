/*
 * Decompiled with CFR 0.152.
 */
package ax.Ob;

import ax.Gb.l;
import ax.Ob.b;
import ax.Ob.q;

class r
extends q {
    public static Integer m(String string) {
        l.f(string, "<this>");
        return r.n(string, 10);
    }

    public static final Integer n(String string, int n8) {
        l.f(string, "<this>");
        b.a(n8);
        int n9 = string.length();
        if (n9 == 0) {
            return null;
        }
        int n10 = 0;
        char c8 = string.charAt(0);
        int n11 = l.h(c8, 48);
        int n12 = -2147483647;
        if (n11 < 0) {
            n11 = 1;
            if (n9 == 1) {
                return null;
            }
            if (c8 != '+') {
                if (c8 != '-') {
                    return null;
                }
                n12 = Integer.MIN_VALUE;
                c8 = '\u0001';
            } else {
                c8 = '\u0000';
            }
        } else {
            c8 = '\u0000';
            n11 = 0;
        }
        int n13 = -59652323;
        while (n11 < n9) {
            int n14;
            int n15;
            block14: {
                block15: {
                    n15 = b.b(string.charAt(n11), n8);
                    if (n15 < 0) {
                        return null;
                    }
                    n14 = n13;
                    if (n10 >= n13) break block14;
                    if (n13 != -59652323) break block15;
                    n14 = n13 = n12 / n8;
                    if (n10 >= n13) break block14;
                }
                return null;
            }
            if ((n10 *= n8) < n12 + n15) {
                return null;
            }
            n10 -= n15;
            ++n11;
            n13 = n14;
        }
        if (c8 != '\u0000') {
            return n10;
        }
        return -n10;
    }

    public static Long o(String string) {
        l.f(string, "<this>");
        return r.p(string, 10);
    }

    /*
     * Unable to fully structure code
     */
    public static final Long p(String var0, int var1_1) {
        l.f(var0, "<this>");
        b.a(var1_1);
        var4_2 = var0.length();
        var14_3 = null;
        if (var4_2 == 0) {
            return null;
        }
        var2_4 = 0;
        var5_5 = var0.charAt(0);
        var3_6 = l.h(var5_5, 48);
        var6_7 = -9223372036854775807L;
        if (var3_6 >= 0) ** GOTO lbl23
        var3_6 = 1;
        if (var4_2 == 1) {
            return null;
        }
        if (var5_5 != 43) {
            if (var5_5 != 45) {
                return null;
            }
            var6_7 = -9223372036854775808L;
            var2_4 = 1;
        } else {
            var2_4 = 1;
lbl23:
            // 2 sources

            var3_6 = 0;
        }
        var12_8 = 0L;
        var10_9 = -256204778801521550L;
        while (var2_4 < var4_2) {
            var5_5 = b.b(var0.charAt(var2_4), var1_1);
            if (var5_5 < 0) {
                return var14_3;
            }
            var8_10 = var10_9;
            if (var12_8 < var10_9) {
                if (var10_9 == -256204778801521550L) {
                    var8_10 = var10_9 = var6_7 / (long)var1_1;
                    if (var12_8 < var10_9) {
                        return var14_3;
                    }
                } else {
                    return var14_3;
                }
            }
            if ((var12_8 *= (long)var1_1) < var6_7 + (var10_9 = (long)var5_5)) {
                return var14_3;
            }
            var12_8 -= var10_9;
            ++var2_4;
            var10_9 = var8_10;
        }
        if (var3_6 != 0) {
            return var12_8;
        }
        return -var12_8;
    }
}

