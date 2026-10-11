package ax.r7;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.Stream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* renamed from: ax.r7.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2989x<E> extends AbstractCollection<E> implements Serializable, Collection {
    private static final Object[] q = new Object[0];

    /* renamed from: ax.r7.x$a */
    static abstract class a<E> extends b<E> {
        Object[] a;
        int b;
        boolean c;

        a(int i) {
            C2975i.b(i, "initialCapacity");
            this.a = new Object[i];
            this.b = 0;
        }

        private void g(int i) {
            Object[] objArr = this.a;
            int c = b.c(objArr.length, this.b + i);
            if (c > objArr.length || this.c) {
                this.a = Arrays.copyOf(this.a, c);
                this.c = false;
            }
        }

        @Override // ax.r7.AbstractC2989x.b
        public b<E> b(Iterable<? extends E> iterable) {
            if (iterable instanceof java.util.Collection) {
                java.util.Collection collection = (java.util.Collection) iterable;
                g(collection.size());
                if (collection instanceof AbstractC2989x) {
                    this.b = ((AbstractC2989x) collection).g(this.a, this.b);
                    return this;
                }
            }
            super.b(iterable);
            return this;
        }

        public a<E> d(E e) {
            ax.q7.n.n(e);
            g(1);
            Object[] objArr = this.a;
            int i = this.b;
            this.b = i + 1;
            objArr[i] = e;
            return this;
        }

        public b<E> e(E... eArr) {
            f(eArr, eArr.length);
            return this;
        }

        final void f(Object[] objArr, int i) {
            S.c(objArr, i);
            g(i);
            System.arraycopy(objArr, 0, this.a, this.b, i);
            this.b += i;
        }
    }

    /* renamed from: ax.r7.x$b */
    public static abstract class b<E> {
        b() {
        }

        static int c(int i, int i2) {
            if (i2 < 0) {
                throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
            }
            if (i2 <= i) {
                return i;
            }
            int i3 = i + (i >> 1) + 1;
            if (i3 < i2) {
                i3 = Integer.highestOneBit(i2 - 1) << 1;
            }
            return i3 < 0 ? SubsamplingScaleImageView.TILE_SIZE_AUTO : i3;
        }

        public abstract b<E> a(E e);

        public b<E> b(Iterable<? extends E> iterable) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }
    }

    AbstractC2989x() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(java.util.Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    public AbstractC2991z<E> e() {
        return isEmpty() ? AbstractC2991z.z() : AbstractC2991z.p(toArray());
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    int g(Object[] objArr, int i) {
        j0<E> it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: n */
    public abstract j0<E> iterator();

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(java.util.Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(java.util.Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(stream());
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public j$.util.Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(q);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        ax.q7.n.n(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] h = h();
            if (h != null) {
                return (T[]) U.a(h, k(), i(), tArr);
            }
            tArr = (T[]) S.d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        g(tArr, 0);
        return tArr;
    }
}
