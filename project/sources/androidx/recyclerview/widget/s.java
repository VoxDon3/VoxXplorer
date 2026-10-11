package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class s extends RecyclerView.m {
    boolean g = true;

    @SuppressLint({"UnknownNullness"})
    public abstract boolean A(RecyclerView.F f);

    @SuppressLint({"UnknownNullness"})
    public final void B(RecyclerView.F f) {
        J(f);
        h(f);
    }

    @SuppressLint({"UnknownNullness"})
    public final void C(RecyclerView.F f) {
        K(f);
    }

    @SuppressLint({"UnknownNullness"})
    public final void D(RecyclerView.F f, boolean z) {
        L(f, z);
        h(f);
    }

    @SuppressLint({"UnknownNullness"})
    public final void E(RecyclerView.F f, boolean z) {
        M(f, z);
    }

    @SuppressLint({"UnknownNullness"})
    public final void F(RecyclerView.F f) {
        N(f);
        h(f);
    }

    @SuppressLint({"UnknownNullness"})
    public final void G(RecyclerView.F f) {
        O(f);
    }

    @SuppressLint({"UnknownNullness"})
    public final void H(RecyclerView.F f) {
        P(f);
        h(f);
    }

    @SuppressLint({"UnknownNullness"})
    public final void I(RecyclerView.F f) {
        Q(f);
    }

    @SuppressLint({"UnknownNullness"})
    public void J(RecyclerView.F f) {
    }

    @SuppressLint({"UnknownNullness"})
    public void K(RecyclerView.F f) {
    }

    @SuppressLint({"UnknownNullness"})
    public void L(RecyclerView.F f, boolean z) {
    }

    @SuppressLint({"UnknownNullness"})
    public void M(RecyclerView.F f, boolean z) {
    }

    @SuppressLint({"UnknownNullness"})
    public void N(RecyclerView.F f) {
    }

    @SuppressLint({"UnknownNullness"})
    public void O(RecyclerView.F f) {
    }

    @SuppressLint({"UnknownNullness"})
    public void P(RecyclerView.F f) {
    }

    @SuppressLint({"UnknownNullness"})
    public void Q(RecyclerView.F f) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a(RecyclerView.F f, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i;
        int i2;
        return (cVar == null || ((i = cVar.a) == (i2 = cVar2.a) && cVar.b == cVar2.b)) ? x(f) : z(f, i, cVar.b, i2, cVar2.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean b(RecyclerView.F f, RecyclerView.F f2, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i;
        int i2;
        int i3 = cVar.a;
        int i4 = cVar.b;
        if (f2.K()) {
            int i5 = cVar.a;
            i2 = cVar.b;
            i = i5;
        } else {
            i = cVar2.a;
            i2 = cVar2.b;
        }
        return y(f, f2, i3, i4, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean c(RecyclerView.F f, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i = cVar.a;
        int i2 = cVar.b;
        View view = f.a;
        int left = cVar2 == null ? view.getLeft() : cVar2.a;
        int top = cVar2 == null ? view.getTop() : cVar2.b;
        if (f.w() || (i == left && i2 == top)) {
            return A(f);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return z(f, i, i2, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean d(RecyclerView.F f, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i = cVar.a;
        int i2 = cVar2.a;
        if (i != i2 || cVar.b != cVar2.b) {
            return z(f, i, cVar.b, i2, cVar2.b);
        }
        F(f);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean f(RecyclerView.F f) {
        return !this.g || f.u();
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean x(RecyclerView.F f);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean y(RecyclerView.F f, RecyclerView.F f2, int i, int i2, int i3, int i4);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean z(RecyclerView.F f, int i, int i2, int i3, int i4);
}
