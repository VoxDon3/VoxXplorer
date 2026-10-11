package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends RecyclerView.h<RecyclerView.F> {
    private final d d;

    public static final class a {
        public static final a c = new a(true, b.NO_STABLE_IDS);
        public final boolean a;
        public final b b;

        /* renamed from: androidx.recyclerview.widget.c$a$a, reason: collision with other inner class name */
        public static final class C0039a {
            private boolean a;
            private b b;

            public C0039a() {
                a aVar = a.c;
                this.a = aVar.a;
                this.b = aVar.b;
            }

            public a a() {
                return new a(this.a, this.b);
            }

            public C0039a b(boolean z) {
                this.a = z;
                return this;
            }

            public C0039a c(b bVar) {
                this.b = bVar;
                return this;
            }
        }

        public enum b {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS
        }

        a(boolean z, b bVar) {
            this.a = z;
            this.b = bVar;
        }
    }

    @SafeVarargs
    public c(a aVar, RecyclerView.h<? extends RecyclerView.F>... hVarArr) {
        this(aVar, (List<? extends RecyclerView.h<? extends RecyclerView.F>>) Arrays.asList(hVarArr));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void A(RecyclerView recyclerView) {
        this.d.v(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void B(RecyclerView.F f, int i) {
        this.d.w(f, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.F D(ViewGroup viewGroup, int i) {
        return this.d.x(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void E(RecyclerView recyclerView) {
        this.d.y(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public boolean F(RecyclerView.F f) {
        return this.d.z(f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void G(RecyclerView.F f) {
        this.d.A(f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void H(RecyclerView.F f) {
        this.d.B(f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void I(RecyclerView.F f) {
        this.d.C(f);
    }

    public boolean N(RecyclerView.h<? extends RecyclerView.F> hVar) {
        return this.d.h(hVar);
    }

    void O(RecyclerView.h.a aVar) {
        super.L(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int k(RecyclerView.h<? extends RecyclerView.F> hVar, RecyclerView.F f, int i) {
        return this.d.p(hVar, f, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int l() {
        return this.d.q();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long m(int i) {
        return this.d.n(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int n(int i) {
        return this.d.o(i);
    }

    public c(a aVar, List<? extends RecyclerView.h<? extends RecyclerView.F>> list) {
        this.d = new d(this, aVar);
        Iterator<? extends RecyclerView.h<? extends RecyclerView.F>> it = list.iterator();
        while (it.hasNext()) {
            N(it.next());
        }
        super.K(this.d.s());
    }
}
