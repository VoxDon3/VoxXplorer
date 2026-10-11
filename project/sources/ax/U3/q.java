package ax.U3;

import ax.J3.h;
import ax.U3.m;
import ax.b0.InterfaceC1443d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class q {
    private static final c e = new c();
    private static final m<Object, Object> f = new a();
    private final List<b<?, ?>> a;
    private final c b;
    private final Set<b<?, ?>> c;
    private final InterfaceC1443d<List<Exception>> d;

    private static class a implements m<Object, Object> {
        a() {
        }

        @Override // ax.U3.m
        public m.a<Object> a(Object obj, int i, int i2, ax.M3.j jVar) {
            return null;
        }

        @Override // ax.U3.m
        public boolean b(Object obj) {
            return false;
        }
    }

    private static class b<Model, Data> {
        private final Class<Model> a;
        final Class<Data> b;
        final n<Model, Data> c;

        public b(Class<Model> cls, Class<Data> cls2, n<Model, Data> nVar) {
            this.a = cls;
            this.b = cls2;
            this.c = nVar;
        }

        public boolean a(Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }

        public boolean b(Class<?> cls, Class<?> cls2) {
            return a(cls) && this.b.isAssignableFrom(cls2);
        }
    }

    static class c {
        c() {
        }

        public <Model, Data> p<Model, Data> a(List<m<Model, Data>> list, InterfaceC1443d<List<Exception>> interfaceC1443d) {
            return new p<>(list, interfaceC1443d);
        }
    }

    public q(InterfaceC1443d<List<Exception>> interfaceC1443d) {
        this(interfaceC1443d, e);
    }

    private <Model, Data> void a(Class<Model> cls, Class<Data> cls2, n<Model, Data> nVar, boolean z) {
        b<?, ?> bVar = new b<>(cls, cls2, nVar);
        List<b<?, ?>> list = this.a;
        list.add(z ? list.size() : 0, bVar);
    }

    private <Model, Data> m<Model, Data> c(b<?, ?> bVar) {
        return (m) ax.k4.h.d(bVar.c.b(this));
    }

    private static <Model, Data> m<Model, Data> f() {
        return (m<Model, Data>) f;
    }

    synchronized <Model, Data> void b(Class<Model> cls, Class<Data> cls2, n<Model, Data> nVar) {
        a(cls, cls2, nVar, true);
    }

    public synchronized <Model, Data> m<Model, Data> d(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (b<?, ?> bVar : this.a) {
                if (this.c.contains(bVar)) {
                    z = true;
                } else if (bVar.b(cls, cls2)) {
                    this.c.add(bVar);
                    arrayList.add(c(bVar));
                    this.c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.b.a(arrayList, this.d);
            }
            if (arrayList.size() == 1) {
                return (m) arrayList.get(0);
            }
            if (!z) {
                throw new h.c(cls, cls2);
            }
            return f();
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    synchronized <Model> List<m<Model, ?>> e(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.a) {
                if (!this.c.contains(bVar) && bVar.a(cls)) {
                    this.c.add(bVar);
                    arrayList.add(c(bVar));
                    this.c.remove(bVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    synchronized List<Class<?>> g(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.a) {
            if (!arrayList.contains(bVar.b) && bVar.a(cls)) {
                arrayList.add(bVar.b);
            }
        }
        return arrayList;
    }

    q(InterfaceC1443d<List<Exception>> interfaceC1443d, c cVar) {
        this.a = new ArrayList();
        this.c = new HashSet();
        this.d = interfaceC1443d;
        this.b = cVar;
    }
}
