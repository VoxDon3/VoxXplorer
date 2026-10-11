package ax.r7;

import android.R;
import j$.util.SortedSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;

/* renamed from: ax.r7.E, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2966E<E> extends AbstractC2964C<E> implements NavigableSet<E>, f0<E>, SortedSet {
    final transient Comparator<? super E> d0;
    transient AbstractC2966E<E> e0;

    AbstractC2966E(Comparator<? super E> comparator) {
        this.d0 = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <E> AbstractC2966E<E> G(Comparator<? super E> comparator, int i, E... eArr) {
        if (i == 0) {
            return O(comparator);
        }
        S.c(eArr, i);
        Arrays.sort(eArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            R.color colorVar = (Object) eArr[i3];
            if (comparator.compare(colorVar, (Object) eArr[i2 - 1]) != 0) {
                eArr[i2] = colorVar;
                i2++;
            }
        }
        Arrays.fill(eArr, i2, i, (Object) null);
        if (i2 < eArr.length / 2) {
            eArr = (E[]) Arrays.copyOf(eArr, i2);
        }
        return new Y(AbstractC2991z.q(eArr, i2), comparator);
    }

    public static <E> AbstractC2966E<E> I(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        ax.q7.n.n(comparator);
        if (g0.b(comparator, iterable) && (iterable instanceof AbstractC2966E)) {
            AbstractC2966E<E> abstractC2966E = (AbstractC2966E) iterable;
            if (!abstractC2966E.l()) {
                return abstractC2966E;
            }
        }
        Object[] m = F.m(iterable);
        return G(comparator, m.length, m);
    }

    public static <E> AbstractC2966E<E> J(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return I(comparator, collection);
    }

    static <E> Y<E> O(Comparator<? super E> comparator) {
        return T.d().equals(comparator) ? (Y<E>) Y.g0 : new Y<>(AbstractC2991z.z(), comparator);
    }

    static int Z(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    abstract AbstractC2966E<E> K();

    @Override // java.util.NavigableSet
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public abstract j0<E> descendingIterator();

    @Override // java.util.NavigableSet
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public AbstractC2966E<E> descendingSet() {
        AbstractC2966E<E> abstractC2966E = this.e0;
        if (abstractC2966E != null) {
            return abstractC2966E;
        }
        AbstractC2966E<E> K = K();
        this.e0 = K;
        K.e0 = this;
        return K;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public AbstractC2966E<E> headSet(E e) {
        return headSet(e, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public AbstractC2966E<E> headSet(E e, boolean z) {
        return R(ax.q7.n.n(e), z);
    }

    abstract AbstractC2966E<E> R(E e, boolean z);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public AbstractC2966E<E> subSet(E e, E e2) {
        return subSet(e, true, e2, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public AbstractC2966E<E> subSet(E e, boolean z, E e2, boolean z2) {
        ax.q7.n.n(e);
        ax.q7.n.n(e2);
        ax.q7.n.d(this.d0.compare(e, e2) <= 0);
        return U(e, z, e2, z2);
    }

    abstract AbstractC2966E<E> U(E e, boolean z, E e2, boolean z2);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public AbstractC2966E<E> tailSet(E e) {
        return tailSet(e, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public AbstractC2966E<E> tailSet(E e, boolean z) {
        return X(ax.q7.n.n(e), z);
    }

    abstract AbstractC2966E<E> X(E e, boolean z);

    int Y(Object obj, Object obj2) {
        return Z(this.d0, obj, obj2);
    }

    @Override // java.util.NavigableSet
    public E ceiling(E e) {
        return (E) F.d(tailSet(e, true), null);
    }

    @Override // java.util.SortedSet, ax.r7.f0
    public Comparator<? super E> comparator() {
        return this.d0;
    }

    @Override // java.util.SortedSet
    public E first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    public E floor(E e) {
        return (E) G.n(headSet(e, true).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    public E higher(E e) {
        return (E) F.d(tailSet(e, false), null);
    }

    @Override // java.util.SortedSet
    public E last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public E lower(E e) {
        return (E) G.n(headSet(e, false).descendingIterator(), null);
    }

    @Override // ax.r7.AbstractC2964C, ax.r7.AbstractC2989x, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: n */
    public abstract j0<E> iterator();

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }
}
