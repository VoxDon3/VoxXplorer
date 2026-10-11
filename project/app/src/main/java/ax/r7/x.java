/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.n;
import ax.r7.S;
import ax.r7.U;
import ax.r7.i;
import ax.r7.j0;
import ax.r7.z;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public abstract class x<E>
extends AbstractCollection<E>
implements Serializable,
j.Collection {
    private static final Object[] q = new Object[0];

    x() {
    }

    @Override
    @Deprecated
    public final boolean add(E e8) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public abstract boolean contains(Object var1);

    public z<E> e() {
        if (this.isEmpty()) {
            return z.z();
        }
        return z.p(this.toArray());
    }

    @Override
    public /* synthetic */ void forEach(Consumer consumer) {
        j.Iterable._CC.$default$forEach((Iterable)this, (Consumer)consumer);
    }

    int g(Object[] objectArray, int n8) {
        j0<E> j02 = this.n();
        while (j02.hasNext()) {
            objectArray[n8] = j02.next();
            ++n8;
        }
        return n8;
    }

    Object[] h() {
        return null;
    }

    int i() {
        throw new UnsupportedOperationException();
    }

    int k() {
        throw new UnsupportedOperationException();
    }

    abstract boolean l();

    public abstract j0<E> n();

    public /* synthetic */ j.Stream parallelStream() {
        return j.Collection._CC.$default$parallelStream((Collection)this);
    }

    @Override
    public /* synthetic */ Stream parallelStream() {
        return j.Stream.Wrapper.convert((j.Stream)this.parallelStream());
    }

    @Override
    @Deprecated
    public final boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return j.Collection._CC.$default$removeIf((Collection)this, (Predicate)predicate);
    }

    @Override
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public j.Spliterator<E> spliterator() {
        return j.Spliterators.spliterator((Collection)this, (int)1296);
    }

    @Override
    public /* synthetic */ Spliterator spliterator() {
        return j.Spliterator.Wrapper.convert(this.spliterator());
    }

    public /* synthetic */ j.Stream stream() {
        return j.Collection._CC.$default$stream((Collection)this);
    }

    @Override
    public /* synthetic */ Stream stream() {
        return j.Stream.Wrapper.convert((j.Stream)this.stream());
    }

    @Override
    public final Object[] toArray() {
        return this.toArray(q);
    }

    @Override
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return j.Collection._CC.$default$toArray((Collection)this, (IntFunction)intFunction);
    }

    @Override
    public final <T> T[] toArray(T[] TArray) {
        Object[] objectArray;
        n.n(TArray);
        int n8 = this.size();
        if (TArray.length < n8) {
            objectArray = this.h();
            if (objectArray != null) {
                return U.a(objectArray, this.k(), this.i(), TArray);
            }
            objectArray = S.d(TArray, n8);
        } else {
            objectArray = TArray;
            if (TArray.length > n8) {
                TArray[n8] = null;
                objectArray = TArray;
            }
        }
        this.g(objectArray, 0);
        return objectArray;
    }

    static abstract class a<E>
    extends b<E> {
        Object[] a;
        int b;
        boolean c;

        a(int n8) {
            i.b(n8, "initialCapacity");
            this.a = new Object[n8];
            this.b = 0;
        }

        private void g(int n8) {
            Object[] objectArray = this.a;
            if ((n8 = ax.r7.x$b.c(objectArray.length, this.b + n8)) <= objectArray.length && !this.c) {
                return;
            }
            this.a = Arrays.copyOf(this.a, n8);
            this.c = false;
        }

        @Override
        public b<E> b(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection)iterable;
                this.g(collection.size());
                if (collection instanceof x) {
                    this.b = ((x)collection).g(this.a, this.b);
                    return this;
                }
            }
            super.b(iterable);
            return this;
        }

        public a<E> d(E e8) {
            n.n(e8);
            this.g(1);
            Object[] objectArray = this.a;
            int n8 = this.b;
            this.b = n8 + 1;
            objectArray[n8] = e8;
            return this;
        }

        public b<E> e(E ... EArray) {
            this.f(EArray, EArray.length);
            return this;
        }

        final void f(Object[] objectArray, int n8) {
            S.c(objectArray, n8);
            this.g(n8);
            System.arraycopy(objectArray, 0, this.a, this.b, n8);
            this.b += n8;
        }
    }

    public static abstract class b<E> {
        b() {
        }

        static int c(int n8, int n9) {
            if (n9 >= 0) {
                int n10;
                if (n9 <= n8) {
                    return n8;
                }
                n8 = n10 = n8 + (n8 >> 1) + 1;
                if (n10 < n9) {
                    n8 = Integer.highestOneBit(n9 - 1) << 1;
                }
                n9 = n8;
                if (n8 < 0) {
                    n9 = Integer.MAX_VALUE;
                }
                return n9;
            }
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }

        public abstract b<E> a(E var1);

        public b<E> b(Iterable<? extends E> object) {
            object = object.iterator();
            while (object.hasNext()) {
                this.a(object.next());
            }
            return this;
        }
    }
}

