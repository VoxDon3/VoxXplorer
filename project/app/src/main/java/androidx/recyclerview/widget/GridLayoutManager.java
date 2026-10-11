/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax.d0.H;
import java.util.Arrays;

public class GridLayoutManager
extends LinearLayoutManager {
    boolean I = false;
    int J = -1;
    int[] K;
    View[] L;
    final SparseIntArray M = new SparseIntArray();
    final SparseIntArray N = new SparseIntArray();
    c O = new a();
    final Rect P = new Rect();
    private boolean Q;

    public GridLayoutManager(Context context, int n8, int n9, boolean bl) {
        super(context, n9, bl);
        this.g3(n8);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int n8, int n9) {
        super(context, attributeSet, n8, n9);
        this.g3(RecyclerView.p.n0((Context)context, (AttributeSet)attributeSet, (int)n8, (int)n9).b);
    }

    private void P2(RecyclerView.w w8, RecyclerView.B b8, int n8, boolean bl) {
        int n9;
        int n10;
        int n11 = 0;
        if (bl) {
            n10 = n8;
            n8 = 0;
            n9 = 1;
        } else {
            --n8;
            n10 = -1;
            n9 = -1;
        }
        while (n8 != n10) {
            int n12;
            View view = this.L[n8];
            b b9 = (b)view.getLayoutParams();
            b9.f = n12 = this.c3(w8, b8, this.m0(view));
            b9.e = n11;
            n11 += n12;
            n8 += n9;
        }
    }

    private void Q2() {
        int n8 = this.P();
        for (int i8 = 0; i8 < n8; ++i8) {
            b b8 = (b)this.O(i8).getLayoutParams();
            int n9 = b8.a();
            this.M.put(n9, b8.f());
            this.N.put(n9, b8.e());
        }
    }

    private void R2(int n8) {
        this.K = GridLayoutManager.S2(this.K, this.J, n8);
    }

    static int[] S2(int[] nArray, int n8, int n9) {
        int[] nArray2;
        int n10;
        block7: {
            block6: {
                n10 = 1;
                if (nArray == null || nArray.length != n8 + 1) break block6;
                nArray2 = nArray;
                if (nArray[nArray.length - 1] == n9) break block7;
            }
            nArray2 = new int[n8 + 1];
        }
        int n11 = 0;
        nArray2[0] = 0;
        int n12 = n9 / n8;
        int n13 = n9 % n8;
        int n14 = 0;
        n9 = n11;
        while (n10 <= n8) {
            if ((n9 += n13) > 0 && n8 - n9 < n13) {
                n11 = n12 + 1;
                n9 -= n8;
            } else {
                n11 = n12;
            }
            nArray2[n10] = n14 += n11;
            ++n10;
        }
        return nArray2;
    }

    private void T2() {
        this.M.clear();
        this.N.clear();
    }

    private int U2(RecyclerView.B b8) {
        if (this.P() != 0 && b8.b() != 0) {
            this.Y1();
            boolean bl = this.s2();
            View view = this.c2(bl ^ true, true);
            View view2 = this.b2(bl ^ true, true);
            if (view != null && view2 != null) {
                int n8 = this.O.b(this.m0(view), this.J);
                int n9 = this.O.b(this.m0(view2), this.J);
                int n10 = Math.min(n8, n9);
                n8 = Math.max(n8, n9);
                n9 = this.O.b(b8.b() - 1, this.J);
                n10 = this.x ? Math.max(0, n9 + 1 - n8 - 1) : Math.max(0, n10);
                if (!bl) {
                    return n10;
                }
                n8 = Math.abs(this.u.d(view2) - this.u.g(view));
                n9 = this.O.b(this.m0(view), this.J);
                int n11 = this.O.b(this.m0(view2), this.J);
                float f8 = (float)n8 / (float)(n11 - n9 + 1);
                return Math.round((float)n10 * f8 + (float)(this.u.m() - this.u.g(view)));
            }
        }
        return 0;
    }

    private int V2(RecyclerView.B b8) {
        if (this.P() != 0 && b8.b() != 0) {
            this.Y1();
            View view = this.c2(this.s2() ^ true, true);
            View view2 = this.b2(this.s2() ^ true, true);
            if (view != null && view2 != null) {
                if (!this.s2()) {
                    return this.O.b(b8.b() - 1, this.J) + 1;
                }
                int n8 = this.u.d(view2);
                int n9 = this.u.g(view);
                int n10 = this.O.b(this.m0(view), this.J);
                int n11 = this.O.b(this.m0(view2), this.J);
                int n12 = this.O.b(b8.b() - 1, this.J);
                return (int)((float)(n8 - n9) / (float)(n11 - n10 + 1) * (float)(n12 + 1));
            }
        }
        return 0;
    }

    private void W2(RecyclerView.w w8, RecyclerView.B b8, LinearLayoutManager.a a8, int n8) {
        int n9;
        int n10;
        int n11 = n8 == 1 ? 1 : 0;
        n8 = this.b3(w8, b8, a8.b);
        if (n11 != 0) {
            while (n8 > 0 && (n8 = a8.b) > 0) {
                a8.b = --n8;
                n8 = this.b3(w8, b8, n8);
            }
            return;
        }
        int n12 = b8.b();
        n11 = a8.b;
        while (n11 < n12 - 1 && (n10 = this.b3(w8, b8, n9 = n11 + 1)) > n8) {
            n11 = n9;
            n8 = n10;
        }
        a8.b = n11;
    }

    private void X2() {
        View[] viewArray = this.L;
        if (viewArray != null && viewArray.length == this.J) {
            return;
        }
        this.L = new View[this.J];
    }

    private int a3(RecyclerView.w object, RecyclerView.B b8, int n8) {
        if (!b8.e()) {
            return this.O.b(n8, this.J);
        }
        int n9 = ((RecyclerView.w)object).f(n8);
        if (n9 == -1) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Cannot find span size for pre layout position. ");
            ((StringBuilder)object).append(n8);
            Log.w((String)"GridLayoutManager", (String)((StringBuilder)object).toString());
            return 0;
        }
        return this.O.b(n9, this.J);
    }

    private int b3(RecyclerView.w object, RecyclerView.B b8, int n8) {
        if (!b8.e()) {
            return this.O.c(n8, this.J);
        }
        int n9 = this.N.get(n8, -1);
        if (n9 != -1) {
            return n9;
        }
        n9 = ((RecyclerView.w)object).f(n8);
        if (n9 == -1) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
            ((StringBuilder)object).append(n8);
            Log.w((String)"GridLayoutManager", (String)((StringBuilder)object).toString());
            return 0;
        }
        return this.O.c(n9, this.J);
    }

    private int c3(RecyclerView.w object, RecyclerView.B b8, int n8) {
        if (!b8.e()) {
            return this.O.f(n8);
        }
        int n9 = this.M.get(n8, -1);
        if (n9 != -1) {
            return n9;
        }
        n9 = ((RecyclerView.w)object).f(n8);
        if (n9 == -1) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
            ((StringBuilder)object).append(n8);
            Log.w((String)"GridLayoutManager", (String)((StringBuilder)object).toString());
            return 1;
        }
        return this.O.f(n9);
    }

    private void d3(float f8, int n8) {
        this.R2(Math.max(Math.round(f8 * (float)this.J), n8));
    }

    private void e3(View view, int n8, boolean bl) {
        b b8 = (b)view.getLayoutParams();
        Rect rect = b8.b;
        int n9 = rect.top + rect.bottom + b8.topMargin + b8.bottomMargin;
        int n10 = rect.left + rect.right + b8.leftMargin + b8.rightMargin;
        int n11 = this.Y2(b8.e, b8.f);
        if (this.s == 1) {
            n10 = RecyclerView.p.Q(n11, n8, n10, b8.width, false);
            n8 = RecyclerView.p.Q(this.u.n(), this.d0(), n9, b8.height, true);
        } else {
            n8 = RecyclerView.p.Q(n11, n8, n9, b8.height, false);
            n10 = RecyclerView.p.Q(this.u.n(), this.u0(), n10, b8.width, true);
        }
        this.f3(view, n10, n8, bl);
    }

    private void f3(View view, int n8, int n9, boolean bl) {
        RecyclerView.q q8 = (RecyclerView.q)view.getLayoutParams();
        if (bl = bl ? this.M1(view, n8, n9, q8) : this.K1(view, n8, n9, q8)) {
            view.measure(n8, n9);
        }
    }

    private void h3() {
        int n8;
        int n9;
        if (this.q2() == 1) {
            n9 = this.t0() - this.k0();
            n8 = this.j0();
        } else {
            n9 = this.c0() - this.i0();
            n8 = this.l0();
        }
        this.R2(n9 - n8);
    }

    @Override
    public int A(RecyclerView.B b8) {
        if (this.Q) {
            return this.U2(b8);
        }
        return super.A(b8);
    }

    @Override
    public int B(RecyclerView.B b8) {
        if (this.Q) {
            return this.V2(b8);
        }
        return super.B(b8);
    }

    @Override
    public int B1(int n8, RecyclerView.w w8, RecyclerView.B b8) {
        this.h3();
        this.X2();
        return super.B1(n8, w8, b8);
    }

    @Override
    public int D1(int n8, RecyclerView.w w8, RecyclerView.B b8) {
        this.h3();
        this.X2();
        return super.D1(n8, w8, b8);
    }

    @Override
    public void G2(boolean bl) {
        if (!bl) {
            super.G2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override
    public void H1(Rect object, int n8, int n9) {
        if (this.K == null) {
            super.H1((Rect)object, n8, n9);
        }
        int n10 = this.j0() + this.k0();
        int n11 = this.l0() + this.i0();
        if (this.s == 1) {
            n9 = RecyclerView.p.t(n9, object.height() + n11, this.g0());
            object = this.K;
            n8 = RecyclerView.p.t(n8, (int)(object[((Rect)object).length - 1] + n10), this.h0());
        } else {
            n8 = RecyclerView.p.t(n8, object.width() + n10, this.h0());
            object = this.K;
            n9 = RecyclerView.p.t(n9, (int)(object[((Rect)object).length - 1] + n11), this.g0());
        }
        this.G1(n8, n9);
    }

    @Override
    public RecyclerView.q J() {
        if (this.s == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    @Override
    public RecyclerView.q K(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override
    public RecyclerView.q L(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams)layoutParams);
        }
        return new b(layoutParams);
    }

    @Override
    public View O0(View object, int n8, RecyclerView.w w8, RecyclerView.B b8) {
        int n9;
        int n10;
        View view = this.H((View)object);
        b b9 = null;
        if (view == null) {
            return null;
        }
        b b10 = (b)view.getLayoutParams();
        int n11 = b10.e;
        int n12 = b10.f + n11;
        if (super.O0((View)object, n8, w8, b8) == null) {
            return null;
        }
        boolean bl = this.W1(n8) == 1;
        if (bl != this.x) {
            n8 = this.P() - 1;
            n10 = -1;
            n9 = -1;
        } else {
            n10 = this.P();
            n8 = 0;
            n9 = 1;
        }
        int n13 = this.s == 1 && this.r2() ? 1 : 0;
        int n14 = this.a3(w8, b8, n8);
        int n15 = n8;
        int n16 = 0;
        int n17 = -1;
        int n18 = -1;
        n8 = 0;
        object = null;
        while (n15 != n10) {
            block16: {
                int n19;
                int n20;
                b b11;
                int n21;
                block17: {
                    int n22;
                    block18: {
                        block15: {
                            n21 = this.a3(w8, b8, n15);
                            b10 = this.O(n15);
                            if (b10 == view) break;
                            if (!b10.hasFocusable() || n21 == n14) break block15;
                            if (b9 != null) {
                                break;
                            }
                            break block16;
                        }
                        b11 = (b)b10.getLayoutParams();
                        n20 = b11.e;
                        n19 = b11.f + n20;
                        if (b10.hasFocusable() && n20 == n11 && n19 == n12) {
                            return b10;
                        }
                        if (b10.hasFocusable() && b9 == null || !b10.hasFocusable() && object == null) break block17;
                        n21 = Math.max(n20, n11);
                        n22 = Math.min(n19, n12) - n21;
                        if (!b10.hasFocusable()) break block18;
                        if (n22 <= n16 && (n22 != n16 || n13 != (n21 = n20 > n17 ? 1 : 0))) break block16;
                        break block17;
                    }
                    if (b9 != null) break block16;
                    n21 = 1;
                    if (!this.D0((View)b10, false, true)) break block16;
                    if (n22 > n8) break block17;
                    if (n22 != n8) break block16;
                    if (n20 <= n18) {
                        n21 = 0;
                    }
                    if (n13 != n21) break block16;
                }
                if (b10.hasFocusable()) {
                    n17 = b11.e;
                    n16 = Math.min(n19, n12);
                    n21 = Math.max(n20, n11);
                    b9 = b10;
                    n16 -= n21;
                } else {
                    n18 = b11.e;
                    n8 = Math.min(n19, n12) - Math.max(n20, n11);
                    object = b10;
                }
            }
            n15 += n9;
        }
        if (b9 != null) {
            return b9;
        }
        return object;
    }

    @Override
    public boolean Q1() {
        return this.D == null && !this.I;
    }

    @Override
    public void R0(RecyclerView.w w8, RecyclerView.B b8, H h8) {
        super.R0(w8, b8, h8);
        h8.m0(GridView.class.getName());
    }

    @Override
    void S1(RecyclerView.B b8, LinearLayoutManager.c c8, RecyclerView.p.c c9) {
        int n8 = this.J;
        for (int i8 = 0; i8 < this.J && c8.c(b8) && n8 > 0; ++i8) {
            int n9 = c8.d;
            c9.a(n9, Math.max(0, c8.g));
            n8 -= this.O.f(n9);
            c8.d += c8.e;
        }
    }

    @Override
    public int T(RecyclerView.w w8, RecyclerView.B b8) {
        if (this.s == 1) {
            return this.J;
        }
        if (b8.b() < 1) {
            return 0;
        }
        return this.a3(w8, b8, b8.b() - 1) + 1;
    }

    @Override
    public void U0(RecyclerView.w w8, RecyclerView.B b8, View object, H h8) {
        ViewGroup.LayoutParams layoutParams = object.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.T0((View)object, h8);
            return;
        }
        object = (b)layoutParams;
        int n8 = this.a3(w8, b8, ((RecyclerView.q)((Object)object)).a());
        if (this.s == 0) {
            h8.p0(H.f.a(((b)((Object)object)).e(), ((b)((Object)object)).f(), n8, 1, false, false));
            return;
        }
        h8.p0(H.f.a(n8, 1, ((b)((Object)object)).e(), ((b)((Object)object)).f(), false, false));
    }

    @Override
    public void W0(RecyclerView recyclerView, int n8, int n9) {
        this.O.h();
        this.O.g();
    }

    @Override
    public void X0(RecyclerView recyclerView) {
        this.O.h();
        this.O.g();
    }

    @Override
    public void Y0(RecyclerView recyclerView, int n8, int n9, int n10) {
        this.O.h();
        this.O.g();
    }

    int Y2(int n8, int n9) {
        if (this.s == 1 && this.r2()) {
            int[] nArray = this.K;
            int n10 = this.J;
            return nArray[n10 - n8] - nArray[n10 - n8 - n9];
        }
        int[] nArray = this.K;
        return nArray[n9 + n8] - nArray[n8];
    }

    @Override
    public void Z0(RecyclerView recyclerView, int n8, int n9) {
        this.O.h();
        this.O.g();
    }

    public int Z2() {
        return this.J;
    }

    @Override
    public void b1(RecyclerView recyclerView, int n8, int n9, Object object) {
        this.O.h();
        this.O.g();
    }

    @Override
    public void c1(RecyclerView.w w8, RecyclerView.B b8) {
        if (b8.e()) {
            this.Q2();
        }
        super.c1(w8, b8);
        this.T2();
    }

    @Override
    public void d1(RecyclerView.B b8) {
        super.d1(b8);
        this.I = false;
    }

    public void g3(int n8) {
        if (n8 == this.J) {
            return;
        }
        this.I = true;
        if (n8 >= 1) {
            this.J = n8;
            this.O.h();
            this.y1();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Span count should be at least 1. Provided ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Override
    View k2(RecyclerView.w w8, RecyclerView.B b8, boolean bl, boolean bl2) {
        int n8;
        int n9 = this.P();
        int n10 = 1;
        if (bl2) {
            n8 = this.P() - 1;
            n9 = -1;
            n10 = -1;
        } else {
            n8 = 0;
        }
        int n11 = b8.b();
        this.Y1();
        int n12 = this.u.m();
        int n13 = this.u.i();
        View view = null;
        View view2 = null;
        while (n8 != n9) {
            View view3 = this.O(n8);
            int n14 = this.m0(view3);
            View view4 = view;
            View view5 = view2;
            if (n14 >= 0) {
                view4 = view;
                view5 = view2;
                if (n14 < n11) {
                    if (this.b3(w8, b8, n14) != 0) {
                        view4 = view;
                        view5 = view2;
                    } else if (((RecyclerView.q)view3.getLayoutParams()).c()) {
                        view4 = view;
                        view5 = view2;
                        if (view2 == null) {
                            view5 = view3;
                            view4 = view;
                        }
                    } else {
                        if (this.u.g(view3) < n13 && this.u.d(view3) >= n12) {
                            return view3;
                        }
                        view4 = view;
                        view5 = view2;
                        if (view == null) {
                            view4 = view3;
                            view5 = view2;
                        }
                    }
                }
            }
            n8 += n10;
            view = view4;
            view2 = view5;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    @Override
    public int p0(RecyclerView.w w8, RecyclerView.B b8) {
        if (this.s == 0) {
            return this.J;
        }
        if (b8.b() < 1) {
            return 0;
        }
        return this.a3(w8, b8, b8.b() - 1) + 1;
    }

    @Override
    public boolean s(RecyclerView.q q8) {
        return q8 instanceof b;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    void t2(RecyclerView.w object, RecyclerView.B object2, LinearLayoutManager.c c8, LinearLayoutManager.b b8) {
        View view;
        int n8;
        int n9;
        int n10;
        int n11 = this.u.l();
        int n12 = n11 != 0x40000000 ? 1 : 0;
        int n13 = this.P() > 0 ? this.K[this.J] : 0;
        if (n12 != 0) {
            this.h3();
        }
        boolean bl = c8.e == 1;
        int n14 = this.J;
        if (!bl) {
            n14 = this.b3((RecyclerView.w)object, (RecyclerView.B)object2, c8.d) + this.c3((RecyclerView.w)object, (RecyclerView.B)object2, c8.d);
        }
        for (n10 = 0; n10 < this.J && c8.c((RecyclerView.B)object2) && n14 > 0; ++n10) {
            n9 = c8.d;
            n8 = this.c3((RecyclerView.w)object, (RecyclerView.B)object2, n9);
            if (n8 > this.J) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Item at position ");
                ((StringBuilder)object).append(n9);
                ((StringBuilder)object).append(" requires ");
                ((StringBuilder)object).append(n8);
                ((StringBuilder)object).append(" spans but GridLayoutManager has only ");
                ((StringBuilder)object).append(this.J);
                ((StringBuilder)object).append(" spans.");
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
            if ((n14 -= n8) < 0 || (view = c8.d((RecyclerView.w)object)) == null) break;
            this.L[n10] = view;
        }
        if (n10 == 0) {
            b8.b = true;
            return;
        }
        this.P2((RecyclerView.w)object, (RecyclerView.B)object2, n10, bl);
        float f8 = 0.0f;
        n14 = 0;
        for (n9 = 0; n9 < n10; ++n9) {
            object = this.L[n9];
            if (c8.l == null) {
                if (bl) {
                    this.j((View)object);
                } else {
                    this.k((View)object, 0);
                }
            } else if (bl) {
                this.h((View)object);
            } else {
                this.i((View)object, 0);
            }
            this.p((View)object, this.P);
            this.e3((View)object, n11, false);
            int n15 = this.u.e((View)object);
            n8 = n14;
            if (n15 > n14) {
                n8 = n15;
            }
            object2 = (b)object.getLayoutParams();
            float f9 = (float)this.u.f((View)object) * 1.0f / (float)((b)((Object)object2)).f;
            float f10 = f8;
            if (f9 > f8) {
                f10 = f9;
            }
            f8 = f10;
            n14 = n8;
        }
        n9 = n14;
        if (n12 != 0) {
            this.d3(f8, n13);
            n12 = 0;
            n14 = 0;
            while (true) {
                n9 = n14;
                if (n12 >= n10) break;
                object = this.L[n12];
                this.e3((View)object, 0x40000000, true);
                n13 = this.u.e((View)object);
                n9 = n14;
                if (n13 > n14) {
                    n9 = n13;
                }
                ++n12;
                n14 = n9;
            }
        }
        for (n14 = 0; n14 < n10; ++n14) {
            view = this.L[n14];
            if (this.u.e(view) == n9) continue;
            object = (b)view.getLayoutParams();
            object2 = ((RecyclerView.q)((Object)object)).b;
            n13 = ((Rect)object2).top + ((Rect)object2).bottom + ((ViewGroup.MarginLayoutParams)object).topMargin + ((ViewGroup.MarginLayoutParams)object).bottomMargin;
            n12 = ((Rect)object2).left + ((Rect)object2).right + ((ViewGroup.MarginLayoutParams)object).leftMargin + ((ViewGroup.MarginLayoutParams)object).rightMargin;
            n8 = this.Y2(((b)((Object)object)).e, ((b)((Object)object)).f);
            if (this.s == 1) {
                n12 = RecyclerView.p.Q(n8, 0x40000000, n12, ((ViewGroup.MarginLayoutParams)object).width, false);
                n13 = View.MeasureSpec.makeMeasureSpec((int)(n9 - n13), (int)0x40000000);
            } else {
                n12 = View.MeasureSpec.makeMeasureSpec((int)(n9 - n12), (int)0x40000000);
                n13 = RecyclerView.p.Q(n8, 0x40000000, n13, ((ViewGroup.MarginLayoutParams)object).height, false);
            }
            this.f3(view, n12, n13, true);
        }
        b8.a = n9;
        if (this.s == 1) {
            if (c8.f == -1) {
                n13 = c8.b;
                n14 = n13 - n9;
            } else {
                n14 = c8.b;
                n13 = n14 + n9;
            }
            n9 = n14;
            n14 = 0;
            n12 = 0;
        } else {
            if (c8.f == -1) {
                n14 = c8.b;
                n12 = n14 - n9;
            } else {
                n12 = c8.b;
                n14 = n12 + n9;
            }
            n9 = 0;
            n13 = 0;
        }
        n8 = 0;
        while (true) {
            if (n8 >= n10) {
                Arrays.fill(this.L, null);
                return;
            }
            object = this.L[n8];
            object2 = (b)object.getLayoutParams();
            if (this.s == 1) {
                if (this.r2()) {
                    n14 = this.j0() + this.K[this.J - ((b)((Object)object2)).e];
                    n12 = n14 - this.u.f((View)object);
                } else {
                    n14 = this.j0();
                    n12 = this.K[((b)((Object)object2)).e] + n14;
                    n14 = this.u.f((View)object) + n12;
                }
            } else {
                n9 = this.l0();
                n9 = this.K[((b)((Object)object2)).e] + n9;
                n13 = this.u.f((View)object) + n9;
            }
            this.E0((View)object, n12, n9, n14, n13);
            if (((RecyclerView.q)((Object)object2)).c() || ((RecyclerView.q)((Object)object2)).b()) {
                b8.c = true;
            }
            bl = b8.d;
            b8.d = object.hasFocusable() | bl;
            ++n8;
        }
    }

    @Override
    void v2(RecyclerView.w w8, RecyclerView.B b8, LinearLayoutManager.a a8, int n8) {
        super.v2(w8, b8, a8, n8);
        this.h3();
        if (b8.b() > 0 && !b8.e()) {
            this.W2(w8, b8, a8, n8);
        }
        this.X2();
    }

    @Override
    public int x(RecyclerView.B b8) {
        if (this.Q) {
            return this.U2(b8);
        }
        return super.x(b8);
    }

    @Override
    public int y(RecyclerView.B b8) {
        if (this.Q) {
            return this.V2(b8);
        }
        return super.y(b8);
    }

    public static final class a
    extends c {
        @Override
        public int e(int n8, int n9) {
            return n8 % n9;
        }

        @Override
        public int f(int n8) {
            return 1;
        }
    }

    public static class b
    extends RecyclerView.q {
        int e = -1;
        int f = 0;

        public b(int n8, int n9) {
            super(n8, n9);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public int e() {
            return this.e;
        }

        public int f() {
            return this.f;
        }
    }

    public static abstract class c {
        final SparseIntArray a = new SparseIntArray();
        final SparseIntArray b = new SparseIntArray();
        private boolean c = false;
        private boolean d = false;

        static int a(SparseIntArray sparseIntArray, int n8) {
            int n9 = sparseIntArray.size() - 1;
            int n10 = 0;
            while (n10 <= n9) {
                int n11 = n10 + n9 >>> 1;
                if (sparseIntArray.keyAt(n11) < n8) {
                    n10 = n11 + 1;
                    continue;
                }
                n9 = n11 - 1;
            }
            n8 = n10 - 1;
            if (n8 >= 0 && n8 < sparseIntArray.size()) {
                return sparseIntArray.keyAt(n8);
            }
            return -1;
        }

        int b(int n8, int n9) {
            if (!this.d) {
                return this.d(n8, n9);
            }
            int n10 = this.b.get(n8, -1);
            if (n10 != -1) {
                return n10;
            }
            n9 = this.d(n8, n9);
            this.b.put(n8, n9);
            return n9;
        }

        int c(int n8, int n9) {
            if (!this.c) {
                return this.e(n8, n9);
            }
            int n10 = this.a.get(n8, -1);
            if (n10 != -1) {
                return n10;
            }
            n9 = this.e(n8, n9);
            this.a.put(n8, n9);
            return n9;
        }

        /*
         * Enabled aggressive block sorting
         */
        public int d(int n8, int n9) {
            int n10;
            int n11;
            int n12;
            int n13;
            int n14;
            int n15;
            block5: {
                block6: {
                    block4: {
                        if (!this.d || (n15 = androidx.recyclerview.widget.GridLayoutManager$c.a(this.b, n8)) == -1) break block4;
                        n14 = this.b.get(n15);
                        n13 = n15 + 1;
                        n12 = this.c(n15, n9) + this.f(n15);
                        n15 = n14;
                        n11 = n13;
                        n10 = n12;
                        if (n12 != n9) break block5;
                        n15 = n14 + 1;
                        n11 = n13;
                        break block6;
                    }
                    n15 = 0;
                    n11 = 0;
                }
                n10 = 0;
            }
            int n16 = this.f(n8);
            n13 = n11;
            n11 = n15;
            while (n13 < n8) {
                n14 = this.f(n13);
                n12 = n10 + n14;
                if (n12 == n9) {
                    n10 = n11 + 1;
                    n15 = 0;
                } else {
                    n10 = n11;
                    n15 = n12;
                    if (n12 > n9) {
                        n10 = n11 + 1;
                        n15 = n14;
                    }
                }
                ++n13;
                n11 = n10;
                n10 = n15;
            }
            n8 = n11;
            if (n10 + n16 <= n9) return n8;
            return n11 + 1;
        }

        public abstract int e(int var1, int var2);

        public abstract int f(int var1);

        public void g() {
            this.b.clear();
        }

        public void h() {
            this.a.clear();
        }
    }
}

