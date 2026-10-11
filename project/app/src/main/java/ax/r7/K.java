/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.n;
import ax.r7.G;
import ax.r7.J;
import ax.r7.d0;
import ax.r7.h0;
import ax.r7.i;
import ax.r7.j;
import ax.r7.y;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class K {
    static int a(int n8) {
        if (n8 < 3) {
            i.b(n8, "expectedSize");
            return n8 + 1;
        }
        if (n8 < 0x40000000) {
            return (int)Math.ceil((double)n8 / 0.75);
        }
        return Integer.MAX_VALUE;
    }

    static boolean b(Map<?, ?> map, Object object) {
        return G.e(K.l(map.entrySet().iterator()), object);
    }

    static boolean c(Map<?, ?> map, Object object) {
        if (map == object) {
            return true;
        }
        if (object instanceof Map) {
            object = (Map)object;
            return map.entrySet().equals(object.entrySet());
        }
        return false;
    }

    public static <K, V> Map.Entry<K, V> d(K k8, V v8) {
        return new y<K, V>(k8, v8);
    }

    static <K> ax.q7.f<Map.Entry<K, ?>, K> e() {
        return b.q;
    }

    public static <K, V> IdentityHashMap<K, V> f() {
        return new IdentityHashMap();
    }

    static boolean g(Map<?, ?> map, Object object) {
        n.n(map);
        try {
            boolean bl = map.containsKey(object);
            return bl;
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            return false;
        }
    }

    static <V> V h(Map<?, V> map, Object object) {
        n.n(map);
        try {
            map = map.get(object);
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            return null;
        }
        return (V)map;
    }

    static <V> V i(Map<?, V> map, Object object) {
        n.n(map);
        try {
            map = map.remove(object);
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            return null;
        }
        return (V)map;
    }

    static String j(Map<?, ?> object) {
        StringBuilder stringBuilder = j.b(object.size());
        stringBuilder.append('{');
        Iterator<Map.Entry<?, ?>> iterator = object.entrySet().iterator();
        boolean bl = true;
        while (iterator.hasNext()) {
            object = iterator.next();
            if (!bl) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(object.getKey());
            stringBuilder.append('=');
            stringBuilder.append(object.getValue());
            bl = false;
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    static <V> ax.q7.f<Map.Entry<?, V>, V> k() {
        return b.c0;
    }

    static <K, V> Iterator<V> l(Iterator<Map.Entry<K, V>> iterator) {
        return new h0<Map.Entry<K, V>, V>(iterator){

            V c(Map.Entry<K, V> entry) {
                return entry.getValue();
            }
        };
    }

    private static abstract class b
    extends Enum<b>
    implements ax.q7.f<Map.Entry<?, ?>, Object> {
        public static final /* enum */ b c0;
        private static final b[] d0;
        public static final /* enum */ b q;

        static {
            q = new b(){

                public Object h(Map.Entry<?, ?> entry) {
                    return entry.getKey();
                }
            };
            c0 = new b(){

                public Object h(Map.Entry<?, ?> entry) {
                    return entry.getValue();
                }
            };
            d0 = b.d();
        }

        private b() {
        }

        /* synthetic */ b(String string, int n8, J j8) {
            this();
        }

        private static /* synthetic */ b[] d() {
            return new b[]{q, c0};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])d0.clone();
        }
    }

    static abstract class c<K, V>
    extends d0.d<Map.Entry<K, V>> {
        c() {
        }

        @Override
        public void clear() {
            this.e().clear();
        }

        @Override
        public abstract boolean contains(Object var1);

        abstract Map<K, V> e();

        @Override
        public boolean isEmpty() {
            return this.e().isEmpty();
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            try {
                boolean bl = super.removeAll(n.n(collection));
                return bl;
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                return d0.j(this, collection.iterator());
            }
        }

        @Override
        public boolean retainAll(Collection<?> collection2) {
            try {
                boolean bl = super.retainAll(n.n(collection2));
                return bl;
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                HashSet hashSet = d0.g(collection2.size());
                for (Collection<?> collection2 : collection2) {
                    if (!this.contains(collection2) || !(collection2 instanceof Map.Entry)) continue;
                    hashSet.add(((Map.Entry)((Object)collection2)).getKey());
                }
                return this.e().keySet().retainAll(hashSet);
            }
        }

        @Override
        public int size() {
            return this.e().size();
        }
    }

    static class d<K, V>
    extends d0.d<K> {
        final Map<K, V> q;

        d(Map<K, V> map) {
            this.q = n.n(map);
        }

        @Override
        public boolean contains(Object object) {
            return this.e().containsKey(object);
        }

        Map<K, V> e() {
            return this.q;
        }

        @Override
        public boolean isEmpty() {
            return this.e().isEmpty();
        }

        @Override
        public int size() {
            return this.e().size();
        }
    }

    static class e<K, V>
    extends AbstractCollection<V> {
        final Map<K, V> q;

        e(Map<K, V> map) {
            this.q = n.n(map);
        }

        @Override
        public void clear() {
            this.e().clear();
        }

        @Override
        public boolean contains(Object object) {
            return this.e().containsValue(object);
        }

        final Map<K, V> e() {
            return this.q;
        }

        @Override
        public boolean isEmpty() {
            return this.e().isEmpty();
        }

        @Override
        public Iterator<V> iterator() {
            return K.l(this.e().entrySet().iterator());
        }

        @Override
        public boolean remove(Object object) {
            try {
                boolean bl = super.remove(object);
                return bl;
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                for (Map.Entry<K, V> entry : this.e().entrySet()) {
                    if (!ax.q7.j.a(object, entry.getValue())) continue;
                    this.e().remove(entry.getKey());
                    return true;
                }
                return false;
            }
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            try {
                boolean bl = super.removeAll(n.n(collection));
                return bl;
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                HashSet<K> hashSet = d0.f();
                for (Map.Entry<K, V> entry : this.e().entrySet()) {
                    if (!collection.contains(entry.getValue())) continue;
                    hashSet.add(entry.getKey());
                }
                return this.e().keySet().removeAll(hashSet);
            }
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            try {
                boolean bl = super.retainAll(n.n(collection));
                return bl;
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                HashSet<K> hashSet = d0.f();
                for (Map.Entry<K, V> entry : this.e().entrySet()) {
                    if (!collection.contains(entry.getValue())) continue;
                    hashSet.add(entry.getKey());
                }
                return this.e().keySet().retainAll(hashSet);
            }
        }

        @Override
        public int size() {
            return this.e().size();
        }
    }

    static abstract class f<K, V>
    extends AbstractMap<K, V> {
        private transient Collection<V> c0;
        private transient Set<Map.Entry<K, V>> q;

        f() {
        }

        abstract Set<Map.Entry<K, V>> a();

        Collection<V> b() {
            return new e(this);
        }

        @Override
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set;
            Set<Map.Entry<K, V>> set2 = set = this.q;
            if (set == null) {
                this.q = set2 = this.a();
            }
            return set2;
        }

        @Override
        public Collection<V> values() {
            Collection<V> collection;
            Collection<V> collection2 = collection = this.c0;
            if (collection == null) {
                this.c0 = collection2 = this.b();
            }
            return collection2;
        }
    }
}

