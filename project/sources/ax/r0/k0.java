package ax.r0;

import ax.r0.C2933u;
import j$.util.DesugarCollections;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
class k0<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private List<k0<K, V>.e> c0;
    private Map<K, V> d0;
    private boolean e0;
    private volatile k0<K, V>.g f0;
    private Map<K, V> g0;
    private volatile k0<K, V>.c h0;
    private final int q;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    static class a<FieldDescriptorType> extends k0<FieldDescriptorType, Object> {
        a(int i) {
            super(i, null);
        }

        @Override // ax.r0.k0, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((C2933u.b) obj, obj2);
        }

        @Override // ax.r0.k0
        public void q() {
            if (!p()) {
                for (int i = 0; i < l(); i++) {
                    Map.Entry<FieldDescriptorType, Object> k = k(i);
                    if (((C2933u.b) k.getKey()).k()) {
                        k.setValue(DesugarCollections.unmodifiableList((List) k.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : n()) {
                    if (((C2933u.b) entry.getKey()).k()) {
                        entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.q();
        }
    }

    private class c extends k0<K, V>.g {
        private c() {
            super(k0.this, null);
        }

        @Override // ax.r0.k0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(k0.this, null);
        }

        /* synthetic */ c(k0 k0Var, a aVar) {
            this();
        }
    }

    private static class d {
        private static final Iterator<Object> a = new a();
        private static final Iterable<Object> b = new b();

        static class a implements Iterator<Object> {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        static class b implements Iterable<Object> {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) b;
        }
    }

    private class e implements Map.Entry<K, V>, Comparable<k0<K, V>.e> {
        private V c0;
        private final K q;

        e(k0 k0Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        private boolean h(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(k0<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return h(this.q, entry.getKey()) && h(this.c0, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.c0;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.q;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.c0;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.q;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            k0.this.g();
            V v2 = this.c0;
            this.c0 = v;
            return v2;
        }

        public String toString() {
            return this.q + "=" + this.c0;
        }

        e(K k, V v) {
            this.q = k;
            this.c0 = v;
        }
    }

    private class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            k0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = k0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            k0.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(k0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            k0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return k0.this.size();
        }

        /* synthetic */ g(k0 k0Var, a aVar) {
            this();
        }
    }

    /* synthetic */ k0(int i, a aVar) {
        this(i);
    }

    private int f(K k) {
        int i;
        int size = this.c0.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = k.compareTo(this.c0.get(i2).getKey());
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = k.compareTo(this.c0.get(i4).getKey());
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        i = i3 + 1;
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.e0) {
            throw new UnsupportedOperationException();
        }
    }

    private void j() {
        g();
        if (!this.c0.isEmpty() || (this.c0 instanceof ArrayList)) {
            return;
        }
        this.c0 = new ArrayList(this.q);
    }

    private SortedMap<K, V> o() {
        g();
        if (this.d0.isEmpty() && !(this.d0 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.d0 = treeMap;
            this.g0 = treeMap.descendingMap();
        }
        return (SortedMap) this.d0;
    }

    static <FieldDescriptorType extends C2933u.b<FieldDescriptorType>> k0<FieldDescriptorType, Object> r(int i) {
        return new a(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V t(int i) {
        g();
        V value = this.c0.remove(i).getValue();
        if (!this.d0.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = o().entrySet().iterator();
            this.c0.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.c0.isEmpty()) {
            this.c0.clear();
        }
        if (this.d0.isEmpty()) {
            return;
        }
        this.d0.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.d0.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f0 == null) {
            this.f0 = new g(this, null);
        }
        return this.f0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return super.equals(obj);
        }
        k0 k0Var = (k0) obj;
        int size = size();
        if (size != k0Var.size()) {
            return false;
        }
        int l = l();
        if (l != k0Var.l()) {
            return entrySet().equals(k0Var.entrySet());
        }
        for (int i = 0; i < l; i++) {
            if (!k(i).equals(k0Var.k(i))) {
                return false;
            }
        }
        if (l != size) {
            return this.d0.equals(k0Var.d0);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f2 = f(comparable);
        return f2 >= 0 ? this.c0.get(f2).getValue() : this.d0.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int l = l();
        int i = 0;
        for (int i2 = 0; i2 < l; i2++) {
            i += this.c0.get(i2).hashCode();
        }
        return m() > 0 ? i + this.d0.hashCode() : i;
    }

    Set<Map.Entry<K, V>> i() {
        if (this.h0 == null) {
            this.h0 = new c(this, null);
        }
        return this.h0;
    }

    public Map.Entry<K, V> k(int i) {
        return this.c0.get(i);
    }

    public int l() {
        return this.c0.size();
    }

    public int m() {
        return this.d0.size();
    }

    public Iterable<Map.Entry<K, V>> n() {
        return this.d0.isEmpty() ? d.b() : this.d0.entrySet();
    }

    public boolean p() {
        return this.e0;
    }

    public void q() {
        if (this.e0) {
            return;
        }
        this.d0 = this.d0.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(this.d0);
        this.g0 = this.g0.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(this.g0);
        this.e0 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int f2 = f(comparable);
        if (f2 >= 0) {
            return (V) t(f2);
        }
        if (this.d0.isEmpty()) {
            return null;
        }
        return this.d0.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public V put(K k, V v) {
        g();
        int f2 = f(k);
        if (f2 >= 0) {
            return this.c0.get(f2).setValue(v);
        }
        j();
        int i = -(f2 + 1);
        if (i >= this.q) {
            return o().put(k, v);
        }
        int size = this.c0.size();
        int i2 = this.q;
        if (size == i2) {
            k0<K, V>.e remove = this.c0.remove(i2 - 1);
            o().put(remove.getKey(), remove.getValue());
        }
        this.c0.add(i, new e(k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.c0.size() + this.d0.size();
    }

    private class b implements Iterator<Map.Entry<K, V>> {
        private Iterator<Map.Entry<K, V>> c0;
        private int q;

        private b() {
            this.q = k0.this.c0.size();
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.c0 == null) {
                this.c0 = k0.this.g0.entrySet().iterator();
            }
            return this.c0;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (b().hasNext()) {
                return b().next();
            }
            List list = k0.this.c0;
            int i = this.q - 1;
            this.q = i;
            return (Map.Entry) list.get(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.q;
            return (i > 0 && i <= k0.this.c0.size()) || b().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(k0 k0Var, a aVar) {
            this();
        }
    }

    private class f implements Iterator<Map.Entry<K, V>> {
        private boolean c0;
        private Iterator<Map.Entry<K, V>> d0;
        private int q;

        private f() {
            this.q = -1;
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.d0 == null) {
                this.d0 = k0.this.d0.entrySet().iterator();
            }
            return this.d0;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.c0 = true;
            int i = this.q + 1;
            this.q = i;
            return i < k0.this.c0.size() ? (Map.Entry) k0.this.c0.get(this.q) : b().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.q + 1 < k0.this.c0.size() || (!k0.this.d0.isEmpty() && b().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.c0) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.c0 = false;
            k0.this.g();
            if (this.q >= k0.this.c0.size()) {
                b().remove();
                return;
            }
            k0 k0Var = k0.this;
            int i = this.q;
            this.q = i - 1;
            k0Var.t(i);
        }

        /* synthetic */ f(k0 k0Var, a aVar) {
            this();
        }
    }

    private k0(int i) {
        this.q = i;
        this.c0 = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.d0 = map;
        this.g0 = map;
    }
}
