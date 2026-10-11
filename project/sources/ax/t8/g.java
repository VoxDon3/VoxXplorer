package ax.t8;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes3.dex */
public final class g<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Comparator<Comparable> i0 = new a();
    e<K, V> c0;
    int d0;
    int e0;
    final e<K, V> f0;
    private g<K, V>.b g0;
    private g<K, V>.c h0;
    Comparator<? super K> q;

    class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    class b extends AbstractSet<Map.Entry<K, V>> {

        class a extends g<K, V>.d<Map.Entry<K, V>> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return b();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && g.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> c;
            if (!(obj instanceof Map.Entry) || (c = g.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            g.this.f(c, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g.this.d0;
        }
    }

    final class c extends AbstractSet<K> {

        class a extends g<K, V>.d<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return b().g0;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return g.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return g.this.g(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g.this.d0;
        }
    }

    private abstract class d<T> implements Iterator<T> {
        e<K, V> c0 = null;
        int d0;
        e<K, V> q;

        d() {
            this.q = g.this.f0.e0;
            this.d0 = g.this.e0;
        }

        final e<K, V> b() {
            e<K, V> eVar = this.q;
            g gVar = g.this;
            if (eVar == gVar.f0) {
                throw new NoSuchElementException();
            }
            if (gVar.e0 != this.d0) {
                throw new ConcurrentModificationException();
            }
            this.q = eVar.e0;
            this.c0 = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.q != g.this.f0;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.c0;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            g.this.f(eVar, true);
            this.c0 = null;
            this.d0 = g.this.e0;
        }
    }

    public g() {
        this(i0);
    }

    private boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private void e(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.c0;
            e<K, V> eVar3 = eVar.d0;
            int i = eVar2 != null ? eVar2.i0 : 0;
            int i2 = eVar3 != null ? eVar3.i0 : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                e<K, V> eVar4 = eVar3.c0;
                e<K, V> eVar5 = eVar3.d0;
                int i4 = (eVar4 != null ? eVar4.i0 : 0) - (eVar5 != null ? eVar5.i0 : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    j(eVar);
                } else {
                    k(eVar3);
                    j(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                e<K, V> eVar6 = eVar2.c0;
                e<K, V> eVar7 = eVar2.d0;
                int i5 = (eVar6 != null ? eVar6.i0 : 0) - (eVar7 != null ? eVar7.i0 : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    k(eVar);
                } else {
                    j(eVar2);
                    k(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                eVar.i0 = i + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.i0 = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.q;
        }
    }

    private void i(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.q;
        eVar.q = null;
        if (eVar2 != null) {
            eVar2.q = eVar3;
        }
        if (eVar3 == null) {
            this.c0 = eVar2;
        } else if (eVar3.c0 == eVar) {
            eVar3.c0 = eVar2;
        } else {
            eVar3.d0 = eVar2;
        }
    }

    private void j(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.c0;
        e<K, V> eVar3 = eVar.d0;
        e<K, V> eVar4 = eVar3.c0;
        e<K, V> eVar5 = eVar3.d0;
        eVar.d0 = eVar4;
        if (eVar4 != null) {
            eVar4.q = eVar;
        }
        i(eVar, eVar3);
        eVar3.c0 = eVar;
        eVar.q = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.i0 : 0, eVar4 != null ? eVar4.i0 : 0) + 1;
        eVar.i0 = max;
        eVar3.i0 = Math.max(max, eVar5 != null ? eVar5.i0 : 0) + 1;
    }

    private void k(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.c0;
        e<K, V> eVar3 = eVar.d0;
        e<K, V> eVar4 = eVar2.c0;
        e<K, V> eVar5 = eVar2.d0;
        eVar.c0 = eVar5;
        if (eVar5 != null) {
            eVar5.q = eVar;
        }
        i(eVar, eVar2);
        eVar2.d0 = eVar;
        eVar.q = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.i0 : 0, eVar5 != null ? eVar5.i0 : 0) + 1;
        eVar.i0 = max;
        eVar2.i0 = Math.max(max, eVar4 != null ? eVar4.i0 : 0) + 1;
    }

    e<K, V> b(K k, boolean z) {
        int i;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.q;
        e<K, V> eVar2 = this.c0;
        if (eVar2 != null) {
            Comparable comparable = comparator == i0 ? (Comparable) k : null;
            while (true) {
                i = comparable != null ? comparable.compareTo(eVar2.g0) : comparator.compare(k, eVar2.g0);
                if (i == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i < 0 ? eVar2.c0 : eVar2.d0;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        e<K, V> eVar4 = this.f0;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k, eVar4, eVar4.f0);
            if (i < 0) {
                eVar2.c0 = eVar;
            } else {
                eVar2.d0 = eVar;
            }
            e(eVar2, true);
        } else {
            if (comparator == i0 && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(eVar2, k, eVar4, eVar4.f0);
            this.c0 = eVar;
        }
        this.d0++;
        this.e0++;
        return eVar;
    }

    e<K, V> c(Map.Entry<?, ?> entry) {
        e<K, V> d2 = d(entry.getKey());
        if (d2 == null || !a(d2.h0, entry.getValue())) {
            return null;
        }
        return d2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.c0 = null;
        this.d0 = 0;
        this.e0++;
        e<K, V> eVar = this.f0;
        eVar.f0 = eVar;
        eVar.e0 = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    e<K, V> d(Object obj) {
        if (obj != 0) {
            try {
                return b(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        g<K, V>.b bVar = this.g0;
        if (bVar != null) {
            return bVar;
        }
        g<K, V>.b bVar2 = new b();
        this.g0 = bVar2;
        return bVar2;
    }

    void f(e<K, V> eVar, boolean z) {
        int i;
        if (z) {
            e<K, V> eVar2 = eVar.f0;
            eVar2.e0 = eVar.e0;
            eVar.e0.f0 = eVar2;
        }
        e<K, V> eVar3 = eVar.c0;
        e<K, V> eVar4 = eVar.d0;
        e<K, V> eVar5 = eVar.q;
        int i2 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                i(eVar, eVar3);
                eVar.c0 = null;
            } else if (eVar4 != null) {
                i(eVar, eVar4);
                eVar.d0 = null;
            } else {
                i(eVar, null);
            }
            e(eVar5, false);
            this.d0--;
            this.e0++;
            return;
        }
        e<K, V> b2 = eVar3.i0 > eVar4.i0 ? eVar3.b() : eVar4.a();
        f(b2, false);
        e<K, V> eVar6 = eVar.c0;
        if (eVar6 != null) {
            i = eVar6.i0;
            b2.c0 = eVar6;
            eVar6.q = b2;
            eVar.c0 = null;
        } else {
            i = 0;
        }
        e<K, V> eVar7 = eVar.d0;
        if (eVar7 != null) {
            i2 = eVar7.i0;
            b2.d0 = eVar7;
            eVar7.q = b2;
            eVar.d0 = null;
        }
        b2.i0 = Math.max(i, i2) + 1;
        i(eVar, b2);
    }

    e<K, V> g(Object obj) {
        e<K, V> d2 = d(obj);
        if (d2 != null) {
            f(d2, true);
        }
        return d2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> d2 = d(obj);
        if (d2 != null) {
            return d2.h0;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        g<K, V>.c cVar = this.h0;
        if (cVar != null) {
            return cVar;
        }
        g<K, V>.c cVar2 = new c();
        this.h0 = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        e<K, V> b2 = b(k, true);
        V v2 = b2.h0;
        b2.h0 = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> g = g(obj);
        if (g != null) {
            return g.h0;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.d0;
    }

    public g(Comparator<? super K> comparator) {
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = new e<>();
        this.q = comparator == null ? i0 : comparator;
    }

    static final class e<K, V> implements Map.Entry<K, V> {
        e<K, V> c0;
        e<K, V> d0;
        e<K, V> e0;
        e<K, V> f0;
        final K g0;
        V h0;
        int i0;
        e<K, V> q;

        e() {
            this.g0 = null;
            this.f0 = this;
            this.e0 = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.c0; eVar2 != null; eVar2 = eVar2.c0) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.d0; eVar2 != null; eVar2 = eVar2.d0) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.g0;
                if (k != null ? k.equals(entry.getKey()) : entry.getKey() == null) {
                    V v = this.h0;
                    if (v == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.g0;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.h0;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.g0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.h0;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.h0;
            this.h0 = v;
            return v2;
        }

        public String toString() {
            return this.g0 + "=" + this.h0;
        }

        e(e<K, V> eVar, K k, e<K, V> eVar2, e<K, V> eVar3) {
            this.q = eVar;
            this.g0 = k;
            this.i0 = 1;
            this.e0 = eVar2;
            this.f0 = eVar3;
            eVar3.e0 = this;
            eVar2.f0 = this;
        }
    }
}
