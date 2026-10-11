/*
 * Decompiled with CFR 0.152.
 */
package ax.ub;

import ax.Gb.l;
import ax.Hb.a;
import ax.ub.d;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class f<E>
extends ax.tb.f<E>
implements Set<E>,
a {
    private final d<E, ?> q;

    public f(d<E, ?> d8) {
        l.f(d8, "backing");
        this.q = d8;
    }

    @Override
    public boolean add(E e8) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        l.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        this.q.clear();
    }

    @Override
    public boolean contains(Object object) {
        return this.q.containsKey(object);
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
    public Iterator<E> iterator() {
        return this.q.D();
    }

    @Override
    public boolean remove(Object object) {
        return this.q.M(object);
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

