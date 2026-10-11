package ax.m7;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: ax.m7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2526a<K, V> extends AbstractMap<K, V> implements Cloneable {
    private Object[] c0;
    int q;

    /* renamed from: ax.m7.a$a, reason: collision with other inner class name */
    final class C0374a implements Map.Entry<K, V> {
        private int q;

        C0374a(int i) {
            this.q = i;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return u.a(getKey(), entry.getKey()) && u.a(getValue(), entry.getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) C2526a.this.j(this.q);
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return (V) C2526a.this.k(this.q);
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            Object value = getValue();
            return (key != null ? key.hashCode() : 0) ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            return (V) C2526a.this.n(this.q, v);
        }
    }

    /* renamed from: ax.m7.a$b */
    final class b implements Iterator<Map.Entry<K, V>> {
        private int c0;
        private boolean q;

        b() {
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            int i = this.c0;
            C2526a c2526a = C2526a.this;
            if (i == c2526a.q) {
                throw new NoSuchElementException();
            }
            this.c0 = i + 1;
            this.q = false;
            return new C0374a(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c0 < C2526a.this.q;
        }

        @Override // java.util.Iterator
        public void remove() {
            int i = this.c0 - 1;
            if (this.q || i < 0) {
                throw new IllegalArgumentException();
            }
            C2526a.this.l(i);
            this.c0--;
            this.q = true;
        }
    }

    /* renamed from: ax.m7.a$c */
    final class c extends AbstractSet<Map.Entry<K, V>> {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C2526a.this.q;
        }
    }

    public static <K, V> C2526a<K, V> c() {
        return new C2526a<>();
    }

    private int f(Object obj) {
        int i = this.q << 1;
        Object[] objArr = this.c0;
        for (int i2 = 0; i2 < i; i2 += 2) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 == null) {
                    return i2;
                }
            } else {
                if (obj.equals(obj2)) {
                    return i2;
                }
            }
        }
        return -2;
    }

    private V m(int i) {
        int i2 = this.q << 1;
        if (i < 0 || i >= i2) {
            return null;
        }
        V t = t(i + 1);
        Object[] objArr = this.c0;
        int i3 = (i2 - i) - 2;
        if (i3 != 0) {
            System.arraycopy(objArr, i + 2, objArr, i, i3);
        }
        this.q--;
        r(i2 - 2, null, null);
        return t;
    }

    private void r(int i, K k, V v) {
        Object[] objArr = this.c0;
        objArr[i] = k;
        objArr[i + 1] = v;
    }

    private void s(int i) {
        if (i == 0) {
            this.c0 = null;
            return;
        }
        int i2 = this.q;
        Object[] objArr = this.c0;
        if (i2 == 0 || i != objArr.length) {
            Object[] objArr2 = new Object[i];
            this.c0 = objArr2;
            if (i2 != 0) {
                System.arraycopy(objArr, 0, objArr2, 0, i2 << 1);
            }
        }
    }

    private V t(int i) {
        if (i < 0) {
            return null;
        }
        return (V) this.c0[i];
    }

    @Override // java.util.AbstractMap
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2526a<K, V> clone() {
        try {
            C2526a<K, V> c2526a = (C2526a) super.clone();
            Object[] objArr = this.c0;
            if (objArr != null) {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                c2526a.c0 = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            return c2526a;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.q = 0;
        this.c0 = null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return -2 != f(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        int i = this.q << 1;
        Object[] objArr = this.c0;
        for (int i2 = 1; i2 < i; i2 += 2) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 == null) {
                    return true;
                }
            } else {
                if (obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        }
        Object[] objArr = this.c0;
        int i2 = i << 1;
        int length = objArr == null ? 0 : objArr.length;
        if (i2 > length) {
            int i3 = (length / 2) * 3;
            int i4 = i3 + 1;
            if (i4 % 2 != 0) {
                i4 = i3 + 2;
            }
            if (i4 >= i2) {
                i2 = i4;
            }
            s(i2);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        return t(f(obj) + 1);
    }

    public final int i(K k) {
        return f(k) >> 1;
    }

    public final K j(int i) {
        if (i < 0 || i >= this.q) {
            return null;
        }
        return (K) this.c0[i << 1];
    }

    public final V k(int i) {
        if (i < 0 || i >= this.q) {
            return null;
        }
        return t((i << 1) + 1);
    }

    public final V l(int i) {
        return m(i << 1);
    }

    public final V n(int i, V v) {
        int i2 = this.q;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = (i << 1) + 1;
        V t = t(i3);
        this.c0[i3] = v;
        return t;
    }

    public final V o(int i, K k, V v) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i2 = i + 1;
        d(i2);
        int i3 = i << 1;
        V t = t(i3 + 1);
        r(i3, k, v);
        if (i2 > this.q) {
            this.q = i2;
        }
        return t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        int i = i(k);
        if (i == -1) {
            i = this.q;
        }
        return o(i, k, v);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        return m(f(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.q;
    }
}
