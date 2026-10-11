package ax.r7;

import ax.r7.AbstractC2972f;
import ax.r7.K;
import j$.util.Objects;
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

/* renamed from: ax.r7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC2970d<K, V> extends AbstractC2972f<K, V> implements Serializable {
    private transient Map<K, Collection<V>> f0;
    private transient int g0;

    /* renamed from: ax.r7.d$b */
    class b extends AbstractC2970d<K, V>.AbstractC0442d<Map.Entry<K, V>> {
        b() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.r7.AbstractC2970d.AbstractC0442d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> b(K k, V v) {
            return K.d(k, v);
        }
    }

    /* renamed from: ax.r7.d$c */
    private class c extends K.f<K, Collection<V>> {
        final transient Map<K, Collection<V>> d0;

        /* renamed from: ax.r7.d$c$a */
        class a extends K.c<K, Collection<V>> {
            a() {
            }

            @Override // ax.r7.K.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return C2976j.c(c.this.d0.entrySet(), obj);
            }

            @Override // ax.r7.K.c
            Map<K, Collection<V>> e() {
                return c.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return c.this.new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractC2970d.this.x(entry.getKey());
                return true;
            }
        }

        /* renamed from: ax.r7.d$c$b */
        class b implements Iterator<Map.Entry<K, Collection<V>>> {
            Collection<V> c0;
            final Iterator<Map.Entry<K, Collection<V>>> q;

            b() {
                this.q = c.this.d0.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.q.next();
                this.c0 = next.getValue();
                return c.this.e(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.q.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                ax.q7.n.u(this.c0 != null, "no calls to next() since the last call to remove()");
                this.q.remove();
                AbstractC2970d.q(AbstractC2970d.this, this.c0.size());
                this.c0.clear();
                this.c0 = null;
            }
        }

        c(Map<K, Collection<V>> map) {
            this.d0 = map;
        }

        @Override // ax.r7.K.f
        protected Set<Map.Entry<K, Collection<V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) K.h(this.d0, obj);
            if (collection == null) {
                return null;
            }
            return AbstractC2970d.this.z(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.d0 == AbstractC2970d.this.f0) {
                AbstractC2970d.this.clear();
            } else {
                G.d(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return K.g(this.d0, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            Collection<V> remove = this.d0.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> s = AbstractC2970d.this.s();
            s.addAll(remove);
            AbstractC2970d.q(AbstractC2970d.this, remove.size());
            remove.clear();
            return s;
        }

        Map.Entry<K, Collection<V>> e(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return K.d(key, AbstractC2970d.this.z(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.d0.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.d0.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return AbstractC2970d.this.j();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.d0.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.d0.toString();
        }
    }

    /* renamed from: ax.r7.d$d, reason: collision with other inner class name */
    private abstract class AbstractC0442d<T> implements Iterator<T> {
        K c0 = null;
        Collection<V> d0 = null;
        Iterator<V> e0 = G.i();
        final Iterator<Map.Entry<K, Collection<V>>> q;

        AbstractC0442d() {
            this.q = AbstractC2970d.this.f0.entrySet().iterator();
        }

        abstract T b(K k, V v);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.q.hasNext() || this.e0.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.e0.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.q.next();
                this.c0 = next.getKey();
                Collection<V> value = next.getValue();
                this.d0 = value;
                this.e0 = value.iterator();
            }
            return b(Q.a(this.c0), this.e0.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.e0.remove();
            Collection<V> collection = this.d0;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.q.remove();
            }
            AbstractC2970d.o(AbstractC2970d.this);
        }
    }

    /* renamed from: ax.r7.d$e */
    private class e extends K.d<K, Collection<V>> {

        /* renamed from: ax.r7.d$e$a */
        class a implements Iterator<K> {
            final /* synthetic */ Iterator c0;
            final /* synthetic */ e d0;
            Map.Entry<K, Collection<V>> q;

            a(e eVar, Iterator it) {
                this.c0 = it;
                this.d0 = eVar;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.c0.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.c0.next();
                this.q = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                ax.q7.n.u(this.q != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.q.getValue();
                this.c0.remove();
                AbstractC2970d.q(AbstractC2970d.this, value.size());
                value.clear();
                this.q = null;
            }
        }

        e(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            G.d(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return e().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || e().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return e().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this, e().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int i;
            Collection<V> remove = e().remove(obj);
            if (remove != null) {
                i = remove.size();
                remove.clear();
                AbstractC2970d.q(AbstractC2970d.this, i);
            } else {
                i = 0;
            }
            return i > 0;
        }
    }

    /* renamed from: ax.r7.d$f */
    private final class f extends AbstractC2970d<K, V>.i implements NavigableMap<K, Collection<V>> {
        f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k) {
            Map.Entry<K, Collection<V>> ceilingEntry = i().ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return e(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k) {
            return i().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new f(i().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = i().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return e(firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k) {
            Map.Entry<K, Collection<V>> floorEntry = i().floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return e(floorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k) {
            return i().floorKey(k);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k) {
            Map.Entry<K, Collection<V>> higherEntry = i().higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return e(higherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k) {
            return i().higherKey(k);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.r7.AbstractC2970d.i
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> f() {
            return new g(i());
        }

        @Override // ax.r7.AbstractC2970d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(K k) {
            return headMap(k, false);
        }

        @Override // ax.r7.AbstractC2970d.i, ax.r7.AbstractC2970d.c, java.util.AbstractMap, java.util.Map
        /* renamed from: l, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = i().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return e(lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k) {
            Map.Entry<K, Collection<V>> lowerEntry = i().lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return e(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k) {
            return i().lowerKey(k);
        }

        Map.Entry<K, Collection<V>> m(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> s = AbstractC2970d.this.s();
            s.addAll(next.getValue());
            it.remove();
            return K.d(next.getKey(), AbstractC2970d.this.y(s));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.r7.AbstractC2970d.i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> i() {
            return (NavigableMap) super.i();
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return g();
        }

        @Override // ax.r7.AbstractC2970d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // ax.r7.AbstractC2970d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> tailMap(K k) {
            return tailMap(k, true);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return m(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return m(descendingMap().entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new f(i().headMap(k, z));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new f(i().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new f(i().tailMap(k, z));
        }
    }

    /* renamed from: ax.r7.d$g */
    private final class g extends AbstractC2970d<K, V>.j implements NavigableSet<K> {
        g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k) {
            return g().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new g(g().descendingMap());
        }

        @Override // java.util.NavigableSet
        public K floor(K k) {
            return g().floorKey(k);
        }

        @Override // ax.r7.AbstractC2970d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(K k) {
            return headSet(k, false);
        }

        @Override // java.util.NavigableSet
        public K higher(K k) {
            return g().higherKey(k);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.r7.AbstractC2970d.j
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> g() {
            return (NavigableMap) super.g();
        }

        @Override // ax.r7.AbstractC2970d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        @Override // ax.r7.AbstractC2970d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> tailSet(K k) {
            return tailSet(k, true);
        }

        @Override // java.util.NavigableSet
        public K lower(K k) {
            return g().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) G.q(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) G.q(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k, boolean z) {
            return new g(g().headMap(k, z));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new g(g().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k, boolean z) {
            return new g(g().tailMap(k, z));
        }
    }

    /* renamed from: ax.r7.d$h */
    private class h extends AbstractC2970d<K, V>.l implements RandomAccess {
        h(K k, List<V> list, AbstractC2970d<K, V>.k kVar) {
            super(k, list, kVar);
        }
    }

    /* renamed from: ax.r7.d$i */
    private class i extends AbstractC2970d<K, V>.c implements SortedMap<K, Collection<V>> {
        SortedSet<K> f0;

        i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return i().comparator();
        }

        SortedSet<K> f() {
            return new j(i());
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return i().firstKey();
        }

        @Override // ax.r7.AbstractC2970d.c, java.util.AbstractMap, java.util.Map
        /* renamed from: g */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f0;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> f = f();
            this.f0 = f;
            return f;
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new i(i().headMap(k));
        }

        SortedMap<K, Collection<V>> i() {
            return (SortedMap) this.d0;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return i().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new i(i().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new i(i().tailMap(k));
        }
    }

    /* renamed from: ax.r7.d$j */
    private class j extends AbstractC2970d<K, V>.e implements SortedSet<K> {
        j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return g().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return g().firstKey();
        }

        SortedMap<K, Collection<V>> g() {
            return (SortedMap) super.e();
        }

        public SortedSet<K> headSet(K k) {
            return new j(g().headMap(k));
        }

        @Override // java.util.SortedSet
        public K last() {
            return g().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new j(g().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new j(g().tailMap(k));
        }
    }

    protected AbstractC2970d(Map<K, Collection<V>> map) {
        ax.q7.n.d(map.isEmpty());
        this.f0 = map;
    }

    static /* synthetic */ int n(AbstractC2970d abstractC2970d) {
        int i2 = abstractC2970d.g0;
        abstractC2970d.g0 = i2 + 1;
        return i2;
    }

    static /* synthetic */ int o(AbstractC2970d abstractC2970d) {
        int i2 = abstractC2970d.g0;
        abstractC2970d.g0 = i2 - 1;
        return i2;
    }

    static /* synthetic */ int p(AbstractC2970d abstractC2970d, int i2) {
        int i3 = abstractC2970d.g0 + i2;
        abstractC2970d.g0 = i3;
        return i3;
    }

    static /* synthetic */ int q(AbstractC2970d abstractC2970d, int i2) {
        int i3 = abstractC2970d.g0 - i2;
        abstractC2970d.g0 = i3;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> w(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(Object obj) {
        Collection collection = (Collection) K.i(this.f0, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.g0 -= size;
        }
    }

    final List<V> A(K k2, List<V> list, AbstractC2970d<K, V>.k kVar) {
        return list instanceof RandomAccess ? new h(k2, list, kVar) : new l(k2, list, kVar);
    }

    @Override // ax.r7.AbstractC2972f, ax.r7.L
    public Collection<Map.Entry<K, V>> a() {
        return super.a();
    }

    @Override // ax.r7.L
    public void clear() {
        Iterator<Collection<V>> it = this.f0.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f0.clear();
        this.g0 = 0;
    }

    @Override // ax.r7.AbstractC2972f
    Collection<Map.Entry<K, V>> f() {
        return this instanceof b0 ? new AbstractC2972f.b() : new AbstractC2972f.a();
    }

    @Override // ax.r7.L
    public Collection<V> get(K k2) {
        Collection<V> collection = this.f0.get(k2);
        if (collection == null) {
            collection = t(k2);
        }
        return z(k2, collection);
    }

    @Override // ax.r7.AbstractC2972f
    Collection<V> h() {
        return new AbstractC2972f.c();
    }

    @Override // ax.r7.AbstractC2972f
    Iterator<Map.Entry<K, V>> i() {
        return new b();
    }

    @Override // ax.r7.AbstractC2972f
    Iterator<V> k() {
        return new a();
    }

    @Override // ax.r7.L
    public boolean put(K k2, V v) {
        Collection<V> collection = this.f0.get(k2);
        if (collection != null) {
            if (!collection.add(v)) {
                return false;
            }
            this.g0++;
            return true;
        }
        Collection<V> t = t(k2);
        if (!t.add(v)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.g0++;
        this.f0.put(k2, t);
        return true;
    }

    abstract Collection<V> s();

    @Override // ax.r7.L
    public int size() {
        return this.g0;
    }

    Collection<V> t(K k2) {
        return s();
    }

    final Map<K, Collection<V>> u() {
        Map<K, Collection<V>> map = this.f0;
        return map instanceof NavigableMap ? new f((NavigableMap) this.f0) : map instanceof SortedMap ? new i((SortedMap) this.f0) : new c(this.f0);
    }

    final Set<K> v() {
        Map<K, Collection<V>> map = this.f0;
        return map instanceof NavigableMap ? new g((NavigableMap) this.f0) : map instanceof SortedMap ? new j((SortedMap) this.f0) : new e(this.f0);
    }

    @Override // ax.r7.AbstractC2972f, ax.r7.L
    public Collection<V> values() {
        return super.values();
    }

    abstract <E> Collection<E> y(Collection<E> collection);

    abstract Collection<V> z(K k2, Collection<V> collection);

    /* renamed from: ax.r7.d$k */
    class k extends AbstractCollection<V> {
        Collection<V> c0;
        final AbstractC2970d<K, V>.k d0;
        final Collection<V> e0;
        final K q;

        k(K k, Collection<V> collection, AbstractC2970d<K, V>.k kVar) {
            this.q = k;
            this.c0 = collection;
            this.d0 = kVar;
            this.e0 = kVar == null ? null : kVar.h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v) {
            k();
            boolean isEmpty = this.c0.isEmpty();
            boolean add = this.c0.add(v);
            if (add) {
                AbstractC2970d.n(AbstractC2970d.this);
                if (isEmpty) {
                    e();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.c0.addAll(collection);
            if (addAll) {
                AbstractC2970d.p(AbstractC2970d.this, this.c0.size() - size);
                if (size == 0) {
                    e();
                }
            }
            return addAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.c0.clear();
            AbstractC2970d.q(AbstractC2970d.this, size);
            l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            k();
            return this.c0.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            k();
            return this.c0.containsAll(collection);
        }

        void e() {
            AbstractC2970d<K, V>.k kVar = this.d0;
            if (kVar != null) {
                kVar.e();
            } else {
                AbstractC2970d.this.f0.put(this.q, this.c0);
            }
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            k();
            return this.c0.equals(obj);
        }

        AbstractC2970d<K, V>.k g() {
            return this.d0;
        }

        Collection<V> h() {
            return this.c0;
        }

        @Override // java.util.Collection
        public int hashCode() {
            k();
            return this.c0.hashCode();
        }

        K i() {
            return this.q;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            k();
            return new a();
        }

        void k() {
            Collection<V> collection;
            AbstractC2970d<K, V>.k kVar = this.d0;
            if (kVar != null) {
                kVar.k();
                if (this.d0.h() != this.e0) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.c0.isEmpty() || (collection = (Collection) AbstractC2970d.this.f0.get(this.q)) == null) {
                    return;
                }
                this.c0 = collection;
            }
        }

        void l() {
            AbstractC2970d<K, V>.k kVar = this.d0;
            if (kVar != null) {
                kVar.l();
            } else if (this.c0.isEmpty()) {
                AbstractC2970d.this.f0.remove(this.q);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            k();
            boolean remove = this.c0.remove(obj);
            if (remove) {
                AbstractC2970d.o(AbstractC2970d.this);
                l();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.c0.removeAll(collection);
            if (removeAll) {
                AbstractC2970d.p(AbstractC2970d.this, this.c0.size() - size);
                l();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            ax.q7.n.n(collection);
            int size = size();
            boolean retainAll = this.c0.retainAll(collection);
            if (retainAll) {
                AbstractC2970d.p(AbstractC2970d.this, this.c0.size() - size);
                l();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            k();
            return this.c0.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            k();
            return this.c0.toString();
        }

        /* renamed from: ax.r7.d$k$a */
        class a implements Iterator<V> {
            final Collection<V> c0;
            final Iterator<V> q;

            a() {
                Collection<V> collection = k.this.c0;
                this.c0 = collection;
                this.q = AbstractC2970d.w(collection);
            }

            Iterator<V> b() {
                c();
                return this.q;
            }

            void c() {
                k.this.k();
                if (k.this.c0 != this.c0) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                c();
                return this.q.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                c();
                return this.q.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.q.remove();
                AbstractC2970d.o(AbstractC2970d.this);
                k.this.l();
            }

            a(Iterator<V> it) {
                this.c0 = k.this.c0;
                this.q = it;
            }
        }
    }

    /* renamed from: ax.r7.d$l */
    class l extends AbstractC2970d<K, V>.k implements List<V> {

        /* renamed from: ax.r7.d$l$a */
        private class a extends AbstractC2970d<K, V>.k.a implements ListIterator<V> {
            a() {
                super();
            }

            private ListIterator<V> e() {
                return (ListIterator) b();
            }

            @Override // java.util.ListIterator
            public void add(V v) {
                boolean isEmpty = l.this.isEmpty();
                e().add(v);
                AbstractC2970d.n(AbstractC2970d.this);
                if (isEmpty) {
                    l.this.e();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return e().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return e().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return e().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return e().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v) {
                e().set(v);
            }

            public a(int i) {
                super(l.this.n().listIterator(i));
            }
        }

        l(K k, List<V> list, AbstractC2970d<K, V>.k kVar) {
            super(k, list, kVar);
        }

        @Override // java.util.List
        public void add(int i, V v) {
            k();
            boolean isEmpty = h().isEmpty();
            n().add(i, v);
            AbstractC2970d.n(AbstractC2970d.this);
            if (isEmpty) {
                e();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = n().addAll(i, collection);
            if (addAll) {
                AbstractC2970d.p(AbstractC2970d.this, h().size() - size);
                if (size == 0) {
                    e();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public V get(int i) {
            k();
            return n().get(i);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            k();
            return n().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            k();
            return n().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            k();
            return new a();
        }

        List<V> n() {
            return (List) h();
        }

        @Override // java.util.List
        public V remove(int i) {
            k();
            V remove = n().remove(i);
            AbstractC2970d.o(AbstractC2970d.this);
            l();
            return remove;
        }

        @Override // java.util.List
        public V set(int i, V v) {
            k();
            return n().set(i, v);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i, int i2) {
            k();
            return AbstractC2970d.this.A(i(), n().subList(i, i2), g() == null ? this : g());
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i) {
            k();
            return new a(i);
        }
    }

    /* renamed from: ax.r7.d$a */
    class a extends AbstractC2970d<K, V>.AbstractC0442d<V> {
        a() {
            super();
        }

        @Override // ax.r7.AbstractC2970d.AbstractC0442d
        V b(K k, V v) {
            return v;
        }
    }
}
