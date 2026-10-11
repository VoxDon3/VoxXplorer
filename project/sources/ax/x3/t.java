package ax.x3;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public class t extends i.e {
    private final a d;
    private boolean e;
    private boolean f;

    public interface a {
        void b(RecyclerView.F f);

        void c(int i, int i2);

        void e(RecyclerView.F f);

        void g(RecyclerView.F f);
    }

    public t(a aVar, boolean z, boolean z2) {
        this.d = aVar;
        this.e = z2;
        this.f = z;
    }

    @Override // androidx.recyclerview.widget.i.e
    public void A(RecyclerView.F f, int i) {
        if (i != 0) {
            this.d.b(f);
        }
        super.A(f, i);
    }

    @Override // androidx.recyclerview.widget.i.e
    public void B(RecyclerView.F f, int i) {
        this.d.g(f);
    }

    @Override // androidx.recyclerview.widget.i.e
    public void c(RecyclerView recyclerView, RecyclerView.F f) {
        super.c(recyclerView, f);
        this.d.e(f);
    }

    @Override // androidx.recyclerview.widget.i.e
    public int k(RecyclerView recyclerView, RecyclerView.F f) {
        return i.e.t(3, i.e.s(1, 8));
    }

    @Override // androidx.recyclerview.widget.i.e
    public boolean q() {
        return this.e;
    }

    @Override // androidx.recyclerview.widget.i.e
    public boolean r() {
        return this.f;
    }

    @Override // androidx.recyclerview.widget.i.e
    public boolean y(RecyclerView recyclerView, RecyclerView.F f, RecyclerView.F f2) {
        if (f.k() < 0 || f2.k() < 0) {
            return false;
        }
        this.d.c(f.k(), f2.k());
        return true;
    }
}
