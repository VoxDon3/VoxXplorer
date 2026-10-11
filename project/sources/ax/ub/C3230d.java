package ax.ub;

import ax.Gb.l;
import ax.tb.AbstractC3127c;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: ax.ub.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3230d<K, V> implements Map<K, V>, Serializable, ax.Hb.c {
    public static final a o0 = new a(null);
    private static final C3230d p0;
    private V[] c0;
    private int[] d0;
    private int[] e0;
    private int f0;
    private int g0;
    private int h0;
    private int i0;
    private int j0;
    private C3232f<K> k0;
    private C3233g<V> l0;
    private C3231e<K, V> m0;
    private boolean n0;
    private K[] q;

    /* renamed from: ax.ub.d$a */
    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i) {
            return Integer.highestOneBit(ax.Lb.f.b(i, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }

        public final C3230d e() {
            return C3230d.p0;
        }

        private a() {
        }
    }

    /* renamed from: ax.ub.d$b */
    public static final class b<K, V> extends C0474d<K, V> implements Iterator<Map.Entry<K, V>>, ax.Hb.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3230d<K, V> c3230d) {
            super(c3230d);
            l.f(c3230d, "map");
        }

        @Override // java.util.Iterator
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public c<K, V> next() {
            b();
            if (c() >= ((C3230d) f()).g0) {
                throw new NoSuchElementException();
            }
            int c = c();
            i(c + 1);
            j(c);
            c<K, V> cVar = new c<>(f(), e());
            g();
            return cVar;
        }

        public final void l(StringBuilder sb) {
            l.f(sb, "sb");
            if (c() >= ((C3230d) f()).g0) {
                throw new NoSuchElementException();
            }
            int c = c();
            i(c + 1);
            j(c);
            Object obj = ((C3230d) f()).q[e()];
            if (obj == f()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = ((C3230d) f()).c0;
            l.c(objArr);
            Object obj2 = objArr[e()];
            if (obj2 == f()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            g();
        }

        public final int m() {
            if (c() >= ((C3230d) f()).g0) {
                throw new NoSuchElementException();
            }
            int c = c();
            i(c + 1);
            j(c);
            Object obj = ((C3230d) f()).q[e()];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ((C3230d) f()).c0;
            l.c(objArr);
            Object obj2 = objArr[e()];
            int hashCode2 = hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            g();
            return hashCode2;
        }
    }

    /* renamed from: ax.ub.d$c */
    public static final class c<K, V> implements Map.Entry<K, V>, ax.Hb.a {
        private final int c0;
        private final int d0;
        private final C3230d<K, V> q;

        public c(C3230d<K, V> c3230d, int i) {
            l.f(c3230d, "map");
            this.q = c3230d;
            this.c0 = i;
            this.d0 = ((C3230d) c3230d).i0;
        }

        private final void a() {
            if (((C3230d) this.q).i0 != this.d0) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return l.a(entry.getKey(), getKey()) && l.a(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            a();
            return (K) ((C3230d) this.q).q[this.c0];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            a();
            Object[] objArr = ((C3230d) this.q).c0;
            l.c(objArr);
            return (V) objArr[this.c0];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            a();
            this.q.m();
            Object[] k = this.q.k();
            int i = this.c0;
            V v2 = (V) k[i];
            k[i] = v;
            return v2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* renamed from: ax.ub.d$d, reason: collision with other inner class name */
    public static class C0474d<K, V> {
        private int c0;
        private int d0;
        private int e0;
        private final C3230d<K, V> q;

        public C0474d(C3230d<K, V> c3230d) {
            l.f(c3230d, "map");
            this.q = c3230d;
            this.d0 = -1;
            this.e0 = ((C3230d) c3230d).i0;
            g();
        }

        public final void b() {
            if (((C3230d) this.q).i0 != this.e0) {
                throw new ConcurrentModificationException();
            }
        }

        public final int c() {
            return this.c0;
        }

        public final int e() {
            return this.d0;
        }

        public final C3230d<K, V> f() {
            return this.q;
        }

        public final void g() {
            while (this.c0 < ((C3230d) this.q).g0) {
                int[] iArr = ((C3230d) this.q).d0;
                int i = this.c0;
                if (iArr[i] >= 0) {
                    return;
                } else {
                    this.c0 = i + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.c0 < ((C3230d) this.q).g0;
        }

        public final void i(int i) {
            this.c0 = i;
        }

        public final void j(int i) {
            this.d0 = i;
        }

        public final void remove() {
            b();
            if (this.d0 == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.q.m();
            this.q.K(this.d0);
            this.d0 = -1;
            this.e0 = ((C3230d) this.q).i0;
        }
    }

    /* renamed from: ax.ub.d$e */
    public static final class e<K, V> extends C0474d<K, V> implements Iterator<K>, ax.Hb.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C3230d<K, V> c3230d) {
            super(c3230d);
            l.f(c3230d, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            b();
            if (c() >= ((C3230d) f()).g0) {
                throw new NoSuchElementException();
            }
            int c = c();
            i(c + 1);
            j(c);
            K k = (K) ((C3230d) f()).q[e()];
            g();
            return k;
        }
    }

    /* renamed from: ax.ub.d$f */
    public static final class f<K, V> extends C0474d<K, V> implements Iterator<V>, ax.Hb.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C3230d<K, V> c3230d) {
            super(c3230d);
            l.f(c3230d, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            b();
            if (c() >= ((C3230d) f()).g0) {
                throw new NoSuchElementException();
            }
            int c = c();
            i(c + 1);
            j(c);
            Object[] objArr = ((C3230d) f()).c0;
            l.c(objArr);
            V v = (V) objArr[e()];
            g();
            return v;
        }
    }

    static {
        C3230d c3230d = new C3230d(0);
        c3230d.n0 = true;
        p0 = c3230d;
    }

    private C3230d(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i, int i2) {
        this.q = kArr;
        this.c0 = vArr;
        this.d0 = iArr;
        this.e0 = iArr2;
        this.f0 = i;
        this.g0 = i2;
        this.h0 = o0.d(y());
    }

    private final int C(K k) {
        return ((k != null ? k.hashCode() : 0) * (-1640531527)) >>> this.h0;
    }

    private final boolean E(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        s(collection.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = collection.iterator();
        while (it.hasNext()) {
            if (F(it.next())) {
                z = true;
            }
        }
        return z;
    }

    private final boolean F(Map.Entry<? extends K, ? extends V> entry) {
        int j = j(entry.getKey());
        V[] k = k();
        if (j >= 0) {
            k[j] = entry.getValue();
            return true;
        }
        int i = (-j) - 1;
        if (l.a(entry.getValue(), k[i])) {
            return false;
        }
        k[i] = entry.getValue();
        return true;
    }

    private final boolean G(int i) {
        int C = C(this.q[i]);
        int i2 = this.f0;
        while (true) {
            int[] iArr = this.e0;
            if (iArr[C] == 0) {
                iArr[C] = i + 1;
                this.d0[i] = C;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            C = C == 0 ? y() - 1 : C - 1;
        }
    }

    private final void H() {
        this.i0++;
    }

    private final void I(int i) {
        H();
        int i2 = 0;
        if (this.g0 > size()) {
            n(false);
        }
        this.e0 = new int[i];
        this.h0 = o0.d(i);
        while (i2 < this.g0) {
            int i3 = i2 + 1;
            if (!G(i2)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i2 = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(int i) {
        C3229c.f(this.q, i);
        V[] vArr = this.c0;
        if (vArr != null) {
            C3229c.f(vArr, i);
        }
        L(this.d0[i]);
        this.d0[i] = -1;
        this.j0 = size() - 1;
        H();
    }

    private final void L(int i) {
        int d = ax.Lb.f.d(this.f0 * 2, y() / 2);
        int i2 = 0;
        int i3 = i;
        do {
            i = i == 0 ? y() - 1 : i - 1;
            i2++;
            if (i2 > this.f0) {
                this.e0[i3] = 0;
                return;
            }
            int[] iArr = this.e0;
            int i4 = iArr[i];
            if (i4 == 0) {
                iArr[i3] = 0;
                return;
            }
            if (i4 < 0) {
                iArr[i3] = -1;
            } else {
                int i5 = i4 - 1;
                if (((C(this.q[i5]) - i) & (y() - 1)) >= i2) {
                    this.e0[i3] = i4;
                    this.d0[i5] = i3;
                }
                d--;
            }
            i3 = i;
            i2 = 0;
            d--;
        } while (d >= 0);
        this.e0[i3] = -1;
    }

    private final boolean O(int i) {
        int w = w();
        int i2 = this.g0;
        int i3 = w - i2;
        int size = i2 - size();
        return i3 < i && i3 + size >= i && size >= w() / 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] k() {
        V[] vArr = this.c0;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) C3229c.d(w());
        this.c0 = vArr2;
        return vArr2;
    }

    private final void n(boolean z) {
        int i;
        V[] vArr = this.c0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.g0;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.d0;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                K[] kArr = this.q;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.e0[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        C3229c.g(this.q, i3, i);
        if (vArr != null) {
            C3229c.g(vArr, i3, this.g0);
        }
        this.g0 = i3;
    }

    private final boolean q(Map<?, ?> map) {
        return size() == map.size() && o(map.entrySet());
    }

    private final void r(int i) {
        if (i < 0) {
            throw new OutOfMemoryError();
        }
        if (i > w()) {
            int e2 = AbstractC3127c.q.e(w(), i);
            this.q = (K[]) C3229c.e(this.q, e2);
            V[] vArr = this.c0;
            this.c0 = vArr != null ? (V[]) C3229c.e(vArr, e2) : null;
            int[] copyOf = Arrays.copyOf(this.d0, e2);
            l.e(copyOf, "copyOf(...)");
            this.d0 = copyOf;
            int c2 = o0.c(e2);
            if (c2 > y()) {
                I(c2);
            }
        }
    }

    private final void s(int i) {
        if (O(i)) {
            n(true);
        } else {
            r(this.g0 + i);
        }
    }

    private final int u(K k) {
        int C = C(k);
        int i = this.f0;
        while (true) {
            int i2 = this.e0[C];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (l.a(this.q[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            C = C == 0 ? y() - 1 : C - 1;
        }
    }

    private final int v(V v) {
        int i = this.g0;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.d0[i] >= 0) {
                V[] vArr = this.c0;
                l.c(vArr);
                if (l.a(vArr[i], v)) {
                    return i;
                }
            }
        }
    }

    private final int y() {
        return this.e0.length;
    }

    public int A() {
        return this.j0;
    }

    public Collection<V> B() {
        C3233g<V> c3233g = this.l0;
        if (c3233g != null) {
            return c3233g;
        }
        C3233g<V> c3233g2 = new C3233g<>(this);
        this.l0 = c3233g2;
        return c3233g2;
    }

    public final e<K, V> D() {
        return new e<>(this);
    }

    public final boolean J(Map.Entry<? extends K, ? extends V> entry) {
        l.f(entry, "entry");
        m();
        int u = u(entry.getKey());
        if (u < 0) {
            return false;
        }
        V[] vArr = this.c0;
        l.c(vArr);
        if (!l.a(vArr[u], entry.getValue())) {
            return false;
        }
        K(u);
        return true;
    }

    public final boolean M(K k) {
        m();
        int u = u(k);
        if (u < 0) {
            return false;
        }
        K(u);
        return true;
    }

    public final boolean N(V v) {
        m();
        int v2 = v(v);
        if (v2 < 0) {
            return false;
        }
        K(v2);
        return true;
    }

    public final f<K, V> P() {
        return new f<>(this);
    }

    @Override // java.util.Map
    public void clear() {
        m();
        int i = this.g0 - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.d0;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.e0[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        C3229c.g(this.q, 0, this.g0);
        V[] vArr = this.c0;
        if (vArr != null) {
            C3229c.g(vArr, 0, this.g0);
        }
        this.j0 = 0;
        this.g0 = 0;
        H();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return u(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return v(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return x();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Map) && q((Map) obj);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        int u = u(obj);
        if (u < 0) {
            return null;
        }
        V[] vArr = this.c0;
        l.c(vArr);
        return vArr[u];
    }

    @Override // java.util.Map
    public int hashCode() {
        b<K, V> t = t();
        int i = 0;
        while (t.hasNext()) {
            i += t.m();
        }
        return i;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final int j(K k) {
        m();
        while (true) {
            int C = C(k);
            int d = ax.Lb.f.d(this.f0 * 2, y() / 2);
            int i = 0;
            while (true) {
                int i2 = this.e0[C];
                if (i2 <= 0) {
                    if (this.g0 < w()) {
                        int i3 = this.g0;
                        int i4 = i3 + 1;
                        this.g0 = i4;
                        this.q[i3] = k;
                        this.d0[i3] = C;
                        this.e0[C] = i4;
                        this.j0 = size() + 1;
                        H();
                        if (i > this.f0) {
                            this.f0 = i;
                        }
                        return i3;
                    }
                    s(1);
                } else {
                    if (l.a(this.q[i2 - 1], k)) {
                        return -i2;
                    }
                    i++;
                    if (i > d) {
                        I(y() * 2);
                        break;
                    }
                    C = C == 0 ? y() - 1 : C - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return z();
    }

    public final Map<K, V> l() {
        m();
        this.n0 = true;
        if (size() > 0) {
            return this;
        }
        C3230d c3230d = p0;
        l.d(c3230d, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c3230d;
    }

    public final void m() {
        if (this.n0) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean o(Collection<?> collection) {
        l.f(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!p((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean p(Map.Entry<? extends K, ? extends V> entry) {
        l.f(entry, "entry");
        int u = u(entry.getKey());
        if (u < 0) {
            return false;
        }
        V[] vArr = this.c0;
        l.c(vArr);
        return l.a(vArr[u], entry.getValue());
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        m();
        int j = j(k);
        V[] k2 = k();
        if (j >= 0) {
            k2[j] = v;
            return null;
        }
        int i = (-j) - 1;
        V v2 = k2[i];
        k2[i] = v;
        return v2;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        l.f(map, "from");
        m();
        E(map.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object obj) {
        m();
        int u = u(obj);
        if (u < 0) {
            return null;
        }
        V[] vArr = this.c0;
        l.c(vArr);
        V v = vArr[u];
        K(u);
        return v;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return A();
    }

    public final b<K, V> t() {
        return new b<>(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b<K, V> t = t();
        int i = 0;
        while (t.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            t.l(sb);
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        l.e(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return B();
    }

    public final int w() {
        return this.q.length;
    }

    public Set<Map.Entry<K, V>> x() {
        C3231e<K, V> c3231e = this.m0;
        if (c3231e != null) {
            return c3231e;
        }
        C3231e<K, V> c3231e2 = new C3231e<>(this);
        this.m0 = c3231e2;
        return c3231e2;
    }

    public Set<K> z() {
        C3232f<K> c3232f = this.k0;
        if (c3232f != null) {
            return c3232f;
        }
        C3232f<K> c3232f2 = new C3232f<>(this);
        this.k0 = c3232f2;
        return c3232f2;
    }

    public C3230d() {
        this(8);
    }

    public C3230d(int i) {
        this(C3229c.d(i), null, new int[i], new int[o0.c(i)], 2, 0);
    }
}
