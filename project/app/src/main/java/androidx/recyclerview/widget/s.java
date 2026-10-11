/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;

public abstract class s
extends RecyclerView.m {
    boolean g = true;

    @SuppressLint(value={"UnknownNullness"})
    public abstract boolean A(RecyclerView.F var1);

    @SuppressLint(value={"UnknownNullness"})
    public final void B(RecyclerView.F f8) {
        this.J(f8);
        this.h(f8);
    }

    @SuppressLint(value={"UnknownNullness"})
    public final void C(RecyclerView.F f8) {
        this.K(f8);
    }

    @SuppressLint(value={"UnknownNullness"})
    public final void D(RecyclerView.F f8, boolean bl) {
        this.L(f8, bl);
        this.h(f8);
    }

    @SuppressLint(value={"UnknownNullness"})
    public final void E(RecyclerView.F f8, boolean bl) {
        this.M(f8, bl);
    }

    @SuppressLint(value={"UnknownNullness"})
    public final void F(RecyclerView.F f8) {
        this.N(f8);
        this.h(f8);
    }

    @SuppressLint(value={"UnknownNullness"})
    public final void G(RecyclerView.F f8) {
        this.O(f8);
    }

    @SuppressLint(value={"UnknownNullness"})
    public final void H(RecyclerView.F f8) {
        this.P(f8);
        this.h(f8);
    }

    @SuppressLint(value={"UnknownNullness"})
    public final void I(RecyclerView.F f8) {
        this.Q(f8);
    }

    @SuppressLint(value={"UnknownNullness"})
    public void J(RecyclerView.F f8) {
    }

    @SuppressLint(value={"UnknownNullness"})
    public void K(RecyclerView.F f8) {
    }

    @SuppressLint(value={"UnknownNullness"})
    public void L(RecyclerView.F f8, boolean bl) {
    }

    @SuppressLint(value={"UnknownNullness"})
    public void M(RecyclerView.F f8, boolean bl) {
    }

    @SuppressLint(value={"UnknownNullness"})
    public void N(RecyclerView.F f8) {
    }

    @SuppressLint(value={"UnknownNullness"})
    public void O(RecyclerView.F f8) {
    }

    @SuppressLint(value={"UnknownNullness"})
    public void P(RecyclerView.F f8) {
    }

    @SuppressLint(value={"UnknownNullness"})
    public void Q(RecyclerView.F f8) {
    }

    @Override
    public boolean a(RecyclerView.F f8, RecyclerView.m.c c8, RecyclerView.m.c c9) {
        int n8;
        int n9;
        if (c8 != null && ((n9 = c8.a) != (n8 = c9.a) || c8.b != c9.b)) {
            return this.z(f8, n9, c8.b, n8, c9.b);
        }
        return this.x(f8);
    }

    @Override
    public boolean b(RecyclerView.F f8, RecyclerView.F f9, RecyclerView.m.c c8, RecyclerView.m.c c9) {
        int n8;
        int n9;
        int n10 = c8.a;
        int n11 = c8.b;
        if (f9.K()) {
            n9 = c8.a;
            n8 = c8.b;
        } else {
            n9 = c9.a;
            n8 = c9.b;
        }
        return this.y(f8, f9, n10, n11, n9, n8);
    }

    @Override
    public boolean c(RecyclerView.F f8, RecyclerView.m.c c8, RecyclerView.m.c c9) {
        int n8 = c8.a;
        int n9 = c8.b;
        c8 = f8.a;
        int n10 = c9 == null ? c8.getLeft() : c9.a;
        int n11 = c9 == null ? c8.getTop() : c9.b;
        if (!(f8.w() || n8 == n10 && n9 == n11)) {
            c8.layout(n10, n11, c8.getWidth() + n10, c8.getHeight() + n11);
            return this.z(f8, n8, n9, n10, n11);
        }
        return this.A(f8);
    }

    @Override
    public boolean d(RecyclerView.F f8, RecyclerView.m.c c8, RecyclerView.m.c c9) {
        int n8 = c8.a;
        int n9 = c9.a;
        if (n8 == n9 && c8.b == c9.b) {
            this.F(f8);
            return false;
        }
        return this.z(f8, n8, c8.b, n9, c9.b);
    }

    @Override
    public boolean f(RecyclerView.F f8) {
        return !this.g || f8.u();
        {
        }
    }

    @SuppressLint(value={"UnknownNullness"})
    public abstract boolean x(RecyclerView.F var1);

    @SuppressLint(value={"UnknownNullness"})
    public abstract boolean y(RecyclerView.F var1, RecyclerView.F var2, int var3, int var4, int var5, int var6);

    @SuppressLint(value={"UnknownNullness"})
    public abstract boolean z(RecyclerView.F var1, int var2, int var3, int var4, int var5);
}

