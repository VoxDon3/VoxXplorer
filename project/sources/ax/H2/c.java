package ax.H2;

import ax.Gb.l;
import ax.K2.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c<T> implements ax.G2.a<T> {
    private final ax.I2.h<T> a;
    private final List<v> b;
    private final List<String> c;
    private T d;
    private a e;

    public interface a {
        void c(List<v> list);

        void d(List<v> list);
    }

    public c(ax.I2.h<T> hVar) {
        l.f(hVar, "tracker");
        this.a = hVar;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    private final void h(a aVar, T t) {
        if (this.b.isEmpty() || aVar == null) {
            return;
        }
        if (t == null || c(t)) {
            aVar.d(this.b);
        } else {
            aVar.c(this.b);
        }
    }

    @Override // ax.G2.a
    public void a(T t) {
        this.d = t;
        h(this.e, t);
    }

    public abstract boolean b(v vVar);

    public abstract boolean c(T t);

    public final boolean d(String str) {
        l.f(str, "workSpecId");
        T t = this.d;
        return t != null && c(t) && this.c.contains(str);
    }

    public final void e(Iterable<v> iterable) {
        l.f(iterable, "workSpecs");
        this.b.clear();
        this.c.clear();
        List<v> list = this.b;
        for (v vVar : iterable) {
            if (b(vVar)) {
                list.add(vVar);
            }
        }
        List<v> list2 = this.b;
        List<String> list3 = this.c;
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            list3.add(((v) it.next()).a);
        }
        if (this.b.isEmpty()) {
            this.a.f(this);
        } else {
            this.a.c(this);
        }
        h(this.e, this.d);
    }

    public final void f() {
        if (this.b.isEmpty()) {
            return;
        }
        this.b.clear();
        this.a.f(this);
    }

    public final void g(a aVar) {
        if (this.e != aVar) {
            this.e = aVar;
            h(aVar, this.d);
        }
    }
}
