/*
 * Decompiled with CFR 0.152.
 */
package ax.K1;

import ax.K1.a;
import ax.K1.i;
import ax.K1.o;
import ax.K1.x;
import ax.S0.G;
import ax.q1.S;
import java.io.IOException;

public final class s {
    private static final int[] a = new int[]{1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 0x33677336, 862414134, 0x33676736, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int n8, boolean bl) {
        if (n8 >>> 8 == 3368816) {
            return true;
        }
        if (n8 == 1751476579 && bl) {
            return true;
        }
        int[] nArray = a;
        int n9 = nArray.length;
        for (int i8 = 0; i8 < n9; ++i8) {
            if (nArray[i8] != n8) continue;
            return true;
        }
        return false;
    }

    public static S b(ax.q1.s s8) throws IOException {
        return s.c(s8, true, false);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static S c(ax.q1.s var0, boolean var1_1, boolean var2_2) throws IOException {
        block26: {
            block23: {
                block24: {
                    var12_3 = var0.getLength();
                    var18_4 = 4096L;
                    var16_5 = -1L;
                    cfr_temp_0 = var12_3 - -1L;
                    var8_6 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                    var14_7 = var18_4;
                    if (var8_6 != false) {
                        var14_7 = var12_3 > 4096L ? var18_4 : var12_3;
                    }
                    var5_8 = (int)var14_7;
                    var21_9 = new G(64);
                    var4_10 = 0;
                    var3_11 = 0;
                    block0: while (var4_10 < var5_8) {
                        var21_9.X(8);
                        var20_17 /* !! */  = var21_9.f();
                        var7_13 = 1;
                        if (!var0.h(var20_17 /* !! */ , 0, 8, true)) break;
                        var14_7 = var21_9.O();
                        var9_14 = var21_9.v();
                        if (var14_7 == 1L) {
                            var0.p(var21_9.f(), 8, 8);
                            var6_12 = 16;
                            var21_9.a0(16);
                            var14_7 = var21_9.F();
                        } else {
                            if (var14_7 == 0L && (var18_4 = var0.getLength()) != var16_5) {
                                var14_7 = var18_4 - var0.i() + (long)8;
                            }
                            var6_12 = 8;
                        }
                        var18_4 = var6_12;
                        if (var14_7 < var18_4) {
                            return new a(var9_14, var14_7, var6_12);
                        }
                        var6_12 = var4_10 + var6_12;
                        if (var9_14 == 1836019574) {
                            var4_10 = var5_8 += (int)var14_7;
                            if (var8_6 != false) {
                                var4_10 = var5_8;
                                if ((long)var5_8 > var12_3) {
                                    var4_10 = (int)var12_3;
                                }
                            }
                            var5_8 = var6_12;
                            var6_12 = var3_11;
                            var3_11 = var5_8;
                            var5_8 = var4_10;
lbl43:
                            // 2 sources

                            while (true) {
                                var4_10 = var3_11;
                                var3_11 = var6_12;
                                continue block0;
                                break;
                            }
                        }
                        if (var9_14 == 0x6D6F6F66 || var9_14 == 1836475768) break block23;
                        if (var9_14 == 1835295092) {
                            var3_11 = 1;
                        }
                        if ((long)var6_12 + var14_7 - var18_4 < (long)var5_8) break block24;
                    }
                    var2_2 = false;
                    break block26;
                }
                var10_15 = (int)(var14_7 - var18_4);
                var6_12 += var10_15;
                if (var9_14 == 1718909296) {
                    if (var10_15 < 8) {
                        return new a(var9_14, var10_15, 8);
                    }
                    var21_9.X(var10_15);
                    var0.p(var21_9.f(), 0, var10_15);
                    var9_14 = var21_9.v();
                    if (s.a(var9_14, var2_2)) {
                        var3_11 = 1;
                    }
                    var21_9.c0(4);
                    var10_15 = var21_9.a() / 4;
                    if (var3_11 == 0 && var10_15 > 0) {
                        var20_17 /* !! */  = (byte[])new int[var10_15];
                        for (var4_10 = 0; var4_10 < var10_15; ++var4_10) {
                            var20_17 /* !! */ [var4_10] = var11_16 = var21_9.v();
                            if (!s.a(var11_16, var2_2)) continue;
                            var3_11 = var7_13;
                            break;
                        }
                    } else {
                        var20_17 /* !! */  = null;
                    }
                    if (var3_11 == 0) {
                        return new x(var9_14, var20_17 /* !! */ );
                    }
                    var4_10 = var3_11;
                } else {
                    var4_10 = var3_11;
                    if (var10_15 != 0) {
                        var0.j(var10_15);
                        var4_10 = var3_11;
                    }
                }
                var3_11 = var6_12;
                var6_12 = var4_10;
                ** while (true)
            }
            var2_2 = true;
        }
        if (var3_11 == 0) {
            return o.a;
        }
        if (var1_1 != var2_2) {
            if (var2_2) {
                return i.b;
            }
            return i.c;
        }
        return null;
    }

    public static S d(ax.q1.s s8, boolean bl) throws IOException {
        return s.c(s8, false, bl);
    }
}

