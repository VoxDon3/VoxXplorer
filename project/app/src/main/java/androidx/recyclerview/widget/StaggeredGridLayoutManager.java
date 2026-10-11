/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager
extends RecyclerView.p
implements RecyclerView.A.b {
    boolean A = false;
    private BitSet B;
    int C = -1;
    int D = Integer.MIN_VALUE;
    d E = new d();
    private int F = 2;
    private boolean G;
    private boolean H;
    private e I;
    private int J;
    private final Rect K = new Rect();
    private final b L = new b(this);
    private boolean M = false;
    private boolean N = true;
    private int[] O;
    private final Runnable P = new Runnable(this){
        final StaggeredGridLayoutManager q;
        {
            this.q = staggeredGridLayoutManager;
        }

        @Override
        public void run() {
            this.q.X1();
        }
    };
    private int s = -1;
    f[] t;
    o u;
    o v;
    private int w;
    private int x;
    private final k y;
    boolean z = false;

    public StaggeredGridLayoutManager(Context object, AttributeSet attributeSet, int n8, int n9) {
        object = RecyclerView.p.n0(object, attributeSet, n8, n9);
        this.M2(object.a);
        this.O2(object.b);
        this.N2(object.c);
        this.y = new k();
        this.f2();
    }

    private void A2(View view, c c8, boolean bl) {
        if (c8.f) {
            if (this.w == 1) {
                this.z2(view, this.J, RecyclerView.p.Q(this.c0(), this.d0(), this.l0() + this.i0(), c8.height, true), bl);
                return;
            }
            this.z2(view, RecyclerView.p.Q(this.t0(), this.u0(), this.j0() + this.k0(), c8.width, true), this.J, bl);
            return;
        }
        if (this.w == 1) {
            this.z2(view, RecyclerView.p.Q(this.x, this.u0(), 0, c8.width, false), RecyclerView.p.Q(this.c0(), this.d0(), this.l0() + this.i0(), c8.height, true), bl);
            return;
        }
        this.z2(view, RecyclerView.p.Q(this.t0(), this.u0(), this.j0() + this.k0(), c8.width, true), RecyclerView.p.Q(this.x, this.d0(), 0, c8.height, false), bl);
    }

    /*
     * Unable to fully structure code
     */
    private void B2(RecyclerView.w var1_1, RecyclerView.B var2_2, boolean var3_3) {
        var8_4 = this.L;
        if ((this.I != null || this.C != -1) && var2_2.b() == 0) {
            this.p1(var1_1);
            var8_4.c();
            return;
        }
        var7_5 = var8_4.e;
        var5_6 = 1;
        var4_7 = var7_5 && this.C == -1 && this.I == null ? 0 : 1;
        if (var4_7 != 0) {
            var8_4.c();
            if (this.I != null) {
                this.S1(var8_4);
            } else {
                this.J2();
                var8_4.c = this.A;
            }
            this.S2(var2_2, var8_4);
            var8_4.e = true;
        }
        if (this.I == null && this.C == -1 && (var8_4.c != this.G || this.y2() != this.H)) {
            this.E.b();
            var8_4.d = true;
        }
        if (this.P() > 0 && ((var9_8 = this.I) == null || var9_8.d0 < 1)) {
            if (var8_4.d) {
                for (var4_7 = 0; var4_7 < this.s; ++var4_7) {
                    this.t[var4_7].e();
                    var6_9 = var8_4.b;
                    if (var6_9 == -2147483648) continue;
                    this.t[var4_7].v(var6_9);
                }
            } else if (var4_7 == 0 && this.L.f != null) {
                for (var4_7 = 0; var4_7 < this.s; ++var4_7) {
                    var9_8 = this.t[var4_7];
                    var9_8.e();
                    var9_8.v(this.L.f[var4_7]);
                }
            } else {
                for (var4_7 = 0; var4_7 < this.s; ++var4_7) {
                    this.t[var4_7].b(this.A, var8_4.b);
                }
                this.L.d(this.t);
            }
        }
        this.C(var1_1);
        this.y.a = false;
        this.M = false;
        this.U2(this.v.n());
        this.T2(var8_4.a, var2_2);
        if (var8_4.c) {
            this.L2(-1);
            this.g2(var1_1, this.y, var2_2);
            this.L2(1);
            var9_8 = this.y;
            var9_8.c = var8_4.a + var9_8.d;
            this.g2(var1_1, (k)var9_8, var2_2);
        } else {
            this.L2(1);
            this.g2(var1_1, this.y, var2_2);
            this.L2(-1);
            var9_8 = this.y;
            var9_8.c = var8_4.a + var9_8.d;
            this.g2(var1_1, (k)var9_8, var2_2);
        }
        this.I2();
        if (this.P() > 0) {
            if (this.A) {
                this.m2(var1_1, var2_2, true);
                this.n2(var1_1, var2_2, false);
            } else {
                this.n2(var1_1, var2_2, true);
                this.m2(var1_1, var2_2, false);
            }
        }
        if (!var3_3 || var2_2.e() || this.F == 0 || this.P() <= 0 || !this.M && this.w2() == null) ** GOTO lbl-1000
        this.t1(this.P);
        if (this.X1()) {
            var4_7 = var5_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_7 = 0;
        }
        if (var2_2.e()) {
            this.L.c();
        }
        this.G = var8_4.c;
        this.H = this.y2();
        if (var4_7 != 0) {
            this.L.c();
            this.B2(var1_1, var2_2, false);
        }
    }

    private boolean C2(int n8) {
        if (this.w == 0) {
            boolean bl = n8 == -1;
            return bl != this.A;
        }
        boolean bl = n8 == -1;
        return (bl = bl == this.A) == this.y2();
    }

    private void E2(View view) {
        for (int i8 = this.s - 1; i8 >= 0; --i8) {
            this.t[i8].u(view);
        }
    }

    private void F2(RecyclerView.w w8, k k8) {
        if (k8.a && !k8.i) {
            int n8;
            if (k8.b == 0) {
                if (k8.e == -1) {
                    this.G2(w8, k8.g);
                    return;
                }
                this.H2(w8, k8.f);
                return;
            }
            if (k8.e == -1) {
                int n9 = k8.f;
                n9 = (n9 -= this.r2(n9)) < 0 ? k8.g : k8.g - Math.min(n9, k8.b);
                this.G2(w8, n9);
                return;
            }
            int n10 = this.s2(k8.g) - k8.g;
            if (n10 < 0) {
                n8 = k8.f;
            } else {
                n8 = k8.f;
                n8 = Math.min(n10, k8.b) + n8;
            }
            this.H2(w8, n8);
        }
    }

    private void G2(RecyclerView.w w8, int n8) {
        View view;
        block0: for (int i8 = this.P() - 1; i8 >= 0 && this.u.g(view = this.O(i8)) >= n8 && this.u.q(view) >= n8; --i8) {
            c c8 = (c)view.getLayoutParams();
            if (c8.f) {
                int n9 = 0;
                int n10 = 0;
                while (true) {
                    if (n10 >= this.s) break;
                    if (this.t[n10].a.size() == 1) break block0;
                    ++n10;
                }
                for (int i9 = n9; i9 < this.s; ++i9) {
                    this.t[i9].s();
                }
            } else {
                if (c8.e.a.size() == 1) break;
                c8.e.s();
            }
            this.r1(view, w8);
        }
    }

    private void H2(RecyclerView.w w8, int n8) {
        block0: while (this.P() > 0) {
            int n9 = 0;
            View view = this.O(0);
            if (this.u.d(view) > n8 || this.u.p(view) > n8) break;
            c c8 = (c)view.getLayoutParams();
            if (c8.f) {
                int n10 = 0;
                while (true) {
                    if (n10 >= this.s) break;
                    if (this.t[n10].a.size() == 1) break block0;
                    ++n10;
                }
                for (int i8 = n9; i8 < this.s; ++i8) {
                    this.t[i8].t();
                }
            } else {
                if (c8.e.a.size() == 1) break;
                c8.e.t();
            }
            this.r1(view, w8);
        }
    }

    private void I2() {
        if (this.v.k() != 0x40000000) {
            int n8;
            View view;
            int n9;
            int n10 = this.P();
            int n11 = 0;
            float f8 = 0.0f;
            for (n9 = 0; n9 < n10; ++n9) {
                view = this.O(n9);
                float f9 = this.v.e(view);
                if (f9 < f8) continue;
                float f10 = f9;
                if (((c)view.getLayoutParams()).e()) {
                    f10 = f9 * 1.0f / (float)this.s;
                }
                f8 = Math.max(f8, f10);
            }
            int n12 = this.x;
            n9 = n8 = Math.round(f8 * (float)this.s);
            if (this.v.k() == Integer.MIN_VALUE) {
                n9 = Math.min(n8, this.v.n());
            }
            this.U2(n9);
            if (this.x != n12) {
                for (n9 = n11; n9 < n10; ++n9) {
                    view = this.O(n9);
                    c c8 = (c)view.getLayoutParams();
                    if (c8.f) continue;
                    if (this.y2() && this.w == 1) {
                        n8 = this.s;
                        n11 = c8.e.e;
                        view.offsetLeftAndRight(-(n8 - 1 - n11) * this.x - -(n8 - 1 - n11) * n12);
                        continue;
                    }
                    n8 = c8.e.e;
                    n11 = this.x * n8;
                    n8 *= n12;
                    if (this.w == 1) {
                        view.offsetLeftAndRight(n11 - n8);
                        continue;
                    }
                    view.offsetTopAndBottom(n11 - n8);
                }
            }
        }
    }

    private void J2() {
        if (this.w != 1 && this.y2()) {
            this.A = this.z ^ true;
            return;
        }
        this.A = this.z;
    }

    private void L2(int n8) {
        k k8 = this.y;
        k8.e = n8;
        boolean bl = this.A;
        int n9 = 1;
        boolean bl2 = n8 == -1;
        n8 = bl == bl2 ? n9 : -1;
        k8.d = n8;
    }

    private void P2(int n8, int n9) {
        for (int i8 = 0; i8 < this.s; ++i8) {
            if (this.t[i8].a.isEmpty()) continue;
            this.V2(this.t[i8], n8, n9);
        }
    }

    private boolean Q2(RecyclerView.B b8, b b9) {
        int n8 = this.G ? this.l2(b8.b()) : this.h2(b8.b());
        b9.a = n8;
        b9.b = Integer.MIN_VALUE;
        return true;
    }

    private void R1(View view) {
        for (int i8 = this.s - 1; i8 >= 0; --i8) {
            this.t[i8].a(view);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void S1(b object) {
        e e8 = this.I;
        int n8 = e8.d0;
        if (n8 > 0) {
            if (n8 != this.s) {
                e8.b();
                e8 = this.I;
                e8.q = e8.c0;
            } else {
                for (n8 = 0; n8 < this.s; ++n8) {
                    int n9;
                    this.t[n8].e();
                    e8 = this.I;
                    int n10 = n9 = e8.e0[n8];
                    if (n9 != Integer.MIN_VALUE) {
                        n10 = e8.j0 ? this.u.i() : this.u.m();
                        n10 = n9 + n10;
                    }
                    this.t[n8].v(n10);
                }
            }
        }
        e8 = this.I;
        this.H = e8.k0;
        this.N2(e8.i0);
        this.J2();
        e8 = this.I;
        n8 = e8.q;
        if (n8 != -1) {
            this.C = n8;
            ((b)object).c = e8.j0;
        } else {
            ((b)object).c = this.A;
        }
        if (e8.f0 > 1) {
            object = this.E;
            ((d)object).a = e8.g0;
            ((d)object).b = e8.h0;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void T2(int n8, RecyclerView.B object) {
        boolean bl;
        int n9;
        boolean bl2;
        block7: {
            block6: {
                block4: {
                    block5: {
                        k k8 = this.y;
                        bl2 = false;
                        k8.b = 0;
                        k8.c = n8;
                        if (!this.C0() || (n9 = ((RecyclerView.B)object).c()) == -1) break block4;
                        boolean bl3 = this.A;
                        bl = n9 < n8;
                        if (bl3 != bl) break block5;
                        n8 = this.u.n();
                        break block6;
                    }
                    n9 = this.u.n();
                    n8 = 0;
                    break block7;
                }
                n8 = 0;
            }
            n9 = 0;
        }
        if (this.S()) {
            this.y.f = this.u.m() - n9;
            this.y.g = this.u.i() + n8;
        } else {
            this.y.g = this.u.h() + n8;
            this.y.f = -n9;
        }
        object = this.y;
        ((k)object).h = false;
        ((k)object).a = true;
        bl = bl2;
        if (this.u.k() == 0) {
            bl = bl2;
            if (this.u.h() == 0) {
                bl = true;
            }
        }
        ((k)object).i = bl;
    }

    private void V1(View view, c c8, k k8) {
        if (k8.e == 1) {
            if (c8.f) {
                this.R1(view);
                return;
            }
            c8.e.a(view);
            return;
        }
        if (c8.f) {
            this.E2(view);
            return;
        }
        c8.e.u(view);
    }

    private void V2(f f8, int n8, int n9) {
        int n10 = f8.j();
        if (n8 == -1) {
            if (f8.o() + n10 <= n9) {
                this.B.set(f8.e, false);
                return;
            }
        } else if (f8.k() - n10 >= n9) {
            this.B.set(f8.e, false);
        }
    }

    private int W1(int n8) {
        if (this.P() == 0) {
            if (this.A) {
                return 1;
            }
            return -1;
        }
        boolean bl = n8 < this.o2();
        if (bl != this.A) {
            return -1;
        }
        return 1;
    }

    private int W2(int n8, int n9, int n10) {
        int n11;
        if (n9 == 0 && n10 == 0 || (n11 = View.MeasureSpec.getMode((int)n8)) != Integer.MIN_VALUE && n11 != 0x40000000) {
            return n8;
        }
        return View.MeasureSpec.makeMeasureSpec((int)Math.max(0, View.MeasureSpec.getSize((int)n8) - n9 - n10), (int)n11);
    }

    private boolean Y1(f f8) {
        if (this.A) {
            if (f8.k() < this.u.i()) {
                ArrayList<View> arrayList = f8.a;
                return f8.n((View)arrayList.get((int)(arrayList.size() - 1))).f ^ true;
            }
        } else if (f8.o() > this.u.m()) {
            return f8.n((View)f8.a.get((int)0)).f ^ true;
        }
        return false;
    }

    private int Z1(RecyclerView.B b8) {
        if (this.P() == 0) {
            return 0;
        }
        return r.a(b8, this.u, this.j2(this.N ^ true), this.i2(this.N ^ true), this, this.N);
    }

    private int a2(RecyclerView.B b8) {
        if (this.P() == 0) {
            return 0;
        }
        return r.b(b8, this.u, this.j2(this.N ^ true), this.i2(this.N ^ true), this, this.N, this.A);
    }

    private int b2(RecyclerView.B b8) {
        if (this.P() == 0) {
            return 0;
        }
        return r.c(b8, this.u, this.j2(this.N ^ true), this.i2(this.N ^ true), this, this.N);
    }

    private int c2(int n8) {
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 17) {
                    if (n8 != 33) {
                        if (n8 != 66) {
                            if (n8 != 130) {
                                return Integer.MIN_VALUE;
                            }
                            if (this.w == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        }
                        if (this.w == 0) {
                            return 1;
                        }
                        return Integer.MIN_VALUE;
                    }
                    if (this.w == 1) {
                        return -1;
                    }
                    return Integer.MIN_VALUE;
                }
                if (this.w == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            }
            if (this.w == 1) {
                return 1;
            }
            if (this.y2()) {
                return -1;
            }
            return 1;
        }
        if (this.w == 1) {
            return -1;
        }
        if (this.y2()) {
            return 1;
        }
        return -1;
    }

    private d.a d2(int n8) {
        d.a a8 = new d.a();
        a8.d0 = new int[this.s];
        for (int i8 = 0; i8 < this.s; ++i8) {
            a8.d0[i8] = n8 - this.t[i8].l(n8);
        }
        return a8;
    }

    private d.a e2(int n8) {
        d.a a8 = new d.a();
        a8.d0 = new int[this.s];
        for (int i8 = 0; i8 < this.s; ++i8) {
            a8.d0[i8] = this.t[i8].p(n8) - n8;
        }
        return a8;
    }

    private void f2() {
        this.u = o.b(this, this.w);
        this.v = o.b(this, 1 - this.w);
    }

    /*
     * Enabled aggressive block sorting
     */
    private int g2(RecyclerView.w w8, k k8, RecyclerView.B b8) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        staggeredGridLayoutManager.B.set(0, staggeredGridLayoutManager.s, true);
        int n8 = staggeredGridLayoutManager.y.i ? (k8.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE) : (k8.e == 1 ? k8.g + k8.b : k8.f - k8.b);
        staggeredGridLayoutManager.P2(k8.e, n8);
        int n9 = staggeredGridLayoutManager.A ? staggeredGridLayoutManager.u.i() : staggeredGridLayoutManager.u.m();
        int n10 = 0;
        while (k8.a(b8) && (staggeredGridLayoutManager.y.i || !staggeredGridLayoutManager.B.isEmpty())) {
            d.a a8;
            int n11;
            int n12;
            f f8;
            int n13;
            int n14;
            c c8;
            View view;
            block28: {
                int n15;
                block27: {
                    view = k8.b(w8);
                    c8 = (c)view.getLayoutParams();
                    n14 = c8.a();
                    n10 = staggeredGridLayoutManager.E.g(n14);
                    n13 = n10 == -1 ? 1 : 0;
                    if (n13 != 0) {
                        f8 = c8.f ? staggeredGridLayoutManager.t[0] : staggeredGridLayoutManager.u2(k8);
                        staggeredGridLayoutManager.E.n(n14, f8);
                    } else {
                        f8 = staggeredGridLayoutManager.t[n10];
                    }
                    c8.e = f8;
                    if (k8.e == 1) {
                        staggeredGridLayoutManager.j(view);
                    } else {
                        staggeredGridLayoutManager.k(view, 0);
                    }
                    staggeredGridLayoutManager.A2(view, c8, false);
                    if (k8.e != 1) break block27;
                    n10 = c8.f ? staggeredGridLayoutManager.q2(n9) : f8.l(n9);
                    n15 = staggeredGridLayoutManager.u.e(view) + n10;
                    n12 = n10;
                    n11 = n15;
                    if (n13 != 0) {
                        n12 = n10;
                        n11 = n15;
                        if (c8.f) {
                            a8 = staggeredGridLayoutManager.d2(n10);
                            a8.c0 = -1;
                            a8.q = n14;
                            staggeredGridLayoutManager.E.a(a8);
                            n12 = n10;
                            n11 = n15;
                        }
                    }
                    break block28;
                }
                n10 = c8.f ? staggeredGridLayoutManager.t2(n9) : f8.p(n9);
                n12 = n15 = n10 - staggeredGridLayoutManager.u.e(view);
                n11 = n10;
                if (n13 != 0) {
                    n12 = n15;
                    n11 = n10;
                    if (c8.f) {
                        a8 = staggeredGridLayoutManager.e2(n10);
                        a8.c0 = 1;
                        a8.q = n14;
                        staggeredGridLayoutManager.E.a(a8);
                        n11 = n10;
                        n12 = n15;
                    }
                }
            }
            if (c8.f && k8.d == -1) {
                if (n13 != 0) {
                    staggeredGridLayoutManager.M = true;
                } else {
                    boolean bl = k8.e == 1 ? staggeredGridLayoutManager.T1() : staggeredGridLayoutManager.U1();
                    if (bl ^ true) {
                        a8 = staggeredGridLayoutManager.E.f(n14);
                        if (a8 != null) {
                            a8.e0 = true;
                        }
                        staggeredGridLayoutManager.M = true;
                    }
                }
            }
            staggeredGridLayoutManager.V1(view, c8, k8);
            if (staggeredGridLayoutManager.y2() && staggeredGridLayoutManager.w == 1) {
                n10 = c8.f ? staggeredGridLayoutManager.v.i() : staggeredGridLayoutManager.v.i() - (staggeredGridLayoutManager.s - 1 - f8.e) * staggeredGridLayoutManager.x;
                n13 = n10 - staggeredGridLayoutManager.v.e(view);
            } else {
                n10 = c8.f ? staggeredGridLayoutManager.v.m() : f8.e * staggeredGridLayoutManager.x + staggeredGridLayoutManager.v.m();
                n13 = n10;
                n10 = staggeredGridLayoutManager.v.e(view) + n13;
            }
            if (staggeredGridLayoutManager.w == 1) {
                staggeredGridLayoutManager.E0(view, n13, n12, n10, n11);
                staggeredGridLayoutManager = this;
            } else {
                staggeredGridLayoutManager.E0(view, n12, n13, n11, n10);
            }
            if (c8.f) {
                staggeredGridLayoutManager.P2(staggeredGridLayoutManager.y.e, n8);
            } else {
                staggeredGridLayoutManager.V2(f8, staggeredGridLayoutManager.y.e, n8);
            }
            staggeredGridLayoutManager.F2(w8, staggeredGridLayoutManager.y);
            if (staggeredGridLayoutManager.y.h && view.hasFocusable()) {
                if (c8.f) {
                    staggeredGridLayoutManager.B.clear();
                } else {
                    staggeredGridLayoutManager.B.set(f8.e, false);
                }
            }
            n10 = 1;
        }
        if (n10 == 0) {
            staggeredGridLayoutManager.F2(w8, staggeredGridLayoutManager.y);
        }
        if (staggeredGridLayoutManager.y.e == -1) {
            n8 = staggeredGridLayoutManager.t2(staggeredGridLayoutManager.u.m());
            n8 = staggeredGridLayoutManager.u.m() - n8;
        } else {
            n8 = staggeredGridLayoutManager.q2(staggeredGridLayoutManager.u.i()) - staggeredGridLayoutManager.u.i();
        }
        if (n8 > 0) {
            return Math.min(k8.b, n8);
        }
        return 0;
    }

    private int h2(int n8) {
        int n9 = this.P();
        for (int i8 = 0; i8 < n9; ++i8) {
            int n10 = this.m0(this.O(i8));
            if (n10 < 0 || n10 >= n8) continue;
            return n10;
        }
        return 0;
    }

    private int l2(int n8) {
        for (int i8 = this.P() - 1; i8 >= 0; --i8) {
            int n9 = this.m0(this.O(i8));
            if (n9 < 0 || n9 >= n8) continue;
            return n9;
        }
        return 0;
    }

    private void m2(RecyclerView.w w8, RecyclerView.B b8, boolean bl) {
        int n8 = this.q2(Integer.MIN_VALUE);
        if (n8 != Integer.MIN_VALUE && (n8 = this.u.i() - n8) > 0) {
            n8 -= -this.K2(-n8, w8, b8);
            if (bl && n8 > 0) {
                this.u.r(n8);
            }
        }
    }

    private void n2(RecyclerView.w w8, RecyclerView.B b8, boolean bl) {
        int n8 = this.t2(Integer.MAX_VALUE);
        if (n8 != Integer.MAX_VALUE && (n8 -= this.u.m()) > 0) {
            n8 -= this.K2(n8, w8, b8);
            if (bl && n8 > 0) {
                this.u.r(-n8);
            }
        }
    }

    private int q2(int n8) {
        int n9 = this.t[0].l(n8);
        for (int i8 = 1; i8 < this.s; ++i8) {
            int n10 = this.t[i8].l(n8);
            int n11 = n9;
            if (n10 > n9) {
                n11 = n10;
            }
            n9 = n11;
        }
        return n9;
    }

    private int r2(int n8) {
        int n9 = this.t[0].p(n8);
        for (int i8 = 1; i8 < this.s; ++i8) {
            int n10 = this.t[i8].p(n8);
            int n11 = n9;
            if (n10 > n9) {
                n11 = n10;
            }
            n9 = n11;
        }
        return n9;
    }

    private int s2(int n8) {
        int n9 = this.t[0].l(n8);
        for (int i8 = 1; i8 < this.s; ++i8) {
            int n10 = this.t[i8].l(n8);
            int n11 = n9;
            if (n10 < n9) {
                n11 = n10;
            }
            n9 = n11;
        }
        return n9;
    }

    private int t2(int n8) {
        int n9 = this.t[0].p(n8);
        for (int i8 = 1; i8 < this.s; ++i8) {
            int n10 = this.t[i8].p(n8);
            int n11 = n9;
            if (n10 < n9) {
                n11 = n10;
            }
            n9 = n11;
        }
        return n9;
    }

    private f u2(k object) {
        int n8;
        int n9;
        int n10;
        if (this.C2(((k)object).e)) {
            n10 = this.s - 1;
            n9 = -1;
            n8 = -1;
        } else {
            n9 = this.s;
            n10 = 0;
            n8 = 1;
        }
        int n11 = ((k)object).e;
        object = null;
        f f8 = null;
        if (n11 == 1) {
            int n12 = this.u.m();
            int n13 = Integer.MAX_VALUE;
            object = f8;
            for (n11 = n10; n11 != n9; n11 += n8) {
                f8 = this.t[n11];
                int n14 = f8.l(n12);
                n10 = n13;
                if (n14 < n13) {
                    object = f8;
                    n10 = n14;
                }
                n13 = n10;
            }
            return object;
        }
        int n15 = this.u.i();
        n11 = Integer.MIN_VALUE;
        for (int i8 = n10; i8 != n9; i8 += n8) {
            f8 = this.t[i8];
            int n16 = f8.p(n15);
            n10 = n11;
            if (n16 > n11) {
                object = f8;
                n10 = n16;
            }
            n11 = n10;
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void v2(int n8, int n9, int n10) {
        int n11;
        int n12;
        int n13;
        block9: {
            block8: {
                block7: {
                    block6: {
                        block4: {
                            block5: {
                                n13 = this.A ? this.p2() : this.o2();
                                if (n10 != 8) break block4;
                                if (n8 >= n9) break block5;
                                n12 = n9 + 1;
                                break block6;
                            }
                            n11 = n8 + 1;
                            n12 = n9;
                            break block7;
                        }
                        n12 = n8 + n9;
                    }
                    int n14 = n8;
                    n11 = n12;
                    n12 = n14;
                }
                this.E.h(n12);
                if (n10 == 1) break block8;
                if (n10 != 2) {
                    if (n10 == 8) {
                        this.E.k(n8, 1);
                        this.E.j(n9, 1);
                    }
                    break block9;
                } else {
                    this.E.k(n8, n9);
                }
                break block9;
            }
            this.E.j(n8, n9);
        }
        if (n11 <= n13) {
            return;
        }
        n8 = this.A ? this.o2() : this.p2();
        if (n12 > n8) return;
        this.y1();
    }

    private void z2(View view, int n8, int n9, boolean bl) {
        this.p(view, this.K);
        c c8 = (c)view.getLayoutParams();
        int n10 = c8.leftMargin;
        Rect rect = this.K;
        n8 = this.W2(n8, n10 + rect.left, c8.rightMargin + rect.right);
        n10 = c8.topMargin;
        rect = this.K;
        n9 = this.W2(n9, n10 + rect.top, c8.bottomMargin + rect.bottom);
        bl = bl ? this.M1(view, n8, n9, c8) : this.K1(view, n8, n9, c8);
        if (bl) {
            view.measure(n8, n9);
        }
    }

    @Override
    public int A(RecyclerView.B b8) {
        return this.a2(b8);
    }

    @Override
    public int B(RecyclerView.B b8) {
        return this.b2(b8);
    }

    @Override
    public int B1(int n8, RecyclerView.w w8, RecyclerView.B b8) {
        return this.K2(n8, w8, b8);
    }

    @Override
    public void C1(int n8) {
        e e8 = this.I;
        if (e8 != null && e8.q != n8) {
            e8.a();
        }
        this.C = n8;
        this.D = Integer.MIN_VALUE;
        this.y1();
    }

    @Override
    public int D1(int n8, RecyclerView.w w8, RecyclerView.B b8) {
        return this.K2(n8, w8, b8);
    }

    void D2(int n8, RecyclerView.B object) {
        int n9;
        int n10;
        if (n8 > 0) {
            n10 = this.p2();
            n9 = 1;
        } else {
            n10 = this.o2();
            n9 = -1;
        }
        this.y.a = true;
        this.T2(n10, (RecyclerView.B)object);
        this.L2(n9);
        object = this.y;
        ((k)object).c = n10 + ((k)object).d;
        ((k)object).b = Math.abs(n8);
    }

    @Override
    public void H0(int n8) {
        super.H0(n8);
        for (int i8 = 0; i8 < this.s; ++i8) {
            this.t[i8].r(n8);
        }
    }

    @Override
    public void H1(Rect rect, int n8, int n9) {
        int n10 = this.j0() + this.k0();
        int n11 = this.l0() + this.i0();
        if (this.w == 1) {
            n9 = RecyclerView.p.t(n9, rect.height() + n11, this.g0());
            n11 = RecyclerView.p.t(n8, this.x * this.s + n10, this.h0());
            n8 = n9;
            n9 = n11;
        } else {
            n8 = RecyclerView.p.t(n8, rect.width() + n10, this.h0());
            n11 = RecyclerView.p.t(n9, this.x * this.s + n11, this.g0());
            n9 = n8;
            n8 = n11;
        }
        this.G1(n9, n8);
    }

    @Override
    public void I0(int n8) {
        super.I0(n8);
        for (int i8 = 0; i8 < this.s; ++i8) {
            this.t[i8].r(n8);
        }
    }

    @Override
    public RecyclerView.q J() {
        if (this.w == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    @Override
    public void J0(RecyclerView.h h8, RecyclerView.h h9) {
        this.E.b();
        for (int i8 = 0; i8 < this.s; ++i8) {
            this.t[i8].e();
        }
    }

    @Override
    public RecyclerView.q K(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    int K2(int n8, RecyclerView.w w8, RecyclerView.B object) {
        if (this.P() != 0 && n8 != 0) {
            this.D2(n8, (RecyclerView.B)object);
            int n9 = this.g2(w8, this.y, (RecyclerView.B)object);
            if (this.y.b >= n9) {
                n8 = n8 < 0 ? -n9 : n9;
            }
            this.u.r(-n8);
            this.G = this.A;
            object = this.y;
            ((k)object).b = 0;
            this.F2(w8, (k)object);
            return n8;
        }
        return 0;
    }

    @Override
    public RecyclerView.q L(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams)layoutParams);
        }
        return new c(layoutParams);
    }

    public void M2(int n8) {
        if (n8 != 0 && n8 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        this.m(null);
        if (n8 == this.w) {
            return;
        }
        this.w = n8;
        o o8 = this.u;
        this.u = this.v;
        this.v = o8;
        this.y1();
    }

    @Override
    public void N0(RecyclerView recyclerView, RecyclerView.w w8) {
        super.N0(recyclerView, w8);
        this.t1(this.P);
        for (int i8 = 0; i8 < this.s; ++i8) {
            this.t[i8].e();
        }
        recyclerView.requestLayout();
    }

    @Override
    public void N1(RecyclerView object, RecyclerView.B b8, int n8) {
        object = new l(object.getContext());
        ((RecyclerView.A)object).p(n8);
        this.O1((RecyclerView.A)object);
    }

    public void N2(boolean bl) {
        this.m(null);
        e e8 = this.I;
        if (e8 != null && e8.i0 != bl) {
            e8.i0 = bl;
        }
        this.z = bl;
        this.y1();
    }

    @Override
    public View O0(View view, int n8, RecyclerView.w w8, RecyclerView.B b8) {
        int n9;
        if (this.P() == 0) {
            return null;
        }
        if ((view = this.H(view)) == null) {
            return null;
        }
        this.J2();
        int n10 = this.c2(n8);
        if (n10 == Integer.MIN_VALUE) {
            return null;
        }
        Object object = (c)view.getLayoutParams();
        boolean bl = ((c)((Object)object)).f;
        object = ((c)((Object)object)).e;
        n8 = n10 == 1 ? this.p2() : this.o2();
        this.T2(n8, b8);
        this.L2(n10);
        k k8 = this.y;
        k8.c = k8.d + n8;
        k8.b = (int)((float)this.u.n() * 0.33333334f);
        k8 = this.y;
        k8.h = true;
        int n11 = 0;
        k8.a = false;
        this.g2(w8, k8, b8);
        this.G = this.A;
        if (!bl && (w8 = ((f)object).m(n8, n10)) != null && w8 != view) {
            return w8;
        }
        if (this.C2(n10)) {
            for (n9 = this.s - 1; n9 >= 0; --n9) {
                w8 = this.t[n9].m(n8, n10);
                if (w8 == null || w8 == view) continue;
                return w8;
            }
        } else {
            for (n9 = 0; n9 < this.s; ++n9) {
                w8 = this.t[n9].m(n8, n10);
                if (w8 == null || w8 == view) continue;
                return w8;
            }
        }
        int n12 = this.z;
        n8 = n10 == -1 ? 1 : 0;
        n8 = (n12 ^ 1) == n8 ? 1 : 0;
        if (!bl && (w8 = this.I(n9 = n8 != 0 ? ((f)object).f() : ((f)object).g())) != null && w8 != view) {
            return w8;
        }
        if (this.C2(n10)) {
            for (n9 = this.s - 1; n9 >= 0; --n9) {
                if (n9 == ((f)object).e || (w8 = this.I(n11 = n8 != 0 ? this.t[n9].f() : this.t[n9].g())) == null || w8 == view) continue;
                return w8;
            }
        } else {
            for (n9 = n11; n9 < this.s; ++n9) {
                n11 = n8 != 0 ? this.t[n9].f() : this.t[n9].g();
                w8 = this.I(n11);
                if (w8 == null || w8 == view) continue;
                return w8;
            }
        }
        return null;
    }

    public void O2(int n8) {
        this.m(null);
        if (n8 != this.s) {
            this.x2();
            this.s = n8;
            this.B = new BitSet(this.s);
            this.t = new f[this.s];
            for (n8 = 0; n8 < this.s; ++n8) {
                this.t[n8] = new f(this, n8);
            }
            this.y1();
        }
    }

    @Override
    public void P0(AccessibilityEvent accessibilityEvent) {
        super.P0(accessibilityEvent);
        if (this.P() > 0) {
            View view = this.j2(false);
            View view2 = this.i2(false);
            if (view != null && view2 != null) {
                int n8;
                int n9 = this.m0(view);
                if (n9 < (n8 = this.m0(view2))) {
                    accessibilityEvent.setFromIndex(n9);
                    accessibilityEvent.setToIndex(n8);
                    return;
                }
                accessibilityEvent.setFromIndex(n8);
                accessibilityEvent.setToIndex(n9);
            }
        }
    }

    @Override
    public boolean Q1() {
        return this.I == null;
    }

    boolean R2(RecyclerView.B object, b b8) {
        int n8;
        boolean bl = ((RecyclerView.B)object).e();
        boolean bl2 = false;
        if (!bl && (n8 = this.C) != -1) {
            if (n8 >= 0 && n8 < ((RecyclerView.B)object).b()) {
                object = this.I;
                if (object != null && ((e)object).q != -1 && ((e)object).d0 >= 1) {
                    b8.b = Integer.MIN_VALUE;
                    b8.a = this.C;
                } else {
                    object = this.I(this.C);
                    if (object != null) {
                        n8 = this.A ? this.p2() : this.o2();
                        b8.a = n8;
                        if (this.D != Integer.MIN_VALUE) {
                            b8.b = b8.c ? this.u.i() - this.D - this.u.d((View)object) : this.u.m() + this.D - this.u.g((View)object);
                            return true;
                        }
                        if (this.u.e((View)object) > this.u.n()) {
                            n8 = b8.c ? this.u.i() : this.u.m();
                            b8.b = n8;
                            return true;
                        }
                        n8 = this.u.g((View)object) - this.u.m();
                        if (n8 < 0) {
                            b8.b = -n8;
                            return true;
                        }
                        n8 = this.u.i() - this.u.d((View)object);
                        if (n8 < 0) {
                            b8.b = n8;
                            return true;
                        }
                        b8.b = Integer.MIN_VALUE;
                    } else {
                        int n9;
                        b8.a = n9 = this.C;
                        n8 = this.D;
                        if (n8 == Integer.MIN_VALUE) {
                            if (this.W1(n9) == 1) {
                                bl2 = true;
                            }
                            b8.c = bl2;
                            b8.a();
                        } else {
                            b8.b(n8);
                        }
                        b8.d = true;
                    }
                }
                return true;
            }
            this.C = -1;
            this.D = Integer.MIN_VALUE;
        }
        return false;
    }

    void S2(RecyclerView.B b8, b b9) {
        if (this.R2(b8, b9) || this.Q2(b8, b9)) {
            return;
        }
        b9.a();
        b9.a = 0;
    }

    boolean T1() {
        int n8 = this.t[0].l(Integer.MIN_VALUE);
        for (int i8 = 1; i8 < this.s; ++i8) {
            if (this.t[i8].l(Integer.MIN_VALUE) == n8) continue;
            return false;
        }
        return true;
    }

    boolean U1() {
        int n8 = this.t[0].p(Integer.MIN_VALUE);
        for (int i8 = 1; i8 < this.s; ++i8) {
            if (this.t[i8].p(Integer.MIN_VALUE) == n8) continue;
            return false;
        }
        return true;
    }

    void U2(int n8) {
        this.x = n8 / this.s;
        this.J = View.MeasureSpec.makeMeasureSpec((int)n8, (int)this.v.k());
    }

    @Override
    public void W0(RecyclerView recyclerView, int n8, int n9) {
        this.v2(n8, n9, 1);
    }

    @Override
    public void X0(RecyclerView recyclerView) {
        this.E.b();
        this.y1();
    }

    boolean X1() {
        if (this.P() != 0 && this.F != 0 && this.w0()) {
            d.a a8;
            int n8;
            int n9;
            if (this.A) {
                n9 = this.p2();
                n8 = this.o2();
            } else {
                n9 = this.o2();
                n8 = this.p2();
            }
            if (n9 == 0 && this.w2() != null) {
                this.E.b();
                this.z1();
                this.y1();
                return true;
            }
            if (!this.M) {
                return false;
            }
            Object object = this.E;
            int n10 = this.A ? -1 : 1;
            if ((a8 = ((d)object).e(n9, ++n8, n10, true)) == null) {
                this.M = false;
                this.E.d(n8);
                return false;
            }
            object = this.E.e(n9, a8.q, n10 * -1, true);
            if (object == null) {
                this.E.d(a8.q);
            } else {
                this.E.d(((d.a)object).q + 1);
            }
            this.z1();
            this.y1();
            return true;
        }
        return false;
    }

    @Override
    public void Y0(RecyclerView recyclerView, int n8, int n9, int n10) {
        this.v2(n8, n9, 8);
    }

    @Override
    public void Z0(RecyclerView recyclerView, int n8, int n9) {
        this.v2(n8, n9, 2);
    }

    @Override
    public void b1(RecyclerView recyclerView, int n8, int n9, Object object) {
        this.v2(n8, n9, 4);
    }

    @Override
    public PointF c(int n8) {
        n8 = this.W1(n8);
        PointF pointF = new PointF();
        if (n8 == 0) {
            return null;
        }
        if (this.w == 0) {
            pointF.x = n8;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = n8;
        return pointF;
    }

    @Override
    public void c1(RecyclerView.w w8, RecyclerView.B b8) {
        this.B2(w8, b8, true);
    }

    @Override
    public void d1(RecyclerView.B b8) {
        super.d1(b8);
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.I = null;
        this.L.c();
    }

    @Override
    public void h1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            parcelable = (e)parcelable;
            this.I = parcelable;
            if (this.C != -1) {
                parcelable.a();
                this.I.b();
            }
            this.y1();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public Parcelable i1() {
        int[] nArray;
        if (this.I != null) {
            return new e(this.I);
        }
        e e8 = new e();
        e8.i0 = this.z;
        e8.j0 = this.G;
        e8.k0 = this.H;
        d d8 = this.E;
        int n8 = 0;
        if (d8 != null && (nArray = d8.a) != null) {
            e8.g0 = nArray;
            e8.f0 = nArray.length;
            e8.h0 = d8.b;
        } else {
            e8.f0 = 0;
        }
        if (this.P() <= 0) {
            e8.q = -1;
            e8.c0 = -1;
            e8.d0 = 0;
            return e8;
        }
        int n9 = this.G ? this.p2() : this.o2();
        e8.q = n9;
        e8.c0 = this.k2();
        e8.d0 = n9 = this.s;
        e8.e0 = new int[n9];
        while (true) {
            block10: {
                int n10;
                block11: {
                    block9: {
                        if (n8 >= this.s) {
                            return e8;
                        }
                        if (!this.G) break block9;
                        n9 = n10 = this.t[n8].l(Integer.MIN_VALUE);
                        if (n10 == Integer.MIN_VALUE) break block10;
                        n9 = this.u.i();
                        break block11;
                    }
                    n9 = n10 = this.t[n8].p(Integer.MIN_VALUE);
                    if (n10 == Integer.MIN_VALUE) break block10;
                    n9 = this.u.m();
                }
                n9 = n10 - n9;
            }
            e8.e0[n8] = n9;
            ++n8;
        }
    }

    View i2(boolean bl) {
        int n8 = this.u.m();
        int n9 = this.u.i();
        View view = null;
        for (int i8 = this.P() - 1; i8 >= 0; --i8) {
            View view2 = this.O(i8);
            int n10 = this.u.g(view2);
            int n11 = this.u.d(view2);
            View view3 = view;
            if (n11 > n8) {
                if (n10 >= n9) {
                    view3 = view;
                } else if (n11 > n9 && bl) {
                    view3 = view;
                    if (view == null) {
                        view3 = view2;
                    }
                } else {
                    return view2;
                }
            }
            view = view3;
        }
        return view;
    }

    @Override
    public void j1(int n8) {
        if (n8 == 0) {
            this.X1();
        }
    }

    View j2(boolean bl) {
        int n8 = this.u.m();
        int n9 = this.u.i();
        int n10 = this.P();
        View view = null;
        for (int i8 = 0; i8 < n10; ++i8) {
            View view2 = this.O(i8);
            int n11 = this.u.g(view2);
            View view3 = view;
            if (this.u.d(view2) > n8) {
                if (n11 >= n9) {
                    view3 = view;
                } else if (n11 < n8 && bl) {
                    view3 = view;
                    if (view == null) {
                        view3 = view2;
                    }
                } else {
                    return view2;
                }
            }
            view = view3;
        }
        return view;
    }

    int k2() {
        View view = this.A ? this.i2(true) : this.j2(true);
        if (view == null) {
            return -1;
        }
        return this.m0(view);
    }

    @Override
    public void m(String string) {
        if (this.I == null) {
            super.m(string);
        }
    }

    int o2() {
        if (this.P() == 0) {
            return 0;
        }
        return this.m0(this.O(0));
    }

    int p2() {
        int n8 = this.P();
        if (n8 == 0) {
            return 0;
        }
        return this.m0(this.O(n8 - 1));
    }

    @Override
    public boolean q() {
        return this.w == 0;
    }

    @Override
    public boolean r() {
        return this.w == 1;
    }

    @Override
    public boolean s(RecyclerView.q q8) {
        return q8 instanceof c;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void u(int n8, int n9, RecyclerView.B b8, RecyclerView.p.c c8) {
        if (this.w != 0) {
            n8 = n9;
        }
        if (this.P() == 0) return;
        if (n8 == 0) {
            return;
        }
        this.D2(n8, b8);
        int[] nArray = this.O;
        if (nArray == null || nArray.length < this.s) {
            this.O = new int[this.s];
        }
        int n10 = 0;
        n8 = 0;
        for (n9 = 0; n9 < this.s; ++n9) {
            int n11;
            int n12;
            k k8 = this.y;
            if (k8.d == -1) {
                n12 = k8.f;
                n11 = this.t[n9].p(n12);
            } else {
                n12 = this.t[n9].l(k8.g);
                n11 = this.y.g;
            }
            n11 = n12 - n11;
            n12 = n8;
            if (n11 >= 0) {
                this.O[n8] = n11;
                n12 = n8 + 1;
            }
            n8 = n12;
        }
        Arrays.sort(this.O, 0, n8);
        n9 = n10;
        while (n9 < n8) {
            if (!this.y.a(b8)) return;
            c8.a(this.y.c, this.O[n9]);
            k k9 = this.y;
            k9.c += k9.d;
            ++n9;
        }
    }

    @Override
    public int w(RecyclerView.B b8) {
        return this.Z1(b8);
    }

    View w2() {
        int n8 = this.P();
        int n9 = n8 - 1;
        BitSet bitSet = new BitSet(this.s);
        bitSet.set(0, this.s, true);
        int n10 = this.w;
        int n11 = -1;
        n10 = n10 == 1 && this.y2() ? 1 : -1;
        if (this.A) {
            n8 = -1;
        } else {
            n9 = 0;
        }
        int n12 = n9;
        if (n9 < n8) {
            n11 = 1;
            n12 = n9;
        }
        while (n12 != n8) {
            block9: {
                View view;
                block8: {
                    int n13;
                    Object object;
                    c c8;
                    block11: {
                        block10: {
                            block7: {
                                view = this.O(n12);
                                c8 = (c)view.getLayoutParams();
                                if (!bitSet.get(c8.e.e)) break block7;
                                if (this.Y1(c8.e)) break block8;
                                bitSet.clear(c8.e.e);
                            }
                            if (c8.f || (n9 = n12 + n11) == n8) break block9;
                            object = this.O(n9);
                            if (!this.A) break block10;
                            n13 = this.u.d(view);
                            if (n13 < (n9 = this.u.d((View)object))) break block8;
                            if (n13 != n9) break block9;
                            break block11;
                        }
                        n13 = this.u.g(view);
                        if (n13 > (n9 = this.u.g((View)object))) break block8;
                        if (n13 != n9) break block9;
                    }
                    object = (c)object.getLayoutParams();
                    n9 = c8.e.e - object.e.e < 0 ? 1 : 0;
                    n13 = n10 < 0 ? 1 : 0;
                    if (n9 == n13) break block9;
                }
                return view;
            }
            n12 += n11;
        }
        return null;
    }

    @Override
    public int x(RecyclerView.B b8) {
        return this.a2(b8);
    }

    @Override
    public boolean x0() {
        return this.F != 0;
    }

    public void x2() {
        this.E.b();
        this.y1();
    }

    @Override
    public int y(RecyclerView.B b8) {
        return this.b2(b8);
    }

    boolean y2() {
        return this.e0() == 1;
    }

    @Override
    public int z(RecyclerView.B b8) {
        return this.Z1(b8);
    }

    class b {
        int a;
        int b;
        boolean c;
        boolean d;
        boolean e;
        int[] f;
        final StaggeredGridLayoutManager g;

        b(StaggeredGridLayoutManager staggeredGridLayoutManager) {
            this.g = staggeredGridLayoutManager;
            this.c();
        }

        void a() {
            int n8 = this.c ? this.g.u.i() : this.g.u.m();
            this.b = n8;
        }

        void b(int n8) {
            if (this.c) {
                this.b = this.g.u.i() - n8;
                return;
            }
            this.b = this.g.u.m() + n8;
        }

        void c() {
            this.a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] nArray = this.f;
            if (nArray != null) {
                Arrays.fill(nArray, -1);
            }
        }

        void d(f[] fArray) {
            int n8 = fArray.length;
            int[] nArray = this.f;
            if (nArray == null || nArray.length < n8) {
                this.f = new int[this.g.t.length];
            }
            for (int i8 = 0; i8 < n8; ++i8) {
                this.f[i8] = fArray[i8].p(Integer.MIN_VALUE);
            }
        }
    }

    public static class c
    extends RecyclerView.q {
        f e;
        boolean f;

        public c(int n8, int n9) {
            super(n8, n9);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public boolean e() {
            return this.f;
        }
    }

    static class d {
        int[] a;
        List<a> b;

        d() {
        }

        private int i(int n8) {
            int n9;
            a a8;
            block5: {
                if (this.b == null) {
                    return -1;
                }
                a8 = this.f(n8);
                if (a8 != null) {
                    this.b.remove(a8);
                }
                int n10 = this.b.size();
                for (n9 = 0; n9 < n10; ++n9) {
                    if (this.b.get((int)n9).q < n8) {
                        continue;
                    }
                    break block5;
                }
                n9 = -1;
            }
            if (n9 != -1) {
                a8 = this.b.get(n9);
                this.b.remove(n9);
                return a8.q;
            }
            return -1;
        }

        private void l(int n8, int n9) {
            List<a> list = this.b;
            if (list != null) {
                for (int i8 = list.size() - 1; i8 >= 0; --i8) {
                    list = this.b.get(i8);
                    int n10 = ((a)((Object)list)).q;
                    if (n10 < n8) continue;
                    ((a)((Object)list)).q = n10 + n9;
                }
            }
        }

        private void m(int n8, int n9) {
            List<a> list = this.b;
            if (list != null) {
                for (int i8 = list.size() - 1; i8 >= 0; --i8) {
                    list = this.b.get(i8);
                    int n10 = ((a)((Object)list)).q;
                    if (n10 < n8) continue;
                    if (n10 < n8 + n9) {
                        this.b.remove(i8);
                        continue;
                    }
                    ((a)((Object)list)).q = n10 - n9;
                }
            }
        }

        public void a(a a8) {
            if (this.b == null) {
                this.b = new ArrayList<a>();
            }
            int n8 = this.b.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                a a9 = this.b.get(i8);
                if (a9.q == a8.q) {
                    this.b.remove(i8);
                }
                if (a9.q < a8.q) continue;
                this.b.add(i8, a8);
                return;
            }
            this.b.add(a8);
        }

        void b() {
            int[] nArray = this.a;
            if (nArray != null) {
                Arrays.fill(nArray, -1);
            }
            this.b = null;
        }

        void c(int n8) {
            int[] nArray = this.a;
            if (nArray == null) {
                this.a = nArray = new int[Math.max(n8, 10) + 1];
                Arrays.fill(nArray, -1);
                return;
            }
            if (n8 >= nArray.length) {
                int[] nArray2 = new int[this.o(n8)];
                this.a = nArray2;
                System.arraycopy(nArray, 0, nArray2, 0, nArray.length);
                nArray2 = this.a;
                Arrays.fill(nArray2, nArray.length, nArray2.length, -1);
            }
        }

        int d(int n8) {
            List<a> list = this.b;
            if (list != null) {
                for (int i8 = list.size() - 1; i8 >= 0; --i8) {
                    if (this.b.get((int)i8).q < n8) continue;
                    this.b.remove(i8);
                }
            }
            return this.h(n8);
        }

        public a e(int n8, int n9, int n10, boolean bl) {
            List<a> list = this.b;
            if (list == null) {
                return null;
            }
            int n11 = list.size();
            for (int i8 = 0; i8 < n11; ++i8) {
                list = this.b.get(i8);
                int n12 = ((a)((Object)list)).q;
                if (n12 >= n9) {
                    return null;
                }
                if (n12 < n8 || n10 != 0 && ((a)((Object)list)).c0 != n10 && (!bl || !((a)((Object)list)).e0)) continue;
                return list;
            }
            return null;
        }

        public a f(int n8) {
            List<a> list = this.b;
            if (list == null) {
                return null;
            }
            for (int i8 = list.size() - 1; i8 >= 0; --i8) {
                list = this.b.get(i8);
                if (((a)((Object)list)).q != n8) continue;
                return list;
            }
            return null;
        }

        int g(int n8) {
            int[] nArray = this.a;
            if (nArray != null && n8 < nArray.length) {
                return nArray[n8];
            }
            return -1;
        }

        int h(int n8) {
            int[] nArray = this.a;
            if (nArray == null) {
                return -1;
            }
            if (n8 >= nArray.length) {
                return -1;
            }
            int n9 = this.i(n8);
            if (n9 == -1) {
                nArray = this.a;
                Arrays.fill(nArray, n8, nArray.length, -1);
                return this.a.length;
            }
            n9 = Math.min(n9 + 1, this.a.length);
            Arrays.fill(this.a, n8, n9, -1);
            return n9;
        }

        void j(int n8, int n9) {
            int[] nArray = this.a;
            if (nArray != null && n8 < nArray.length) {
                int n10 = n8 + n9;
                this.c(n10);
                nArray = this.a;
                System.arraycopy(nArray, n8, nArray, n10, nArray.length - n8 - n9);
                Arrays.fill(this.a, n8, n10, -1);
                this.l(n8, n9);
            }
        }

        void k(int n8, int n9) {
            int[] nArray = this.a;
            if (nArray != null && n8 < nArray.length) {
                int n10 = n8 + n9;
                this.c(n10);
                nArray = this.a;
                System.arraycopy(nArray, n10, nArray, n8, nArray.length - n8 - n9);
                nArray = this.a;
                Arrays.fill(nArray, nArray.length - n9, nArray.length, -1);
                this.m(n8, n9);
            }
        }

        void n(int n8, f f8) {
            this.c(n8);
            this.a[n8] = f8.e;
        }

        int o(int n8) {
            int n9;
            for (n9 = this.a.length; n9 <= n8; n9 *= 2) {
            }
            return n9;
        }

        @SuppressLint(value={"BanParcelableUsage"})
        static class a
        implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>(){

                public a a(Parcel parcel) {
                    return new a(parcel);
                }

                public a[] b(int n8) {
                    return new a[n8];
                }
            };
            int c0;
            int[] d0;
            boolean e0;
            int q;

            a() {
            }

            a(Parcel parcel) {
                this.q = parcel.readInt();
                this.c0 = parcel.readInt();
                int n8 = parcel.readInt();
                boolean bl = true;
                if (n8 != 1) {
                    bl = false;
                }
                this.e0 = bl;
                n8 = parcel.readInt();
                if (n8 > 0) {
                    int[] nArray = new int[n8];
                    this.d0 = nArray;
                    parcel.readIntArray(nArray);
                }
            }

            int a(int n8) {
                int[] nArray = this.d0;
                if (nArray == null) {
                    return 0;
                }
                return nArray[n8];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("FullSpanItem{mPosition=");
                stringBuilder.append(this.q);
                stringBuilder.append(", mGapDir=");
                stringBuilder.append(this.c0);
                stringBuilder.append(", mHasUnwantedGapAfter=");
                stringBuilder.append(this.e0);
                stringBuilder.append(", mGapPerSpan=");
                stringBuilder.append(Arrays.toString(this.d0));
                stringBuilder.append('}');
                return stringBuilder.toString();
            }

            public void writeToParcel(Parcel parcel, int n8) {
                parcel.writeInt(this.q);
                parcel.writeInt(this.c0);
                parcel.writeInt(this.e0 ? 1 : 0);
                int[] nArray = this.d0;
                if (nArray != null && nArray.length > 0) {
                    parcel.writeInt(nArray.length);
                    parcel.writeIntArray(this.d0);
                    return;
                }
                parcel.writeInt(0);
            }
        }
    }

    @SuppressLint(value={"BanParcelableUsage"})
    public static class e
    implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator<e>(){

            public e a(Parcel parcel) {
                return new e(parcel);
            }

            public e[] b(int n8) {
                return new e[n8];
            }
        };
        int c0;
        int d0;
        int[] e0;
        int f0;
        int[] g0;
        List<d.a> h0;
        boolean i0;
        boolean j0;
        boolean k0;
        int q;

        public e() {
        }

        e(Parcel parcel) {
            int[] nArray;
            int n8;
            this.q = parcel.readInt();
            this.c0 = parcel.readInt();
            this.d0 = n8 = parcel.readInt();
            if (n8 > 0) {
                nArray = new int[n8];
                this.e0 = nArray;
                parcel.readIntArray(nArray);
            }
            this.f0 = n8 = parcel.readInt();
            if (n8 > 0) {
                nArray = new int[n8];
                this.g0 = nArray;
                parcel.readIntArray(nArray);
            }
            n8 = parcel.readInt();
            boolean bl = false;
            boolean bl2 = n8 == 1;
            this.i0 = bl2;
            bl2 = parcel.readInt() == 1;
            this.j0 = bl2;
            bl2 = bl;
            if (parcel.readInt() == 1) {
                bl2 = true;
            }
            this.k0 = bl2;
            this.h0 = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e e8) {
            this.d0 = e8.d0;
            this.q = e8.q;
            this.c0 = e8.c0;
            this.e0 = e8.e0;
            this.f0 = e8.f0;
            this.g0 = e8.g0;
            this.i0 = e8.i0;
            this.j0 = e8.j0;
            this.k0 = e8.k0;
            this.h0 = e8.h0;
        }

        void a() {
            this.e0 = null;
            this.d0 = 0;
            this.q = -1;
            this.c0 = -1;
        }

        void b() {
            this.e0 = null;
            this.d0 = 0;
            this.f0 = 0;
            this.g0 = null;
            this.h0 = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int n8) {
            parcel.writeInt(this.q);
            parcel.writeInt(this.c0);
            parcel.writeInt(this.d0);
            if (this.d0 > 0) {
                parcel.writeIntArray(this.e0);
            }
            parcel.writeInt(this.f0);
            if (this.f0 > 0) {
                parcel.writeIntArray(this.g0);
            }
            parcel.writeInt(this.i0 ? 1 : 0);
            parcel.writeInt(this.j0 ? 1 : 0);
            parcel.writeInt(this.k0 ? 1 : 0);
            parcel.writeList(this.h0);
        }
    }

    class f {
        ArrayList<View> a;
        int b;
        int c;
        int d;
        final int e;
        final StaggeredGridLayoutManager f;

        f(StaggeredGridLayoutManager staggeredGridLayoutManager, int n8) {
            this.f = staggeredGridLayoutManager;
            this.a = new ArrayList();
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
            this.d = 0;
            this.e = n8;
        }

        void a(View view) {
            c c8 = this.n(view);
            c8.e = this;
            this.a.add(view);
            this.c = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.b = Integer.MIN_VALUE;
            }
            if (!c8.c() && !c8.b()) {
                return;
            }
            this.d += this.f.u.e(view);
        }

        void b(boolean bl, int n8) {
            int n9 = bl ? this.l(Integer.MIN_VALUE) : this.p(Integer.MIN_VALUE);
            this.e();
            if (n9 == Integer.MIN_VALUE || bl && n9 < this.f.u.i() || !bl && n9 > this.f.u.m()) {
                return;
            }
            int n10 = n9;
            if (n8 != Integer.MIN_VALUE) {
                n10 = n9 + n8;
            }
            this.c = n10;
            this.b = n10;
        }

        void c() {
            Object object = this.a;
            View view = ((ArrayList)object).get(((ArrayList)object).size() - 1);
            object = this.n(view);
            this.c = this.f.u.d(view);
            if (((c)((Object)object)).f && (object = this.f.E.f(((RecyclerView.q)((Object)object)).a())) != null && ((d.a)object).c0 == 1) {
                this.c += ((d.a)object).a(this.e);
            }
        }

        void d() {
            Object object = this.a.get(0);
            c c8 = this.n((View)object);
            this.b = this.f.u.g((View)object);
            if (c8.f && (object = this.f.E.f(c8.a())) != null && ((d.a)object).c0 == -1) {
                this.b -= ((d.a)object).a(this.e);
            }
        }

        void e() {
            this.a.clear();
            this.q();
            this.d = 0;
        }

        public int f() {
            if (this.f.z) {
                return this.i(this.a.size() - 1, -1, true);
            }
            return this.i(0, this.a.size(), true);
        }

        public int g() {
            if (this.f.z) {
                return this.i(0, this.a.size(), true);
            }
            return this.i(this.a.size() - 1, -1, true);
        }

        /*
         * Enabled aggressive block sorting
         */
        int h(int n8, int n9, boolean bl, boolean bl2, boolean bl3) {
            int n10 = this.f.u.m();
            int n11 = this.f.u.i();
            int n12 = n9 > n8 ? 1 : -1;
            while (n8 != n9) {
                View view = this.a.get(n8);
                int n13 = this.f.u.g(view);
                int n14 = this.f.u.d(view);
                boolean bl4 = false;
                boolean bl5 = bl3 ? n13 <= n11 : n13 < n11;
                if (bl3 ? n14 >= n10 : n14 > n10) {
                    bl4 = true;
                }
                if (bl5 && bl4) {
                    if (bl && bl2) {
                        if (n13 >= n10 && n14 <= n11) {
                            return this.f.m0(view);
                        }
                    } else {
                        if (bl2) {
                            return this.f.m0(view);
                        }
                        if (n13 < n10 || n14 > n11) {
                            return this.f.m0(view);
                        }
                    }
                }
                n8 += n12;
            }
            return -1;
        }

        int i(int n8, int n9, boolean bl) {
            return this.h(n8, n9, false, false, bl);
        }

        public int j() {
            return this.d;
        }

        int k() {
            int n8 = this.c;
            if (n8 != Integer.MIN_VALUE) {
                return n8;
            }
            this.c();
            return this.c;
        }

        int l(int n8) {
            int n9 = this.c;
            if (n9 != Integer.MIN_VALUE) {
                return n9;
            }
            if (this.a.size() == 0) {
                return n8;
            }
            this.c();
            return this.c;
        }

        public View m(int n8, int n9) {
            View view = null;
            View view2 = null;
            if (n9 == -1) {
                int n10 = this.a.size();
                view = view2;
                for (n9 = 0; n9 < n10; ++n9) {
                    view2 = this.a.get(n9);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
                    if (staggeredGridLayoutManager.z && staggeredGridLayoutManager.m0(view2) <= n8) break;
                    staggeredGridLayoutManager = this.f;
                    if (!staggeredGridLayoutManager.z && staggeredGridLayoutManager.m0(view2) >= n8 || !view2.hasFocusable()) break;
                    view = view2;
                }
                return view;
            }
            for (n9 = this.a.size() - 1; n9 >= 0; --n9) {
                view2 = this.a.get(n9);
                StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
                if (staggeredGridLayoutManager.z && staggeredGridLayoutManager.m0(view2) >= n8) break;
                staggeredGridLayoutManager = this.f;
                if (!staggeredGridLayoutManager.z && staggeredGridLayoutManager.m0(view2) <= n8 || !view2.hasFocusable()) break;
                view = view2;
            }
            return view;
        }

        c n(View view) {
            return (c)view.getLayoutParams();
        }

        int o() {
            int n8 = this.b;
            if (n8 != Integer.MIN_VALUE) {
                return n8;
            }
            this.d();
            return this.b;
        }

        int p(int n8) {
            int n9 = this.b;
            if (n9 != Integer.MIN_VALUE) {
                return n9;
            }
            if (this.a.size() == 0) {
                return n8;
            }
            this.d();
            return this.b;
        }

        void q() {
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
        }

        void r(int n8) {
            int n9 = this.b;
            if (n9 != Integer.MIN_VALUE) {
                this.b = n9 + n8;
            }
            if ((n9 = this.c) != Integer.MIN_VALUE) {
                this.c = n9 + n8;
            }
        }

        void s() {
            int n8 = this.a.size();
            View view = this.a.remove(n8 - 1);
            c c8 = this.n(view);
            c8.e = null;
            if (c8.c() || c8.b()) {
                this.d -= this.f.u.e(view);
            }
            if (n8 == 1) {
                this.b = Integer.MIN_VALUE;
            }
            this.c = Integer.MIN_VALUE;
        }

        void t() {
            View view = this.a.remove(0);
            c c8 = this.n(view);
            c8.e = null;
            if (this.a.size() == 0) {
                this.c = Integer.MIN_VALUE;
            }
            if (c8.c() || c8.b()) {
                this.d -= this.f.u.e(view);
            }
            this.b = Integer.MIN_VALUE;
        }

        void u(View view) {
            c c8 = this.n(view);
            c8.e = this;
            this.a.add(0, view);
            this.b = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.c = Integer.MIN_VALUE;
            }
            if (!c8.c() && !c8.b()) {
                return;
            }
            this.d += this.f.u.e(view);
        }

        void v(int n8) {
            this.b = n8;
            this.c = n8;
        }
    }
}

