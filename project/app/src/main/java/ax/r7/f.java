/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.r7.L;
import ax.r7.N;
import ax.r7.d0;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class f<K, V>
implements L<K, V> {
    private transient Set<K> c0;
    private transient Collection<V> d0;
    private transient Map<K, Collection<V>> e0;
    private transient Collection<Map.Entry<K, V>> q;

    f() {
    }

    @Override
    public Collection<Map.Entry<K, V>> a() {
        Collection<Map.Entry<K, V>> collection;
        Collection<Map.Entry<K, V>> collection2 = collection = this.q;
        if (collection == null) {
            this.q = collection2 = this.f();
        }
        return collection2;
    }

    @Override
    public Map<K, Collection<V>> b() {
        Map<K, Collection<Collection<Collection<Collection<V>>>>> map;
        Map<K, Collection<Collection<Collection<Collection<V>>>>> map2 = map = this.e0;
        if (map == null) {
            map2 = this.e();
            this.e0 = map2;
        }
        return map2;
    }

    @Override
    public boolean c(Object collection, Object object) {
        collection = this.b().get(collection);
        return collection != null && collection.contains(object);
    }

    public boolean d(Object object) {
        Iterator<Collection<V>> iterator = this.b().values().iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().contains(object)) continue;
            return true;
        }
        return false;
    }

    abstract Map<K, Collection<V>> e();

    public boolean equals(Object object) {
        return N.a(this, object);
    }

    abstract Collection<Map.Entry<K, V>> f();

    abstract Set<K> g();

    abstract Collection<V> h();

    public int hashCode() {
        return this.b().hashCode();
    }

    abstract Iterator<Map.Entry<K, V>> i();

    public Set<K> j() {
        Set<K> set;
        Set<K> set2 = set = this.c0;
        if (set == null) {
            this.c0 = set2 = this.g();
        }
        return set2;
    }

    abstract Iterator<V> k();

    @Override
    public boolean remove(Object collection, Object object) {
        collection = this.b().get(collection);
        return collection != null && collection.remove(object);
    }

    public String toString() {
        return this.b().toString();
    }

    @Override
    public Collection<V> values() {
        Collection<V> collection;
        Collection<V> collection2 = collection = this.d0;
        if (collection == null) {
            this.d0 = collection2 = this.h();
        }
        return collection2;
    }

    class a
    extends N.b<K, V> {
        final f q;

        a(f f8) {
            this.q = f8;
        }

        @Override
        L<K, V> e() {
            return this.q;
        }

        @Override
        public Iterator<Map.Entry<K, V>> iterator() {
            return this.q.i();
        }
    }

    class b
    extends a
    implements Set<Map.Entry<K, V>> {
        final f c0;

        b(f f8) {
            this.c0 = f8;
            super(f8);
        }

        @Override
        public boolean equals(Object object) {
            return ax.r7.d0.a(this, object);
        }

        @Override
        public int hashCode() {
            return ax.r7.d0.d(this);
        }
    }

    class c
    extends AbstractCollection<V> {
        final f q;

        c(f f8) {
            this.q = f8;
        }

        @Override
        public void clear() {
            this.q.clear();
        }

        @Override
        public boolean contains(Object object) {
            return this.q.d(object);
        }

        @Override
        public Iterator<V> iterator() {
            return this.q.k();
        }

        @Override
        public int size() {
            return this.q.size();
        }
    }
}

