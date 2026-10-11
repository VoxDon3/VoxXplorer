/*
 * Decompiled with CFR 0.152.
 */
package ax.H;

import ax.E.i;
import ax.H.d;
import ax.H.f;
import ax.H.h;
import ax.H.k;
import ax.H.l;
import ax.I.c;
import ax.I.n;
import ax.I.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class e {
    public static float K0 = 0.5f;
    public int A = 0;
    int A0;
    public float B = 1.0f;
    boolean B0;
    public int C = 0;
    boolean C0;
    public int D = 0;
    public float[] D0;
    public float E = 1.0f;
    protected e[] E0;
    int F = -1;
    protected e[] F0;
    float G = 1.0f;
    e G0;
    private int[] H;
    e H0;
    private float I = 0.0f;
    public int I0;
    private boolean J = false;
    public int J0;
    private boolean K;
    private boolean L = false;
    private int M = 0;
    private int N = 0;
    public d O;
    public d P;
    public d Q;
    public d R;
    public d S;
    d T;
    d U;
    public d V;
    public d[] W;
    protected ArrayList<d> X;
    private boolean[] Y;
    public b[] Z;
    public boolean a = false;
    public e a0;
    public p[] b = new p[2];
    int b0;
    public c c;
    int c0;
    public c d;
    public float d0;
    public ax.I.l e = null;
    protected int e0;
    public n f = null;
    protected int f0;
    public boolean[] g = new boolean[]{true, true};
    protected int g0;
    boolean h = false;
    int h0;
    private boolean i = true;
    int i0;
    private boolean j = false;
    protected int j0;
    private boolean k = true;
    protected int k0;
    private int l = -1;
    int l0;
    private int m = -1;
    protected int m0;
    public ax.G.a n = new ax.G.a(this);
    protected int n0;
    public String o;
    float o0;
    private boolean p = false;
    float p0;
    private boolean q = false;
    private Object q0;
    private boolean r = false;
    private int r0;
    private boolean s = false;
    private int s0;
    public int t = -1;
    private boolean t0;
    public int u = -1;
    private String u0;
    private int v = 0;
    private String v0;
    public int w = 0;
    boolean w0;
    public int x = 0;
    boolean x0;
    public int[] y = new int[2];
    boolean y0;
    public int z = 0;
    int z0;

    public e() {
        float f8;
        Object object;
        this.H = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.O = new d(this, d.b.c0);
        this.P = new d(this, d.b.d0);
        this.Q = new d(this, d.b.e0);
        this.R = new d(this, d.b.f0);
        this.S = new d(this, d.b.g0);
        this.T = new d(this, d.b.i0);
        this.U = new d(this, d.b.j0);
        this.V = object = new d(this, d.b.h0);
        this.W = new d[]{this.O, this.Q, this.P, this.R, this.S, object};
        this.X = new ArrayList();
        this.Y = new boolean[2];
        object = ax.H.e$b.q;
        this.Z = new b[]{object, object};
        this.a0 = null;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0.0f;
        this.e0 = -1;
        this.f0 = 0;
        this.g0 = 0;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        this.o0 = f8 = K0;
        this.p0 = f8;
        this.r0 = 0;
        this.s0 = 0;
        this.t0 = false;
        this.u0 = null;
        this.v0 = null;
        this.y0 = false;
        this.z0 = 0;
        this.A0 = 0;
        this.D0 = new float[]{-1.0f, -1.0f};
        this.E0 = new e[]{null, null};
        this.F0 = new e[]{null, null};
        this.G0 = null;
        this.H0 = null;
        this.I0 = -1;
        this.J0 = -1;
        this.d();
    }

    private void P(StringBuilder stringBuilder, String string, int n8, int n9, int n10, int n11, int n12, int n13, float f8, float f9) {
        stringBuilder.append(string);
        stringBuilder.append(" :  {\n");
        this.y0(stringBuilder, "      size", n8, 0);
        this.y0(stringBuilder, "      min", n9, 0);
        this.y0(stringBuilder, "      max", n10, Integer.MAX_VALUE);
        this.y0(stringBuilder, "      matchMin", n12, 0);
        this.y0(stringBuilder, "      matchDef", n13, 0);
        this.x0(stringBuilder, "      matchPercent", f8, 1.0f);
        stringBuilder.append("    },\n");
    }

    private void Q(StringBuilder stringBuilder, String string, d d8) {
        if (d8.f == null) {
            return;
        }
        stringBuilder.append("    ");
        stringBuilder.append(string);
        stringBuilder.append(" : [ '");
        stringBuilder.append(d8.f);
        stringBuilder.append("'");
        if (d8.h != Integer.MIN_VALUE || d8.g != 0) {
            stringBuilder.append(",");
            stringBuilder.append(d8.g);
            if (d8.h != Integer.MIN_VALUE) {
                stringBuilder.append(",");
                stringBuilder.append(d8.h);
                stringBuilder.append(",");
            }
        }
        stringBuilder.append(" ] ,\n");
    }

    private void d() {
        this.X.add(this.O);
        this.X.add(this.P);
        this.X.add(this.Q);
        this.X.add(this.R);
        this.X.add(this.T);
        this.X.add(this.U);
        this.X.add(this.V);
        this.X.add(this.S);
    }

    private boolean f0(int n8) {
        Object object = this.W;
        d d8 = object[n8 *= 2];
        d d9 = d8.f;
        if (d9 != null && d9.f != d8) {
            d8 = object[n8 + 1];
            object = d8.f;
            if (object != null && object.f == d8) {
                return true;
            }
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void i(ax.E.d var1_1, boolean var2_2, boolean var3_3, boolean var4_4, boolean var5_5, i var6_6, i var7_7, b var8_8, boolean var9_9, d var10_10, d var11_11, int var12_12, int var13_13, int var14_14, int var15_15, float var16_16, boolean var17_17, boolean var18_18, boolean var19_19, boolean var20_20, boolean var21_21, int var22_22, int var23_23, int var24_24, int var25_25, float var26_26, boolean var27_27) {
        block120: {
            block106: {
                block105: {
                    block107: {
                        block121: {
                            block124: {
                                block125: {
                                    block122: {
                                        block123: {
                                            block104: {
                                                block119: {
                                                    block110: {
                                                        block113: {
                                                            block117: {
                                                                block118: {
                                                                    block114: {
                                                                        block115: {
                                                                            block116: {
                                                                                block111: {
                                                                                    block112: {
                                                                                        block109: {
                                                                                            block108: {
                                                                                                var39_28 = var1_1.q(var10_10);
                                                                                                var37_29 = var1_1.q(var11_11);
                                                                                                var40_30 = var1_1.q(var10_10.j());
                                                                                                var36_31 = var1_1.q(var11_11.j());
                                                                                                ax.E.d.w();
                                                                                                var32_32 = var10_10.o();
                                                                                                var35_33 = var11_11.o();
                                                                                                var34_34 = this.V.o();
                                                                                                var28_35 = var35_33 != false ? var32_32 + 1 : var32_32;
                                                                                                var31_36 = var28_35;
                                                                                                if (var34_34) {
                                                                                                    var31_36 = var28_35 + 1;
                                                                                                }
                                                                                                var30_37 = var17_17 != false ? 3 : var22_22;
                                                                                                var22_22 = ax.H.e$a.b[var8_8.ordinal()];
                                                                                                if (var22_22 == 1 || var22_22 == 2 || var22_22 == 3 || var22_22 != 4) {
                                                                                                    while (true) {
                                                                                                        var29_38 = 0;
                                                                                                        break;
                                                                                                    }
                                                                                                } else {
                                                                                                    if (var30_37 == 4) ** continue;
                                                                                                    var29_38 = 1;
                                                                                                }
                                                                                                var33_39 = this.l;
                                                                                                var22_22 = var29_38;
                                                                                                var28_35 = var13_13;
                                                                                                if (var33_39 != -1) {
                                                                                                    var22_22 = var29_38;
                                                                                                    var28_35 = var13_13;
                                                                                                    if (var2_2) {
                                                                                                        this.l = -1;
                                                                                                        var28_35 = var33_39;
                                                                                                        var22_22 = 0;
                                                                                                    }
                                                                                                }
                                                                                                if ((var13_13 = this.m) != -1 && !var2_2) {
                                                                                                    this.m = -1;
                                                                                                    var28_35 = 0;
                                                                                                    var22_22 = var13_13;
                                                                                                    var13_13 = var28_35;
                                                                                                } else {
                                                                                                    var13_13 = var22_22;
                                                                                                    var22_22 = var28_35;
                                                                                                }
                                                                                                if (this.s0 == 8) {
                                                                                                    var22_22 = 0;
                                                                                                    var13_13 = 0;
                                                                                                }
                                                                                                if (var27_27) {
                                                                                                    if (var32_32 == 0 && !var35_33 && !var34_34) {
                                                                                                        var1_1.f(var39_28, var12_12);
                                                                                                    } else if (var32_32 != 0 && !var35_33) {
                                                                                                        var1_1.e(var39_28, var40_30, var10_10.f(), 8);
                                                                                                    }
                                                                                                }
                                                                                                if (var13_13 == 0) {
                                                                                                    if (var9_9) {
                                                                                                        var1_1.e(var37_29, var39_28, 0, 3);
                                                                                                        if (var14_14 > 0) {
                                                                                                            var1_1.h(var37_29, var39_28, var14_14, 8);
                                                                                                        }
                                                                                                        if (var15_15 < 0x7FFFFFFF) {
                                                                                                            var1_1.j(var37_29, var39_28, var15_15, 8);
                                                                                                        }
                                                                                                    } else {
                                                                                                        var1_1.e(var37_29, var39_28, var22_22, 8);
                                                                                                    }
                                                                                                    var28_35 = var13_13;
lbl62:
                                                                                                    // 2 sources

                                                                                                    while (true) {
                                                                                                        var12_12 = var25_25;
                                                                                                        var25_25 = var24_24;
                                                                                                        break;
                                                                                                    }
                                                                                                } else {
                                                                                                    if (!(var31_36 == 2 || var17_17 || var30_37 != 1 && var30_37 != 0)) {
                                                                                                        var12_12 = var13_13 = Math.max(var24_24, var22_22);
                                                                                                        if (var25_25 > 0) {
                                                                                                            var12_12 = Math.min(var25_25, var13_13);
                                                                                                        }
                                                                                                        var1_1.e(var37_29, var39_28, var12_12, 8);
                                                                                                        var28_35 = 0;
                                                                                                        ** continue;
                                                                                                    }
                                                                                                    var12_12 = var24_24 == -2 ? var22_22 : var24_24;
                                                                                                    var15_15 = var25_25 == -2 ? var22_22 : var25_25;
                                                                                                    var24_24 = var22_22;
                                                                                                    if (var22_22 > 0) {
                                                                                                        var24_24 = var22_22;
                                                                                                        if (var30_37 != 1) {
                                                                                                            var24_24 = 0;
                                                                                                        }
                                                                                                    }
                                                                                                    var22_22 = var24_24;
                                                                                                    if (var12_12 > 0) {
                                                                                                        var1_1.h(var37_29, var39_28, var12_12, 8);
                                                                                                        var22_22 = Math.max(var24_24, var12_12);
                                                                                                    }
                                                                                                    var24_24 = var22_22;
                                                                                                    if (var15_15 > 0) {
                                                                                                        if (!var3_3 || var30_37 != 1) {
                                                                                                            var1_1.j(var37_29, var39_28, var15_15, 8);
                                                                                                        }
                                                                                                        var24_24 = Math.min(var22_22, var15_15);
                                                                                                    }
                                                                                                    if (var30_37 == 1) {
                                                                                                        if (var3_3) {
                                                                                                            var1_1.e(var37_29, var39_28, var24_24, 8);
                                                                                                        } else if (var19_19) {
                                                                                                            var1_1.e(var37_29, var39_28, var24_24, 5);
                                                                                                            var1_1.j(var37_29, var39_28, var24_24, 8);
                                                                                                        } else {
                                                                                                            var1_1.e(var37_29, var39_28, var24_24, 5);
                                                                                                            var1_1.j(var37_29, var39_28, var24_24, 8);
                                                                                                        }
                                                                                                        var25_25 = var12_12;
                                                                                                        var12_12 = var15_15;
                                                                                                        var28_35 = var13_13;
                                                                                                    } else if (var30_37 == 2) {
                                                                                                        var8_8 = var10_10.k();
                                                                                                        if (var8_8 != (var38_40 /* !! */  = d.b.d0) && var10_10.k() != d.b.f0) {
                                                                                                            var8_8 = var1_1.q(this.a0.o(d.b.c0));
                                                                                                            var38_40 /* !! */  = var1_1.q(this.a0.o(d.b.e0));
                                                                                                        } else {
                                                                                                            var8_8 = var1_1.q(this.a0.o(var38_40 /* !! */ ));
                                                                                                            var38_40 /* !! */  = var1_1.q(this.a0.o(d.b.f0));
                                                                                                        }
                                                                                                        var1_1.d(var1_1.r().k(var37_29, var39_28, (i)var38_40 /* !! */ , (i)var8_8, var26_26));
                                                                                                        if (var3_3) {
                                                                                                            var13_13 = 0;
                                                                                                        }
                                                                                                        var28_35 = var13_13;
lbl119:
                                                                                                        // 2 sources

                                                                                                        while (true) {
                                                                                                            var25_25 = var12_12;
                                                                                                            var12_12 = var15_15;
                                                                                                            break;
                                                                                                        }
                                                                                                    } else {
                                                                                                        var5_5 = true;
                                                                                                        var28_35 = var13_13;
                                                                                                        ** continue;
                                                                                                    }
                                                                                                }
                                                                                                var8_8 = var37_29;
                                                                                                if (!var27_27 || var19_19) break block106;
                                                                                                if (var32_32 == 0 && !var35_33 && !var34_34) break block107;
                                                                                                if (var32_32 == 0 || var35_33) break block108;
                                                                                                var6_6 /* !! */  = var10_10.f.d;
                                                                                                var12_12 = var3_3 != false && var6_6 /* !! */  instanceof ax.H.a != false ? 8 : 5;
                                                                                                var6_6 /* !! */  = var36_31;
                                                                                                break block105;
                                                                                            }
                                                                                            if (var32_32 != 0 || !var35_33) break block109;
                                                                                            var1_1.e((i)var8_8, var36_31, -var11_11.f(), 8);
                                                                                            if (var3_3) {
                                                                                                if (this.j && var39_28.h0 && (var8_8 = this.a0) != null) {
                                                                                                    var6_6 /* !! */  = (f)var8_8;
                                                                                                    if (var2_2) {
                                                                                                        var6_6 /* !! */ .z1((d)var10_10);
                                                                                                    } else {
                                                                                                        var6_6 /* !! */ .E1((d)var10_10);
                                                                                                    }
                                                                                                } else {
                                                                                                    var1_1.h(var39_28, (i)var6_6 /* !! */ , 0, 5);
                                                                                                }
                                                                                            }
                                                                                            break block107;
                                                                                        }
                                                                                        if (var32_32 == 0 || !var35_33) break block107;
                                                                                        var41_41 = var10_10.f.d;
                                                                                        var42_42 = var11_11.f.d;
                                                                                        var43_43 = this.K();
                                                                                        var31_36 = 6;
                                                                                        if (var28_35 == 0) break block110;
                                                                                        if (var30_37 == 0) {
                                                                                            if (var12_12 == 0 && var25_25 == 0) {
                                                                                                if (var40_30.h0 && var36_31.h0) {
                                                                                                    var1_1.e(var39_28, var40_30, var10_10.f(), 8);
                                                                                                    var1_1.e((i)var8_8, var36_31, -var11_11.f(), 8);
                                                                                                    return;
                                                                                                }
                                                                                                var12_12 = 8;
                                                                                                var23_23 = 8;
                                                                                                var13_13 = 0;
                                                                                                var15_15 = 1;
                                                                                                var22_22 = 0;
                                                                                            } else {
                                                                                                var12_12 = 5;
                                                                                                var23_23 = 5;
                                                                                                var13_13 = 1;
                                                                                                var15_15 = 0;
                                                                                                var22_22 = 1;
                                                                                            }
                                                                                            if (!(var41_41 instanceof ax.H.a) && !(var42_42 instanceof ax.H.a)) {
                                                                                                var29_38 = var23_23;
lbl176:
                                                                                                // 2 sources

                                                                                                while (true) {
                                                                                                    var32_32 = 6;
                                                                                                    var24_24 = var15_15;
                                                                                                    var23_23 = var13_13;
                                                                                                    var15_15 = var12_12;
                                                                                                    var13_13 = var29_38;
                                                                                                    var12_12 = var32_32;
lbl183:
                                                                                                    // 4 sources

                                                                                                    while (true) {
                                                                                                        var29_38 = var12_12;
                                                                                                        break block104;
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            var29_38 = 4;
                                                                                            ** continue;
                                                                                        }
                                                                                        if (var30_37 != 2) break block111;
                                                                                        if (var41_41 instanceof ax.H.a || var42_42 instanceof ax.H.a) break block112;
                                                                                        var13_13 = 5;
lbl191:
                                                                                        // 2 sources

                                                                                        while (true) {
                                                                                            var15_15 = 5;
lbl193:
                                                                                            // 2 sources

                                                                                            while (true) {
                                                                                                var22_22 = 1;
                                                                                                var23_23 = 1;
lbl196:
                                                                                                // 2 sources

                                                                                                while (true) {
                                                                                                    var12_12 = 6;
                                                                                                    var24_24 = 0;
                                                                                                    ** GOTO lbl183
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    var13_13 = 4;
                                                                                    ** while (true)
                                                                                }
                                                                                if (var30_37 == 1) {
                                                                                    var13_13 = 4;
                                                                                    var15_15 = 8;
                                                                                    ** continue;
                                                                                }
                                                                                if (var30_37 != 3) break block113;
                                                                                if (this.F != -1) break block114;
                                                                                if (!var20_20) break block115;
                                                                                if (!var3_3) break block116;
                                                                                var12_12 = 5;
lbl213:
                                                                                // 3 sources

                                                                                while (true) {
                                                                                    var13_13 = 5;
                                                                                    var15_15 = 8;
                                                                                    var22_22 = var12_12;
lbl217:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        var29_38 = 1;
                                                                                        var23_23 = 1;
                                                                                        var24_24 = 1;
                                                                                        var12_12 = var22_22;
                                                                                        var22_22 = var29_38;
                                                                                        ** GOTO lbl183
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                            }
                                                                            var12_12 = 4;
                                                                            ** GOTO lbl213
                                                                        }
                                                                        var12_12 = 8;
                                                                        ** while (true)
                                                                    }
                                                                    if (var17_17) {
                                                                        if (var23_23 != 2 && var23_23 != 1) {
                                                                            var13_13 = 8;
                                                                            var12_12 = 5;
                                                                        } else {
                                                                            var13_13 = 5;
                                                                            var12_12 = 4;
                                                                        }
                                                                        var15_15 = var13_13;
                                                                        var13_13 = var12_12;
lbl240:
                                                                        // 2 sources

                                                                        while (true) {
                                                                            var12_12 = 6;
                                                                            var22_22 = 1;
                                                                            var23_23 = 1;
                                                                            var24_24 = 1;
                                                                            ** continue;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (var12_12 > 0) {
                                                                        var12_12 = 5;
lbl248:
                                                                        // 3 sources

                                                                        while (true) {
                                                                            var22_22 = 6;
                                                                            var15_15 = 5;
                                                                            var13_13 = var12_12;
                                                                            ** continue;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (var12_12 != 0 || var25_25 != 0) break block117;
                                                                    if (var20_20) break block118;
                                                                    var12_12 = 8;
                                                                    ** GOTO lbl248
                                                                }
                                                                var12_12 = var41_41 != var43_43 && var42_42 != var43_43 ? 4 : 5;
                                                                var13_13 = 4;
                                                                var15_15 = var12_12;
                                                                ** while (true)
                                                            }
                                                            var12_12 = 4;
                                                            ** while (true)
                                                        }
                                                        var13_13 = 4;
                                                        var15_15 = 5;
                                                        var22_22 = 0;
                                                        var23_23 = 0;
                                                        ** while (true)
                                                    }
                                                    if (!var40_30.h0 || !var36_31.h0) break block119;
                                                    var1_1.c(var39_28, var40_30, var10_10.f(), var16_16, var36_31, (i)var8_8, var11_11.f(), 8);
                                                    if (var3_3 && var5_5) {
                                                        var12_12 = var11_11.f != null ? var11_11.f() : 0;
                                                        if (var36_31 != var7_7) {
                                                            var1_1.h(var7_7, (i)var8_8, var12_12, 5);
                                                            return;
                                                        }
                                                    }
                                                    break block120;
                                                }
                                                var29_38 = 6;
                                                var13_13 = 4;
                                                var15_15 = 5;
                                                var22_22 = 1;
                                                var23_23 = 1;
                                                var24_24 = 0;
                                            }
                                            if (var22_22 != 0 && var40_30 == var36_31 && var41_41 != var43_43) {
                                                var22_22 = 0;
                                                var12_12 = 0;
                                            } else {
                                                var12_12 = 1;
                                            }
                                            if (var23_23 != 0) {
                                                if (var28_35 == 0 && !var18_18 && !var20_20 && var40_30 == var6_6 /* !! */  && var36_31 == var7_7) {
                                                    var23_23 = 8;
                                                    var3_3 = false;
                                                    var15_15 = 8;
                                                    var12_12 = 0;
                                                } else {
                                                    var23_23 = var29_38;
                                                }
                                                var1_1.c(var39_28, var40_30, var10_10.f(), var16_16, var36_31, (i)var8_8, var11_11.f(), var23_23);
                                            }
                                            var38_40 /* !! */  = var37_29;
                                            var23_23 = 1;
                                            var8_8 = var36_31;
                                            if (this.s0 == 8 && !var11_11.m()) break block120;
                                            if (var22_22 != 0) {
                                                if (var3_3 && var40_30 != var8_8 && var28_35 == 0 && (var41_41 instanceof ax.H.a || var42_42 instanceof ax.H.a)) {
                                                    var15_15 = 6;
                                                }
                                                var1_1.h(var39_28, var40_30, var10_10.f(), var15_15);
                                                var1_1.j((i)var38_40 /* !! */ , (i)var8_8, -var11_11.f(), var15_15);
                                            }
                                            if (var3_3 && var21_21 && !(var41_41 instanceof ax.H.a) && !(var42_42 instanceof ax.H.a) && var42_42 != var43_43) {
                                                var12_12 = 6;
                                                var15_15 = 6;
                                                var22_22 = var23_23;
                                            } else {
                                                var22_22 = var12_12;
                                                var12_12 = var13_13;
                                            }
                                            if (var22_22 == 0) break block121;
                                            var13_13 = var12_12;
                                            if (var24_24 == 0) break block122;
                                            if (!var20_20) break block123;
                                            var13_13 = var12_12;
                                            if (!var4_4) break block122;
                                        }
                                        var13_13 = var31_36;
                                        if (var41_41 != var43_43) {
                                            var13_13 = var42_42 == var43_43 ? var31_36 : var12_12;
                                        }
                                        if (var41_41 instanceof h || var42_42 instanceof h) {
                                            var13_13 = 5;
                                        }
                                        if (var41_41 instanceof ax.H.a || var42_42 instanceof ax.H.a) {
                                            var13_13 = 5;
                                        }
                                        if (var20_20) {
                                            var13_13 = 5;
                                        }
                                        var13_13 = Math.max(var13_13, var12_12);
                                    }
                                    var12_12 = var13_13;
                                    if (!var3_3) break block124;
                                    var12_12 = var13_13 = Math.min(var15_15, var13_13);
                                    if (!var17_17) break block124;
                                    var12_12 = var13_13;
                                    if (var20_20) break block124;
                                    if (var41_41 == var43_43) break block125;
                                    var12_12 = var13_13;
                                    if (var42_42 != var43_43) break block124;
                                }
                                var12_12 = 4;
                            }
                            var1_1.e(var39_28, var40_30, var10_10.f(), var12_12);
                            var1_1.e((i)var38_40 /* !! */ , (i)var8_8, -var11_11.f(), var12_12);
                        }
                        if (var3_3) {
                            var12_12 = var6_6 /* !! */  == var40_30 ? var10_10.f() : 0;
                            if (var40_30 != var6_6 /* !! */ ) {
                                var1_1.h(var39_28, (i)var6_6 /* !! */ , var12_12, 5);
                            }
                        }
                        if (var3_3 && var28_35 != 0 && var14_14 == 0 && var25_25 == 0) {
                            if (var28_35 != 0 && var30_37 == 3) {
                                var1_1.h((i)var38_40 /* !! */ , var39_28, 0, 8);
                            } else {
                                var1_1.h((i)var38_40 /* !! */ , var39_28, 0, 5);
                            }
                        }
lbl362:
                        // 5 sources

                        while (true) {
                            var6_6 /* !! */  = var37_29;
                            var6_6 /* !! */  = var36_31;
                            var12_12 = 5;
                            break block105;
                            break;
                        }
                    }
                    var6_6 /* !! */  = var36_31;
                    ** while (true)
                }
                if (var3_3 && var5_5) {
                    var13_13 = var11_11.f != null ? var11_11.f() : 0;
                    if (var36_31 != var7_7) {
                        if (this.j && var37_29.h0 && (var6_6 /* !! */  = this.a0) != null) {
                            var1_1 = (f)var6_6 /* !! */ ;
                            if (var2_2) {
                                var1_1.y1((d)var11_11);
                                return;
                            }
                            var1_1.D1((d)var11_11);
                            return;
                        }
                        var1_1.h(var7_7, var37_29, var13_13, var12_12);
                        return;
                    }
                }
                break block120;
            }
            if (var31_36 < 2 && var3_3 && var5_5) {
                var1_1.h(var39_28, (i)var6_6 /* !! */ , 0, 8);
                var12_12 = !var2_2 && this.S.f != null ? 0 : 1;
                var13_13 = var12_12;
                if (!var2_2) {
                    var6_6 /* !! */  = this.S.f;
                    var13_13 = var12_12;
                    if (var6_6 /* !! */  != null) {
                        var6_6 /* !! */  = var6_6 /* !! */ .d;
                        var13_13 = var6_6 /* !! */ .d0 != 0.0f && (var11_11 = (var6_6 /* !! */  = var6_6 /* !! */ .Z)[0]) == (var10_10 = ax.H.e$b.d0) && var6_6 /* !! */ [1] == var10_10 ? 1 : 0;
                    }
                }
                if (var13_13 != 0) {
                    var1_1.h(var7_7, (i)var8_8, 0, 8);
                }
            }
        }
    }

    private void x0(StringBuilder stringBuilder, String string, float f8, float f9) {
        if (f8 == f9) {
            return;
        }
        stringBuilder.append(string);
        stringBuilder.append(" :   ");
        stringBuilder.append(f8);
        stringBuilder.append(",\n");
    }

    private void y0(StringBuilder stringBuilder, String string, int n8, int n9) {
        if (n8 == n9) {
            return;
        }
        stringBuilder.append(string);
        stringBuilder.append(" :   ");
        stringBuilder.append(n8);
        stringBuilder.append(",\n");
    }

    private void z0(StringBuilder stringBuilder, String string, float f8, int n8) {
        if (f8 == 0.0f) {
            return;
        }
        stringBuilder.append(string);
        stringBuilder.append(" :  [");
        stringBuilder.append(f8);
        stringBuilder.append(",");
        stringBuilder.append(n8);
        stringBuilder.append("");
        stringBuilder.append("],\n");
    }

    public b A() {
        return this.Z[0];
    }

    public void A0(int n8) {
        this.l0 = n8;
        boolean bl = n8 > 0;
        this.J = bl;
    }

    public int B() {
        d d8 = this.O;
        int n8 = d8 != null ? d8.g : 0;
        d8 = this.Q;
        int n9 = n8;
        if (d8 != null) {
            n9 = n8 + d8.g;
        }
        return n9;
    }

    public void B0(Object object) {
        this.q0 = object;
    }

    public int C() {
        return this.M;
    }

    public void C0(String string) {
        this.u0 = string;
    }

    public int D() {
        return this.N;
    }

    /*
     * Unable to fully structure code
     */
    public void D0(String var1_1) {
        block8: {
            block7: {
                block10: {
                    block9: {
                        if (var1_1 == null || var1_1.length() == 0) break block8;
                        var9_3 = var1_1.length();
                        var10_4 = var1_1.indexOf(44);
                        var7_5 = 0;
                        var8_6 = 0;
                        var6_7 = -1;
                        var5_8 = var7_5;
                        var4_9 = var6_7;
                        if (var10_4 > 0) {
                            var5_8 = var7_5;
                            var4_9 = var6_7;
                            if (var10_4 < var9_3 - 1) {
                                var11_10 = var1_1.substring(0, var10_4);
                                var4_9 = var11_10.equalsIgnoreCase("W") != false ? var8_6 : (var11_10.equalsIgnoreCase("H") != false ? 1 : -1);
                                var5_8 = var10_4 + 1;
                            }
                        }
                        if ((var6_7 = var1_1.indexOf(58)) < 0 || var6_7 >= var9_3 - 1) break block9;
                        var11_10 = var1_1.substring(var5_8, var6_7);
                        var1_1 = var1_1.substring(var6_7 + 1);
                        if (var11_10.length() <= 0 || var1_1.length() <= 0) break block10;
                        var3_11 = Float.parseFloat(var11_10);
                        var2_12 = Float.parseFloat(var1_1);
                        if (!(var3_11 > 0.0f) || !(var2_12 > 0.0f)) break block10;
                        if (var4_9 != 1) ** GOTO lbl28
                        var2_12 = Math.abs(var2_12 / var3_11);
                        break block7;
lbl28:
                        // 1 sources

                        var2_12 = Math.abs(var3_11 / var2_12);
                        break block7;
                    }
                    if ((var1_1 = var1_1.substring(var5_8)).length() <= 0) break block10;
                    try {
                        var2_12 = Float.parseFloat(var1_1);
                        break block7;
                    }
                    catch (NumberFormatException var1_2) {
                        // empty catch block
                    }
                }
                var2_12 = 0.0f;
            }
            if (var2_12 > 0.0f) {
                this.d0 = var2_12;
                this.e0 = var4_9;
            }
            return;
        }
        this.d0 = 0.0f;
    }

    public int E(int n8) {
        if (n8 == 0) {
            return this.W();
        }
        if (n8 == 1) {
            return this.x();
        }
        return 0;
    }

    public void E0(int n8) {
        if (!this.J) {
            return;
        }
        int n9 = n8 - this.l0;
        int n10 = this.c0;
        this.g0 = n9;
        this.P.t(n9);
        this.R.t(n10 + n9);
        this.S.t(n8);
        this.q = true;
    }

    public int F() {
        return this.H[1];
    }

    public void F0(int n8, int n9) {
        if (this.p) {
            return;
        }
        this.O.t(n8);
        this.Q.t(n9);
        this.f0 = n8;
        this.b0 = n9 - n8;
        this.p = true;
    }

    public int G() {
        return this.H[0];
    }

    public void G0(int n8) {
        this.O.t(n8);
        this.f0 = n8;
    }

    public int H() {
        return this.n0;
    }

    public void H0(int n8) {
        this.P.t(n8);
        this.g0 = n8;
    }

    public int I() {
        return this.m0;
    }

    public void I0(int n8, int n9) {
        if (this.q) {
            return;
        }
        this.P.t(n8);
        this.R.t(n9);
        this.g0 = n8;
        this.c0 = n9 - n8;
        if (this.J) {
            this.S.t(n8 + this.l0);
        }
        this.q = true;
    }

    public e J(int n8) {
        if (n8 == 0) {
            d d8 = this.Q;
            d d9 = d8.f;
            if (d9 != null && d9.f == d8) {
                return d9.d;
            }
        } else if (n8 == 1) {
            d d10 = this.R;
            d d11 = d10.f;
            if (d11 != null && d11.f == d10) {
                return d11.d;
            }
        }
        return null;
    }

    public void J0(int n8, int n9, int n10, int n11) {
        int n12 = n10 - n8;
        n10 = n11 - n9;
        this.f0 = n8;
        this.g0 = n9;
        if (this.s0 == 8) {
            this.b0 = 0;
            this.c0 = 0;
            return;
        }
        b[] bArray = this.Z;
        b b8 = bArray[0];
        b b9 = ax.H.e$b.q;
        n8 = n12;
        if (b8 == b9) {
            n9 = this.b0;
            n8 = n12;
            if (n12 < n9) {
                n8 = n9;
            }
        }
        n9 = n10;
        if (bArray[1] == b9) {
            n11 = this.c0;
            n9 = n10;
            if (n10 < n11) {
                n9 = n11;
            }
        }
        this.b0 = n8;
        this.c0 = n9;
        n10 = this.n0;
        if (n9 < n10) {
            this.c0 = n10;
        }
        if (n8 < (n10 = this.m0)) {
            this.b0 = n10;
        }
        if ((n10 = this.A) > 0 && b8 == ax.H.e$b.d0) {
            this.b0 = Math.min(this.b0, n10);
        }
        if ((n10 = this.D) > 0 && this.Z[1] == ax.H.e$b.d0) {
            this.c0 = Math.min(this.c0, n10);
        }
        if (n8 != (n10 = this.b0)) {
            this.l = n10;
        }
        if (n9 != (n8 = this.c0)) {
            this.m = n8;
        }
    }

    public e K() {
        return this.a0;
    }

    public void K0(boolean bl) {
        this.J = bl;
    }

    public e L(int n8) {
        if (n8 == 0) {
            d d8 = this.O;
            d d9 = d8.f;
            if (d9 != null && d9.f == d8) {
                return d9.d;
            }
        } else if (n8 == 1) {
            d d10 = this.P;
            d d11 = d10.f;
            if (d11 != null && d11.f == d10) {
                return d11.d;
            }
        }
        return null;
    }

    public void L0(int n8) {
        this.c0 = n8;
        int n9 = this.n0;
        if (n8 < n9) {
            this.c0 = n9;
        }
    }

    public int M() {
        return this.X() + this.b0;
    }

    public void M0(float f8) {
        this.o0 = f8;
    }

    public p N(int n8) {
        if (n8 == 0) {
            return this.e;
        }
        if (n8 == 1) {
            return this.f;
        }
        return null;
    }

    public void N0(int n8) {
        this.z0 = n8;
    }

    public void O(StringBuilder stringBuilder) {
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("  ");
        stringBuilder2.append(this.o);
        stringBuilder2.append(":{\n");
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("    actualWidth:");
        stringBuilder2.append(this.b0);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append("\n");
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("    actualHeight:");
        stringBuilder2.append(this.c0);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append("\n");
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("    actualLeft:");
        stringBuilder2.append(this.f0);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append("\n");
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("    actualTop:");
        stringBuilder2.append(this.g0);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append("\n");
        this.Q(stringBuilder, "left", this.O);
        this.Q(stringBuilder, "top", this.P);
        this.Q(stringBuilder, "right", this.Q);
        this.Q(stringBuilder, "bottom", this.R);
        this.Q(stringBuilder, "baseline", this.S);
        this.Q(stringBuilder, "centerX", this.T);
        this.Q(stringBuilder, "centerY", this.U);
        this.P(stringBuilder, "    width", this.b0, this.m0, this.H[0], this.l, this.z, this.w, this.B, this.D0[0]);
        this.P(stringBuilder, "    height", this.c0, this.n0, this.H[1], this.m, this.C, this.x, this.E, this.D0[1]);
        this.z0(stringBuilder, "    dimensionRatio", this.d0, this.e0);
        this.x0(stringBuilder, "    horizontalBias", this.o0, K0);
        this.x0(stringBuilder, "    verticalBias", this.p0, K0);
        this.y0(stringBuilder, "    horizontalChainStyle", this.z0, 0);
        this.y0(stringBuilder, "    verticalChainStyle", this.A0, 0);
        stringBuilder.append("  }");
    }

    public void O0(int n8, int n9) {
        this.f0 = n8;
        this.b0 = n9 -= n8;
        n8 = this.m0;
        if (n9 < n8) {
            this.b0 = n8;
        }
    }

    public void P0(b b8) {
        this.Z[0] = b8;
    }

    public void Q0(int n8, int n9, int n10, float f8) {
        this.w = n8;
        this.z = n9;
        n9 = n10;
        if (n10 == Integer.MAX_VALUE) {
            n9 = 0;
        }
        this.A = n9;
        this.B = f8;
        if (f8 > 0.0f && f8 < 1.0f && n8 == 0) {
            this.w = 2;
        }
    }

    public float R() {
        return this.p0;
    }

    public void R0(float f8) {
        this.D0[0] = f8;
    }

    public int S() {
        return this.A0;
    }

    protected void S0(int n8, boolean bl) {
        this.Y[n8] = bl;
    }

    public b T() {
        return this.Z[1];
    }

    public void T0(boolean bl) {
        this.K = bl;
    }

    public int U() {
        int n8 = this.O != null ? this.P.g : 0;
        int n9 = n8;
        if (this.Q != null) {
            n9 = n8 + this.R.g;
        }
        return n9;
    }

    public void U0(boolean bl) {
        this.L = bl;
    }

    public int V() {
        return this.s0;
    }

    public void V0(int n8, int n9) {
        this.M = n8;
        this.N = n9;
        this.Y0(false);
    }

    public int W() {
        if (this.s0 == 8) {
            return 0;
        }
        return this.b0;
    }

    public void W0(int n8) {
        this.H[1] = n8;
    }

    public int X() {
        e e8 = this.a0;
        if (e8 != null && e8 instanceof f) {
            return ((f)e8).S0 + this.f0;
        }
        return this.f0;
    }

    public void X0(int n8) {
        this.H[0] = n8;
    }

    public int Y() {
        e e8 = this.a0;
        if (e8 != null && e8 instanceof f) {
            return ((f)e8).T0 + this.g0;
        }
        return this.g0;
    }

    public void Y0(boolean bl) {
        this.i = bl;
    }

    public boolean Z() {
        return this.J;
    }

    public void Z0(int n8) {
        if (n8 < 0) {
            this.n0 = 0;
            return;
        }
        this.n0 = n8;
    }

    public boolean a0(int n8) {
        int n9;
        int n10;
        if (n8 == 0) {
            int n11;
            n8 = this.O.f != null ? 1 : 0;
            return n8 + (n11 = this.Q.f != null ? 1 : 0) < 2;
        }
        n8 = this.P.f != null ? 1 : 0;
        return n8 + (n10 = this.R.f != null ? 1 : 0) + (n9 = this.S.f != null ? 1 : 0) < 2;
    }

    public void a1(int n8) {
        if (n8 < 0) {
            this.m0 = 0;
            return;
        }
        this.m0 = n8;
    }

    public boolean b0() {
        int n8 = this.X.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!this.X.get(i8).m()) continue;
            return true;
        }
        return false;
    }

    public void b1(int n8, int n9) {
        this.f0 = n8;
        this.g0 = n9;
    }

    public boolean c0() {
        return this.l != -1 || this.m != -1;
        {
        }
    }

    public void c1(e e8) {
        this.a0 = e8;
    }

    public boolean d0(int n8, int n9) {
        if (n8 == 0) {
            d d8 = this.O.f;
            if (d8 != null && d8.n() && (d8 = this.Q.f) != null && d8.n()) {
                return this.Q.f.e() - this.Q.f() - (this.O.f.e() + this.O.f()) >= n9;
            }
        } else {
            d d9 = this.P.f;
            if (d9 != null && d9.n() && (d9 = this.R.f) != null && d9.n() && this.R.f.e() - this.R.f() - (this.P.f.e() + this.P.f()) >= n9) {
                return true;
            }
        }
        return false;
    }

    public void d1(float f8) {
        this.p0 = f8;
    }

    public void e(f f8, ax.E.d d8, HashSet<e> hashSet, int n8, boolean bl) {
        block12: {
            block13: {
                block11: {
                    if (!bl) break block11;
                    if (!hashSet.contains(this)) break block12;
                    ax.H.k.a(f8, d8, this);
                    hashSet.remove(this);
                    this.g(d8, f8.T1(64));
                }
                if (n8 != 0) break block13;
                HashSet<d> hashSet2 = this.O.d();
                if (hashSet2 != null) {
                    hashSet2 = hashSet2.iterator();
                    while (hashSet2.hasNext()) {
                        ((d)hashSet2.next()).d.e(f8, d8, hashSet, n8, true);
                    }
                }
                if ((hashSet2 = this.Q.d()) == null) break block12;
                hashSet2 = hashSet2.iterator();
                while (hashSet2.hasNext()) {
                    ((d)hashSet2.next()).d.e(f8, d8, hashSet, n8, true);
                }
                break block12;
            }
            HashSet<d> hashSet3 = this.P.d();
            if (hashSet3 != null) {
                hashSet3 = hashSet3.iterator();
                while (hashSet3.hasNext()) {
                    ((d)hashSet3.next()).d.e(f8, d8, hashSet, n8, true);
                }
            }
            if ((hashSet3 = this.R.d()) != null) {
                hashSet3 = hashSet3.iterator();
                while (hashSet3.hasNext()) {
                    ((d)hashSet3.next()).d.e(f8, d8, hashSet, n8, true);
                }
            }
            if ((hashSet3 = this.S.d()) != null) {
                Iterator<d> iterator = hashSet3.iterator();
                while (iterator.hasNext()) {
                    hashSet3 = iterator.next().d;
                    ((e)((Object)hashSet3)).e(f8, d8, hashSet, n8, true);
                }
            }
        }
    }

    public void e0(d.b b8, e e8, d.b b9, int n8, int n9) {
        this.o(b8).b(e8.o(b9), n8, n9, true);
    }

    public void e1(int n8) {
        this.A0 = n8;
    }

    boolean f() {
        return this instanceof l || this instanceof h;
        {
        }
    }

    public void f1(int n8, int n9) {
        this.g0 = n8;
        this.c0 = n8 = n9 - n8;
        n9 = this.n0;
        if (n8 < n9) {
            this.c0 = n9;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void g(ax.E.d var1_1, boolean var2_2) {
        block63: {
            block65: {
                block64: {
                    block56: {
                        block59: {
                            block62: {
                                block61: {
                                    block60: {
                                        block58: {
                                            block57: {
                                                var32_3 = var1_1.q(this.O);
                                                var26_4 = var1_1.q(this.Q);
                                                var31_5 = var1_1.q(this.P);
                                                var33_6 = var1_1.q(this.R);
                                                var34_7 = var1_1.q(this.S);
                                                var27_8 /* !! */  = this.a0;
                                                if (var27_8 /* !! */  == null) ** GOTO lbl-1000
                                                var15_9 = var27_8 /* !! */  != null && var27_8 /* !! */ .Z[0] == ax.H.e$b.c0;
                                                var13_10 = var27_8 /* !! */  != null && var27_8 /* !! */ .Z[1] == ax.H.e$b.c0;
                                                var4_11 = this.v;
                                                if (var4_11 == 1) break block57;
                                                var14_12 = var13_10;
                                                if (var4_11 != 2) {
                                                    ** if (var4_11 == 3) goto lbl-1000
lbl-1000:
                                                    // 1 sources

                                                    {
                                                        var14_12 = var13_10;
                                                        var16_13 = var15_9;
                                                        ** GOTO lbl25
                                                    }
                                                }
                                                ** GOTO lbl20
lbl-1000:
                                                // 2 sources

                                                {
                                                    var14_12 = false;
lbl20:
                                                    // 2 sources

                                                    var16_13 = false;
                                                }
                                                break block58;
                                            }
                                            var14_12 = false;
                                            var16_13 = var15_9;
                                        }
                                        if (this.s0 == 8 && !this.t0 && !this.b0() && (var27_8 /* !! */  = (Object)this.Y)[0] == false && var27_8 /* !! */ [1] == false) {
                                            return;
                                        }
                                        var13_10 = this.p;
                                        if (var13_10 || this.q) {
                                            if (var13_10) {
                                                var1_1.f(var32_3, this.f0);
                                                var1_1.f((i)var26_4, this.f0 + this.b0);
                                                if (var16_13 && (var27_8 /* !! */  = this.a0) != null) {
                                                    if (this.k) {
                                                        var27_8 /* !! */  = (f)var27_8 /* !! */ ;
                                                        var27_8 /* !! */ .z1(this.O);
                                                        var27_8 /* !! */ .y1(this.Q);
                                                    } else {
                                                        var1_1.h(var1_1.q(var27_8 /* !! */ .Q), (i)var26_4, 0, 5);
                                                    }
                                                }
                                            }
                                            if (this.q) {
                                                var1_1.f(var31_5, this.g0);
                                                var1_1.f(var33_6, this.g0 + this.c0);
                                                if (this.S.m()) {
                                                    var1_1.f((i)var34_7, this.g0 + this.l0);
                                                }
                                                if (var14_12 && (var27_8 /* !! */  = this.a0) != null) {
                                                    if (this.k) {
                                                        var27_8 /* !! */  = (f)var27_8 /* !! */ ;
                                                        var27_8 /* !! */ .E1(this.P);
                                                        var27_8 /* !! */ .D1(this.R);
                                                    } else {
                                                        var1_1.h(var1_1.q(var27_8 /* !! */ .R), var33_6, 0, 5);
                                                    }
                                                }
                                            }
                                            if (this.p && this.q) {
                                                this.p = false;
                                                this.q = false;
                                                return;
                                            }
                                        }
                                        var13_10 = ax.E.d.r;
                                        if (var2_2 && (var29_14 /* !! */  = this.e) != null && (var27_8 /* !! */  = this.f) != null) {
                                            var28_15 /* !! */  = var29_14 /* !! */ .h;
                                            if (var28_15 /* !! */ .j && var29_14 /* !! */ .i.j && var27_8 /* !! */ .h.j && var27_8 /* !! */ .i.j) {
                                                var1_1.f(var32_3, var28_15 /* !! */ .g);
                                                var1_1.f((i)var26_4, this.e.i.g);
                                                var1_1.f(var31_5, this.f.h.g);
                                                var1_1.f(var33_6, this.f.i.g);
                                                var1_1.f((i)var34_7, this.f.k.g);
                                                if (this.a0 != null) {
                                                    if (var16_13 && this.g[0] && !this.i0()) {
                                                        var1_1.h(var1_1.q(this.a0.Q), (i)var26_4, 0, 8);
                                                    }
                                                    if (var14_12 && this.g[1] && !this.k0()) {
                                                        var1_1.h(var1_1.q(this.a0.R), var33_6, 0, 8);
                                                    }
                                                }
                                                this.p = false;
                                                this.q = false;
                                                return;
                                            }
                                        }
                                        if (this.a0 != null) {
                                            if (this.f0(0)) {
                                                ((f)this.a0).v1(this, 0);
                                                var13_10 = true;
                                            } else {
                                                var13_10 = this.i0();
                                            }
                                            if (this.f0(1)) {
                                                ((f)this.a0).v1(this, 1);
                                                var15_9 = true;
                                            } else {
                                                var15_9 = this.k0();
                                            }
                                            if (!var13_10 && var16_13 && this.s0 != 8 && this.O.f == null && this.Q.f == null) {
                                                var1_1.h(var1_1.q(this.a0.Q), (i)var26_4, 0, 1);
                                            }
                                            if (!var15_9 && var14_12 && this.s0 != 8 && this.P.f == null && this.R.f == null && this.S == null) {
                                                var1_1.h(var1_1.q(this.a0.R), var33_6, 0, 1);
                                            }
                                            var17_16 = var13_10;
                                        } else {
                                            var17_16 = false;
                                            var15_9 = false;
                                        }
                                        var9_17 = this.b0;
                                        var4_11 = this.m0;
                                        if (var9_17 >= var4_11) {
                                            var4_11 = var9_17;
                                        }
                                        var10_18 = this.c0;
                                        var6_19 = this.n0;
                                        if (var10_18 >= var6_19) {
                                            var6_19 = var10_18;
                                        }
                                        var28_15 /* !! */  = this.Z;
                                        var27_8 /* !! */  = var28_15 /* !! */ [0];
                                        var35_20 = ax.H.e$b.d0;
                                        var13_10 = var27_8 /* !! */  != var35_20;
                                        var28_15 /* !! */  = var28_15 /* !! */ [1];
                                        var18_21 = var28_15 /* !! */  != var35_20;
                                        this.F = var11_22 = this.e0;
                                        this.G = var3_23 = this.d0;
                                        var8_24 = this.w;
                                        var7_25 = this.x;
                                        if (!(var3_23 > 0.0f)) break block59;
                                        var12_26 = this.s0;
                                        var5_27 = var6_19;
                                        if (var12_26 == 8) break block59;
                                        var6_19 = var27_8 /* !! */  == var35_20 && var8_24 == 0 ? 3 : var8_24;
                                        if (var28_15 /* !! */  == var35_20 && var7_25 == 0) {
                                            var7_25 = 3;
                                        }
                                        if (var27_8 /* !! */  != var35_20 || var28_15 /* !! */  != var35_20 || var6_19 != 3 || var7_25 != 3) break block60;
                                        this.o1(var16_13, var14_12, var13_10, var18_21);
                                        var8_24 = var5_27;
                                        break block61;
                                    }
                                    if (var27_8 /* !! */  != var35_20 || var6_19 != 3) break block62;
                                    this.F = 0;
                                    var10_18 = (int)((float)var10_18 * var3_23);
                                    var9_17 = var7_25;
                                    var4_11 = var10_18;
                                    var8_24 = var5_27;
                                    if (var28_15 /* !! */  == var35_20) break block61;
                                    var13_10 = false;
                                    var6_19 = 4;
                                    var4_11 = var10_18;
                                    var7_25 = var9_17;
                                    break block56;
                                }
lbl135:
                                // 4 sources

                                while (true) {
                                    var13_10 = true;
                                    var5_27 = var8_24;
                                    break block56;
                                    break;
                                }
                            }
                            var8_24 = var5_27;
                            if (var28_15 /* !! */  != var35_20) ** GOTO lbl135
                            var8_24 = var5_27;
                            if (var7_25 != 3) ** GOTO lbl135
                            this.F = 1;
                            if (var11_22 == -1) {
                                this.G = 1.0f / var3_23;
                            }
                            var8_24 = var5_27 = (int)(this.G * (float)var9_17);
                            if (var27_8 /* !! */  != var35_20) ** break;
                            ** while (true)
                            var13_10 = false;
                            var7_25 = 4;
                            break block56;
                        }
                        var5_27 = var6_19;
                        var6_19 = var8_24;
                        var13_10 = false;
                    }
                    var27_8 /* !! */  = var26_4;
                    var28_15 /* !! */  = (b[])this.y;
                    var28_15 /* !! */ [0] = (b)var6_19;
                    var28_15 /* !! */ [1] = (b)var7_25;
                    this.h = var13_10;
                    var19_28 = var13_10 && ((var8_24 = this.F) == 0 || var8_24 == -1);
                    var18_21 = var13_10 != false && ((var8_24 = this.F) == 1 || var8_24 == -1);
                    var28_15 /* !! */  = this.Z[0];
                    var36_29 = ax.H.e$b.c0;
                    var20_30 = var28_15 /* !! */  == var36_29 && this instanceof f != false;
                    if (var20_30) {
                        var4_11 = 0;
                    }
                    var22_31 = this.V.o() ^ true;
                    var28_15 /* !! */  = (b[])this.Y;
                    var24_32 = var28_15 /* !! */ [0];
                    var23_33 = var28_15 /* !! */ [1];
                    var8_24 = this.t;
                    var30_34 = null;
                    if (var8_24 == 2 || this.p) ** GOTO lbl185
                    if (!var2_2 || (var28_15 /* !! */  = this.e) == null) ** GOTO lbl-1000
                    var29_14 /* !! */  = var28_15 /* !! */ .h;
                    if (var29_14 /* !! */ .j && var28_15 /* !! */ .i.j) {
                        if (var2_2) {
                            var1_1.f(var32_3, var29_14 /* !! */ .g);
                            var1_1.f((i)var27_8 /* !! */ , this.e.i.g);
                            if (this.a0 != null && var16_13 && this.g[0] && !this.i0()) {
                                var1_1.h(var1_1.q(this.a0.Q), (i)var27_8 /* !! */ , 0, 8);
                            }
                        }
lbl185:
                        // 6 sources

                        var27_8 /* !! */  = var26_4;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var28_15 /* !! */  = (var28_15 /* !! */  = this.a0) != null ? var1_1.q(var28_15 /* !! */ .Q) : null;
                        var29_14 /* !! */  = this.a0;
                        var29_14 /* !! */  = var29_14 /* !! */  != null ? var1_1.q(var29_14 /* !! */ .O) : null;
                        var25_35 = this.g[0];
                        var37_36 = this.Z;
                        var39_37 = var37_36[0];
                        var27_8 /* !! */  = this.O;
                        var38_38 = this.Q;
                        var9_17 = this.f0;
                        var10_18 = this.m0;
                        var8_24 = this.H[0];
                        var3_23 = this.o0;
                        var21_39 = var37_36[1] == var35_20;
                        this.i(var1_1, true, var16_13, var14_12, var25_35, (i)var29_14 /* !! */ , (i)var28_15 /* !! */ , var39_37, var20_30, (d)var27_8 /* !! */ , var38_38, var9_17, var4_11, var10_18, var8_24, var3_23, var19_28, var21_39, var17_16, var15_9, (boolean)var24_32, var6_19, var7_25, this.z, this.A, this.B, var22_31);
                    }
                    var28_15 /* !! */  = var26_4;
                    if (!var2_2 || (var27_8 /* !! */  = this.f) == null) ** GOTO lbl-1000
                    var26_4 = var27_8 /* !! */ .h;
                    if (var26_4.j && var27_8 /* !! */ .i.j) {
                        var1_1.f(var31_5, var26_4.g);
                        var4_11 = this.f.i.g;
                        var1_1.f(var33_6, var4_11);
                        var1_1.f((i)var34_7, this.f.k.g);
                        var26_4 = this.a0;
                        if (var26_4 != null && !var15_9 && var14_12 && this.g[1]) {
                            var1_1.h(var1_1.q(var26_4.R), var33_6, 0, 8);
                        }
                        var4_11 = 0;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var4_11 = 1;
                    }
                    if (this.u == 2) {
                        var4_11 = 0;
                    }
                    if (var4_11 == 0 || this.q) break block63;
                    var2_2 = this.Z[1] == var36_29 && this instanceof f != false;
                    var4_11 = var2_2 != false ? 0 : var5_27;
                    var26_4 = this.a0;
                    var26_4 = var26_4 != null ? var1_1.q(var26_4.R) : null;
                    var29_14 /* !! */  = this.a0;
                    var27_8 /* !! */  = var30_34;
                    if (var29_14 /* !! */  != null) {
                        var27_8 /* !! */  = var1_1.q(var29_14 /* !! */ .P);
                    }
                    if (this.l0 > 0) break block64;
                    var19_28 = var22_31;
                    if (this.s0 != 8) break block65;
                }
                var29_14 /* !! */  = this.S;
                if (var29_14 /* !! */ .f != null) {
                    var1_1.e((i)var34_7, var31_5, this.p(), 8);
                    var1_1.e((i)var34_7, var1_1.q(this.S.f), this.S.f(), 8);
                    if (var14_12) {
                        var1_1.h((i)var26_4, var1_1.q(this.R), 0, 5);
                    }
                    var19_28 = false;
                } else if (this.s0 == 8) {
                    var1_1.e((i)var34_7, var31_5, var29_14 /* !! */ .f(), 8);
                    var19_28 = var22_31;
                } else {
                    var1_1.e((i)var34_7, var31_5, this.p(), 8);
                    var19_28 = var22_31;
                }
            }
            var21_39 = this.g[1];
            var36_29 = this.Z;
            var29_14 /* !! */  = var36_29[1];
            var34_7 = this.P;
            var30_34 = this.R;
            var5_27 = this.g0;
            var8_24 = this.n0;
            var9_17 = this.H[1];
            var3_23 = this.p0;
            var20_30 = var36_29[0] == var35_20;
            this.i(var1_1, false, var14_12, var16_13, var21_39, (i)var27_8 /* !! */ , (i)var26_4, (b)var29_14 /* !! */ , var2_2, (d)var34_7, var30_34, var5_27, var4_11, var8_24, var9_17, var3_23, var18_21, var20_30, var15_9, var17_16, (boolean)var23_33, var7_25, var6_19, this.C, this.D, this.E, var19_28);
        }
        if (var13_10) {
            if (this.F == 1) {
                var1_1.k(var33_6, var31_5, (i)var28_15 /* !! */ , var32_3, this.G, 8);
            } else {
                var1_1.k((i)var28_15 /* !! */ , var32_3, var33_6, var31_5, this.G, 8);
            }
        }
        if (this.V.o()) {
            var1_1.b(this, this.V.j().h(), (float)Math.toRadians(this.I + 90.0f), this.V.f());
        }
        this.p = false;
        this.q = false;
    }

    public boolean g0() {
        return this.r;
    }

    public void g1(b b8) {
        this.Z[1] = b8;
    }

    public boolean h() {
        return this.s0 != 8;
    }

    public boolean h0(int n8) {
        return this.Y[n8];
    }

    public void h1(int n8, int n9, int n10, float f8) {
        this.x = n8;
        this.C = n9;
        n9 = n10;
        if (n10 == Integer.MAX_VALUE) {
            n9 = 0;
        }
        this.D = n9;
        this.E = f8;
        if (f8 > 0.0f && f8 < 1.0f && n8 == 0) {
            this.x = 2;
        }
    }

    public boolean i0() {
        block3: {
            block2: {
                d d8 = this.O;
                d d9 = d8.f;
                if (d9 != null && d9.f == d8) break block2;
                d9 = this.Q;
                d8 = d9.f;
                if (d8 == null || d8.f != d9) break block3;
            }
            return true;
        }
        return false;
    }

    public void i1(float f8) {
        this.D0[1] = f8;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void j(d.b object, e object2, d.b object3, int n8) {
        Object object4;
        d d8;
        int n9;
        d.b var3_19;
        d.b b8 = d.b.h0;
        if (object == b8) {
            if (var3_19 == b8) {
                d.b b9 = d.b.c0;
                d d9 = this.o(b9);
                d.b b10 = d.b.e0;
                d d10 = this.o(b10);
                d.b b11 = d.b.d0;
                d d11 = this.o(b11);
                d.b b12 = d.b.f0;
                d d12 = this.o(b12);
                boolean bl = true;
                if (d9 != null && d9.o() || d10 != null && d10.o()) {
                    n9 = 0;
                } else {
                    this.j(b9, (e)((Object)d8), b9, 0);
                    this.j(b10, (e)((Object)d8), b10, 0);
                    n9 = 1;
                }
                if (d11 != null && d11.o() || d12 != null && d12.o()) {
                    bl = false;
                } else {
                    this.j(b11, (e)((Object)d8), b11, 0);
                    this.j(b12, (e)((Object)d8), b12, 0);
                }
                if (n9 != 0 && bl) {
                    this.o(b8).a(((e)((Object)d8)).o(b8), 0);
                    return;
                }
                if (n9 != 0) {
                    d.b b13 = d.b.i0;
                    this.o(b13).a(((e)((Object)d8)).o(b13), 0);
                    return;
                }
                if (!bl) return;
                d.b b14 = d.b.j0;
                this.o(b14).a(((e)((Object)d8)).o(b14), 0);
                return;
            }
            d.b b15 = d.b.c0;
            if (var3_19 != b15 && var3_19 != d.b.e0) {
                d.b b16 = d.b.d0;
                if (var3_19 != b16 && var3_19 != d.b.f0) return;
                this.j(b16, (e)((Object)d8), (d.b)var3_19, 0);
                this.j(d.b.f0, (e)((Object)d8), (d.b)var3_19, 0);
                this.o(b8).a(((e)((Object)d8)).o((d.b)var3_19), 0);
                return;
            }
            this.j(b15, (e)((Object)d8), (d.b)var3_19, 0);
            d.b b17 = d.b.e0;
            this.j(b17, (e)((Object)d8), (d.b)var3_19, 0);
            this.o(b8).a(((e)((Object)d8)).o((d.b)var3_19), 0);
            return;
        }
        d.b b18 = d.b.i0;
        if (object == b18 && (var3_19 == (object4 = d.b.c0) || var3_19 == d.b.e0)) {
            d d13 = this.o((d.b)((Object)object4));
            d d14 = ((e)((Object)d8)).o((d.b)var3_19);
            d8 = this.o(d.b.e0);
            d13.a(d14, 0);
            d8.a(d14, 0);
            this.o(b18).a(d14, 0);
            return;
        }
        d.b b19 = d.b.j0;
        if (object == b19 && (var3_19 == (object4 = d.b.d0) || var3_19 == d.b.f0)) {
            d d15 = ((e)((Object)d8)).o((d.b)var3_19);
            this.o((d.b)((Object)object4)).a(d15, 0);
            this.o(d.b.f0).a(d15, 0);
            this.o(b19).a(d15, 0);
            return;
        }
        if (object == b18 && var3_19 == b18) {
            d.b b20 = d.b.c0;
            this.o(b20).a(((e)((Object)d8)).o(b20), 0);
            d.b b21 = d.b.e0;
            this.o(b21).a(((e)((Object)d8)).o(b21), 0);
            this.o(b18).a(((e)((Object)d8)).o((d.b)var3_19), 0);
            return;
        }
        if (object == b19 && var3_19 == b19) {
            d.b b22 = d.b.d0;
            this.o(b22).a(((e)((Object)d8)).o(b22), 0);
            d.b b23 = d.b.f0;
            this.o(b23).a(((e)((Object)d8)).o(b23), 0);
            this.o(b19).a(((e)((Object)d8)).o((d.b)var3_19), 0);
            return;
        }
        object4 = this.o((d.b)((Object)object));
        if (!((d)object4).p(d8 = ((e)((Object)d8)).o((d.b)var3_19))) return;
        d.b b24 = d.b.g0;
        if (object == b24) {
            d d16 = this.o(d.b.d0);
            d d17 = this.o(d.b.f0);
            if (d16 != null) {
                d16.q();
            }
            if (d17 != null) {
                d17.q();
            }
        } else if (object != d.b.d0 && object != d.b.f0) {
            if (object == d.b.c0 || object == d.b.e0) {
                d d18 = this.o(b8);
                if (d18.j() != d8) {
                    d18.q();
                }
                d d19 = this.o((d.b)((Object)object)).g();
                d d20 = this.o(b18);
                if (d20.o()) {
                    d19.q();
                    d20.q();
                }
            }
        } else {
            d d21;
            d d22 = this.o(b24);
            if (d22 != null) {
                d22.q();
            }
            if ((d21 = this.o(b8)).j() != d8) {
                d21.q();
            }
            d d23 = this.o((d.b)((Object)object)).g();
            d d24 = this.o(b19);
            if (d24.o()) {
                d23.q();
                d24.q();
            }
        }
        ((d)object4).a(d8, n9);
    }

    public boolean j0() {
        return this.K;
    }

    public void j1(int n8) {
        this.s0 = n8;
    }

    public void k(d d8, d d9, int n8) {
        if (d8.h() == this) {
            this.j(d8.k(), d9.h(), d9.k(), n8);
        }
    }

    public boolean k0() {
        block3: {
            block2: {
                d d8 = this.P;
                d d9 = d8.f;
                if (d9 != null && d9.f == d8) break block2;
                d8 = this.R;
                d9 = d8.f;
                if (d9 == null || d9.f != d8) break block3;
            }
            return true;
        }
        return false;
    }

    public void k1(int n8) {
        this.b0 = n8;
        int n9 = this.m0;
        if (n8 < n9) {
            this.b0 = n9;
        }
    }

    public void l(e e8, float f8, int n8) {
        d.b b8 = d.b.h0;
        this.e0(b8, e8, b8, n8, 0);
        this.I = f8;
    }

    public boolean l0() {
        return this.L;
    }

    public void l1(int n8) {
        if (n8 >= 0 && n8 <= 3) {
            this.v = n8;
        }
    }

    public void m(ax.E.d d8) {
        d8.q(this.O);
        d8.q(this.P);
        d8.q(this.Q);
        d8.q(this.R);
        if (this.l0 > 0) {
            d8.q(this.S);
        }
    }

    public boolean m0() {
        return this.i && this.s0 != 8;
    }

    public void m1(int n8) {
        this.f0 = n8;
    }

    public void n() {
        if (this.e == null) {
            this.e = new ax.I.l(this);
        }
        if (this.f == null) {
            this.f = new n(this);
        }
    }

    public boolean n0() {
        return this.p || this.O.n() && this.Q.n();
        {
        }
    }

    public void n1(int n8) {
        this.g0 = n8;
    }

    public d o(d.b b8) {
        switch (ax.H.e$a.a[b8.ordinal()]) {
            default: {
                throw new AssertionError((Object)b8.name());
            }
            case 9: {
                return null;
            }
            case 8: {
                return this.U;
            }
            case 7: {
                return this.T;
            }
            case 6: {
                return this.V;
            }
            case 5: {
                return this.S;
            }
            case 4: {
                return this.R;
            }
            case 3: {
                return this.Q;
            }
            case 2: {
                return this.P;
            }
            case 1: 
        }
        return this.O;
    }

    public boolean o0() {
        return this.q || this.P.n() && this.R.n();
        {
        }
    }

    public void o1(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        if (this.F == -1) {
            if (bl3 && !bl4) {
                this.F = 0;
            } else if (!bl3 && bl4) {
                this.F = 1;
                if (this.e0 == -1) {
                    this.G = 1.0f / this.G;
                }
            }
        }
        if (!(this.F != 0 || this.P.o() && this.R.o())) {
            this.F = 1;
        } else if (!(this.F != 1 || this.O.o() && this.Q.o())) {
            this.F = 0;
        }
        if (!(this.F != -1 || this.P.o() && this.R.o() && this.O.o() && this.Q.o())) {
            if (this.P.o() && this.R.o()) {
                this.F = 0;
            } else if (this.O.o() && this.Q.o()) {
                this.G = 1.0f / this.G;
                this.F = 1;
            }
        }
        if (this.F == -1) {
            int n8 = this.z;
            if (n8 > 0 && this.C == 0) {
                this.F = 0;
                return;
            }
            if (n8 == 0 && this.C > 0) {
                this.G = 1.0f / this.G;
                this.F = 1;
            }
        }
    }

    public int p() {
        return this.l0;
    }

    public boolean p0() {
        return this.s;
    }

    public void p1(boolean bl, boolean bl2) {
        int n8;
        int n9;
        int n10;
        int n11;
        boolean bl3;
        boolean bl4;
        block15: {
            block14: {
                bl4 = bl & this.e.k();
                bl3 = bl2 & this.f.k();
                ax.I.l l8 = this.e;
                n11 = l8.h.g;
                n n12 = this.f;
                n10 = n12.h.g;
                n9 = l8.i.g;
                int n13 = n12.i.g;
                if (n9 - n11 < 0 || n13 - n10 < 0 || n11 == Integer.MIN_VALUE || n11 == Integer.MAX_VALUE || n10 == Integer.MIN_VALUE || n10 == Integer.MAX_VALUE || n9 == Integer.MIN_VALUE || n9 == Integer.MAX_VALUE || n13 == Integer.MIN_VALUE) break block14;
                n8 = n13;
                if (n13 != Integer.MAX_VALUE) break block15;
            }
            n9 = 0;
            n11 = 0;
            n8 = 0;
            n10 = 0;
        }
        n9 -= n11;
        n8 -= n10;
        if (bl4) {
            this.f0 = n11;
        }
        if (bl3) {
            this.g0 = n10;
        }
        if (this.s0 == 8) {
            this.b0 = 0;
            this.c0 = 0;
            return;
        }
        if (bl4) {
            n10 = n9;
            if (this.Z[0] == ax.H.e$b.q) {
                n11 = this.b0;
                n10 = n9;
                if (n9 < n11) {
                    n10 = n11;
                }
            }
            this.b0 = n10;
            n11 = this.m0;
            if (n10 < n11) {
                this.b0 = n11;
            }
        }
        if (bl3) {
            n10 = n8;
            if (this.Z[1] == ax.H.e$b.q) {
                n11 = this.c0;
                n10 = n8;
                if (n8 < n11) {
                    n10 = n11;
                }
            }
            this.c0 = n10;
            n8 = this.n0;
            if (n10 < n8) {
                this.c0 = n8;
            }
        }
    }

    public float q(int n8) {
        if (n8 == 0) {
            return this.o0;
        }
        if (n8 == 1) {
            return this.p0;
        }
        return -1.0f;
    }

    public void q0() {
        this.r = true;
    }

    public void q1(ax.E.d object, boolean bl) {
        int n8;
        int n9;
        int n10;
        int n11;
        block12: {
            block11: {
                ax.I.d d8;
                n11 = ((ax.E.d)object).x(this.O);
                n10 = ((ax.E.d)object).x(this.P);
                int n12 = ((ax.E.d)object).x(this.Q);
                int n13 = ((ax.E.d)object).x(this.R);
                n9 = n11;
                n8 = n12;
                if (bl) {
                    d8 = this.e;
                    n9 = n11;
                    n8 = n12;
                    if (d8 != null) {
                        object = d8.h;
                        n9 = n11;
                        n8 = n12;
                        if (((ax.I.f)object).j) {
                            d8 = d8.i;
                            n9 = n11;
                            n8 = n12;
                            if (((ax.I.f)d8).j) {
                                n9 = ((ax.I.f)object).g;
                                n8 = ((ax.I.f)d8).g;
                            }
                        }
                    }
                }
                n11 = n10;
                n12 = n13;
                if (bl) {
                    d8 = this.f;
                    n11 = n10;
                    n12 = n13;
                    if (d8 != null) {
                        object = d8.h;
                        n11 = n10;
                        n12 = n13;
                        if (((ax.I.f)object).j) {
                            d8 = d8.i;
                            n11 = n10;
                            n12 = n13;
                            if (((ax.I.f)d8).j) {
                                n11 = ((ax.I.f)object).g;
                                n12 = ((ax.I.f)d8).g;
                            }
                        }
                    }
                }
                if (n8 - n9 < 0 || n12 - n11 < 0 || n9 == Integer.MIN_VALUE || n9 == Integer.MAX_VALUE || n11 == Integer.MIN_VALUE || n11 == Integer.MAX_VALUE || n8 == Integer.MIN_VALUE || n8 == Integer.MAX_VALUE || n12 == Integer.MIN_VALUE) break block11;
                n10 = n9;
                n9 = n8;
                n8 = n12;
                if (n12 != Integer.MAX_VALUE) break block12;
            }
            n10 = 0;
            n8 = 0;
            n11 = 0;
            n9 = 0;
        }
        this.J0(n10, n11, n9, n8);
    }

    public int r() {
        return this.Y() + this.c0;
    }

    public void r0() {
        this.s = true;
    }

    public Object s() {
        return this.q0;
    }

    public boolean s0() {
        b[] bArray = this.Z;
        b b8 = bArray[0];
        b b9 = ax.H.e$b.d0;
        return b8 == b9 && bArray[1] == b9;
    }

    public String t() {
        return this.u0;
    }

    public void t0() {
        b b8;
        float f8;
        this.O.q();
        this.P.q();
        this.Q.q();
        this.R.q();
        this.S.q();
        this.T.q();
        this.U.q();
        this.V.q();
        this.a0 = null;
        this.I = 0.0f;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0.0f;
        this.e0 = -1;
        this.f0 = 0;
        this.g0 = 0;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        this.o0 = f8 = K0;
        this.p0 = f8;
        Object[] objectArray = this.Z;
        objectArray[0] = b8 = ax.H.e$b.q;
        objectArray[1] = b8;
        this.q0 = null;
        this.r0 = 0;
        this.s0 = 0;
        this.v0 = null;
        this.w0 = false;
        this.x0 = false;
        this.z0 = 0;
        this.A0 = 0;
        this.B0 = false;
        this.C0 = false;
        objectArray = this.D0;
        objectArray[0] = (b)-1.0f;
        objectArray[1] = (b)-1.0f;
        this.t = -1;
        this.u = -1;
        objectArray = this.H;
        objectArray[0] = (b)Integer.MAX_VALUE;
        objectArray[1] = (b)Integer.MAX_VALUE;
        this.w = 0;
        this.x = 0;
        this.B = 1.0f;
        this.E = 1.0f;
        this.A = Integer.MAX_VALUE;
        this.D = Integer.MAX_VALUE;
        this.z = 0;
        this.C = 0;
        this.h = false;
        this.F = -1;
        this.G = 1.0f;
        this.y0 = false;
        objectArray = this.g;
        objectArray[0] = (b)true;
        objectArray[1] = (b)true;
        this.L = false;
        objectArray = this.Y;
        objectArray[0] = (b)false;
        objectArray[1] = (b)false;
        this.i = true;
        objectArray = this.y;
        objectArray[0] = (b)false;
        objectArray[1] = (b)false;
        this.l = -1;
        this.m = -1;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        CharSequence charSequence = this.v0;
        String string = "";
        if (charSequence != null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("type: ");
            ((StringBuilder)charSequence).append(this.v0);
            ((StringBuilder)charSequence).append(" ");
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = "";
        }
        stringBuilder.append((String)charSequence);
        charSequence = string;
        if (this.u0 != null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("id: ");
            ((StringBuilder)charSequence).append(this.u0);
            ((StringBuilder)charSequence).append(" ");
            charSequence = ((StringBuilder)charSequence).toString();
        }
        stringBuilder.append((String)charSequence);
        stringBuilder.append("(");
        stringBuilder.append(this.f0);
        stringBuilder.append(", ");
        stringBuilder.append(this.g0);
        stringBuilder.append(") - (");
        stringBuilder.append(this.b0);
        stringBuilder.append(" x ");
        stringBuilder.append(this.c0);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public b u(int n8) {
        if (n8 == 0) {
            return this.A();
        }
        if (n8 == 1) {
            return this.T();
        }
        return null;
    }

    public void u0() {
        e e8 = this.K();
        if (e8 == null || !(e8 instanceof f) || !((f)this.K()).L1()) {
            int n8 = this.X.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                this.X.get(i8).q();
            }
        }
    }

    public float v() {
        return this.d0;
    }

    public void v0() {
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        int n8 = this.X.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            this.X.get(i8).r();
        }
    }

    public int w() {
        return this.e0;
    }

    public void w0(ax.E.c c8) {
        this.O.s(c8);
        this.P.s(c8);
        this.Q.s(c8);
        this.R.s(c8);
        this.S.s(c8);
        this.V.s(c8);
        this.T.s(c8);
        this.U.s(c8);
    }

    public int x() {
        if (this.s0 == 8) {
            return 0;
        }
        return this.c0;
    }

    public float y() {
        return this.o0;
    }

    public int z() {
        return this.z0;
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b c0;
        public static final /* enum */ b d0;
        public static final /* enum */ b e0;
        private static final b[] f0;
        public static final /* enum */ b q;

        static {
            b b8;
            b b9;
            b b10;
            b b11;
            q = b11 = new b();
            c0 = b10 = new b();
            d0 = b9 = new b();
            e0 = b8 = new b();
            f0 = new b[]{b11, b10, b9, b8};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])f0.clone();
        }
    }
}

