package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import androidx.recyclerview.widget.x;
import ax.b0.C1446g;

/* loaded from: classes.dex */
class m {
    private final x.c a;
    private final u.d b;
    public final RecyclerView.h<RecyclerView.F> c;
    final b d;
    int e;
    private RecyclerView.j f = new a();

    class a extends RecyclerView.j {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            m mVar = m.this;
            mVar.e = mVar.c.l();
            m mVar2 = m.this;
            mVar2.d.e(mVar2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i, int i2) {
            m mVar = m.this;
            mVar.d.b(mVar, i, i2, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i, int i2, Object obj) {
            m mVar = m.this;
            mVar.d.b(mVar, i, i2, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i, int i2) {
            m mVar = m.this;
            mVar.e += i2;
            mVar.d.c(mVar, i, i2);
            m mVar2 = m.this;
            if (mVar2.e <= 0 || mVar2.c.o() != RecyclerView.h.a.PREVENT_WHEN_EMPTY) {
                return;
            }
            m mVar3 = m.this;
            mVar3.d.a(mVar3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i, int i2, int i3) {
            C1446g.b(i3 == 1, "moving more than 1 item is not supported in RecyclerView");
            m mVar = m.this;
            mVar.d.d(mVar, i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i, int i2) {
            m mVar = m.this;
            mVar.e -= i2;
            mVar.d.f(mVar, i, i2);
            m mVar2 = m.this;
            if (mVar2.e >= 1 || mVar2.c.o() != RecyclerView.h.a.PREVENT_WHEN_EMPTY) {
                return;
            }
            m mVar3 = m.this;
            mVar3.d.a(mVar3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void g() {
            m mVar = m.this;
            mVar.d.a(mVar);
        }
    }

    interface b {
        void a(m mVar);

        void b(m mVar, int i, int i2, Object obj);

        void c(m mVar, int i, int i2);

        void d(m mVar, int i, int i2);

        void e(m mVar);

        void f(m mVar, int i, int i2);
    }

    m(RecyclerView.h<RecyclerView.F> hVar, b bVar, x xVar, u.d dVar) {
        this.c = hVar;
        this.d = bVar;
        this.a = xVar.b(this);
        this.b = dVar;
        this.e = hVar.l();
        hVar.J(this.f);
    }

    int a() {
        return this.e;
    }

    public long b(int i) {
        return this.b.a(this.c.m(i));
    }

    int c(int i) {
        return this.a.b(this.c.n(i));
    }

    void d(RecyclerView.F f, int i) {
        this.c.h(f, i);
    }

    RecyclerView.F e(ViewGroup viewGroup, int i) {
        return this.c.D(viewGroup, this.a.a(i));
    }
}
