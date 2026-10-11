package ax.r7;

import ax.r7.N;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: ax.r7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC2972f<K, V> implements L<K, V> {
    private transient Set<K> c0;
    private transient Collection<V> d0;
    private transient Map<K, Collection<V>> e0;
    private transient Collection<Map.Entry<K, V>> q;

    /* renamed from: ax.r7.f$a */
    class a extends N.b<K, V> {
        a() {
        }

        @Override // ax.r7.N.b
        L<K, V> e() {
            return AbstractC2972f.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractC2972f.this.i();
        }
    }

    /* renamed from: ax.r7.f$b */
    class b extends AbstractC2972f<K, V>.a implements Set<Map.Entry<K, V>> {
        b() {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return d0.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return d0.d(this);
        }
    }

    /* renamed from: ax.r7.f$c */
    class c extends AbstractCollection<V> {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC2972f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC2972f.this.d(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return AbstractC2972f.this.k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC2972f.this.size();
        }
    }

    AbstractC2972f() {
    }

    @Override // ax.r7.L
    public Collection<Map.Entry<K, V>> a() {
        Collection<Map.Entry<K, V>> collection = this.q;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> f = f();
        this.q = f;
        return f;
    }

    @Override // ax.r7.L
    public Map<K, Collection<V>> b() {
        Map<K, Collection<V>> map = this.e0;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> e = e();
        this.e0 = e;
        return e;
    }

    @Override // ax.r7.L
    public boolean c(Object obj, Object obj2) {
        Collection<V> collection = b().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean d(Object obj) {
        Iterator<Collection<V>> it = b().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    abstract Map<K, Collection<V>> e();

    public boolean equals(Object obj) {
        return N.a(this, obj);
    }

    abstract Collection<Map.Entry<K, V>> f();

    abstract Set<K> g();

    abstract Collection<V> h();

    public int hashCode() {
        return b().hashCode();
    }

    abstract Iterator<Map.Entry<K, V>> i();

    public Set<K> j() {
        Set<K> set = this.c0;
        if (set != null) {
            return set;
        }
        Set<K> g = g();
        this.c0 = g;
        return g;
    }

    abstract Iterator<V> k();

    @Override // ax.r7.L
    public boolean remove(Object obj, Object obj2) {
        Collection<V> collection = b().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return b().toString();
    }

    @Override // ax.r7.L
    public Collection<V> values() {
        Collection<V> collection = this.d0;
        if (collection != null) {
            return collection;
        }
        Collection<V> h = h();
        this.d0 = h;
        return h;
    }
}
