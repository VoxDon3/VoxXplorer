/*
 * Decompiled with CFR 0.152.
 */
package ax.U3;

import ax.J3.h;
import ax.M3.j;
import ax.U3.m;
import ax.U3.n;
import ax.U3.p;
import ax.b0.d;
import ax.k4.h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class q {
    private static final c e = new c();
    private static final m<Object, Object> f = new a();
    private final List<b<?, ?>> a = new ArrayList();
    private final c b;
    private final Set<b<?, ?>> c = new HashSet();
    private final d<List<Exception>> d;

    public q(d<List<Exception>> d8) {
        this(d8, e);
    }

    q(d<List<Exception>> d8, c c8) {
        this.d = d8;
        this.b = c8;
    }

    private <Model, Data> void a(Class<Model> object, Class<Data> object2, n<Model, Data> n8, boolean bl) {
        object = new b<Model, Data>(object, object2, n8);
        object2 = this.a;
        int n9 = bl ? object2.size() : 0;
        object2.add(n9, object);
    }

    private <Model, Data> m<Model, Data> c(b<?, ?> b8) {
        return h.d(b8.c.b(this));
    }

    private static <Model, Data> m<Model, Data> f() {
        return f;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    <Model, Data> void b(Class<Model> clazz, Class<Data> clazz2, n<Model, Data> n8) {
        synchronized (this) {
            this.a(clazz, clazz2, n8, true);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <Model, Data> m<Model, Data> d(Class<Model> m8, Class<Data> clazz) {
        synchronized (this) {
            boolean bl;
            Iterator<b<?, ?>> iterator;
            Serializable serializable;
            block9: {
                try {
                    serializable = new ArrayList();
                    iterator = this.a.iterator();
                    bl = false;
                    break block9;
                }
                catch (Throwable throwable) {}
                this.c.clear();
                throw throwable;
            }
            while (iterator.hasNext()) {
                b<Model, Model> b8 = iterator.next();
                if (this.c.contains(b8)) {
                    bl = true;
                    continue;
                }
                if (!b8.b((Class<?>)((Object)m8), clazz)) continue;
                this.c.add(b8);
                serializable.add(this.c(b8));
                this.c.remove(b8);
            }
            if (serializable.size() > 1) {
                return this.b.a(serializable, this.d);
            }
            if (serializable.size() == 1) {
                return (m)serializable.get(0);
            }
            if (bl) {
                return q.f();
            }
            serializable = new h.c((Class<?>)((Object)m8), clazz);
            throw serializable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    <Model> List<m<Model, ?>> e(Class<Model> clazz) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                ArrayList arrayList;
                try {
                    arrayList = new ArrayList();
                    for (b<Model, Model> b8 : this.a) {
                        if (this.c.contains(b8) || !b8.a(clazz)) continue;
                        this.c.add(b8);
                        arrayList.add(this.c(b8));
                        this.c.remove(b8);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return arrayList;
            }
            this.c.clear();
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    List<Class<?>> g(Class<?> clazz) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                ArrayList arrayList;
                try {
                    arrayList = new ArrayList();
                    for (b<?, ?> b8 : this.a) {
                        if (arrayList.contains(b8.b) || !b8.a(clazz)) continue;
                        arrayList.add(b8.b);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return arrayList;
            }
            throw throwable2;
        }
    }

    private static class a
    implements m<Object, Object> {
        a() {
        }

        @Override
        public m.a<Object> a(Object object, int n8, int n9, j j8) {
            return null;
        }

        @Override
        public boolean b(Object object) {
            return false;
        }
    }

    private static class b<Model, Data> {
        private final Class<Model> a;
        final Class<Data> b;
        final n<Model, Data> c;

        public b(Class<Model> clazz, Class<Data> clazz2, n<Model, Data> n8) {
            this.a = clazz;
            this.b = clazz2;
            this.c = n8;
        }

        public boolean a(Class<?> clazz) {
            return this.a.isAssignableFrom(clazz);
        }

        public boolean b(Class<?> clazz, Class<?> clazz2) {
            return this.a(clazz) && this.b.isAssignableFrom(clazz2);
        }
    }

    static class c {
        c() {
        }

        public <Model, Data> p<Model, Data> a(List<m<Model, Data>> list, d<List<Exception>> d8) {
            return new p<Model, Data>(list, d8);
        }
    }
}

