/*
 * Decompiled with CFR 0.152.
 */
package ax.E;

import ax.E.c;
import ax.E.e;
import ax.E.h;
import ax.E.i;
import ax.E.j;
import ax.H.d;
import java.util.Arrays;
import java.util.HashMap;

public class d {
    public static boolean r = false;
    public static boolean s = true;
    public static boolean t = true;
    public static boolean u = true;
    public static boolean v = false;
    private static int w = 1000;
    public static long x;
    public static long y;
    public boolean a = false;
    int b = 0;
    private HashMap<String, i> c = null;
    private a d;
    private int e = 32;
    private int f = 32;
    ax.E.b[] g = null;
    public boolean h = false;
    public boolean i = false;
    private boolean[] j = new boolean[32];
    int k = 1;
    int l = 0;
    private int m = 32;
    final c n;
    private i[] o = new i[w];
    private int p = 0;
    private a q;

    public d() {
        c c8;
        this.g = new ax.E.b[32];
        this.C();
        this.n = c8 = new c();
        this.d = new h(c8);
        if (v) {
            this.q = new b(this, c8);
            return;
        }
        this.q = new ax.E.b(c8);
    }

    private final int B(a a8, boolean bl) {
        int n8;
        for (n8 = 0; n8 < this.k; ++n8) {
            this.j[n8] = false;
        }
        boolean bl2 = false;
        n8 = 0;
        while (!bl2) {
            Object object;
            i i8;
            int n9;
            block16: {
                block17: {
                    block15: {
                        n9 = n8 + 1;
                        if (n9 >= this.k * 2) break block15;
                        if (a8.getKey() != null) {
                            this.j[a8.getKey().d0] = true;
                        }
                        if ((i8 = a8.c(this, this.j)) == null) break block16;
                        object = this.j;
                        n8 = i8.d0;
                        if (!object[n8]) break block17;
                    }
                    return n9;
                }
                object[n8] = true;
            }
            if (i8 != null) {
                float f8 = Float.MAX_VALUE;
                int n10 = -1;
                for (n8 = 0; n8 < this.l; ++n8) {
                    int n11;
                    float f9;
                    object = this.g[n8];
                    if (object.a.k0 == i.a.q) {
                        f9 = f8;
                        n11 = n10;
                    } else if (object.f) {
                        f9 = f8;
                        n11 = n10;
                    } else {
                        f9 = f8;
                        n11 = n10;
                        if (object.t(i8)) {
                            float f10 = object.e.c(i8);
                            f9 = f8;
                            n11 = n10;
                            if (f10 < 0.0f) {
                                f10 = -object.b / f10;
                                f9 = f8;
                                n11 = n10;
                                if (f10 < f8) {
                                    n11 = n8;
                                    f9 = f10;
                                }
                            }
                        }
                    }
                    f8 = f9;
                    n10 = n11;
                }
                n8 = n9;
                if (n10 <= -1) continue;
                object = this.g[n10];
                object.a.e0 = -1;
                object.x(i8);
                i8 = object.a;
                i8.e0 = n10;
                i8.r(this, (ax.E.b)object);
                n8 = n9;
                continue;
            }
            bl2 = true;
            n8 = n9;
        }
        return n8;
    }

    private void C() {
        int n8;
        boolean bl = v;
        int n9 = 0;
        if (bl) {
            for (n8 = n9; n8 < this.l; ++n8) {
                ax.E.b b8 = this.g[n8];
                if (b8 != null) {
                    this.n.a.a(b8);
                }
                this.g[n8] = null;
            }
        } else {
            for (n8 = 0; n8 < this.l; ++n8) {
                ax.E.b b9 = this.g[n8];
                if (b9 != null) {
                    this.n.b.a(b9);
                }
                this.g[n8] = null;
            }
        }
    }

    private i a(i.a object, String iArray) {
        i i8 = this.n.c.b();
        if (i8 == null) {
            i8 = new i((i.a)((Object)object), (String)iArray);
            i8.q((i.a)((Object)object), (String)iArray);
            object = i8;
        } else {
            i8.n();
            i8.q((i.a)((Object)object), (String)iArray);
            object = i8;
        }
        int n8 = this.p;
        int n9 = w;
        if (n8 >= n9) {
            w = n8 = n9 * 2;
            this.o = Arrays.copyOf(this.o, n8);
        }
        iArray = this.o;
        n8 = this.p;
        this.p = n8 + 1;
        iArray[n8] = object;
        return object;
    }

