/*
 * Decompiled with CFR 0.152.
 */
package ax.f4;

import ax.M3.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a {
    private final List<a<?>> a = new ArrayList();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <T> void a(Class<T> clazz, d<T> d8) {
        synchronized (this) {
            List<a<?>> list = this.a;
            a<T> a8 = new a<T>(clazz, d8);
            list.add(a8);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <T> d<T> b(Class<T> object) {
        synchronized (this) {
            try {
                a<T> a8;
                Iterator<a<?>> iterator = this.a.iterator();
                do {
                    if (!iterator.hasNext()) return null;
                } while (!(a8 = iterator.next()).a((Class<?>)object));
                return a8.b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private static final class a<T> {
        private final Class<T> a;
        final d<T> b;

        public a(Class<T> clazz, d<T> d8) {
            this.a = clazz;
            this.b = d8;
        }

        public boolean a(Class<?> clazz) {
            return this.a.isAssignableFrom(clazz);
        }
    }
}

