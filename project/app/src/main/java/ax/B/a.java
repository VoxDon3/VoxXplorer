/*
 * Decompiled with CFR 0.152.
 */
package ax.B;

import ax.B.g;
import ax.B.k;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class a<K, V>
extends k<K, V>
implements Map<K, V>,
j.Map {
    a e0;
    c f0;
    e g0;

    public a() {
    }

    public a(int n8) {
        super(n8);
    }

    public a(k k8) {
        super(k8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static <T> boolean m(Set<T> set, Object object) {
        if (set == object) {
            return true;
        }
        if (!(object instanceof Set)) return false;
        object = (Set)object;
        try {
            if (set.size() != object.size()) return false;
            boolean bl = set.containsAll((Collection<?>)object);
            if (!bl) return false;
            return true;
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            return false;
        }
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
        return super.containsKey(object);
    }

    @Override
    public boolean containsValue(Object object) {
        return super.containsValue(object);
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        a a8;
        a a9 = a8 = this.e0;
        if (a8 == null) {
            this.e0 = a9 = new a(this);
        }
        return a9;
    }

    @Override
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        j.Map._CC.$default$forEach((Map)this, (BiConsumer)biConsumer);
    }

    @Override
    public V get(Object object) {
        return super.get(object);
    }

    @Override
    public Set<K> keySet() {
        c c8;
        c c9 = c8 = this.f0;
        if (c8 == null) {
            this.f0 = c9 = new c(this);
        }
        return c9;
    }

    public boolean l(Collection<?> object) {
        object = object.iterator();
        while (object.hasNext()) {
            if (this.containsKey(object.next())) continue;
            return false;
        }
        return true;
    }

    @Override
    public /* synthetic */ Object merge(Object object, Object object2, BiFunction biFunction) {
        return j.Map._CC.$default$merge((Map)this, (Object)object, (Object)object2, (BiFunction)biFunction);
    }

    public boolean n(Collection<?> object) {
        int n8 = this.size();
        object = object.iterator();
        while (object.hasNext()) {
            this.remove(object.next());
        }
        return n8 != this.size();
    }

    public boolean o(Collection<?> collection) {
        int n8 = this.size();
        for (int i8 = this.size() - 1; i8 >= 0; --i8) {
            if (collection.contains(this.f(i8))) continue;
            this.i(i8);
        }
        return n8 != this.size();
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> object2) {
        this.b(this.size() + object2.size());
        for (Map.Entry entry : object2.entrySet()) {
            this.put(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public V remove(Object object) {
        return super.remove(object);
    }

    @Override
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        j.Map._CC.$default$replaceAll((Map)this, (BiFunction)biFunction);
    }

    @Override
    public Collection<V> values() {
        e e8;
        e e9 = e8 = this.g0;
        if (e8 == null) {
            this.g0 = e9 = new e(this);
        }
        return e9;
    }

    final class a
    extends AbstractSet<Map.Entry<K, V>> {
        final a q;

        a(a a8) {
            this.q = a8;
        }

        @Override
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d(this.q);
        }

        @Override
        public int size() {
            return this.q.size();
        }
    }

    final class b
    extends g<K> {
        final a e0;

        b(a a8) {
            this.e0 = a8;
            super(a8.size());
        }

        @Override
        protected K b(int n8) {
            return this.e0.f(n8);
        }

        @Override
        protected void c(int n8) {
            this.e0.i(n8);
        }
    }

    final class c
    implements Set<K> {
        final a q;

        c(a a8) {
            this.q = a8;
        }

        @Override
        public boolean add(K k8) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
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
        public boolean containsAll(Collection<?> collection) {
            return this.q.l(collection);
        }

        @Override
        public boolean equals(Object object) {
            return a.m(this, object);
        }

        @Override
        public int hashCode() {
            int n8 = 0;
            for (int i8 = this.q.size() - 1; i8 >= 0; --i8) {
                Object k8 = this.q.f(i8);
                int n9 = k8 == null ? 0 : k8.hashCode();
                n8 += n9;
            }
            return n8;
        }

        @Override
        public boolean isEmpty() {
            return this.q.isEmpty();
        }

        @Override
        public Iterator<K> iterator() {
            return new b(this.q);
        }

        @Override
        public boolean remove(Object object) {
            int n8 = this.q.d(object);
            if (n8 >= 0) {
                this.q.i(n8);
                return true;
            }
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            return this.q.n(collection);
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            return this.q.o(collection);
        }

        @Override
        public int size() {
            return this.q.size();
        }

        @Override
        public Object[] toArray() {
            int n8 = this.q.size();
            Object[] objectArray = new Object[n8];
            for (int i8 = 0; i8 < n8; ++i8) {
                objectArray[i8] = this.q.f(i8);
            }
            return objectArray;
        }

        @Override
        public <T> T[] toArray(T[] TArray) {
            int n8 = this.size();
            Object[] objectArray = TArray;
            if (TArray.length < n8) {
                objectArray = (Object[])Array.newInstance(TArray.getClass().getComponentType(), n8);
            }
            for (int i8 = 0; i8 < n8; ++i8) {
                objectArray[i8] = this.q.f(i8);
            }
            if (objectArray.length > n8) {
                objectArray[n8] = null;
            }
            return objectArray;
        }
    }

    final class d
    implements Iterator<Map.Entry<K, V>>,
    Map.Entry<K, V> {
        int c0;
        boolean d0;
        final a e0;
        int q;

        d(a a8) {
            this.e0 = a8;
            this.q = a8.size() - 1;
            this.c0 = -1;
        }

        public Map.Entry<K, V> b() {
            if (this.hasNext()) {
                ++this.c0;
                this.d0 = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override
        public boolean equals(Object object) {
            if (this.d0) {
                if (!(object instanceof Map.Entry)) {
                    return false;
                }
                return ax.C.a.c((object = (Map.Entry)object).getKey(), this.e0.f(this.c0)) && ax.C.a.c(object.getValue(), this.e0.k(this.c0));
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override
        public K getKey() {
            if (this.d0) {
                return this.e0.f(this.c0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override
        public V getValue() {
            if (this.d0) {
                return this.e0.k(this.c0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override
        public boolean hasNext() {
            return this.c0 < this.q;
        }

        @Override
        public int hashCode() {
            if (this.d0) {
                Object k8 = this.e0.f(this.c0);
                Object v8 = this.e0.k(this.c0);
                int n8 = 0;
                int n9 = k8 == null ? 0 : k8.hashCode();
                if (v8 != null) {
                    n8 = v8.hashCode();
                }
                return n9 ^ n8;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override
        public void remove() {
            if (this.d0) {
                this.e0.i(this.c0);
                --this.c0;
                --this.q;
                this.d0 = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override
        public V setValue(V v8) {
            if (this.d0) {
                return this.e0.j(this.c0, v8);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.getKey());
            stringBuilder.append("=");
            stringBuilder.append(this.getValue());
            return stringBuilder.toString();
        }
    }

    final class e
    implements Collection<V> {
        final a q;

        e(a a8) {
            this.q = a8;
        }

        @Override
        public boolean add(V v8) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void clear() {
            this.q.clear();
        }

        @Override
        public boolean contains(Object object) {
            return this.q.a(object) >= 0;
        }

        @Override
        public boolean containsAll(Collection<?> object) {
            object = object.iterator();
            while (object.hasNext()) {
                if (this.contains(object.next())) continue;
                return false;
            }
            return true;
        }

        @Override
        public boolean isEmpty() {
            return this.q.isEmpty();
        }

        @Override
        public Iterator<V> iterator() {
            return new f(this.q);
        }

        @Override
        public boolean remove(Object object) {
            int n8 = this.q.a(object);
            if (n8 >= 0) {
                this.q.i(n8);
                return true;
            }
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            int n8 = this.q.size();
            int n9 = 0;
            boolean bl = false;
            while (n9 < n8) {
                int n10 = n8;
                int n11 = n9;
                if (collection.contains(this.q.k(n9))) {
                    this.q.i(n9);
                    n11 = n9 - 1;
                    n10 = n8 - 1;
                    bl = true;
                }
                n9 = n11 + 1;
                n8 = n10;
            }
            return bl;
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            int n8 = this.q.size();
            int n9 = 0;
            boolean bl = false;
            while (n9 < n8) {
                int n10 = n8;
                int n11 = n9;
                if (!collection.contains(this.q.k(n9))) {
                    this.q.i(n9);
                    n11 = n9 - 1;
                    n10 = n8 - 1;
                    bl = true;
                }
                n9 = n11 + 1;
                n8 = n10;
            }
            return bl;
        }

        @Override
        public int size() {
            return this.q.size();
        }

        @Override
        public Object[] toArray() {
            int n8 = this.q.size();
            Object[] objectArray = new Object[n8];
            for (int i8 = 0; i8 < n8; ++i8) {
                objectArray[i8] = this.q.k(i8);
            }
            return objectArray;
        }

        @Override
        public <T> T[] toArray(T[] TArray) {
            int n8 = this.size();
            Object[] objectArray = TArray;
            if (TArray.length < n8) {
                objectArray = (Object[])Array.newInstance(TArray.getClass().getComponentType(), n8);
            }
            for (int i8 = 0; i8 < n8; ++i8) {
                objectArray[i8] = this.q.k(i8);
            }
            if (objectArray.length > n8) {
                objectArray[n8] = null;
            }
            return objectArray;
        }
    }

    final class f
    extends g<V> {
        final a e0;

        f(a a8) {
            this.e0 = a8;
            super(a8.size());
        }

        @Override
        protected V b(int n8) {
            return this.e0.k(n8);
        }

        @Override
        protected void c(int n8) {
            this.e0.i(n8);
        }
    }
}

