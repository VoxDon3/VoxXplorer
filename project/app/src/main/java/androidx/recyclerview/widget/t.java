/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

public abstract class t
extends RecyclerView.s {
    RecyclerView a;
    private Scroller b;
    private final RecyclerView.u c = new RecyclerView.u(this){
        boolean a;
        final t b;
        {
            this.b = t8;
            this.a = false;
        }

        @Override
        public void a(RecyclerView recyclerView, int n8) {
            super.a(recyclerView, n8);
            if (n8 == 0 && this.a) {
                this.a = false;
                this.b.j();
            }
        }

        @Override
        public void b(RecyclerView recyclerView, int n8, int n9) {
            if (n8 == 0 && n9 == 0) {
                return;
            }
            this.a = true;
        }
    };

    private void e() {
        this.a.n1(this.c);
        this.a.setOnFlingListener(null);
    }

    private void h() throws IllegalStateException {
        if (this.a.getOnFlingListener() == null) {
            this.a.n(this.c);
            this.a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    private boolean i(RecyclerView.p p8, int n8, int n9) {
        if (!(p8 instanceof RecyclerView.A.b)) {
            return false;
        }
        RecyclerView.A a8 = this.d(p8);
        if (a8 == null) {
            return false;
        }
        if ((n8 = this.g(p8, n8, n9)) == -1) {
            return false;
        }
        a8.p(n8);
        p8.O1(a8);
        return true;
    }

    @Override
    public boolean a(int n8, int n9) {
        RecyclerView.p p8 = this.a.getLayoutManager();
        if (p8 == null) {
            return false;
        }
        if (this.a.getAdapter() == null) {
            return false;
        }
        int n10 = this.a.getMinFlingVelocity();
        return (Math.abs(n9) > n10 || Math.abs(n8) > n10) && this.i(p8, n8, n9);
    }

    public void b(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                this.e();
            }
            this.a = recyclerView;
            if (recyclerView != null) {
                this.h();
                this.b = new Scroller(this.a.getContext(), (Interpolator)new DecelerateInterpolator());
                this.j();
            }
        }
    }

    public abstract int[] c(RecyclerView.p var1, View var2);

    protected abstract RecyclerView.A d(RecyclerView.p var1);

    @SuppressLint(value={"UnknownNullness"})
    public abstract View f(RecyclerView.p var1);

    @SuppressLint(value={"UnknownNullness"})
    public abstract int g(RecyclerView.p var1, int var2, int var3);

    void j() {
        Object object;
        RecyclerView.p p8;
        Object object2 = this.a;
        if (object2 == null || (p8 = ((RecyclerView)object2).getLayoutManager()) == null || (object2 = this.f(p8)) == null || (object = (object2 = (Object)this.c(p8, (View)object2))[0]) == false && object2[1] == false) {
            return;
        }
        this.a.B1((int)object, (int)object2[1]);
    }
}

