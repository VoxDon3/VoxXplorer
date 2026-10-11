/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class o {
    protected final RecyclerView.p a;
    private int b = Integer.MIN_VALUE;
    final Rect c = new Rect();

    private o(RecyclerView.p p8) {
        this.a = p8;
    }

    public static o a(RecyclerView.p p8) {
        return new o(p8){

            @Override
            public int d(View view) {
                RecyclerView.q q8 = (RecyclerView.q)view.getLayoutParams();
                return this.a.Z(view) + q8.rightMargin;
            }

            @Override
            public int e(View view) {
                RecyclerView.q q8 = (RecyclerView.q)view.getLayoutParams();
                return this.a.Y(view) + q8.leftMargin + q8.rightMargin;
            }

            @Override
            public int f(View view) {
                RecyclerView.q q8 = (RecyclerView.q)view.getLayoutParams();
                return this.a.X(view) + q8.topMargin + q8.bottomMargin;
            }

            @Override
            public int g(View view) {
                RecyclerView.q q8 = (RecyclerView.q)view.getLayoutParams();
                return this.a.W(view) - q8.leftMargin;
            }

            @Override
            public int h() {
                return this.a.t0();
            }

            @Override
            public int i() {
                return this.a.t0() - this.a.k0();
            }

            @Override
            public int j() {
                return this.a.k0();
            }

            @Override
            public int k() {
                return this.a.u0();
            }

            @Override
            public int l() {
                return this.a.d0();
            }

            @Override
            public int m() {
                return this.a.j0();
            }

            @Override
            public int n() {
                return this.a.t0() - this.a.j0() - this.a.k0();
            }

            @Override
            public int p(View view) {
                this.a.s0(view, true, this.c);
                return this.c.right;
            }

            @Override
            public int q(View view) {
                this.a.s0(view, true, this.c);
                return this.c.left;
            }

            @Override
            public void r(int n8) {
                this.a.H0(n8);
            }
        };
    }

    public static o b(RecyclerView.p p8, int n8) {
        if (n8 != 0) {
            if (n8 == 1) {
                return o.c(p8);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return o.a(p8);
    }

    public static o c(RecyclerView.p p8) {
        return new o(p8){

            @Override
            public int d(View view) {
                RecyclerView.q q8 = (RecyclerView.q)view.getLayoutParams();
                return this.a.U(view) + q8.bottomMargin;
            }

            @Override
            public int e(View view) {
                RecyclerView.q q8 = (RecyclerView.q)view.getLayoutParams();
                return this.a.X(view) + q8.topMargin + q8.bottomMargin;
            }

            @Override
            public int f(View view) {
                RecyclerView.q q8 = (RecyclerView.q)view.getLayoutParams();
                return this.a.Y(view) + q8.leftMargin + q8.rightMargin;
            }

            @Override
            public int g(View view) {
                RecyclerView.q q8 = (RecyclerView.q)view.getLayoutParams();
                return this.a.a0(view) - q8.topMargin;
            }

            @Override
            public int h() {
                return this.a.c0();
            }

            @Override
            public int i() {
                return this.a.c0() - this.a.i0();
            }

            @Override
            public int j() {
                return this.a.i0();
            }

            @Override
            public int k() {
                return this.a.d0();
            }

            @Override
            public int l() {
                return this.a.u0();
            }

            @Override
            public int m() {
                return this.a.l0();
            }

            @Override
            public int n() {
                return this.a.c0() - this.a.l0() - this.a.i0();
            }

            @Override
            public int p(View view) {
                this.a.s0(view, true, this.c);
                return this.c.bottom;
            }

            @Override
            public int q(View view) {
                this.a.s0(view, true, this.c);
                return this.c.top;
            }

            @Override
            public void r(int n8) {
                this.a.I0(n8);
            }
        };
    }

    public abstract int d(View var1);

    public abstract int e(View var1);

    public abstract int f(View var1);

    public abstract int g(View var1);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return this.n() - this.b;
    }

    public abstract int p(View var1);

    public abstract int q(View var1);

    public abstract void r(int var1);

    public void s() {
        this.b = this.n();
    }
}

