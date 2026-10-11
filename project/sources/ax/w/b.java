package ax.w;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {
    private c<K, V> c0;
    private final WeakHashMap<f<K, V>, Boolean> d0 = new WeakHashMap<>();
    private int e0 = 0;
    c<K, V> q;

    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // ax.w.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.e0;
        }

        @Override // ax.w.b.e
        c<K, V> e(c<K, V> cVar) {
            return cVar.d0;
        }
    }

    /* renamed from: ax.w.b$b, reason: collision with other inner class name */
    private static class C0482b<K, V> extends e<K, V> {
        C0482b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // ax.w.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.d0;
        }

        @Override // ax.w.b.e
        c<K, V> e(c<K, V> cVar) {
            return cVar.e0;
        }
    }

    static class c<K, V> implements Map.Entry<K, V> {
        final V c0;
        c<K, V> d0;
        c<K, V> e0;
        final K q;

        c(K k, V v) {
            this.q = k;
            this.c0 = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.q.equals(cVar.q) && this.c0.equals(cVar.c0);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.q;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.c0;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.q.hashCode() ^ this.c0.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.q + "=" + this.c0;
        }
    }

    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {
        private boolean c0 = true;
        private c<K, V> q;

        d() {
        }

        @Override // ax.w.b.f
        void b(c<K, V> cVar) {
            c<K, V> cVar2 = this.q;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.e0;
                this.q = cVar3;
                this.c0 = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.c0) {
                this.c0 = false;
                this.q = b.this.q;
            } else {
                c<K, V> cVar = this.q;
                this.q = cVar != null ? cVar.d0 : null;
            }
            return this.q;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.c0) {
                return b.this.q != null;
            }
            c<K, V> cVar = this.q;
            return (cVar == null || cVar.d0 == null) ? false : true;
        }
    }

    private static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {
        c<K, V> c0;
        c<K, V> q;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.q = cVar2;
            this.c0 = cVar;
        }

        private c<K, V> g() {
            c<K, V> cVar = this.c0;
            c<K, V> cVar2 = this.q;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return e(cVar);
        }

        @Override // ax.w.b.f
        public void b(c<K, V> cVar) {
            if (this.q == cVar && cVar == this.c0) {
                this.c0 = null;
                this.q = null;
            }
            c<K, V> cVar2 = this.q;
            if (cVar2 == cVar) {
                this.q = c(cVar2);
            }
            if (this.c0 == cVar) {
                this.c0 = g();
            }
        }

        abstract c<K, V> c(c<K, V> cVar);

        abstract c<K, V> e(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.c0;
            this.c0 = g();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c0 != null;
        }
    }

    public static abstract class f<K, V> {
        abstract void b(c<K, V> cVar);
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0482b c0482b = new C0482b(this.c0, this.q);
        this.d0.put(c0482b, Boolean.FALSE);
        return c0482b;
    }

    public Map.Entry<K, V> e() {
        return this.q;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    protected c<K, V> g(K k) {
        c<K, V> cVar = this.q;
        while (cVar != null && !cVar.q.equals(k)) {
            cVar = cVar.d0;
        }
        return cVar;
    }

    public b<K, V>.d h() {
        b<K, V>.d dVar = new d();
        this.d0.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    public Map.Entry<K, V> i() {
        return this.c0;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.q, this.c0);
        this.d0.put(aVar, Boolean.FALSE);
        return aVar;
    }

    c<K, V> k(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.e0++;
        c<K, V> cVar2 = this.c0;
        if (cVar2 == null) {
            this.q = cVar;
            this.c0 = cVar;
            return cVar;
        }
        cVar2.d0 = cVar;
        cVar.e0 = cVar2;
        this.c0 = cVar;
        return cVar;
    }

    public V l(K k, V v) {
        c<K, V> g = g(k);
        if (g != null) {
            return g.c0;
        }
        k(k, v);
        return null;
    }

    public V n(K k) {
        c<K, V> g = g(k);
        if (g == null) {
            return null;
        }
        this.e0--;
        if (!this.d0.isEmpty()) {
            Iterator<f<K, V>> it = this.d0.keySet().iterator();
            while (it.hasNext()) {
                it.next().b(g);
            }
        }
        c<K, V> cVar = g.e0;
        if (cVar != null) {
            cVar.d0 = g.d0;
        } else {
            this.q = g.d0;
        }
        c<K, V> cVar2 = g.d0;
        if (cVar2 != null) {
            cVar2.e0 = cVar;
        } else {
            this.c0 = cVar;
        }
        g.d0 = null;
        g.e0 = null;
        return g.c0;
    }

    public int size() {
        return this.e0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
