/*
 * Decompiled with CFR 0.152.
 */
package ax.yc;

import ax.Gb.l;
import ax.xc.F;
import ax.xc.b;
import ax.xc.e;
import ax.xc.s;
import ax.xc.x;

public final class a {
    private static final byte[] a = F.a("0123456789abcdef");

    public static final e.a a(e e8, e.a a8) {
        l.f(e8, "<this>");
        l.f(a8, "unsafeCursor");
        a8 = b.g(a8);
        if (a8.q == null) {
            a8.q = e8;
            a8.c0 = true;
            return a8;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    public static final byte[] b() {
        return a;
    }

    public static final boolean c(x x8, int n8, byte[] byArray, int n9, int n10) {
        l.f(x8, "segment");
        l.f(byArray, "bytes");
        int n11 = x8.c;
        byte[] byArray2 = x8.a;
        while (n9 < n10) {
            int n12 = n11;
            x x9 = x8;
            int n13 = n8;
            if (n8 == n11) {
                x9 = x8.f;
                l.c(x9);
                byArray2 = x9.a;
                n13 = x9.b;
                n12 = x9.c;
            }
            if (byArray2[n13] != byArray[n9]) {
                return false;
            }
            n8 = n13 + 1;
            ++n9;
            n11 = n12;
            x8 = x9;
        }
        return true;
    }

    public static final String d(e e8, long l8) {
        long l9;
        l.f(e8, "<this>");
        if (l8 > 0L && e8.v(l9 = l8 - 1L) == 13) {
            String string = e8.a1(l9);
            e8.skip(2L);
            return string;
        }
        String string = e8.a1(l8);
        e8.skip(1L);
        return string;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final int e(e var0, s var1_1, boolean var2_2) {
        l.f(var0, "<this>");
        l.f(var1_1, "options");
        var12_3 = var0.q;
        if (var12_3 == null) {
            if (var2_2) {
                return -2;
            }
            return -1;
        }
        var0 = var12_3.a;
        var3_4 /* !! */  = var12_3.b;
        var4_5 = var12_3.c;
        var14_6 = var1_1.p();
        var11_7 = var12_3;
        var5_8 /* !! */  = 0;
        var6_9 = -1;
        var1_1 = var0;
        block0: while (true) {
            block18: {
                var10_13 = var14_6[var5_8 /* !! */ ];
                var7_10 = var5_8 /* !! */  + 2;
                if ((var5_8 /* !! */  = var14_6[var5_8 /* !! */  + 1]) != -1) {
                    var6_9 = var5_8 /* !! */ ;
                }
                if (var11_7 == null) ** GOTO lbl41
                if (var10_13 >= 0) break block18;
                var5_8 /* !! */  = var7_10;
                while (true) {
                    block22: {
                        block20: {
                            block19: {
                                block21: {
                                    var9_12 = var3_4 /* !! */  + 1;
                                    var3_4 /* !! */  = (int)var1_1[var3_4 /* !! */ ];
                                    var8_11 = var5_8 /* !! */  + 1;
                                    if ((var3_4 /* !! */  & 255) != var14_6[var5_8 /* !! */ ]) ** GOTO lbl68
                                    var5_8 /* !! */  = var8_11 == var7_10 + var10_13 * -1 ? 1 : 0;
                                    if (var9_12 != var4_5) break block19;
                                    l.c(var11_7);
                                    var0 = var11_7.f;
                                    l.c(var0);
                                    var4_5 = var0.b;
                                    var1_1 = var0.a;
                                    var3_4 /* !! */  = var0.c;
                                    if (var0 != var12_3) break block20;
                                    if (var5_8 /* !! */  == 0) break block21;
                                    var0 = null;
                                    break block20;
                                }
                                if (var2_2) {
                                    return -2;
                                }
                                ** GOTO lbl68
                            }
                            var0 = var11_7;
                            var3_4 /* !! */  = var4_5;
                            var4_5 = var9_12;
                        }
                        if (var5_8 /* !! */  == 0) break block22;
                        var7_10 = var14_6[var8_11];
                        var5_8 /* !! */  = var3_4 /* !! */ ;
                        var3_4 /* !! */  = var4_5;
                        ** GOTO lbl92
                    }
                    var5_8 /* !! */  = var3_4 /* !! */ ;
                    var3_4 /* !! */  = var4_5;
                    var4_5 = var5_8 /* !! */ ;
                    var5_8 /* !! */  = var8_11;
                    var11_7 = var0;
                }
            }
            var8_11 = var3_4 /* !! */  + 1;
            var5_8 /* !! */  = (int)var1_1[var3_4 /* !! */ ];
            var3_4 /* !! */  = var7_10;
            while (true) {
                block24: {
                    block23: {
                        if (var3_4 /* !! */  != var7_10 + var10_13) break block23;
lbl68:
                        // 3 sources

                        return var6_9;
                    }
                    if ((var5_8 /* !! */  & 255) != var14_6[var3_4 /* !! */ ]) break block24;
                    var7_10 = var9_12 = var14_6[var3_4 /* !! */  + var10_13];
                    var5_8 /* !! */  = var4_5;
                    var0 = var11_7;
                    var3_4 /* !! */  = var8_11;
                    if (var8_11 == var4_5) {
                        var13_14 = var11_7.f;
                        l.c(var13_14);
                        var4_5 = var13_14.b;
                        var11_7 = var13_14.a;
                        var8_11 = var13_14.c;
                        var1_1 = var11_7;
                        var7_10 = var9_12;
                        var5_8 /* !! */  = var8_11;
                        var0 = var13_14;
                        var3_4 /* !! */  = var4_5;
                        if (var13_14 == var12_3) {
                            var0 = null;
                            var3_4 /* !! */  = var4_5;
                            var5_8 /* !! */  = var8_11;
                            var7_10 = var9_12;
                            var1_1 = var11_7;
                        }
                    }
lbl92:
                    // 6 sources

                    if (var7_10 >= 0) {
                        return var7_10;
                    }
                    var7_10 = -var7_10;
                    var4_5 = var5_8 /* !! */ ;
                    var5_8 /* !! */  = var7_10;
                    var11_7 = var0;
                    continue block0;
                }
                ++var3_4 /* !! */ ;
            }
            break;
        }
    }

    public static /* synthetic */ int f(e e8, s s8, boolean bl, int n8, Object object) {
        if ((n8 & 2) != 0) {
            bl = false;
        }
        return ax.yc.a.e(e8, s8, bl);
    }
}

