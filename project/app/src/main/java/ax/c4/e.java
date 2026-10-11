/*
 * Decompiled with CFR 0.152.
 */
package ax.c4;

import ax.c4.d;
import ax.c4.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class e {
    private final List<a<?, ?>> a = new ArrayList();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <Z, R> d<Z, R> a(Class<Z> d8, Class<R> clazz) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object;
                try {
                    if (clazz.isAssignableFrom((Class<?>)((Object)d8))) {
                        return f.b();
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                Object object2 = this.a.iterator();
                do {
                    if (object2.hasNext()) continue;
                    object = new StringBuilder();
                    ((StringBuilder)object).append("No transcoder registered to transcode from ");
                    ((StringBuilder)object).append(d8);
                    ((StringBuilder)object).append(" to ");
                    ((StringBuilder)object).append(clazz);
                    object2 = new IllegalArgumentException(((StringBuilder)object).toString());
                    throw object2;
                } while (!((a)(object = object2.next())).a((Class<?>)((Object)d8), clazz));
                return ((a)object).c;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <Z, R> List<Class<R>> b(Class<Z> clazz, Class<R> clazz2) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                ArrayList<Class<R>> arrayList;
                try {
                    arrayList = new ArrayList<Class<R>>();
                    if (clazz2.isAssignableFrom(clazz)) {
                        arrayList.add(clazz2);
                        return arrayList;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                Iterator<a<?, ?>> iterator = this.a.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        return arrayList;
                    }
                    if (!iterator.next().a(clazz, clazz2)) continue;
                    arrayList.add(clazz2);
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <Z, R> void c(Class<Z> clazz, Class<R> clazz2, d<Z, R> d8) {
        synchronized (this) {
            List<a<?, ?>> list = this.a;
            a<Z, R> a8 = new a<Z, R>(clazz, clazz2, d8);
            list.add(a8);
            return;
        }
    }

    private static final class a<Z, R> {
        private final Class<Z> a;
        private final Class<R> b;
        final d<Z, R> c;

        a(Class<Z> clazz, Class<R> clazz2, d<Z, R> d8) {
            this.a = clazz;
            this.b = clazz2;
            this.c = d8;
        }

        public boolean a(Class<?> clazz, Class<?> clazz2) {
            return this.a.isAssignableFrom(clazz) && clazz2.isAssignableFrom(this.b);
        }
    }
}

