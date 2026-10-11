package ax.r7;

import ax.r7.AbstractC2989x;
import j$.util.Objects;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: ax.r7.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2963B<K, V> extends AbstractC2973g<K, V> implements Serializable {
    final transient AbstractC2962A<K, ? extends AbstractC2989x<V>> f0;
    final transient int g0;

    /* renamed from: ax.r7.B$a */
    class a extends j0<Map.Entry<K, V>> {
        K c0 = null;
        Iterator<V> d0 = G.g();
        final Iterator<? extends Map.Entry<K, ? extends AbstractC2989x<V>>> q;

        a() {
            this.q = AbstractC2963B.this.f0.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!this.d0.hasNext()) {
                Map.Entry<K, ? extends AbstractC2989x<V>> next = this.q.next();
                this.c0 = next.getKey();
                this.d0 = next.getValue().iterator();
            }
            K k = this.c0;
            Objects.requireNonNull(k);
            return K.d(k, this.d0.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.d0.hasNext() || this.q.hasNext();
        }
    }

    /* renamed from: ax.r7.B$b */
    class b extends j0<V> {
        Iterator<V> c0 = G.g();
        Iterator<? extends AbstractC2989x<V>> q;

        b() {
            this.q = AbstractC2963B.this.f0.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c0.hasNext() || this.q.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.c0.hasNext()) {
                this.c0 = this.q.next().iterator();
            }
            return this.c0.next();
        }
    }

    /* renamed from: ax.r7.B$c */
    public static class c<K, V> {
        Map<K, AbstractC2989x.b<V>> a;
        Comparator<? super K> b;
        Comparator<? super V> c;
        int d = 4;
    }

    /* renamed from: ax.r7.B$d */
    private static class d<K, V> extends AbstractC2989x<Map.Entry<K, V>> {
        final AbstractC2963B<K, V> c0;

        d(AbstractC2963B<K, V> abstractC2963B) {
            this.c0 = abstractC2963B;
        }

        @Override // ax.r7.AbstractC2989x, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.c0.c(entry.getKey(), entry.getValue());
        }

        @Override // ax.r7.AbstractC2989x, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: n */
        public j0<Map.Entry<K, V>> iterator() {
            return this.c0.i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.c0.size();
        }
    }

    /* renamed from: ax.r7.B$e */
    private static final class e<K, V> extends AbstractC2989x<V> {
        private final transient AbstractC2963B<K, V> c0;

        e(AbstractC2963B<K, V> abstractC2963B) {
            this.c0 = abstractC2963B;
        }

        @Override // ax.r7.AbstractC2989x, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.c0.d(obj);
        }

        @Override // ax.r7.AbstractC2989x
        int g(Object[] objArr, int i) {
            j0<? extends AbstractC2989x<V>> it = this.c0.f0.values().iterator();
            while (it.hasNext()) {
                i = it.next().g(objArr, i);
            }
            return i;
        }

        @Override // ax.r7.AbstractC2989x, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: n */
        public j0<V> iterator() {
            return this.c0.k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.c0.size();
        }
    }

    AbstractC2963B(AbstractC2962A<K, ? extends AbstractC2989x<V>> abstractC2962A, int i) {
        this.f0 = abstractC2962A;
        this.g0 = i;
    }

    @Override // ax.r7.AbstractC2972f, ax.r7.L
    public /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return super.c(obj, obj2);
    }

    @Override // ax.r7.L
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // ax.r7.AbstractC2972f
    public boolean d(Object obj) {
        return obj != null && super.d(obj);
    }

    @Override // ax.r7.AbstractC2972f
    Map<K, Collection<V>> e() {
        throw new AssertionError("should never be called");
    }

    @Override // ax.r7.AbstractC2972f
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // ax.r7.AbstractC2972f
    Set<K> g() {
        throw new AssertionError("unreachable");
    }

    @Override // ax.r7.AbstractC2972f
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // ax.r7.AbstractC2972f, ax.r7.L
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC2962A<K, Collection<V>> b() {
        return this.f0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ax.r7.AbstractC2972f
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC2989x<Map.Entry<K, V>> f() {
        return new d(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ax.r7.AbstractC2972f
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public AbstractC2989x<V> h() {
        return new e(this);
    }

    @Override // ax.r7.AbstractC2972f, ax.r7.L
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC2989x<Map.Entry<K, V>> a() {
        return (AbstractC2989x) super.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ax.r7.AbstractC2972f
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public j0<Map.Entry<K, V>> i() {
        return new a();
    }

    @Override // ax.r7.L
    @Deprecated
    public final boolean put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // ax.r7.L
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC2989x<V> get(K k);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ax.r7.AbstractC2972f
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public j0<V> k() {
        return new b();
    }

    @Override // ax.r7.AbstractC2972f, ax.r7.L
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // ax.r7.AbstractC2972f, ax.r7.L
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public AbstractC2989x<V> values() {
        return (AbstractC2989x) super.values();
    }

    @Override // ax.r7.L
    public int size() {
        return this.g0;
    }

    @Override // ax.r7.AbstractC2972f
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
