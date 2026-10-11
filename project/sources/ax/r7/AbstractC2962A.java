package ax.r7;

import ax.r7.AbstractC2989x;
import j$.util.Map;
import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: ax.r7.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2962A<K, V> implements Map<K, V>, Serializable, j$.util.Map {
    static final Map.Entry<?, ?>[] e0 = new Map.Entry[0];
    private transient AbstractC2964C<K> c0;
    private transient AbstractC2989x<V> d0;
    private transient AbstractC2964C<Map.Entry<K, V>> q;

    /* renamed from: ax.r7.A$a */
    public static class a<K, V> {
        Comparator<? super V> a;
        Object[] b;
        int c;
        boolean d;
        C0437a e;

        /* renamed from: ax.r7.A$a$a, reason: collision with other inner class name */
        static final class C0437a {
            private final Object a;
            private final Object b;
            private final Object c;

            C0437a(Object obj, Object obj2, Object obj3) {
                this.a = obj;
                this.b = obj2;
                this.c = obj3;
            }

            IllegalArgumentException a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.a + "=" + this.b + " and " + this.a + "=" + this.c);
            }
        }

        public a() {
            this(4);
        }

        private AbstractC2962A<K, V> b(boolean z) {
            Object[] objArr;
            C0437a c0437a;
            C0437a c0437a2;
            if (z && (c0437a2 = this.e) != null) {
                throw c0437a2.a();
            }
            int i = this.c;
            if (this.a == null) {
                objArr = this.b;
            } else {
                if (this.d) {
                    this.b = Arrays.copyOf(this.b, i * 2);
                }
                objArr = this.b;
                if (!z) {
                    objArr = e(objArr, this.c);
                    if (objArr.length < this.b.length) {
                        i = objArr.length >>> 1;
                    }
                }
                i(objArr, i, this.a);
            }
            this.d = true;
            W m = W.m(i, objArr, this);
            if (!z || (c0437a = this.e) == null) {
                return m;
            }
            throw c0437a.a();
        }

        private void d(int i) {
            int i2 = i * 2;
            Object[] objArr = this.b;
            if (i2 > objArr.length) {
                this.b = Arrays.copyOf(objArr, AbstractC2989x.b.c(objArr.length, i2));
                this.d = false;
            }
        }

        private Object[] e(Object[] objArr, int i) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                Object obj = objArr[i2 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i2);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i - bitSet.cardinality()) * 2];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i * 2) {
                if (bitSet.get(i3 >>> 1)) {
                    i3 += 2;
                } else {
                    int i5 = i4 + 1;
                    int i6 = i3 + 1;
                    Object obj2 = objArr[i3];
                    Objects.requireNonNull(obj2);
                    objArr2[i4] = obj2;
                    i4 += 2;
                    i3 += 2;
                    Object obj3 = objArr[i6];
                    Objects.requireNonNull(obj3);
                    objArr2[i5] = obj3;
                }
            }
            return objArr2;
        }

        static <V> void i(Object[] objArr, int i, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i];
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 2;
                Object obj = objArr[i3];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i3 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i2] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i, T.b(comparator).f(K.k()));
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = i4 * 2;
                objArr[i5] = entryArr[i4].getKey();
                objArr[i5 + 1] = entryArr[i4].getValue();
            }
        }

        public AbstractC2962A<K, V> a() {
            return c();
        }

        public AbstractC2962A<K, V> c() {
            return b(true);
        }

        public a<K, V> f(K k, V v) {
            d(this.c + 1);
            C2975i.a(k, v);
            Object[] objArr = this.b;
            int i = this.c;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.c = i + 1;
            return this;
        }

        public a<K, V> g(Map.Entry<? extends K, ? extends V> entry) {
            return f(entry.getKey(), entry.getValue());
        }

        public a<K, V> h(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                d(this.c + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                g(it.next());
            }
            return this;
        }

        a(int i) {
            this.b = new Object[i * 2];
            this.c = 0;
            this.d = false;
        }
    }

    AbstractC2962A() {
    }

    public static <K, V> a<K, V> a() {
        return new a<>();
    }

    public static <K, V> AbstractC2962A<K, V> b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.h(iterable);
        return aVar.a();
    }

    public static <K, V> AbstractC2962A<K, V> c(Map<? extends K, ? extends V> map) {
        if ((map instanceof AbstractC2962A) && !(map instanceof SortedMap)) {
            AbstractC2962A<K, V> abstractC2962A = (AbstractC2962A) map;
            if (!abstractC2962A.i()) {
                return abstractC2962A;
            }
        }
        return b(map.entrySet());
    }

    public static <K, V> AbstractC2962A<K, V> k() {
        return (AbstractC2962A<K, V>) W.i0;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract AbstractC2964C<Map.Entry<K, V>> d();

    abstract AbstractC2964C<K> e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return K.c(this, obj);
    }

    abstract AbstractC2989x<V> f();

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC2964C<Map.Entry<K, V>> entrySet() {
        AbstractC2964C<Map.Entry<K, V>> abstractC2964C = this.q;
        if (abstractC2964C != null) {
            return abstractC2964C;
        }
        AbstractC2964C<Map.Entry<K, V>> d = d();
        this.q = d;
        return d;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public int hashCode() {
        return d0.d(entrySet());
    }

    abstract boolean i();

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC2964C<K> keySet() {
        AbstractC2964C<K> abstractC2964C = this.c0;
        if (abstractC2964C != null) {
            return abstractC2964C;
        }
        AbstractC2964C<K> e = e();
        this.c0 = e;
        return e;
    }

    @Override // java.util.Map
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC2989x<V> values() {
        AbstractC2989x<V> abstractC2989x = this.d0;
        if (abstractC2989x != null) {
            return abstractC2989x;
        }
        AbstractC2989x<V> f = f();
        this.d0 = f;
        return f;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public String toString() {
        return K.j(this);
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
