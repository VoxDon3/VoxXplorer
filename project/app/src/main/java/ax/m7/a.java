/*
 * Decompiled with CFR 0.152.
 */
package ax.m7;

import ax.m7.u;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class a<K, V>
extends AbstractMap<K, V>
implements Cloneable {
    private Object[] c0;
    int q;

    public static <K, V> a<K, V> c() {
        return new a<K, V>();
    }

    private int f(Object object) {
        int n8 = this.q;
        Object[] objectArray = this.c0;
        for (int i8 = 0; i8 < n8 << 1; i8 += 2) {
            Object object2 = objectArray[i8];
            if (!(object == null ? object2 == null : object.equals(object2))) continue;
            return i8;
        }
        return -2;
    }

    private V m(int n8) {
        int n9 = this.q << 1;
        if (n8 >= 0 && n8 < n9) {
            V v8 = this.t(n8 + 1);
            Object[] objectArray = this.c0;
            int n10 = n9 - n8 - 2;
            if (n10 != 0) {
                System.arraycopy(objectArray, n8 + 2, objectArray, n8, n10);
            }
            --this.q;
            this.r(n9 - 2, null, null);
            return v8;
        }
        return null;
    }

    private void r(int n8, K k8, V v8) {
        Object[] objectArray = this.c0;
        objectArray[n8] = k8;
        objectArray[n8 + 1] = v8;
    }

    private void s(int n8) {
        if (n8 == 0) {
            this.c0 = null;
            return;
        }
        int n9 = this.q;
        Object[] objectArray = this.c0;
        if (n9 == 0 || n8 != objectArray.length) {
            Object[] objectArray2 = new Object[n8];
            this.c0 = objectArray2;
            if (n9 != 0) {
                System.arraycopy(objectArray, 0, objectArray2, 0, n9 << 1);
            }
        }
    }

    private V t(int n8) {
        if (n8 < 0) {
            return null;
        }
        return (V)this.c0[n8];
    }

    public a<K, V> b() {
        a a8;
        block3: {
            Object[] objectArray;
            try {
                a8 = (a)super.clone();
                objectArray = this.c0;
                if (objectArray == null) break block3;
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                return null;
            }
            int n8 = objectArray.length;
            Object[] objectArray2 = new Object[n8];
            a8.c0 = objectArray2;
            System.arraycopy(objectArray, 0, objectArray2, 0, n8);
        }
        return a8;
    }

    @Override
    public void clear() {
        this.q = 0;
        this.c0 = null;
    }

    @Override
    public final boolean containsKey(Object object) {
        return -2 != this.f(object);
    }

    @Override
    public final boolean containsValue(Object object) {
        int n8 = this.q;
        Object[] objectArray = this.c0;
        for (int i8 = 1; i8 < n8 << 1; i8 += 2) {
            Object object2 = objectArray[i8];
            if (!(object == null ? object2 == null : object.equals(object2))) continue;
            return true;
        }
        return false;
    }

    public final void d(int n8) {
        if (n8 >= 0) {
            int n9 = n8 << 1;
            Object[] objectArray = this.c0;
            if (n9 > (n8 = objectArray == null ? 0 : objectArray.length)) {
                int n10;
                int n11 = n8 / 2 * 3;
                n8 = n10 = n11 + 1;
                if (n10 % 2 != 0) {
                    n8 = n11 + 2;
                }
                if (n8 < n9) {
                    n8 = n9;
                }
                this.s(n8);
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public final Set<Map.Entry<K, V>> entrySet() {
        return new c(this);
    }

    @Override
    public final V get(Object object) {
        return this.t(this.f(object) + 1);
    }

    public final int i(K k8) {
        return this.f(k8) >> 1;
    }

    public final K j(int n8) {
        if (n8 >= 0 && n8 < this.q) {
            return (K)this.c0[n8 << 1];
        }
        return null;
    }

    public final V k(int n8) {
        if (n8 >= 0 && n8 < this.q) {
            return this.t((n8 << 1) + 1);
        }
        return null;
    }

    public final V l(int n8) {
        return this.m(n8 << 1);
    }

    public final V n(int n8, V v8) {
        int n9 = this.q;
        if (n8 >= 0 && n8 < n9) {
            n8 = (n8 << 1) + 1;
            V v9 = this.t(n8);
            this.c0[n8] = v8;
            return v9;
        }
        throw new IndexOutOfBoundsException();
    }

    public final V o(int n8, K k8, V v8) {
        if (n8 >= 0) {
            int n9 = n8 + 1;
            this.d(n9);
            V v9 = this.t((n8 <<= 1) + 1);
            this.r(n8, k8, v8);
            if (n9 > this.q) {
                this.q = n9;
            }
            return v9;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public final V put(K k8, V v8) {
        int n8;
        int n9 = n8 = this.i(k8);
        if (n8 == -1) {
            n9 = this.q;
        }
        return this.o(n9, k8, v8);
    }

    @Override
    public final V remove(Object object) {
        return this.m(this.f(object));
    }

    @Override
    public final int size() {
        return this.q;
    }

    final class a
    implements Map.Entry<K, V> {
        final a c0;
        private int q;

        a(a a8, int n8) {
            this.c0 = a8;
            this.q = n8;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof Map.Entry)) {
                return false;
            }
            object = (Map.Entry)object;
            return u.a(this.getKey(), object.getKey()) && u.a(this.getValue(), object.getValue());
        }

        @Override
        public K getKey() {
            return this.c0.j(this.q);
        }

        @Override
        public V getValue() {
            return this.c0.k(this.q);
        }

        @Override
        public int hashCode() {
            Object k8 = this.getKey();
            Object v8 = this.getValue();
            int n8 = 0;
            int n9 = k8 != null ? k8.hashCode() : 0;
            if (v8 != null) {
                n8 = v8.hashCode();
            }
            return n9 ^ n8;
        }

        @Override
        public V setValue(V v8) {
            return this.c0.n(this.q, v8);
        }
    }

    final class b
    implements Iterator<Map.Entry<K, V>> {
        private int c0;
        final a d0;
        private boolean q;

        b(a a8) {
            this.d0 = a8;
        }

        public Map.Entry<K, V> b() {
            int n8 = this.c0;
            a a8 = this.d0;
            if (n8 != a8.q) {
                this.c0 = n8 + 1;
                this.q = false;
                return new a(a8, n8);
            }
            throw new NoSuchElementException();
        }

        @Override
        public boolean hasNext() {
            return this.c0 < this.d0.q;
        }

        @Override
        public void remove() {
            int n8 = this.c0 - 1;
            if (!this.q && n8 >= 0) {
                this.d0.l(n8);
                --this.c0;
                this.q = true;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    final class c
    extends AbstractSet<Map.Entry<K, V>> {
        final a q;

        c(a a8) {
            this.q = a8;
        }

        @Override
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(this.q);
        }

        @Override
        public int size() {
            return this.q.q;
        }
    }
}

