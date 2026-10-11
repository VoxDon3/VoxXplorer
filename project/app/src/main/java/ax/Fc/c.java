/*
 * Decompiled with CFR 0.152.
 */
package ax.Fc;

import ax.Fc.b;

class c {
    private static final int[] m = new int[]{1, 4, 13, 40, 121, 364, 1093, 3280, 9841, 29524, 88573, 265720, 797161, 2391484};
    private int a;
    private int b;
    private boolean c;
    private final int[] d = new int[1000];
    private final int[] e = new int[1000];
    private final int[] f = new int[1000];
    private final int[] g = new int[256];
    private final int[] h = new int[256];
    private final boolean[] i = new boolean[256];
    private final int[] j = new int[65537];
    private final char[] k;
    private int[] l;

    c(b.a a8) {
        this.k = a8.s;
    }

    /*
     * Unable to fully structure code
     */
    private void b(int[] var1_1, int[] var2_2, int var3_3, int var4_4) {
        block12: {
            block13: {
                block14: {
                    block16: {
                        this.h(0, var3_3, var4_4);
                        var13_5 = 0L;
                        var5_6 = 1;
                        block0: while (true) {
                            block15: {
                                var17_15 = var2_2;
                                if (var5_6 <= 0) break block12;
                                var7_8 = var5_6 - 1;
                                var18_16 = this.g(var7_8);
                                var11_12 = var18_16[1];
                                if (var11_12 - (var10_11 = var18_16[0]) < 10) {
                                    this.c(var1_1, var17_15, var10_11, var11_12);
                                    var5_6 = var7_8;
                                    continue;
                                }
                                var15_14 = (var13_5 = (var13_5 * 7621L + 1L) % 32768L) % 3L;
                                if (var15_14 == 0L) {
                                    var3_3 = var17_15[var1_1[var10_11]];
lbl17:
                                    // 3 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                                if (var15_14 != 1L) break block15;
                                var3_3 = var17_15[var1_1[var10_11 + var11_12 >>> 1]];
                                ** GOTO lbl17
                            }
                            var3_3 = var17_15[var1_1[var11_12]];
                            ** continue;
                            var15_14 = var3_3;
                            var3_3 = var4_4 = var11_12;
                            var9_10 = var6_7 = var10_11;
                            var8_9 = var6_7;
                            block2: while (var9_10 <= var4_4) {
                                var6_7 = var17_15[var1_1[var9_10]] - (int)var15_14;
                                if (var6_7 == 0) {
                                    this.i(var1_1, var9_10, var8_9);
                                    ++var8_9;
                                    var6_7 = var9_10 + 1;
                                    var9_10 = var4_4;
lbl36:
                                    // 2 sources

                                    while (true) {
                                        var4_4 = var9_10;
                                        var9_10 = var6_7;
                                        continue block2;
                                        break;
                                    }
                                }
                                if (var6_7 <= 0) break block13;
                            }
                            block4: while (var9_10 <= var4_4) {
                                var12_13 = var17_15[var1_1[var4_4]] - (int)var15_14;
                                if (var12_13 == 0) {
                                    this.i(var1_1, var4_4, var3_3);
                                    var6_7 = var3_3 - 1;
                                    while (true) {
                                        --var4_4;
                                        var17_15 = var2_2;
                                        var3_3 = var6_7;
                                        continue block4;
                                        break;
                                    }
                                }
                                var6_7 = var3_3;
                                if (var12_13 >= 0) ** continue;
                            }
                            if (var9_10 <= var4_4) break block14;
                            if (var3_3 >= var8_9) break;
                            var3_3 = var7_8;
lbl56:
                            // 3 sources

                            while (true) {
                                var5_6 = var3_3;
                                continue block0;
                                break;
                            }
                            break;
                        }
                        var6_7 = this.f(var8_9 - var10_11, var9_10 - var8_9);
                        this.j(var1_1, var10_11, var9_10 - var6_7, var6_7);
                        var6_7 = var3_3 - var4_4;
                        var3_3 = this.f(var11_12 - var3_3, var6_7);
                        this.j(var1_1, var4_4 + 1, var11_12 - var3_3 + 1, var3_3);
                        var3_3 = var9_10 + var10_11 - var8_9 - 1;
                        var4_4 = var11_12 - var6_7 + 1;
                        if (var3_3 - var10_11 <= var11_12 - var4_4) break block16;
                        this.h(var7_8, var10_11, var3_3);
                        this.h(var5_6, var4_4, var11_12);
                        var3_3 = var5_6 + 1;
                        ** GOTO lbl56
                    }
                    this.h(var7_8, var4_4, var11_12);
                    this.h(var5_6, var10_11, var3_3);
                    var3_3 = var5_6 + 1;
                    ** while (true)
                }
                this.i(var1_1, var9_10, var4_4);
                var6_7 = var4_4 - 1;
                var4_4 = ++var9_10;
lbl80:
                // 2 sources

                while (true) {
                    var17_15 = var2_2;
                    var9_10 = var6_7;
                    var6_7 = var4_4;
                    ** continue;
                    break;
                }
            }
            var6_7 = var4_4;
            var4_4 = ++var9_10;
            ** while (true)
        }
    }

    private void c(int[] nArray, int[] nArray2, int n8, int n9) {
        if (n8 != n9) {
            int n10;
            int n11;
            int n12;
            int n13;
            int n14;
            if (n9 - n8 > 3) {
                for (n14 = n9 - 4; n14 >= n8; --n14) {
                    n13 = nArray[n14];
                    n12 = nArray2[n13];
                    for (n11 = n14 + 4; n11 <= n9 && n12 > nArray2[n10 = nArray[n11]]; n11 += 4) {
                        nArray[n11 - 4] = n10;
                    }
                    nArray[n11 - 4] = n13;
                }
            }
            for (n14 = n9 - 1; n14 >= n8; --n14) {
                n13 = nArray[n14];
                n12 = nArray2[n13];
                for (n11 = n14 + 1; n11 <= n9 && n12 > nArray2[n10 = nArray[n11]]; ++n11) {
                    nArray[n11 - 1] = n10;
                }
                nArray[n11 - 1] = n13;
            }
        }
    }

    private int f(int n8, int n9) {
        if (n8 < n9) {
            return n8;
        }
        return n9;
    }

    private int[] g(int n8) {
        return new int[]{this.d[n8], this.e[n8]};
    }

    private void h(int n8, int n9, int n10) {
        this.d[n8] = n9;
        this.e[n8] = n10;
    }

    private void i(int[] nArray, int n8, int n9) {
        int n10 = nArray[n8];
        nArray[n8] = nArray[n9];
        nArray[n9] = n10;
    }

    private void j(int[] nArray, int n8, int n9, int n10) {
        while (n10 > 0) {
            this.i(nArray, n8, n9);
            ++n8;
            ++n9;
            --n10;
        }
    }

    private int[] k() {
        if (this.l == null) {
            this.l = new int[this.k.length / 2];
        }
        return this.l;
    }

    /*
     * Unable to fully structure code
     */
    private void l(b.a var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
        var18_6 = this.d;
        var20_7 = this.e;
        var17_8 = this.f;
        var16_9 = var1_1.r;
        var19_10 = var1_1.q;
        var18_6[0] = var2_2;
        var20_7[0] = var3_3;
        var17_8[0] = var4_4;
        var3_3 = 1;
        while ((var10_15 = var3_3 - 1) >= 0) {
            var11_16 = var18_6[var10_15];
            var7_12 = var20_7[var10_15];
            var13_18 = var17_8[var10_15];
            if (var7_12 - var11_16 < 20 || var13_18 > 10) ** GOTO lbl84
            var14_19 = var13_18 + 1;
            var12_17 = ax.Fc.c.o(var19_10[var16_9[var11_16] + var14_19], var19_10[var16_9[var7_12] + var14_19], var19_10[var16_9[var11_16 + var7_12 >>> 1] + var14_19]) & 255;
            var9_14 = var2_2 = var11_16;
            var4_4 = var6_11 = var7_12;
            var8_13 = var2_2;
            block1: while (var9_14 <= var6_11) {
                var15_20 = var16_9[var9_14];
                var2_2 = (var19_10[var15_20 + var14_19] & 255) - var12_17;
                if (var2_2 == 0) {
                    var16_9[var9_14] = var16_9[var8_13];
                    var16_9[var8_13] = var15_20;
                    ++var8_13;
                    var2_2 = var9_14 + 1;
                } else {
                    if (var2_2 >= 0) break;
                    var2_2 = var9_14 + 1;
                }
lbl31:
                // 3 sources

                while (true) {
                    var9_14 = var2_2;
                    continue block1;
                    break;
                }
            }
            var2_2 = var7_12;
            while (var9_14 <= var6_11) {
                var7_12 = var16_9[var6_11];
                var15_20 = (var19_10[var7_12 + var14_19] & 255) - var12_17;
                if (var15_20 == 0) {
                    var16_9[var6_11] = var16_9[var4_4];
                    var16_9[var4_4] = var7_12;
                    --var4_4;
                    --var6_11;
                    continue;
                }
                if (var15_20 <= 0) break;
                --var6_11;
            }
            if (var9_14 > var6_11) {
                if (var4_4 < var8_13) {
                    var18_6[var10_15] = var11_16;
                    var20_7[var10_15] = var2_2;
                    var17_8[var10_15] = var14_19;
                    var2_2 = var3_3;
                } else {
                    var12_17 = var8_13 - var11_16;
                    var7_12 = var9_14 - var8_13;
                    if (var12_17 < var7_12) {
                        var7_12 = var12_17;
                    }
                    ax.Fc.c.p(var16_9, var11_16, var9_14 - var7_12, var7_12);
                    var7_12 = var2_2 - var4_4;
                    var6_11 = var4_4 - var6_11;
                    var4_4 = var7_12 < var6_11 ? var7_12 : var6_11;
                    ax.Fc.c.p(var16_9, var9_14, var2_2 - var4_4 + 1, var4_4);
                    var4_4 = var9_14 + var11_16 - var8_13;
                    var6_11 = var2_2 - var6_11;
                    var18_6[var10_15] = var11_16;
                    var20_7[var10_15] = var4_4 - 1;
                    var17_8[var10_15] = var13_18;
                    var18_6[var3_3] = var4_4;
                    var20_7[var3_3] = var6_11;
                    var17_8[var3_3] = var14_19;
                    var4_4 = var3_3 + 1;
                    var18_6[var4_4] = var6_11 + 1;
                    var20_7[var4_4] = var2_2;
                    var17_8[var4_4] = var13_18;
                    var2_2 = var3_3 + 2;
                }
            } else {
                var7_12 = var16_9[var9_14];
                var16_9[var9_14] = var16_9[var6_11];
                var16_9[var6_11] = var7_12;
                --var6_11;
                var7_12 = var2_2;
                var2_2 = ++var9_14;
                ** continue;
lbl84:
                // 1 sources

                if (this.m(var1_1, var11_16, var7_12, var13_18, var5_5)) break;
                var2_2 = var10_15;
            }
            var3_3 = var2_2;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean m(b.a var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
        var6_6 = var3_3 - var2_2 + 1;
        if (var6_6 < 2) {
            return this.c != false && this.a > this.b;
        }
        var7_7 = 0;
        while (ax.Fc.c.m[var7_7] < var6_6) {
            ++var7_7;
        }
        var30_8 = var1_1.r;
        var32_9 = this.k;
        var31_10 /* !! */  = var1_1.q;
        var19_11 = var5_5 + 1;
        var28_12 = this.c;
        var18_13 = this.b;
        var6_6 = this.a;
        var9_14 = var7_7;
        block1: while ((var16_22 = var9_14 - 1) >= 0) {
            var20_24 = ax.Fc.c.m[var16_22];
            var7_7 = var15_21 = var2_2 + var20_24;
            var8_15 /* !! */  = var6_6;
            var29_32 = var30_8;
            var1_1 = var31_10 /* !! */ ;
            while (true) {
                var31_10 /* !! */  = (byte[])var1_1;
                var30_8 = var29_32;
                var9_14 = var16_22;
                var6_6 = var8_15 /* !! */ ;
                if (var7_7 > var3_3) continue block1;
                var9_14 = 3;
                var6_6 = var8_15 /* !! */ ;
                while (var7_7 <= var3_3 && (var17_23 = var9_14 - 1) >= 0) {
                    block13: {
                        block28: {
                            block14: {
                                block15: {
                                    block16: {
                                        block17: {
                                            block18: {
                                                block19: {
                                                    var21_25 = var29_32[var7_7];
                                                    var22_26 = var21_25 + var4_4;
                                                    var9_14 = var7_7;
                                                    var12_18 = false;
                                                    var10_16 /* !! */  = 0;
                                                    block4: while (true) {
                                                        block27: {
                                                            block20: {
                                                                block21: {
                                                                    block22: {
                                                                        block23: {
                                                                            block24: {
                                                                                block25: {
                                                                                    block26: {
                                                                                        if (var12_18) {
                                                                                            var29_32[var9_14] = var10_16 /* !! */ ;
                                                                                            var8_15 /* !! */  = var9_14 - var20_24;
                                                                                            if (var8_15 /* !! */  <= var15_21 - 1) break block13;
                                                                                            var9_14 = var8_15 /* !! */ ;
                                                                                        } else {
                                                                                            var12_18 = true;
                                                                                        }
                                                                                        var13_19 = var29_32[var9_14 - var20_24];
                                                                                        var8_15 /* !! */  = var13_19 + var4_4;
                                                                                        var11_17 /* !! */  = var1_1[var8_15 /* !! */  + 1];
                                                                                        var14_20 /* !! */  = var1_1[var22_26 + 1];
                                                                                        if (var11_17 /* !! */  != var14_20 /* !! */ ) break block14;
                                                                                        var11_17 /* !! */  = var1_1[var8_15 /* !! */  + 2];
                                                                                        var14_20 /* !! */  = var1_1[var22_26 + 2];
                                                                                        if (var11_17 /* !! */  != var14_20 /* !! */ ) break block15;
                                                                                        var14_20 /* !! */  = var1_1[var8_15 /* !! */  + 3];
                                                                                        var11_17 /* !! */  = var1_1[var22_26 + 3];
                                                                                        if (var14_20 /* !! */  != var11_17 /* !! */ ) break block16;
                                                                                        var14_20 /* !! */  = var1_1[var8_15 /* !! */  + 4];
                                                                                        var11_17 /* !! */  = var1_1[var22_26 + 4];
                                                                                        if (var14_20 /* !! */  != var11_17 /* !! */ ) break block17;
                                                                                        var11_17 /* !! */  = var1_1[var8_15 /* !! */  + 5];
                                                                                        var14_20 /* !! */  = var1_1[var22_26 + 5];
                                                                                        if (var11_17 /* !! */  != var14_20 /* !! */ ) break block18;
                                                                                        var14_20 /* !! */  = var8_15 /* !! */  + 6;
                                                                                        var23_27 = var1_1[var14_20 /* !! */ ];
                                                                                        var11_17 /* !! */  = var22_26 + 6;
                                                                                        if (var23_27 != (var8_15 /* !! */  = (int)var1_1[var11_17 /* !! */ ])) break block19;
                                                                                        var10_16 /* !! */  = var5_5;
                                                                                        var8_15 /* !! */  = var6_6;
                                                                                        var6_6 = var13_19;
                                                                                        var13_19 = var10_16 /* !! */ ;
                                                                                        while (true) {
                                                                                            var10_16 /* !! */  = var8_15 /* !! */ ;
                                                                                            if (var13_19 <= 0) break block4;
                                                                                            var24_28 = var14_20 /* !! */  + true;
                                                                                            var25_29 = var1_1[var24_28];
                                                                                            var23_27 = var11_17 /* !! */  + true;
                                                                                            var26_30 /* !! */  = var1_1[var23_27];
                                                                                            if (var25_29 != var26_30 /* !! */ ) break block20;
                                                                                            var25_29 = (reference)var32_9[var14_20 /* !! */ ];
                                                                                            var26_30 /* !! */  = var32_9[var11_17 /* !! */ ];
                                                                                            if (var25_29 != var26_30 /* !! */ ) break block21;
                                                                                            var25_29 = var14_20 /* !! */  + 2;
                                                                                            var26_30 /* !! */  = var1_1[var25_29];
                                                                                            var10_16 /* !! */  = (int)(var11_17 /* !! */  + 2);
                                                                                            var27_31 = var1_1[var10_16 /* !! */ ];
                                                                                            if (var26_30 /* !! */  != var27_31) break block22;
                                                                                            if ((var24_28 = (reference)var32_9[var24_28]) != (var23_27 = (reference)var32_9[var23_27])) break block23;
                                                                                            var24_28 = var14_20 /* !! */  + 3;
                                                                                            var26_30 /* !! */  = var1_1[var24_28];
                                                                                            var23_27 = var11_17 /* !! */  + 3;
                                                                                            var27_31 = var1_1[var23_27];
                                                                                            if (var26_30 /* !! */  != var27_31) break block24;
                                                                                            var26_30 /* !! */  = var32_9[var10_16 /* !! */ ];
                                                                                            if ((var25_29 = (reference)var32_9[var25_29]) != var26_30 /* !! */ ) break block25;
                                                                                            var10_16 /* !! */  = (int)(var14_20 /* !! */  + 4);
                                                                                            var25_29 = var1_1[var10_16 /* !! */ ];
                                                                                            if (var25_29 != (var11_17 /* !! */  = var1_1[var14_20 /* !! */  = var11_17 /* !! */  + 4])) break block26;
                                                                                            var11_17 /* !! */  = var32_9[var24_28];
                                                                                            if (var11_17 /* !! */  != (var23_27 = (reference)var32_9[var23_27])) break;
                                                                                            var11_17 /* !! */  = var10_16 /* !! */ ;
                                                                                            if (var10_16 /* !! */  >= var19_11) {
                                                                                                var11_17 /* !! */  = var10_16 /* !! */  - var19_11;
                                                                                            }
                                                                                            var10_16 /* !! */  = (int)var14_20 /* !! */ ;
                                                                                            if (var14_20 /* !! */  >= var19_11) {
                                                                                                var10_16 /* !! */  = (int)(var14_20 /* !! */  - var19_11);
                                                                                            }
                                                                                            ++var8_15 /* !! */ ;
                                                                                            var14_20 /* !! */  = var11_17 /* !! */ ;
                                                                                            var13_19 -= 4;
                                                                                            var11_17 /* !! */  = var10_16 /* !! */ ;
                                                                                        }
                                                                                        var10_16 /* !! */  = var8_15 /* !! */ ;
                                                                                        if (var11_17 /* !! */  <= var23_27) break;
                                                                                        break block27;
                                                                                    }
                                                                                    var10_16 /* !! */  = var8_15 /* !! */ ;
                                                                                    if ((var25_29 & 255) <= (var11_17 /* !! */  & 255)) break;
                                                                                    break block27;
                                                                                }
                                                                                var10_16 /* !! */  = var8_15 /* !! */ ;
                                                                                if (var25_29 <= var26_30 /* !! */ ) break;
                                                                                break block27;
                                                                            }
                                                                            var10_16 /* !! */  = var8_15 /* !! */ ;
                                                                            if ((var26_30 /* !! */  & 255) <= (var27_31 & 255)) break;
                                                                            break block27;
                                                                        }
                                                                        var10_16 /* !! */  = var8_15 /* !! */ ;
                                                                        if (var24_28 <= var23_27) break;
                                                                        break block27;
                                                                    }
                                                                    var10_16 /* !! */  = var8_15 /* !! */ ;
                                                                    if ((var26_30 /* !! */  & 255) <= (var27_31 & 255)) break;
                                                                    break block27;
                                                                }
                                                                var10_16 /* !! */  = var8_15 /* !! */ ;
                                                                if (var25_29 <= var26_30 /* !! */ ) break;
                                                                break block27;
                                                            }
                                                            var10_16 /* !! */  = var8_15 /* !! */ ;
                                                            if ((var25_29 & 255) <= (var26_30 /* !! */  & 255)) break;
                                                        }
lbl140:
                                                        // 2 sources

                                                        while (true) {
                                                            var10_16 /* !! */  = var6_6;
                                                            var6_6 = var8_15 /* !! */ ;
                                                            continue block4;
                                                            break;
                                                        }
                                                        break;
                                                    }
lbl144:
                                                    // 15 sources

                                                    while (true) {
                                                        var8_15 /* !! */  = var9_14;
                                                        var6_6 = var10_16 /* !! */ ;
                                                        break block13;
                                                        break;
                                                    }
                                                }
                                                var10_16 /* !! */  = var6_6;
                                                if ((var23_27 & 255) <= (var8_15 /* !! */  & 255)) ** GOTO lbl144
                                                break block28;
                                            }
                                            var10_16 /* !! */  = var6_6;
                                            if ((var11_17 /* !! */  & 255) <= (var14_20 /* !! */  & 255)) ** GOTO lbl144
                                            break block28;
                                        }
                                        var10_16 /* !! */  = var6_6;
                                        if ((var14_20 /* !! */  & 255) <= (var11_17 /* !! */  & 255)) ** GOTO lbl144
                                        break block28;
                                    }
                                    var10_16 /* !! */  = var6_6;
                                    if ((var14_20 /* !! */  & 255) <= (var11_17 /* !! */  & 255)) ** GOTO lbl144
                                    break block28;
                                }
                                var10_16 /* !! */  = var6_6;
                                if ((var11_17 /* !! */  & 255) <= (var14_20 /* !! */  & 255)) ** GOTO lbl144
                                break block28;
                            }
                            var10_16 /* !! */  = var6_6;
                            if ((var11_17 /* !! */  & 255) > (var14_20 /* !! */  & 255)) ** break;
                            ** continue;
                        }
                        var8_15 /* !! */  = var6_6;
                        var6_6 = var13_19;
                        ** continue;
                    }
                    var29_32[var8_15 /* !! */ ] = var21_25;
                    ++var7_7;
                    var9_14 = var17_23;
                }
                if (var28_12 && var7_7 <= var3_3 && var6_6 > var18_13) break block1;
                var8_15 /* !! */  = var6_6;
            }
        }
        this.a = var6_6;
        return var28_12 != false && var6_6 > var18_13;
    }

    private static byte o(byte by, byte by2, byte by3) {
        block6: {
            block7: {
                block8: {
                    block5: {
                        block4: {
                            if (by >= by2) break block4;
                            if (by2 < by3) break block5;
                            if (by >= by3) break block6;
                            break block7;
                        }
                        if (by2 <= by3) break block8;
                    }
                    return by2;
                }
                if (by <= by3) break block6;
            }
            return by3;
        }
        return by;
    }

    private static void p(int[] nArray, int n8, int n9, int n10) {
        int n11 = n9;
        for (n9 = n8; n9 < n10 + n8; ++n9) {
            int n12 = nArray[n9];
            nArray[n9] = nArray[n11];
            nArray[n11] = n12;
            ++n11;
        }
    }

    void a(b.a a8, int n8) {
        this.b = n8 * 30;
        int n9 = 0;
        this.a = 0;
        this.c = true;
        if (n8 + 1 < 10000) {
            this.d(a8, n8);
        } else {
            this.n(a8, n8);
            if (this.c && this.a > this.b) {
                this.d(a8, n8);
            }
        }
        int[] nArray = a8.r;
        a8.t = -1;
        while (n9 <= n8) {
            if (nArray[n9] == 0) {
                a8.t = n9;
                return;
            }
            ++n9;
        }
    }

    final void d(b.a a8, int n8) {
        Object[] objectArray = a8.q;
        int n9 = n8 + 1;
        byte by = objectArray[n9];
        int n10 = 0;
        objectArray[0] = by;
        this.e(a8.r, (byte[])objectArray, n9);
        int n11 = 0;
        while (true) {
            if (n11 >= n9) break;
            objectArray = a8.r;
            objectArray[n11] = objectArray[n11] - 1;
            ++n11;
        }
        for (int i8 = n10; i8 < n9; ++i8) {
            objectArray = a8.r;
            if (objectArray[i8] != -1) continue;
            objectArray[i8] = n8;
            return;
        }
    }

    /*
     * Exception decompiling
     */
    final void e(int[] var1_1, byte[] var2_2, int var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: CONTINUE without a while class org.benf.cfr.reader.bytecode.analysis.parse.statement.AssignmentSimple
         *     at org.benf.cfr.reader.bytecode.analysis.parse.statement.GotoStatement.getTargetStartBlock(GotoStatement.java:102)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.statement.IfStatement.getStructuredStatement(IfStatement.java:110)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.getStructuredStatementPlaceHolder(Op03SimpleStatement.java:550)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:727)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    final void n(b.a a8, int n8) {
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        byte by;
        int[] nArray = this.g;
        int[] nArray2 = this.h;
        boolean[] blArray = this.i;
        int[] nArray3 = this.j;
        byte[] byArray = a8.q;
        int[] nArray4 = a8.r;
        char[] cArray = this.k;
        int n14 = this.b;
        boolean bl = this.c;
        int n15 = 65537;
        while (--n15 >= 0) {
            nArray3[n15] = 0;
        }
        for (n15 = 0; n15 < 20; ++n15) {
            byArray[n8 + n15 + 2] = byArray[n15 % (n8 + 1) + 1];
        }
        n15 = n8 + 21;
        while (--n15 >= 0) {
            cArray[n15] = '\u0000';
        }
        int n16 = n8 + 1;
        byArray[0] = by = byArray[n16];
        int n17 = 255;
        n15 = by & 0xFF;
        int n18 = 0;
        while (n18 <= n8) {
            n13 = byArray[++n18] & 0xFF;
            n15 = (n15 << 8) + n13;
            nArray3[n15] = nArray3[n15] + 1;
            n15 = n13;
        }
        for (n15 = 1; n15 <= 65536; ++n15) {
            nArray3[n15] = nArray3[n15] + nArray3[n15 - 1];
        }
        n18 = byArray[1] & 0xFF;
        n15 = 0;
        while (n15 < n8) {
            n13 = byArray[n15 + 2] & 0xFF;
            n12 = (n18 << 8) + n13;
            nArray3[n12] = n18 = nArray3[n12] - 1;
            nArray4[n18] = n15++;
            n18 = n13;
        }
        n15 = ((byArray[n16] & 0xFF) << 8) + (byArray[1] & 0xFF);
        nArray3[n15] = n18 = nArray3[n15] - 1;
        nArray4[n18] = n8;
        n15 = 256;
        while (--n15 >= 0) {
            blArray[n15] = false;
            nArray[n15] = n15;
        }
        n15 = 364;
        while (n15 != 1) {
            for (n18 = n15 /= 3; n18 <= n17; ++n18) {
                n11 = nArray[n18];
                n10 = nArray3[n11 + 1 << 8];
                n9 = nArray3[n11 << 8];
                n16 = nArray[n18 - n15];
                n13 = n18;
                n17 = n15;
                while (true) {
                    n12 = n13;
                    if (nArray3[n16 + 1 << 8] - nArray3[n16 << 8] <= n10 - n9) break;
                    nArray[n13] = n16;
                    if ((n13 -= n17) <= n15 - 1) {
                        n12 = n13;
                        break;
                    }
                    n16 = nArray[n13 - n17];
                }
                nArray[n12] = n11;
                n15 = n17;
                n17 = 255;
            }
        }
        block10: for (n15 = 0; n15 <= 255; ++n15) {
            n13 = nArray[n15];
            for (n18 = 0; n18 <= 255; ++n18) {
                n12 = (n13 << 8) + n18;
                n17 = nArray3[n12];
                if ((n17 & 0x200000) == 0x200000) continue;
                n11 = (nArray3[n12 + 1] & 0xFFDFFFFF) - 1;
                n16 = n17 & 0xFFDFFFFF;
                if (n11 > n16) {
                    this.l(a8, n16, n11, 2, n8);
                    if (bl && this.a > n14) break block10;
                }
                nArray3[n12] = n17 | 0x200000;
            }
            for (n18 = 0; n18 <= 255; ++n18) {
                nArray2[n18] = nArray3[(n18 << 8) + n13] & 0xFFDFFFFF;
            }
            n12 = n13 << 8;
            n16 = n13 + 1 << 8;
            n11 = nArray3[n16];
            for (n18 = nArray3[n12] & 0xFFDFFFFF; n18 < (n11 & 0xFFDFFFFF); ++n18) {
                n17 = nArray4[n18];
                n9 = byArray[n17] & 0xFF;
                if (blArray[n9]) continue;
                n10 = nArray2[n9];
                if (n17 == 0) {
                    n17 = n8;
                }
                nArray4[n10] = --n17;
                nArray2[n9] = nArray2[n9] + 1;
            }
            n18 = 256;
            while (--n18 >= 0) {
                n17 = (n18 << 8) + n13;
                nArray3[n17] = nArray3[n17] | 0x200000;
            }
            blArray[n13] = true;
            if (n15 >= 255) continue;
            n13 = nArray3[n12] & 0xFFDFFFFF;
            n16 = (nArray3[n16] & 0xFFDFFFFF) - n13;
            n18 = 0;
            while (n16 >> n18 > 65534) {
                ++n18;
            }
            for (n17 = 0; n17 < n16; ++n17) {
                char c8;
                n12 = nArray4[n13 + n17];
                cArray[n12] = c8 = (char)(n17 >> n18);
                if (n12 >= 20) continue;
                cArray[n12 + n8 + 1] = c8;
            }
        }
    }
}

