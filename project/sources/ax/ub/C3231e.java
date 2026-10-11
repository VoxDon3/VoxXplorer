package ax.ub;

import ax.Gb.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ax.ub.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3231e<K, V> extends AbstractC3227a<Map.Entry<K, V>, K, V> {
    private final C3230d<K, V> q;

    public C3231e(C3230d<K, V> c3230d) {
        l.f(c3230d, "backing");
        this.q = c3230d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        l.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.q.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        l.f(collection, "elements");
        return this.q.o(collection);
    }

    @Override // ax.tb.AbstractC3130f
    public int e() {
        return this.q.size();
    }

    @Override // ax.ub.AbstractC3227a
    public boolean i(Map.Entry<? extends K, ? extends V> entry) {
        l.f(entry, "element");
        return this.q.p(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.q.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.q.t();
    }

    @Override // ax.ub.AbstractC3227a
    public boolean k(Map.Entry<K, V> entry) {
        l.f(entry, "element");
        return this.q.J(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry<K, V> entry) {
        l.f(entry, "element");
        throw new UnsupportedOperationException();
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
