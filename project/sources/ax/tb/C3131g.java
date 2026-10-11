package ax.tb;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: ax.tb.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3131g<T> implements Collection<T>, ax.Hb.a {
    private final boolean c0;
    private final T[] q;

    public C3131g(T[] tArr, boolean z) {
        ax.Gb.l.f(tArr, "values");
        this.q = tArr;
        this.c0 = z;
    }

    @Override // java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return C3137m.s(this.q, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        ax.Gb.l.f(collection, "elements");
        Collection<?> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int e() {
        return this.q.length;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.q.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return ax.Gb.b.a(this.q);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        ax.Gb.l.f(tArr, "array");
        return (T[]) ax.Gb.f.b(this, tArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C3140p.b(this.q, this.c0);
    }
}
