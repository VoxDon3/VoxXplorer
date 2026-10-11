/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jzlib;

import com.jcraft.jsch.jzlib.InfCodes;
import com.jcraft.jsch.jzlib.InfTree;
import com.jcraft.jsch.jzlib.ZStream;

final class InfBlocks {
    static final int[] A;
    private static final int[] z;
    int a;
    int b;
    int c;
    int d;
    int[] e;
    int[] f;
    int[] g;
    int[] h;
    int[] i;
    int[][] j;
    int[][] k;
    int[] l;
    int[] m;
    private final InfCodes n;
    int o;
    int p;
    int q;
    int[] r;
    byte[] s;
    int t;
    int u;
    int v;
    private boolean w;
    private final InfTree x;
    private final ZStream y;

    static {
        z = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, Short.MAX_VALUE, 65535};
        A = new int[]{16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
    }

    InfBlocks(ZStream zStream, int n8) {
        boolean bl = true;
        this.f = new int[1];
        this.g = new int[1];
        this.h = new int[1];
        this.i = new int[1];
        this.j = new int[1][];
        this.k = new int[1][];
        this.l = new int[1];
        this.m = new int[1];
        this.x = new InfTree();
        this.y = zStream;
        this.n = new InfCodes(zStream, this);
        this.r = new int[4320];
        this.s = new byte[n8];
        this.t = n8;
        if (zStream.k.f == 0) {
            bl = false;
        }
        this.w = bl;
        this.a = 0;
        this.d();
    }

    void a() {
        this.d();
        this.s = null;
        this.r = null;
    }

