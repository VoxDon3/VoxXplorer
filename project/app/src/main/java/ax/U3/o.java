/*
 * Decompiled with CFR 0.152.
 */
package ax.U3;

import ax.U3.m;
import ax.U3.n;
import ax.U3.q;
import ax.b0.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class o {
    private final q a;
    private final a b = new a();

    o(q q8) {
        this.a = q8;
    }

    public o(d<List<Exception>> d8) {
        this(new q(d8));
    }

    private static <A> Class<A> b(A a8) {
        return a8.getClass();
    }

    private <A> List<m<A, ?>> e(Class<A> clazz) {
        List list;
        List list2 = list = this.b.b(clazz);
        if (list == null) {
            list2 = java.util.DesugarCollections.unmodifiableList(this.a.e(clazz));
            this.b.c(clazz, list2);
        }
        return list2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <Model, Data> void a(Class<Model> clazz, Class<Data> clazz2, n<Model, Data> n8) {
        synchronized (this) {
            this.a.b(clazz, clazz2, n8);
            this.b.a();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<Class<?>> c(Class<?> object) {
        synchronized (this) {
            return this.a.g((Class<?>)object);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <A> List<m<A, ?>> d(A a8) {
        synchronized (this) {
            ArrayList arrayList;
            try {
                List<m<A, ?>> list = this.e(o.b(a8));
                int n8 = list.size();
                arrayList = new ArrayList(n8);
                for (int i8 = 0; i8 < n8; ++i8) {
                    m<A, ?> m8 = list.get(i8);
                    if (!m8.b(a8)) continue;
                    arrayList.add(m8);
                }
            }
            catch (Throwable throwable) {}
            return arrayList;
            throw throwable;
        }
    }

    private static class ax.U3.o$a {
        private final Map<Class<?>, a<?>> a = new HashMap();

        ax.U3.o$a() {
        }

        public void a() {
            this.a.clear();
        }

        public <Model> List<m<Model, ?>> b(Class<Model> object) {
            if ((object = this.a.get(object)) == null) {
                return null;
            }
            return ((a)object).a;
        }

        public <Model> void c(Class<Model> clazz, List<m<Model, ?>> object) {
            if (this.a.put(clazz, new a<Model>(object)) == null) {
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Already cached loaders for model: ");
            ((StringBuilder)object).append(clazz);
            throw new IllegalStateException(((StringBuilder)object).toString());
        }

        private static class a<Model> {
            final List<m<Model, ?>> a;

            public a(List<m<Model, ?>> list) {
                this.a = list;
            }
        }
    }
}

