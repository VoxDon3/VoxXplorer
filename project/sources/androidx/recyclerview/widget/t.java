package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class t extends RecyclerView.s {
    RecyclerView a;
    private Scroller b;
    private final RecyclerView.u c = new a();

    class a extends RecyclerView.u {
        boolean a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i) {
            super.a(recyclerView, i);
            if (i == 0 && this.a) {
                this.a = false;
                t.this.j();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.a = true;
        }
    }

    private void e() {
        this.a.n1(this.c);
        this.a.setOnFlingListener(null);
    }

    private void h() throws IllegalStateException {
        if (this.a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.a.n(this.c);
        this.a.setOnFlingListener(this);
    }

    private boolean i(RecyclerView.p pVar, int i, int i2) {
        RecyclerView.A d;
        int g;
        if (!(pVar instanceof RecyclerView.A.b) || (d = d(pVar)) == null || (g = g(pVar, i, i2)) == -1) {
            return false;
        }
        d.p(g);
        pVar.O1(d);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean a(int i, int i2) {
        RecyclerView.p layoutManager = this.a.getLayoutManager();
        if (layoutManager == null || this.a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.a.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && i(layoutManager, i, i2);
    }

    public void b(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e();
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            h();
            this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
            j();
        }
    }

    public abstract int[] c(RecyclerView.p pVar, View view);

    protected abstract RecyclerView.A d(RecyclerView.p pVar);

    @SuppressLint({"UnknownNullness"})
    public abstract View f(RecyclerView.p pVar);

    @SuppressLint({"UnknownNullness"})
    public abstract int g(RecyclerView.p pVar, int i, int i2);

    void j() {
        RecyclerView.p layoutManager;
        View f;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (f = f(layoutManager)) == null) {
            return;
        }
        int[] c = c(layoutManager, f);
        int i = c[0];
        if (i == 0 && c[1] == 0) {
            return;
        }
        this.a.B1(i, c[1]);
    }
}
