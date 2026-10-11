/*
 * Decompiled with CFR 0.152.
 */
package ax.N3;

import ax.N3.c;
import ax.k4.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class d {
    private static final c.a<?> b = new c.a<Object>(){

        @Override
        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override
        public c<Object> b(Object object) {
            return new b(object);
        }
    };
    private final Map<Class<?>, c.a<?>> a = new HashMap();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <T> c<T> a(T object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                c.a<?> a8;
                c.a<?> a9;
                block4: {
                    try {
                        h.d(object);
                        a8 = a9 = this.a.get(object.getClass());
                        if (a9 != null) break block4;
                        Iterator<c.a<?>> iterator = this.a.values().iterator();
                        do {
                            a8 = a9;
                        } while (iterator.hasNext() && !(a8 = iterator.next()).a().isAssignableFrom(object.getClass()));
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                a9 = a8;
                if (a8 != null) return a9.b(object);
                a9 = b;
                return a9.b(object);
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(c.a<?> a8) {
        synchronized (this) {
            this.a.put(a8.a(), a8);
            return;
        }
    }

    private static class b
    implements c<Object> {
        private final Object a;

        public b(Object object) {
            this.a = object;
        }

        @Override
        public Object a() {
            return this.a;
        }

        @Override
        public void b() {
        }
    }
}

