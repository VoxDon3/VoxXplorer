/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.j;
import ax.q7.n;
import ax.q7.o;
import ax.r7.a;
import ax.r7.i;
import ax.r7.j0;
import ax.r7.k0;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class G {
    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> iterator) {
        n.n(collection);
        n.n(iterator);
        boolean bl = false;
        while (iterator.hasNext()) {
            bl |= collection.add(iterator.next());
        }
        return bl;
    }

    public static int b(Iterator<?> iterator, int n8) {
        int n9;
        n.n(iterator);
        boolean bl = n8 >= 0;
        n.e(bl, "numberToAdvance must be nonnegative");
        for (n9 = 0; n9 < n8 && iterator.hasNext(); ++n9) {
            iterator.next();
        }
        return n9;
    }

    public static <T> boolean c(Iterator<T> iterator, o<? super T> o8) {
        return G.p(iterator, o8) != -1;
    }

    static void d(Iterator<?> iterator) {
        n.n(iterator);
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

    public static boolean e(Iterator<?> iterator, Object object) {
        if (object == null) {
            while (iterator.hasNext()) {
                if (iterator.next() != null) continue;
                return true;
            }
        } else {
            while (iterator.hasNext()) {
                if (!object.equals(iterator.next())) continue;
                return true;
            }
        }
        return false;
    }

    public static boolean f(Iterator<?> iterator, Iterator<?> iterator2) {
        while (iterator.hasNext()) {
            if (!iterator2.hasNext()) {
                return false;
            }
            if (j.a(iterator.next(), iterator2.next())) continue;
            return false;
        }
        return iterator2.hasNext() ^ true;
    }

    static <T> j0<T> g() {
        return G.h();
    }

    static <T> k0<T> h() {
        return b.e0;
    }

    static <T> Iterator<T> i() {
        return c.q;
    }

    public static <T> j0<T> j(Iterator<T> iterator, o<? super T> o8) {
        n.n(iterator);
        n.n(o8);
        return new ax.r7.b<T>(iterator, o8){
            final Iterator d0;
            final o e0;
            {
                this.d0 = iterator;
                this.e0 = o8;
            }

            @Override
            protected T b() {
                while (this.d0.hasNext()) {
                    Object e8 = this.d0.next();
                    if (!this.e0.apply(e8)) continue;
                    return e8;
                }
                return this.c();
            }
        };
    }

    public static <T> T k(Iterator<T> iterator, o<? super T> o8) {
        n.n(iterator);
        n.n(o8);
        while (iterator.hasNext()) {
            T t8 = iterator.next();
            if (!o8.apply(t8)) continue;
            return t8;
        }
        throw new NoSuchElementException();
    }

    public static <T> T l(Iterator<T> iterator) {
        T t8;
        do {
            t8 = iterator.next();
        } while (iterator.hasNext());
        return t8;
    }

    public static <T> T m(Iterator<? extends T> iterator, T t8) {
        if (iterator.hasNext()) {
            return G.l(iterator);
        }
        return t8;
    }

    public static <T> T n(Iterator<? extends T> iterator, T t8) {
        if (iterator.hasNext()) {
            return iterator.next();
        }
        return t8;
    }

    public static <T> T o(Iterator<T> iterator) {
        T t8 = iterator.next();
        if (!iterator.hasNext()) {
            return t8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("expected one element but was: <");
        stringBuilder.append(t8);
        for (int i8 = 0; i8 < 4 && iterator.hasNext(); ++i8) {
            stringBuilder.append(", ");
            stringBuilder.append(iterator.next());
        }
        if (iterator.hasNext()) {
            stringBuilder.append(", ...");
        }
        stringBuilder.append('>');
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static <T> int p(Iterator<T> iterator, o<? super T> o8) {
        n.o(o8, "predicate");
        int n8 = 0;
        while (iterator.hasNext()) {
            if (o8.apply(iterator.next())) {
                return n8;
            }
            ++n8;
        }
        return -1;
    }

    static <T> T q(Iterator<T> iterator) {
        if (iterator.hasNext()) {
            T t8 = iterator.next();
            iterator.remove();
            return t8;
        }
        return null;
    }

    public static boolean r(Iterator<?> iterator, Collection<?> collection) {
        n.n(collection);
        boolean bl = false;
        while (iterator.hasNext()) {
            if (!collection.contains(iterator.next())) continue;
            iterator.remove();
            bl = true;
        }
        return bl;
    }

    public static <T> boolean s(Iterator<T> iterator, o<? super T> o8) {
        n.n(o8);
        boolean bl = false;
        while (iterator.hasNext()) {
            if (!o8.apply(iterator.next())) continue;
            iterator.remove();
            bl = true;
        }
        return bl;
    }

    public static <T> j0<T> t(T t8) {
        return new d<T>(t8);
    }

    public static String u(Iterator<?> iterator) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        boolean bl = true;
        while (iterator.hasNext()) {
            if (!bl) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(iterator.next());
            bl = false;
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    private static final class b<T>
    extends a<T> {
        static final k0<Object> e0 = new b<Object>(new Object[0], 0);
        private final T[] d0;

        b(T[] TArray, int n8) {
            super(TArray.length, n8);
            this.d0 = TArray;
        }

        @Override
        protected T b(int n8) {
            return this.d0[n8];
        }
    }

    private static final class c
    extends Enum<c>
    implements Iterator<Object> {
        private static final c[] c0;
        public static final /* enum */ c q;

        static {
            q = new c();
            c0 = c.h();
        }

        private static /* synthetic */ c[] h() {
            return new c[]{q};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])c0.clone();
        }

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            i.c(false);
        }
    }

    private static final class d<T>
    extends j0<T> {
        private boolean c0;
        private final T q;

        d(T t8) {
            this.q = t8;
        }

        @Override
        public boolean hasNext() {
            return this.c0 ^ true;
        }

        @Override
        public T next() {
            if (!this.c0) {
                this.c0 = true;
                return this.q;
            }
            throw new NoSuchElementException();
        }
    }
}

