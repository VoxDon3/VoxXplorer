/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.u;
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

class k0<K extends Comparable<K>, V>
extends AbstractMap<K, V> {
    private List<e> c0;
    private Map<K, V> d0;
    private boolean e0;
    private volatile g f0;
    private Map<K, V> g0;
    private volatile c h0;
    private final int q;

    private k0(int n8) {
        Map map;
        this.q = n8;
        this.c0 = Collections.EMPTY_LIST;
        this.d0 = map = Collections.EMPTY_MAP;
        this.g0 = map;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int f(K k8) {
        int n8;
        int n9 = this.c0.size();
        int n10 = n9 - 1;
        if (n10 >= 0) {
            n8 = k8.compareTo(this.c0.get(n10).j());
            if (n8 > 0) {
                n10 = n9 + 1;
                return -n10;
            }
            if (n8 == 0) {
                return n10;
            }
        }
        n9 = 0;
        while (n9 <= n10) {
            n8 = (n9 + n10) / 2;
            int n11 = k8.compareTo(this.c0.get(n8).j());
            if (n11 < 0) {
                n10 = n8 - 1;
                continue;
            }
            if (n11 <= 0) return n8;
            n9 = n8 + 1;
        }
        n10 = n9 + 1;
        return -n10;
    }

    private void g() {
        if (!this.e0) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    private void j() {
        this.g();
        if (this.c0.isEmpty() && !(this.c0 instanceof ArrayList)) {
            this.c0 = new ArrayList<e>(this.q);
        }
    }

    private SortedMap<K, V> o() {
        this.g();
        if (this.d0.isEmpty() && !(this.d0 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.d0 = treeMap;
            this.g0 = treeMap.descendingMap();
        }
        return (SortedMap)this.d0;
    }

    static <FieldDescriptorType extends u.b<FieldDescriptorType>> k0<FieldDescriptorType, Object> r(int n8) {
        return new k0<FieldDescriptorType, Object>(n8){

            @Override
            public void q() {
                if (!this.p()) {
                    for (int i8 = 0; i8 < this.l(); ++i8) {
                        Map.Entry entry = this.k(i8);
                        if (!((u.b)entry.getKey()).k()) continue;
                        entry.setValue(java.util.DesugarCollections.unmodifiableList((List)((List)entry.getValue())));
                    }
                    for (Map.Entry entry : this.n()) {
                        if (!((u.b)entry.getKey()).k()) continue;
                        entry.setValue(java.util.DesugarCollections.unmodifiableList((List)((List)entry.getValue())));
                    }
                }
                super.q();
            }
        };
    }

    private V t(int n8) {
        this.g();
        Object v8 = this.c0.remove(n8).getValue();
        if (!this.d0.isEmpty()) {
            Iterator<Map.Entry<K, V>> iterator = this.o().entrySet().iterator();
            this.c0.add(new e(this, iterator.next()));
            iterator.remove();
        }
        return v8;
    }

    @Override
    public void clear() {
        this.g();
        if (!this.c0.isEmpty()) {
            this.c0.clear();
        }
        if (!this.d0.isEmpty()) {
            this.d0.clear();
        }
    }

    @Override
    public boolean containsKey(Object object) {
        return this.f(object = (Comparable)object) >= 0 || this.d0.containsKey(object);
        {
        }
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f0 == null) {
            this.f0 = new g(this);
        }
        return this.f0;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof k0)) {
            return super.equals(object);
        }
        object = (k0)object;
        int n8 = this.size();
        if (n8 != ((k0)object).size()) {
            return false;
        }
        int n9 = this.l();
        if (n9 != ((k0)object).l()) {
            return this.entrySet().equals(((k0)object).entrySet());
        }
        for (int i8 = 0; i8 < n9; ++i8) {
            if (this.k(i8).equals(((k0)object).k(i8))) continue;
            return false;
        }
        if (n9 != n8) {
            return this.d0.equals(((k0)object).d0);
        }
        return true;
    }

    @Override
    public V get(Object object) {
        int n8 = this.f(object = (Comparable)object);
        if (n8 >= 0) {
            return this.c0.get(n8).getValue();
        }
        return this.d0.get(object);
    }

    @Override
    public int hashCode() {
        int n8;
        int n9 = this.l();
        int n10 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            n10 += this.c0.get(n8).hashCode();
        }
        n8 = n10;
        if (this.m() > 0) {
            n8 = n10 + this.d0.hashCode();
        }
        return n8;
    }

    Set<Map.Entry<K, V>> i() {
        if (this.h0 == null) {
            this.h0 = new c(this);
        }
        return this.h0;
    }

    public Map.Entry<K, V> k(int n8) {
        return this.c0.get(n8);
    }

    public int l() {
        return this.c0.size();
    }

    public int m() {
        return this.d0.size();
    }

    public Iterable<Map.Entry<K, V>> n() {
        if (this.d0.isEmpty()) {
            return d.b();
        }
        return this.d0.entrySet();
    }

    public boolean p() {
        return this.e0;
    }

    public void q() {
        if (!this.e0) {
            Map map = this.d0.isEmpty() ? Collections.EMPTY_MAP : java.util.DesugarCollections.unmodifiableMap(this.d0);
            this.d0 = map;
            map = this.g0.isEmpty() ? Collections.EMPTY_MAP : java.util.DesugarCollections.unmodifiableMap(this.g0);
            this.g0 = map;
            this.e0 = true;
        }
    }

    @Override
    public V remove(Object object) {
        this.g();
        object = (Comparable)object;
        int n8 = this.f(object);
        if (n8 >= 0) {
            return this.t(n8);
        }
        if (this.d0.isEmpty()) {
            return null;
        }
        return this.d0.remove(object);
    }

    public V s(K k8, V v8) {
        int n8;
        this.g();
        int n9 = this.f(k8);
        if (n9 >= 0) {
            return this.c0.get(n9).setValue(v8);
        }
        this.j();
        int n10 = -(n9 + 1);
        if (n10 >= this.q) {
            return this.o().put(k8, v8);
        }
        n9 = this.c0.size();
        if (n9 == (n8 = this.q)) {
            e e8 = this.c0.remove(n8 - 1);
            this.o().put(e8.j(), e8.getValue());
        }
        this.c0.add(n10, new e(this, k8, v8));
        return null;
    }

    @Override
    public int size() {
        return this.c0.size() + this.d0.size();
    }

    private class b
    implements Iterator<Map.Entry<K, V>> {
        private Iterator<Map.Entry<K, V>> c0;
        final k0 d0;
        private int q;

        private b(k0 k02) {
            this.d0 = k02;
            this.q = k02.c0.size();
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.c0 == null) {
                this.c0 = this.d0.g0.entrySet().iterator();
            }
            return this.c0;
        }

        public Map.Entry<K, V> c() {
            int n8;
            if (this.b().hasNext()) {
                return this.b().next();
            }
            List list = this.d0.c0;
            this.q = n8 = this.q - 1;
            return (Map.Entry)list.get(n8);
        }

        @Override
        public boolean hasNext() {
            int n8 = this.q;
            return n8 > 0 && n8 <= this.d0.c0.size() || this.b().hasNext();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private class c
    extends g {
        final k0 c0;

        private c(k0 k02) {
            this.c0 = k02;
            super(k02);
        }

        @Override
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(this.c0);
        }
    }

    private static class d {
        private static final Iterator<Object> a = new Iterator<Object>(){

            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        private static final Iterable<Object> b = new Iterable<Object>(){

            @Override
            public Iterator<Object> iterator() {
                return a;
            }
        };

        static <T> Iterable<T> b() {
            return b;
        }
    }

    private class e
    implements Map.Entry<K, V>,
    Comparable<e> {
        private V c0;
        final k0 d0;
        private final K q;

        e(K k8, V v8) {
            this.d0 = var1_1;
            this.q = k8;
            this.c0 = v8;
        }

        e(k0 k02, Map.Entry<K, V> entry) {
            this(k02, (Comparable)entry.getKey(), entry.getValue());
        }

        private boolean h(Object object, Object object2) {
            if (object == null) {
                return object2 == null;
            }
            return object.equals(object2);
        }

        public int d(e e8) {
            return this.j().compareTo(e8.j());
        }

        @Override
        public boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof Map.Entry)) {
                return false;
            }
            return this.h(this.q, (object = (Map.Entry)object).getKey()) && this.h(this.c0, object.getValue());
        }

        @Override
        public V getValue() {
            return this.c0;
        }

        @Override
        public int hashCode() {
            Object object = this.q;
            int n8 = 0;
            int n9 = object == null ? 0 : object.hashCode();
            object = this.c0;
            if (object != null) {
                n8 = object.hashCode();
            }
            return n9 ^ n8;
        }

        public K j() {
            return this.q;
        }

        @Override
        public V setValue(V v8) {
            this.d0.g();
            Object v9 = this.c0;
            this.c0 = v8;
            return v9;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.q);
            stringBuilder.append("=");
            stringBuilder.append(this.c0);
            return stringBuilder.toString();
        }
    }

    private class f
    implements Iterator<Map.Entry<K, V>> {
        private boolean c0;
        private Iterator<Map.Entry<K, V>> d0;
        final k0 e0;
        private int q;

        private f(k0 k02) {
            this.e0 = k02;
            this.q = -1;
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.d0 == null) {
                this.d0 = this.e0.d0.entrySet().iterator();
            }
            return this.d0;
        }

        public Map.Entry<K, V> c() {
            int n8;
            this.c0 = true;
            this.q = n8 = this.q + 1;
            if (n8 < this.e0.c0.size()) {
                return (Map.Entry)this.e0.c0.get(this.q);
            }
            return this.b().next();
        }

        @Override
        public boolean hasNext() {
            return this.q + 1 < this.e0.c0.size() || !this.e0.d0.isEmpty() && this.b().hasNext();
            {
            }
        }

        @Override
        public void remove() {
            if (this.c0) {
                this.c0 = false;
                this.e0.g();
                if (this.q < this.e0.c0.size()) {
                    k0 k02 = this.e0;
                    int n8 = this.q;
                    this.q = n8 - 1;
                    k02.t(n8);
                    return;
                }
                this.b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    private class g
    extends AbstractSet<Map.Entry<K, V>> {
        final k0 q;

        private g(k0 k02) {
            this.q = k02;
        }

        @Override
        public void clear() {
            this.q.clear();
        }

        @Override
        public boolean contains(Object object) {
            Map.Entry entry = (Map.Entry)object;
            object = this.q.get(entry.getKey());
            return object == (entry = entry.getValue()) || object != null && object.equals(entry);
            {
            }
        }

        public boolean e(Map.Entry<K, V> entry) {
            if (!this.contains(entry)) {
                this.q.s((Comparable)entry.getKey(), entry.getValue());
                return true;
            }
            return false;
        }

        @Override
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(this.q);
        }

        @Override
        public boolean remove(Object object) {
            if (this.contains(object = (Map.Entry)object)) {
                this.q.remove(object.getKey());
                return true;
            }
            return false;
        }

        @Override
        public int size() {
            return this.q.size();
        }
    }
}

