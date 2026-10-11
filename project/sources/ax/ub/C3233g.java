package ax.ub;

import ax.Gb.l;
import ax.tb.AbstractC3128d;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: ax.ub.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3233g<V> extends AbstractC3128d<V> implements Collection<V>, ax.Hb.a {
    private final C3230d<?, V> q;

    public C3233g(C3230d<?, V> c3230d) {
        l.f(c3230d, "backing");
        this.q = c3230d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection<? extends V> collection) {
        l.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.q.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.q.containsValue(obj);
    }

    @Override // ax.tb.AbstractC3128d
    public int e() {
        return this.q.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.q.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return this.q.P();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.q.N(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        l.f(collection, "elements");
        this.q.m();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        l.f(collection, "elements");
        this.q.m();
        return super.retainAll(collection);
    }
}
