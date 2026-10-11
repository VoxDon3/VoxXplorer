/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.n;
import ax.r7.G;
import ax.r7.K;
import ax.r7.Q;
import ax.r7.b0;
import ax.r7.f;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

abstract class d<K, V>
extends ax.r7.f<K, V>
implements Serializable {
    private transient Map<K, Collection<V>> f0;
    private transient int g0;

    protected d(Map<K, Collection<V>> map) {
        n.d(map.isEmpty());
        this.f0 = map;
    }

    static /* synthetic */ int n(d d8) {
        int n8 = d8.g0;
        d8.g0 = n8 + 1;
        return n8;
    }

    static /* synthetic */ int o(d d8) {
        int n8 = d8.g0;
        d8.g0 = n8 - 1;
        return n8;
    }

    static /* synthetic */ int p(d d8, int n8) {
        d8.g0 = n8 = d8.g0 + n8;
        return n8;
    }

    static /* synthetic */ int q(d d8, int n8) {
        d8.g0 = n8 = d8.g0 - n8;
        return n8;
    }

    private static <E> Iterator<E> w(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List)collection).listIterator();
        }
        return collection.iterator();
    }

    private void x(Object collection) {
        if ((collection = K.i(this.f0, collection)) != null) {
            int n8 = collection.size();
            collection.clear();
            this.g0 -= n8;
        }
    }

    final List<V> A(K k8, List<V> list, k k9) {
        if (list instanceof RandomAccess) {
            return new h(this, k8, list, k9);
        }
        return new l(this, k8, list, k9);
    }

    @Override
    public Collection<Map.Entry<K, V>> a() {
        return super.a();
    }

    @Override
    public void clear() {
        Iterator<Collection<V>> iterator = this.f0.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().clear();
        }
        this.f0.clear();
        this.g0 = 0;
    }

    @Override
    Collection<Map.Entry<K, V>> f() {
        if (this instanceof b0) {
            return new f.b(this);
        }
        return new f.a(this);
    }

    @Override
    public Collection<V> get(K k8) {
        Collection<V> collection;
        Collection<V> collection2 = collection = this.f0.get(k8);
        if (collection == null) {
            collection2 = this.t(k8);
        }
        return this.z(k8, collection2);
    }

    @Override
    Collection<V> h() {
        return new f.c(this);
    }

    @Override
    Iterator<Map.Entry<K, V>> i() {
        return new d<Map.Entry<K, V>>(this){
            final d g0;
            {
                this.g0 = d8;
                super(d8);
            }

            Map.Entry<K, V> c(K k8, V v8) {
                return K.d(k8, v8);
            }
        };
    }

    @Override
    Iterator<V> k() {
        return new d<V>(this){
            final d g0;
            {
                this.g0 = d8;
                super(d8);
            }

            @Override
            V b(K k8, V v8) {
                return v8;
            }
        };
    }

    @Override
    public boolean put(K k8, V v8) {
        Collection<V> collection = this.f0.get(k8);
        if (collection == null) {
            collection = this.t(k8);
            if (collection.add(v8)) {
                ++this.g0;
                this.f0.put(k8, collection);
                return true;
            }
            throw new AssertionError((Object)"New Collection violated the Collection spec");
        }
        if (collection.add(v8)) {
            ++this.g0;
            return true;
        }
        return false;
    }

    abstract Collection<V> s();

    @Override
    public int size() {
        return this.g0;
    }

    Collection<V> t(K k8) {
        return this.s();
    }

    final Map<K, Collection<V>> u() {
        Map<K, Collection<V>> map = this.f0;
        if (map instanceof NavigableMap) {
            return new f(this, (NavigableMap)this.f0);
        }
        if (map instanceof SortedMap) {
            return new i(this, (SortedMap)this.f0);
        }
        return new c(this, this.f0);
    }

    final Set<K> v() {
        Map<K, Collection<V>> map = this.f0;
        if (map instanceof NavigableMap) {
            return new g(this, (NavigableMap)this.f0);
        }
        if (map instanceof SortedMap) {
            return new j(this, (SortedMap)this.f0);
        }
        return new e(this, this.f0);
    }

    @Override
    public Collection<V> values() {
        return super.values();
    }

    abstract <E> Collection<E> y(Collection<E> var1);

    abstract Collection<V> z(K var1, Collection<V> var2);

    private class c
    extends K.f<K, Collection<V>> {
        final transient Map<K, Collection<V>> d0;
        final d e0;

        c(d d8, Map<K, Collection<V>> map) {
            this.e0 = d8;
            this.d0 = map;
        }

        @Override
        protected Set<Map.Entry<K, Collection<V>>> a() {
            return new a(this);
        }

        public Collection<V> c(Object object) {
            Collection collection = K.h(this.d0, object);
            if (collection == null) {
                return null;
            }
            return this.e0.z(object, collection);
        }

        @Override
        public void clear() {
            if (this.d0 == this.e0.f0) {
                this.e0.clear();
                return;
            }
            G.d(new b(this));
        }

        @Override
        public boolean containsKey(Object object) {
            return K.g(this.d0, object);
        }

        public Collection<V> d(Object collection) {
            Collection collection2 = this.d0.remove(collection);
            if (collection2 == null) {
                return null;
            }
            collection = this.e0.s();
            collection.addAll(collection2);
            d.q(this.e0, collection2.size());
            collection2.clear();
            return collection;
        }

        Map.Entry<K, Collection<V>> e(Map.Entry<K, Collection<V>> entry) {
            Object k8 = entry.getKey();
            return K.d(k8, this.e0.z(k8, entry.getValue()));
        }

        @Override
        public boolean equals(Object object) {
            return this == object || this.d0.equals(object);
            {
            }
        }

        @Override
        public int hashCode() {
            return this.d0.hashCode();
        }

        @Override
        public Set<K> keySet() {
            return this.e0.j();
        }

        @Override
        public int size() {
            return this.d0.size();
        }

        @Override
        public String toString() {
            return this.d0.toString();
        }

        class a
        extends K.c<K, Collection<V>> {
            final c q;

            a(c c8) {
                this.q = c8;
            }

            @Override
            public boolean contains(Object object) {
                return ax.r7.j.c(this.q.d0.entrySet(), object);
            }

            @Override
            Map<K, Collection<V>> e() {
                return this.q;
            }

            @Override
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new b(this.q);
            }

            @Override
            public boolean remove(Object object) {
                if (!this.contains(object)) {
                    return false;
                }
                object = (Map.Entry)object;
                j.Objects.requireNonNull((Object)object);
                object = (Map.Entry)object;
                this.q.e0.x(object.getKey());
                return true;
            }
        }

        class b
        implements Iterator<Map.Entry<K, Collection<V>>> {
            Collection<V> c0;
            final c d0;
            final Iterator<Map.Entry<K, Collection<V>>> q;

            b(c c8) {
                this.d0 = c8;
                this.q = c8.d0.entrySet().iterator();
            }

            public Map.Entry<K, Collection<V>> b() {
                Map.Entry entry = this.q.next();
                this.c0 = entry.getValue();
                return this.d0.e(entry);
            }

            @Override
            public boolean hasNext() {
                return this.q.hasNext();
            }

            @Override
            public void remove() {
                boolean bl = this.c0 != null;
                n.u(bl, "no calls to next() since the last call to remove()");
                this.q.remove();
                d.q(this.d0.e0, this.c0.size());
                this.c0.clear();
                this.c0 = null;
            }
        }
    }

    private abstract class d<T>
    implements Iterator<T> {
        K c0;
        Collection<V> d0;
        Iterator<V> e0;
        final d f0;
        final Iterator<Map.Entry<K, Collection<V>>> q;

        d(d d8) {
            this.f0 = d8;
            this.q = d8.f0.entrySet().iterator();
            this.c0 = null;
            this.d0 = null;
            this.e0 = G.i();
        }

        abstract T b(K var1, V var2);

        @Override
        public boolean hasNext() {
            return this.q.hasNext() || this.e0.hasNext();
            {
            }
        }

        @Override
        public T next() {
            if (!this.e0.hasNext()) {
                Object object = this.q.next();
                this.c0 = object.getKey();
                this.d0 = object = object.getValue();
                this.e0 = object.iterator();
            }
            return this.b(Q.a(this.c0), this.e0.next());
        }

        @Override
        public void remove() {
            this.e0.remove();
            Collection collection = this.d0;
            j.Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.q.remove();
            }
            d.o(this.f0);
        }
    }

    private class e
    extends K.d<K, Collection<V>> {
        final d c0;

        e(d d8, Map<K, Collection<V>> map) {
            this.c0 = d8;
            super(map);
        }

        @Override
        public void clear() {
            G.d(this.iterator());
        }

        @Override
        public boolean containsAll(Collection<?> collection) {
            return this.e().keySet().containsAll(collection);
        }

        @Override
        public boolean equals(Object object) {
            return this == object || this.e().keySet().equals(object);
            {
            }
        }

        @Override
        public int hashCode() {
            return this.e().keySet().hashCode();
        }

        @Override
        public Iterator<K> iterator() {
            return new Iterator<K>(){
                final Iterator c0;
                final e d0;
                Map.Entry<K, Collection<V>> q;
                {
                    this.c0 = iterator;
                    this.d0 = e8;
                }

                @Override
                public boolean hasNext() {
                    return this.c0.hasNext();
                }

                @Override
                public K next() {
                    Map.Entry entry;
                    this.q = entry = (Map.Entry)this.c0.next();
                    return entry.getKey();
                }

                @Override
                public void remove() {
                    boolean bl = this.q != null;
                    n.u(bl, "no calls to next() since the last call to remove()");
                    Collection collection = this.q.getValue();
                    this.c0.remove();
                    d.q(this.d0.c0, collection.size());
                    collection.clear();
                    this.q = null;
                }
            };
        }

        @Override
        public boolean remove(Object object) {
            int n8;
            object = (Collection)this.e().remove(object);
            if (object != null) {
                n8 = object.size();
                object.clear();
                d.q(this.c0, n8);
            } else {
                n8 = 0;
            }
            return n8 > 0;
        }
    }

    private final class f
    extends i
    implements NavigableMap<K, Collection<V>> {
        final d h0;

        f(d d8, NavigableMap<K, Collection<V>> navigableMap) {
            this.h0 = d8;
            super(d8, navigableMap);
        }

        @Override
        public Map.Entry<K, Collection<V>> ceilingEntry(K object) {
            object = this.n().ceilingEntry(object);
            if (object == null) {
                return null;
            }
            return this.e(object);
        }

        @Override
        public K ceilingKey(K k8) {
            return this.n().ceilingKey(k8);
        }

        @Override
        public NavigableSet<K> descendingKeySet() {
            return this.descendingMap().navigableKeySet();
        }

        @Override
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new f(this.h0, this.n().descendingMap());
        }

        @Override
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry entry = this.n().firstEntry();
            if (entry == null) {
                return null;
            }
            return this.e(entry);
        }

        @Override
        public Map.Entry<K, Collection<V>> floorEntry(K object) {
            object = this.n().floorEntry(object);
            if (object == null) {
                return null;
            }
            return this.e(object);
        }

        @Override
        public K floorKey(K k8) {
            return this.n().floorKey(k8);
        }

        @Override
        public NavigableMap<K, Collection<V>> headMap(K k8, boolean bl) {
            return new f(this.h0, this.n().headMap(k8, bl));
        }

        @Override
        public Map.Entry<K, Collection<V>> higherEntry(K object) {
            object = this.n().higherEntry(object);
            if (object == null) {
                return null;
            }
            return this.e(object);
        }

        @Override
        public K higherKey(K k8) {
            return this.n().higherKey(k8);
        }

        NavigableSet<K> j() {
            return new g(this.h0, this.n());
        }

        public NavigableMap<K, Collection<V>> k(K k8) {
            return this.headMap(k8, false);
        }

        public NavigableSet<K> l() {
            return (NavigableSet)super.g();
        }

        @Override
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry entry = this.n().lastEntry();
            if (entry == null) {
                return null;
            }
            return this.e(entry);
        }

        @Override
        public Map.Entry<K, Collection<V>> lowerEntry(K object) {
            object = this.n().lowerEntry(object);
            if (object == null) {
                return null;
            }
            return this.e(object);
        }

        @Override
        public K lowerKey(K k8) {
            return this.n().lowerKey(k8);
        }

        Map.Entry<K, Collection<V>> m(Iterator<Map.Entry<K, Collection<V>>> iterator) {
            if (!iterator.hasNext()) {
                return null;
            }
            Map.Entry entry = iterator.next();
            Collection collection = this.h0.s();
            collection.addAll(entry.getValue());
            iterator.remove();
            return K.d(entry.getKey(), this.h0.y(collection));
        }

        NavigableMap<K, Collection<V>> n() {
            return (NavigableMap)super.i();
        }

        @Override
        public NavigableSet<K> navigableKeySet() {
            return this.l();
        }

        public NavigableMap<K, Collection<V>> o(K k8, K k9) {
            return this.subMap(k8, true, k9, false);
        }

        public NavigableMap<K, Collection<V>> p(K k8) {
            return this.tailMap(k8, true);
        }

        @Override
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return this.m(this.entrySet().iterator());
        }

        @Override
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return this.m(this.descendingMap().entrySet().iterator());
        }

        @Override
        public NavigableMap<K, Collection<V>> subMap(K k8, boolean bl, K k9, boolean bl2) {
            return new f(this.h0, this.n().subMap(k8, bl, k9, bl2));
        }

        @Override
        public NavigableMap<K, Collection<V>> tailMap(K k8, boolean bl) {
            return new f(this.h0, this.n().tailMap(k8, bl));
        }
    }

    private final class g
    extends j
    implements NavigableSet<K> {
        final d e0;

        g(d d8, NavigableMap<K, Collection<V>> navigableMap) {
            this.e0 = d8;
            super(d8, navigableMap);
        }

        @Override
        public K ceiling(K k8) {
            return this.i().ceilingKey(k8);
        }

        @Override
        public Iterator<K> descendingIterator() {
            return this.descendingSet().iterator();
        }

        @Override
        public NavigableSet<K> descendingSet() {
            return new g(this.e0, this.i().descendingMap());
        }

        @Override
        public K floor(K k8) {
            return this.i().floorKey(k8);
        }

        public NavigableSet<K> h(K k8) {
            return this.headSet((K)k8, false);
        }

        @Override
        public NavigableSet<K> headSet(K k8, boolean bl) {
            return new g(this.e0, this.i().headMap(k8, bl));
        }

        @Override
        public K higher(K k8) {
            return this.i().higherKey(k8);
        }

        NavigableMap<K, Collection<V>> i() {
            return (NavigableMap)super.g();
        }

        public NavigableSet<K> k(K k8, K k9) {
            return this.subSet((K)k8, true, (K)k9, false);
        }

        public NavigableSet<K> l(K k8) {
            return this.tailSet((K)k8, true);
        }

        @Override
        public K lower(K k8) {
            return this.i().lowerKey(k8);
        }

        @Override
        public K pollFirst() {
            return G.q(this.iterator());
        }

        @Override
        public K pollLast() {
            return G.q(this.descendingIterator());
        }

        @Override
        public NavigableSet<K> subSet(K k8, boolean bl, K k9, boolean bl2) {
            return new g(this.e0, this.i().subMap(k8, bl, k9, bl2));
        }

        @Override
        public NavigableSet<K> tailSet(K k8, boolean bl) {
            return new g(this.e0, this.i().tailMap(k8, bl));
        }
    }

    private class h
    extends l
    implements RandomAccess {
        final d h0;

        h(d d8, K k8, List<V> list, k k9) {
            this.h0 = d8;
            super(d8, k8, list, k9);
        }
    }

    private class i
    extends c
    implements SortedMap<K, Collection<V>> {
        SortedSet<K> f0;
        final d g0;

        i(d d8, SortedMap<K, Collection<V>> sortedMap) {
            this.g0 = d8;
            super(d8, sortedMap);
        }

        @Override
        public Comparator<? super K> comparator() {
            return this.i().comparator();
        }

        SortedSet<K> f() {
            return new j(this.g0, this.i());
        }

        @Override
        public K firstKey() {
            return this.i().firstKey();
        }

        public SortedSet<K> g() {
            SortedSet sortedSet;
            SortedSet sortedSet2 = sortedSet = this.f0;
            if (sortedSet == null) {
                this.f0 = sortedSet2 = this.f();
            }
            return sortedSet2;
        }

        @Override
        public SortedMap<K, Collection<V>> headMap(K k8) {
            return new i(this.g0, this.i().headMap(k8));
        }

        SortedMap<K, Collection<V>> i() {
            return (SortedMap)this.d0;
        }

        @Override
        public K lastKey() {
            return this.i().lastKey();
        }

        @Override
        public SortedMap<K, Collection<V>> subMap(K k8, K k9) {
            return new i(this.g0, this.i().subMap(k8, k9));
        }

        @Override
        public SortedMap<K, Collection<V>> tailMap(K k8) {
            return new i(this.g0, this.i().tailMap(k8));
        }
    }

    private class j
    extends e
    implements SortedSet<K> {
        final d d0;

        j(d d8, SortedMap<K, Collection<V>> sortedMap) {
            this.d0 = d8;
            super(d8, sortedMap);
        }

        @Override
        public Comparator<? super K> comparator() {
            return this.g().comparator();
        }

        @Override
        public K first() {
            return this.g().firstKey();
        }

        SortedMap<K, Collection<V>> g() {
            return (SortedMap)super.e();
        }

        @Override
        public SortedSet<K> headSet(K k8) {
            return new j(this.d0, this.g().headMap(k8));
        }

        @Override
        public K last() {
            return this.g().lastKey();
        }

        @Override
        public SortedSet<K> subSet(K k8, K k9) {
            return new j(this.d0, this.g().subMap(k8, k9));
        }

        @Override
        public SortedSet<K> tailSet(K k8) {
            return new j(this.d0, this.g().tailMap(k8));
        }
    }

    class k
    extends AbstractCollection<V> {
        Collection<V> c0;
        final k d0;
        final Collection<V> e0;
        final d f0;
        final K q;

        k(d object, K k8, Collection<V> collection, k k9) {
            this.f0 = object;
            this.q = k8;
            this.c0 = collection;
            this.d0 = k9;
            object = k9 == null ? null : k9.h();
            this.e0 = object;
        }

        @Override
        public boolean add(V v8) {
            this.k();
            boolean bl = this.c0.isEmpty();
            boolean bl2 = this.c0.add(v8);
            if (bl2) {
                d.n(this.f0);
                if (bl) {
                    this.e();
                }
            }
            return bl2;
        }

        @Override
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int n8 = this.size();
            boolean bl = this.c0.addAll(collection);
            if (bl) {
                int n9 = this.c0.size();
                d.p(this.f0, n9 - n8);
                if (n8 == 0) {
                    this.e();
                }
            }
            return bl;
        }

        @Override
        public void clear() {
            int n8 = this.size();
            if (n8 == 0) {
                return;
            }
            this.c0.clear();
            d.q(this.f0, n8);
            this.l();
        }

        @Override
        public boolean contains(Object object) {
            this.k();
            return this.c0.contains(object);
        }

        @Override
        public boolean containsAll(Collection<?> collection) {
            this.k();
            return this.c0.containsAll(collection);
        }

        void e() {
            k k8 = this.d0;
            if (k8 != null) {
                k8.e();
                return;
            }
            this.f0.f0.put(this.q, this.c0);
        }

        @Override
        public boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            this.k();
            return this.c0.equals(object);
        }

        k g() {
            return this.d0;
        }

        Collection<V> h() {
            return this.c0;
        }

        @Override
        public int hashCode() {
            this.k();
            return this.c0.hashCode();
        }

        K i() {
            return this.q;
        }

        @Override
        public Iterator<V> iterator() {
            this.k();
            return new a(this);
        }

        void k() {
            Collection collection = this.d0;
            if (collection != null) {
                collection.k();
                if (this.d0.h() != this.e0) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.c0.isEmpty() && (collection = (Collection)this.f0.f0.get(this.q)) != null) {
                this.c0 = collection;
            }
        }

        void l() {
            k k8 = this.d0;
            if (k8 != null) {
                k8.l();
                return;
            }
            if (this.c0.isEmpty()) {
                this.f0.f0.remove(this.q);
            }
        }

        @Override
        public boolean remove(Object object) {
            this.k();
            boolean bl = this.c0.remove(object);
            if (bl) {
                d.o(this.f0);
                this.l();
            }
            return bl;
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int n8 = this.size();
            boolean bl = this.c0.removeAll(collection);
            if (bl) {
                int n9 = this.c0.size();
                d.p(this.f0, n9 - n8);
                this.l();
            }
            return bl;
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            n.n(collection);
            int n8 = this.size();
            boolean bl = this.c0.retainAll(collection);
            if (bl) {
                int n9 = this.c0.size();
                d.p(this.f0, n9 - n8);
                this.l();
            }
            return bl;
        }

        @Override
        public int size() {
            this.k();
            return this.c0.size();
        }

        @Override
        public String toString() {
            this.k();
            return this.c0.toString();
        }

        class a
        implements Iterator<V> {
            final Collection<V> c0;
            final k d0;
            final Iterator<V> q;

            a(k collection) {
                this.d0 = collection;
                this.c0 = collection = collection.c0;
                this.q = d.w(collection);
            }

            a(k k8, Iterator<V> iterator) {
                this.d0 = k8;
                this.c0 = k8.c0;
                this.q = iterator;
            }

            Iterator<V> b() {
                this.c();
                return this.q;
            }

            void c() {
                this.d0.k();
                if (this.d0.c0 == this.c0) {
                    return;
                }
                throw new ConcurrentModificationException();
            }

            @Override
            public boolean hasNext() {
                this.c();
                return this.q.hasNext();
            }

            @Override
            public V next() {
                this.c();
                return this.q.next();
            }

            @Override
            public void remove() {
                this.q.remove();
                d.o(this.d0.f0);
                this.d0.l();
            }
        }
    }

    class l
    extends k
    implements List<V> {
        final d g0;

        l(d d8, K k8, List<V> list, k k9) {
            this.g0 = d8;
            super(d8, k8, list, k9);
        }

        @Override
        public void add(int n8, V v8) {
            this.k();
            boolean bl = this.h().isEmpty();
            this.n().add(n8, v8);
            d.n(this.g0);
            if (bl) {
                this.e();
            }
        }

        @Override
        public boolean addAll(int n8, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int n9 = this.size();
            boolean bl = this.n().addAll(n8, collection);
            if (bl) {
                n8 = this.h().size();
                d.p(this.g0, n8 - n9);
                if (n9 == 0) {
                    this.e();
                }
            }
            return bl;
        }

        @Override
        public V get(int n8) {
            this.k();
            return this.n().get(n8);
        }

        @Override
        public int indexOf(Object object) {
            this.k();
            return this.n().indexOf(object);
        }

        @Override
        public int lastIndexOf(Object object) {
            this.k();
            return this.n().lastIndexOf(object);
        }

        @Override
        public ListIterator<V> listIterator() {
            this.k();
            return new a(this);
        }

        @Override
        public ListIterator<V> listIterator(int n8) {
            this.k();
            return new a(this, n8);
        }

        List<V> n() {
            return (List)this.h();
        }

        @Override
        public V remove(int n8) {
            this.k();
            Object v8 = this.n().remove(n8);
            d.o(this.g0);
            this.l();
            return v8;
        }

        @Override
        public V set(int n8, V v8) {
            this.k();
            return this.n().set(n8, v8);
        }

        @Override
        public List<V> subList(int n8, int n9) {
            this.k();
            d d8 = this.g0;
            Object k8 = this.i();
            List list = this.n().subList(n8, n9);
            k k9 = this.g() == null ? this : this.g();
            return d8.A(k8, list, k9);
        }

        /*
         * Signature claims super is ax.r7.d$k.a, not ax.r7.d$k$a - discarding signature.
         */
        private class a
        extends k.a
        implements ListIterator {
            final l e0;

            a(l l8) {
                this.e0 = l8;
                super(l8);
            }

            public a(l l8, int n8) {
                this.e0 = l8;
                super(l8, l8.n().listIterator(n8));
            }

            private ListIterator<V> e() {
                return (ListIterator)this.b();
            }

            public void add(V v8) {
                boolean bl = this.e0.isEmpty();
                this.e().add(v8);
                d.n(this.e0.g0);
                if (bl) {
                    this.e0.e();
                }
            }

            @Override
            public boolean hasPrevious() {
                return this.e().hasPrevious();
            }

            @Override
            public int nextIndex() {
                return this.e().nextIndex();
            }

            public V previous() {
                return this.e().previous();
            }

            @Override
            public int previousIndex() {
                return this.e().previousIndex();
            }

            public void set(V v8) {
                this.e().set(v8);
            }
        }
    }
}