    private final void l(ax.E.b object) {
        int n8;
        Object object2;
        if (t && ((ax.E.b)object).f) {
            ((ax.E.b)object).a.p(this, ((ax.E.b)object).b);
        } else {
            object2 = this.g;
            n8 = this.l;
            object2[n8] = object;
            object2 = ((ax.E.b)object).a;
            ((i)object2).e0 = n8;
            this.l = n8 + 1;
            ((i)object2).r(this, (ax.E.b)object);
        }
        if (t && this.a) {
            n8 = 0;
            while (n8 < this.l) {
                if (this.g[n8] == null) {
                    System.out.println("WTF");
                }
                object = this.g[n8];
                int n9 = n8;
                if (object != null) {
                    n9 = n8;
                    if (((ax.E.b)object).f) {
                        int n10;
                        ((ax.E.b)object).a.p(this, ((ax.E.b)object).b);
                        if (v) {
                            this.n.a.a((ax.E.b)object);
                        } else {
                            this.n.b.a((ax.E.b)object);
                        }
                        this.g[n8] = null;
                        int n11 = n9 = n8 + 1;
                        while (n9 < (n10 = this.l)) {
                            object2 = this.g;
                            n11 = n9 - 1;
                            object2[n11] = object = object2[n9];
                            object = ((ax.E.b)object).a;
                            if (((i)object).e0 == n9) {
                                ((i)object).e0 = n11;
                            }
                            n11 = n9++;
                        }
                        if (n11 < n10) {
                            this.g[n11] = null;
                        }
                        this.l = n10 - 1;
                        n9 = n8 - 1;
                    }
                }
                n8 = n9 + 1;
            }
            this.a = false;
        }
    }

    private void n() {
        for (int i8 = 0; i8 < this.l; ++i8) {
            ax.E.b b8 = this.g[i8];
            b8.a.g0 = b8.b;
        }
    }

    public static ax.E.b s(d d8, i i8, i i9, float f8) {
        return d8.r().j(i8, i9, f8);
    }

