/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jzlib;

import com.jcraft.jsch.jzlib.InfBlocks;
import com.jcraft.jsch.jzlib.ZStream;

final class InfCodes {
    private static final int[] q = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, Short.MAX_VALUE, 65535};
    int a;
    int b;
    int[] c;
    int d = 0;
    int e;
    int f;
    int g;
    int h;
    byte i;
    byte j;
    int[] k;
    int l;
    int[] m;
    int n;
    private final ZStream o;
    private final InfBlocks p;

    InfCodes(ZStream zStream, InfBlocks infBlocks) {
        this.o = zStream;
        this.p = infBlocks;
    }

    void a(ZStream zStream) {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    int b(int var1_1, int var2_2, int[] var3_3, int var4_4, int[] var5_5, int var6_6, InfBlocks var7_7, ZStream var8_8) {
        var12_9 = var8_8.b;
        var13_10 = var8_8.c;
        var11_11 = var7_7.q;
        var10_12 = var7_7.p;
        var14_13 = var7_7.v;
        var9_14 = var7_7.u;
        var9_14 = var14_13 < var9_14 ? var9_14 - var14_13 - 1 : var7_7.t - var14_13;
        var22_15 /* !! */  = InfCodes.q;
        var20_16 = var22_15 /* !! */ [var1_1];
        var21_17 = var22_15 /* !! */ [var2_2];
        var15_18 = var9_14;
        var1_1 = var14_13;
        var2_2 = var13_10;
        var9_14 = var12_9;
        while (true) {
            block26: {
                block32: {
                    block29: {
                        block31: {
                            block30: {
                                block27: {
                                    block28: {
                                        if (var10_12 < 20) {
                                            --var2_2;
                                            var11_11 |= (var8_8.a[var9_14] & 255) << var10_12;
                                            var10_12 += 8;
                                            ++var9_14;
                                            continue;
                                        }
                                        var16_19 = var11_11 & var20_16;
                                        var18_21 = (var4_4 + var16_19) * 3;
                                        var19_22 = var3_3[var18_21];
                                        var12_9 = var11_11;
                                        var13_10 = var10_12;
                                        var14_13 = var18_21;
                                        var17_20 = var19_22;
                                        if (var19_22 == 0) {
                                            var13_10 = var3_3[var18_21 + 1];
                                            var12_9 = var11_11 >> var13_10;
                                            var13_10 = var10_12 - var13_10;
                                            var22_15 /* !! */  = var7_7.s;
                                            var10_12 = var1_1 + 1;
                                            var22_15 /* !! */ [var1_1] = (byte)var3_3[var18_21 + 2];
                                            var1_1 = var10_12;
lbl37:
                                            // 2 sources

                                            while (true) {
                                                --var15_18;
                                                var16_19 = var9_14;
                                                var17_20 = var2_2;
                                                var14_13 = var1_1;
                                                break block26;
                                                break;
                                            }
                                        }
                                        do {
                                            var10_12 = var3_3[var14_13 + 1];
                                            var11_11 = var12_9 >> var10_12;
                                            var10_12 = var13_10 - var10_12;
                                            if ((var17_20 & 16) != 0) {
                                                var13_10 = var17_20 & 15;
                                                var18_21 = var3_3[var14_13 + 2] + (InfCodes.q[var13_10] & var11_11);
                                                var12_9 = var11_11 >> var13_10;
                                                var11_11 = var10_12 - var13_10;
                                                var10_12 = var12_9;
                                                while (var11_11 < 15) {
                                                    --var2_2;
                                                    var10_12 |= (var8_8.a[var9_14] & 255) << var11_11;
                                                    var11_11 += 8;
                                                    ++var9_14;
                                                }
                                                break block27;
                                            }
                                            if ((var17_20 & 64) != 0) break block28;
                                            var16_19 = var16_19 + var3_3[var14_13 + 2] + (InfCodes.q[var17_20] & var11_11);
                                            var18_21 = (var4_4 + var16_19) * 3;
                                            var19_22 = var3_3[var18_21];
                                            var12_9 = var11_11;
                                            var13_10 = var10_12;
                                            var14_13 = var18_21;
                                            var17_20 = var19_22;
                                        } while (var19_22 != 0);
                                        var13_10 = var3_3[var18_21 + 1];
                                        var12_9 = var11_11 >> var13_10;
                                        var13_10 = var10_12 - var13_10;
                                        var22_15 /* !! */  = var7_7.s;
                                        var10_12 = var1_1 + 1;
                                        var22_15 /* !! */ [var1_1] = (byte)var3_3[var18_21 + 2];
                                        var1_1 = var10_12;
                                        ** continue;
                                    }
                                    if ((var17_20 & 32) != 0) {
                                        var12_9 = var8_8.c - var2_2;
                                        var6_6 = var10_12 >> 3;
                                        var4_4 = var12_9;
                                        if (var6_6 < var12_9) {
                                            var4_4 = var6_6;
                                        }
                                        var6_6 = var9_14 - var4_4;
                                        var7_7.q = var11_11;
                                        var7_7.p = var10_12 - (var4_4 << 3);
                                        var8_8.c = var2_2 + var4_4;
                                        var8_8.d += (long)(var6_6 - var8_8.b);
                                        var8_8.b = var6_6;
                                        var7_7.v = var1_1;
                                        return 1;
                                    }
                                    var8_8.i = "invalid literal/length code";
                                    var6_6 = var8_8.c - var2_2;
                                    var12_9 = var10_12 >> 3;
                                    var4_4 = var6_6;
                                    if (var12_9 < var6_6) {
                                        var4_4 = var12_9;
                                    }
                                    var6_6 = var9_14 - var4_4;
                                    var7_7.q = var11_11;
                                    var7_7.p = var10_12 - (var4_4 << 3);
                                    var8_8.c = var2_2 + var4_4;
                                    var8_8.d += (long)(var6_6 - var8_8.b);
                                    var8_8.b = var6_6;
                                    var7_7.v = var1_1;
                                    return -3;
                                }
                                var12_9 = var10_12 & var21_17;
                                var13_10 = (var6_6 + var12_9) * 3;
                                var14_13 = var5_5[var13_10];
                                while (true) {
                                    var16_19 = var5_5[var13_10 + 1];
                                    var17_20 = var10_12 >> var16_19;
                                    var16_19 = var11_11 - var16_19;
                                    if ((var14_13 & 16) != 0) {
                                        var19_22 = var14_13 & 15;
                                        var11_11 = var9_14;
                                        var12_9 = var2_2;
                                        while (var16_19 < var19_22) {
                                            --var12_9;
                                            var17_20 |= (var8_8.a[var11_11] & 255) << var16_19;
                                            var16_19 += 8;
                                            ++var11_11;
                                        }
                                        var2_2 = var5_5[var13_10 + 2] + (InfCodes.q[var19_22] & var17_20);
                                        if (var1_1 >= var2_2) {
                                            var10_12 = var1_1 - var2_2;
                                            if ((var2_2 = var1_1 - var10_12) > 0 && 2 > var2_2) {
                                                var22_15 /* !! */  = var7_7.s;
                                                var22_15 /* !! */ [var1_1] = var22_15 /* !! */ [var10_12];
                                                var9_14 = var1_1 + 2;
                                                var2_2 = var10_12 + 2;
                                                var22_15 /* !! */ [var1_1 + 1] = var22_15 /* !! */ [var10_12 + 1];
                                            } else {
                                                var22_15 /* !! */  = var7_7.s;
                                                System.arraycopy(var22_15 /* !! */ , var10_12, var22_15 /* !! */ , var1_1, 2);
                                                var9_14 = var1_1 + 2;
                                                var2_2 = var10_12 + 2;
                                            }
                                            var10_12 = var18_21 - 2;
                                            break block29;
                                        }
                                        var2_2 = var1_1 - var2_2;
                                        do {
                                            var9_14 = var7_7.t;
                                            var2_2 = var13_10 = var2_2 + var9_14;
                                        } while (var13_10 < 0);
                                        var14_13 = var9_14 - var13_10;
                                        var2_2 = var13_10;
                                        var9_14 = var1_1;
                                        var10_12 = var18_21;
                                        if (var18_21 <= var14_13) break block29;
                                        var10_12 = var18_21 - var14_13;
                                        var2_2 = var1_1 - var13_10;
                                        if (var2_2 > 0 && var14_13 > var2_2) break block30;
                                        var22_15 /* !! */  = var7_7.s;
                                        System.arraycopy(var22_15 /* !! */ , var13_10, var22_15 /* !! */ , var1_1, var14_13);
                                        var9_14 = var1_1 + var14_13;
                                        break block31;
                                    }
                                    if ((var14_13 & 64) != 0) break;
                                    var12_9 = var12_9 + var5_5[var13_10 + 2] + (InfCodes.q[var14_13] & var17_20);
                                    var13_10 = (var6_6 + var12_9) * 3;
                                    var14_13 = var5_5[var13_10];
                                    var10_12 = var17_20;
                                    var11_11 = var16_19;
                                }
                                var8_8.i = "invalid distance code";
                                var10_12 = var8_8.c - var2_2;
                                var6_6 = var16_19 >> 3;
                                var4_4 = var10_12;
                                if (var6_6 < var10_12) {
                                    var4_4 = var6_6;
                                }
                                var6_6 = var9_14 - var4_4;
                                var7_7.q = var17_20;
                                var7_7.p = var16_19 - (var4_4 << 3);
                                var8_8.c = var2_2 + var4_4;
                                var8_8.d += (long)(var6_6 - var8_8.b);
                                var8_8.b = var6_6;
                                var7_7.v = var1_1;
                                return -3;
                            }
                            var2_2 = var14_13;
                            while (true) {
                                var22_15 /* !! */  = var7_7.s;
                                var22_15 /* !! */ [var1_1] = var22_15 /* !! */ [var13_10];
                                ++var1_1;
                                if (--var2_2 == 0) {
                                    var9_14 = var1_1;
                                    break;
                                }
                                ++var13_10;
                            }
                        }
                        var2_2 = 0;
                    }
                    var1_1 = var10_12;
                    var10_12 = var9_14 - var2_2;
                    if (var10_12 > 0 && var1_1 > var10_12) break block32;
                    var22_15 /* !! */  = var7_7.s;
                    System.arraycopy(var22_15 /* !! */ , var2_2, var22_15 /* !! */ , var9_14, var1_1);
                    var14_13 = var9_14 + var1_1;
                    ** GOTO lbl206
                }
                while (true) {
                    block33: {
                        var22_15 /* !! */  = var7_7.s;
                        var22_15 /* !! */ [var9_14] = var22_15 /* !! */ [var2_2];
                        ++var9_14;
                        if (--var1_1 != 0) break block33;
                        var14_13 = var9_14;
lbl206:
                        // 2 sources

                        var1_1 = var17_20 >> var19_22;
                        var13_10 = var16_19 - var19_22;
                        var15_18 -= var18_21;
                        var16_19 = var11_11;
                        var17_20 = var12_9;
                        var12_9 = var1_1;
                        break;
                    }
                    ++var2_2;
                }
            }
            if (var15_18 < 258) break;
            var9_14 = var16_19;
            var2_2 = var17_20;
            var11_11 = var12_9;
            var10_12 = var13_10;
            var1_1 = var14_13;
            if (var17_20 < 10) break;
        }
        var4_4 = var8_8.c - var17_20;
        var2_2 = var13_10 >> 3;
        var1_1 = var4_4;
        if (var2_2 < var4_4) {
            var1_1 = var2_2;
        }
        var2_2 = var16_19 - var1_1;
        var7_7.q = var12_9;
        var7_7.p = var13_10 - (var1_1 << 3);
        var8_8.c = var17_20 + var1_1;
        var8_8.d += (long)(var2_2 - var8_8.b);
        var8_8.b = var2_2;
        var7_7.v = var14_13;
        return 0;
    }

    void c(int n8, int n9, int[] nArray, int n10, int[] nArray2, int n11) {
        this.a = 0;
        this.i = (byte)n8;
        this.j = (byte)n9;
        this.k = nArray;
        this.l = n10;
        this.m = nArray2;
        this.n = n11;
        this.c = null;
    }

    int d(int n8) {
        Object object;
        int n9;
        Object object2 = this.o;
        int n10 = ((ZStream)object2).b;
        int n11 = ((ZStream)object2).c;
        object2 = this.p;
        int n12 = ((InfBlocks)object2).q;
        Object object3 = ((InfBlocks)object2).p;
        int n13 = ((InfBlocks)object2).v;
        Object object4 = ((InfBlocks)object2).u;
        object4 = n13 < object4 ? object4 - n13 - 1 : ((InfBlocks)object2).t - n13;
        int n14 = n8;
        n8 = n11;
        n11 = n14;
        block12: while (true) {
            int n15 = this.a;
            Object object5 = 9;
            int n16 = n8;
            int n17 = n10;
            int n18 = object3;
            int n19 = n13;
            int n20 = n11;
            int n21 = n8;
            int n22 = n10;
            int n23 = n12;
            int n24 = object3;
            n14 = n11;
            int n25 = n8;
            int n26 = n10;
            int n27 = n12;
            int n28 = object3;
            int n29 = n11;
            Object object6 = n8;
            int n30 = n10;
            int n31 = n12;
            int n32 = object3;
            n9 = n13;
            int n33 = object4;
            switch (n15) {
                default: {
                    object2 = this.p;
                    ((InfBlocks)object2).q = n12;
                    ((InfBlocks)object2).p = object3;
                    object = this.o;
                    ((ZStream)object).c = n8;
                    ((ZStream)object).d += (long)(n10 - ((ZStream)object).b);
                    ((ZStream)object).b = n10;
                    ((InfBlocks)object2).v = n13;
                    return ((InfBlocks)object2).b(-2);
                }
                case 9: {
                    object = this.p;
                    ((InfBlocks)object).q = n12;
                    ((InfBlocks)object).p = object3;
                    object2 = this.o;
                    ((ZStream)object2).c = n8;
                    ((ZStream)object2).d += (long)(n10 - ((ZStream)object2).b);
                    ((ZStream)object2).b = n10;
                    ((InfBlocks)object).v = n13;
                    return ((InfBlocks)object).b(-3);
                }
                case 7: {
                    n14 = n8;
                    object4 = n10;
                    object6 = object3;
                    if (object3 > 7) {
                        object6 = object3 - 8;
                        n14 = n8 + 1;
                        object4 = n10 - 1;
                    }
                    object2 = this.p;
                    ((InfBlocks)object2).v = n13;
                    n11 = ((InfBlocks)object2).b(n11);
                    object2 = this.p;
                    n19 = ((InfBlocks)object2).v;
                    n8 = ((InfBlocks)object2).u;
                    if (n19 >= n8) {
                        n10 = ((InfBlocks)object2).t;
                    }
                    if (n8 != n19) {
                        ((InfBlocks)object2).q = n12;
                        ((InfBlocks)object2).p = object6;
                        object = this.o;
                        ((ZStream)object).c = n14;
                        ((ZStream)object).d += (long)(object4 - ((ZStream)object).b);
                        ((ZStream)object).b = object4;
                        ((InfBlocks)object2).v = n19;
                        return ((InfBlocks)object2).b(n11);
                    }
                    this.a = 8;
                    n18 = object6;
                    n17 = object4;
                    n16 = n14;
                }
                case 8: {
                    object2 = this.p;
                    ((InfBlocks)object2).q = n12;
                    ((InfBlocks)object2).p = n18;
                    object = this.o;
                    ((ZStream)object).c = n16;
                    ((ZStream)object).d += (long)(n17 - ((ZStream)object).b);
                    ((ZStream)object).b = n17;
                    ((InfBlocks)object2).v = n19;
                    return ((InfBlocks)object2).b(1);
                }
                case 6: {
                    n20 = n13;
                    n29 = object4;
                    if (object4 == 0) {
                        object2 = this.p;
                        n20 = ((InfBlocks)object2).t;
                        object6 = n13;
                        n14 = object4;
                        if (n13 == n20) {
                            n29 = ((InfBlocks)object2).u;
                            object6 = n13;
                            n14 = object4;
                            if (n29 != 0) {
                                n14 = n29 > 0 ? n29 - 1 : n20;
                                object6 = 0;
                            }
                        }
                        n20 = object6;
                        n29 = n14;
                        if (n14 == 0) {
                            ((InfBlocks)object2).v = object6;
                            n20 = ((InfBlocks)object2).b(n11);
                            object2 = this.p;
                            n14 = ((InfBlocks)object2).v;
                            n29 = ((InfBlocks)object2).u;
                            n13 = n14 < n29 ? n29 - n14 - 1 : ((InfBlocks)object2).t - n14;
                            object6 = ((InfBlocks)object2).t;
                            object4 = n14;
                            n11 = n13;
                            if (n14 == object6) {
                                object4 = n14;
                                n11 = n13;
                                if (n29 != 0) {
                                    n11 = object6;
                                    if (n29 > 0) {
                                        n11 = n29 - 1;
                                    }
                                    object4 = 0;
                                }
                            }
                            if (n11 == 0) {
                                ((InfBlocks)object2).q = n12;
                                ((InfBlocks)object2).p = object3;
                                object = this.o;
                                ((ZStream)object).c = n8;
                                ((ZStream)object).d += (long)(n10 - ((ZStream)object).b);
                                ((ZStream)object).b = n10;
                                ((InfBlocks)object2).v = object4;
                                return ((InfBlocks)object2).b(n20);
                            }
                            n29 = n11;
                            n20 = object4;
                        }
                    }
                    this.p.s[n20] = (byte)this.f;
                    object4 = n29 - 1;
                    this.a = 0;
                    n13 = n20 + 1;
                    n11 = 0;
                    continue block12;
                }
                case 4: {
                    n14 = this.g;
                    while (object3 < n14) {
                        if (n8 != 0) {
                            --n8;
                            n12 |= (this.o.a[n10] & 0xFF) << object3;
                            object3 += 8;
                            ++n10;
                            n11 = 0;
                            continue;
                        }
                        object = this.p;
                        ((InfBlocks)object).q = n12;
                        ((InfBlocks)object).p = object3;
                        object2 = this.o;
                        ((ZStream)object2).c = n8;
                        ((ZStream)object2).d += (long)(n10 - ((ZStream)object2).b);
                        ((ZStream)object2).b = n10;
                        ((InfBlocks)object).v = n13;
                        return ((InfBlocks)object).b(n11);
                    }
                    this.h += q[n14] & n12;
                    n23 = n12 >> n14;
                    n24 = object3 - n14;
                    this.a = 5;
                    n22 = n10;
                    n21 = n8;
                    n20 = n11;
                }
                case 5: {
                    n8 = n13 - this.h;
                    while (true) {
                        n11 = n20;
                        n14 = n13;
                        object6 = object4;
                        n29 = n8;
                        if (n8 >= 0) break;
                        n8 += this.p.t;
                    }
                    while (this.b != 0) {
                        n13 = n11;
                        n8 = n14;
                        n10 = object6;
                        if (object6 == 0) {
                            object2 = this.p;
                            n8 = ((InfBlocks)object2).t;
                            n12 = n14;
                            object3 = object6;
                            if (n14 == n8) {
                                n10 = ((InfBlocks)object2).u;
                                n12 = n14;
                                object3 = object6;
                                if (n10 != 0) {
                                    object3 = n10 > 0 ? n10 - 1 : n8;
                                    n12 = 0;
                                }
                            }
                            n13 = n11;
                            n8 = n12;
                            n10 = object3;
                            if (object3 == 0) {
                                ((InfBlocks)object2).v = n12;
                                n13 = ((InfBlocks)object2).b(n11);
                                object = this.p;
                                object3 = ((InfBlocks)object).v;
                                object4 = ((InfBlocks)object).u;
                                n11 = object3 < object4 ? object4 - object3 - 1 : ((InfBlocks)object).t - object3;
                                n12 = ((InfBlocks)object).t;
                                n10 = object3;
                                n8 = n11;
                                if (object3 == n12) {
                                    n10 = object3;
                                    n8 = n11;
                                    if (object4 != 0) {
                                        n8 = n12;
                                        if (object4 > 0) {
                                            n8 = object4 - 1;
                                        }
                                        n10 = 0;
                                    }
                                }
                                if (n8 == 0) {
                                    ((InfBlocks)object).q = n23;
                                    ((InfBlocks)object).p = n24;
                                    object2 = this.o;
                                    ((ZStream)object2).c = n21;
                                    ((ZStream)object2).d += (long)(n22 - ((ZStream)object2).b);
                                    ((ZStream)object2).b = n22;
                                    ((InfBlocks)object).v = n10;
                                    return ((InfBlocks)object).b(n13);
                                }
                                n11 = n10;
                                n10 = n8;
                                n8 = n11;
                            }
                        }
                        object2 = this.p;
                        object = ((InfBlocks)object2).s;
                        n11 = n29 + 1;
                        object[n8] = object[n29];
                        object6 = n10 - 1;
                        n10 = n11 == ((InfBlocks)object2).t ? 0 : n11;
                        --this.b;
                        n14 = n8 + 1;
                        n11 = n13;
                        n29 = n10;
                    }
                    this.a = 0;
                    n8 = n21;
                    n10 = n22;
                    n12 = n23;
                    object3 = n24;
                    n13 = n14;
                    object4 = object6;
                    continue block12;
                }
                case 2: {
                    n14 = this.g;
                    while (object3 < n14) {
                        if (n8 != 0) {
                            --n8;
                            n12 |= (this.o.a[n10] & 0xFF) << object3;
                            object3 += 8;
                            ++n10;
                            n11 = 0;
                            continue;
                        }
                        object = this.p;
                        ((InfBlocks)object).q = n12;
                        ((InfBlocks)object).p = object3;
                        object2 = this.o;
                        ((ZStream)object2).c = n8;
                        ((ZStream)object2).d += (long)(n10 - ((ZStream)object2).b);
                        ((ZStream)object2).b = n10;
                        ((InfBlocks)object).v = n13;
                        return ((InfBlocks)object).b(n11);
                    }
                    this.b += q[n14] & n12;
                    n27 = n12 >> n14;
                    n28 = object3 - n14;
                    this.e = this.j;
                    this.c = this.m;
                    this.d = this.n;
                    this.a = 3;
                    n26 = n10;
                    n25 = n8;
                    n14 = n11;
                }
                case 3: {
                    object3 = this.e;
                    n10 = n26;
                    n8 = n25;
                    n11 = n14;
                    while (n28 < object3) {
                        if (n8 != 0) {
                            --n8;
                            n27 |= (this.o.a[n10] & 0xFF) << n28;
                            n28 += 8;
                            ++n10;
                            n11 = 0;
                            continue;
                        }
                        object2 = this.p;
                        ((InfBlocks)object2).q = n27;
                        ((InfBlocks)object2).p = n28;
                        object = this.o;
                        ((ZStream)object).c = n8;
                        ((ZStream)object).d += (long)(n10 - ((ZStream)object).b);
                        ((ZStream)object).b = n10;
                        ((InfBlocks)object2).v = n13;
                        return ((InfBlocks)object2).b(n11);
                    }
                    n14 = (this.d + (q[object3] & n27)) * 3;
                    object2 = this.c;
                    object3 = object2[n14 + 1];
                    n12 = n27 >> object3;
                    object3 = n28 - object3;
                    object6 = object2[n14];
                    if ((object6 & 0x10) != 0) {
                        this.g = object6 & 0xF;
                        this.h = (int)object2[n14 + 2];
                        this.a = 4;
                        continue block12;
                    }
                    if ((object6 & 0x40) == 0) {
                        this.e = object6;
                        this.d = n14 / 3 + object2[n14 + 2];
                        continue block12;
                    }
                    this.a = 9;
                    object2 = this.o;
                    ((ZStream)object2).i = "invalid distance code";
                    object = this.p;
                    ((InfBlocks)object).q = n12;
                    ((InfBlocks)object).p = object3;
                    ((ZStream)object2).c = n8;
                    ((ZStream)object2).d += (long)(n10 - ((ZStream)object2).b);
                    ((ZStream)object2).b = n10;
                    ((InfBlocks)object).v = n13;
                    return ((InfBlocks)object).b(-3);
                }
                case 0: {
                    n29 = n11;
                    object6 = n8;
                    n30 = n10;
                    n31 = n12;
                    n32 = object3;
                    n20 = n13;
                    n14 = object4;
                    if (object4 >= 258) {
                        n29 = n11;
                        object6 = n8;
                        n30 = n10;
                        n31 = n12;
                        n32 = object3;
                        n20 = n13;
                        n14 = object4;
                        if (n8 >= 10) {
                            object2 = this.p;
                            ((InfBlocks)object2).q = n12;
                            ((InfBlocks)object2).p = object3;
                            object = this.o;
                            ((ZStream)object).c = n8;
                            ((ZStream)object).d += (long)(n10 - ((ZStream)object).b);
                            ((ZStream)object).b = n10;
                            ((InfBlocks)object2).v = n13;
                            n11 = this.b(this.i, this.j, this.k, this.l, this.m, this.n, (InfBlocks)object2, (ZStream)object);
                            object2 = this.o;
                            n10 = ((ZStream)object2).b;
                            object6 = ((ZStream)object2).c;
                            object2 = this.p;
                            n13 = ((InfBlocks)object2).q;
                            n12 = ((InfBlocks)object2).p;
                            object3 = ((InfBlocks)object2).v;
                            n8 = ((InfBlocks)object2).u;
                            n8 = object3 < n8 ? n8 - object3 - 1 : ((InfBlocks)object2).t - object3;
                            if (n11 != 0) {
                                object4 = object5;
                                if (n11 == 1) {
                                    object4 = 7;
                                }
                                this.a = object4;
                                object4 = n8;
                                n14 = n13;
                                n20 = n12;
                                n13 = object3;
                                n8 = object6;
                                n12 = n14;
                                object3 = n20;
                                continue block12;
                            }
                            n14 = n8;
                            n20 = object3;
                            n32 = n12;
                            n31 = n13;
                            n30 = n10;
                            n29 = n11;
                        }
                    }
                    this.e = this.i;
                    this.c = this.k;
                    this.d = this.l;
                    this.a = 1;
                    n33 = n14;
                    n9 = n20;
                }
                case 1: 
            }
            object3 = this.e;
            n10 = n30;
            n8 = object6;
            n11 = n29;
            while (n32 < object3) {
                if (n8 != 0) {
                    --n8;
                    n31 |= (this.o.a[n10] & 0xFF) << n32;
                    n32 += 8;
                    ++n10;
                    n11 = 0;
                    continue;
                }
                object2 = this.p;
                ((InfBlocks)object2).q = n31;
                ((InfBlocks)object2).p = n32;
                object = this.o;
                ((ZStream)object).c = n8;
                ((ZStream)object).d += (long)(n10 - ((ZStream)object).b);
                ((ZStream)object).b = n10;
                ((InfBlocks)object2).v = n9;
                return ((InfBlocks)object2).b(n11);
            }
            n13 = (this.d + (q[object3] & n31)) * 3;
            object2 = this.c;
            object3 = object2[n13 + 1];
            n12 = n31 >>> object3;
            object3 = n32 - object3;
            object4 = object2[n13];
            if (object4 == 0) {
                this.f = (int)object2[n13 + 2];
                this.a = 6;
                n13 = n9;
                object4 = n33;
                continue;
            }
            if ((object4 & 0x10) != 0) {
                this.g = object4 & 0xF;
                this.b = (int)object2[n13 + 2];
                this.a = 2;
                n13 = n9;
                object4 = n33;
                continue;
            }
            if ((object4 & 0x40) == 0) {
                this.e = object4;
                this.d = n13 / 3 + object2[n13 + 2];
                n13 = n9;
                object4 = n33;
                continue;
            }
            if ((object4 & 0x20) == 0) break;
            this.a = 7;
            n13 = n9;
            object4 = n33;
        }
        this.a = 9;
        object2 = this.o;
        ((ZStream)object2).i = "invalid literal/length code";
        object = this.p;
        ((InfBlocks)object).q = n12;
        ((InfBlocks)object).p = object3;
        ((ZStream)object2).c = n8;
        ((ZStream)object2).d += (long)(n10 - ((ZStream)object2).b);
        ((ZStream)object2).b = n10;
        ((InfBlocks)object).v = n9;
        return ((InfBlocks)object).b(-3);
    }
}

