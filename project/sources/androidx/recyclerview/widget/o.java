package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class o {
    protected final RecyclerView.p a;
    private int b;
    final Rect c;

    class a extends o {
        a(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.o
        public int d(View view) {
            return this.a.Z(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.o
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.a.Y(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.o
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.a.X(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.o
        public int g(View view) {
            return this.a.W(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.o
        public int h() {
            return this.a.t0();
        }

        @Override // androidx.recyclerview.widget.o
        public int i() {
            return this.a.t0() - this.a.k0();
        }

        @Override // androidx.recyclerview.widget.o
        public int j() {
            return this.a.k0();
        }

        @Override // androidx.recyclerview.widget.o
        public int k() {
            return this.a.u0();
        }

        @Override // androidx.recyclerview.widget.o
        public int l() {
            return this.a.d0();
        }

        @Override // androidx.recyclerview.widget.o
        public int m() {
            return this.a.j0();
        }

        @Override // androidx.recyclerview.widget.o
        public int n() {
            return (this.a.t0() - this.a.j0()) - this.a.k0();
        }

        @Override // androidx.recyclerview.widget.o
        public int p(View view) {
            this.a.s0(view, true, this.c);
            return this.c.right;
        }

        @Override // androidx.recyclerview.widget.o
        public int q(View view) {
            this.a.s0(view, true, this.c);
            return this.c.left;
        }

        @Override // androidx.recyclerview.widget.o
        public void r(int i) {
            this.a.H0(i);
        }
    }

    class b extends o {
        b(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.o
        public int d(View view) {
            return this.a.U(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.o
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.a.X(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.o
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.a.Y(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.o
        public int g(View view) {
            return this.a.a0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.o
        public int h() {
            return this.a.c0();
        }

        @Override // androidx.recyclerview.widget.o
        public int i() {
            return this.a.c0() - this.a.i0();
        }

        @Override // androidx.recyclerview.widget.o
        public int j() {
            return this.a.i0();
        }

        @Override // androidx.recyclerview.widget.o
        public int k() {
            return this.a.d0();
        }

        @Override // androidx.recyclerview.widget.o
        public int l() {
            return this.a.u0();
        }

        @Override // androidx.recyclerview.widget.o
        public int m() {
            return this.a.l0();
        }

        @Override // androidx.recyclerview.widget.o
        public int n() {
            return (this.a.c0() - this.a.l0()) - this.a.i0();
        }

        @Override // androidx.recyclerview.widget.o
        public int p(View view) {
            this.a.s0(view, true, this.c);
            return this.c.bottom;
        }

        @Override // androidx.recyclerview.widget.o
        public int q(View view) {
            this.a.s0(view, true, this.c);
            return this.c.top;
        }

        @Override // androidx.recyclerview.widget.o
        public void r(int i) {
            this.a.I0(i);
        }
    }

    /* synthetic */ o(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    public static o a(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static o b(RecyclerView.p pVar, int i) {
        if (i == 0) {
            return a(pVar);
        }
        if (i == 1) {
            return c(pVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static o c(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

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
        return n() - this.b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i);

    public void s() {
        this.b = n();
    }

    private o(RecyclerView.p pVar) {
        this.b = Integer.MIN_VALUE;
        this.c = new Rect();
        this.a = pVar;
    }
}
