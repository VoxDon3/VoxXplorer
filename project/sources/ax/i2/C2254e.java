package ax.i2;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import ax.b0.C1446g;
import ax.i2.AbstractC2244I;
import ax.i2.C2236A;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: ax.i2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2254e<K> extends AbstractC2244I<K> implements InterfaceC2238C {
    private final C2239D<K> a = new C2239D<>();
    private final List<AbstractC2244I.b<K>> b = new ArrayList(1);
    private final p<K> c;
    private final AbstractC2244I.c<K> d;
    private final AbstractC2245J<K> e;
    private final C2254e<K>.b f;
    private final a g;
    private final boolean h;
    private final String i;
    private C2236A j;

    /* renamed from: ax.i2.e$a */
    private static final class a extends RecyclerView.j {
        private final C2254e<?> a;

        a(C2254e<?> c2254e) {
            C1446g.a(c2254e != null);
            this.a = c2254e;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            this.a.E();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i, int i2, Object obj) {
            if ("Selection-Changed".equals(obj)) {
                return;
            }
            this.a.E();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i, int i2) {
            this.a.x();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i, int i2, int i3) {
            this.a.x();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i, int i2) {
            this.a.x();
            this.a.E();
        }
    }

    /* renamed from: ax.i2.e$b */
    private final class b extends C2236A.a {
        b() {
        }

        @Override // ax.i2.C2236A.a
        void a(int i, int i2, boolean z, int i3) {
            if (i3 == 0) {
                C2254e.this.H(i, i2, z);
            } else {
                if (i3 == 1) {
                    C2254e.this.G(i, i2, z);
                    return;
                }
                throw new IllegalArgumentException("Invalid range type: " + i3);
            }
        }
    }

    public C2254e(String str, p<K> pVar, AbstractC2244I.c<K> cVar, AbstractC2245J<K> abstractC2245J) {
        C1446g.a(str != null);
        C1446g.a(!str.trim().isEmpty());
        C1446g.a(pVar != null);
        C1446g.a(cVar != null);
        C1446g.a(abstractC2245J != null);
        this.i = str;
        this.c = pVar;
        this.d = cVar;
        this.e = abstractC2245J;
        this.f = new b();
        this.h = !cVar.a();
        this.g = new a(this);
    }

    private void A() {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            this.b.get(size).b();
        }
    }

    private void B() {
        Iterator<AbstractC2244I.b<K>> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    private void C(C2239D<K> c2239d) {
        Iterator<K> it = c2239d.q.iterator();
        while (it.hasNext()) {
            z(it.next(), false);
        }
        Iterator<K> it2 = c2239d.c0.iterator();
        while (it2.hasNext()) {
            z(it2.next(), false);
        }
    }

    private void D() {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            this.b.get(size).d();
        }
    }

    private boolean F(Iterable<K> iterable, boolean z) {
        boolean z2 = false;
        for (K k : iterable) {
            boolean z3 = true;
            if (!z ? !s(k, false) || !this.a.remove(k) : !s(k, true) || !this.a.add(k)) {
                z3 = false;
            }
            if (z3) {
                z(k, z);
            }
            z2 |= z3;
        }
        return z2;
    }

    private boolean s(K k, boolean z) {
        return this.d.c(k, z);
    }

    private void t() {
        if (k()) {
            C(v());
            A();
        }
    }

    private C2239D<K> v() {
        this.j = null;
        t<K> tVar = new t<>();
        if (k()) {
            w(tVar);
            this.a.clear();
        }
        return tVar;
    }

    private void y(int i, int i2) {
        if (!l()) {
            Log.e("DefaultSelectionTracker", "Ignoring attempt to extend unestablished range. Ignoring.");
            return;
        }
        if (i != -1) {
            this.j.b(i, i2);
            A();
        } else {
            Log.w("DefaultSelectionTracker", "Ignoring attempt to extend range to invalid position: " + i);
        }
    }

    private void z(K k, boolean z) {
        C1446g.a(k != null);
        for (int size = this.b.size() - 1; size >= 0; size--) {
            this.b.get(size).a(k, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void E() {
        if (this.a.isEmpty()) {
            Log.d("DefaultSelectionTracker", "Ignoring onDataSetChange. No active selection.");
            return;
        }
        this.a.e();
        D();
        Iterator<K> it = this.a.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            K next = it.next();
            if (this.c.b(next) == -1 || !s(next, true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(next);
            } else {
                for (int size = this.b.size() - 1; size >= 0; size--) {
                    this.b.get(size).a(next, true);
                }
            }
        }
        if (arrayList != null) {
            int size2 = arrayList.size();
            int i = 0;
            while (i < size2) {
                Object obj = arrayList.get(i);
                i++;
                f(obj);
            }
        }
        A();
    }

    void G(int i, int i2, boolean z) {
        C1446g.a(i2 >= i);
        while (i <= i2) {
            K a2 = this.c.a(i);
            if (a2 != null) {
                if (!z) {
                    this.a.c0.remove(a2);
                } else if (s(a2, true) && !this.a.q.contains(a2)) {
                    this.a.c0.add(a2);
                }
                z(a2, z);
            }
            i++;
        }
        A();
    }

    void H(int i, int i2, boolean z) {
        C1446g.a(i2 >= i);
        while (i <= i2) {
            K a2 = this.c.a(i);
            if (a2 != null) {
                if (z) {
                    o(a2);
                } else {
                    f(a2);
                }
            }
            i++;
        }
    }

    @Override // ax.i2.InterfaceC2238C
    public void a() {
        e();
        this.j = null;
    }

    @Override // ax.i2.AbstractC2244I
    public void b(AbstractC2244I.b<K> bVar) {
        C1446g.a(bVar != null);
        this.b.add(bVar);
    }

    @Override // ax.i2.AbstractC2244I
    public void c(int i) {
        C1446g.a(i != -1);
        C1446g.a(this.a.contains(this.c.a(i)));
        this.j = new C2236A(i, this.f);
    }

    @Override // ax.i2.InterfaceC2238C
    public boolean d() {
        return k() || l();
    }

    @Override // ax.i2.AbstractC2244I
    public boolean e() {
        if (!k()) {
            return false;
        }
        u();
        t();
        B();
        return true;
    }

    @Override // ax.i2.AbstractC2244I
    public boolean f(K k) {
        C1446g.a(k != null);
        if (!this.a.contains(k) || !s(k, false)) {
            return false;
        }
        this.a.remove(k);
        z(k, false);
        A();
        if (this.a.isEmpty() && l()) {
            x();
        }
        return true;
    }

    @Override // ax.i2.AbstractC2244I
    public void g(int i) {
        if (this.h) {
            return;
        }
        y(i, 1);
    }

    @Override // ax.i2.AbstractC2244I
    public void h(int i) {
        y(i, 0);
    }

    @Override // ax.i2.AbstractC2244I
    protected RecyclerView.j i() {
        return this.g;
    }

    @Override // ax.i2.AbstractC2244I
    public C2239D<K> j() {
        return this.a;
    }

    @Override // ax.i2.AbstractC2244I
    public boolean k() {
        return !this.a.isEmpty();
    }

    @Override // ax.i2.AbstractC2244I
    public boolean l() {
        return this.j != null;
    }

    @Override // ax.i2.AbstractC2244I
    public boolean m(K k) {
        return this.a.contains(k);
    }

    @Override // ax.i2.AbstractC2244I
    public void n() {
        this.a.i();
        A();
    }

    @Override // ax.i2.AbstractC2244I
    public boolean o(K k) {
        C1446g.a(k != null);
        if (this.a.contains(k) || !s(k, true)) {
            return false;
        }
        if (this.h && k()) {
            C(v());
        }
        this.a.add(k);
        z(k, true);
        A();
        return true;
    }

    @Override // ax.i2.AbstractC2244I
    public boolean p(Iterable<K> iterable, boolean z) {
        boolean F = F(iterable, z);
        A();
        return F;
    }

    @Override // ax.i2.AbstractC2244I
    public void q(Set<K> set) {
        if (this.h) {
            return;
        }
        for (Map.Entry<K, Boolean> entry : this.a.k(set).entrySet()) {
            z(entry.getKey(), entry.getValue().booleanValue());
        }
        A();
    }

    @Override // ax.i2.AbstractC2244I
    public void r(int i) {
        if (this.a.contains(this.c.a(i)) || o(this.c.a(i))) {
            c(i);
        }
    }

    public void u() {
        Iterator<K> it = this.a.c0.iterator();
        while (it.hasNext()) {
            z(it.next(), false);
        }
        this.a.e();
    }

    public void w(t<K> tVar) {
        tVar.g(this.a);
    }

    public void x() {
        this.j = null;
        u();
    }
}
