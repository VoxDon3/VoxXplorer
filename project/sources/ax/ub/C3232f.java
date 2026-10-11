package ax.ub;

import ax.Gb.l;
import ax.tb.AbstractC3130f;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ax.ub.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3232f<E> extends AbstractC3130f<E> implements Set<E>, ax.Hb.a {
    private final C3230d<E, ?> q;

    public C3232f(C3230d<E, ?> c3230d) {
        l.f(c3230d, "backing");
        this.q = c3230d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        l.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.q.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.q.containsKey(obj);
    }

    @Override // ax.tb.AbstractC3130f
    public int e() {
        return this.q.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.q.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.q.D();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.q.M(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        l.f(collection, "elements");
        this.q.m();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        l.f(collection, "elements");
        this.q.m();
        return super.retainAll(collection);
    }
}
