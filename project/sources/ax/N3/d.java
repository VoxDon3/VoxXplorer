package ax.N3;

import ax.N3.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class d {
    private static final c.a<?> b = new a();
    private final Map<Class<?>, c.a<?>> a = new HashMap();

    static class a implements c.a<Object> {
        a() {
        }

        @Override // ax.N3.c.a
        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // ax.N3.c.a
        public c<Object> b(Object obj) {
            return new b(obj);
        }
    }

    public synchronized <T> c<T> a(T t) {
        c.a<?> aVar;
        try {
            ax.k4.h.d(t);
            aVar = this.a.get(t.getClass());
            if (aVar == null) {
                Iterator<c.a<?>> it = this.a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    c.a<?> next = it.next();
                    if (next.a().isAssignableFrom(t.getClass())) {
                        aVar = next;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = b;
            }
        } catch (Throwable th) {
            throw th;
        }
        return (c<T>) aVar.b(t);
    }

    public synchronized void b(c.a<?> aVar) {
        this.a.put(aVar.a(), aVar);
    }

    private static class b implements c<Object> {
        private final Object a;

        public b(Object obj) {
            this.a = obj;
        }

        @Override // ax.N3.c
        public Object a() {
            return this.a;
        }

        @Override // ax.N3.c
        public void b() {
        }
    }
}
