package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.d;
import ax.v.C3243c;
import ax.w.C3320a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class g extends d {
    public static final a j = new a(null);
    private final boolean b;
    private C3320a<ax.G0.g, b> c;
    private d.b d;
    private final WeakReference<ax.G0.h> e;
    private int f;
    private boolean g;
    private boolean h;
    private ArrayList<d.b> i;

    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        public final d.b a(d.b bVar, d.b bVar2) {
            ax.Gb.l.f(bVar, "state1");
            return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
        }

        private a() {
        }
    }

    public static final class b {
        private d.b a;
        private f b;

        public b(ax.G0.g gVar, d.b bVar) {
            ax.Gb.l.f(bVar, "initialState");
            ax.Gb.l.c(gVar);
            this.b = h.f(gVar);
            this.a = bVar;
        }

        public final void a(ax.G0.h hVar, d.a aVar) {
            ax.Gb.l.f(aVar, "event");
            d.b j = aVar.j();
            this.a = g.j.a(this.a, j);
            f fVar = this.b;
            ax.Gb.l.c(hVar);
            fVar.b(hVar, aVar);
            this.a = j;
        }

        public final d.b b() {
            return this.a;
        }
    }

    private g(ax.G0.h hVar, boolean z) {
        this.b = z;
        this.c = new C3320a<>();
        this.d = d.b.INITIALIZED;
        this.i = new ArrayList<>();
        this.e = new WeakReference<>(hVar);
    }

    private final void d(ax.G0.h hVar) {
        Iterator<Map.Entry<ax.G0.g, b>> descendingIterator = this.c.descendingIterator();
        ax.Gb.l.e(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.h) {
            Map.Entry<ax.G0.g, b> next = descendingIterator.next();
            ax.Gb.l.e(next, "next()");
            ax.G0.g key = next.getKey();
            b value = next.getValue();
            while (value.b().compareTo(this.d) > 0 && !this.h && this.c.contains(key)) {
                d.a a2 = d.a.Companion.a(value.b());
                if (a2 == null) {
                    throw new IllegalStateException("no event down from " + value.b());
                }
                l(a2.j());
                value.a(hVar, a2);
                k();
            }
        }
    }

    private final d.b e(ax.G0.g gVar) {
        b value;
        Map.Entry<ax.G0.g, b> p = this.c.p(gVar);
        d.b bVar = null;
        d.b b2 = (p == null || (value = p.getValue()) == null) ? null : value.b();
        if (!this.i.isEmpty()) {
            bVar = this.i.get(r0.size() - 1);
        }
        a aVar = j;
        return aVar.a(aVar.a(this.d, b2), bVar);
    }

    @SuppressLint({"RestrictedApi"})
    private final void f(String str) {
        if (!this.b || C3243c.g().b()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    private final void g(ax.G0.h hVar) {
        ax.w.b<ax.G0.g, b>.d h = this.c.h();
        ax.Gb.l.e(h, "observerMap.iteratorWithAdditions()");
        while (h.hasNext() && !this.h) {
            Map.Entry next = h.next();
            ax.G0.g gVar = (ax.G0.g) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.b().compareTo(this.d) < 0 && !this.h && this.c.contains(gVar)) {
                l(bVar.b());
                d.a b2 = d.a.Companion.b(bVar.b());
                if (b2 == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(hVar, b2);
                k();
            }
        }
    }

    private final boolean i() {
        if (this.c.size() == 0) {
            return true;
        }
        Map.Entry<ax.G0.g, b> e = this.c.e();
        ax.Gb.l.c(e);
        d.b b2 = e.getValue().b();
        Map.Entry<ax.G0.g, b> i = this.c.i();
        ax.Gb.l.c(i);
        d.b b3 = i.getValue().b();
        return b2 == b3 && this.d == b3;
    }

    private final void j(d.b bVar) {
        d.b bVar2 = this.d;
        if (bVar2 == bVar) {
            return;
        }
        if (bVar2 == d.b.INITIALIZED && bVar == d.b.DESTROYED) {
            throw new IllegalStateException(("no event down from " + this.d + " in component " + this.e.get()).toString());
        }
        this.d = bVar;
        if (this.g || this.f != 0) {
            this.h = true;
            return;
        }
        this.g = true;
        n();
        this.g = false;
        if (this.d == d.b.DESTROYED) {
            this.c = new C3320a<>();
        }
    }

    private final void k() {
        this.i.remove(r0.size() - 1);
    }

    private final void l(d.b bVar) {
        this.i.add(bVar);
    }

    private final void n() {
        ax.G0.h hVar = this.e.get();
        if (hVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!i()) {
            this.h = false;
            d.b bVar = this.d;
            Map.Entry<ax.G0.g, b> e = this.c.e();
            ax.Gb.l.c(e);
            if (bVar.compareTo(e.getValue().b()) < 0) {
                d(hVar);
            }
            Map.Entry<ax.G0.g, b> i = this.c.i();
            if (!this.h && i != null && this.d.compareTo(i.getValue().b()) > 0) {
                g(hVar);
            }
        }
        this.h = false;
    }

    @Override // androidx.lifecycle.d
    public void a(ax.G0.g gVar) {
        ax.G0.h hVar;
        ax.Gb.l.f(gVar, "observer");
        f("addObserver");
        d.b bVar = this.d;
        d.b bVar2 = d.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = d.b.INITIALIZED;
        }
        b bVar3 = new b(gVar, bVar2);
        if (this.c.l(gVar, bVar3) == null && (hVar = this.e.get()) != null) {
            boolean z = this.f != 0 || this.g;
            d.b e = e(gVar);
            this.f++;
            while (bVar3.b().compareTo(e) < 0 && this.c.contains(gVar)) {
                l(bVar3.b());
                d.a b2 = d.a.Companion.b(bVar3.b());
                if (b2 == null) {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(hVar, b2);
                k();
                e = e(gVar);
            }
            if (!z) {
                n();
            }
            this.f--;
        }
    }

    @Override // androidx.lifecycle.d
    public d.b b() {
        return this.d;
    }

    @Override // androidx.lifecycle.d
    public void c(ax.G0.g gVar) {
        ax.Gb.l.f(gVar, "observer");
        f("removeObserver");
        this.c.n(gVar);
    }

    public void h(d.a aVar) {
        ax.Gb.l.f(aVar, "event");
        f("handleLifecycleEvent");
        j(aVar.j());
    }

    public void m(d.b bVar) {
        ax.Gb.l.f(bVar, "state");
        f("setCurrentState");
        j(bVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(ax.G0.h hVar) {
        this(hVar, true);
        ax.Gb.l.f(hVar, "provider");
    }
}