    private int u(a object) throws Exception {
        for (int i8 = 0; i8 < this.l; ++i8) {
            object = this.g[i8];
            if (((ax.E.b)object).a.k0 == i.a.q || !(((ax.E.b)object).b < 0.0f)) continue;
            boolean bl = false;
            i8 = 0;
            while (!bl) {
                Object object2;
                int n8 = i8 + 1;
                float f8 = Float.MAX_VALUE;
                int n9 = 0;
                i8 = -1;
                int n10 = -1;
                int n11 = 0;
                while (true) {
                    int n12;
                    int n13;
                    float f9;
                    int n14;
                    block24: {
                        int n15;
                        float f10;
                        int n16;
                        block19: {
                            block17: {
                                block18: {
                                    block16: {
                                        n16 = this.l;
                                        n14 = 1;
                                        if (n9 >= n16) break;
                                        object = this.g[n9];
                                        if (((ax.E.b)object).a.k0 != i.a.q) break block16;
                                        f9 = f8;
                                        n13 = i8;
                                        n12 = n10;
                                        n16 = n11;
                                        break block17;
                                    }
                                    if (!((ax.E.b)object).f) break block18;
                                    f9 = f8;
                                    n13 = i8;
                                    n12 = n10;
                                    n16 = n11;
                                    break block17;
                                }
                                f9 = f8;
                                n13 = i8;
                                n12 = n10;
                                n16 = n11;
                                if (!(((ax.E.b)object).b < 0.0f)) break block17;
                                if (!u) break block19;
                                int n17 = ((ax.E.b)object).e.b();
                                n14 = 0;
                                while (true) {
                                    block21: {
                                        block20: {
                                            f9 = f8;
                                            n13 = i8;
                                            n12 = n10;
                                            n16 = n11;
                                            if (n14 >= n17) break;
                                            object2 = ((ax.E.b)object).e.d(n14);
                                            f10 = ((ax.E.b)object).e.c((i)object2);
                                            if (!(f10 <= 0.0f)) break block20;
                                            f9 = f8;
                                            n13 = i8;
                                            n15 = n10;
                                            n12 = n11;
                                            break block21;
                                        }
                                        n12 = 0;
                                        n16 = i8;
                                        i8 = n12;
                                        while (true) {
                                            block23: {
                                                block22: {
                                                    f9 = f8;
                                                    n13 = n16;
                                                    n15 = n10;
                                                    n12 = n11;
                                                    if (i8 >= 9) break;
                                                    f9 = ((i)object2).i0[i8] / f10;
                                                    if (f9 < f8 && i8 == n11) break block22;
                                                    n12 = n11;
                                                    if (i8 <= n11) break block23;
                                                }
                                                n10 = ((i)object2).d0;
                                                n12 = i8;
                                                n16 = n9;
                                                f8 = f9;
                                            }
                                            ++i8;
                                            n11 = n12;
                                        }
                                    }
                                    ++n14;
                                    f8 = f9;
                                    i8 = n13;
                                    n10 = n15;
                                    n11 = n12;
                                }
                            }
                            n14 = n16;
                            break block24;
                        }
                        n16 = n14;
                        while (true) {
                            block26: {
                                block25: {
                                    f9 = f8;
                                    n13 = i8;
                                    n12 = n10;
                                    n14 = n11;
                                    if (n16 >= this.k) break;
                                    object2 = this.n.d[n16];
                                    f10 = ((ax.E.b)object).e.c((i)object2);
                                    if (!(f10 <= 0.0f)) break block25;
                                    f9 = f8;
                                    n14 = i8;
                                    n13 = n10;
                                    n15 = n11;
                                    break block26;
                                }
                                n13 = 0;
                                n12 = i8;
                                i8 = n13;
                                while (true) {
                                    block28: {
                                        block27: {
                                            f9 = f8;
                                            n14 = n12;
                                            n13 = n10;
                                            n15 = n11;
                                            if (i8 >= 9) break;
                                            f9 = ((i)object2).i0[i8] / f10;
                                            if (f9 < f8 && i8 == n11) break block27;
                                            n13 = n11;
                                            if (i8 <= n11) break block28;
                                        }
                                        n13 = i8;
                                        n12 = n9;
                                        n10 = n16;
                                        f8 = f9;
                                    }
                                    ++i8;
                                    n11 = n13;
                                }
                            }
                            ++n16;
                            f8 = f9;
                            i8 = n14;
                            n10 = n13;
                            n11 = n15;
                        }
                    }
                    ++n9;
                    f8 = f9;
                    i8 = n13;
                    n10 = n12;
                    n11 = n14;
                }
                if (i8 != -1) {
                    object2 = this.g[i8];
                    ((ax.E.b)object2).a.e0 = -1;
                    ((ax.E.b)object2).x(this.n.d[n10]);
                    object = ((ax.E.b)object2).a;
                    ((i)object).e0 = i8;
                    ((i)object).r(this, (ax.E.b)object2);
                } else {
                    bl = true;
                }
                if (n8 > this.k / 2) {
                    bl = true;
                }
                i8 = n8;
            }
            return i8;
        }
        return 0;
    }

    public static e w() {
        return null;
    }

    private void y() {
        int n8;
        this.e = n8 = this.e * 2;
        this.g = Arrays.copyOf(this.g, n8);
        c c8 = this.n;
        c8.d = Arrays.copyOf(c8.d, this.e);
        n8 = this.e;
        this.j = new boolean[n8];
        this.f = n8;
        this.m = n8;
    }

    void A(a a8) throws Exception {
        this.u(a8);
        this.B(a8, false);
        this.n();
    }

    public void D() {
        Object object;
        int n8 = 0;
        while (true) {
            object = this.n;
            i[] iArray = ((c)object).d;
            if (n8 >= iArray.length) break;
            object = iArray[n8];
            if (object != null) {
                ((i)object).n();
            }
            ++n8;
        }
        ((c)object).c.c((i[])this.o, this.p);
        this.p = 0;
        Arrays.fill(this.n.d, null);
        object = this.c;
        if (object != null) {
            ((HashMap)object).clear();
        }
        this.b = 0;
        this.d.clear();
        this.k = 1;
        for (n8 = 0; n8 < this.l; ++n8) {
            object = this.g[n8];
            if (object == null) continue;
            ((ax.E.b)object).c = false;
        }
        this.C();
        this.l = 0;
        if (v) {
            this.q = new b(this, this.n);
            return;
        }
        this.q = new ax.E.b(this.n);
    }

