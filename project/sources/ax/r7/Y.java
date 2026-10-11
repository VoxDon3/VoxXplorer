package ax.r7;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes3.dex */
final class Y<E> extends AbstractC2966E<E> {
    static final Y<Comparable> g0 = new Y<>(AbstractC2991z.z(), T.d());
    final transient AbstractC2991z<E> f0;

    Y(AbstractC2991z<E> abstractC2991z, Comparator<? super E> comparator) {
        super(comparator);
        this.f0 = abstractC2991z;
    }

    private int e0(Object obj) throws ClassCastException {
        return Collections.binarySearch(this.f0, obj, f0());
    }

    @Override // ax.r7.AbstractC2966E
    AbstractC2966E<E> K() {
        Comparator reverseOrder = Collections.reverseOrder(this.d0);
        return isEmpty() ? AbstractC2966E.O(reverseOrder) : new Y(this.f0.I(), reverseOrder);
    }

    @Override // ax.r7.AbstractC2966E, java.util.NavigableSet
    /* renamed from: M */
    public j0<E> descendingIterator() {
        return this.f0.I().iterator();
    }

    @Override // ax.r7.AbstractC2966E
    AbstractC2966E<E> R(E e, boolean z) {
        return a0(0, b0(e, z));
    }

    @Override // ax.r7.AbstractC2966E
    AbstractC2966E<E> U(E e, boolean z, E e2, boolean z2) {
        return X(e, z).R(e2, z2);
    }

    @Override // ax.r7.AbstractC2966E
    AbstractC2966E<E> X(E e, boolean z) {
        return a0(c0(e, z), size());
    }

    Y<E> a0(int i, int i2) {
        return (i == 0 && i2 == size()) ? this : i < i2 ? new Y<>(this.f0.subList(i, i2), this.d0) : AbstractC2966E.O(this.d0);
    }

    int b0(E e, boolean z) {
        int binarySearch = Collections.binarySearch(this.f0, ax.q7.n.n(e), comparator());
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    int c0(E e, boolean z) {
        int binarySearch = Collections.binarySearch(this.f0, ax.q7.n.n(e), comparator());
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    @Override // ax.r7.AbstractC2966E, java.util.NavigableSet
    public E ceiling(E e) {
        int c0 = c0(e, true);
        if (c0 == size()) {
            return null;
        }
        return this.f0.get(c0);
    }

    @Override // ax.r7.AbstractC2989x, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (e0(obj) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof O) {
            collection = ((O) collection).H();
        }
        if (!g0.b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        j0<E> it = iterator();
        Iterator<?> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int Y = Y(next2, next);
                if (Y < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (Y == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (Y > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // ax.r7.AbstractC2964C, ax.r7.AbstractC2989x
    public AbstractC2991z<E> e() {
        return this.f0;
    }

    @Override // ax.r7.AbstractC2964C, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!g0.b(this.d0, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            j0<E> it2 = iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                E next2 = it.next();
                if (next2 == null || Y(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    Comparator<Object> f0() {
        return this.d0;
    }

    @Override // ax.r7.AbstractC2966E, java.util.SortedSet
    public E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f0.get(0);
    }

    @Override // ax.r7.AbstractC2966E, java.util.NavigableSet
    public E floor(E e) {
        int b0 = b0(e, true) - 1;
        if (b0 == -1) {
            return null;
        }
        return this.f0.get(b0);
    }

    @Override // ax.r7.AbstractC2989x
    int g(Object[] objArr, int i) {
        return this.f0.g(objArr, i);
    }

    @Override // ax.r7.AbstractC2989x
    Object[] h() {
        return this.f0.h();
    }

    @Override // ax.r7.AbstractC2966E, java.util.NavigableSet
    public E higher(E e) {
        int c0 = c0(e, false);
        if (c0 == size()) {
            return null;
        }
        return this.f0.get(c0);
    }

    @Override // ax.r7.AbstractC2989x
    int i() {
        return this.f0.i();
    }

    @Override // ax.r7.AbstractC2989x
    int k() {
        return this.f0.k();
    }

    @Override // ax.r7.AbstractC2989x
    boolean l() {
        return this.f0.l();
    }

    @Override // ax.r7.AbstractC2966E, java.util.SortedSet
    public E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f0.get(size() - 1);
    }

    @Override // ax.r7.AbstractC2966E, java.util.NavigableSet
    public E lower(E e) {
        int b0 = b0(e, false) - 1;
        if (b0 == -1) {
            return null;
        }
        return this.f0.get(b0);
    }

    @Override // ax.r7.AbstractC2966E, ax.r7.AbstractC2964C, ax.r7.AbstractC2989x, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: n */
    public j0<E> iterator() {
        return this.f0.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f0.size();
    }
}
