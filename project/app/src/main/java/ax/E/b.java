/*
 * Decompiled with CFR 0.152.
 */
package ax.E;

import ax.E.c;
import ax.E.d;
import ax.E.i;
import java.util.ArrayList;

public class b
implements d.a {
    i a = null;
    float b = 0.0f;
    boolean c = false;
    ArrayList<i> d = new ArrayList();
    public a e;
    boolean f = false;

    public b() {
    }

    public b(c c8) {
        this.e = new ax.E.a(this, c8);
    }

    private boolean u(i i8, d d8) {
        return i8.n0 <= 1;
    }

    private i w(boolean[] blArray, i i8) {
        int n8 = this.e.b();
        i i9 = null;
        float f8 = 0.0f;
        for (int i10 = 0; i10 < n8; ++i10) {
            float f9;
            i i11;
            block5: {
                i i12;
                float f10;
                block7: {
                    block6: {
                        f10 = this.e.g(i10);
                        i11 = i9;
                        f9 = f8;
                        if (!(f10 < 0.0f)) break block5;
                        i12 = this.e.d(i10);
                        if (blArray == null) break block6;
                        i11 = i9;
                        f9 = f8;
                        if (blArray[i12.d0]) break block5;
                    }
                    i11 = i9;
                    f9 = f8;
                    if (i12 == i8) break block5;
                    i.a a8 = i12.k0;
                    if (a8 == i.a.d0) break block7;
                    i11 = i9;
                    f9 = f8;
                    if (a8 != i.a.e0) break block5;
                }
                i11 = i9;
                f9 = f8;
                if (f10 < f8) {
                    f9 = f10;
                    i11 = i12;
                }
            }
            i9 = i11;
            f8 = f9;
        }
        return i9;
    }

    public void A(d d8, i i8, boolean bl) {
        if (i8 != null && i8.h0) {
            float f8 = this.e.c(i8);
            this.b += i8.g0 * f8;
            this.e.j(i8, bl);
            if (bl) {
                i8.l(this);
            }
            if (ax.E.d.t && this.e.b() == 0) {
                this.f = true;
                d8.a = true;
            }
        }
    }

    public void B(d d8, b b8, boolean bl) {
        float f8 = this.e.e(b8, bl);
        this.b += b8.b * f8;
        if (bl) {
            b8.a.l(this);
        }
        if (ax.E.d.t && this.a != null && this.e.b() == 0) {
            this.f = true;
            d8.a = true;
        }
    }

    public void C(d d8, i i8, boolean bl) {
        if (i8 != null && i8.o0) {
            float f8 = this.e.c(i8);
            this.b += i8.q0 * f8;
            this.e.j(i8, bl);
            if (bl) {
                i8.l(this);
            }
            this.e.a(d8.n.d[i8.p0], f8, bl);
            if (ax.E.d.t && this.e.b() == 0) {
                this.f = true;
                d8.a = true;
            }
        }
    }

    public void D(d d8) {
        if (d8.g.length != 0) {
            boolean bl = false;
            while (!bl) {
                i i8;
                int n8;
                int n9 = this.e.b();
                for (n8 = 0; n8 < n9; ++n8) {
                    i8 = this.e.d(n8);
                    if (i8.e0 == -1 && !i8.h0 && !i8.o0) continue;
                    this.d.add(i8);
                }
                n9 = this.d.size();
                if (n9 > 0) {
                    for (n8 = 0; n8 < n9; ++n8) {
                        i8 = this.d.get(n8);
                        if (i8.h0) {
                            this.A(d8, i8, true);
                            continue;
                        }
                        if (i8.o0) {
                            this.C(d8, i8, true);
                            continue;
                        }
                        this.B(d8, d8.g[i8.e0], true);
                    }
                    this.d.clear();
                    continue;
                }
                bl = true;
            }
            if (ax.E.d.t && this.a != null && this.e.b() == 0) {
                this.f = true;
                d8.a = true;
            }
        }
    }

    @Override
    public void a(d.a object) {
        if (object instanceof b) {
            b b8 = (b)object;
            this.a = null;
            this.e.clear();
            for (int i8 = 0; i8 < b8.e.b(); ++i8) {
                object = b8.e.d(i8);
                float f8 = b8.e.g(i8);
                this.e.a((i)object, f8, true);
            }
        }
    }

    @Override
    public void b(i i8) {
        int n8 = i8.f0;
        float f8 = 1.0f;
        if (n8 != 1) {
            if (n8 == 2) {
                f8 = 1000.0f;
            } else if (n8 == 3) {
                f8 = 1000000.0f;
            } else if (n8 == 4) {
                f8 = 1.0E9f;
            } else if (n8 == 5) {
                f8 = 1.0E12f;
            }
        }
        this.e.h(i8, f8);
    }

    @Override
    public i c(d d8, boolean[] blArray) {
        return this.w(blArray, null);
    }

    @Override
    public void clear() {
        this.e.clear();
        this.a = null;
        this.b = 0.0f;
    }

    public b d(d d8, int n8) {
        this.e.h(d8.o(n8, "ep"), 1.0f);
        this.e.h(d8.o(n8, "em"), -1.0f);
        return this;
    }

    b e(i i8, int n8) {
        this.e.h(i8, n8);
        return this;
    }

    boolean f(d object) {
        boolean bl;
        if ((object = this.g((d)object)) == null) {
            bl = true;
        } else {
            this.x((i)object);
            bl = false;
        }
        if (this.e.b() == 0) {
            this.f = true;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    i g(d var1_1) {
        var8_2 = this.e.b();
        var17_3 = null;
        var16_4 = null;
        var12_6 = false;
        var11_7 = false;
        var6_8 = 0.0f;
        var5_9 = 0.0f;
        for (var7_5 = 0; var7_5 < var8_2; ++var7_5) {
            var2_10 = this.e.g(var7_5);
            var13_15 = this.e.d(var7_5);
            if (var13_15.k0 == i.a.q) {
                if (var17_3 == null) {
                    var9_13 = this.u(var13_15, var1_1);
lbl14:
                    // 2 sources

                    while (true) {
                        var14_16 = var13_15;
                        var15_17 = var16_4;
                        var10_14 = var11_7;
                        var3_11 = var2_10;
                        var4_12 = var5_9;
                        break;
                    }
                } else {
                    if (var6_8 > var2_10) {
                        var9_13 = this.u(var13_15, var1_1);
                        ** continue;
                    }
                    var14_16 = var17_3;
                    var15_17 = var16_4;
                    var9_13 = var12_6;
                    var10_14 = var11_7;
                    var3_11 = var6_8;
                    var4_12 = var5_9;
                    if (!var12_6) {
                        var14_16 = var17_3;
                        var15_17 = var16_4;
                        var9_13 = var12_6;
                        var10_14 = var11_7;
                        var3_11 = var6_8;
                        var4_12 = var5_9;
                        if (this.u(var13_15, var1_1)) {
                            var9_13 = true;
                            var14_16 = var13_15;
                            var15_17 = var16_4;
                            var10_14 = var11_7;
                            var3_11 = var2_10;
                            var4_12 = var5_9;
                        }
                    }
                }
            } else {
                var14_16 = var17_3;
                var15_17 = var16_4;
                var9_13 = var12_6;
                var10_14 = var11_7;
                var3_11 = var6_8;
                var4_12 = var5_9;
                if (var17_3 == null) {
                    var14_16 = var17_3;
                    var15_17 = var16_4;
                    var9_13 = var12_6;
                    var10_14 = var11_7;
                    var3_11 = var6_8;
                    var4_12 = var5_9;
                    if (var2_10 < 0.0f) {
                        if (var16_4 == null) {
                            var9_13 = this.u(var13_15, var1_1);
lbl61:
                            // 2 sources

                            while (true) {
                                var10_14 = var9_13;
                                var14_16 = var17_3;
                                var15_17 = var13_15;
                                var9_13 = var12_6;
                                var3_11 = var6_8;
                                var4_12 = var2_10;
                                break;
                            }
                        } else {
                            if (var5_9 > var2_10) {
                                var9_13 = this.u(var13_15, var1_1);
                                ** continue;
                            }
                            var14_16 = var17_3;
                            var15_17 = var16_4;
                            var9_13 = var12_6;
                            var10_14 = var11_7;
                            var3_11 = var6_8;
                            var4_12 = var5_9;
                            if (!var11_7) {
                                var14_16 = var17_3;
                                var15_17 = var16_4;
                                var9_13 = var12_6;
                                var10_14 = var11_7;
                                var3_11 = var6_8;
                                var4_12 = var5_9;
                                if (this.u(var13_15, var1_1)) {
                                    var10_14 = true;
                                    var4_12 = var2_10;
                                    var3_11 = var6_8;
                                    var9_13 = var12_6;
                                    var15_17 = var13_15;
                                    var14_16 = var17_3;
                                }
                            }
                        }
                    }
                }
            }
            var17_3 = var14_16;
            var16_4 = var15_17;
            var12_6 = var9_13;
            var11_7 = var10_14;
            var6_8 = var3_11;
            var5_9 = var4_12;
        }
        if (var17_3 != null) {
            return var17_3;
        }
        return var16_4;
    }

    @Override
    public i getKey() {
        return this.a;
    }

    b h(i i8, i i9, int n8, float f8, i i10, i i11, int n9) {
        float f9;
        block10: {
            block9: {
                block8: {
                    if (i9 == i10) {
                        this.e.h(i8, 1.0f);
                        this.e.h(i11, 1.0f);
                        this.e.h(i9, -2.0f);
                        return this;
                    }
                    if (f8 != 0.5f) break block8;
                    this.e.h(i8, 1.0f);
                    this.e.h(i9, -1.0f);
                    this.e.h(i10, -1.0f);
                    this.e.h(i11, 1.0f);
                    if (n8 > 0 || n9 > 0) {
                        this.b = -n8 + n9;
                        return this;
                    }
                    break block9;
                }
                if (f8 <= 0.0f) {
                    this.e.h(i8, -1.0f);
                    this.e.h(i9, 1.0f);
                    this.b = n8;
                    return this;
                }
                if (f8 >= 1.0f) {
                    this.e.h(i11, -1.0f);
                    this.e.h(i10, 1.0f);
                    this.b = -n9;
                    return this;
                }
                a a8 = this.e;
                f9 = 1.0f - f8;
                a8.h(i8, f9 * 1.0f);
                this.e.h(i9, f9 * -1.0f);
                this.e.h(i10, -1.0f * f8);
                this.e.h(i11, 1.0f * f8);
                if (n8 > 0 || n9 > 0) break block10;
            }
            return this;
        }
        this.b = (float)(-n8) * f9 + (float)n9 * f8;
        return this;
    }

    b i(i i8, int n8) {
        float f8;
        this.a = i8;
        i8.g0 = f8 = (float)n8;
        this.b = f8;
        this.f = true;
        return this;
    }

    @Override
    public boolean isEmpty() {
        return this.a == null && this.b == 0.0f && this.e.b() == 0;
    }

    b j(i i8, i i9, float f8) {
        this.e.h(i8, -1.0f);
        this.e.h(i9, f8);
        return this;
    }

    public b k(i i8, i i9, i i10, i i11, float f8) {
        this.e.h(i8, -1.0f);
        this.e.h(i9, 1.0f);
        this.e.h(i10, f8);
        this.e.h(i11, -f8);
        return this;
    }

    public b l(float f8, float f9, float f10, i i8, i i9, i i10, i i11) {
        this.b = 0.0f;
        if (f9 != 0.0f && f8 != f10) {
            if (f8 == 0.0f) {
                this.e.h(i8, 1.0f);
                this.e.h(i9, -1.0f);
                return this;
            }
            if (f10 == 0.0f) {
                this.e.h(i10, 1.0f);
                this.e.h(i11, -1.0f);
                return this;
            }
            f8 = f8 / f9 / (f10 / f9);
            this.e.h(i8, 1.0f);
            this.e.h(i9, -1.0f);
            this.e.h(i11, f8);
            this.e.h(i10, -f8);
            return this;
        }
        this.e.h(i8, 1.0f);
        this.e.h(i9, -1.0f);
        this.e.h(i11, 1.0f);
        this.e.h(i10, -1.0f);
        return this;
    }

    public b m(i i8, int n8) {
        if (n8 < 0) {
            this.b = n8 * -1;
            this.e.h(i8, 1.0f);
            return this;
        }
        this.b = n8;
        this.e.h(i8, -1.0f);
        return this;
    }

    public b n(i i8, i i9, int n8) {
        int n9 = 0;
        int n10 = 0;
        if (n8 != 0) {
            n9 = n10;
            n10 = n8;
            if (n8 < 0) {
                n10 = n8 * -1;
                n9 = 1;
            }
            this.b = n10;
        }
        if (n9 == 0) {
            this.e.h(i8, -1.0f);
            this.e.h(i9, 1.0f);
            return this;
        }
        this.e.h(i8, 1.0f);
        this.e.h(i9, -1.0f);
        return this;
    }

    public b o(i i8, i i9, i i10, int n8) {
        int n9 = 0;
        int n10 = 0;
        if (n8 != 0) {
            n9 = n10;
            n10 = n8;
            if (n8 < 0) {
                n10 = n8 * -1;
                n9 = 1;
            }
            this.b = n10;
        }
        if (n9 == 0) {
            this.e.h(i8, -1.0f);
            this.e.h(i9, 1.0f);
            this.e.h(i10, 1.0f);
            return this;
        }
        this.e.h(i8, 1.0f);
        this.e.h(i9, -1.0f);
        this.e.h(i10, -1.0f);
        return this;
    }

    public b p(i i8, i i9, i i10, int n8) {
        int n9 = 0;
        int n10 = 0;
        if (n8 != 0) {
            n9 = n10;
            n10 = n8;
            if (n8 < 0) {
                n10 = n8 * -1;
                n9 = 1;
            }
            this.b = n10;
        }
        if (n9 == 0) {
            this.e.h(i8, -1.0f);
            this.e.h(i9, 1.0f);
            this.e.h(i10, -1.0f);
            return this;
        }
        this.e.h(i8, 1.0f);
        this.e.h(i9, -1.0f);
        this.e.h(i10, 1.0f);
        return this;
    }

    public b q(i i8, i i9, i i10, i i11, float f8) {
        this.e.h(i10, 0.5f);
        this.e.h(i11, 0.5f);
        this.e.h(i8, -0.5f);
        this.e.h(i9, -0.5f);
        this.b = -f8;
        return this;
    }

    void r() {
        float f8 = this.b;
        if (f8 < 0.0f) {
            this.b = f8 * -1.0f;
            this.e.f();
        }
    }

    boolean s() {
        i i8 = this.a;
        return !(i8 == null || i8.k0 != i.a.q && this.b < 0.0f);
    }

    boolean t(i i8) {
        return this.e.i(i8);
    }

    public String toString() {
        return this.z();
    }

    public i v(i i8) {
        return this.w(null, i8);
    }

    void x(i i8) {
        i i9 = this.a;
        if (i9 != null) {
            this.e.h(i9, -1.0f);
            this.a.e0 = -1;
            this.a = null;
        }
        float f8 = this.e.j(i8, true) * -1.0f;
        this.a = i8;
        if (f8 == 1.0f) {
            return;
        }
        this.b /= f8;
        this.e.k(f8);
    }

    public void y() {
        this.a = null;
        this.e.clear();
        this.b = 0.0f;
        this.f = false;
    }

    /*
     * Unable to fully structure code
     */
    String z() {
        if (this.a == null) {
            var7_1 = new StringBuilder();
            var7_1.append("");
            var7_1.append("0");
            var7_1 = var7_1.toString();
        } else {
            var7_1 = new StringBuilder();
            var7_1.append("");
            var7_1.append(this.a);
            var7_1 = var7_1.toString();
        }
        var8_2 = new StringBuilder();
        var8_2.append((String)var7_1);
        var8_2.append(" = ");
        var7_1 = var8_2.toString();
        var1_3 = this.b;
        var4_4 = 0;
        if (var1_3 != 0.0f) {
            var8_2 = new StringBuilder();
            var8_2.append((String)var7_1);
            var8_2.append(this.b);
            var7_1 = var8_2.toString();
            var3_5 = true;
        } else {
            var3_5 = false;
        }
        var5_6 = this.e.b();
        while (var4_4 < var5_6) {
            var8_2 = this.e.d(var4_4);
            if (var8_2 != null && (var6_8 = (cfr_temp_0 = (var2_7 = this.e.g(var4_4)) - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1)) != false) {
                var9_9 = var8_2.toString();
                if (!var3_5) {
                    var8_2 = var7_1;
                    var1_3 = var2_7;
                    if (var2_7 < 0.0f) {
                        var8_2 = new StringBuilder();
                        var8_2.append((String)var7_1);
                        var8_2.append("- ");
                        var8_2 = var8_2.toString();
lbl48:
                        // 2 sources

                        while (true) {
                            var1_3 = var2_7 * -1.0f;
                            break;
                        }
                    }
                } else if (var6_8 > 0) {
                    var8_2 = new StringBuilder();
                    var8_2.append((String)var7_1);
                    var8_2.append(" + ");
                    var8_2 = var8_2.toString();
                    var1_3 = var2_7;
                } else {
                    var8_2 = new StringBuilder();
                    var8_2.append((String)var7_1);
                    var8_2.append(" - ");
                    var8_2 = var8_2.toString();
                    ** continue;
                }
                if (var1_3 == 1.0f) {
                    var7_1 = new StringBuilder();
                    var7_1.append((String)var8_2);
                    var7_1.append(var9_9);
                    var7_1 = var7_1.toString();
                } else {
                    var7_1 = new StringBuilder();
                    var7_1.append((String)var8_2);
                    var7_1.append(var1_3);
                    var7_1.append(" ");
                    var7_1.append(var9_9);
                    var7_1 = var7_1.toString();
                }
                var3_5 = true;
            }
            ++var4_4;
        }
        var8_2 = var7_1;
        if (!var3_5) {
            var8_2 = new StringBuilder();
            var8_2.append((String)var7_1);
            var8_2.append("0.0");
            var8_2 = var8_2.toString();
        }
        return var8_2;
    }

    public static interface a {
        public void a(i var1, float var2, boolean var3);

        public int b();

        public float c(i var1);

        public void clear();

        public i d(int var1);

        public float e(b var1, boolean var2);

        public void f();

        public float g(int var1);

        public void h(i var1, float var2);

        public boolean i(i var1);

        public float j(i var1, boolean var2);

        public void k(float var1);
    }
}