    public void b(ax.H.e object, ax.H.e object2, float f8, int n8) {
        d.b b8 = d.b.c0;
        i i8 = this.q(((ax.H.e)object).o(b8));
        Object object3 = d.b.d0;
        i i9 = this.q(((ax.H.e)object).o((d.b)((Object)object3)));
        Object object4 = d.b.e0;
        i i10 = this.q(((ax.H.e)object).o((d.b)((Object)object4)));
        Object object5 = d.b.f0;
        i i11 = this.q(((ax.H.e)object).o((d.b)((Object)object5)));
        object = this.q(((ax.H.e)object2).o(b8));
        object3 = this.q(((ax.H.e)object2).o((d.b)((Object)object3)));
        object4 = this.q(((ax.H.e)object2).o((d.b)((Object)object4)));
        object5 = this.q(((ax.H.e)object2).o((d.b)((Object)object5)));
        object2 = this.r();
        double d8 = f8;
        double d9 = Math.sin(d8);
        double d10 = n8;
        ((ax.E.b)object2).q(i9, i11, (i)object3, (i)object5, (float)(d9 * d10));
        this.d((ax.E.b)object2);
        object2 = this.r();
        ((ax.E.b)object2).q(i8, i10, (i)object, (i)object4, (float)(Math.cos(d8) * d10));
        this.d((ax.E.b)object2);
    }

    public void c(i i8, i i9, int n8, float f8, i i10, i i11, int n9, int n10) {
        ax.E.b b8 = this.r();
        b8.h(i8, i9, n8, f8, i10, i11, n9);
        if (n10 != 8) {
            b8.d(this, n10);
        }
        this.d(b8);
    }

    /*
     * Unable to fully structure code
     */
    public void d(ax.E.b var1_1) {
        block13: {
            block14: {
                if (var1_1 == null) break block13;
                var2_2 = this.l;
                var3_3 = 1;
                if (var2_2 + 1 >= this.m || this.k + 1 >= this.f) {
                    this.y();
                }
                var4_4 = var1_1.f;
                var2_2 = 0;
                if (var4_4) break block14;
                var1_1.D(this);
                if (var1_1.isEmpty()) break block13;
                var1_1.r();
                if (!var1_1.f(this)) ** GOTO lbl-1000
                var1_1.a = var5_5 = this.p();
                var2_2 = this.l;
                this.l(var1_1);
                if (this.l == var2_2 + 1) {
                    this.q.a(var1_1);
                    this.B(this.q, true);
                    var2_2 = var3_3;
                    if (var5_5.e0 == -1) {
                        if (var1_1.a == var5_5 && (var5_5 = var1_1.v(var5_5)) != null) {
                            var1_1.x(var5_5);
                        }
                        if (!var1_1.f) {
                            var1_1.a.r(this, var1_1);
                        }
                        if (ax.E.d.v) {
                            this.n.a.a(var1_1);
                        } else {
                            this.n.b.a(var1_1);
                        }
                        --this.l;
                        var2_2 = var3_3;
                    }
                } else lbl-1000:
                // 2 sources

                {
                    var2_2 = 0;
                }
                if (!var1_1.s()) break block13;
            }
            if (var2_2 == 0) {
                this.l(var1_1);
            }
        }
    }

    public ax.E.b e(i i8, i i9, int n8, int n9) {
        if (s && n9 == 8 && i9.h0 && i8.e0 == -1) {
            i8.p(this, i9.g0 + (float)n8);
            return null;
        }
        ax.E.b b8 = this.r();
        b8.n(i8, i9, n8);
        if (n9 != 8) {
            b8.d(this, n9);
        }
        this.d(b8);
        return b8;
    }

    public void f(i i8, int n8) {
        if (s && i8.e0 == -1) {
            float f8 = n8;
            i8.p(this, f8);
            for (n8 = 0; n8 < this.b + 1; ++n8) {
                i i9 = this.n.d[n8];
                if (i9 == null || !i9.o0 || i9.p0 != i8.d0) continue;
                i9.p(this, i9.q0 + f8);
            }
            return;
        }
        int n9 = i8.e0;
        if (n9 != -1) {
            ax.E.b b8 = this.g[n9];
            if (b8.f) {
                b8.b = n8;
                return;
            }
            if (b8.e.b() == 0) {
                b8.f = true;
                b8.b = n8;
                return;
            }
            b8 = this.r();
            b8.m(i8, n8);
            this.d(b8);
            return;
        }
        ax.E.b b9 = this.r();
        b9.i(i8, n8);
        this.d(b9);
    }

    public void g(i i8, i i9, int n8, boolean bl) {
        ax.E.b b8 = this.r();
        i i10 = this.t();
        i10.f0 = 0;
        b8.o(i8, i9, i10, n8);
        this.d(b8);
    }

