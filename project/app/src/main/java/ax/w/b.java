/*
 * Decompiled with CFR 0.152.
 */
package ax.w;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b<K, V>
implements Iterable<Map.Entry<K, V>> {
    private c<K, V> c0;
    private final WeakHashMap<f<K, V>, Boolean> d0 = new WeakHashMap();
    private int e0 = 0;
    c<K, V> q;

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        b<K, V> b8 = new b<K, V>(this.c0, this.q);
        this.d0.put(b8, Boolean.FALSE);
        return b8;
    }

    public Map.Entry<K, V> e() {
        return this.q;
    }

    public boolean equals(Object iterator) {
        if (iterator == this) {
            return true;
        }
        if (!(iterator instanceof b)) {
            return false;
        }
        Object object = (b)((Object)iterator);
        if (this.size() != ((b)object).size()) {
            return false;
        }
        iterator = this.iterator();
        Iterator<Map.Entry<K, V>> iterator2 = ((b)object).iterator();
        while (iterator.hasNext() && iterator2.hasNext()) {
            object = iterator.next();
            Map.Entry<K, V> entry = iterator2.next();
            if ((object != null || entry == null) && (object == null || object.equals(entry))) continue;
            return false;
        }
        return !iterator.hasNext() && !iterator2.hasNext();
    }

    protected c<K, V> g(K k8) {
        c<K, V> c8 = this.q;
        while (c8 != null && !c8.q.equals(k8)) {
            c8 = c8.d0;
        }
        return c8;
    }

    public d h() {
        d d8 = new d(this);
        this.d0.put(d8, Boolean.FALSE);
        return d8;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> iterator = this.iterator();
        int n8 = 0;
        while (iterator.hasNext()) {
            n8 += iterator.next().hashCode();
        }
        return n8;
    }

    public Map.Entry<K, V> i() {
        return this.c0;
    }

    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        a<K, V> a8 = new a<K, V>(this.q, this.c0);
        this.d0.put(a8, Boolean.FALSE);
        return a8;
    }

    c<K, V> k(K object, V object2) {
        object2 = new c<K, V>(object, object2);
        ++this.e0;
        object = this.c0;
        if (object == null) {
            this.q = object2;
            this.c0 = object2;
            return object2;
        }
        ((c)object).d0 = object2;
        ((c)object2).e0 = object;
        this.c0 = object2;
        return object2;
    }

    public V l(K k8, V v8) {
        c<K, V> c8 = this.g(k8);
        if (c8 != null) {
            return c8.c0;
        }
        this.k(k8, v8);
        return null;
    }

    public V n(K object) {
        c c8;
        Object object2;
        if ((object = this.g(object)) == null) {
            return null;
        }
        --this.e0;
        if (!this.d0.isEmpty()) {
            object2 = this.d0.keySet().iterator();
            while (object2.hasNext()) {
                object2.next().b((c<K, V>)object);
            }
        }
        if ((c8 = ((c)object).e0) != null) {
            c8.d0 = ((c)object).d0;
        } else {
            this.q = ((c)object).d0;
        }
        object2 = ((c)object).d0;
        if (object2 != null) {
            ((c)object2).e0 = c8;
        } else {
            this.c0 = c8;
        }
        ((c)object).d0 = null;
        ((c)object).e0 = null;
        return ((c)object).c0;
    }

    public int size() {
        return this.e0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Iterator<Map.Entry<K, V>> iterator = this.iterator();
        while (iterator.hasNext()) {
            stringBuilder.append(iterator.next().toString());
            if (!iterator.hasNext()) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    static class a<K, V>
    extends e<K, V> {
        a(c<K, V> c8, c<K, V> c9) {
            super(c8, c9);
        }

        @Override
        c<K, V> c(c<K, V> c8) {
            return c8.e0;
        }

        @Override
        c<K, V> e(c<K, V> c8) {
            return c8.d0;
        }
    }

    private static class b<K, V>
    extends e<K, V> {
        b(c<K, V> c8, c<K, V> c9) {
            super(c8, c9);
        }

        @Override
        c<K, V> c(c<K, V> c8) {
            return c8.d0;
        }

        @Override
        c<K, V> e(c<K, V> c8) {
            return c8.e0;
        }
    }

    static class c<K, V>
    implements Map.Entry<K, V> {
        final V c0;
        c<K, V> d0;
        c<K, V> e0;
        final K q;

        c(K k8, V v8) {
            this.q = k8;
            this.c0 = v8;
        }

        @Override
        public boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof c)) {
                return false;
            }
            object = (c)object;
            return this.q.equals(((c)object).q) && this.c0.equals(((c)object).c0);
        }

        @Override
        public K getKey() {
            return this.q;
        }

        @Override
        public V getValue() {
            return this.c0;
        }

        @Override
        public int hashCode() {
            return this.q.hashCode() ^ this.c0.hashCode();
        }

        @Override
        public V setValue(V v8) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.q);
            stringBuilder.append("=");
            stringBuilder.append(this.c0);
            return stringBuilder.toString();
        }
    }

    public class d
    extends f<K, V>
    implements Iterator<Map.Entry<K, V>> {
        private boolean c0;
        final b d0;
        private c<K, V> q;

        d(b b8) {
            this.d0 = b8;
            this.c0 = true;
        }

        @Override
        void b(c<K, V> c8) {
            c c9 = this.q;
            if (c8 == c9) {
                c8 = c9.e0;
                this.q = c8;
                boolean bl = c8 == null;
                this.c0 = bl;
            }
        }

        public Map.Entry<K, V> c() {
            if (this.c0) {
                this.c0 = false;
                this.q = this.d0.q;
            } else {
                c c8 = this.q;
                c8 = c8 != null ? c8.d0 : null;
                this.q = c8;
            }
            return this.q;
        }

        @Override
        public boolean hasNext() {
            if (this.c0) {
                return this.d0.q != null;
            }
            c c8 = this.q;
            return c8 != null && c8.d0 != null;
        }
    }

    private static abstract class e<K, V>
    extends f<K, V>
    implements Iterator<Map.Entry<K, V>> {
        c<K, V> c0;
        c<K, V> q;

        e(c<K, V> c8, c<K, V> c9) {
            this.q = c9;
            this.c0 = c8;
        }

        private c<K, V> g() {
            c<K, V> c8 = this.c0;
            c<K, V> c9 = this.q;
            if (c8 != c9 && c9 != null) {
                return this.e(c8);
            }
            return null;
        }

        @Override
        public void b(c<K, V> c8) {
            c<K, V> c9;
            if (this.q == c8 && c8 == this.c0) {
                this.c0 = null;
                this.q = null;
            }
            if ((c9 = this.q) == c8) {
                this.q = this.c(c9);
            }
            if (this.c0 == c8) {
                this.c0 = this.g();
            }
        }

        abstract c<K, V> c(c<K, V> var1);

        abstract c<K, V> e(c<K, V> var1);

        public Map.Entry<K, V> f() {
            c<K, V> c8 = this.c0;
            this.c0 = this.g();
            return c8;
        }

        @Override
        public boolean hasNext() {
            return this.c0 != null;
        }
    }

    public static abstract class f<K, V> {
        abstract void b(c<K, V> var1);
    }
}

