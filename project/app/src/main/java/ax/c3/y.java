/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import ax.X2.Q;

public class y {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static String a(int var0, long var1_1, boolean var3_2) {
        block14: {
            block16: {
                block17: {
                    block15: {
                        var9_3 = var3_2 != false ? 1000L : 1024L;
                        var8_4 = Q.b2() != false && var3_2 == false;
                        if (var1_1 < var9_3) {
                            var15_5 = "B";
                            var4_6 = 1.0;
                        } else {
                            var13_7 = var9_3 * var9_3;
                            if (var1_1 < var13_7) {
                                var4_6 = var9_3;
                                var15_5 = var8_4 ? "KiB" : (Q.b2() ? "kB" : "KB");
                            } else {
                                var11_8 = var13_7 * var9_3;
                                if (var1_1 < var11_8) {
                                    var4_6 = var13_7;
                                    var15_5 = var8_4 ? "MiB" : "MB";
                                } else if (var1_1 < (var9_3 *= var11_8)) {
                                    var4_6 = var11_8;
                                    var15_5 = var8_4 ? "GiB" : "GB";
                                } else {
                                    var4_6 = var9_3;
                                    var15_5 = var8_4 != false ? "TiB" : "TB";
                                }
                            }
                        }
                        var6_9 = (double)var1_1 / var4_6;
                        var17_10 = "%.0f";
                        var16_11 /* !! */  = var17_10;
                        if (var4_6 == 1.0) break block14;
                        if (!(var6_9 >= 100.0)) break block15;
                        var16_11 /* !! */  = var17_10;
                        break block14;
                    }
                    if (var6_9 < 1.0) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            var16_11 /* !! */  = "%.2f";
                            break block14;
                            break;
                        }
                    }
                    if (!(var6_9 < 10.0)) break block16;
                    if (var0 != 1) break block17;
lbl37:
                    // 2 sources

                    while (true) {
                        var16_11 /* !! */  = "%.1f";
                        break block14;
                        break;
                    }
                }
                if (var0 != 2) ** GOTO lbl-1000
                ** GOTO lbl37
            }
            if (var0 == 1) {
                var16_11 /* !! */  = var17_10;
            } else {
                if (var0 != 2) ** continue;
                ** continue;
            }
        }
        if (var6_9 == 0.0) {
            return String.format("%d %s", new Object[]{0, var15_5});
        }
        var17_10 = new StringBuilder();
        var17_10.append(var16_11 /* !! */ );
        var17_10.append(" %s");
        return String.format(var17_10.toString(), new Object[]{var6_9, var15_5});
    }

    public static String b(long l8, boolean bl) {
        return y.a(3, l8, bl);
    }

    public static String c(long l8, boolean bl) {
        return y.a(2, l8, bl);
    }

    public static String d(long l8, long l9, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        if (l8 >= 0L) {
            stringBuilder.append(y.e(l8, bl));
        }
        stringBuilder.append(" - ");
        if (l9 >= 0L) {
            stringBuilder.append(y.e(l9, bl));
        }
        return stringBuilder.toString();
    }

    public static String e(long l8, boolean bl) {
        return y.a(1, l8, bl);
    }
}

