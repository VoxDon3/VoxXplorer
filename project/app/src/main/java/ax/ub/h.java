/*
 * Decompiled with CFR 0.152.
 */
package ax.ub;

import ax.Gb.g;
import ax.Gb.l;
import ax.tb.f;
import ax.ub.d;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class h<E>
extends f<E>
implements Set<E>,
Serializable,
ax.Hb.a {
    private static final a c0 = new a(null);
    private static final h d0 = new h(d.o0.e());
    private final d<E, ?> q;

    public h() {
        this(new d());
    }

    public h(d<E, ?> d8) {
        l.f(d8, "backing");
        this.q = d8;
    }

    @Override
    public boolean add(E e8) {
        return this.q.j(e8) >= 0;
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        l.f(collection, "elements");
        this.q.m();
        return super.addAll(collection);
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

    public final Set<E> g() {
        this.q.l();
        if (this.size() > 0) {
            return this;
        }
        return d0;
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

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }
}

