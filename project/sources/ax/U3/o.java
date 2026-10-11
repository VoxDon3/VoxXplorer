package ax.U3;

import ax.b0.InterfaceC1443d;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class o {
    private final q a;
    private final a b;

    private static class a {
        private final Map<Class<?>, C0207a<?>> a = new HashMap();

        /* renamed from: ax.U3.o$a$a, reason: collision with other inner class name */
        private static class C0207a<Model> {
            final List<m<Model, ?>> a;

            public C0207a(List<m<Model, ?>> list) {
                this.a = list;
            }
        }

        a() {
        }

        public void a() {
            this.a.clear();
        }

        public <Model> List<m<Model, ?>> b(Class<Model> cls) {
            C0207a<?> c0207a = this.a.get(cls);
            if (c0207a == null) {
                return null;
            }
            return (List<m<Model, ?>>) c0207a.a;
        }

        public <Model> void c(Class<Model> cls, List<m<Model, ?>> list) {
            if (this.a.put(cls, new C0207a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public o(InterfaceC1443d<List<Exception>> interfaceC1443d) {
        this(new q(interfaceC1443d));
    }

    private static <A> Class<A> b(A a2) {
        return (Class<A>) a2.getClass();
    }

    private <A> List<m<A, ?>> e(Class<A> cls) {
        List<m<A, ?>> b = this.b.b(cls);
        if (b != null) {
            return b;
        }
        List<m<A, ?>> unmodifiableList = DesugarCollections.unmodifiableList(this.a.e(cls));
        this.b.c(cls, unmodifiableList);
        return unmodifiableList;
    }

    public synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, n<Model, Data> nVar) {
        this.a.b(cls, cls2, nVar);
        this.b.a();
    }

    public synchronized List<Class<?>> c(Class<?> cls) {
        return this.a.g(cls);
    }

    public synchronized <A> List<m<A, ?>> d(A a2) {
        ArrayList arrayList;
        List<m<A, ?>> e = e(b(a2));
        int size = e.size();
        arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            m<A, ?> mVar = e.get(i);
            if (mVar.b(a2)) {
                arrayList.add(mVar);
            }
        }
        return arrayList;
    }

    o(q qVar) {
        this.b = new a();
        this.a = qVar;
    }
}
