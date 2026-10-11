package ax.q7;

import ax.q7.v;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class v {

    static class a<T> implements u<T>, Serializable {
        final u<T> c0;
        volatile transient boolean d0;
        transient T e0;
        private transient Object q = new Object();

        a(u<T> uVar) {
            this.c0 = (u) n.n(uVar);
        }

        @Override // ax.q7.u
        public T get() {
            if (!this.d0) {
                synchronized (this.q) {
                    try {
                        if (!this.d0) {
                            T t = this.c0.get();
                            this.e0 = t;
                            this.d0 = true;
                            return t;
                        }
                    } finally {
                    }
                }
            }
            return (T) C2882i.a(this.e0);
        }

        public String toString() {
            Object obj;
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            if (this.d0) {
                obj = "<supplier that returned " + this.e0 + ">";
            } else {
                obj = this.c0;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    static class b<T> implements u<T> {
        private static final u<Void> e0 = new u() { // from class: ax.q7.w
            @Override // ax.q7.u
            public final Object get() {
                return v.b.a();
            }
        };
        private volatile u<T> c0;
        private T d0;
        private final Object q = new Object();

        b(u<T> uVar) {
            this.c0 = (u) n.n(uVar);
        }

        public static /* synthetic */ Void a() {
            throw new IllegalStateException();
        }

        @Override // ax.q7.u
        public T get() {
            u<T> uVar = this.c0;
            u<T> uVar2 = (u<T>) e0;
            if (uVar != uVar2) {
                synchronized (this.q) {
                    try {
                        if (this.c0 != uVar2) {
                            T t = this.c0.get();
                            this.d0 = t;
                            this.c0 = uVar2;
                            return t;
                        }
                    } finally {
                    }
                }
            }
            return (T) C2882i.a(this.d0);
        }

        public String toString() {
            Object obj = this.c0;
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            if (obj == e0) {
                obj = "<supplier that returned " + this.d0 + ">";
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    private static class c<T> implements u<T>, Serializable {
        final T q;

        c(T t) {
            this.q = t;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return C2883j.a(this.q, ((c) obj).q);
            }
            return false;
        }

        @Override // ax.q7.u
        public T get() {
            return this.q;
        }

        public int hashCode() {
            return C2883j.b(this.q);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.q + ")";
        }
    }

    public static <T> u<T> a(u<T> uVar) {
        return !(uVar instanceof b) ? uVar instanceof a ? uVar : uVar instanceof Serializable ? new a(uVar) : new b(uVar) : uVar;
    }

    public static <T> u<T> b(T t) {
        return new c(t);
    }
}
