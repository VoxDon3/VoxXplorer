/*
 * Decompiled with CFR 0.152.
 */
package ax.ub;

import ax.Gb.l;
import ax.ub.a;
import ax.ub.d;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class e<K, V>
extends a<Map.Entry<K, V>, K, V> {
    private final d<K, V> q;

    public e(d<K, V> d8) {
        l.f(d8, "backing");
        this.q = d8;
    }

    @Override
    public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        l.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        this.q.clear();
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        l.f(collection, "elements");
        return this.q.o(collection);
    }

    @Override
    public int e() {
        return this.q.size();
    }

    @Override
    public boolean i(Map.Entry<? extends K, ? extends V> entry) {
        l.f(entry, "element");
        return this.q.p(entry);
    }

    @Override
    public boolean isEmpty() {
        return this.q.isEmpty();
    }

    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.q.t();
    }

    @Override
    public boolean k(Map.Entry<K, V> entry) {
        l.f(entry, "element");
        return this.q.J(entry);
    }

    public boolean l(Map.Entry<K, V> entry) {
        l.f(entry, "element");
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        l.f(collection, "elements");
        this.q.m();
        return super.removeAll(collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        l.f(collection, "elements");
        this.q.m();
        return super.retainAll(collection);
    }
}

