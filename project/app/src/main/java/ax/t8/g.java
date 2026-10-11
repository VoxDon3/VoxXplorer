/*
 * Decompiled with CFR 0.152.
 */
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

public final class g<K, V>
extends AbstractMap<K, V>
implements Serializable {
    private static final Comparator<Comparable> i0 = new Comparator<Comparable>(){

        public int a(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    e<K, V> c0;
    int d0 = 0;
    int e0 = 0;
    final e<K, V> f0 = new e();
    private b g0;
    private c h0;
    Comparator<? super K> q;

    public g() {
        this(i0);
    }

    public g(Comparator<? super K> comparator) {
        if (comparator == null) {
            comparator = i0;
        }
        this.q = comparator;
    }

    private boolean a(Object object, Object object2) {
        return object == object2 || object != null && object.equals(object2);
        {
        }
    }

    private void e(e<K, V> e8, boolean bl) {
        while (e8 != null) {
            e e9;
            int n8;
            e e10 = e8.c0;
            e e11 = e8.d0;
            int n9 = 0;
            int n10 = 0;
            int n11 = e10 != null ? e10.i0 : 0;
            int n12 = n11 - (n8 = e11 != null ? e11.i0 : 0);
            if (n12 == -2) {
                e10 = e11.c0;
                e9 = e11.d0;
                n11 = e9 != null ? e9.i0 : 0;
                n8 = n10;
                if (e10 != null) {
                    n8 = e10.i0;
                }
                if ((n11 = n8 - n11) != -1 && (n11 != 0 || bl)) {
                    this.k(e11);
                    this.j(e8);
                } else {
                    this.j(e8);
                }
                if (bl) {
                    break;
                }
            } else if (n12 == 2) {
                e11 = e10.c0;
                e9 = e10.d0;
                n11 = e9 != null ? e9.i0 : 0;
                n8 = n9;
                if (e11 != null) {
                    n8 = e11.i0;
                }
                if ((n11 = n8 - n11) != 1 && (n11 != 0 || bl)) {
                    this.j(e10);
                    this.k(e8);
                } else {
                    this.k(e8);
                }
                if (bl) {
                    break;
                }
            } else if (n12 == 0) {
                e8.i0 = n11 + 1;
                if (bl) {
                    break;
                }
            } else {
                e8.i0 = Math.max(n11, n8) + 1;
                if (!bl) break;
            }
            e8 = e8.q;
        }
    }

    private void i(e<K, V> e8, e<K, V> e9) {
        e e10 = e8.q;
        e8.q = null;
        if (e9 != null) {
            e9.q = e10;
        }
        if (e10 != null) {
            if (e10.c0 == e8) {
                e10.c0 = e9;
                return;
            }
            e10.d0 = e9;
            return;
        }
        this.c0 = e9;
    }

    private void j(e<K, V> e8) {
        e e9 = e8.c0;
        e e10 = e8.d0;
        e e11 = e10.c0;
        e e12 = e10.d0;
        e8.d0 = e11;
        if (e11 != null) {
            e11.q = e8;
        }
        this.i(e8, e10);
        e10.c0 = e8;
        e8.q = e10;
        int n8 = 0;
        int n9 = e9 != null ? e9.i0 : 0;
        int n10 = e11 != null ? e11.i0 : 0;
        e8.i0 = n10 = Math.max(n9, n10) + 1;
        n9 = n8;
        if (e12 != null) {
            n9 = e12.i0;
        }
        e10.i0 = Math.max(n10, n9) + 1;
    }

    private void k(e<K, V> e8) {
        e e9 = e8.c0;
        e e10 = e8.d0;
        e e11 = e9.c0;
        e e12 = e9.d0;
        e8.c0 = e12;
        if (e12 != null) {
            e12.q = e8;
        }
        this.i(e8, e9);
        e9.d0 = e8;
        e8.q = e9;
        int n8 = 0;
        int n9 = e10 != null ? e10.i0 : 0;
        int n10 = e12 != null ? e12.i0 : 0;
        e8.i0 = n10 = Math.max(n9, n10) + 1;
        n9 = n8;
        if (e11 != null) {
            n9 = e11.i0;
        }
        e9.i0 = Math.max(n10, n9) + 1;
    }

    e<K, V> b(K object, boolean bl) {
        e<K, V> e8;
        int n8;
        Comparator<K> comparator = this.q;
        e<K, V> e9 = this.c0;
        if (e9 != null) {
            Comparable comparable = comparator == i0 ? (Comparable)object : null;
            while (true) {
                if ((n8 = comparable != null ? comparable.compareTo(e9.g0) : comparator.compare(object, e9.g0)) == 0) {
                    return e9;
                }
                e8 = n8 < 0 ? e9.c0 : e9.d0;
                if (e8 != null) {
                    e9 = e8;
                    continue;
                }
                break;
            }
        } else {
            n8 = 0;
        }
        if (!bl) {
            return null;
        }
        e8 = this.f0;
        if (e9 == null) {
            if (comparator == i0 && !(object instanceof Comparable)) {
                e9 = new StringBuilder();
                ((StringBuilder)((Object)e9)).append(object.getClass().getName());
                ((StringBuilder)((Object)e9)).append(" is not Comparable");
                throw new ClassCastException(((StringBuilder)((Object)e9)).toString());
            }
            object = new e<K, V>(e9, object, e8, e8.f0);
            this.c0 = object;
        } else {
            object = new e<K, V>(e9, object, e8, e8.f0);
            if (n8 < 0) {
                e9.c0 = object;
            } else {
                e9.d0 = object;
            }
            this.e(e9, true);
        }
        ++this.d0;
        ++this.e0;
        return object;
    }

    e<K, V> c(Map.Entry<?, ?> entry) {
        e<K, V> e8 = this.d(entry.getKey());
        if (e8 != null && this.a(e8.h0, entry.getValue())) {
            return e8;
        }
        return null;
    }

    @Override
    public void clear() {
        this.c0 = null;
        this.d0 = 0;
        ++this.e0;
        e<K, V> e8 = this.f0;
        e8.f0 = e8;
        e8.e0 = e8;
    }

    @Override
    public boolean containsKey(Object object) {
        return this.d(object) != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    e<K, V> d(Object e8) {
        if (e8 == null) return null;
        try {
            return this.b(e8, false);
        }
        catch (ClassCastException classCastException) {
            return null;
        }
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        b b8 = this.g0;
        if (b8 != null) {
            return b8;
        }
        this.g0 = b8 = new b(this);
        return b8;
    }

    void f(e<K, V> e8, boolean bl) {
        e e9;
        if (bl) {
            e9 = e8.f0;
            e9.e0 = e8.e0;
            e8.e0.f0 = e9;
        }
        e e10 = e8.c0;
        e e11 = e8.d0;
        e9 = e8.q;
        int n8 = 0;
        if (e10 != null && e11 != null) {
            int n9;
            e9 = e10.i0 > e11.i0 ? e10.b() : e11.a();
            this.f(e9, false);
            e10 = e8.c0;
            if (e10 != null) {
                n9 = e10.i0;
                e9.c0 = e10;
                e10.q = e9;
                e8.c0 = null;
            } else {
                n9 = 0;
            }
            e10 = e8.d0;
            if (e10 != null) {
                n8 = e10.i0;
                e9.d0 = e10;
                e10.q = e9;
                e8.d0 = null;
            }
            e9.i0 = Math.max(n9, n8) + 1;
            this.i(e8, e9);
            return;
        }
        if (e10 != null) {
            this.i(e8, e10);
            e8.c0 = null;
        } else if (e11 != null) {
            this.i(e8, e11);
            e8.d0 = null;
        } else {
            this.i(e8, null);
        }
        this.e(e9, false);
        --this.d0;
        ++this.e0;
    }

    e<K, V> g(Object e8) {
        if ((e8 = this.d(e8)) != null) {
            this.f(e8, true);
        }
        return e8;
    }

    @Override
    public V get(Object e8) {
        if ((e8 = this.d(e8)) != null) {
            return e8.h0;
        }
        return null;
    }

    @Override
    public Set<K> keySet() {
        c c8 = this.h0;
        if (c8 != null) {
            return c8;
        }
        this.h0 = c8 = new c(this);
        return c8;
    }

    @Override
    public V put(K object, V v8) {
        if (object != null) {
            object = this.b(object, true);
            Object v9 = ((e)object).h0;
            ((e)object).h0 = v8;
            return v9;
        }
        throw new NullPointerException("key == null");
    }

    @Override
    public V remove(Object e8) {
        if ((e8 = this.g(e8)) != null) {
            return e8.h0;
        }
        return null;
    }

    @Override
    public int size() {
        return this.d0;
    }

    class b
    extends AbstractSet<Map.Entry<K, V>> {
        final g q;

        b(g g8) {
            this.q = g8;
        }

        @Override
        public void clear() {
            this.q.clear();
        }

        @Override
        public boolean contains(Object object) {
            return object instanceof Map.Entry && this.q.c((Map.Entry)object) != null;
        }

        @Override
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d<Map.Entry<K, V>>(this){
                final b f0;
                {
                    this.f0 = b8;
                    super(b8.q);
                }

                public Map.Entry<K, V> c() {
                    return this.b();
                }
            };
        }

        @Override
        public boolean remove(Object e8) {
            if (!(e8 instanceof Map.Entry)) {
                return false;
            }
            if ((e8 = this.q.c(e8)) == null) {
                return false;
            }
            this.q.f(e8, true);
            return true;
        }

        @Override
        public int size() {
            return this.q.d0;
        }
    }

    final class c
    extends AbstractSet<K> {
        final g q;

        c(g g8) {
            this.q = g8;
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
        public Iterator<K> iterator() {
            return new d<K>(this){
                final c f0;
                {
                    this.f0 = c8;
                    super(c8.q);
                }

                @Override
                public K next() {
                    return this.b().g0;
                }
            };
        }

        @Override
        public boolean remove(Object object) {
            return this.q.g(object) != null;
        }

        @Override
        public int size() {
            return this.q.d0;
        }
    }

    private abstract class d<T>
    implements Iterator<T> {
        e<K, V> c0;
        int d0;
        final g e0;
        e<K, V> q;

        d(g g8) {
            this.e0 = g8;
            this.q = g8.f0.e0;
            this.c0 = null;
            this.d0 = g8.e0;
        }

        final e<K, V> b() {
            e e8 = this.q;
            g g8 = this.e0;
            if (e8 != g8.f0) {
                if (g8.e0 == this.d0) {
                    this.q = e8.e0;
                    this.c0 = e8;
                    return e8;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override
        public final boolean hasNext() {
            return this.q != this.e0.f0;
        }

        @Override
        public final void remove() {
            e e8 = this.c0;
            if (e8 != null) {
                this.e0.f(e8, true);
                this.c0 = null;
                this.d0 = this.e0.e0;
                return;
            }
            throw new IllegalStateException();
        }
    }

    static final class e<K, V>
    implements Map.Entry<K, V> {
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

        e(e<K, V> e8, K k8, e<K, V> e9, e<K, V> e10) {
            this.q = e8;
            this.g0 = k8;
            this.i0 = 1;
            this.e0 = e9;
            this.f0 = e10;
            e10.e0 = this;
            e9.f0 = this;
        }

        public e<K, V> a() {
            e<K, V> e8 = this.c0;
            e<K, V> e9 = this;
            while (e8 != null) {
                e<K, V> e10 = e8.c0;
                e9 = e8;
                e8 = e10;
            }
            return e9;
        }

        public e<K, V> b() {
            e<K, V> e8 = this.d0;
            e<K, V> e9 = this;
            while (e8 != null) {
                e<K, V> e10 = e8.d0;
                e9 = e8;
                e8 = e10;
            }
            return e9;
        }

        @Override
        public boolean equals(Object object) {
            if (object instanceof Map.Entry) {
                object = (Map.Entry)object;
                Object object2 = this.g0;
                if ((object2 == null ? object.getKey() == null : object2.equals(object.getKey())) && ((object2 = this.h0) == null ? object.getValue() == null : object2.equals(object.getValue()))) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public K getKey() {
            return this.g0;
        }

        @Override
        public V getValue() {
            return this.h0;
        }

        @Override
        public int hashCode() {
            Object object = this.g0;
            int n8 = 0;
            int n9 = object == null ? 0 : object.hashCode();
            object = this.h0;
            if (object != null) {
                n8 = object.hashCode();
            }
            return n9 ^ n8;
        }

        @Override
        public V setValue(V v8) {
            V v9 = this.h0;
            this.h0 = v8;
            return v9;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.g0);
            stringBuilder.append("=");
            stringBuilder.append(this.h0);
            return stringBuilder.toString();
        }
    }
}

