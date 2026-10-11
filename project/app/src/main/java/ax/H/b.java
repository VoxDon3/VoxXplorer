/*
 * Decompiled with CFR 0.152.
 */
package ax.H;

import ax.E.d;
import ax.E.i;
import ax.H.c;
import ax.H.e;
import ax.H.f;
import java.util.ArrayList;

public class b {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    static void a(f var0, d var1_1, int var2_2, int var3_3, c var4_4) {
        block74: {
            block73: {
                var24_5 = var4_4.a;
                var26_6 = var4_4.c;
                var17_7 = var4_4.b;
                var22_8 = var4_4.d;
                var25_9 = var4_4.e;
                var5_10 = var4_4.k;
                var10_11 = var0.Z[var2_2] == e.b.c0 ? 1 : 0;
                if (var2_2 == 0) {
                    var13_12 = var25_9.z0;
                    var8_13 = var13_12 == 0 ? 1 : 0;
                    var9_14 = var13_12 == 1 ? 1 : 0;
                    var11_15 = var8_13;
                    var12_16 = var9_14;
                    if (var13_12 == 2) {
                        var11_15 = var8_13;
lbl16:
                        // 2 sources

                        while (true) {
                            var8_13 = 1;
                            var12_16 = var9_14;
                            break block73;
                            break;
                        }
                    }
lbl20:
                    // 3 sources

                    while (true) {
                        var8_13 = 0;
                        break block73;
                        break;
                    }
                }
                var13_12 = var25_9.A0;
                var8_13 = var13_12 == 0 ? 1 : 0;
                var9_14 = var13_12 == 1 ? 1 : 0;
                var11_15 = var8_13;
                var12_16 = var9_14;
                ** while (var13_12 != 2)
lbl29:
                // 1 sources

                var11_15 = var8_13;
                ** while (true)
            }
            var19_17 = var24_5;
            var9_14 = 0;
            var14_18 = var10_11;
            var13_12 = var8_13;
            var8_13 = var9_14;
            while (true) {
                var23_24 /* !! */  = null;
                var20_22 = null;
                if (var8_13 != 0) break;
                var18_21 = var19_17.W[var3_3];
                var9_14 = var13_12 != 0 ? 1 : 4;
                var10_11 = var18_21.f();
                var23_24 /* !! */  = var19_17.Z[var2_2];
                var21_23 = e.b.d0;
                var16_20 = var23_24 /* !! */  == var21_23 && var19_17.y[var2_2] == 0;
                var23_24 /* !! */  = var18_21.f;
                var15_19 = var10_11;
                if (var23_24 /* !! */  != null) {
                    var15_19 = var10_11;
                    if (var19_17 != var24_5) {
                        var15_19 = var10_11 + var23_24 /* !! */ .f();
                    }
                }
                var10_11 = var9_14;
                if (var13_12 != 0) {
                    var10_11 = var9_14;
                    if (var19_17 != var24_5) {
                        var10_11 = var9_14;
                        if (var19_17 != var17_7) {
                            var10_11 = 8;
                        }
                    }
                }
                if ((var23_24 /* !! */  = var18_21.f) != null) {
                    if (var19_17 == var17_7) {
                        var1_1.h(var18_21.i, var23_24 /* !! */ .i, var15_19, 6);
                    } else {
                        var1_1.h(var18_21.i, var23_24 /* !! */ .i, var15_19, 8);
                    }
                    var9_14 = var10_11;
                    if (var16_20) {
                        var9_14 = var10_11;
                        if (var13_12 == 0) {
                            var9_14 = 5;
                        }
                    }
                    if (var19_17 == var17_7 && var13_12 != 0 && var19_17.h0(var2_2)) {
                        var9_14 = 5;
                    }
                    var1_1.e(var18_21.i, var18_21.f.i, var15_19, var9_14);
                }
                if (var14_18 != 0) {
                    if (var19_17.V() != 8 && var19_17.Z[var2_2] == var21_23) {
                        var18_21 = var19_17.W;
                        var1_1.h(var18_21[var3_3 + 1].i, var18_21[var3_3].i, 0, 5);
                    }
                    var1_1.h(var19_17.W[var3_3].i, var0.W[var3_3].i, 0, 8);
                }
                var21_23 = var19_17.W[var3_3 + 1].f;
                var18_21 = var20_22;
                if (var21_23 != null) {
                    var21_23 = var21_23.d;
                    var23_24 /* !! */  = var21_23.W[var3_3].f;
                    var18_21 = var20_22;
                    if (var23_24 /* !! */  != null) {
                        var18_21 = var23_24 /* !! */ .d != var19_17 ? var20_22 : var21_23;
                    }
                }
                if (var18_21 != null) {
                    var19_17 = var18_21;
                    continue;
                }
                var8_13 = 1;
            }
            if (var22_8 == null) break block74;
            var18_21 = var26_6.W;
            var8_13 = var3_3 + 1;
            if (var18_21[var8_13].f == null) break block74;
            var18_21 = var22_8.W[var8_13];
            if (var22_8.Z[var2_2] != e.b.d0 || var22_8.y[var2_2] != 0 || var13_12 != 0) ** GOTO lbl-1000
            var19_17 = var18_21.f;
            if (var19_17.d == var0) {
                var1_1.e(var18_21.i, var19_17.i, -var18_21.f(), 5);
            } else if (var13_12 != 0) {
                var19_17 = var18_21.f;
                if (var19_17.d == var0) {
                    var1_1.e(var18_21.i, var19_17.i, -var18_21.f(), 4);
                }
            }
            var1_1.j(var18_21.i, var26_6.W[var8_13].f.i, -var18_21.f(), 6);
        }
        if (var14_18 != 0) {
            var0 = var0.W;
            var8_13 = var3_3 + 1;
            var0 = var0[var8_13].i;
            var18_21 = var26_6.W[var8_13];
            var1_1.h((i)var0, var18_21.i, var18_21.f(), 8);
        }
        if ((var0 = var4_4.h) != null && (var9_14 = var0.size()) > 1) {
            var6_25 = var4_4.r != false && var4_4.t == false ? (float)var4_4.j : var5_10;
            var18_21 = null;
            var7_26 = 0.0f;
            for (var8_13 = 0; var8_13 < var9_14; ++var8_13) {
                var19_17 = (e)var0.get(var8_13);
                var5_10 = var19_17.D0[var2_2];
                if (var5_10 < 0.0f) {
                    if (var4_4.t) {
                        var19_17 = var19_17.W;
                        var1_1.e(var19_17[var3_3 + 1].i, var19_17[var3_3].i, 0, 4);
                        continue;
                    }
                    var5_10 = 1.0f;
                }
                if (var5_10 == 0.0f) {
                    var19_17 = var19_17.W;
                    var1_1.e(var19_17[var3_3 + 1].i, var19_17[var3_3].i, 0, 8);
                    continue;
                }
                if (var18_21 != null) {
                    var20_22 = var18_21.W;
                    var18_21 = var20_22[var3_3].i;
                    var10_11 = var3_3 + 1;
                    var20_22 = var20_22[var10_11].i;
                    var27_27 /* !! */  = var19_17.W;
                    var21_23 = var27_27 /* !! */ [var3_3].i;
                    var28_28 = var27_27 /* !! */ [var10_11].i;
                    var27_27 /* !! */  = var1_1.r();
                    var27_27 /* !! */ .l(var7_26, var6_25, var5_10, (i)var18_21, (i)var20_22, (i)var21_23, var28_28);
                    var1_1.d((ax.E.b)var27_27 /* !! */ );
                }
                var18_21 = var19_17;
                var7_26 = var5_10;
            }
        }
        if (var17_7 != null && (var17_7 == var22_8 || var13_12 != 0)) {
            var0 = var24_5.W[var3_3];
            var4_4 = var26_6.W;
            var8_13 = var3_3 + 1;
            var18_21 = var4_4[var8_13];
            var0 = var0.f;
            var0 = var0 != null ? var0.i : null;
            var4_4 = var18_21.f;
            var4_4 = var4_4 != null ? var4_4.i : null;
            var19_17 = var17_7.W[var3_3];
            if (var22_8 != null) {
                var18_21 = var22_8.W[var8_13];
            }
            if (var0 != null && var4_4 != null) {
                var5_10 = var2_2 == 0 ? var25_9.o0 : var25_9.p0;
                var2_2 = var19_17.f();
                var8_13 = var18_21.f();
                var1_1.c(var19_17.i, (i)var0, var2_2, var5_10, (i)var4_4, var18_21.i, var8_13, 7);
            }
        } else if (var11_15 != 0 && var17_7 != null) {
            var8_13 = var4_4.j;
            var9_14 = var8_13 > 0 && var4_4.i == var8_13 ? 1 : 0;
            var20_22 = var4_4 = var17_7;
            while (var4_4 != null) {
                var18_21 = var4_4.F0[var2_2];
                while (var18_21 != null && var18_21.V() == 8) {
                    var18_21 = var18_21.F0[var2_2];
                }
                if (var18_21 != null || var4_4 == var22_8) {
                    var19_17 = var4_4.W[var3_3];
                    var25_9 = var19_17.i;
                    var0 = var19_17.f;
                    var0 = var0 != null ? var0.i : null;
                    if (var20_22 != var4_4) {
                        var0 = var20_22.W[var3_3 + 1].i;
                    } else if (var4_4 == var17_7) {
                        var0 = var24_5.W[var3_3].f;
                        var0 = var0 != null ? var0.i : null;
                    }
                    var14_18 = var19_17.f();
                    var19_17 = var4_4.W;
                    var13_12 = var3_3 + 1;
                    var10_11 = var19_17[var13_12].f();
                    if (var18_21 != null) {
                        var21_23 = var18_21.W[var3_3];
                        var19_17 = var21_23.i;
                    } else {
                        var21_23 = var26_6.W[var13_12].f;
                        var19_17 = var21_23 != null ? var21_23.i : null;
                    }
                    var27_27 /* !! */  = var4_4.W[var13_12].i;
                    var8_13 = var10_11;
                    if (var21_23 != null) {
                        var8_13 = var10_11 + var21_23.f();
                    }
                    var10_11 = var14_18 + var20_22.W[var13_12].f();
                    if (var25_9 != null && var0 != null && var19_17 != null && var27_27 /* !! */  != null) {
                        if (var4_4 == var17_7) {
                            var10_11 = var17_7.W[var3_3].f();
                        }
                        if (var4_4 == var22_8) {
                            var8_13 = var22_8.W[var13_12].f();
                        }
                        var13_12 = var9_14 != 0 ? 8 : 5;
                        var1_1.c((i)var25_9, (i)var0, var10_11, 0.5f, (i)var19_17, (i)var27_27 /* !! */ , var8_13, var13_12);
                    }
                }
                if (var4_4.V() != 8) {
                    var20_22 = var4_4;
                }
                var4_4 = var18_21;
            }
        } else if (var12_16 != 0 && var17_7 != null) {
            var8_13 = var4_4.j;
            var8_13 = var8_13 > 0 && var4_4.i == var8_13 ? 1 : 0;
            var20_22 = var4_4 = var17_7;
            while (var4_4 != null) {
                var0 = var4_4.F0[var2_2];
                while (var0 != null && var0.V() == 8) {
                    var0 = var0.F0[var2_2];
                }
                if (var4_4 != var17_7 && var4_4 != var22_8 && var0 != null) {
                    var18_21 = var0;
                    if (var0 == var22_8) {
                        var18_21 = null;
                    }
                    var0 = var4_4.W[var3_3];
                    var27_27 /* !! */  = var0.i;
                    var19_17 = var0.f;
                    if (var19_17 != null) {
                        var19_17 = var19_17.i;
                    }
                    var19_17 = var20_22.W;
                    var14_18 = var3_3 + 1;
                    var28_28 = var19_17[var14_18].i;
                    var13_12 = var0.f();
                    var10_11 = var4_4.W[var14_18].f();
                    if (var18_21 != null) {
                        var19_17 = var18_21.W[var3_3];
                        var21_23 = var19_17.i;
                        var0 = var19_17.f;
                        var0 = var0 != null ? var0.i : null;
                    } else {
                        var25_9 = var22_8.W[var3_3];
                        var19_17 = var25_9 != null ? var25_9.i : null;
                        var0 = var4_4.W[var14_18].i;
                        var21_23 = var19_17;
                        var19_17 = var25_9;
                    }
                    var9_14 = var10_11;
                    if (var19_17 != null) {
                        var9_14 = var10_11 + var19_17.f();
                    }
                    var14_18 = var20_22.W[var14_18].f();
                    var10_11 = var8_13 != 0 ? 8 : 4;
                    if (var27_27 /* !! */  != null && var28_28 != null && var21_23 != null && var0 != null) {
                        var1_1.c((i)var27_27 /* !! */ , var28_28, var13_12 + var14_18, 0.5f, (i)var21_23, (i)var0, var9_14, var10_11);
                    }
                    var0 = var18_21;
                }
                if (var4_4.V() != 8) {
                    var20_22 = var4_4;
                }
                var4_4 = var0;
            }
            var0 = var17_7.W[var3_3];
            var4_4 = var24_5.W[var3_3].f;
            var18_21 = var22_8.W;
            var2_2 = var3_3 + 1;
            var19_17 = var18_21[var2_2];
            var18_21 = var26_6.W[var2_2].f;
            if (var4_4 != null) {
                if (var17_7 != var22_8) {
                    var1_1.e(var0.i, var4_4.i, var0.f(), 5);
                } else if (var18_21 != null) {
                    var1_1.c(var0.i, var4_4.i, var0.f(), 0.5f, var19_17.i, var18_21.i, var19_17.f(), 5);
                }
            }
            if (var18_21 != null && var17_7 != var22_8) {
                var1_1.e(var19_17.i, var18_21.i, -var19_17.f(), 5);
            }
        }
        if ((var11_15 != 0 || var12_16 != 0) && var17_7 != null && var17_7 != var22_8) {
            var21_23 = var17_7.W;
            var20_22 = var21_23[var3_3];
            var4_4 = var22_8;
            if (var22_8 == null) {
                var4_4 = var17_7;
            }
            var0 = var4_4.W;
            var19_17 = var0[++var3_3];
            var0 = var20_22.f;
            var18_21 = var0 != null ? var0.i : null;
            var0 = var19_17.f;
            var0 = var0 != null ? var0.i : null;
            if (var26_6 != var4_4) {
                var22_8 = var26_6.W[var3_3].f;
                var0 = var23_24 /* !! */ ;
                if (var22_8 != null) {
                    var0 = var22_8.i;
                }
            }
            if (var17_7 == var4_4) {
                var19_17 = var21_23[var3_3];
            }
            if (var18_21 != null && var0 != null) {
                var2_2 = var20_22.f();
                var3_3 = var4_4.W[var3_3].f();
                var1_1.c(var20_22.i, (i)var18_21, var2_2, 0.5f, (i)var0, var19_17.i, var3_3, 5);
            }
        }
    }

    public static void b(f f8, d d8, ArrayList<e> arrayList, int n8) {
        int n9;
        c[] cArray;
        int n10;
        int n11 = 0;
        if (n8 == 0) {
            n10 = f8.W0;
            cArray = f8.Z0;
            n9 = 0;
        } else {
            n10 = f8.X0;
            cArray = f8.Y0;
            n9 = 2;
        }
        while (n11 < n10) {
            c c8 = cArray[n11];
            c8.a();
            if (arrayList == null || arrayList.contains(c8.a)) {
                b.a(f8, d8, n8, n9, c8);
            }
            ++n11;
        }
    }
}

