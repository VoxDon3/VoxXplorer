/*
 * Decompiled with CFR 0.152.
 */
package ax.ub;

import ax.Gb.l;
import ax.ub.g;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public final class d<K, V>
implements Map<K, V>,
Serializable,
ax.Hb.c {
    public static final a o0 = new a(null);
    private static final d p0;
    private V[] c0;
    private int[] d0;
    private int[] e0;
    private int f0;
    private int g0;
    private int h0;
    private int i0;
    private int j0;
    private ax.ub.f<K> k0;
    private g<V> l0;
    private ax.ub.e<K, V> m0;
    private boolean n0;
    private K[] q;

    static {
        d d8 = new d(0);
        d8.n0 = true;
        p0 = d8;
    }

    public d() {
        this(8);
    }

    public d(int n8) {
        this(ax.ub.c.d(n8), null, new int[n8], new int[d.o0.c(n8)], 2, 0);
    }

    private d(K[] KArray, V[] VArray, int[] nArray, int[] nArray2, int n8, int n9) {
        this.q = KArray;
        this.c0 = VArray;
        this.d0 = nArray;
        this.e0 = nArray2;
        this.f0 = n8;
        this.g0 = n9;
        this.h0 = d.o0.d(this.y());
    }

    private final int C(K k8) {
        int n8 = k8 != null ? k8.hashCode() : 0;
        return n8 * -1640531527 >>> this.h0;
    }

    private final boolean E(Collection<? extends Map.Entry<? extends K, ? extends V>> object) {
        boolean bl = object.isEmpty();
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        this.s(object.size());
        object = object.iterator();
        while (object.hasNext()) {
            if (!this.F((Map.Entry)object.next())) continue;
            bl2 = true;
        }
        return bl2;
    }

    private final boolean F(Map.Entry<? extends K, ? extends V> entry) {
        int n8 = this.j(entry.getKey());
        V[] VArray = this.k();
        if (n8 >= 0) {
            VArray[n8] = entry.getValue();
            return true;
        }
        n8 = -n8 - 1;
        V v8 = VArray[n8];
        if (!l.a(entry.getValue(), v8)) {
            VArray[n8] = entry.getValue();
            return true;
        }
        return false;
    }

    private final boolean G(int n8) {
        int n9 = this.C(this.q[n8]);
        int n10 = this.f0;
        while (true) {
            int[] nArray;
            if ((nArray = this.e0)[n9] == 0) {
                nArray[n9] = n8 + 1;
                this.d0[n8] = n9;
                return true;
            }
            if (--n10 < 0) {
                return false;
            }
            if (n9 == 0) {
                n9 = this.y() - 1;
                continue;
            }
            --n9;
        }
    }

    private final void H() {
        ++this.i0;
    }

    private final void I(int n8) {
        this.H();
        int n9 = this.g0;
        int n10 = this.size();
        int n11 = 0;
        if (n9 > n10) {
            this.n(false);
        }
        this.e0 = new int[n8];
        this.h0 = d.o0.d(n8);
        for (n8 = n11; n8 < this.g0; ++n8) {
            if (this.G(n8)) {
                continue;
            }
            throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
        }
    }

    private final void K(int n8) {
        ax.ub.c.f(this.q, n8);
        V[] VArray = this.c0;
        if (VArray != null) {
            ax.ub.c.f(VArray, n8);
        }
        this.L(this.d0[n8]);
        this.d0[n8] = -1;
        this.j0 = this.size() - 1;
        this.H();
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void L(int n8) {
        int n9;
        int n10 = ax.Lb.f.d(this.f0 * 2, this.y() / 2);
        int n11 = 0;
        int n12 = n8;
        do {
            int n13;
            block8: {
                block7: {
                    int n14;
                    block6: {
                        n8 = n8 == 0 ? this.y() - 1 : --n8;
                        n9 = n11 + 1;
                        if (n9 > this.f0) {
                            this.e0[n12] = 0;
                            return;
                        }
                        int[] nArray = this.e0;
                        n14 = nArray[n8];
                        if (n14 == 0) {
                            nArray[n12] = 0;
                            return;
                        }
                        if (n14 >= 0) break block6;
                        nArray[n12] = -1;
                        break block7;
                    }
                    K[] KArray = this.q;
                    int n15 = n14 - 1;
                    n13 = n12;
                    n11 = n9;
                    if ((this.C(KArray[n15]) - n8 & this.y() - 1) < n9) break block8;
                    this.e0[n12] = n14;
                    this.d0[n15] = n12;
                }
                n13 = n8;
                n11 = 0;
            }
            n9 = n10 - 1;
            n12 = n13;
            n10 = n9;
        } while (n9 >= 0);
        this.e0[n13] = -1;
    }

    private final boolean O(int n8) {
        int n9 = this.w();
        int n10 = this.g0;
        return (n9 -= n10) < n8 && n9 + (n10 -= this.size()) >= n8 && n10 >= this.w() / 4;
    }

    private final V[] k() {
        Object[] objectArray = this.c0;
        if (objectArray != null) {
            return objectArray;
        }
        this.c0 = objectArray = ax.ub.c.d(this.w());
        return objectArray;
    }

    private final void n(boolean bl) {
        int n8;
        V[] VArray = this.c0;
        int n9 = 0;
        for (int i8 = 0; i8 < (n8 = this.g0); ++i8) {
            int[] nArray = this.d0;
            int n10 = nArray[i8];
            n8 = n9;
            if (n10 >= 0) {
                K[] KArray = this.q;
                KArray[n9] = KArray[i8];
                if (VArray != null) {
                    VArray[n9] = VArray[i8];
                }
                if (bl) {
                    nArray[n9] = n10;
                    this.e0[n10] = n9 + 1;
                }
                n8 = n9 + 1;
            }
            n9 = n8;
        }
        ax.ub.c.g(this.q, n9, n8);
        if (VArray != null) {
            ax.ub.c.g(VArray, n9, this.g0);
        }
        this.g0 = n9;
    }

    private final boolean q(Map<?, ?> map) {
        return this.size() == map.size() && this.o(map.entrySet());
    }

    private final void r(int n8) {
        if (n8 >= 0) {
            if (n8 > this.w()) {
                n8 = ax.tb.c.q.e(this.w(), n8);
                this.q = ax.ub.c.e(this.q, n8);
                Object object = this.c0;
                object = object != null ? ax.ub.c.e(object, n8) : null;
                this.c0 = object;
                object = Arrays.copyOf(this.d0, n8);
                l.e(object, "copyOf(...)");
                this.d0 = (int[])object;
                n8 = d.o0.c(n8);
                if (n8 > this.y()) {
                    this.I(n8);
                }
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void s(int n8) {
        if (this.O(n8)) {
            this.n(true);
            return;
        }
        this.r(this.g0 + n8);
    }

    private final int u(K k8) {
        int n8 = this.C(k8);
        int n9 = this.f0;
        int n10;
        while ((n10 = this.e0[n8]) != 0) {
            K[] KArray;
            if (n10 > 0 && l.a((KArray = this.q)[--n10], k8)) {
                return n10;
            }
            if (--n9 < 0) {
                return -1;
            }
            if (n8 == 0) {
                n8 = this.y() - 1;
                continue;
            }
            --n8;
        }
        return -1;
    }

    private final int v(V v8) {
        int n8;
        int n9 = this.g0;
        while ((n8 = n9 - 1) >= 0) {
            n9 = n8;
            if (this.d0[n8] < 0) continue;
            V[] VArray = this.c0;
            l.c(VArray);
            n9 = n8;
            if (!l.a(VArray[n8], v8)) continue;
            return n8;
        }
        return -1;
    }

    private final int y() {
        return this.e0.length;
    }

    public int A() {
        return this.j0;
    }

    public Collection<V> B() {
        g<V> g8;
        g<V> g9 = g8 = this.l0;
        if (g8 == null) {
            this.l0 = g9 = new g(this);
        }
        return g9;
    }

    public final e<K, V> D() {
        return new e(this);
    }

    public final boolean J(Map.Entry<? extends K, ? extends V> entry) {
        l.f(entry, "entry");
        this.m();
        int n8 = this.u(entry.getKey());
        if (n8 < 0) {
            return false;
        }
        V[] VArray = this.c0;
        l.c(VArray);
        if (!l.a(VArray[n8], entry.getValue())) {
            return false;
        }
        this.K(n8);
        return true;
    }

    public final boolean M(K k8) {
        this.m();
        int n8 = this.u(k8);
        if (n8 < 0) {
            return false;
        }
        this.K(n8);
        return true;
    }

    public final boolean N(V v8) {
        this.m();
        int n8 = this.v(v8);
        if (n8 < 0) {
            return false;
        }
        this.K(n8);
        return true;
    }

    public final f<K, V> P() {
        return new f(this);
    }

    @Override
    public void clear() {
        Object[] objectArray;
        this.m();
        int n8 = this.g0 - 1;
        if (n8 >= 0) {
            int n9 = 0;
            while (true) {
                int n10;
                if ((n10 = (objectArray = this.d0)[n9]) >= 0) {
                    this.e0[n10] = 0;
                    objectArray[n9] = -1;
                }
                if (n9 == n8) break;
                ++n9;
            }
        }
        ax.ub.c.g(this.q, 0, this.g0);
        objectArray = this.c0;
        if (objectArray != null) {
            ax.ub.c.g(objectArray, 0, this.g0);
        }
        this.j0 = 0;
        this.g0 = 0;
        this.H();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.u(object) >= 0;
    }

    @Override
    public boolean containsValue(Object object) {
        return this.v(object) >= 0;
    }

    @Override
    public boolean equals(Object object) {
        return object == this || object instanceof Map && this.q((Map)object);
        {
        }
    }

    @Override
    public V get(Object VArray) {
        int n8 = this.u(VArray);
        if (n8 < 0) {
            return null;
        }
        VArray = this.c0;
        l.c(VArray);
        return VArray[n8];
    }

    @Override
    public int hashCode() {
        b<K, V> b8 = this.t();
        int n8 = 0;
        while (b8.hasNext()) {
            n8 += b8.m();
        }
        return n8;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    public final int j(K k8) {
        this.m();
        block0: while (true) {
            int n8 = this.C(k8);
            int n9 = ax.Lb.f.d(this.f0 * 2, this.y() / 2);
            int n10 = 0;
            while (true) {
                int n11;
                if ((n11 = this.e0[n8]) <= 0) {
                    if (this.g0 >= this.w()) {
                        this.s(1);
                        continue block0;
                    }
                    n9 = this.g0;
                    this.g0 = n11 = n9 + 1;
                    this.q[n9] = k8;
                    this.d0[n9] = n8;
                    this.e0[n8] = n11;
                    this.j0 = this.size() + 1;
                    this.H();
                    if (n10 > this.f0) {
                        this.f0 = n10;
                    }
                    return n9;
                }
                if (l.a(this.q[n11 - 1], k8)) {
                    return -n11;
                }
                if (++n10 > n9) {
                    this.I(this.y() * 2);
                    continue block0;
                }
                if (n8 == 0) {
                    n8 = this.y() - 1;
                    continue;
                }
                --n8;
            }
            break;
        }
    }

    public final Map<K, V> l() {
        this.m();
        this.n0 = true;
        if (this.size() > 0) {
            return this;
        }
        d d8 = p0;
        l.d(d8, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return d8;
    }

    public final void m() {
        if (!this.n0) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean o(Collection<?> iterator) {
        l.f(iterator, "m");
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Object e8 = iterator.next();
            if (e8 != null) {
                boolean bl = this.p((Map.Entry)e8);
                if (bl) continue;
            }
            return false;
        }
        return true;
        catch (ClassCastException classCastException) {
            return false;
        }
    }

    public final boolean p(Map.Entry<? extends K, ? extends V> entry) {
        l.f(entry, "entry");
        int n8 = this.u(entry.getKey());
        if (n8 < 0) {
            return false;
        }
        V[] VArray = this.c0;
        l.c(VArray);
        return l.a(VArray[n8], entry.getValue());
    }

    @Override
    public V put(K object, V v8) {
        this.m();
        int n8 = this.j(object);
        object = this.k();
        if (n8 < 0) {
            n8 = -n8 - 1;
            K k8 = object[n8];
            object[n8] = v8;
            return (V)k8;
        }
        object[n8] = v8;
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> map) {
        l.f(map, "from");
        this.m();
        this.E(map.entrySet());
    }

    @Override
    public V remove(Object object) {
        this.m();
        int n8 = this.u(object);
        if (n8 < 0) {
            return null;
        }
        object = this.c0;
        l.c(object);
        object = object[n8];
        this.K(n8);
        return (V)object;
    }

    public final b<K, V> t() {
        return new b(this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.size() * 3 + 2);
        stringBuilder.append("{");
        Object object = this.t();
        int n8 = 0;
        while (((d)object).hasNext()) {
            if (n8 > 0) {
                stringBuilder.append(", ");
            }
            ((b)object).l(stringBuilder);
            ++n8;
        }
        stringBuilder.append("}");
        object = stringBuilder.toString();
        l.e(object, "toString(...)");
        return object;
    }

    public final int w() {
        return this.q.length;
    }

    public Set<Map.Entry<K, V>> x() {
        ax.ub.e<K, V> e8;
        ax.ub.e<K, V> e9 = e8 = this.m0;
        if (e8 == null) {
            this.m0 = e9 = new ax.ub.e(this);
        }
        return e9;
    }

    public Set<K> z() {
        ax.ub.f<K> f8;
        ax.ub.f<Object> f9 = f8 = this.k0;
        if (f8 == null) {
            this.k0 = f9 = new ax.ub.f(this);
        }
        return f9;
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ax.Gb.g g8) {
            this();
        }

        private final int c(int n8) {
            return Integer.highestOneBit(ax.Lb.f.b(n8, 1) * 3);
        }

        private final int d(int n8) {
            return Integer.numberOfLeadingZeros(n8) + 1;
        }

        public final d e() {
            return p0;
        }
    }

    public static final class b<K, V>
    extends d<K, V>
    implements Iterator<Map.Entry<K, V>>,
    ax.Hb.a {
        public b(d<K, V> d8) {
            l.f(d8, "map");
            super(d8);
        }

        public c<K, V> k() {
            this.b();
            if (this.c() < this.f().g0) {
                int n8 = this.c();
                this.i(n8 + 1);
                this.j(n8);
                c c8 = new c(this.f(), this.e());
                this.g();
                return c8;
            }
            throw new NoSuchElementException();
        }

        public final void l(StringBuilder stringBuilder) {
            l.f(stringBuilder, "sb");
            if (this.c() < this.f().g0) {
                int n8 = this.c();
                this.i(n8 + 1);
                this.j(n8);
                Object object = this.f().q[this.e()];
                if (object == this.f()) {
                    stringBuilder.append("(this Map)");
                } else {
                    stringBuilder.append(object);
                }
                stringBuilder.append('=');
                object = this.f().c0;
                l.c(object);
                object = object[this.e()];
                if (object == this.f()) {
                    stringBuilder.append("(this Map)");
                } else {
                    stringBuilder.append(object);
                }
                this.g();
                return;
            }
            throw new NoSuchElementException();
        }

        public final int m() {
            if (this.c() < this.f().g0) {
                int n8 = this.c();
                this.i(n8 + 1);
                this.j(n8);
                Object object = this.f().q[this.e()];
                int n9 = 0;
                n8 = object != null ? object.hashCode() : 0;
                object = this.f().c0;
                l.c(object);
                object = object[this.e()];
                if (object != null) {
                    n9 = object.hashCode();
                }
                this.g();
                return n8 ^ n9;
            }
            throw new NoSuchElementException();
        }
    }

    public static final class c<K, V>
    implements Map.Entry<K, V>,
    ax.Hb.a {
        private final int c0;
        private final int d0;
        private final d<K, V> q;

        public c(d<K, V> d8, int n8) {
            l.f(d8, "map");
            this.q = d8;
            this.c0 = n8;
            this.d0 = ((d)d8).i0;
        }

        private final void a() {
            if (((d)this.q).i0 == this.d0) {
                return;
            }
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }

        @Override
        public boolean equals(Object object) {
            return object instanceof Map.Entry && l.a((object = (Map.Entry)object).getKey(), this.getKey()) && l.a(object.getValue(), this.getValue());
        }

        @Override
        public K getKey() {
            this.a();
            return (K)((d)this.q).q[this.c0];
        }

        @Override
        public V getValue() {
            this.a();
            Object[] objectArray = ((d)this.q).c0;
            l.c(objectArray);
            return (V)objectArray[this.c0];
        }

        @Override
        public int hashCode() {
            Object object = this.getKey();
            int n8 = 0;
            int n9 = object != null ? object.hashCode() : 0;
            object = this.getValue();
            if (object != null) {
                n8 = object.hashCode();
            }
            return n9 ^ n8;
        }

        @Override
        public V setValue(V v8) {
            this.a();
            this.q.m();
            Object[] objectArray = ((d)this.q).k();
            int n8 = this.c0;
            Object object = objectArray[n8];
            objectArray[n8] = v8;
            return (V)object;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.getKey());
            stringBuilder.append('=');
            stringBuilder.append(this.getValue());
            return stringBuilder.toString();
        }
    }

    public static class d<K, V> {
        private int c0;
        private int d0;
        private int e0;
        private final d<K, V> q;

        public d(d<K, V> d8) {
            l.f(d8, "map");
            this.q = d8;
            this.d0 = -1;
            this.e0 = ((d)d8).i0;
            this.g();
        }

        public final void b() {
            if (((d)this.q).i0 == this.e0) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        public final int c() {
            return this.c0;
        }

        public final int e() {
            return this.d0;
        }

        public final d<K, V> f() {
            return this.q;
        }

        public final void g() {
            int n8;
            int[] nArray;
            while (this.c0 < ((d)this.q).g0 && (nArray = ((d)this.q).d0)[n8 = this.c0] < 0) {
                this.c0 = n8 + 1;
            }
        }

        public final boolean hasNext() {
            return this.c0 < ((d)this.q).g0;
        }

        public final void i(int n8) {
            this.c0 = n8;
        }

        public final void j(int n8) {
            this.d0 = n8;
        }

        public final void remove() {
            this.b();
            if (this.d0 != -1) {
                this.q.m();
                ((d)this.q).K(this.d0);
                this.d0 = -1;
                this.e0 = ((d)this.q).i0;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
    }

    public static final class e<K, V>
    extends d<K, V>
    implements Iterator<K>,
    ax.Hb.a {
        public e(d<K, V> d8) {
            l.f(d8, "map");
            super(d8);
        }

        @Override
        public K next() {
            this.b();
            if (this.c() < this.f().g0) {
                int n8 = this.c();
                this.i(n8 + 1);
                this.j(n8);
                Object object = this.f().q[this.e()];
                this.g();
                return (K)object;
            }
            throw new NoSuchElementException();
        }
    }

    public static final class f<K, V>
    extends d<K, V>
    implements Iterator<V>,
    ax.Hb.a {
        public f(d<K, V> d8) {
            l.f(d8, "map");
            super(d8);
        }

        @Override
        public V next() {
            this.b();
            if (this.c() < this.f().g0) {
                int n8 = this.c();
                this.i(n8 + 1);
                this.j(n8);
                Object object = this.f().c0;
                l.c(object);
                object = object[this.e()];
                this.g();
                return (V)object;
            }
            throw new NoSuchElementException();
        }
    }
}

