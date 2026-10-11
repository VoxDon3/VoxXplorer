package ax.W2;

import ax.W2.h;
import ax.c3.C1808A;
import ax.c3.C1809B;
import ax.c3.EnumC1837z;
import ax.c3.d0;
import ax.u3.C3184b;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import java.util.Iterator;
import java.util.List;

/* renamed from: ax.W2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1011c extends h {
    private static C1011c m;
    private List<AbstractC3595n> d;
    private AbstractC3595n e;
    private C3596o f;
    private List<g> g;
    private a h;
    private boolean i;
    private AbstractC3595n j;
    private C3596o k;
    private boolean l;

    /* renamed from: ax.W2.c$a */
    public enum a {
        COPY,
        MOVE,
        SAVE
    }

    public static C1011c q() {
        if (m == null) {
            m = new C1011c();
        }
        return m;
    }

    @Override // ax.W2.h
    protected j b() {
        j fVar = this.h == a.SAVE ? new f(f(), this.g, this.k, this.j) : new e(f(), this.d, this.f, this.e, this.k, this.j, t());
        this.l = true;
        l();
        return fVar;
    }

    @Override // ax.W2.h
    protected boolean c() {
        return true;
    }

    public boolean k(AbstractC3595n abstractC3595n) {
        return (this.e != null && abstractC3595n != null && t() && C1809B.O(this.e, abstractC3595n) && d0.G(this.e.E(), abstractC3595n.E())) ? false : true;
    }

    public void l() {
        List<g> list = this.g;
        if (list != null && !this.l) {
            Iterator<g> it = list.iterator();
            while (it.hasNext()) {
                it.next().f();
            }
        }
        this.l = false;
        this.g = null;
        this.d = null;
        this.e = null;
        this.j = null;
        this.i = false;
        C3596o c3596o = this.f;
        if (c3596o != null) {
            c3596o.k0(false);
            this.f = null;
        }
        C3596o c3596o2 = this.k;
        if (c3596o2 != null) {
            c3596o2.k0(false);
            this.k = null;
        }
    }

    public void m(C3596o c3596o, AbstractC3595n abstractC3595n, List<AbstractC3595n> list, boolean z) {
        l();
        this.f = c3596o;
        c3596o.n0();
        this.e = abstractC3595n;
        this.d = list;
        if (z) {
            this.h = a.MOVE;
        } else {
            this.h = a.COPY;
        }
        this.l = false;
    }

    public void n(List<g> list) {
        l();
        this.g = list;
        this.h = a.SAVE;
        this.l = false;
    }

    public void o(C3596o c3596o, AbstractC3595n abstractC3595n, h.a aVar) {
        C3184b.c(abstractC3595n.isDirectory());
        this.k = c3596o;
        c3596o.n0();
        this.j = abstractC3595n;
        i(aVar);
        this.i = true;
        j(h.c.FILLED);
    }

    public List<AbstractC3595n> p() {
        return this.d;
    }

    public boolean r(EnumC1837z enumC1837z) {
        if (u()) {
            List<g> list = this.g;
            if (list == null) {
                return false;
            }
            Iterator<g> it = list.iterator();
            while (it.hasNext()) {
                if (!C1808A.y(d0.j(it.next().h()), enumC1837z)) {
                    return false;
                }
            }
            return true;
        }
        List<AbstractC3595n> list2 = this.d;
        if (list2 == null) {
            return false;
        }
        for (AbstractC3595n abstractC3595n : list2) {
            if (abstractC3595n.isDirectory() || !C1808A.y(abstractC3595n.A(), enumC1837z)) {
                return false;
            }
        }
        return true;
    }

    public boolean s() {
        if (this.g != null) {
            return true;
        }
        List<AbstractC3595n> list = this.d;
        return list != null && list.size() > 0;
    }

    public boolean t() {
        return this.h == a.MOVE;
    }

    public boolean u() {
        return this.h == a.SAVE;
    }

    public boolean v() {
        return s() && !this.i;
    }
}
