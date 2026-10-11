/*
 * Decompiled with CFR 0.152.
 */
package ax.f4;

import ax.M3.l;
import java.util.ArrayList;
import java.util.List;

public class f {
    final List<a<?>> a = new ArrayList();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <Z> void a(Class<Z> clazz, l<Z> l8) {
        synchronized (this) {
            List<a<?>> list = this.a;
            a<Z> a8 = new a<Z>(clazz, l8);
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
    public <Z> l<Z> b(Class<Z> l8) {
        synchronized (this) {
            try {
                int n8 = this.a.size();
                int n9 = 0;
                while (n9 < n8) {
                    a a8 = this.a.get(n9);
                    if (a8.a((Class<?>)((Object)l8))) {
                        return a8.b;
                    }
                    ++n9;
                }
                return null;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private static final class a<T> {
        private final Class<T> a;
        final l<T> b;

        a(Class<T> clazz, l<T> l8) {
            this.a = clazz;
            this.b = l8;
        }

        boolean a(Class<?> clazz) {
            return this.a.isAssignableFrom(clazz);
        }
    }
}

