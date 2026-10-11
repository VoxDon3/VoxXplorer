/*
 * Decompiled with CFR 0.152.
 */
package ax.f4;

import ax.M3.k;
import java.util.ArrayList;
import java.util.List;

public class e {
    private final List<a<?, ?>> a = new ArrayList();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <T, R> void a(k<T, R> k8, Class<T> clazz, Class<R> clazz2) {
        synchronized (this) {
            List<a<?, ?>> list = this.a;
            a<T, R> a8 = new a<T, R>(clazz, clazz2, k8);
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
    public <T, R> List<k<T, R>> b(Class<T> clazz, Class<R> clazz2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                ArrayList<k<T, R>> arrayList;
                try {
                    arrayList = new ArrayList<k<T, R>>();
                    for (a<T, T> a8 : this.a) {
                        if (!a8.a(clazz, clazz2)) continue;
                        arrayList.add(a8.c);
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <T, R> List<Class<R>> c(Class<T> clazz, Class<R> clazz2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                ArrayList<Class<R>> arrayList;
                try {
                    arrayList = new ArrayList<Class<R>>();
                    for (a<T, T> a8 : this.a) {
                        if (!a8.a(clazz, clazz2)) continue;
                        arrayList.add(a8.b);
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <T, R> void d(k<T, R> k8, Class<T> clazz, Class<R> clazz2) {
        synchronized (this) {
            List<a<?, ?>> list = this.a;
            a<T, R> a8 = new a<T, R>(clazz, clazz2, k8);
            list.add(0, a8);
            return;
        }
    }

    private static class a<T, R> {
        private final Class<T> a;
        final Class<R> b;
        final k<T, R> c;

        public a(Class<T> clazz, Class<R> clazz2, k<T, R> k8) {
            this.a = clazz;
            this.b = clazz2;
            this.c = k8;
        }

        public boolean a(Class<?> clazz, Class<?> clazz2) {
            return this.a.isAssignableFrom(clazz) && clazz2.isAssignableFrom(this.b);
        }
    }
}

