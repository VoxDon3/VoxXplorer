/*
 * Decompiled with CFR 0.152.
 */
package ax.ub;

import ax.Gb.l;
import ax.Hb.a;
import ax.ub.d;
import java.util.Collection;
import java.util.Iterator;

public final class g<V>
extends ax.tb.d<V>
implements Collection<V>,
a {
    private final d<?, V> q;

    public g(d<?, V> d8) {
        l.f(d8, "backing");
        this.q = d8;
    }

    @Override
    public boolean add(V v8) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends V> collection) {
        l.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        this.q.clear();
    }

    @Override
    public boolean contains(Object object) {
        return this.q.containsValue(object);
    }

    @Override
    public int e() {
        return this.q.size();
    }

    @Override
    public boolean isEmpty() {
        return this.q.isEmpty();
    }

    @Override
    public Iterator<V> iterator() {
        return this.q.P();
    }

    @Override
    public boolean remove(Object object) {
        return this.q.N(object);
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

