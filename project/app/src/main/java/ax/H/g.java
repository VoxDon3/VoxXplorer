/*
 * Decompiled with CFR 0.152.
 */
package ax.H;

import ax.H.d;
import ax.H.e;
import ax.H.f;
import ax.H.l;
import java.util.ArrayList;
import java.util.Arrays;

public class g
extends l {
    private int a1 = -1;
    private int b1 = -1;
    private int c1 = -1;
    private int d1 = -1;
    private int e1 = -1;
    private int f1 = -1;
    private float g1 = 0.5f;
    private float h1 = 0.5f;
    private float i1 = 0.5f;
    private float j1 = 0.5f;
    private float k1 = 0.5f;
    private float l1 = 0.5f;
    private int m1 = 0;
    private int n1 = 0;
    private int o1 = 2;
    private int p1 = 2;
    private int q1 = 0;
    private int r1 = -1;
    private int s1 = 0;
    private ArrayList<a> t1 = new ArrayList();
    private e[] u1 = null;
    private e[] v1 = null;
    private int[] w1 = null;
    private e[] x1;
    private int y1 = 0;

    static /* synthetic */ int R1(g g8) {
        return g8.c1;
    }

    static /* synthetic */ float S1(g g8) {
        return g8.i1;
    }

    static /* synthetic */ int T1(g g8) {
        return g8.e1;
    }

    static /* synthetic */ float U1(g g8) {
        return g8.k1;
    }

    static /* synthetic */ float V1(g g8) {
        return g8.h1;
    }

    static /* synthetic */ int W1(g g8) {
        return g8.d1;
    }

    static /* synthetic */ float X1(g g8) {
        return g8.j1;
    }

    static /* synthetic */ int Y1(g g8) {
        return g8.f1;
    }

    static /* synthetic */ float Z1(g g8) {
        return g8.l1;
    }

    static /* synthetic */ int a2(g g8) {
        return g8.o1;
    }

    static /* synthetic */ int f2(g g8) {
        return g8.b1;
    }

    static /* synthetic */ int g2(g g8) {
        return g8.p1;
    }

    static /* synthetic */ int h2(g g8) {
        return g8.a1;
    }

    static /* synthetic */ float i2(g g8) {
        return g8.g1;
    }

    private void j2(boolean bl) {
        if (this.w1 != null && this.v1 != null && this.u1 != null) {
            Object object;
            e e8;
            int n8;
            int n9;
            for (n9 = 0; n9 < this.y1; ++n9) {
                this.x1[n9].u0();
            }
            Object object2 = this.w1;
            int n10 = object2[0];
            int n11 = object2[1];
            float f8 = this.g1;
            object2 = null;
            for (n9 = 0; n9 < n10; ++n9) {
                if (bl) {
                    n8 = n10 - n9 - 1;
                    f8 = 1.0f - this.g1;
                } else {
                    n8 = n9;
                }
                e8 = this.v1[n8];
                object = object2;
                if (e8 != null) {
                    if (e8.V() == 8) {
                        object = object2;
                    } else {
                        if (n9 == 0) {
                            e8.k(e8.O, this.O, this.z1());
                            e8.N0(this.a1);
                            e8.M0(f8);
                        }
                        if (n9 == n10 - 1) {
                            e8.k(e8.Q, this.Q, this.A1());
                        }
                        if (n9 > 0 && object2 != null) {
                            e8.k(e8.O, object2.Q, this.m1);
                            object2.k(object2.Q, e8.O, 0);
                        }
                        object = e8;
                    }
                }
                object2 = object;
            }
            for (n9 = 0; n9 < n11; ++n9) {
                e8 = this.u1[n9];
                object = object2;
                if (e8 != null) {
                    if (e8.V() == 8) {
                        object = object2;
                    } else {
                        if (n9 == 0) {
                            e8.k(e8.P, this.P, this.B1());
                            e8.e1(this.b1);
                            e8.d1(this.h1);
                        }
                        if (n9 == n11 - 1) {
                            e8.k(e8.R, this.R, this.y1());
                        }
                        if (n9 > 0 && object2 != null) {
                            e8.k(e8.P, object2.R, this.n1);
                            object2.k(object2.R, e8.P, 0);
                        }
                        object = e8;
                    }
                }
                object2 = object;
            }
            for (n9 = 0; n9 < n10; ++n9) {
                for (n8 = 0; n8 < n11; ++n8) {
                    int n12 = n8 * n10 + n9;
                    if (this.s1 == 1) {
                        n12 = n9 * n11 + n8;
                    }
                    if (n12 >= ((int[])(object2 = (Object)this.x1)).length || (object = (Object)object2[n12]) == null || ((e)object).V() == 8) continue;
                    object2 = this.v1[n9];
                    e8 = this.u1[n8];
                    if (object != object2) {
                        ((e)object).k(((e)object).O, object2.O, 0);
                        ((e)object).k(((e)object).Q, object2.Q, 0);
                    }
                    if (object == e8) continue;
                    ((e)object).k(((e)object).P, e8.P, 0);
                    ((e)object).k(((e)object).R, e8.R, 0);
                }
            }
        }
    }

    private final int k2(e e8, int n8) {
        if (e8 == null) {
            return 0;
        }
        if (e8.T() == e.b.d0) {
            int n9 = e8.x;
            if (n9 == 0) {
                return 0;
            }
            if (n9 == 2) {
                if ((n8 = (int)(e8.E * (float)n8)) != e8.x()) {
                    e8.Y0(true);
                    this.D1(e8, e8.A(), e8.W(), e.b.q, n8);
                }
                return n8;
            }
            if (n9 == 1) {
                return e8.x();
            }
            if (n9 == 3) {
                return (int)((float)e8.W() * e8.d0 + 0.5f);
            }
        }
        return e8.x();
    }

    private final int l2(e e8, int n8) {
        if (e8 == null) {
            return 0;
        }
        if (e8.A() == e.b.d0) {
            int n9 = e8.w;
            if (n9 == 0) {
                return 0;
            }
            if (n9 == 2) {
                if ((n8 = (int)(e8.B * (float)n8)) != e8.W()) {
                    e8.Y0(true);
                    this.D1(e8, e.b.q, n8, e8.T(), e8.x());
                }
                return n8;
            }
            if (n9 == 1) {
                return e8.W();
            }
            if (n9 == 3) {
                return (int)((float)e8.x() * e8.d0 + 0.5f);
            }
        }
        return e8.W();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void m2(e[] var1_1, int var2_2, int var3_3, int var4_4, int[] var5_5) {
        block35: {
            if (var3_3 == 0) {
                var8_7 = var6_6 = this.r1;
                if (var6_6 <= 0) {
                    var6_6 = 0;
                    var9_8 = 0;
                    var7_9 = 0;
                    while (true) {
                        var8_7 = var6_6;
                        if (var9_8 >= var2_2) break;
                        var8_7 = var7_9;
                        if (var9_8 > 0) {
                            var8_7 = var7_9 + this.m1;
                        }
                        if ((var13_10 /* !! */  = var1_1 /* !! */ [var9_8]) == null) {
                            var7_9 = var8_7;
                        } else {
                            var7_9 = var8_7 + this.l2((e)var13_10 /* !! */ , var4_4);
                            if (var7_9 > var4_4) {
                                var8_7 = var6_6;
                                break;
                            }
                            ++var6_6;
                        }
                        ++var9_8;
                    }
                }
                var7_9 = var8_7;
                var6_6 = 0;
            } else {
                var8_7 = var6_6 = this.r1;
                if (var6_6 <= 0) {
                    var6_6 = 0;
                    var9_8 = 0;
                    var7_9 = 0;
                    while (true) {
                        var8_7 = var6_6;
                        if (var9_8 >= var2_2) break;
                        var8_7 = var7_9;
                        if (var9_8 > 0) {
                            var8_7 = var7_9 + this.n1;
                        }
                        if ((var13_10 /* !! */  = var1_1 /* !! */ [var9_8]) == null) {
                            var7_9 = var8_7;
                        } else {
                            var7_9 = var8_7 + this.k2((e)var13_10 /* !! */ , var4_4);
                            if (var7_9 > var4_4) {
                                var8_7 = var6_6;
                                break;
                            }
                            ++var6_6;
                        }
                        ++var9_8;
                    }
                }
                var7_9 = 0;
                var6_6 = var8_7;
            }
            if (this.w1 == null) {
                this.w1 = new int[2];
            }
            if (var6_6 != 0) break block35;
            var11_11 = var6_6;
            var9_8 = var7_9;
            if (var3_3 == 1) ** GOTO lbl59
        }
        if (var7_9 == 0 && var3_3 == 0) {
            var9_8 = var7_9;
            var11_11 = var6_6;
lbl59:
            // 6 sources

            while (true) {
                var12_13 = true;
                var6_6 = var11_11;
                var7_9 = var9_8;
                break;
            }
        } else {
            var12_13 = false;
        }
        while (!var12_13) {
            block36: {
                if (var3_3 == 0) {
                    var6_6 = (int)Math.ceil((float)var2_2 / (float)var7_9);
                } else {
                    var7_9 = (int)Math.ceil((float)var2_2 / (float)var6_6);
                }
                var13_10 /* !! */  = this.v1;
                if (var13_10 /* !! */  != null && var13_10 /* !! */ .length >= var7_9) {
                    Arrays.fill(var13_10 /* !! */ , null);
                } else {
                    this.v1 = new e[var7_9];
                }
                var13_10 /* !! */  = this.u1;
                if (var13_10 /* !! */  != null && var13_10 /* !! */ .length >= var6_6) {
                    Arrays.fill(var13_10 /* !! */ , null);
                } else {
                    this.u1 = new e[var6_6];
                }
                for (var8_7 = 0; var8_7 < var7_9; ++var8_7) {
                    for (var9_8 = 0; var9_8 < var6_6; ++var9_8) {
                        var10_12 = var9_8 * var7_9 + var8_7;
                        if (var3_3 == 1) {
                            var10_12 = var8_7 * var6_6 + var9_8;
                        }
                        if (var10_12 >= var1_1 /* !! */ .length || (var13_10 /* !! */  = var1_1 /* !! */ [var10_12]) == null) continue;
                        var10_12 = this.l2((e)var13_10 /* !! */ , var4_4);
                        var14_14 = this.v1[var8_7];
                        if (var14_14 == null || var14_14.W() < var10_12) {
                            this.v1[var8_7] = var13_10 /* !! */ ;
                        }
                        var10_12 = this.k2((e)var13_10 /* !! */ , var4_4);
                        var14_14 = this.u1[var9_8];
                        if (var14_14 != null && var14_14.x() >= var10_12) continue;
                        this.u1[var9_8] = var13_10 /* !! */ ;
                    }
                }
                var8_7 = 0;
                for (var9_8 = 0; var9_8 < var7_9; ++var9_8) {
                    var13_10 /* !! */  = this.v1[var9_8];
                    var10_12 = var8_7;
                    if (var13_10 /* !! */  != null) {
                        var10_12 = var8_7;
                        if (var9_8 > 0) {
                            var10_12 = var8_7 + this.m1;
                        }
                        var10_12 += this.l2((e)var13_10 /* !! */ , var4_4);
                    }
                    var8_7 = var10_12;
                }
                var10_12 = 0;
                for (var9_8 = 0; var9_8 < var6_6; ++var9_8) {
                    var13_10 /* !! */  = this.u1[var9_8];
                    var11_11 = var10_12;
                    if (var13_10 /* !! */  != null) {
                        var11_11 = var10_12;
                        if (var9_8 > 0) {
                            var11_11 = var10_12 + this.n1;
                        }
                        var11_11 += this.k2((e)var13_10 /* !! */ , var4_4);
                    }
                    var10_12 = var11_11;
                }
                var5_5[0] = var8_7;
                var5_5[1] = var10_12;
                if (var3_3 != 0) break block36;
                var11_11 = var6_6;
                var9_8 = var7_9;
                if (var8_7 <= var4_4) ** GOTO lbl59
                var11_11 = var6_6;
                var9_8 = var7_9;
                if (var7_9 <= 1) ** GOTO lbl59
                --var7_9;
                continue;
            }
            var11_11 = var6_6;
            var9_8 = var7_9;
            if (var10_12 <= var4_4) ** GOTO lbl59
            var11_11 = var6_6;
            var9_8 = var7_9;
            if (var6_6 > 1) ** break;
            ** continue;
            --var6_6;
        }
        var1_1 /* !! */  = (e[])this.w1;
        var1_1 /* !! */ [0] = (e)var7_9;
        var1_1 /* !! */ [1] = (e)var6_6;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void n2(e[] var1_1, int var2_2, int var3_3, int var4_4, int[] var5_5) {
        var16_6 = this;
        if (var2_2 == 0) {
            return;
        }
        var16_6.t1.clear();
        var19_7 = var16_6.O;
        var18_8 = var16_6.P;
        var17_9 = var16_6.Q;
        var20_10 = var16_6.R;
        var17_9 = new a((g)var16_6, var3_3, (d)var19_7, (d)var18_8, (d)var17_9, (d)var20_10, var4_4);
        var16_6.t1.add((a)var17_9);
        if (var3_3 == 0) {
            var6_11 = 0;
            var8_12 = 0;
            var9_13 = 0;
            while (true) {
                var18_8 = var16_6;
                var7_14 = var6_11;
                if (var9_13 < var2_2) {
                    var19_7 = var1_1 /* !! */ [var9_13];
                    var11_16 = var16_6.l2((e)var19_7, var4_4);
                    var7_14 = var6_11;
                    if (var19_7.A() == e.b.d0) {
                        var7_14 = var6_11 + 1;
                    }
                    var6_11 = (var8_12 == var4_4 || var16_6.m1 + var8_12 + var11_16 > var4_4) && ax.H.g$a.a((a)var17_9) != null ? 1 : 0;
                    var10_15 = var6_11;
                    if (var6_11 == 0) {
                        var10_15 = var6_11;
                        if (var9_13 > 0) {
                            var12_17 = var16_6.r1;
                            var10_15 = var6_11;
                            if (var12_17 > 0) {
                                var10_15 = var6_11;
                                if (var9_13 % var12_17 == 0) {
                                    var10_15 = 1;
                                }
                            }
                        }
                    }
                    if (var10_15 != 0) {
                        var18_8 = new a((g)var16_6, var3_3, var16_6.O, var16_6.P, var16_6.Q, var16_6.R, var4_4);
                        var18_8.i(var9_13);
                        var16_6.t1.add((a)var18_8);
                        while (true) {
                            var8_12 = var11_16;
                            var17_9 = var18_8;
                            break;
                        }
                    } else {
                        var18_8 = var17_9;
                        if (var9_13 <= 0) ** continue;
                        var8_12 += var16_6.m1 + var11_16;
                    }
                    var17_9.b((e)var19_7);
                    ++var9_13;
                    var6_11 = var7_14;
                    continue;
                }
                break;
            }
        } else {
            var6_11 = 0;
            var8_12 = 0;
            var9_13 = 0;
            while (true) {
                var18_8 = var16_6;
                var7_14 = var6_11;
                if (var9_13 >= var2_2) break;
                var19_7 = var1_1 /* !! */ [var9_13];
                var11_16 = var16_6.k2((e)var19_7, var4_4);
                var7_14 = var6_11;
                if (var19_7.T() == e.b.d0) {
                    var7_14 = var6_11 + 1;
                }
                var6_11 = (var8_12 == var4_4 || var16_6.n1 + var8_12 + var11_16 > var4_4) && ax.H.g$a.a((a)var17_9) != null ? 1 : 0;
                var10_15 = var6_11;
                if (var6_11 == 0) {
                    var10_15 = var6_11;
                    if (var9_13 > 0) {
                        var12_17 = var16_6.r1;
                        var10_15 = var6_11;
                        if (var12_17 > 0) {
                            var10_15 = var6_11;
                            if (var9_13 % var12_17 == 0) {
                                var10_15 = 1;
                            }
                        }
                    }
                }
                if (var10_15 != 0) {
                    var18_8 = new a((g)var16_6, var3_3, var16_6.O, var16_6.P, var16_6.Q, var16_6.R, var4_4);
                    var18_8.i(var9_13);
                    var16_6.t1.add((a)var18_8);
                    while (true) {
                        var8_12 = var11_16;
                        var17_9 = var18_8;
                        break;
                    }
                } else {
                    var18_8 = var17_9;
                    if (var9_13 <= 0) ** continue;
                    var8_12 += var16_6.n1 + var11_16;
                }
                var17_9.b((e)var19_7);
                ++var9_13;
                var6_11 = var7_14;
            }
        }
        var15_18 = var18_8.t1.size();
        var16_6 = var18_8.O;
        var17_9 = var18_8.P;
        var19_7 = var18_8.Q;
        var20_10 = var18_8.R;
        var9_13 = var18_8.z1();
        var6_11 = var18_8.B1();
        var10_15 = var18_8.A1();
        var11_16 = var18_8.y1();
        var1_1 /* !! */  = var18_8.A();
        var2_2 = var1_1 /* !! */  != (var21_19 = e.b.c0) && var18_8.T() != var21_19 ? 0 : 1;
        if (var7_14 > 0 && var2_2 != 0) {
            for (var2_2 = 0; var2_2 < var15_18; ++var2_2) {
                var1_1 /* !! */  = var18_8.t1.get(var2_2);
                if (var3_3 == 0) {
                    var1_1 /* !! */ .g(var4_4 - var1_1 /* !! */ .f());
                    continue;
                }
                var1_1 /* !! */ .g(var4_4 - var1_1 /* !! */ .e());
            }
        }
        var12_17 = 0;
        var7_14 = var6_11;
        var6_11 = 0;
        for (var8_12 = 0; var8_12 < var15_18; ++var8_12) {
            var21_19 = var18_8.t1.get(var8_12);
            if (var3_3 == 0) {
                if (var8_12 < var15_18 - 1) {
                    var1_1 /* !! */  = ax.H.g$a.a((a)var18_8.t1.get((int)(var8_12 + 1))).P;
                    var2_2 = 0;
                } else {
                    var1_1 /* !! */  = var18_8.R;
                    var2_2 = var18_8.y1();
                }
                var20_10 = ax.H.g$a.a((a)var21_19).R;
                var21_19.j(var3_3, (d)var16_6, (d)var17_9, (d)var19_7, (d)var1_1 /* !! */ , var9_13, var7_14, var10_15, var2_2, var4_4);
                var7_14 = Math.max(var12_17, var21_19.f());
                var6_11 = var11_16 = var21_19.e() + var6_11;
                if (var8_12 > 0) {
                    var6_11 = var11_16 + var18_8.n1;
                }
                var17_9 = var20_10;
                var13_20 = 0;
                var11_16 = var2_2;
            } else {
                if (var8_12 < var15_18 - 1) {
                    var1_1 /* !! */  = ax.H.g$a.a((a)var18_8.t1.get((int)(var8_12 + 1))).O;
                    var2_2 = 0;
lbl136:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var1_1 /* !! */  = var18_8.Q;
                var2_2 = var18_8.A1();
                ** continue;
                var19_7 = var1_1 /* !! */ ;
                var1_1 /* !! */  = ax.H.g$a.a((a)var21_19).Q;
                var21_19.j(var3_3, (d)var16_6, (d)var17_9, (d)var19_7, (d)var20_10, var9_13, var7_14, var2_2, var11_16, var4_4);
                var9_13 = var21_19.f() + var12_17;
                var12_17 = Math.max(var6_11, var21_19.e());
                var6_11 = var9_13;
                if (var8_12 > 0) {
                    var6_11 = var9_13 + var18_8.m1;
                }
                var14_21 = var6_11;
                var16_6 = var1_1 /* !! */ ;
                var9_13 = 0;
                var10_15 = var2_2;
                var13_20 = var7_14;
                var1_1 /* !! */  = var20_10;
                var6_11 = var12_17;
                var7_14 = var14_21;
            }
            var12_17 = var7_14;
            var20_10 = var1_1 /* !! */ ;
            var7_14 = var13_20;
        }
        var5_5[0] = var12_17;
        var5_5[1] = var6_11;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void o2(e[] var1_1, int var2_2, int var3_3, int var4_4, int[] var5_5) {
        var16_6 = this;
        if (var2_2 == 0) {
            return;
        }
        var16_6.t1.clear();
        var19_7 = var16_6.O;
        var18_8 = var16_6.P;
        var17_9 = var16_6.Q;
        var20_10 = var16_6.R;
        var17_9 = new a((g)var16_6, var3_3, (d)var19_7, (d)var18_8, (d)var17_9, (d)var20_10, var4_4);
        var16_6.t1.add((a)var17_9);
        if (var3_3 == 0) {
            var10_11 = 0;
            var6_12 = 0;
            var8_13 = 0;
            var9_14 = 0;
            while (true) {
                var18_8 = var16_6;
                var7_15 = var6_12;
                if (var9_14 < var2_2) {
                    var12_17 = var10_11 + 1;
                    var18_8 = var1_1 /* !! */ [var9_14];
                    var10_11 = super.l2((e)var18_8, var4_4);
                    var7_15 = var6_12;
                    if (var18_8.A() == e.b.d0) {
                        var7_15 = var6_12 + 1;
                    }
                    var6_12 = (var8_13 == var4_4 || var16_6.m1 + var8_13 + var10_11 > var4_4) && ax.H.g$a.a((a)var17_9) != null ? 1 : 0;
                    var11_16 = var6_12;
                    if (var6_12 == 0) {
                        var11_16 = var6_12;
                        if (var9_14 > 0) {
                            var13_18 = var16_6.r1;
                            var11_16 = var6_12;
                            if (var13_18 > 0) {
                                var11_16 = var6_12;
                                if (var12_17 > var13_18) {
                                    var11_16 = 1;
                                }
                            }
                        }
                    }
                    if (var11_16 != 0) {
                        var17_9 = new a((g)var16_6, var3_3, var16_6.O, var16_6.P, var16_6.Q, var16_6.R, var4_4);
                        var17_9.i(var9_14);
                        var16_6.t1.add((a)var17_9);
                        var6_12 = var12_17;
                        var8_13 = var10_11;
                    } else if (var9_14 > 0) {
                        var8_13 += var16_6.m1 + var10_11;
lbl48:
                        // 2 sources

                        while (true) {
                            var6_12 = 0;
                            break;
                        }
                    } else {
                        var8_13 = var10_11;
                        ** continue;
                    }
                    var17_9.b((e)var18_8);
                    ++var9_14;
                    var10_11 = var6_12;
                    var6_12 = var7_15;
                    continue;
                }
                break;
            }
        } else {
            var9_14 = 0;
            var6_12 = 0;
            var8_13 = 0;
            while (true) {
                var18_8 = var16_6;
                var7_15 = var6_12;
                if (var8_13 >= var2_2) break;
                var19_7 = var1_1 /* !! */ [var8_13];
                var11_16 = var16_6.k2((e)var19_7, var4_4);
                var7_15 = var6_12;
                if (var19_7.T() == e.b.d0) {
                    var7_15 = var6_12 + 1;
                }
                var6_12 = (var9_14 == var4_4 || var16_6.n1 + var9_14 + var11_16 > var4_4) && ax.H.g$a.a((a)var17_9) != null ? 1 : 0;
                var10_11 = var6_12;
                if (var6_12 == 0) {
                    var10_11 = var6_12;
                    if (var8_13 > 0) {
                        var12_17 = var16_6.r1;
                        var10_11 = var6_12;
                        if (var12_17 > 0) {
                            var10_11 = var6_12;
                            if (var12_17 < 0) {
                                var10_11 = 1;
                            }
                        }
                    }
                }
                if (var10_11 != 0) {
                    var18_8 = new a((g)var16_6, var3_3, var16_6.O, var16_6.P, var16_6.Q, var16_6.R, var4_4);
                    var18_8.i(var8_13);
                    var16_6.t1.add((a)var18_8);
                    while (true) {
                        var6_12 = var11_16;
                        var17_9 = var18_8;
                        break;
                    }
                } else {
                    var18_8 = var17_9;
                    if (var8_13 <= 0) ** continue;
                    var6_12 = var9_14 + (var16_6.n1 + var11_16);
                }
                var17_9.b((e)var19_7);
                ++var8_13;
                var9_14 = var6_12;
                var6_12 = var7_15;
            }
        }
        var15_19 = var18_8.t1.size();
        var16_6 = var18_8.O;
        var17_9 = var18_8.P;
        var19_7 = var18_8.Q;
        var20_10 = var18_8.R;
        var9_14 = var18_8.z1();
        var8_13 = var18_8.B1();
        var10_11 = var18_8.A1();
        var11_16 = var18_8.y1();
        var1_1 /* !! */  = var18_8.A();
        var2_2 = var1_1 /* !! */  != (var21_20 = e.b.c0) && var18_8.T() != var21_20 ? 0 : 1;
        if (var7_15 > 0 && var2_2 != 0) {
            for (var2_2 = 0; var2_2 < var15_19; ++var2_2) {
                var1_1 /* !! */  = var18_8.t1.get(var2_2);
                if (var3_3 == 0) {
                    var1_1 /* !! */ .g(var4_4 - var1_1 /* !! */ .f());
                    continue;
                }
                var1_1 /* !! */ .g(var4_4 - var1_1 /* !! */ .e());
            }
        }
        var6_12 = 0;
        var2_2 = 0;
        var7_15 = var8_13;
        var12_17 = 0;
        for (var8_13 = var2_2; var8_13 < var15_19; ++var8_13) {
            var21_20 = var18_8.t1.get(var8_13);
            if (var3_3 == 0) {
                if (var8_13 < var15_19 - 1) {
                    var1_1 /* !! */  = ax.H.g$a.a((a)var18_8.t1.get((int)(var8_13 + 1))).P;
                    var2_2 = 0;
                } else {
                    var1_1 /* !! */  = var18_8.R;
                    var2_2 = var18_8.y1();
                }
                var20_10 = ax.H.g$a.a((a)var21_20).R;
                var21_20.j(var3_3, (d)var16_6, (d)var17_9, (d)var19_7, (d)var1_1 /* !! */ , var9_14, var7_15, var10_11, var2_2, var4_4);
                var7_15 = Math.max(var12_17, var21_20.f());
                var6_12 = var11_16 = var21_20.e() + var6_12;
                if (var8_13 > 0) {
                    var6_12 = var11_16 + var18_8.n1;
                }
                var17_9 = var20_10;
                var13_18 = 0;
                var11_16 = var2_2;
            } else {
                if (var8_13 < var15_19 - 1) {
                    var1_1 /* !! */  = ax.H.g$a.a((a)var18_8.t1.get((int)(var8_13 + 1))).O;
                    var2_2 = 0;
lbl144:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var1_1 /* !! */  = var18_8.Q;
                var2_2 = var18_8.A1();
                ** continue;
                var19_7 = var1_1 /* !! */ ;
                var1_1 /* !! */  = ax.H.g$a.a((a)var21_20).Q;
                var21_20.j(var3_3, (d)var16_6, (d)var17_9, (d)var19_7, (d)var20_10, var9_14, var7_15, var2_2, var11_16, var4_4);
                var9_14 = var21_20.f() + var12_17;
                var12_17 = Math.max(var6_12, var21_20.e());
                var6_12 = var9_14;
                if (var8_13 > 0) {
                    var6_12 = var9_14 + var18_8.m1;
                }
                var14_21 = var6_12;
                var16_6 = var1_1 /* !! */ ;
                var9_14 = 0;
                var10_11 = var2_2;
                var13_18 = var7_15;
                var1_1 /* !! */  = var20_10;
                var6_12 = var12_17;
                var7_15 = var14_21;
            }
            var12_17 = var7_15;
            var20_10 = var1_1 /* !! */ ;
            var7_15 = var13_18;
        }
        var5_5[0] = var12_17;
        var5_5[1] = var6_12;
    }

    private void p2(e[] eArray, int n8, int n9, int n10, int[] nArray) {
        a a8;
        if (n8 == 0) {
            return;
        }
        if (this.t1.size() == 0) {
            a8 = new a(this, n9, this.O, this.P, this.Q, this.R, n10);
            this.t1.add(a8);
        } else {
            a8 = this.t1.get(0);
            a8.c();
            a8.j(n9, this.O, this.P, this.Q, this.R, this.z1(), this.B1(), this.A1(), this.y1(), n10);
        }
        for (n9 = 0; n9 < n8; ++n9) {
            a8.b(eArray[n9]);
        }
        nArray[0] = a8.f();
        nArray[1] = a8.e();
    }

    public void A2(float f8) {
        this.l1 = f8;
    }

    public void B2(int n8) {
        this.f1 = n8;
    }

    @Override
    public void C1(int n8, int n9, int n10, int n11) {
        int n12;
        int n13;
        if (this.M0 > 0 && !this.E1()) {
            this.H1(0, 0);
            this.G1(false);
            return;
        }
        int n14 = this.z1();
        int n15 = this.A1();
        int n16 = this.B1();
        int n17 = this.y1();
        int[] nArray = new int[2];
        int n18 = n9 - n14 - n15;
        int n19 = this.s1;
        if (n19 == 1) {
            n18 = n11 - n16 - n17;
        }
        if (n19 == 0) {
            if (this.a1 == -1) {
                this.a1 = 0;
            }
            if (this.b1 == -1) {
                this.b1 = 0;
            }
        } else {
            if (this.a1 == -1) {
                this.a1 = 0;
            }
            if (this.b1 == -1) {
                this.b1 = 0;
            }
        }
        e[] eArray = this.L0;
        n19 = 0;
        for (n13 = 0; n13 < (n12 = this.M0); ++n13) {
            n12 = n19;
            if (this.L0[n13].V() == 8) {
                n12 = n19 + 1;
            }
            n19 = n12;
        }
        if (n19 > 0) {
            eArray = new e[n12 - n19];
            n19 = 0;
            for (n13 = 0; n13 < this.M0; ++n13) {
                e e8 = this.L0[n13];
                n12 = n19;
                if (e8.V() != 8) {
                    eArray[n19] = e8;
                    n12 = n19 + 1;
                }
                n19 = n12;
            }
        } else {
            n19 = n12;
        }
        this.x1 = eArray;
        this.y1 = n19;
        n13 = this.q1;
        if (n13 != 0) {
            if (n13 != 1) {
                if (n13 != 2) {
                    if (n13 == 3) {
                        this.o2(eArray, n19, this.s1, n18, nArray);
                    }
                } else {
                    this.m2(eArray, n19, this.s1, n18, nArray);
                }
            } else {
                this.n2(eArray, n19, this.s1, n18, nArray);
            }
        } else {
            this.p2(eArray, n19, this.s1, n18, nArray);
        }
        n18 = nArray[0] + n14 + n15;
        n19 = nArray[1] + n16 + n17;
        n8 = n8 == 0x40000000 ? n9 : (n8 == Integer.MIN_VALUE ? Math.min(n18, n9) : (n8 == 0 ? n18 : 0));
        n9 = n10 == 0x40000000 ? n11 : (n10 == Integer.MIN_VALUE ? Math.min(n19, n11) : (n10 == 0 ? n19 : 0));
        this.H1(n8, n9);
        this.k1(n8);
        this.L0(n9);
        boolean bl = this.M0 > 0;
        this.G1(bl);
    }

    public void C2(int n8) {
        this.r1 = n8;
    }

    public void D2(int n8) {
        this.s1 = n8;
    }

    public void E2(int n8) {
        this.p1 = n8;
    }

    public void F2(float f8) {
        this.h1 = f8;
    }

    public void G2(int n8) {
        this.n1 = n8;
    }

    public void H2(int n8) {
        this.b1 = n8;
    }

    public void I2(int n8) {
        this.q1 = n8;
    }

    @Override
    public void g(ax.E.d object, boolean bl) {
        super.g((ax.E.d)object, bl);
        bl = this.K() != null && ((f)this.K()).P1();
        int n8 = this.q1;
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 == 3) {
                        int n9 = this.t1.size();
                        for (n8 = 0; n8 < n9; ++n8) {
                            object = this.t1.get(n8);
                            boolean bl2 = n8 == n9 - 1;
                            ((a)object).d(bl, n8, bl2);
                        }
                    }
                } else {
                    this.j2(bl);
                }
            } else {
                int n10 = this.t1.size();
                for (n8 = 0; n8 < n10; ++n8) {
                    object = this.t1.get(n8);
                    boolean bl3 = n8 == n10 - 1;
                    ((a)object).d(bl, n8, bl3);
                }
            }
        } else if (this.t1.size() > 0) {
            this.t1.get(0).d(bl, 0, true);
        }
        this.G1(false);
    }

    public void q2(float f8) {
        this.i1 = f8;
    }

    public void r2(int n8) {
        this.c1 = n8;
    }

    public void s2(float f8) {
        this.j1 = f8;
    }

    public void t2(int n8) {
        this.d1 = n8;
    }

    public void u2(int n8) {
        this.o1 = n8;
    }

    public void v2(float f8) {
        this.g1 = f8;
    }

    public void w2(int n8) {
        this.m1 = n8;
    }

    public void x2(int n8) {
        this.a1 = n8;
    }

    public void y2(float f8) {
        this.k1 = f8;
    }

    public void z2(int n8) {
        this.e1 = n8;
    }

    private class a {
        private int a;
        private e b;
        int c;
        private d d;
        private d e;
        private d f;
        private d g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;
        private int n;
        private int o;
        private int p;
        private int q;
        final g r;

        public a(g g8, int n8, d d8, d d9, d d10, d d11, int n9) {
            this.r = g8;
            this.b = null;
            this.c = 0;
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            this.o = 0;
            this.p = 0;
            this.q = 0;
            this.a = n8;
            this.d = d8;
            this.e = d9;
            this.f = d10;
            this.g = d11;
            this.h = g8.z1();
            this.i = g8.B1();
            this.j = g8.A1();
            this.k = g8.y1();
            this.q = n9;
        }

        static /* synthetic */ e a(a a8) {
            return a8.b;
        }

        private void h() {
            this.l = 0;
            this.m = 0;
            this.b = null;
            this.c = 0;
            int n8 = this.o;
            for (int i8 = 0; i8 < n8 && this.n + i8 < this.r.y1; ++i8) {
                int n9;
                int n10;
                e e8 = this.r.x1[this.n + i8];
                if (this.a == 0) {
                    n10 = e8.W();
                    n9 = this.r.m1;
                    if (e8.V() == 8) {
                        n9 = 0;
                    }
                    this.l += n10 + n9;
                    n9 = this.r.k2(e8, this.q);
                    if (this.b != null && this.c >= n9) continue;
                    this.b = e8;
                    this.c = n9;
                    this.m = n9;
                    continue;
                }
                n10 = this.r.l2(e8, this.q);
                int n11 = this.r.k2(e8, this.q);
                n9 = this.r.n1;
                if (e8.V() == 8) {
                    n9 = 0;
                }
                this.m += n11 + n9;
                if (this.b != null && this.c >= n10) continue;
                this.b = e8;
                this.c = n10;
                this.l = n10;
            }
        }

        public void b(e e8) {
            int n8 = this.a;
            int n9 = 0;
            int n10 = 0;
            if (n8 == 0) {
                n8 = this.r.l2(e8, this.q);
                if (e8.A() == e.b.d0) {
                    ++this.p;
                    n8 = 0;
                }
                n9 = this.r.m1;
                if (e8.V() == 8) {
                    n9 = n10;
                }
                this.l += n8 + n9;
                n8 = this.r.k2(e8, this.q);
                if (this.b == null || this.c < n8) {
                    this.b = e8;
                    this.c = n8;
                    this.m = n8;
                }
            } else {
                int n11 = this.r.l2(e8, this.q);
                n8 = this.r.k2(e8, this.q);
                if (e8.T() == e.b.d0) {
                    ++this.p;
                    n8 = 0;
                }
                n10 = this.r.n1;
                if (e8.V() != 8) {
                    n9 = n10;
                }
                this.m += n8 + n9;
                if (this.b == null || this.c < n11) {
                    this.b = e8;
                    this.c = n11;
                    this.l = n11;
                }
            }
            ++this.o;
        }

        public void c() {
            this.c = 0;
            this.b = null;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            this.o = 0;
            this.p = 0;
        }

        /*
         * Unable to fully structure code
         */
        public void d(boolean var1_1, int var2_2, boolean var3_3) {
            block62: {
                block63: {
                    var12_4 = this.o;
                    for (var6_5 = 0; var6_5 < var12_4 && this.n + var6_5 < ax.H.g.d2(this.r); ++var6_5) {
                        var13_6 = ax.H.g.e2(this.r)[this.n + var6_5];
                        if (var13_6 == null) continue;
                        var13_6.u0();
                    }
                    if (var12_4 == 0 || this.b == null) break block62;
                    var9_7 = var3_3 != false && var2_2 == 0;
                    var7_8 = -1;
                    var8_9 = -1;
                    for (var6_5 = 0; var6_5 < var12_4 && this.n + (var10_10 = var1_1 != false ? var12_4 - 1 - var6_5 : var6_5) < ax.H.g.d2(this.r); ++var6_5) {
                        var13_6 = ax.H.g.e2(this.r)[this.n + var10_10];
                        var11_11 = var7_8;
                        var10_10 = var8_9;
                        if (var13_6 != null) {
                            var11_11 = var7_8;
                            var10_10 = var8_9;
                            if (var13_6.V() == 0) {
                                var8_9 = var7_8;
                                if (var7_8 == -1) {
                                    var8_9 = var6_5;
                                }
                                var10_10 = var6_5;
                                var11_11 = var8_9;
                            }
                        }
                        var7_8 = var11_11;
                        var8_9 = var10_10;
                    }
                    var6_5 = this.a;
                    var14_12 = null;
                    var13_6 = null;
                    if (var6_5 != 0) break block63;
                    var16_13 = this.b;
                    var16_13.e1(ax.H.g.f2(this.r));
                    var6_5 = var10_10 = this.i;
                    if (var2_2 > 0) {
                        var6_5 = var10_10 + ax.H.g.Q1(this.r);
                    }
                    var16_13.P.a(this.e, var6_5);
                    if (var3_3) {
                        var16_13.R.a(this.g, this.k);
                    }
                    if (var2_2 > 0) {
                        this.e.d.R.a(var16_13.P, 0);
                    }
                    if (ax.H.g.g2(this.r) == 3 && !var16_13.Z()) {
                        for (var2_2 = 0; var2_2 < var12_4 && this.n + (var6_5 = var1_1 != false ? var12_4 - 1 - var2_2 : var2_2) < ax.H.g.d2(this.r); ++var2_2) {
                            var14_12 = ax.H.g.e2(this.r)[this.n + var6_5];
                            if (!var14_12.Z()) {
                                continue;
                            }
                            break;
                        }
                    } else {
                        var14_12 = var16_13;
                    }
                    for (var6_5 = 0; var6_5 < var12_4 && this.n + (var2_2 = var1_1 != false ? var12_4 - 1 - var6_5 : var6_5) < ax.H.g.d2(this.r); ++var6_5) {
                        block64: {
                            block61: {
                                block65: {
                                    var15_18 = ax.H.g.e2(this.r)[this.n + var2_2];
                                    if (var15_18 == null) continue;
                                    if (var6_5 == 0) {
                                        var15_18.k(var15_18.O, this.d, this.h);
                                    }
                                    if (var2_2 != 0) break block64;
                                    var10_10 = ax.H.g.h2(this.r);
                                    var4_14 = var5_16 = ax.H.g.i2(this.r);
                                    if (var1_1) {
                                        var4_14 = 1.0f - var5_16;
                                    }
                                    if (this.n != 0 || ax.H.g.R1(this.r) == -1) break block65;
                                    var2_2 = ax.H.g.R1(this.r);
                                    if (var1_1) {
                                        var4_14 = ax.H.g.S1(this.r);
lbl65:
                                        // 2 sources

                                        while (true) {
                                            var4_14 = 1.0f - var4_14;
lbl67:
                                            // 3 sources

                                            while (true) {
                                                var5_16 = var4_14;
                                                break block61;
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    var4_14 = ax.H.g.S1(this.r);
                                    ** GOTO lbl67
                                }
                                var2_2 = var10_10;
                                var5_16 = var4_14;
                                if (var3_3) {
                                    var2_2 = var10_10;
                                    var5_16 = var4_14;
                                    if (ax.H.g.T1(this.r) != -1) {
                                        var2_2 = ax.H.g.T1(this.r);
                                        if (var1_1) {
                                            var4_14 = ax.H.g.U1(this.r);
                                            ** continue;
                                        }
                                        var4_14 = ax.H.g.U1(this.r);
                                        ** continue;
                                    }
                                }
                            }
                            var15_18.N0(var2_2);
                            var15_18.M0(var5_16);
                        }
                        if (var6_5 == var12_4 - 1) {
                            var15_18.k(var15_18.Q, this.f, this.j);
                        }
                        if (var13_6 != null) {
                            var15_18.O.a(var13_6.Q, ax.H.g.P1(this.r));
                            if (var6_5 == var7_8) {
                                var15_18.O.u(this.h);
                            }
                            var13_6.Q.a(var15_18.O, 0);
                            if (var6_5 == var8_9 + 1) {
                                var13_6.Q.u(this.j);
                            }
                        }
                        var13_6 = var15_18;
                        if (var15_18 == var16_13) continue;
                        if (ax.H.g.g2(this.r) == 3 && var14_12.Z() && var15_18 != var14_12 && var15_18.Z()) {
                            var15_18.S.a(var14_12.S, 0);
                            var13_6 = var15_18;
                            continue;
                        }
                        var2_2 = ax.H.g.g2(this.r);
                        if (var2_2 != 0) {
                            if (var2_2 != 1) {
                                if (var9_7) {
                                    var15_18.P.a(this.e, this.i);
                                    var15_18.R.a(this.g, this.k);
                                    var13_6 = var15_18;
                                    continue;
                                }
                                var15_18.P.a(var16_13.P, 0);
                                var15_18.R.a(var16_13.R, 0);
                                var13_6 = var15_18;
                                continue;
                            }
                            var15_18.R.a(var16_13.R, 0);
                            var13_6 = var15_18;
                            continue;
                        }
                        var15_18.P.a(var16_13.P, 0);
                        var13_6 = var15_18;
                    }
                    break block62;
                }
                var15_19 = this.b;
                var15_19.N0(ax.H.g.h2(this.r));
                var6_5 = var10_10 = this.h;
                if (var2_2 > 0) {
                    var6_5 = var10_10 + ax.H.g.P1(this.r);
                }
                if (var1_1) {
                    var15_19.Q.a(this.f, var6_5);
                    if (var3_3) {
                        var15_19.O.a(this.d, this.j);
                    }
                    if (var2_2 > 0) {
                        this.f.d.O.a(var15_19.Q, 0);
                    }
                } else {
                    var15_19.O.a(this.d, var6_5);
                    if (var3_3) {
                        var15_19.Q.a(this.f, this.j);
                    }
                    if (var2_2 > 0) {
                        this.d.d.Q.a(var15_19.O, 0);
                    }
                }
                var13_6 = var14_12;
                for (var6_5 = 0; var6_5 < var12_4 && this.n + var6_5 < ax.H.g.d2(this.r); ++var6_5) {
                    var14_12 = ax.H.g.e2(this.r)[this.n + var6_5];
                    if (var14_12 == null) continue;
                    if (var6_5 == 0) {
                        var14_12.k(var14_12.P, this.e, this.i);
                        var10_10 = ax.H.g.f2(this.r);
                        var5_17 = ax.H.g.V1(this.r);
                        if (this.n == 0 && ax.H.g.W1(this.r) != -1) {
                            var2_2 = ax.H.g.W1(this.r);
                            var4_15 = ax.H.g.X1(this.r);
                        } else {
                            var2_2 = var10_10;
                            var4_15 = var5_17;
                            if (var3_3) {
                                var2_2 = var10_10;
                                var4_15 = var5_17;
                                if (ax.H.g.Y1(this.r) != -1) {
                                    var2_2 = ax.H.g.Y1(this.r);
                                    var4_15 = ax.H.g.Z1(this.r);
                                }
                            }
                        }
                        var14_12.e1(var2_2);
                        var14_12.d1(var4_15);
                    }
                    if (var6_5 == var12_4 - 1) {
                        var14_12.k(var14_12.R, this.g, this.k);
                    }
                    if (var13_6 != null) {
                        var14_12.P.a(var13_6.R, ax.H.g.Q1(this.r));
                        if (var6_5 == var7_8) {
                            var14_12.P.u(this.i);
                        }
                        var13_6.R.a(var14_12.P, 0);
                        if (var6_5 == var8_9 + 1) {
                            var13_6.R.u(this.k);
                        }
                    }
                    if (var14_12 != var15_19) {
                        if (var1_1) {
                            var2_2 = ax.H.g.a2(this.r);
                            if (var2_2 != 0) {
                                if (var2_2 != 1) {
                                    if (var2_2 == 2) {
                                        var14_12.O.a(var15_19.O, 0);
                                        var14_12.Q.a(var15_19.Q, 0);
                                    }
                                } else {
                                    var14_12.O.a(var15_19.O, 0);
                                }
                            } else {
                                var14_12.Q.a(var15_19.Q, 0);
                            }
                        } else {
                            var2_2 = ax.H.g.a2(this.r);
                            if (var2_2 != 0) {
                                if (var2_2 != 1) {
                                    if (var2_2 == 2) {
                                        if (var9_7) {
                                            var14_12.O.a(this.d, this.h);
                                            var14_12.Q.a(this.f, this.j);
                                        } else {
                                            var14_12.O.a(var15_19.O, 0);
                                            var14_12.Q.a(var15_19.Q, 0);
                                        }
                                    }
                                } else {
                                    var14_12.Q.a(var15_19.Q, 0);
                                }
                            } else {
                                var14_12.O.a(var15_19.O, 0);
                            }
                        }
                    }
                    var13_6 = var14_12;
                }
            }
        }

        public int e() {
            if (this.a == 1) {
                return this.m - this.r.n1;
            }
            return this.m;
        }

        public int f() {
            if (this.a == 0) {
                return this.l - this.r.m1;
            }
            return this.l;
        }

        public void g(int n8) {
            int n9 = this.p;
            if (n9 == 0) {
                return;
            }
            int n10 = this.o;
            n8 /= n9;
            for (n9 = 0; n9 < n10 && this.n + n9 < this.r.y1; ++n9) {
                int n11;
                e e8 = this.r.x1[this.n + n9];
                if (this.a == 0) {
                    n11 = n8;
                    if (e8 != null) {
                        n11 = n8;
                        if (e8.A() == e.b.d0) {
                            n11 = n8;
                            if (e8.w == 0) {
                                this.r.D1(e8, e.b.q, n8, e8.T(), e8.x());
                                n11 = n8;
                            }
                        }
                    }
                } else {
                    n11 = n8;
                    if (e8 != null) {
                        n11 = n8;
                        if (e8.T() == e.b.d0) {
                            n11 = n8;
                            if (e8.x == 0) {
                                this.r.D1(e8, e8.A(), e8.W(), e.b.q, n8);
                                n11 = n8;
                            }
                        }
                    }
                }
                n8 = n11;
            }
            this.h();
        }

        public void i(int n8) {
            this.n = n8;
        }

        public void j(int n8, d d8, d d9, d d10, d d11, int n9, int n10, int n11, int n12, int n13) {
            this.a = n8;
            this.d = d8;
            this.e = d9;
            this.f = d10;
            this.g = d11;
            this.h = n9;
            this.i = n10;
            this.j = n11;
            this.k = n12;
            this.q = n13;
        }
    }
}