    public void h(i i8, i i9, int n8, int n9) {
        ax.E.b b8 = this.r();
        i i10 = this.t();
        i10.f0 = 0;
        b8.o(i8, i9, i10, n8);
        if (n9 != 8) {
            this.m(b8, (int)(b8.e.c(i10) * -1.0f), n9);
        }
        this.d(b8);
    }

    public void i(i i8, i i9, int n8, boolean bl) {
        ax.E.b b8 = this.r();
        i i10 = this.t();
        i10.f0 = 0;
        b8.p(i8, i9, i10, n8);
        this.d(b8);
    }

    public void j(i i8, i i9, int n8, int n9) {
        ax.E.b b8 = this.r();
        i i10 = this.t();
        i10.f0 = 0;
        b8.p(i8, i9, i10, n8);
        if (n9 != 8) {
            this.m(b8, (int)(b8.e.c(i10) * -1.0f), n9);
        }
        this.d(b8);
    }

    public void k(i i8, i i9, i i10, i i11, float f8, int n8) {
        ax.E.b b8 = this.r();
        b8.k(i8, i9, i10, i11, f8);
        if (n8 != 8) {
            b8.d(this, n8);
        }
        this.d(b8);
    }

    void m(ax.E.b b8, int n8, int n9) {
        b8.e(this.o(n9, null), n8);
    }

    public i o(int n8, String object) {
        int n9;
        if (this.k + 1 >= this.f) {
            this.y();
        }
        object = this.a(i.a.e0, (String)object);
        this.b = n9 = this.b + 1;
        ++this.k;
        ((i)object).d0 = n9;
        ((i)object).f0 = n8;
        this.n.d[n9] = object;
        this.d.b((i)object);
        return object;
    }

    public i p() {
        int n8;
        if (this.k + 1 >= this.f) {
            this.y();
        }
        i i8 = this.a(i.a.d0, null);
        this.b = n8 = this.b + 1;
        ++this.k;
        i8.d0 = n8;
        this.n.d[n8] = i8;
        return i8;
    }

    public i q(Object object) {
        Object object2 = null;
        if (object == null) {
            return null;
        }
        if (this.k + 1 >= this.f) {
            this.y();
        }
        if (object instanceof ax.H.d) {
            int n8;
            ax.H.d d8 = (ax.H.d)object;
            object = object2 = d8.i();
            if (object2 == null) {
                d8.s(this.n);
                object = d8.i();
            }
            if ((n8 = ((i)object).d0) != -1 && n8 <= this.b && this.n.d[n8] != null) {
                return object;
            }
            if (n8 != -1) {
                ((i)object).n();
            }
            this.b = n8 = this.b + 1;
            ++this.k;
            ((i)object).d0 = n8;
            ((i)object).k0 = i.a.q;
            this.n.d[n8] = object;
            object2 = object;
        }
        return object2;
    }

    public ax.E.b r() {
        ax.E.b b8;
        if (v) {
            b8 = this.n.a.b();
            if (b8 == null) {
                b8 = new b(this, this.n);
                ++y;
            } else {
                b8.y();
            }
        } else {
            b8 = this.n.b.b();
            if (b8 == null) {
                b8 = new ax.E.b(this.n);
                ++x;
            } else {
                b8.y();
            }
        }
        ax.E.i.j();
        return b8;
    }

    public i t() {
        int n8;
        if (this.k + 1 >= this.f) {
            this.y();
        }
        i i8 = this.a(i.a.d0, null);
        this.b = n8 = this.b + 1;
        ++this.k;
        i8.d0 = n8;
        this.n.d[n8] = i8;
        return i8;
    }

    public c v() {
        return this.n;
    }

    public int x(Object object) {
        if ((object = ((ax.H.d)object).i()) != null) {
            return (int)(((i)object).g0 + 0.5f);
        }
        return 0;
    }

    public void z() throws Exception {
        if (this.d.isEmpty()) {
            this.n();
            return;
        }
        if (!this.h && !this.i) {
            this.A(this.d);
            return;
        }
        for (int i8 = 0; i8 < this.l; ++i8) {
            if (this.g[i8].f) continue;
            this.A(this.d);
            return;
        }
        this.n();
    }

    static interface a {
        public void a(a var1);

        public void b(i var1);

        public i c(d var1, boolean[] var2);

        public void clear();

        public i getKey();

        public boolean isEmpty();
    }

    class b
    extends ax.E.b {
        final d g;

        public b(d d8, c c8) {
            this.g = d8;
            this.e = new j(this, c8);
        }
    }
}

