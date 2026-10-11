package ax.r7;

import ax.q7.C2883j;
import ax.u7.C3218f;
import j$.util.Objects;
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

/* renamed from: ax.r7.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C2977k<K, V> extends AbstractMap<K, V> implements Serializable {
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

    /* renamed from: ax.r7.k$a */
    class a extends C2977k<K, V>.e<K> {
        a() {
            super(C2977k.this, null);
        }

        @Override // ax.r7.C2977k.e
        K c(int i) {
            return (K) C2977k.this.H(i);
        }
    }

    /* renamed from: ax.r7.k$b */
    class b extends C2977k<K, V>.e<Map.Entry<K, V>> {
        b() {
            super(C2977k.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.r7.C2977k.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> c(int i) {
            return new g(i);
        }
    }

    /* renamed from: ax.r7.k$c */
    class c extends C2977k<K, V>.e<V> {
        c() {
            super(C2977k.this, null);
        }

        @Override // ax.r7.C2977k.e
        V c(int i) {
            return (V) C2977k.this.X(i);
        }
    }

    /* renamed from: ax.r7.k$d */
    class d extends AbstractSet<Map.Entry<K, V>> {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C2977k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> x = C2977k.this.x();
            if (x != null) {
                return x.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int E = C2977k.this.E(entry.getKey());
                if (E != -1 && C2883j.a(C2977k.this.X(E), entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return C2977k.this.z();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int C;
            int f;
            Map<K, V> x = C2977k.this.x();
            if (x != null) {
                return x.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (C2977k.this.K() || (f = C2978l.f(entry.getKey(), entry.getValue(), (C = C2977k.this.C()), C2977k.this.O(), C2977k.this.M(), C2977k.this.N(), C2977k.this.P())) == -1) {
                return false;
            }
            C2977k.this.J(f, C);
            C2977k.e(C2977k.this);
            C2977k.this.D();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C2977k.this.size();
        }
    }

    /* renamed from: ax.r7.k$f */
    class f extends AbstractSet<K> {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C2977k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C2977k.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return C2977k.this.I();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> x = C2977k.this.x();
            return x != null ? x.keySet().remove(obj) : C2977k.this.L(obj) != C2977k.k0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C2977k.this.size();
        }
    }

    /* renamed from: ax.r7.k$g */
    final class g extends AbstractC2971e<K, V> {
        private int c0;
        private final K q;

        g(int i) {
            this.q = (K) C2977k.this.H(i);
            this.c0 = i;
        }

        private void a() {
            int i = this.c0;
            if (i == -1 || i >= C2977k.this.size() || !C2883j.a(this.q, C2977k.this.H(this.c0))) {
                this.c0 = C2977k.this.E(this.q);
            }
        }

        @Override // ax.r7.AbstractC2971e, java.util.Map.Entry
        public K getKey() {
            return this.q;
        }

        @Override // ax.r7.AbstractC2971e, java.util.Map.Entry
        public V getValue() {
            Map<K, V> x = C2977k.this.x();
            if (x != null) {
                return (V) Q.a(x.get(this.q));
            }
            a();
            int i = this.c0;
            return i == -1 ? (V) Q.b() : (V) C2977k.this.X(i);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            Map<K, V> x = C2977k.this.x();
            if (x != null) {
                return (V) Q.a(x.put(this.q, v));
            }
            a();
            int i = this.c0;
            if (i == -1) {
                C2977k.this.put(this.q, v);
                return (V) Q.b();
            }
            V v2 = (V) C2977k.this.X(i);
            C2977k.this.W(this.c0, v);
            return v2;
        }
    }

    /* renamed from: ax.r7.k$h */
    class h extends AbstractCollection<V> {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C2977k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return C2977k.this.Y();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C2977k.this.size();
        }
    }

    C2977k(int i) {
        F(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int C() {
        return (1 << (this.f0 & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int E(Object obj) {
        if (K()) {
            return -1;
        }
        int c2 = C2988w.c(obj);
        int C = C();
        int h2 = C2978l.h(O(), c2 & C);
        if (h2 == 0) {
            return -1;
        }
        int b2 = C2978l.b(c2, C);
        do {
            int i = h2 - 1;
            int y = y(i);
            if (C2978l.b(y, C) == b2 && C2883j.a(obj, H(i))) {
                return i;
            }
            h2 = C2978l.c(y, C);
        } while (h2 != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public K H(int i) {
        return (K) N()[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object L(Object obj) {
        if (K()) {
            return k0;
        }
        int C = C();
        int f2 = C2978l.f(obj, null, C, O(), M(), N(), null);
        if (f2 == -1) {
            return k0;
        }
        V X = X(f2);
        J(f2, C);
        this.g0--;
        D();
        return X;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] M() {
        int[] iArr = this.c0;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] N() {
        Object[] objArr = this.d0;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object O() {
        Object obj = this.q;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] P() {
        Object[] objArr = this.e0;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void R(int i) {
        int min;
        int length = M().length;
        if (i <= length || (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        Q(min);
    }

    private int S(int i, int i2, int i3, int i4) {
        Object a2 = C2978l.a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C2978l.i(a2, i3 & i5, i4 + 1);
        }
        Object O = O();
        int[] M = M();
        for (int i6 = 0; i6 <= i; i6++) {
            int h2 = C2978l.h(O, i6);
            while (h2 != 0) {
                int i7 = h2 - 1;
                int i8 = M[i7];
                int b2 = C2978l.b(i8, i) | i6;
                int i9 = b2 & i5;
                int h3 = C2978l.h(a2, i9);
                C2978l.i(a2, i9, h2);
                M[i7] = C2978l.d(b2, h3, i5);
                h2 = C2978l.c(i8, i);
            }
        }
        this.q = a2;
        U(i5);
        return i5;
    }

    private void T(int i, int i2) {
        M()[i] = i2;
    }

    private void U(int i) {
        this.f0 = C2978l.d(this.f0, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private void V(int i, K k) {
        N()[i] = k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(int i, V v) {
        P()[i] = v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V X(int i) {
        return (V) P()[i];
    }

    static /* synthetic */ int e(C2977k c2977k) {
        int i = c2977k.g0;
        c2977k.g0 = i - 1;
        return i;
    }

    public static <K, V> C2977k<K, V> w(int i) {
        return new C2977k<>(i);
    }

    private int y(int i) {
        return M()[i];
    }

    int A() {
        return isEmpty() ? -1 : 0;
    }

    int B(int i) {
        int i2 = i + 1;
        if (i2 < this.g0) {
            return i2;
        }
        return -1;
    }

    void D() {
        this.f0 += 32;
    }

    void F(int i) {
        ax.q7.n.e(i >= 0, "Expected size must be >= 0");
        this.f0 = C3218f.g(i, 1, 1073741823);
    }

    void G(int i, K k, V v, int i2, int i3) {
        T(i, C2978l.d(i2, 0, i3));
        V(i, k);
        W(i, v);
    }

    Iterator<K> I() {
        Map<K, V> x = x();
        return x != null ? x.keySet().iterator() : new a();
    }

    void J(int i, int i2) {
        Object O = O();
        int[] M = M();
        Object[] N = N();
        Object[] P = P();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            N[i] = null;
            P[i] = null;
            M[i] = 0;
            return;
        }
        Object obj = N[i3];
        N[i] = obj;
        P[i] = P[i3];
        N[i3] = null;
        P[i3] = null;
        M[i] = M[i3];
        M[i3] = 0;
        int c2 = C2988w.c(obj) & i2;
        int h2 = C2978l.h(O, c2);
        if (h2 == size) {
            C2978l.i(O, c2, i + 1);
            return;
        }
        while (true) {
            int i4 = h2 - 1;
            int i5 = M[i4];
            int c3 = C2978l.c(i5, i2);
            if (c3 == size) {
                M[i4] = C2978l.d(i5, i + 1, i2);
                return;
            }
            h2 = c3;
        }
    }

    boolean K() {
        return this.q == null;
    }

    void Q(int i) {
        this.c0 = Arrays.copyOf(M(), i);
        this.d0 = Arrays.copyOf(N(), i);
        this.e0 = Arrays.copyOf(P(), i);
    }

    Iterator<V> Y() {
        Map<K, V> x = x();
        return x != null ? x.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (K()) {
            return;
        }
        D();
        Map<K, V> x = x();
        if (x != null) {
            this.f0 = C3218f.g(size(), 3, 1073741823);
            x.clear();
            this.q = null;
            this.g0 = 0;
            return;
        }
        Arrays.fill(N(), 0, this.g0, (Object) null);
        Arrays.fill(P(), 0, this.g0, (Object) null);
        C2978l.g(O());
        Arrays.fill(M(), 0, this.g0, 0);
        this.g0 = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map<K, V> x = x();
        return x != null ? x.containsKey(obj) : E(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map<K, V> x = x();
        if (x != null) {
            return x.containsValue(obj);
        }
        for (int i = 0; i < this.g0; i++) {
            if (C2883j.a(obj, X(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.i0;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> s = s();
        this.i0 = s;
        return s;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map<K, V> x = x();
        if (x != null) {
            return x.get(obj);
        }
        int E = E(obj);
        if (E == -1) {
            return null;
        }
        o(E);
        return X(E);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.h0;
        if (set != null) {
            return set;
        }
        Set<K> u = u();
        this.h0 = u;
        return u;
    }

    int p(int i, int i2) {
        return i - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (K()) {
            q();
        }
        Map<K, V> x = x();
        if (x != null) {
            return x.put(k, v);
        }
        int[] M = M();
        Object[] N = N();
        Object[] P = P();
        int i = this.g0;
        int i2 = i + 1;
        int c2 = C2988w.c(k);
        int C = C();
        int i3 = c2 & C;
        int h2 = C2978l.h(O(), i3);
        if (h2 != 0) {
            int b2 = C2978l.b(c2, C);
            int i4 = 0;
            while (true) {
                int i5 = h2 - 1;
                int i6 = M[i5];
                if (C2978l.b(i6, C) == b2 && C2883j.a(k, N[i5])) {
                    V v2 = (V) P[i5];
                    P[i5] = v;
                    o(i5);
                    return v2;
                }
                int c3 = C2978l.c(i6, C);
                i4++;
                if (c3 != 0) {
                    k = k;
                    v = v;
                    h2 = c3;
                } else {
                    if (i4 >= 9) {
                        return r().put(k, v);
                    }
                    if (i2 > C) {
                        C = S(C, C2978l.e(C), c2, i);
                    } else {
                        M[i5] = C2978l.d(i6, i2, C);
                    }
                }
            }
        } else if (i2 > C) {
            C = S(C, C2978l.e(C), c2, i);
        } else {
            C2978l.i(O(), i3, i2);
        }
        int i7 = C;
        R(i2);
        G(i, k, v, c2, i7);
        this.g0 = i2;
        D();
        return null;
    }

    int q() {
        ax.q7.n.u(K(), "Arrays already allocated");
        int i = this.f0;
        int j = C2978l.j(i);
        this.q = C2978l.a(j);
        U(j - 1);
        this.c0 = new int[i];
        this.d0 = new Object[i];
        this.e0 = new Object[i];
        return i;
    }

    Map<K, V> r() {
        Map<K, V> t = t(C() + 1);
        int A = A();
        while (A >= 0) {
            t.put(H(A), X(A));
            A = B(A);
        }
        this.q = t;
        this.c0 = null;
        this.d0 = null;
        this.e0 = null;
        D();
        return t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Map<K, V> x = x();
        if (x != null) {
            return x.remove(obj);
        }
        V v = (V) L(obj);
        if (v == k0) {
            return null;
        }
        return v;
    }

    Set<Map.Entry<K, V>> s() {
        return new d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> x = x();
        return x != null ? x.size() : this.g0;
    }

    Map<K, V> t(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    Set<K> u() {
        return new f();
    }

    Collection<V> v() {
        return new h();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.j0;
        if (collection != null) {
            return collection;
        }
        Collection<V> v = v();
        this.j0 = v;
        return v;
    }

    Map<K, V> x() {
        Object obj = this.q;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    Iterator<Map.Entry<K, V>> z() {
        Map<K, V> x = x();
        return x != null ? x.entrySet().iterator() : new b();
    }

    /* renamed from: ax.r7.k$e */
    private abstract class e<T> implements Iterator<T> {
        int c0;
        int d0;
        int q;

        private e() {
            this.q = C2977k.this.f0;
            this.c0 = C2977k.this.A();
            this.d0 = -1;
        }

        private void b() {
            if (C2977k.this.f0 != this.q) {
                throw new ConcurrentModificationException();
            }
        }

        abstract T c(int i);

        void e() {
            this.q += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c0 >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            b();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.c0;
            this.d0 = i;
            T c = c(i);
            this.c0 = C2977k.this.B(this.c0);
            return c;
        }

        @Override // java.util.Iterator
        public void remove() {
            b();
            C2975i.c(this.d0 >= 0);
            e();
            C2977k c2977k = C2977k.this;
            c2977k.remove(c2977k.H(this.d0));
            this.c0 = C2977k.this.p(this.c0, this.d0);
            this.d0 = -1;
        }

        /* synthetic */ e(C2977k c2977k, a aVar) {
            this();
        }
    }

    void o(int i) {
    }
}
