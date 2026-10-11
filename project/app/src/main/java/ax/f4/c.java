/*
 * Decompiled with CFR 0.152.
 */
package ax.f4;

import ax.B.a;
import ax.P3.q;
import ax.k4.g;
import java.util.concurrent.atomic.AtomicReference;

public class c {
    private final a<g, q<?, ?, ?>> a = new a();
    private final AtomicReference<g> b = new AtomicReference();

    private g c(Class<?> clazz, Class<?> clazz2, Class<?> clazz3) {
        g g8;
        g g9 = g8 = (g)this.b.getAndSet(null);
        if (g8 == null) {
            g9 = new g();
        }
        g9.b(clazz, clazz2, clazz3);
        return g9;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a(Class<?> object, Class<?> object2, Class<?> clazz) {
        boolean bl;
        object2 = this.c((Class<?>)object, (Class<?>)object2, clazz);
        object = this.a;
        synchronized (object) {
            bl = this.a.containsKey(object2);
        }
        this.b.set((g)object2);
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <Data, TResource, Transcode> q<Data, TResource, Transcode> b(Class<Data> object, Class<TResource> object2, Class<Transcode> object3) {
        object2 = this.c((Class<?>)object, (Class<?>)object2, (Class<?>)object3);
        object = this.a;
        synchronized (object) {
            object3 = this.a.get(object2);
        }
        this.b.set((g)object2);
        return object3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void d(Class<?> clazz, Class<?> clazz2, Class<?> clazz3, q<?, ?, ?> q8) {
        a<g, q<?, ?, ?>> a8 = this.a;
        synchronized (a8) {
            a<g, q<?, ?, ?>> a9 = this.a;
            g g8 = new g(clazz, clazz2, clazz3);
            a9.put(g8, q8);
            return;
        }
    }
}

