/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import android.util.Log;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.u;
import androidx.recyclerview.widget.x;
import ax.b0.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

class d
implements m.b {
    private final c a;
    private final x b;
    private List<WeakReference<RecyclerView>> c = new ArrayList<WeakReference<RecyclerView>>();
    private final IdentityHashMap<RecyclerView.F, m> d = new IdentityHashMap();
    private List<m> e = new ArrayList<m>();
    private a f = new a();
    private final c.a.b g;
    private final u h;

    d(c object, c.a a8) {
        this.a = object;
        this.b = a8.a ? new x.a() : new x.b();
        object = a8.b;
        this.g = object;
        if (object == c.a.b.q) {
            this.h = new u.b();
            return;
        }
        if (object == c.a.b.c0) {
            this.h = new u.a();
            return;
        }
        if (object == c.a.b.d0) {
            this.h = new u.c();
            return;
        }
        throw new IllegalArgumentException("unknown stable id mode");
    }

    private void D(a a8) {
        a8.c = false;
        a8.a = null;
        a8.b = -1;
        this.f = a8;
    }

    private void i() {
        RecyclerView.h.a a8 = this.j();
        if (a8 != this.a.o()) {
            this.a.O(a8);
        }
    }

    private RecyclerView.h.a j() {
        for (m m8 : this.e) {
            RecyclerView.h.a a8;
            RecyclerView.h.a a9 = m8.c.o();
            if (a9 != (a8 = RecyclerView.h.a.d0) && (a9 != RecyclerView.h.a.c0 || m8.a() != 0)) continue;
            return a8;
        }
        return RecyclerView.h.a.q;
    }

    private int k(m m8) {
        m m9;
        Iterator<m> iterator = this.e.iterator();
        int n8 = 0;
        while (iterator.hasNext() && (m9 = iterator.next()) != m8) {
            n8 += m9.a();
        }
        return n8;
    }

    private a l(int n8) {
        Object object = this.f;
        if (((a)object).c) {
            object = new a();
        } else {
            ((a)object).c = true;
        }
        Iterator<m> iterator = this.e.iterator();
        int n9 = n8;
        while (iterator.hasNext()) {
            m m8 = iterator.next();
            if (m8.a() > n9) {
                ((a)object).a = m8;
                ((a)object).b = n9;
                break;
            }
            n9 -= m8.a();
        }
        if (((a)object).a != null) {
            return object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Cannot find wrapper for ");
        ((StringBuilder)object).append(n8);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    private m m(RecyclerView.h<RecyclerView.F> h8) {
        int n8 = this.t(h8);
        if (n8 == -1) {
            return null;
        }
        return this.e.get(n8);
    }

    private m r(RecyclerView.F f8) {
        Object object = this.d.get(f8);
        if (object != null) {
            return object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Cannot find wrapper for ");
        ((StringBuilder)object).append(f8);
        ((StringBuilder)object).append(", seems like it is not bound by this adapter: ");
        ((StringBuilder)object).append(this);
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    private int t(RecyclerView.h<RecyclerView.F> h8) {
        int n8 = this.e.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (this.e.get((int)i8).c != h8) continue;
            return i8;
        }
        return -1;
    }

    private boolean u(RecyclerView recyclerView) {
        Iterator<WeakReference<RecyclerView>> iterator = this.c.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().get() != recyclerView) continue;
            return true;
        }
        return false;
    }

    public void A(RecyclerView.F f8) {
        this.r((RecyclerView.F)f8).c.G(f8);
    }

    public void B(RecyclerView.F f8) {
        this.r((RecyclerView.F)f8).c.H(f8);
    }

    public void C(RecyclerView.F f8) {
        Object object = this.d.get(f8);
        if (object != null) {
            ((m)object).c.I(f8);
            this.d.remove(f8);
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Cannot find wrapper for ");
        ((StringBuilder)object).append(f8);
        ((StringBuilder)object).append(", seems like it is not bound by this adapter: ");
        ((StringBuilder)object).append(this);
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    @Override
    public void a(m m8) {
        this.i();
    }

    @Override
    public void b(m m8, int n8, int n9, Object object) {
        int n10 = this.k(m8);
        this.a.w(n8 + n10, n9, object);
    }

    @Override
    public void c(m m8, int n8, int n9) {
        int n10 = this.k(m8);
        this.a.x(n8 + n10, n9);
    }

    @Override
    public void d(m m8, int n8, int n9) {
        int n10 = this.k(m8);
        this.a.v(n8 + n10, n9 + n10);
    }

    @Override
    public void e(m m8) {
        this.a.r();
        this.i();
    }

    @Override
    public void f(m m8, int n8, int n9) {
        int n10 = this.k(m8);
        this.a.y(n8 + n10, n9);
    }

    boolean g(int n8, RecyclerView.h<RecyclerView.F> object) {
        if (n8 >= 0 && n8 <= this.e.size()) {
            if (this.s()) {
                ax.b0.g.b(((RecyclerView.h)object).q(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
            } else if (((RecyclerView.h)object).q()) {
                Log.w((String)"ConcatAdapter", (String)"Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
            }
            if (this.m((RecyclerView.h<RecyclerView.F>)object) != null) {
                return false;
            }
            m m8 = new m((RecyclerView.h<RecyclerView.F>)object, this, this.b, this.h.a());
            this.e.add(n8, m8);
            Iterator<WeakReference<RecyclerView>> iterator = this.c.iterator();
            while (iterator.hasNext()) {
                RecyclerView recyclerView = (RecyclerView)iterator.next().get();
                if (recyclerView == null) continue;
                ((RecyclerView.h)object).A(recyclerView);
            }
            if (m8.a() > 0) {
                this.a.x(this.k(m8), m8.a());
            }
            this.i();
            return true;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Index must be between 0 and ");
        ((StringBuilder)object).append(this.e.size());
        ((StringBuilder)object).append(". Given:");
        ((StringBuilder)object).append(n8);
        throw new IndexOutOfBoundsException(((StringBuilder)object).toString());
    }

    boolean h(RecyclerView.h<RecyclerView.F> h8) {
        return this.g(this.e.size(), h8);
    }

    public long n(int n8) {
        a a8 = this.l(n8);
        long l8 = a8.a.b(a8.b);
        this.D(a8);
        return l8;
    }

    public int o(int n8) {
        a a8 = this.l(n8);
        n8 = a8.a.c(a8.b);
        this.D(a8);
        return n8;
    }

    public int p(RecyclerView.h<? extends RecyclerView.F> h8, RecyclerView.F f8, int n8) {
        Object object = this.d.get(f8);
        if (object == null) {
            return -1;
        }
        int n9 = ((m)object).c.l();
        if ((n8 -= this.k((m)object)) >= 0 && n8 < n9) {
            return ((m)object).c.k(h8, f8, n8);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Detected inconsistent adapter updates. The local position of the view holder maps to ");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append(" which is out of bounds for the adapter with size ");
        ((StringBuilder)object).append(n9);
        ((StringBuilder)object).append(".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        ((StringBuilder)object).append(f8);
        ((StringBuilder)object).append("adapter:");
        ((StringBuilder)object).append(h8);
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    public int q() {
        Iterator<m> iterator = this.e.iterator();
        int n8 = 0;
        while (iterator.hasNext()) {
            n8 += iterator.next().a();
        }
        return n8;
    }

    public boolean s() {
        return this.g != c.a.b.q;
    }

    public void v(RecyclerView recyclerView) {
        if (!this.u(recyclerView)) {
            this.c.add(new WeakReference<RecyclerView>(recyclerView));
            Iterator<m> iterator = this.e.iterator();
            while (iterator.hasNext()) {
                iterator.next().c.A(recyclerView);
            }
        }
    }

    public void w(RecyclerView.F f8, int n8) {
        a a8 = this.l(n8);
        this.d.put(f8, a8.a);
        a8.a.d(f8, a8.b);
        this.D(a8);
    }

    public RecyclerView.F x(ViewGroup viewGroup, int n8) {
        return this.b.a(n8).e(viewGroup, n8);
    }

    public void y(RecyclerView recyclerView) {
        WeakReference<RecyclerView> weakReference;
        for (int i8 = this.c.size() - 1; i8 >= 0; --i8) {
            weakReference = this.c.get(i8);
            if (weakReference.get() == null) {
                this.c.remove(i8);
                continue;
            }
            if (weakReference.get() != recyclerView) continue;
            this.c.remove(i8);
            break;
        }
        weakReference = this.e.iterator();
        while (weakReference.hasNext()) {
            ((m)weakReference.next()).c.E(recyclerView);
        }
    }

    public boolean z(RecyclerView.F f8) {
        Object object = this.d.get(f8);
        if (object != null) {
            boolean bl = ((m)object).c.F(f8);
            this.d.remove(f8);
            return bl;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Cannot find wrapper for ");
        ((StringBuilder)object).append(f8);
        ((StringBuilder)object).append(", seems like it is not bound by this adapter: ");
        ((StringBuilder)object).append(this);
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    static class a {
        m a;
        int b;
        boolean c;

        a() {
        }
    }
}