    int b(int n8) {
        ZStream zStream = this.y;
        int n9 = zStream.f;
        int n10 = this.u;
        int n11 = this.v;
        if (n10 > n11) {
            n11 = this.t;
        }
        int n12 = zStream.g;
        int n13 = n11 -= n10;
        if (n11 > n12) {
            n13 = n12;
        }
        n11 = n8;
        if (n13 != 0) {
            n11 = n8;
            if (n8 == -5) {
                n11 = 0;
            }
        }
        zStream.g = n12 - n13;
        zStream.h += (long)n13;
        if (this.w && n13 > 0) {
            zStream.m.b(this.s, n10, n13);
        }
        System.arraycopy(this.s, n10, this.y.e, n9, n13);
        int n14 = this.t;
        n12 = n9 += n13;
        n8 = n10 += n13;
        n13 = n11;
        if (n10 == n14) {
            if (this.v == n14) {
                this.v = 0;
            }
            n13 = this.v;
            zStream = this.y;
            n12 = zStream.g;
            n8 = n13;
            if (n13 > n12) {
                n8 = n12;
            }
            n13 = n11;
            if (n8 != 0) {
                n13 = n11;
                if (n11 == -5) {
                    n13 = 0;
                }
            }
            zStream.g = n12 - n8;
            zStream.h += (long)n8;
            if (this.w && n8 > 0) {
                zStream.m.b(this.s, 0, n8);
            }
            System.arraycopy(this.s, 0, this.y.e, n9, n8);
            n12 = n9 + n8;
        }
        this.y.f = n12;
        this.u = n8;
        return n13;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    int c(int var1_1) {
        block69: {
            block67: {
                var39_2 = this.y;
                var4_3 = var39_2.b;
                var5_4 = var39_2.c;
                var3_5 = this.q;
                var7_6 = this.p;
                var6_7 = this.v;
                var2_8 = this.u;
                var2_8 = var6_7 < var2_8 ? var2_8 - var6_7 - 1 : this.t - var6_7;
                var9_9 /* !! */  = var2_8;
                var2_8 = var7_6;
                var7_6 = var1_1;
                var1_1 = var2_8;
                var2_8 = var3_5;
                var3_5 = var5_4;
                var5_4 = var7_6;
                block12: while (true) {
                    var16_17 = var5_4;
                    var17_18 = var3_5;
                    var18_19 = var4_3;
                    var26_27 = var2_8;
                    var25_26 = var1_1;
                    var10_11 = var5_4;
                    var11_12 /* !! */  = var3_5;
                    var12_13 = var4_3;
                    var7_6 = var2_8;
                    var8_10 = var1_1;
                    var38_39 = var5_4;
                    var31_32 = var3_5;
                    var30_31 = var4_3;
                    var29_30 = var2_8;
                    var28_29 = var1_1;
                    var37_38 = var5_4;
                    var24_25 = var3_5;
                    var23_24 = var4_3;
                    var21_22 = var2_8;
                    var19_20 = var1_1;
                    var27_28 = var6_7;
                    var32_33 = var3_5;
                    var34_35 = var4_3;
                    var36_37 = var2_8;
                    var35_36 = var1_1;
                    var33_34 = var6_7;
                    var14_15 = var5_4;
                    var15_16 = var3_5;
                    var13_14 = var4_3;
                    var20_21 = var2_8;
                    var22_23 = var1_1;
                    cfr_temp_0 = -2147483648;
                    do {
                        switch (cfr_temp_0 == -2147483648 ? this.a : cfr_temp_0) {
                            default: {
                                this.q = var2_8;
                                this.p = var1_1;
                                var39_2 = this.y;
                                var39_2.c = var3_5;
                                var39_2.d += (long)(var4_3 - var39_2.b);
                                var39_2.b = var4_3;
                                this.v = var6_7;
                                return this.b(-2);
                            }
                            case 9: {
                                this.q = var2_8;
                                this.p = var1_1;
                                var39_2 = this.y;
                                var39_2.c = var3_5;
                                var39_2.d += (long)(var4_3 - var39_2.b);
                                var39_2.b = var4_3;
                                this.v = var6_7;
                                return this.b(-3);
                            }
                            case 5: {
                                ** GOTO lbl338
                            }
                            case 3: {
                                while (var25_26 < 14) {
                                    if (var17_18 == 0) {
                                        this.q = var26_27;
                                        this.p = var25_26;
                                        var39_2 = this.y;
                                        var39_2.c = var17_18;
                                        var39_2.d += (long)(var18_19 - var39_2.b);
                                        var39_2.b = var18_19;
                                        this.v = var6_7;
                                        return this.b(var16_17);
                                    }
                                    --var17_18;
                                    var26_27 |= (this.y.a[var18_19] & 255) << var25_26;
                                    var25_26 += 8;
                                    ++var18_19;
                                    var16_17 = 0;
                                }
                                this.c = var2_8 = var26_27 & 16383;
                                var1_1 = var26_27 & 31;
                                if (var1_1 > 29 || (var2_8 = var2_8 >> 5 & 31) > 29) ** GOTO lbl108
                                var2_8 = var1_1 + 258 + var2_8;
                                var39_2 = this.e;
                                if (var39_2 != null && ((Object)var39_2).length >= var2_8) {
                                    for (var1_1 = 0; var1_1 < var2_8; ++var1_1) {
                                        this.e[var1_1] = 0;
                                    }
                                } else {
                                    this.e = new int[var2_8];
                                }
                                var7_6 = var26_27 >>> 14;
                                var8_10 = var25_26 - 14;
                                this.d = 0;
                                this.a = 4;
                                var12_13 = var18_19;
                                var11_12 /* !! */  = var17_18;
                                var10_11 = var16_17;
                            }
                            case 4: {
                                ** GOTO lbl285
                            }
lbl108:
                            // 1 sources

                            this.a = 9;
                            var39_2 = this.y;
                            var39_2.i = "too many length or distance symbols";
                            this.q = var26_27;
                            this.p = var25_26;
                            var39_2.c = var17_18;
                            var39_2.d += (long)(var18_19 - var39_2.b);
                            var39_2.b = var18_19;
                            this.v = var6_7;
                            return this.b(-3);
                            case 2: {
                                if (var3_5 == 0) {
                                    this.q = var2_8;
                                    this.p = var1_1;
                                    var39_2 = this.y;
                                    var39_2.c = var3_5;
                                    var39_2.d += (long)(var4_3 - var39_2.b);
                                    var39_2.b = var4_3;
                                    this.v = var6_7;
                                    return this.b(var5_4);
                                }
                                var8_10 = var6_7;
                                var7_6 = var9_9 /* !! */ ;
                                if (var9_9 /* !! */  == 0) {
                                    var7_6 = this.t;
                                    var11_12 /* !! */  = var6_7;
                                    var10_11 = var9_9 /* !! */ ;
                                    if (var6_7 == var7_6) {
                                        var8_10 = this.u;
                                        var11_12 /* !! */  = var6_7;
                                        var10_11 = var9_9 /* !! */ ;
                                        if (var8_10 != 0) {
                                            var10_11 = var8_10 > 0 ? var8_10 - 1 : var7_6;
                                            var11_12 /* !! */  = 0;
                                        }
                                    }
                                    var8_10 = var11_12 /* !! */ ;
                                    var7_6 = var10_11;
                                    if (var10_11 == 0) {
                                        this.v = var11_12 /* !! */ ;
                                        var9_9 /* !! */  = this.b(var5_4);
                                        var7_6 = this.v;
                                        var8_10 = this.u;
                                        var5_4 = var7_6 < var8_10 ? var8_10 - var7_6 - 1 : this.t - var7_6;
                                        var6_7 = this.t;
                                        if (var7_6 == var6_7 && var8_10 != 0) {
                                            var5_4 = var6_7;
                                            if (var8_10 > 0) {
                                                var5_4 = var8_10 - 1;
                                            }
                                            var6_7 = var5_4;
                                            var5_4 = 0;
                                        } else {
                                            var6_7 = var5_4;
                                            var5_4 = var7_6;
                                        }
                                        var8_10 = var5_4;
                                        var7_6 = var6_7;
                                        if (var6_7 == 0) {
                                            this.q = var2_8;
                                            this.p = var1_1;
                                            var39_2 = this.y;
                                            var39_2.c = var3_5;
                                            var39_2.d += (long)(var4_3 - var39_2.b);
                                            var39_2.b = var4_3;
                                            this.v = var5_4;
                                            return this.b(var9_9 /* !! */ );
                                        }
                                    }
                                }
                                var5_4 = var6_7 = this.b;
                                if (var6_7 > var3_5) {
                                    var5_4 = var3_5;
                                }
                                var6_7 = var5_4;
                                if (var5_4 > var7_6) {
                                    var6_7 = var7_6;
                                }
                                System.arraycopy(this.y.a, var4_3, this.s, var8_10, var6_7);
                                var4_3 += var6_7;
                                var9_9 /* !! */  = var3_5 - var6_7;
                                var5_4 = var8_10 + var6_7;
                                var7_6 -= var6_7;
                                this.b = var3_5 = this.b - var6_7;
                                if (var3_5 != 0) {
                                    var3_5 = var9_9 /* !! */ ;
                                    var6_7 = var7_6;
                                } else {
                                    var3_5 = this.o != 0 ? 7 : 0;
                                    this.a = var3_5;
                                    var3_5 = var9_9 /* !! */ ;
                                    var6_7 = var7_6;
                                }
                                ** GOTO lbl395
                            }
                            case 1: {
                                while (var1_1 < 32) {
                                    if (var3_5 == 0) {
                                        this.q = var2_8;
                                        this.p = var1_1;
                                        var39_2 = this.y;
                                        var39_2.c = var3_5;
                                        var39_2.d += (long)(var4_3 - var39_2.b);
                                        var39_2.b = var4_3;
                                        this.v = var6_7;
                                        return this.b(var5_4);
                                    }
                                    --var3_5;
                                    var2_8 |= (this.y.a[var4_3] & 255) << var1_1;
                                    var1_1 += 8;
                                    ++var4_3;
                                    var5_4 = 0;
                                }
                                var7_6 = 65535 & var2_8;
                                if ((~var2_8 >>> 16 & 65535) != var7_6) {
                                    this.a = 9;
                                    var39_2 = this.y;
                                    var39_2.i = "invalid stored block lengths";
                                    this.q = var2_8;
                                    this.p = var1_1;
                                    var39_2.c = var3_5;
                                    var39_2.d += (long)(var4_3 - var39_2.b);
                                    var39_2.b = var4_3;
                                    this.v = var6_7;
                                    return this.b(-3);
                                }
                                this.b = var7_6;
                                var1_1 = var7_6 != 0 ? 2 : (this.o != 0 ? 7 : 0);
                                this.a = var1_1;
                                var2_8 = 0;
                                var1_1 = 0;
                                continue block12;
                            }
                            case 0: {
                                while (var22_23 < 3) {
                                    if (var15_16 == 0) {
                                        this.q = var20_21;
                                        this.p = var22_23;
                                        var39_2 = this.y;
                                        var39_2.c = var15_16;
                                        var39_2.d += (long)(var13_14 - var39_2.b);
                                        var39_2.b = var13_14;
                                        this.v = var6_7;
                                        return this.b(var14_15);
                                    }
                                    --var15_16;
                                    var20_21 |= (this.y.a[var13_14] & 255) << var22_23;
                                    var22_23 += 8;
                                    ++var13_14;
                                    var14_15 = 0;
                                }
                                this.o = var20_21 & 1;
                                var1_1 = (var20_21 & 7) >>> 1;
                                if (var1_1 == 0) ** GOTO lbl276
                                if (var1_1 == 1) ** GOTO lbl266
                                if (var1_1 != 2) {
                                    if (var1_1 == 3) {
                                        this.a = 9;
                                        var39_2 = this.y;
                                        var39_2.i = "invalid block type";
                                        this.q = var20_21 >>> 3;
                                        this.p = var22_23 - 3;
                                        var39_2.c = var15_16;
                                        var39_2.d += (long)(var13_14 - var39_2.b);
                                        var39_2.b = var13_14;
                                        this.v = var6_7;
                                        return this.b(-3);
                                    }
                                    var1_1 = var22_23;
                                    var2_8 = var20_21;
                                } else {
                                    var2_8 = var20_21 >>> 3;
                                    var1_1 = var22_23 - 3;
                                    this.a = 3;
                                }
                                ** GOTO lbl272
lbl266:
                                // 1 sources

                                InfTree.d(this.h, this.i, this.j, this.k, this.y);
                                this.n.c(this.h[0], this.i[0], this.j[0], 0, this.k[0], 0);
                                var2_8 = var20_21 >>> 3;
                                var1_1 = var22_23 - 3;
                                this.a = 6;
lbl272:
                                // 3 sources

                                var5_4 = var14_15;
                                var3_5 = var15_16;
                                var4_3 = var13_14;
                                continue block12;
lbl276:
                                // 1 sources

                                var3_5 = var22_23 - 3;
                                var1_1 = var3_5 & 7;
                                var2_8 = var20_21 >>> 3 >>> var1_1;
                                var1_1 = var3_5 - var1_1;
                                this.a = 1;
                                var5_4 = var14_15;
                                var3_5 = var15_16;
                                var4_3 = var13_14;
                                continue block12;
                            }
lbl285:
                            // 2 sources

                            while (this.d < (this.c >>> 10) + 4) {
                                while (var8_10 < 3) {
                                    if (var11_12 /* !! */  == 0) {
                                        this.q = var7_6;
                                        this.p = var8_10;
                                        var39_2 = this.y;
                                        var39_2.c = var11_12 /* !! */ ;
                                        var39_2.d += (long)(var12_13 - var39_2.b);
                                        var39_2.b = var12_13;
                                        this.v = var6_7;
                                        return this.b(var10_11);
                                    }
                                    --var11_12 /* !! */ ;
                                    var7_6 |= (this.y.a[var12_13] & 255) << var8_10;
                                    var8_10 += 8;
                                    ++var12_13;
                                    var10_11 = 0;
                                }
                                var40_40 = this.e;
                                var39_2 = InfBlocks.A;
                                var1_1 = this.d;
                                this.d = var1_1 + 1;
                                var40_40[var39_2[var1_1]] = var7_6 & 7;
                                var7_6 >>>= 3;
                                var8_10 -= 3;
                            }
                            while ((var1_1 = this.d) < 19) {
                                var39_2 = this.e;
                                var40_40 = InfBlocks.A;
                                this.d = var1_1 + 1;
                                var39_2[var40_40[var1_1]] = false;
                            }
                            var39_2 = this.f;
                            var39_2[0] = 7;
                            var1_1 = this.x.b(this.e, (int[])var39_2, this.g, this.r, this.y);
                            if (var1_1 != 0) {
                                if (var1_1 == -3) {
                                    this.e = null;
                                    this.a = 9;
                                }
                                this.q = var7_6;
                                this.p = var8_10;
                                var39_2 = this.y;
                                var39_2.c = var11_12 /* !! */ ;
                                var39_2.d += (long)(var12_13 - var39_2.b);
                                var39_2.b = var12_13;
                                this.v = var6_7;
                                return this.b(var1_1);
                            }
                            this.d = 0;
                            this.a = 5;
                            var1_1 = var8_10;
                            var2_8 = var7_6;
                            var4_3 = var12_13;
                            var3_5 = var11_12 /* !! */ ;
                            var5_4 = var10_11;
lbl338:
                            // 4 sources

                            while (true) {
                                var7_6 = this.c;
                                if (this.d >= (var7_6 & 31) + 258 + (var7_6 >> 5 & 31)) {
                                    this.g[0] = -1;
                                    var40_40 = this.h;
                                    var40_40[0] = 9;
                                    var39_2 = this.i;
                                    var39_2[0] = 6;
                                    if ((var7_6 = this.x.c((var7_6 & 31) + 257, (var7_6 >> 5 & 31) + 1, this.e, var40_40, (int[])var39_2, this.l, this.m, this.r, this.y)) != 0) {
                                        if (var7_6 == -3) {
                                            this.e = null;
                                            this.a = 9;
                                        }
                                        this.q = var2_8;
                                        this.p = var1_1;
                                        var39_2 = this.y;
                                        var39_2.c = var3_5;
                                        var39_2.d += (long)(var4_3 - var39_2.b);
                                        var39_2.b = var4_3;
                                        this.v = var6_7;
                                        return this.b(var7_6);
                                    }
                                    var39_2 = this.n;
                                    var8_10 = this.h[0];
                                    var7_6 = this.i[0];
                                    var40_40 = this.r;
                                    var39_2.c(var8_10, var7_6, var40_40, this.l[0], var40_40, this.m[0]);
                                    this.a = 6;
                                    var28_29 = var1_1;
                                    var29_30 = var2_8;
                                    var30_31 = var4_3;
                                    var31_32 = var3_5;
                                    cfr_temp_0 = 6;
                                    var38_39 = var5_4;
                                }
                                break block67;
                                break;
                            }
                            case 6: {
                                this.q = var29_30;
                                this.p = var28_29;
                                var39_2 = this.y;
                                var39_2.c = var31_32;
                                var39_2.d += (long)(var30_31 - var39_2.b);
                                var39_2.b = var30_31;
                                this.v = var6_7;
                                var1_1 = this.n.d(var38_39);
                                if (var1_1 != 1) {
                                    return this.b(var1_1);
                                }
                                this.n.a(this.y);
                                var39_2 = this.y;
                                var4_3 = var39_2.b;
                                var3_5 = var39_2.c;
                                var2_8 = this.q;
                                var19_20 = this.p;
                                var5_4 = this.v;
                                var1_1 = this.u;
                                var1_1 = var5_4 < var1_1 ? var1_1 - var5_4 - 1 : this.t - var5_4;
                                if (this.o != 0) ** GOTO lbl400
                                this.a = 0;
                                var6_7 = var1_1;
                                var1_1 = var19_20;
lbl395:
                                // 3 sources

                                var7_6 = 0;
                                var9_9 /* !! */  = var6_7;
                                var6_7 = var5_4;
                                var5_4 = var7_6;
                                continue block12;
lbl400:
                                // 1 sources

                                this.a = 7;
                                var37_38 = 0;
                                var27_28 = var5_4;
                                var21_22 = var2_8;
                                var23_24 = var4_3;
                                var24_25 = var3_5;
                            }
                            case 7: {
                                this.v = var27_28;
                                var1_1 = this.b(var37_38);
                                var33_34 = this.v;
                                if (this.u != var33_34) {
                                    this.q = var21_22;
                                    this.p = var19_20;
                                    var39_2 = this.y;
                                    var39_2.c = var24_25;
                                    var39_2.d += (long)(var23_24 - var39_2.b);
                                    var39_2.b = var23_24;
                                    this.v = var33_34;
                                    return this.b(var1_1);
                                }
                                this.a = 8;
                                var35_36 = var19_20;
                                var36_37 = var21_22;
                                var34_35 = var23_24;
                                var32_33 = var24_25;
                            }
                            case 8: 
                        }
                        break block12;
                    } while (true);
                    break;
                }
                this.q = var36_37;
                this.p = var35_36;
                var39_2 = this.y;
                var39_2.c = var32_33;
                var39_2.d += (long)(var34_35 - var39_2.b);
                var39_2.b = var34_35;
                this.v = var33_34;
                return this.b(1);
            }
            var7_6 = this.f[0];
            while (var1_1 < var7_6) {
                if (var3_5 == 0) {
                    this.q = var2_8;
                    this.p = var1_1;
                    var39_2 = this.y;
                    var39_2.c = var3_5;
                    var39_2.d += (long)(var4_3 - var39_2.b);
                    var39_2.b = var4_3;
                    this.v = var6_7;
                    return this.b(var5_4);
                }
                --var3_5;
                var2_8 |= (this.y.a[var4_3] & 255) << var1_1;
                var1_1 += 8;
                ++var4_3;
                var5_4 = 0;
            }
            var39_2 = this.r;
            var8_10 = this.g[0];
            var40_40 = InfBlocks.z;
            var9_9 /* !! */  = (int)var39_2[((var40_40[var7_6] & var2_8) + var8_10) * 3 + 1];
            var11_12 /* !! */  = (int)var39_2[(var8_10 + (var40_40[var9_9 /* !! */ ] & var2_8)) * 3 + 2];
            if (var11_12 /* !! */  >= 16) break block69;
            var2_8 >>>= var9_9 /* !! */ ;
            var1_1 -= var9_9 /* !! */ ;
            var39_2 = this.e;
            var7_6 = this.d;
            this.d = var7_6 + 1;
            var39_2[var7_6] = var11_12 /* !! */ ;
            ** GOTO lbl338
        }
        var7_6 = var11_12 /* !! */  == 18 ? 7 : var11_12 /* !! */  - 14;
        var8_10 = var11_12 /* !! */  == 18 ? 11 : 3;
        while (var1_1 < var9_9 /* !! */  + var7_6) {
            if (var3_5 == 0) {
                this.q = var2_8;
                this.p = var1_1;
                var39_2 = this.y;
                var39_2.c = var3_5;
                var39_2.d += (long)(var4_3 - var39_2.b);
                var39_2.b = var4_3;
                this.v = var6_7;
                return this.b(var5_4);
            }
            --var3_5;
            var2_8 |= (this.y.a[var4_3] & 255) << var1_1;
            var1_1 += 8;
            ++var4_3;
            var5_4 = 0;
        }
        var10_11 = var8_10 + (InfBlocks.z[var7_6] & (var2_8 >>>= var9_9 /* !! */ ));
        var8_10 = var2_8 >>> var7_6;
        var9_9 /* !! */  = var1_1 - var9_9 /* !! */  - var7_6;
        var2_8 = this.d;
        var1_1 = this.c;
        if (var2_8 + var10_11 <= (var1_1 & 31) + 258 + (var1_1 >> 5 & 31) && (var11_12 /* !! */  != 16 || var2_8 >= 1)) {
            if (var11_12 /* !! */  == 16) {
                var1_1 = this.e[var2_8 - 1];
                var7_6 = var10_11;
            } else {
                var1_1 = 0;
                var7_6 = var10_11;
            }
        } else {
            this.e = null;
            this.a = 9;
            var39_2 = this.y;
            var39_2.i = "invalid bit length repeat";
            this.q = var8_10;
            this.p = var9_9 /* !! */ ;
            var39_2.c = var3_5;
            var39_2.d += (long)(var4_3 - var39_2.b);
            var39_2.b = var4_3;
            this.v = var6_7;
            return this.b(-3);
        }
        while (true) {
            var39_2 = this.e;
            var10_11 = var2_8 + 1;
            var39_2[var2_8] = var1_1;
            if (--var7_6 == 0) {
                this.d = var10_11;
                var1_1 = var9_9 /* !! */ ;
                var2_8 = var8_10;
                ** continue;
            }
            var2_8 = var10_11;
        }
    }

    void d() {
        if (this.a == 6) {
            this.n.a(this.y);
        }
        this.a = 0;
        this.p = 0;
        this.q = 0;
        this.v = 0;
        this.u = 0;
        if (this.w) {
            this.y.m.a();
        }
    }
}

