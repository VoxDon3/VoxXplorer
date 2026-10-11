/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.r7.C;
import ax.r7.K;
import ax.r7.T;
import ax.r7.W;
import ax.r7.d0;
import ax.r7.i;
import ax.r7.x;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class A<K, V>
implements Map<K, V>,
Serializable,
j.Map {
    static final Map.Entry<?, ?>[] e0 = new Map.Entry[0];
    private transient C<K> c0;
    private transient x<V> d0;
    private transient C<Map.Entry<K, V>> q;

    A() {
    }

    public static <K, V> a<K, V> a() {
        return new a();
    }

    public static <K, V> A<K, V> b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        int n8 = iterable instanceof Collection ? ((Collection)iterable).size() : 4;
        a a8 = new a(n8);
        a8.h(iterable);
        return a8.a();
    }

    public static <K, V> A<K, V> c(Map<? extends K, ? extends V> map) {
        A a8;
        if (map instanceof A && !(map instanceof SortedMap) && !(a8 = (A)map).i()) {
            return a8;
        }
        return A.b(map.entrySet());
    }

    public static <K, V> A<K, V> k() {
        return W.i0;
    }

    @Override
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ Object compute(Object object, BiFunction biFunction) {
        return j.Map._CC.$default$compute((Map)this, (Object)object, (BiFunction)biFunction);
    }

    @Override
    public /* synthetic */ Object computeIfAbsent(Object object, Function function) {
        return j.Map._CC.$default$computeIfAbsent((Map)this, (Object)object, (Function)function);
    }

    @Override
    public /* synthetic */ Object computeIfPresent(Object object, BiFunction biFunction) {
        return j.Map._CC.$default$computeIfPresent((Map)this, (Object)object, (BiFunction)biFunction);
    }

    @Override
    public boolean containsKey(Object object) {
        return this.get(object) != null;
    }

    @Override
    public boolean containsValue(Object object) {
        return this.l().contains(object);
    }

    abstract C<Map.Entry<K, V>> d();

    abstract C<K> e();

    @Override
    public boolean equals(Object object) {
        return K.c(this, object);
    }

    abstract x<V> f();

    @Override
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        j.Map._CC.$default$forEach((Map)this, (BiConsumer)biConsumer);
    }

    public C<Map.Entry<K, V>> g() {
        C<Map.Entry<K, V>> c8;
        C<Map.Entry<K, V>> c9 = c8 = this.q;
        if (c8 == null) {
            this.q = c9 = this.d();
        }
        return c9;
    }

    @Override
    public abstract V get(Object var1);

    @Override
    public final V getOrDefault(Object object, V v8) {
        if ((object = this.get(object)) != null) {
            return (V)object;
        }
        return v8;
    }

    @Override
    public int hashCode() {
        return ax.r7.d0.d(this.g());
    }

    abstract boolean i();

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    public C<K> j() {
        C<K> c8;
        C<K> c9 = c8 = this.c0;
        if (c8 == null) {
            this.c0 = c9 = this.e();
        }
        return c9;
    }

    public x<V> l() {
        x<V> x8;
        x<V> x9 = x8 = this.d0;
        if (x8 == null) {
            this.d0 = x9 = this.f();
        }
        return x9;
    }

    @Override
    public /* synthetic */ Object merge(Object object, Object object2, BiFunction biFunction) {
        return j.Map._CC.$default$merge((Map)this, (Object)object, (Object)object2, (BiFunction)biFunction);
    }

    @Override
    @Deprecated
    public final V put(K k8, V v8) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ Object putIfAbsent(Object object, Object object2) {
        return j.Map._CC.$default$putIfAbsent((Map)this, (Object)object, (Object)object2);
    }

    @Override
    @Deprecated
    public final V remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ boolean remove(Object object, Object object2) {
        return j.Map._CC.$default$remove((Map)this, (Object)object, (Object)object2);
    }

    @Override
    public /* synthetic */ Object replace(Object object, Object object2) {
        return j.Map._CC.$default$replace((Map)this, (Object)object, (Object)object2);
    }

    @Override
    public /* synthetic */ boolean replace(Object object, Object object2, Object object3) {
        return j.Map._CC.$default$replace((Map)this, (Object)object, (Object)object2, (Object)object3);
    }

    @Override
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        j.Map._CC.$default$replaceAll((Map)this, (BiFunction)biFunction);
    }

    public String toString() {
        return K.j(this);
    }

    public static class ax.r7.A$a<K, V> {
        Comparator<? super V> a;
        Object[] b;
        int c;
        boolean d;
        a e;

        public ax.r7.A$a() {
            this(4);
        }

        ax.r7.A$a(int n8) {
            this.b = new Object[n8 * 2];
            this.c = 0;
            this.d = false;
        }

        private A<K, V> b(boolean bl) {
            Object object;
            int n8;
            Object object2;
            if (bl && (object2 = this.e) != null) {
                throw object2.a();
            }
            int n9 = this.c;
            if (this.a == null) {
                object2 = this.b;
                n8 = n9;
            } else {
                if (this.d) {
                    this.b = Arrays.copyOf(this.b, n9 * 2);
                }
                object = this.b;
                n8 = n9;
                object2 = object;
                if (!bl) {
                    object = this.e((Object[])object, this.c);
                    n8 = n9;
                    object2 = object;
                    if (((Object)object).length < this.b.length) {
                        n8 = ((Object)object).length >>> 1;
                        object2 = object;
                    }
                }
                ax.r7.A$a.i(object2, n8, this.a);
            }
            this.d = true;
            object2 = W.m(n8, object2, this);
            if (bl && (object = this.e) != null) {
                throw ((a)object).a();
            }
            return object2;
        }

        private void d(int n8) {
            Object[] objectArray = this.b;
            if ((n8 *= 2) > objectArray.length) {
                this.b = Arrays.copyOf(objectArray, x.b.c(objectArray.length, n8));
                this.d = false;
            }
        }

        private Object[] e(Object[] objectArray, int n8) {
            int n9;
            Object object;
            int n10;
            Object[] objectArray2 = new HashSet();
            BitSet bitSet = new BitSet();
            for (n10 = n8 - 1; n10 >= 0; --n10) {
                object = objectArray[n10 * 2];
                j.Objects.requireNonNull((Object)object);
                if (objectArray2.add(object)) continue;
                bitSet.set(n10);
            }
            if (bitSet.isEmpty()) {
                return objectArray;
            }
            objectArray2 = new Object[(n8 - bitSet.cardinality()) * 2];
            n10 = 0;
            int n11 = 0;
            while ((n9 = n10) < n8 * 2) {
                if (bitSet.get(n9 >>> 1)) {
                    n10 = n9 + 2;
                    continue;
                }
                object = objectArray[n9];
                j.Objects.requireNonNull((Object)object);
                objectArray2[n11] = object;
                int n12 = n11 + 2;
                n10 = n9 + 2;
                object = objectArray[n9 + 1];
                j.Objects.requireNonNull((Object)object);
                objectArray2[n11 + 1] = object;
                n11 = n12;
            }
            return objectArray2;
        }

        static <V> void i(Object[] objectArray, int n8, Comparator<? super V> comparator) {
            int n9;
            Map.Entry[] entryArray = new Map.Entry[n8];
            int n10 = 0;
            for (n9 = 0; n9 < n8; ++n9) {
                int n11 = n9 * 2;
                Object object = objectArray[n11];
                j.Objects.requireNonNull((Object)object);
                Object object2 = objectArray[n11 + 1];
                j.Objects.requireNonNull((Object)object2);
                entryArray[n9] = new AbstractMap.SimpleImmutableEntry<Object, Object>(object, object2);
            }
            Arrays.sort(entryArray, 0, n8, T.b(comparator).f(K.k()));
            for (n9 = n10; n9 < n8; ++n9) {
                n10 = n9 * 2;
                objectArray[n10] = entryArray[n9].getKey();
                objectArray[n10 + 1] = entryArray[n9].getValue();
            }
        }

        public A<K, V> a() {
            return this.c();
        }

        public A<K, V> c() {
            return this.b(true);
        }

        public ax.r7.A$a<K, V> f(K k8, V v8) {
            this.d(this.c + 1);
            i.a(k8, v8);
            Object[] objectArray = this.b;
            int n8 = this.c;
            objectArray[n8 * 2] = k8;
            objectArray[n8 * 2 + 1] = v8;
            this.c = n8 + 1;
            return this;
        }

        public ax.r7.A$a<K, V> g(Map.Entry<? extends K, ? extends V> entry) {
            return this.f(entry.getKey(), entry.getValue());
        }

        public ax.r7.A$a<K, V> h(Iterable<? extends Map.Entry<? extends K, ? extends V>> object) {
            if (object instanceof Collection) {
                this.d(this.c + ((Collection)object).size());
            }
            object = object.iterator();
            while (object.hasNext()) {
                this.g((Map.Entry)object.next());
            }
            return this;
        }

        static final class a {
            private final Object a;
            private final Object b;
            private final Object c;

            a(Object object, Object object2, Object object3) {
                this.a = object;
                this.b = object2;
                this.c = object3;
            }

            IllegalArgumentException a() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Multiple entries with same key: ");
                stringBuilder.append(this.a);
                stringBuilder.append("=");
                stringBuilder.append(this.b);
                stringBuilder.append(" and ");
                stringBuilder.append(this.a);
                stringBuilder.append("=");
                stringBuilder.append(this.c);
                return new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }
}

