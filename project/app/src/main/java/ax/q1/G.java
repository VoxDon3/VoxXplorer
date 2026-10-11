/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import ax.P0.E;
import ax.S0.i;
import ax.T0.h;
import java.util.Collections;
import java.util.List;

public final class G {
    public final List<byte[]> a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final float n;
    public final int o;
    public final String p;
    public final h.k q;

    private G(List<byte[]> list, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19, float f8, int n20, String string, h.k k8) {
        this.a = list;
        this.b = n8;
        this.c = n9;
        this.d = n10;
        this.e = n11;
        this.f = n12;
        this.g = n13;
        this.h = n14;
        this.i = n15;
        this.j = n16;
        this.k = n17;
        this.l = n18;
        this.m = n19;
        this.n = f8;
        this.o = n20;
        this.p = string;
        this.q = k8;
    }

    public static G a(ax.S0.G g8) throws E {
        return G.b(g8, false, null);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static G b(ax.S0.G var0, boolean var1_1, h.k var2_2) throws E {
        block19: {
            if (!var1_1) ** GOTO lbl5
            try {
                block20: {
                    var0.c0(4);
                    break block20;
lbl5:
                    // 1 sources

                    var0.c0(21);
                }
                var33_5 = var0.M() & 3;
                var31_6 = var0.M();
                var7_7 = var0.g();
                var19_8 = 0;
                var28_10 = 0;
                break block19;
            }
            catch (ArrayIndexOutOfBoundsException var38_3) {}
            var2_2 = new StringBuilder();
            var2_2.append("Error parsing");
            var0 = var1_1 != false ? "L-HEVC config" : "HEVC config";
            var2_2.append((String)var0);
            throw E.a(var2_2.toString(), var38_3);
        }
        for (var5_9 = 0; var5_9 < var31_6; ++var5_9) {
            var0.c0(1);
            var8_12 = var0.U();
            for (var6_11 = 0; var6_11 < var8_12; var28_10 += var9_13 + 4, ++var6_11) {
                var9_13 = var0.U();
                var0.c0(var9_13);
            }
        }
        var0.b0(var7_7);
        var40_14 = new byte[var28_10];
        var38_4 = null;
        var29_15 = 0;
        var16_16 = 0;
        var15_17 = -1;
        var14_18 = -1;
        var13_19 = -1;
        var12_20 = -1;
        var11_21 = -1;
        var10_22 = -1;
        var9_13 = -1;
        var8_12 = -1;
        var7_7 = -1;
        var6_11 = -1;
        var30_23 = -1;
        var3_24 = 1.0f;
        var5_9 = -1;
        while (true) {
            if (var29_15 < var31_6) {
                var34_37 = var0.M() & 63;
                var35_38 = var0.U();
                var39_41 = var2_2;
                var2_2 = var38_4;
                var38_4 = var39_41;
            } else {
                var0 = var28_10 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(var40_14);
                return new G(var0, var33_5 + 1, var15_17, var14_18, var13_19, var12_20, var11_21, var10_22, var9_13, var8_12, var7_7, var6_11, var30_23, var3_24, var5_9, (String)var38_4, (h.k)var2_2);
            }
            for (var32_36 = 0; var32_36 < var35_38; ++var32_36) {
                var36_39 = var0.U();
                var39_41 = ax.T0.h.a;
                System.arraycopy(var39_41, var19_8, var40_14, var16_16, ((Object)var39_41).length);
                var37_40 = var16_16 + ((Object)var39_41).length;
                System.arraycopy(var0.f(), var0.g(), var40_14, var37_40, var36_39);
                if (var34_37 == 32 && var32_36 == 0) {
                    var38_4 = ax.T0.h.y(var40_14, var37_40, var37_40 + var36_39);
                    var17_26 = var30_23;
                } else {
                    if (var34_37 == 33 && var32_36 == 0) {
                        var39_41 = ax.T0.h.u(var40_14, var37_40, var37_40 + var36_39, (h.k)var38_4);
                        var27_35 = var39_41.b + 1;
                        var26_34 = var39_41.h;
                        var25_33 = var39_41.i;
                        var24_32 = var39_41.j;
                        var23_31 = var39_41.k;
                        var22_30 = var39_41.e + 8;
                        var21_29 = var39_41.f + 8;
                        var20_28 = var39_41.n;
                        var18_27 = var39_41.o;
                        var17_26 = var39_41.p;
                        var4_25 = var39_41.l;
                        var16_16 = var39_41.m;
                        var39_41 = var39_41.c;
                        if (var39_41 != null) {
                            var2_2 = ax.S0.i.h(var39_41.a, var39_41.b, var39_41.c, var39_41.d, var39_41.e, var39_41.f);
                        }
                        var39_41 = var2_2;
                    } else {
                        var27_35 = var15_17;
                        var26_34 = var14_18;
                        var25_33 = var13_19;
                        var24_32 = var12_20;
                        var23_31 = var11_21;
                        var22_30 = var10_22;
                        var21_29 = var9_13;
                        var20_28 = var8_12;
                        var18_27 = var7_7;
                        var17_26 = var6_11;
                        var4_25 = var3_24;
                        var16_16 = var5_9;
                        var39_41 = var2_2;
                        if (var34_37 == 39) {
                            var27_35 = var15_17;
                            var26_34 = var14_18;
                            var25_33 = var13_19;
                            var24_32 = var12_20;
                            var23_31 = var11_21;
                            var22_30 = var10_22;
                            var21_29 = var9_13;
                            var20_28 = var8_12;
                            var18_27 = var7_7;
                            var17_26 = var6_11;
                            var4_25 = var3_24;
                            var16_16 = var5_9;
                            var39_41 = var2_2;
                            if (var32_36 == 0) {
                                var41_42 = ax.T0.h.t(var40_14, var37_40, var37_40 + var36_39);
                                var27_35 = var15_17;
                                var26_34 = var14_18;
                                var25_33 = var13_19;
                                var24_32 = var12_20;
                                var23_31 = var11_21;
                                var22_30 = var10_22;
                                var21_29 = var9_13;
                                var20_28 = var8_12;
                                var18_27 = var7_7;
                                var17_26 = var6_11;
                                var4_25 = var3_24;
                                var16_16 = var5_9;
                                var39_41 = var2_2;
                                if (var41_42 != null) {
                                    var27_35 = var15_17;
                                    var26_34 = var14_18;
                                    var25_33 = var13_19;
                                    var24_32 = var12_20;
                                    var23_31 = var11_21;
                                    var22_30 = var10_22;
                                    var21_29 = var9_13;
                                    var20_28 = var8_12;
                                    var18_27 = var7_7;
                                    var17_26 = var6_11;
                                    var4_25 = var3_24;
                                    var16_16 = var5_9;
                                    var39_41 = var2_2;
                                    if (var38_4 != null) {
                                        var16_16 = var41_42.d;
                                        var39_41 = var38_4.b;
                                        var19_8 = 0;
                                        var17_26 = var16_16 == ((h.a)var39_41.get((int)0)).b ? 4 : 5;
                                    }
                                }
                            }
                        }
                    }
                    var19_8 = 0;
                    var15_17 = var27_35;
                    var14_18 = var26_34;
                    var13_19 = var25_33;
                    var12_20 = var24_32;
                    var11_21 = var23_31;
                    var10_22 = var22_30;
                    var9_13 = var21_29;
                    var8_12 = var20_28;
                    var7_7 = var18_27;
                    var6_11 = var17_26;
                    var17_26 = var30_23;
                    var3_24 = var4_25;
                    var5_9 = var16_16;
                    var2_2 = var39_41;
                }
                var16_16 = var37_40 + var36_39;
                var0.c0(var36_39);
                var30_23 = var17_26;
            }
            ++var29_15;
            var39_41 = var38_4;
            var38_4 = var2_2;
            var2_2 = var39_41;
        }
    }

    public static G c(ax.S0.G g8, h.k k8) throws E {
        return G.b(g8, true, k8);
    }
}

