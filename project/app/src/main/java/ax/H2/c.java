/*
 * Decompiled with CFR 0.152.
 */
package ax.H2;

import ax.Gb.l;
import ax.I2.h;
import ax.K2.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class c<T>
implements ax.G2.a<T> {
    private final h<T> a;
    private final List<v> b;
    private final List<String> c;
    private T d;
    private a e;

    public c(h<T> h8) {
        l.f(h8, "tracker");
        this.a = h8;
        this.b = new ArrayList<v>();
        this.c = new ArrayList<String>();
    }

    private final void h(a a8, T t8) {
        if (!this.b.isEmpty() && a8 != null) {
            if (t8 != null && !this.c(t8)) {
                a8.c(this.b);
                return;
            }
            a8.d(this.b);
        }
    }

    @Override
    public void a(T t8) {
        this.d = t8;
        this.h(this.e, t8);
    }

    public abstract boolean b(v var1);

    public abstract boolean c(T var1);

    public final boolean d(String string) {
        l.f(string, "workSpecId");
        T t8 = this.d;
        return t8 != null && this.c(t8) && this.c.contains(string);
    }

    public final void e(Iterable<v> object) {
        l.f(object, "workSpecs");
        this.b.clear();
        this.c.clear();
        Object object2 = this.b;
        Iterator<v> iterator = object.iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            if (!this.b((v)object)) continue;
            object2.add((Object)object);
        }
        object2 = this.b;
        object = this.c;
        object2 = object2.iterator();
        while (object2.hasNext()) {
            object.add(((v)object2.next()).a);
        }
        if (this.b.isEmpty()) {
            this.a.f(this);
        } else {
            this.a.c(this);
        }
        this.h(this.e, this.d);
    }

    public final void f() {
        if (!((Collection)this.b).isEmpty()) {
            this.b.clear();
            this.a.f(this);
        }
    }

    public final void g(a a8) {
        if (this.e != a8) {
            this.e = a8;
            this.h(a8, this.d);
        }
    }

    public static interface a {
        public void c(List<v> var1);

        public void d(List<v> var1);
    }
}

