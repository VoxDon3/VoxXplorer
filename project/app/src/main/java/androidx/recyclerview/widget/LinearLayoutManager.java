/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.r;
import java.util.List;

public class LinearLayoutManager
extends RecyclerView.p
implements i.h,
RecyclerView.A.b {
    int A = -1;
    int B = Integer.MIN_VALUE;
    private boolean C;
    d D = null;
    final a E = new a();
    private final b F = new b();
    private int G = 2;
    private int[] H = new int[2];
    int s = 1;
    private c t;
    o u;
    private boolean v;
    private boolean w = false;
    boolean x = false;
    private boolean y = false;
    private boolean z = true;

    public LinearLayoutManager(@SuppressLint(value={"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(@SuppressLint(value={"UnknownNullness"}) Context context, int n8, boolean bl) {
        this.E2(n8);
        this.F2(bl);
    }

    @SuppressLint(value={"UnknownNullness"})
    public LinearLayoutManager(Context object, AttributeSet attributeSet, int n8, int n9) {
        object = RecyclerView.p.n0(object, attributeSet, n8, n9);
        this.E2(object.a);
        this.F2(object.c);
        this.G2(object.d);
    }

    private void B2() {
        if (this.s != 1 && this.r2()) {
            this.x = this.w ^ true;
            return;
        }
        this.x = this.w;
    }

    private boolean H2(RecyclerView.w w8, RecyclerView.B b8, a a8) {
        int n8 = this.P();
        boolean bl = false;
        if (n8 == 0) {
            return false;
        }
        View view = this.b0();
        if (view != null && a8.d(view, b8)) {
            a8.c(view, this.m0(view));
            return true;
        }
        boolean bl2 = this.v;
        boolean bl3 = this.y;
        if (bl2 != bl3) {
            return false;
        }
        if ((w8 = this.k2(w8, b8, a8.d, bl3)) != null) {
            a8.b((View)w8, this.m0((View)w8));
            if (!b8.e() && this.Q1()) {
                int n9 = this.u.g((View)w8);
                int n10 = this.u.d((View)w8);
                int n11 = this.u.m();
                int n12 = this.u.i();
                n8 = n10 <= n11 && n9 < n11 ? 1 : 0;
                boolean bl4 = bl;
                if (n9 >= n12) {
                    bl4 = bl;
                    if (n10 > n12) {
                        bl4 = true;
                    }
                }
                if (n8 != 0 || bl4) {
                    n8 = n11;
                    if (a8.d) {
                        n8 = n12;
                    }
                    a8.c = n8;
                }
            }
            return true;
        }
        return false;
    }

    private boolean I2(RecyclerView.B object, a a8) {
        int n8;
        boolean bl = ((RecyclerView.B)object).e();
        boolean bl2 = false;
        if (!bl && (n8 = this.A) != -1) {
            if (n8 >= 0 && n8 < ((RecyclerView.B)object).b()) {
                a8.b = this.A;
                object = this.D;
                if (object != null && ((d)object).a()) {
                    a8.d = bl = this.D.d0;
                    a8.c = bl ? this.u.i() - this.D.c0 : this.u.m() + this.D.c0;
                    return true;
                }
                if (this.B == Integer.MIN_VALUE) {
                    object = this.I(this.A);
                    if (object != null) {
                        if (this.u.e((View)object) > this.u.n()) {
                            a8.a();
                            return true;
                        }
                        if (this.u.g((View)object) - this.u.m() < 0) {
                            a8.c = this.u.m();
                            a8.d = false;
                            return true;
                        }
                        if (this.u.i() - this.u.d((View)object) < 0) {
                            a8.c = this.u.i();
                            a8.d = true;
                            return true;
                        }
                        n8 = a8.d ? this.u.d((View)object) + this.u.o() : this.u.g((View)object);
                        a8.c = n8;
                    } else {
                        if (this.P() > 0) {
                            n8 = this.m0(this.O(0));
                            bl = this.A < n8;
                            if (bl == this.x) {
                                bl2 = true;
                            }
                            a8.d = bl2;
                        }
                        a8.a();
                    }
                    return true;
                }
                a8.d = bl = this.x;
                a8.c = bl ? this.u.i() - this.B : this.u.m() + this.B;
                return true;
            }
            this.A = -1;
            this.B = Integer.MIN_VALUE;
        }
        return false;
    }

    private void J2(RecyclerView.w w8, RecyclerView.B b8, a a8) {
        if (this.I2(b8, a8) || this.H2(w8, b8, a8)) {
            return;
        }
        a8.a();
        int n8 = this.y ? b8.b() - 1 : 0;
        a8.b = n8;
    }

    private void K2(int n8, int n9, boolean bl, RecyclerView.B object) {
        this.t.m = this.A2();
        this.t.f = n8;
        Object object2 = this.H;
        boolean bl2 = false;
        object2[0] = 0;
        int n10 = 1;
        int n11 = 1;
        object2[1] = 0;
        this.R1((RecyclerView.B)object, (int[])object2);
        int n12 = Math.max(0, this.H[0]);
        int n13 = Math.max(0, this.H[1]);
        if (n8 == 1) {
            bl2 = true;
        }
        object = this.t;
        n8 = bl2 ? n13 : n12;
        ((c)object).h = n8;
        if (bl2) {
            n13 = n12;
        }
        ((c)object).i = n13;
        if (bl2) {
            ((c)object).h = n8 + this.u.j();
            object2 = this.n2();
            object = this.t;
            n8 = n11;
            if (this.x) {
                n8 = -1;
            }
            ((c)object).e = n8;
            n8 = this.m0((View)object2);
            c c8 = this.t;
            ((c)object).d = n8 + c8.e;
            c8.b = this.u.d((View)object2);
            n8 = this.u.d((View)object2) - this.u.i();
        } else {
            object = this.o2();
            object2 = this.t;
            object2.h += this.u.m();
            c c9 = this.t;
            n8 = this.x ? n10 : -1;
            c9.e = n8;
            n8 = this.m0((View)object);
            object2 = this.t;
            c9.d = n8 + object2.e;
            object2.b = this.u.g((View)object);
            n8 = -this.u.g((View)object) + this.u.m();
        }
        object = this.t;
        ((c)object).c = n9;
        if (bl) {
            ((c)object).c = n9 - n8;
        }
        ((c)object).g = n8;
    }

    private void L2(int n8, int n9) {
        this.t.c = this.u.i() - n9;
        c c8 = this.t;
        int n10 = this.x ? -1 : 1;
        c8.e = n10;
        c8.d = n8;
        c8.f = 1;
        c8.b = n9;
        c8.g = Integer.MIN_VALUE;
    }

    private void M2(a a8) {
        this.L2(a8.b, a8.c);
    }

    private void N2(int n8, int n9) {
        this.t.c = n9 - this.u.m();
        c c8 = this.t;
        c8.d = n8;
        n8 = this.x ? 1 : -1;
        c8.e = n8;
        c8.f = -1;
        c8.b = n9;
        c8.g = Integer.MIN_VALUE;
    }

    private void O2(a a8) {
        this.N2(a8.b, a8.c);
    }

    private int T1(RecyclerView.B b8) {
        if (this.P() == 0) {
            return 0;
        }
        this.Y1();
        return r.a(b8, this.u, this.c2(this.z ^ true, true), this.b2(this.z ^ true, true), this, this.z);
    }

    private int U1(RecyclerView.B b8) {
        if (this.P() == 0) {
            return 0;
        }
        this.Y1();
        return r.b(b8, this.u, this.c2(this.z ^ true, true), this.b2(this.z ^ true, true), this, this.z, this.x);
    }

    private int V1(RecyclerView.B b8) {
        if (this.P() == 0) {
            return 0;
        }
        this.Y1();
        return r.c(b8, this.u, this.c2(this.z ^ true, true), this.b2(this.z ^ true, true), this, this.z);
    }

    private View a2() {
        return this.g2(0, this.P());
    }

    private View e2() {
        return this.g2(this.P() - 1, -1);
    }

    private View i2() {
        if (this.x) {
            return this.a2();
        }
        return this.e2();
    }

    private View j2() {
        if (this.x) {
            return this.e2();
        }
        return this.a2();
    }

    private int l2(int n8, RecyclerView.w w8, RecyclerView.B b8, boolean bl) {
        int n9 = this.u.i() - n8;
        if (n9 > 0) {
            n9 = -this.C2(-n9, w8, b8);
            if (bl && (n8 = this.u.i() - (n8 + n9)) > 0) {
                this.u.r(n8);
                return n8 + n9;
            }
            return n9;
        }
        return 0;
    }

    private int m2(int n8, RecyclerView.w w8, RecyclerView.B b8, boolean bl) {
        int n9 = n8 - this.u.m();
        if (n9 > 0) {
            int n10;
            n9 = n10 = -this.C2(n9, w8, b8);
            if (bl) {
                n8 = n8 + n10 - this.u.m();
                n9 = n10;
                if (n8 > 0) {
                    this.u.r(-n8);
                    n9 = n10 - n8;
                }
            }
            return n9;
        }
        return 0;
    }

    private View n2() {
        int n8 = this.x ? 0 : this.P() - 1;
        return this.O(n8);
    }

    private View o2() {
        int n8 = this.x ? this.P() - 1 : 0;
        return this.O(n8);
    }

    private void u2(RecyclerView.w w8, RecyclerView.B b8, int n8, int n9) {
        if (b8.g() && this.P() != 0 && !b8.e() && this.Q1()) {
            Object object = w8.k();
            int n10 = object.size();
            int n11 = this.m0(this.O(0));
            int n12 = 0;
            int n13 = 0;
            for (int i8 = 0; i8 < n10; ++i8) {
                RecyclerView.F f8 = object.get(i8);
                if (f8.w()) continue;
                boolean bl = f8.n() < n11;
                if (bl != this.x) {
                    n12 += this.u.e(f8.a);
                    continue;
                }
                n13 += this.u.e(f8.a);
            }
            this.t.l = object;
            if (n12 > 0) {
                this.N2(this.m0(this.o2()), n8);
                object = this.t;
                ((c)object).h = n12;
                ((c)object).c = 0;
                ((c)object).a();
                this.Z1(w8, this.t, b8, false);
            }
            if (n13 > 0) {
                this.L2(this.m0(this.n2()), n9);
                object = this.t;
                ((c)object).h = n13;
                ((c)object).c = 0;
                ((c)object).a();
                this.Z1(w8, this.t, b8, false);
            }
            this.t.l = null;
        }
    }

    private void w2(RecyclerView.w w8, c c8) {
        if (c8.a && !c8.m) {
            int n8 = c8.g;
            int n9 = c8.i;
            if (c8.f == -1) {
                this.y2(w8, n8, n9);
                return;
            }
            this.z2(w8, n8, n9);
        }
    }

    private void x2(RecyclerView.w w8, int n8, int n9) {
        block4: {
            if (n8 == n9) break block4;
            if (n9 > n8) {
                --n9;
                while (n9 >= n8) {
                    this.s1(n9, w8);
                    --n9;
                }
            } else {
                for (int i8 = n8; i8 > n9; --i8) {
                    this.s1(i8, w8);
                }
            }
        }
    }

    private void y2(RecyclerView.w w8, int n8, int n9) {
        block6: {
            int n10 = this.P();
            if (n8 < 0) break block6;
            int n11 = this.u.h() - n8 + n9;
            if (this.x) {
                for (n8 = 0; n8 < n10; ++n8) {
                    View view = this.O(n8);
                    if (this.u.g(view) >= n11 && this.u.q(view) >= n11) {
                        continue;
                    }
                    this.x2(w8, 0, n8);
                    return;
                }
            } else {
                for (n8 = n9 = n10 - 1; n8 >= 0; --n8) {
                    View view = this.O(n8);
                    if (this.u.g(view) >= n11 && this.u.q(view) >= n11) {
                        continue;
                    }
                    this.x2(w8, n9, n8);
                    break;
                }
            }
        }
    }

    private void z2(RecyclerView.w w8, int n8, int n9) {
        block6: {
            if (n8 < 0) break block6;
            int n10 = n8 - n9;
            n9 = this.P();
            if (this.x) {
                for (n8 = --n9; n8 >= 0; --n8) {
                    View view = this.O(n8);
                    if (this.u.d(view) <= n10 && this.u.p(view) <= n10) {
                        continue;
                    }
                    this.x2(w8, n9, n8);
                    return;
                }
            } else {
                for (n8 = 0; n8 < n9; ++n8) {
                    View view = this.O(n8);
                    if (this.u.d(view) <= n10 && this.u.p(view) <= n10) {
                        continue;
                    }
                    this.x2(w8, 0, n8);
                    break;
                }
            }
        }
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public int A(RecyclerView.B b8) {
        return this.U1(b8);
    }

    boolean A2() {
        return this.u.k() == 0 && this.u.h() == 0;
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public int B(RecyclerView.B b8) {
        return this.V1(b8);
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public int B1(int n8, RecyclerView.w w8, RecyclerView.B b8) {
        if (this.s == 1) {
            return 0;
        }
        return this.C2(n8, w8, b8);
    }

    @Override
    public void C1(int n8) {
        this.A = n8;
        this.B = Integer.MIN_VALUE;
        d d8 = this.D;
        if (d8 != null) {
            d8.b();
        }
        this.y1();
    }

    int C2(int n8, RecyclerView.w w8, RecyclerView.B b8) {
        if (this.P() != 0 && n8 != 0) {
            this.Y1();
            this.t.a = true;
            int n9 = n8 > 0 ? 1 : -1;
            int n10 = Math.abs(n8);
            this.K2(n9, n10, true, b8);
            c c8 = this.t;
            int n11 = c8.g + this.Z1(w8, c8, b8, false);
            if (n11 < 0) {
                return 0;
            }
            if (n10 > n11) {
                n8 = n9 * n11;
            }
            this.u.r(-n8);
            this.t.k = n8;
            return n8;
        }
        return 0;
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public int D1(int n8, RecyclerView.w w8, RecyclerView.B b8) {
        if (this.s == 0) {
            return 0;
        }
        return this.C2(n8, w8, b8);
    }

    public void D2(int n8, int n9) {
        this.A = n8;
        this.B = n9;
        d d8 = this.D;
        if (d8 != null) {
            d8.b();
        }
        this.y1();
    }

    public void E2(int n8) {
        o o8;
        if (n8 != 0 && n8 != 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("invalid orientation:");
            stringBuilder.append(n8);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.m(null);
        if (n8 == this.s && this.u != null) {
            return;
        }
        this.u = o8 = o.b(this, n8);
        this.E.a = o8;
        this.s = n8;
        this.y1();
    }

    public void F2(boolean bl) {
        this.m(null);
        if (bl == this.w) {
            return;
        }
        this.w = bl;
        this.y1();
    }

    public void G2(boolean bl) {
        this.m(null);
        if (this.y == bl) {
            return;
        }
        this.y = bl;
        this.y1();
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public View I(int n8) {
        View view;
        int n9 = this.P();
        if (n9 == 0) {
            return null;
        }
        int n10 = n8 - this.m0(this.O(0));
        if (n10 >= 0 && n10 < n9 && this.m0(view = this.O(n10)) == n8) {
            return view;
        }
        return super.I(n8);
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public RecyclerView.q J() {
        return new RecyclerView.q(-2, -2);
    }

    @Override
    boolean L1() {
        return this.d0() != 0x40000000 && this.u0() != 0x40000000 && this.v0();
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public void N0(RecyclerView recyclerView, RecyclerView.w w8) {
        super.N0(recyclerView, w8);
        if (this.C) {
            this.p1(w8);
            w8.c();
        }
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public void N1(RecyclerView object, RecyclerView.B b8, int n8) {
        object = new l(object.getContext());
        ((RecyclerView.A)object).p(n8);
        this.O1((RecyclerView.A)object);
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public View O0(View object, int n8, RecyclerView.w w8, RecyclerView.B b8) {
        this.B2();
        if (this.P() == 0) {
            return null;
        }
        if ((n8 = this.W1(n8)) == Integer.MIN_VALUE) {
            return null;
        }
        this.Y1();
        this.K2(n8, (int)((float)this.u.n() * 0.33333334f), false, b8);
        object = this.t;
        object.g = Integer.MIN_VALUE;
        object.a = false;
        this.Z1(w8, (c)object, b8, true);
        object = n8 == -1 ? this.j2() : this.i2();
        w8 = n8 == -1 ? this.o2() : this.n2();
        if (w8.hasFocusable()) {
            if (object == null) {
                return null;
            }
            return w8;
        }
        return object;
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public void P0(AccessibilityEvent accessibilityEvent) {
        super.P0(accessibilityEvent);
        if (this.P() > 0) {
            accessibilityEvent.setFromIndex(this.d2());
            accessibilityEvent.setToIndex(this.f2());
        }
    }

    @Override
    public boolean Q1() {
        return this.D == null && this.v == this.y;
    }

    protected void R1(RecyclerView.B b8, int[] nArray) {
        int n8;
        int n9 = this.p2(b8);
        if (this.t.f == -1) {
            n8 = 0;
        } else {
            n8 = n9;
            n9 = 0;
        }
        nArray[0] = n9;
        nArray[1] = n8;
    }

    void S1(RecyclerView.B b8, c c8, RecyclerView.p.c c9) {
        int n8 = c8.d;
        if (n8 >= 0 && n8 < b8.b()) {
            c9.a(n8, Math.max(0, c8.g));
        }
    }

    int W1(int n8) {
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 17) {
                    if (n8 != 33) {
                        if (n8 != 66) {
                            if (n8 != 130) {
                                return Integer.MIN_VALUE;
                            }
                            if (this.s == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        }
                        if (this.s == 0) {
                            return 1;
                        }
                        return Integer.MIN_VALUE;
                    }
                    if (this.s == 1) {
                        return -1;
                    }
                    return Integer.MIN_VALUE;
                }
                if (this.s == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            }
            if (this.s == 1) {
                return 1;
            }
            if (this.r2()) {
                return -1;
            }
            return 1;
        }
        if (this.s == 1) {
            return -1;
        }
        if (this.r2()) {
            return 1;
        }
        return -1;
    }

    c X1() {
        return new c();
    }

    void Y1() {
        if (this.t == null) {
            this.t = this.X1();
        }
    }

    int Z1(RecyclerView.w w8, c c8, RecyclerView.B b8, boolean bl) {
        int n8 = c8.c;
        int n9 = c8.g;
        if (n9 != Integer.MIN_VALUE) {
            if (n8 < 0) {
                c8.g = n9 + n8;
            }
            this.w2(w8, c8);
        }
        int n10 = c8.c + c8.h;
        b b9 = this.F;
        while ((c8.m || n10 > 0) && c8.c(b8)) {
            int n11;
            block9: {
                block8: {
                    b9.a();
                    this.t2(w8, b8, c8, b9);
                    if (b9.b) break;
                    c8.b += b9.a * c8.f;
                    if (!b9.c || c8.l != null) break block8;
                    n9 = n10;
                    if (b8.e()) break block9;
                }
                n11 = c8.c;
                n9 = b9.a;
                c8.c = n11 - n9;
                n9 = n10 - n9;
            }
            if ((n10 = c8.g) != Integer.MIN_VALUE) {
                c8.g = n10 += b9.a;
                n11 = c8.c;
                if (n11 < 0) {
                    c8.g = n10 + n11;
                }
                this.w2(w8, c8);
            }
            n10 = n9;
            if (!bl) continue;
            n10 = n9;
            if (!b9.d) continue;
        }
        return n8 - c8.c;
    }

    View b2(boolean bl, boolean bl2) {
        if (this.x) {
            return this.h2(0, this.P(), bl, bl2);
        }
        return this.h2(this.P() - 1, -1, bl, bl2);
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public PointF c(int n8) {
        if (this.P() == 0) {
            return null;
        }
        boolean bl = false;
        int n9 = this.m0(this.O(0));
        int n10 = 1;
        if (n8 < n9) {
            bl = true;
        }
        n8 = n10;
        if (bl != this.x) {
            n8 = -1;
        }
        if (this.s == 0) {
            return new PointF((float)n8, 0.0f);
        }
        return new PointF(0.0f, (float)n8);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    @SuppressLint(value={"UnknownNullness"})
    public void c1(RecyclerView.w w8, RecyclerView.B b8) {
        int n8;
        Object object = this.D;
        int n9 = -1;
        if ((object != null || this.A != -1) && b8.b() == 0) {
            this.p1(w8);
            return;
        }
        object = this.D;
        if (object != null && ((d)object).a()) {
            this.A = this.D.q;
        }
        this.Y1();
        this.t.a = false;
        this.B2();
        object = this.b0();
        a a8 = this.E;
        if (a8.e && this.A == -1 && this.D == null) {
            if (object != null && (this.u.g((View)object) >= this.u.i() || this.u.d((View)object) <= this.u.m())) {
                this.E.c((View)object, this.m0((View)object));
            }
        } else {
            a8.e();
            object = this.E;
            ((a)object).d = this.x ^ this.y;
            this.J2(w8, b8, (a)object);
            this.E.e = true;
        }
        object = this.t;
        int n10 = ((c)object).k >= 0 ? 1 : -1;
        ((c)object).f = n10;
        object = this.H;
        object[0] = false;
        object[1] = false;
        this.R1(b8, (int[])object);
        int n11 = Math.max(0, this.H[0]) + this.u.m();
        int n12 = Math.max(0, this.H[1]) + this.u.j();
        int n13 = n11;
        n10 = n12;
        if (b8.e()) {
            n8 = this.A;
            n13 = n11;
            n10 = n12;
            if (n8 != -1) {
                n13 = n11;
                n10 = n12;
                if (this.B != Integer.MIN_VALUE) {
                    object = this.I(n8);
                    n13 = n11;
                    n10 = n12;
                    if (object != null) {
                        if (this.x) {
                            n13 = this.u.i() - this.u.d((View)object);
                            n10 = this.B;
                        } else {
                            n10 = this.u.g((View)object) - this.u.m();
                            n13 = this.B;
                        }
                        n10 = n13 - n10;
                        if (n10 > 0) {
                            n13 = n11 + n10;
                            n10 = n12;
                        } else {
                            n10 = n12 - n10;
                            n13 = n11;
                        }
                    }
                }
            }
        }
        object = this.E;
        if (((a)object).d ? this.x : !this.x) {
            n9 = 1;
        }
        this.v2(w8, b8, (a)object, n9);
        this.C(w8);
        this.t.m = this.A2();
        this.t.j = b8.e();
        this.t.i = 0;
        object = this.E;
        if (((a)object).d) {
            this.O2((a)object);
            object = this.t;
            ((c)object).h = n13;
            this.Z1(w8, (c)object, b8, false);
            object = this.t;
            n9 = ((c)object).b;
            n11 = ((c)object).d;
            n12 = ((c)object).c;
            n13 = n10;
            if (n12 > 0) {
                n13 = n10 + n12;
            }
            this.M2(this.E);
            object = this.t;
            ((c)object).h = n13;
            ((c)object).d += ((c)object).e;
            this.Z1(w8, (c)object, b8, false);
            object = this.t;
            n12 = ((c)object).b;
            n8 = ((c)object).c;
            n13 = n9;
            n10 = n12;
            if (n8 > 0) {
                this.N2(n11, n9);
                object = this.t;
                ((c)object).h = n8;
                this.Z1(w8, (c)object, b8, false);
                n13 = this.t.b;
                n10 = n12;
            }
        } else {
            this.M2((a)object);
            object = this.t;
            ((c)object).h = n10;
            this.Z1(w8, (c)object, b8, false);
            object = this.t;
            n9 = ((c)object).b;
            n11 = ((c)object).d;
            n12 = ((c)object).c;
            n10 = n13;
            if (n12 > 0) {
                n10 = n13 + n12;
            }
            this.O2(this.E);
            object = this.t;
            ((c)object).h = n10;
            ((c)object).d += ((c)object).e;
            this.Z1(w8, (c)object, b8, false);
            object = this.t;
            n12 = ((c)object).b;
            n8 = ((c)object).c;
            n13 = n12;
            n10 = n9;
            if (n8 > 0) {
                this.L2(n11, n9);
                object = this.t;
                ((c)object).h = n8;
                this.Z1(w8, (c)object, b8, false);
                n10 = this.t.b;
                n13 = n12;
            }
        }
        n9 = n13;
        n12 = n10;
        if (this.P() > 0) {
            if (this.x ^ this.y) {
                n12 = this.l2(n10, w8, b8, true);
                n9 = n13 + n12;
                n13 = n10 + n12;
                n10 = this.m2(n9, w8, b8, false);
            } else {
                n12 = this.m2(n13, w8, b8, true);
                n9 = n13 + n12;
                n13 = n10 + n12;
                n10 = this.l2(n13, w8, b8, false);
            }
            n9 += n10;
            n12 = n13 + n10;
        }
        this.u2(w8, b8, n9, n12);
        if (!b8.e()) {
            this.u.s();
        } else {
            this.E.e();
        }
        this.v = this.y;
    }

    View c2(boolean bl, boolean bl2) {
        if (this.x) {
            return this.h2(this.P() - 1, -1, bl, bl2);
        }
        return this.h2(0, this.P(), bl, bl2);
    }

    @Override
    public void d(View view, View view2, int n8, int n9) {
        this.m("Cannot drop a view during a scroll or layout calculation");
        this.Y1();
        this.B2();
        n8 = this.m0(view);
        n9 = this.m0(view2);
        n8 = n8 < n9 ? 1 : -1;
        if (this.x) {
            if (n8 == 1) {
                this.D2(n9, this.u.i() - (this.u.g(view2) + this.u.e(view)));
                return;
            }
            this.D2(n9, this.u.i() - this.u.d(view2));
            return;
        }
        if (n8 == -1) {
            this.D2(n9, this.u.g(view2));
            return;
        }
        this.D2(n9, this.u.d(view2) - this.u.e(view));
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public void d1(RecyclerView.B b8) {
        super.d1(b8);
        this.D = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.E.e();
    }

    public int d2() {
        View view = this.h2(0, this.P(), false, true);
        if (view == null) {
            return -1;
        }
        return this.m0(view);
    }

    public int f2() {
        View view = this.h2(this.P() - 1, -1, false, true);
        if (view == null) {
            return -1;
        }
        return this.m0(view);
    }

    View g2(int n8, int n9) {
        this.Y1();
        if (n9 > n8 || n9 < n8) {
            int n10;
            int n11;
            if (this.u.g(this.O(n8)) < this.u.m()) {
                n11 = 16644;
                n10 = 16388;
            } else {
                n11 = 4161;
                n10 = 4097;
            }
            if (this.s == 0) {
                return this.e.a(n8, n9, n11, n10);
            }
            return this.f.a(n8, n9, n11, n10);
        }
        return this.O(n8);
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public void h1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            parcelable = (d)parcelable;
            this.D = parcelable;
            if (this.A != -1) {
                parcelable.b();
            }
            this.y1();
        }
    }

    View h2(int n8, int n9, boolean bl, boolean bl2) {
        this.Y1();
        int n10 = 320;
        int n11 = bl ? 24579 : 320;
        if (!bl2) {
            n10 = 0;
        }
        if (this.s == 0) {
            return this.e.a(n8, n9, n11, n10);
        }
        return this.f.a(n8, n9, n11, n10);
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public Parcelable i1() {
        if (this.D != null) {
            return new d(this.D);
        }
        d d8 = new d();
        if (this.P() > 0) {
            boolean bl;
            this.Y1();
            d8.d0 = bl = this.v ^ this.x;
            if (bl) {
                View view = this.n2();
                d8.c0 = this.u.i() - this.u.d(view);
                d8.q = this.m0(view);
                return d8;
            }
            View view = this.o2();
            d8.q = this.m0(view);
            d8.c0 = this.u.g(view) - this.u.m();
            return d8;
        }
        d8.b();
        return d8;
    }

    View k2(RecyclerView.w w8, RecyclerView.B b8, boolean bl, boolean bl2) {
        int n8;
        int n9;
        this.Y1();
        int n10 = this.P();
        if (bl2) {
            n9 = this.P() - 1;
            n10 = -1;
            n8 = -1;
        } else {
            n9 = 0;
            n8 = 1;
        }
        int n11 = b8.b();
        int n12 = this.u.m();
        int n13 = this.u.i();
        RecyclerView.w w9 = null;
        RecyclerView.w w10 = null;
        b8 = null;
        while (n9 != n10) {
            Object object;
            RecyclerView.w w11;
            RecyclerView.w w12;
            block11: {
                block15: {
                    block16: {
                        block14: {
                            int n14;
                            block13: {
                                int n15;
                                int n16;
                                block12: {
                                    w8 = this.O(n9);
                                    n14 = this.m0((View)w8);
                                    n16 = this.u.g((View)w8);
                                    n15 = this.u.d((View)w8);
                                    w12 = w9;
                                    w11 = w10;
                                    object = b8;
                                    if (n14 < 0) break block11;
                                    w12 = w9;
                                    w11 = w10;
                                    object = b8;
                                    if (n14 >= n11) break block11;
                                    if (!((RecyclerView.q)w8.getLayoutParams()).c()) break block12;
                                    w12 = w9;
                                    w11 = w10;
                                    object = b8;
                                    if (b8 == null) {
                                        w12 = w9;
                                        w11 = w10;
                                        object = w8;
                                    }
                                    break block11;
                                }
                                n14 = n15 <= n12 && n16 < n12 ? 1 : 0;
                                n16 = n16 >= n13 && n15 > n13 ? 1 : 0;
                                if (n14 == 0 && n16 == 0) {
                                    return w8;
                                }
                                if (!bl) break block13;
                                if (n16 != 0) break block14;
                                w12 = w9;
                                w11 = w10;
                                object = b8;
                                if (w9 != null) break block11;
                                break block15;
                            }
                            if (n14 == 0) break block16;
                        }
                        w12 = w9;
                        w11 = w8;
                        object = b8;
                        break block11;
                    }
                    w12 = w9;
                    w11 = w10;
                    object = b8;
                    if (w9 != null) break block11;
                }
                object = b8;
                w11 = w10;
                w12 = w8;
            }
            n9 += n8;
            w9 = w12;
            w10 = w11;
            b8 = object;
        }
        if (w9 != null) {
            return w9;
        }
        if (w10 != null) {
            return w10;
        }
        return b8;
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public void m(String string) {
        if (this.D == null) {
            super.m(string);
        }
    }

    @Deprecated
    protected int p2(RecyclerView.B b8) {
        if (b8.d()) {
            return this.u.n();
        }
        return 0;
    }

    @Override
    public boolean q() {
        return this.s == 0;
    }

    public int q2() {
        return this.s;
    }

    @Override
    public boolean r() {
        return this.s == 1;
    }

    protected boolean r2() {
        return this.e0() == 1;
    }

    public boolean s2() {
        return this.z;
    }

    void t2(RecyclerView.w object, RecyclerView.B b8, c c8, b b9) {
        int n8;
        int n9;
        int n10;
        int n11;
        b8 = c8.d((RecyclerView.w)object);
        if (b8 == null) {
            b9.b = true;
            return;
        }
        object = (RecyclerView.q)b8.getLayoutParams();
        if (c8.l == null) {
            boolean bl = this.x;
            boolean bl2 = c8.f == -1;
            if (bl == bl2) {
                this.j((View)b8);
            } else {
                this.k((View)b8, 0);
            }
        } else {
            boolean bl = this.x;
            boolean bl3 = c8.f == -1;
            if (bl == bl3) {
                this.h((View)b8);
            } else {
                this.i((View)b8, 0);
            }
        }
        this.F0((View)b8, 0, 0);
        b9.a = this.u.e((View)b8);
        if (this.s == 1) {
            if (this.r2()) {
                n11 = this.t0() - this.k0();
                n10 = n11 - this.u.f((View)b8);
            } else {
                n10 = this.j0();
                n11 = this.u.f((View)b8) + n10;
            }
            if (c8.f == -1) {
                n9 = c8.b;
                n8 = n9 - b9.a;
            } else {
                n8 = c8.b;
                n9 = b9.a + n8;
            }
        } else {
            n8 = this.l0();
            n9 = this.u.f((View)b8) + n8;
            if (c8.f == -1) {
                n11 = c8.b;
                n10 = n11 - b9.a;
            } else {
                n10 = c8.b;
                n11 = b9.a + n10;
            }
        }
        this.E0((View)b8, n10, n8, n11, n9);
        if (((RecyclerView.q)((Object)object)).c() || ((RecyclerView.q)((Object)object)).b()) {
            b9.c = true;
        }
        b9.d = b8.hasFocusable();
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public void u(int n8, int n9, RecyclerView.B b8, RecyclerView.p.c c8) {
        if (this.s != 0) {
            n8 = n9;
        }
        if (this.P() != 0 && n8 != 0) {
            this.Y1();
            n9 = n8 > 0 ? 1 : -1;
            this.K2(n9, Math.abs(n8), true, b8);
            this.S1(b8, this.t, c8);
        }
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public void v(int n8, RecyclerView.p.c c8) {
        int n9;
        int n10;
        boolean bl;
        d d8 = this.D;
        int n11 = -1;
        if (d8 != null && d8.a()) {
            d8 = this.D;
            bl = d8.d0;
            n10 = d8.q;
        } else {
            this.B2();
            boolean bl2 = this.x;
            n10 = n9 = this.A;
            bl = bl2;
            if (n9 == -1) {
                if (bl2) {
                    n10 = n8 - 1;
                    bl = bl2;
                } else {
                    n10 = 0;
                    bl = bl2;
                }
            }
        }
        if (!bl) {
            n11 = 1;
        }
        for (n9 = 0; n9 < this.G && n10 >= 0 && n10 < n8; n10 += n11, ++n9) {
            c8.a(n10, 0);
        }
    }

    void v2(RecyclerView.w w8, RecyclerView.B b8, a a8, int n8) {
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public int w(RecyclerView.B b8) {
        return this.T1(b8);
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public int x(RecyclerView.B b8) {
        return this.U1(b8);
    }

    @Override
    public boolean x0() {
        return true;
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public int y(RecyclerView.B b8) {
        return this.V1(b8);
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public int z(RecyclerView.B b8) {
        return this.T1(b8);
    }

    static class a {
        o a;
        int b;
        int c;
        boolean d;
        boolean e;

        a() {
            this.e();
        }

        void a() {
            int n8 = this.d ? this.a.i() : this.a.m();
            this.c = n8;
        }

        public void b(View view, int n8) {
            this.c = this.d ? this.a.d(view) + this.a.o() : this.a.g(view);
            this.b = n8;
        }

        public void c(View view, int n8) {
            int n9 = this.a.o();
            if (n9 >= 0) {
                this.b(view, n8);
                return;
            }
            this.b = n8;
            if (this.d) {
                n8 = this.a.i() - n9 - this.a.d(view);
                this.c = this.a.i() - n8;
                if (n8 > 0) {
                    int n10 = this.a.e(view);
                    n9 = this.c;
                    int n11 = this.a.m();
                    if ((n9 = n9 - n10 - (n11 + Math.min(this.a.g(view) - n11, 0))) < 0) {
                        this.c += Math.min(n8, -n9);
                        return;
                    }
                }
            } else {
                int n12 = this.a.g(view);
                n8 = n12 - this.a.m();
                this.c = n12;
                if (n8 > 0) {
                    int n13 = this.a.e(view);
                    int n14 = this.a.i();
                    int n15 = this.a.d(view);
                    n9 = this.a.i() - Math.min(0, n14 - n9 - n15) - (n12 + n13);
                    if (n9 < 0) {
                        this.c -= Math.min(n8, -n9);
                    }
                }
            }
        }

        boolean d(View object, RecyclerView.B b8) {
            return !((RecyclerView.q)((Object)(object = (RecyclerView.q)object.getLayoutParams()))).c() && ((RecyclerView.q)((Object)object)).a() >= 0 && ((RecyclerView.q)((Object)object)).a() < b8.b();
        }

        void e() {
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            this.d = false;
            this.e = false;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AnchorInfo{mPosition=");
            stringBuilder.append(this.b);
            stringBuilder.append(", mCoordinate=");
            stringBuilder.append(this.c);
            stringBuilder.append(", mLayoutFromEnd=");
            stringBuilder.append(this.d);
            stringBuilder.append(", mValid=");
            stringBuilder.append(this.e);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    protected static class b {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;

        protected b() {
        }

        void a() {
            this.a = 0;
            this.b = false;
            this.c = false;
            this.d = false;
        }
    }

    static class c {
        boolean a = true;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int h = 0;
        int i = 0;
        boolean j = false;
        int k;
        List<RecyclerView.F> l = null;
        boolean m;

        c() {
        }

        private View e() {
            int n8 = this.l.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                View view = this.l.get((int)i8).a;
                RecyclerView.q q8 = (RecyclerView.q)view.getLayoutParams();
                if (q8.c() || this.d != q8.a()) continue;
                this.b(view);
                return view;
            }
            return null;
        }

        public void a() {
            this.b(null);
        }

        public void b(View view) {
            if ((view = this.f(view)) == null) {
                this.d = -1;
                return;
            }
            this.d = ((RecyclerView.q)view.getLayoutParams()).a();
        }

        boolean c(RecyclerView.B b8) {
            int n8 = this.d;
            return n8 >= 0 && n8 < b8.b();
        }

        View d(RecyclerView.w w8) {
            if (this.l != null) {
                return this.e();
            }
            w8 = w8.o(this.d);
            this.d += this.e;
            return w8;
        }

        public View f(View view) {
            int n8 = this.l.size();
            View view2 = null;
            int n9 = Integer.MAX_VALUE;
            for (int i8 = 0; i8 < n8; ++i8) {
                View view3 = this.l.get((int)i8).a;
                RecyclerView.q q8 = (RecyclerView.q)view3.getLayoutParams();
                View view4 = view2;
                int n10 = n9;
                if (view3 != view) {
                    if (q8.c()) {
                        view4 = view2;
                        n10 = n9;
                    } else {
                        int n11 = (q8.a() - this.d) * this.e;
                        if (n11 < 0) {
                            view4 = view2;
                            n10 = n9;
                        } else {
                            view4 = view2;
                            n10 = n9;
                            if (n11 < n9) {
                                if (n11 == 0) {
                                    return view3;
                                }
                                view4 = view3;
                                n10 = n11;
                            }
                        }
                    }
                }
                view2 = view4;
                n9 = n10;
            }
            return view2;
        }
    }

    @SuppressLint(value={"BanParcelableUsage"})
    public static class d
    implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>(){

            public d a(Parcel parcel) {
                return new d(parcel);
            }

            public d[] b(int n8) {
                return new d[n8];
            }
        };
        int c0;
        boolean d0;
        int q;

        public d() {
        }

        d(Parcel parcel) {
            this.q = parcel.readInt();
            this.c0 = parcel.readInt();
            int n8 = parcel.readInt();
            boolean bl = true;
            if (n8 != 1) {
                bl = false;
            }
            this.d0 = bl;
        }

        @SuppressLint(value={"UnknownNullness"})
        public d(d d8) {
            this.q = d8.q;
            this.c0 = d8.c0;
            this.d0 = d8.d0;
        }

        boolean a() {
            return this.q >= 0;
        }

        void b() {
            this.q = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int n8) {
            parcel.writeInt(this.q);
            parcel.writeInt(this.c0);
            parcel.writeInt(this.d0 ? 1 : 0);
        }
    }
}

