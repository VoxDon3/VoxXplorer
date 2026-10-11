package androidx.recyclerview.widget;

import android.util.Log;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.u;
import androidx.recyclerview.widget.x;
import ax.b0.C1446g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class d implements m.b {
    private final c a;
    private final x b;
    private List<WeakReference<RecyclerView>> c = new ArrayList();
    private final IdentityHashMap<RecyclerView.F, m> d = new IdentityHashMap<>();
    private List<m> e = new ArrayList();
    private a f = new a();
    private final c.a.b g;
    private final u h;

    static class a {
        m a;
        int b;
        boolean c;

        a() {
        }
    }

    d(c cVar, c.a aVar) {
        this.a = cVar;
        if (aVar.a) {
            this.b = new x.a();
        } else {
            this.b = new x.b();
        }
        c.a.b bVar = aVar.b;
        this.g = bVar;
        if (bVar == c.a.b.NO_STABLE_IDS) {
            this.h = new u.b();
        } else if (bVar == c.a.b.ISOLATED_STABLE_IDS) {
            this.h = new u.a();
        } else {
            if (bVar != c.a.b.SHARED_STABLE_IDS) {
                throw new IllegalArgumentException("unknown stable id mode");
            }
            this.h = new u.c();
        }
    }

    private void D(a aVar) {
        aVar.c = false;
        aVar.a = null;
        aVar.b = -1;
        this.f = aVar;
    }

    private void i() {
        RecyclerView.h.a j = j();
        if (j != this.a.o()) {
            this.a.O(j);
        }
    }

    private RecyclerView.h.a j() {
        for (m mVar : this.e) {
            RecyclerView.h.a o = mVar.c.o();
            RecyclerView.h.a aVar = RecyclerView.h.a.PREVENT;
            if (o == aVar || (o == RecyclerView.h.a.PREVENT_WHEN_EMPTY && mVar.a() == 0)) {
                return aVar;
            }
        }
        return RecyclerView.h.a.ALLOW;
    }

    private int k(m mVar) {
        m next;
        Iterator<m> it = this.e.iterator();
        int i = 0;
        while (it.hasNext() && (next = it.next()) != mVar) {
            i += next.a();
        }
        return i;
    }

    private a l(int i) {
        a aVar = this.f;
        if (aVar.c) {
            aVar = new a();
        } else {
            aVar.c = true;
        }
        Iterator<m> it = this.e.iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            m next = it.next();
            if (next.a() > i2) {
                aVar.a = next;
                aVar.b = i2;
                break;
            }
            i2 -= next.a();
        }
        if (aVar.a != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Cannot find wrapper for " + i);
    }

    private m m(RecyclerView.h<RecyclerView.F> hVar) {
        int t = t(hVar);
        if (t == -1) {
            return null;
        }
        return this.e.get(t);
    }

    private m r(RecyclerView.F f) {
        m mVar = this.d.get(f);
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("Cannot find wrapper for " + f + ", seems like it is not bound by this adapter: " + this);
    }

    private int t(RecyclerView.h<RecyclerView.F> hVar) {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            if (this.e.get(i).c == hVar) {
                return i;
            }
        }
        return -1;
    }

    private boolean u(RecyclerView recyclerView) {
        Iterator<WeakReference<RecyclerView>> it = this.c.iterator();
        while (it.hasNext()) {
            if (it.next().get() == recyclerView) {
                return true;
            }
        }
        return false;
    }

    public void A(RecyclerView.F f) {
        r(f).c.G(f);
    }

    public void B(RecyclerView.F f) {
        r(f).c.H(f);
    }

    public void C(RecyclerView.F f) {
        m mVar = this.d.get(f);
        if (mVar != null) {
            mVar.c.I(f);
            this.d.remove(f);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + f + ", seems like it is not bound by this adapter: " + this);
    }

    @Override // androidx.recyclerview.widget.m.b
    public void a(m mVar) {
        i();
    }

    @Override // androidx.recyclerview.widget.m.b
    public void b(m mVar, int i, int i2, Object obj) {
        this.a.w(i + k(mVar), i2, obj);
    }

    @Override // androidx.recyclerview.widget.m.b
    public void c(m mVar, int i, int i2) {
        this.a.x(i + k(mVar), i2);
    }

    @Override // androidx.recyclerview.widget.m.b
    public void d(m mVar, int i, int i2) {
        int k = k(mVar);
        this.a.v(i + k, i2 + k);
    }

    @Override // androidx.recyclerview.widget.m.b
    public void e(m mVar) {
        this.a.r();
        i();
    }

    @Override // androidx.recyclerview.widget.m.b
    public void f(m mVar, int i, int i2) {
        this.a.y(i + k(mVar), i2);
    }

    boolean g(int i, RecyclerView.h<RecyclerView.F> hVar) {
        if (i < 0 || i > this.e.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + this.e.size() + ". Given:" + i);
        }
        if (s()) {
            C1446g.b(hVar.q(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        } else if (hVar.q()) {
            Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
        }
        if (m(hVar) != null) {
            return false;
        }
        m mVar = new m(hVar, this, this.b, this.h.a());
        this.e.add(i, mVar);
        Iterator<WeakReference<RecyclerView>> it = this.c.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = it.next().get();
            if (recyclerView != null) {
                hVar.A(recyclerView);
            }
        }
        if (mVar.a() > 0) {
            this.a.x(k(mVar), mVar.a());
        }
        i();
        return true;
    }

    boolean h(RecyclerView.h<RecyclerView.F> hVar) {
        return g(this.e.size(), hVar);
    }

    public long n(int i) {
        a l = l(i);
        long b = l.a.b(l.b);
        D(l);
        return b;
    }

    public int o(int i) {
        a l = l(i);
        int c = l.a.c(l.b);
        D(l);
        return c;
    }

    public int p(RecyclerView.h<? extends RecyclerView.F> hVar, RecyclerView.F f, int i) {
        m mVar = this.d.get(f);
        if (mVar == null) {
            return -1;
        }
        int k = i - k(mVar);
        int l = mVar.c.l();
        if (k >= 0 && k < l) {
            return mVar.c.k(hVar, f, k);
        }
        throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + k + " which is out of bounds for the adapter with size " + l + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + f + "adapter:" + hVar);
    }

    public int q() {
        Iterator<m> it = this.e.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().a();
        }
        return i;
    }

    public boolean s() {
        return this.g != c.a.b.NO_STABLE_IDS;
    }

    public void v(RecyclerView recyclerView) {
        if (u(recyclerView)) {
            return;
        }
        this.c.add(new WeakReference<>(recyclerView));
        Iterator<m> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().c.A(recyclerView);
        }
    }

    public void w(RecyclerView.F f, int i) {
        a l = l(i);
        this.d.put(f, l.a);
        l.a.d(f, l.b);
        D(l);
    }

    public RecyclerView.F x(ViewGroup viewGroup, int i) {
        return this.b.a(i).e(viewGroup, i);
    }

    public void y(RecyclerView recyclerView) {
        int size = this.c.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference<RecyclerView> weakReference = this.c.get(size);
            if (weakReference.get() == null) {
                this.c.remove(size);
            } else if (weakReference.get() == recyclerView) {
                this.c.remove(size);
                break;
            }
            size--;
        }
        Iterator<m> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().c.E(recyclerView);
        }
    }

    public boolean z(RecyclerView.F f) {
        m mVar = this.d.get(f);
        if (mVar != null) {
            boolean F = mVar.c.F(f);
            this.d.remove(f);
            return F;
        }
        throw new IllegalStateException("Cannot find wrapper for " + f + ", seems like it is not bound by this adapter: " + this);
    }
}
