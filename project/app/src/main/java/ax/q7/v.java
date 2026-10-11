/*
 * Decompiled with CFR 0.152.
 */
package ax.q7;

import ax.q7.i;
import ax.q7.j;
import ax.q7.n;
import ax.q7.u;
import ax.q7.w;
import java.io.Serializable;

public final class v {
    public static <T> u<T> a(u<T> u8) {
        if (!(u8 instanceof b)) {
            if (u8 instanceof a) {
                return u8;
            }
            if (u8 instanceof Serializable) {
                return new a<T>(u8);
            }
            return new b<T>(u8);
        }
        return u8;
    }

    public static <T> u<T> b(T t8) {
        return new c<T>(t8);
    }

    static class a<T>
    implements u<T>,
    Serializable {
        final u<T> c0;
        volatile transient boolean d0;
        transient T e0;
        private transient Object q = new Object();

        a(u<T> u8) {
            this.c0 = n.n(u8);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public T get() {
            if (this.d0) return i.a(this.e0);
            Object object = this.q;
            synchronized (object) {
                try {
                    if (this.d0) return i.a(this.e0);
                    T t8 = this.c0.get();
                    this.e0 = t8;
                    this.d0 = true;
                    return t8;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        public String toString() {
            Object object;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Suppliers.memoize(");
            if (this.d0) {
                object = new StringBuilder();
                ((StringBuilder)object).append("<supplier that returned ");
                ((StringBuilder)object).append(this.e0);
                ((StringBuilder)object).append(">");
                object = ((StringBuilder)object).toString();
            } else {
                object = this.c0;
            }
            stringBuilder.append(object);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    static class b<T>
    implements u<T> {
        private static final u<Void> e0 = new w();
        private volatile u<T> c0;
        private T d0;
        private final Object q = new Object();

        b(u<T> u8) {
            this.c0 = n.n(u8);
        }

        public static /* synthetic */ Void a() {
            throw new IllegalStateException();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public T get() {
            u<T> u8 = this.c0;
            u<Void> u9 = e0;
            if (u8 == u9) return i.a(this.d0);
            u8 = this.q;
            synchronized (u8) {
                try {
                    if (this.c0 == u9) return i.a(this.d0);
                    T t8 = this.c0.get();
                    this.d0 = t8;
                    this.c0 = u9;
                    return t8;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        public String toString() {
            u<T> u8 = this.c0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Suppliers.memoize(");
            Object object = u8;
            if (u8 == e0) {
                object = new StringBuilder();
                ((StringBuilder)object).append("<supplier that returned ");
                ((StringBuilder)object).append(this.d0);
                ((StringBuilder)object).append(">");
                object = ((StringBuilder)object).toString();
            }
            stringBuilder.append(object);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    private static class c<T>
    implements u<T>,
    Serializable {
        final T q;

        c(T t8) {
            this.q = t8;
        }

        public boolean equals(Object object) {
            if (object instanceof c) {
                object = (c)object;
                return j.a(this.q, ((c)object).q);
            }
            return false;
        }

        @Override
        public T get() {
            return this.q;
        }

        public int hashCode() {
            return j.b(this.q);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Suppliers.ofInstance(");
            stringBuilder.append(this.q);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }
}

