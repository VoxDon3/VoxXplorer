/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.j;
import ax.q7.n;
import ax.r7.Q;
import ax.r7.i;
import ax.r7.l;
import ax.r7.w;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

class k<K, V>
extends AbstractMap<K, V>
implements Serializable {
    private static final Object k0 = new Object();
    transient int[] c0;
    transient Object[] d0;
    transient Object[] e0;
    private transient int f0;
    private transient int g0;
    private transient Set<K> h0;
    private transient Set<Map.Entry<K, V>> i0;
    private transient Collection<V> j0;
    private transient Object q;

    k(int n8) {
        this.F(n8);
    }

    private int C() {
        return (1 << (this.f0 & 0x1F)) - 1;
    }

    private int E(Object object) {
        if (this.K()) {
            return -1;
        }
        int n8 = w.c(object);
        int n9 = this.C();
        int n10 = l.h(this.O(), n8 & n9);
        if (n10 == 0) {
            return -1;
        }
        int n11 = l.b(n8, n9);
        do {
            if (l.b(n10 = this.y(n8 = n10 - 1), n9) == n11 && j.a(object, this.H(n8))) {
                return n8;
            }
            n10 = n8 = l.c(n10, n9);
        } while (n8 != 0);
        return -1;
    }

    private K H(int n8) {
        return (K)this.N()[n8];
    }

    private Object L(Object object) {
        if (this.K()) {
            return k0;
        }
        int n8 = this.C();
        int n9 = l.f(object, null, n8, this.O(), this.M(), this.N(), null);
        if (n9 == -1) {
            return k0;
        }
        object = this.X(n9);
        this.J(n9, n8);
        --this.g0;
        this.D();
        return object;
    }

    private int[] M() {
        int[] nArray = this.c0;
        j.Objects.requireNonNull((Object)nArray);
        return nArray;
    }

    private Object[] N() {
        Object[] objectArray = this.d0;
        j.Objects.requireNonNull((Object)objectArray);
        return objectArray;
    }

    private Object O() {
        Object object = this.q;
        j.Objects.requireNonNull((Object)object);
        return object;
    }

    private Object[] P() {
        Object[] objectArray = this.e0;
        j.Objects.requireNonNull((Object)objectArray);
        return objectArray;
    }

    private void R(int n8) {
        int n9 = this.M().length;
        if (n8 > n9 && (n8 = Math.min(0x3FFFFFFF, Math.max(1, n9 >>> 1) + n9 | 1)) != n9) {
            this.Q(n8);
        }
    }

    private int S(int n8, int n9, int n10, int n11) {
        Object object = l.a(n9);
        int n12 = n9 - 1;
        if (n11 != 0) {
            l.i(object, n10 & n12, n11 + 1);
        }
        Object object2 = this.O();
        int[] nArray = this.M();
        for (n9 = 0; n9 <= n8; ++n9) {
            n10 = l.h(object2, n9);
            while (n10 != 0) {
                int n13 = n10 - 1;
                int n14 = nArray[n13];
                int n15 = l.b(n14, n8) | n9;
                n11 = n15 & n12;
                int n16 = l.h(object, n11);
                l.i(object, n11, n10);
                nArray[n13] = l.d(n15, n16, n12);
                n10 = l.c(n14, n8);
            }
        }
        this.q = object;
        this.U(n12);
        return n12;
    }

    private void T(int n8, int n9) {
        this.M()[n8] = n9;
    }

    private void U(int n8) {
        n8 = Integer.numberOfLeadingZeros(n8);
        this.f0 = l.d(this.f0, 32 - n8, 31);
    }

    private void V(int n8, K k8) {
        this.N()[n8] = k8;
    }

    private void W(int n8, V v8) {
        this.P()[n8] = v8;
    }

    private V X(int n8) {
        return (V)this.P()[n8];
    }

    static /* synthetic */ int e(k k8) {
        int n8 = k8.g0;
        k8.g0 = n8 - 1;
        return n8;
    }

    public static <K, V> k<K, V> w(int n8) {
        return new k<K, V>(n8);
    }

    private int y(int n8) {
        return this.M()[n8];
    }

    int A() {
        if (this.isEmpty()) {
            return -1;
        }
        return 0;
    }

    int B(int n8) {
        if (++n8 < this.g0) {
            return n8;
        }
        return -1;
    }

    void D() {
        this.f0 += 32;
    }

    void F(int n8) {
        boolean bl = n8 >= 0;
        n.e(bl, "Expected size must be >= 0");
        this.f0 = ax.u7.f.g(n8, 1, 0x3FFFFFFF);
    }

    void G(int n8, K k8, V v8, int n9, int n10) {
        this.T(n8, l.d(n9, 0, n10));
        this.V(n8, k8);
        this.W(n8, v8);
    }

    Iterator<K> I() {
        Map<K, V> map = this.x();
        if (map != null) {
            return map.keySet().iterator();
        }
        return new e<K>(this){
            final k f0;
            {
                this.f0 = k8;
                super(k8);
            }

            @Override
            K c(int n8) {
                return this.f0.H(n8);
            }
        };
    }

    void J(int n8, int n9) {
        Object object = this.O();
        int[] nArray = this.M();
        Object[] objectArray = this.N();
        Object[] objectArray2 = this.P();
        int n10 = this.size();
        int n11 = n10 - 1;
        if (n8 < n11) {
            int n12;
            Object object2;
            objectArray[n8] = object2 = objectArray[n11];
            objectArray2[n8] = objectArray2[n11];
            objectArray[n11] = null;
            objectArray2[n11] = null;
            nArray[n8] = nArray[n11];
            nArray[n11] = 0;
            int n13 = w.c(object2) & n9;
            n11 = n12 = l.h(object, n13);
            if (n12 == n10) {
                l.i(object, n13, n8 + 1);
                return;
            }
            while ((n11 = l.c(n13 = nArray[n12 = n11 - 1], n9)) != n10) {
            }
            nArray[n12] = l.d(n13, n8 + 1, n9);
            return;
        }
        objectArray[n8] = null;
        objectArray2[n8] = null;
        nArray[n8] = 0;
    }

    boolean K() {
        return this.q == null;
    }

    void Q(int n8) {
        this.c0 = Arrays.copyOf(this.M(), n8);
        this.d0 = Arrays.copyOf(this.N(), n8);
        this.e0 = Arrays.copyOf(this.P(), n8);
    }

    Iterator<V> Y() {
        Map<K, V> map = this.x();
        if (map != null) {
            return map.values().iterator();
        }
        return new e<V>(this){
            final k f0;
            {
                this.f0 = k8;
                super(k8);
            }

            @Override
            V c(int n8) {
                return this.f0.X(n8);
            }
        };
    }

    @Override
    public void clear() {
        if (this.K()) {
            return;
        }
        this.D();
        Map<K, V> map = this.x();
        if (map != null) {
            this.f0 = ax.u7.f.g(this.size(), 3, 0x3FFFFFFF);
            map.clear();
            this.q = null;
            this.g0 = 0;
            return;
        }
        Arrays.fill(this.N(), 0, this.g0, null);
        Arrays.fill(this.P(), 0, this.g0, null);
        l.g(this.O());
        Arrays.fill(this.M(), 0, this.g0, 0);
        this.g0 = 0;
    }

    @Override
    public boolean containsKey(Object object) {
        Map<K, V> map = this.x();
        if (map != null) {
            return map.containsKey(object);
        }
        return this.E(object) != -1;
    }

    @Override
    public boolean containsValue(Object object) {
        Map<K, V> map = this.x();
        if (map != null) {
            return map.containsValue(object);
        }
        for (int i8 = 0; i8 < this.g0; ++i8) {
            if (!j.a(object, this.X(i8))) continue;
            return true;
        }
        return false;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set;
        Set<Map.Entry<K, V>> set2 = set = this.i0;
        if (set == null) {
            this.i0 = set2 = this.s();
        }
        return set2;
    }

    @Override
    public V get(Object object) {
        Map<K, V> map = this.x();
        if (map != null) {
            return map.get(object);
        }
        int n8 = this.E(object);
        if (n8 == -1) {
            return null;
        }
        this.o(n8);
        return this.X(n8);
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public Set<K> keySet() {
        Set<K> set;
        Set<K> set2 = set = this.h0;
        if (set == null) {
            this.h0 = set2 = this.u();
        }
        return set2;
    }

    void o(int n8) {
    }

    int p(int n8, int n9) {
        return n8 - 1;
    }

    @Override
    public V put(K object, V v8) {
        Object[] objectArray;
        if (this.K()) {
            this.q();
        }
        if ((objectArray = this.x()) != null) {
            return objectArray.put(object, v8);
        }
        int[] nArray = this.M();
        Object[] objectArray2 = this.N();
        objectArray = this.P();
        int n8 = this.g0;
        int n9 = n8 + 1;
        int n10 = w.c(object);
        int n11 = this.C();
        int n12 = n10 & n11;
        int n13 = l.h(this.O(), n12);
        if (n13 == 0) {
            if (n9 > n11) {
                n12 = this.S(n11, l.e(n11), n10, n8);
            } else {
                l.i(this.O(), n12, n9);
                n12 = n11;
            }
        } else {
            int n14;
            int n15 = l.b(n10, n11);
            n12 = 0;
            do {
                int n16;
                if (l.b(n14 = nArray[n16 = n13 - 1], n11) == n15 && j.a(object, objectArray2[n16])) {
                    object = objectArray[n16];
                    objectArray[n16] = v8;
                    this.o(n16);
                    return (V)object;
                }
                n13 = l.c(n14, n11);
                ++n12;
            } while (n13 != 0);
            if (n12 >= 9) {
                return this.r().put(object, v8);
            }
            if (n9 > n11) {
                n12 = this.S(n11, l.e(n11), n10, n8);
            } else {
                nArray[n16] = l.d(n14, n9, n11);
                n12 = n11;
            }
        }
        this.R(n9);
        this.G(n8, object, v8, n10, n12);
        this.g0 = n9;
        this.D();
        return null;
    }

    int q() {
        n.u(this.K(), "Arrays already allocated");
        int n8 = this.f0;
        int n9 = l.j(n8);
        this.q = l.a(n9);
        this.U(n9 - 1);
        this.c0 = new int[n8];
        this.d0 = new Object[n8];
        this.e0 = new Object[n8];
        return n8;
    }

    Map<K, V> r() {
        Map<K, V> map = this.t(this.C() + 1);
        int n8 = this.A();
        while (n8 >= 0) {
            map.put(this.H(n8), this.X(n8));
            n8 = this.B(n8);
        }
        this.q = map;
        this.c0 = null;
        this.d0 = null;
        this.e0 = null;
        this.D();
        return map;
    }

    @Override
    public V remove(Object object) {
        Map<K, V> map = this.x();
        if (map != null) {
            return map.remove(object);
        }
        object = map = this.L(object);
        if (map == k0) {
            object = null;
        }
        return (V)object;
    }

    Set<Map.Entry<K, V>> s() {
        return new d(this);
    }

    @Override
    public int size() {
        Map<K, V> map = this.x();
        if (map != null) {
            return map.size();
        }
        return this.g0;
    }

    Map<K, V> t(int n8) {
        return new LinkedHashMap(n8, 1.0f);
    }

    Set<K> u() {
        return new f(this);
    }

    Collection<V> v() {
        return new h(this);
    }

    @Override
    public Collection<V> values() {
        Collection<V> collection;
        Collection<V> collection2 = collection = this.j0;
        if (collection == null) {
            this.j0 = collection2 = this.v();
        }
        return collection2;
    }

    Map<K, V> x() {
        Object object = this.q;
        if (object instanceof Map) {
            return (Map)object;
        }
        return null;
    }

    Iterator<Map.Entry<K, V>> z() {
        Map<K, V> map = this.x();
        if (map != null) {
            return map.entrySet().iterator();
        }
        return new e<Map.Entry<K, V>>(this){
            final k f0;
            {
                this.f0 = k8;
                super(k8);
            }

            Map.Entry<K, V> f(int n8) {
                return new g(this.f0, n8);
            }
        };
    }

    class d
    extends AbstractSet<Map.Entry<K, V>> {
        final k q;

        d(k k8) {
            this.q = k8;
        }

        @Override
        public void clear() {
            this.q.clear();
        }

        @Override
        public boolean contains(Object object) {
            int n8;
            Map map = this.q.x();
            if (map != null) {
                return map.entrySet().contains(object);
            }
            return object instanceof Map.Entry && (n8 = this.q.E((object = (Map.Entry)object).getKey())) != -1 && j.a(this.q.X(n8), object.getValue());
        }

        @Override
        public Iterator<Map.Entry<K, V>> iterator() {
            return this.q.z();
        }

        @Override
        public boolean remove(Object object) {
            Map map = this.q.x();
            if (map != null) {
                return map.entrySet().remove(object);
            }
            if (object instanceof Map.Entry) {
                object = (Map.Entry)object;
                if (this.q.K()) {
                    return false;
                }
                int n8 = this.q.C();
                int n9 = l.f(object.getKey(), object.getValue(), n8, this.q.O(), this.q.M(), this.q.N(), this.q.P());
                if (n9 == -1) {
                    return false;
                }
                this.q.J(n9, n8);
                k.e(this.q);
                this.q.D();
                return true;
            }
            return false;
        }

        @Override
        public int size() {
            return this.q.size();
        }
    }

    private abstract class e<T>
    implements Iterator<T> {
        int c0;
        int d0;
        final k e0;
        int q;

        private e(k k8) {
            this.e0 = k8;
            this.q = k8.f0;
            this.c0 = k8.A();
            this.d0 = -1;
        }

        private void b() {
            if (this.e0.f0 == this.q) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        abstract T c(int var1);

        void e() {
            this.q += 32;
        }

        @Override
        public boolean hasNext() {
            return this.c0 >= 0;
        }

        @Override
        public T next() {
            this.b();
            if (this.hasNext()) {
                int n8;
                this.d0 = n8 = this.c0;
                T t8 = this.c(n8);
                this.c0 = this.e0.B(this.c0);
                return t8;
            }
            throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            this.b();
            boolean bl = this.d0 >= 0;
            i.c(bl);
            this.e();
            k k8 = this.e0;
            k8.remove(k8.H(this.d0));
            this.c0 = this.e0.p(this.c0, this.d0);
            this.d0 = -1;
        }
    }

    class f
    extends AbstractSet<K> {
        final k q;

        f(k k8) {
            this.q = k8;
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
            return this.q.I();
        }

        @Override
        public boolean remove(Object object) {
            Map map = this.q.x();
            if (map != null) {
                return map.keySet().remove(object);
            }
            return this.q.L(object) != k0;
        }

        @Override
        public int size() {
            return this.q.size();
        }
    }

    final class g
    extends ax.r7.e<K, V> {
        private int c0;
        final k d0;
        private final K q;

        g(k k8, int n8) {
            this.d0 = k8;
            this.q = k8.H(n8);
            this.c0 = n8;
        }

        private void a() {
            int n8 = this.c0;
            if (n8 != -1 && n8 < this.d0.size() && j.a(this.q, this.d0.H(this.c0))) {
                return;
            }
            this.c0 = this.d0.E(this.q);
        }

        @Override
        public K getKey() {
            return this.q;
        }

        @Override
        public V getValue() {
            Map map = this.d0.x();
            if (map != null) {
                return Q.a(map.get(this.q));
            }
            this.a();
            int n8 = this.c0;
            if (n8 == -1) {
                return Q.b();
            }
            return this.d0.X(n8);
        }

        @Override
        public V setValue(V v8) {
            Map map = this.d0.x();
            if (map != null) {
                return Q.a(map.put(this.q, v8));
            }
            this.a();
            int n8 = this.c0;
            if (n8 == -1) {
                this.d0.put(this.q, v8);
                return Q.b();
            }
            map = this.d0.X(n8);
            this.d0.W(this.c0, v8);
            return map;
        }
    }

    class h
    extends AbstractCollection<V> {
        final k q;

        h(k k8) {
            this.q = k8;
        }

        @Override
        public void clear() {
            this.q.clear();
        }

        @Override
        public Iterator<V> iterator() {
            return this.q.Y();
        }

        @Override
        public int size() {
            return this.q.size();
        }
    }
}

