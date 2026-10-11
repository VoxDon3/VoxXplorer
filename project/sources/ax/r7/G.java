package ax.r7;

import ax.q7.C2883j;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class G {

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends AbstractC2968b<T> {
        final /* synthetic */ Iterator d0;
        final /* synthetic */ ax.q7.o e0;

        a(Iterator it, ax.q7.o oVar) {
            this.d0 = it;
            this.e0 = oVar;
        }

        @Override // ax.r7.AbstractC2968b
        protected T b() {
            while (this.d0.hasNext()) {
                T t = (T) this.d0.next();
                if (this.e0.apply(t)) {
                    return t;
                }
            }
            return c();
        }
    }

    private static final class b<T> extends AbstractC2967a<T> {
        static final k0<Object> e0 = new b(new Object[0], 0);
        private final T[] d0;

        b(T[] tArr, int i) {
            super(tArr.length, i);
            this.d0 = tArr;
        }

        @Override // ax.r7.AbstractC2967a
        protected T b(int i) {
            return this.d0[i];
        }
    }

    private enum c implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            C2975i.c(false);
        }
    }

    private static final class d<T> extends j0<T> {
        private boolean c0;
        private final T q;

        d(T t) {
            this.q = t;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.c0;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.c0) {
                throw new NoSuchElementException();
            }
            this.c0 = true;
            return this.q;
        }
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        ax.q7.n.n(collection);
        ax.q7.n.n(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    public static int b(Iterator<?> it, int i) {
        ax.q7.n.n(it);
        int i2 = 0;
        ax.q7.n.e(i >= 0, "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    public static <T> boolean c(Iterator<T> it, ax.q7.o<? super T> oVar) {
        return p(it, oVar) != -1;
    }

    static void d(Iterator<?> it) {
        ax.q7.n.n(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean e(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !C2883j.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    static <T> j0<T> g() {
        return h();
    }

    static <T> k0<T> h() {
        return (k0<T>) b.e0;
    }

    static <T> Iterator<T> i() {
        return c.INSTANCE;
    }

    public static <T> j0<T> j(Iterator<T> it, ax.q7.o<? super T> oVar) {
        ax.q7.n.n(it);
        ax.q7.n.n(oVar);
        return new a(it, oVar);
    }

    public static <T> T k(Iterator<T> it, ax.q7.o<? super T> oVar) {
        ax.q7.n.n(it);
        ax.q7.n.n(oVar);
        while (it.hasNext()) {
            T next = it.next();
            if (oVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static <T> T l(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T m(Iterator<? extends T> it, T t) {
        return it.hasNext() ? (T) l(it) : t;
    }

    public static <T> T n(Iterator<? extends T> it, T t) {
        return it.hasNext() ? it.next() : t;
    }

    public static <T> T o(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static <T> int p(Iterator<T> it, ax.q7.o<? super T> oVar) {
        ax.q7.n.o(oVar, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (oVar.apply(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    static <T> T q(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    public static boolean r(Iterator<?> it, Collection<?> collection) {
        ax.q7.n.n(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> boolean s(Iterator<T> it, ax.q7.o<? super T> oVar) {
        ax.q7.n.n(oVar);
        boolean z = false;
        while (it.hasNext()) {
            if (oVar.apply(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> j0<T> t(T t) {
        return new d(t);
    }

    public static String u(Iterator<?> it) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }
}
