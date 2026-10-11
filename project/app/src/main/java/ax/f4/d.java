/*
 * Decompiled with CFR 0.152.
 */
package ax.f4;

import ax.B.a;
import ax.k4.g;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class d {
    private final AtomicReference<g> a = new AtomicReference();
    private final a<g, List<Class<?>>> b = new a();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<Class<?>> a(Class<?> object, Class<?> object2) {
        Object object3 = this.a.getAndSet(null);
        if (object3 == null) {
            object = new g((Class<?>)object, (Class<?>)object2);
        } else {
            ((g)object3).a((Class<?>)object, (Class<?>)object2);
            object = object3;
        }
        object2 = this.b;
        synchronized (object2) {
            object3 = this.b.get(object);
        }
        this.a.set((g)object);
        return object3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(Class<?> clazz, Class<?> clazz2, List<Class<?>> list) {
        a<g, List<Class<?>>> a8 = this.b;
        synchronized (a8) {
            a<g, List<Class<?>>> a9 = this.b;
            g g8 = new g(clazz, clazz2);
            a9.put(g8, list);
            return;
        }
    }
}

