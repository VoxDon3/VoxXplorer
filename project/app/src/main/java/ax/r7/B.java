/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.r7.A;
import ax.r7.G;
import ax.r7.K;
import ax.r7.g;
import ax.r7.j0;
import ax.r7.x;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class B<K, V>
extends g<K, V>
implements Serializable {
    final transient A<K, ? extends x<V>> f0;
    final transient int g0;

    B(A<K, ? extends x<V>> a8, int n8) {
        this.f0 = a8;
        this.g0 = n8;
    }

    @Override
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean d(Object object) {
        return object != null && super.d(object);
    }

    @Override
    Map<K, Collection<V>> e() {
        throw new AssertionError((Object)"should never be called");
    }

    @Override
    Set<K> g() {
        throw new AssertionError((Object)"unreachable");
    }

    public A<K, Collection<V>> l() {
        return this.f0;
    }

    x<Map.Entry<K, V>> m() {
        return new d(this);
    }

    x<V> n() {
        return new e(this);
    }

    public x<Map.Entry<K, V>> o() {
        return (x)super.a();
    }

    j0<Map.Entry<K, V>> p() {
        return new j0<Map.Entry<K, V>>(this){
            K c0;
            Iterator<V> d0;
            final B e0;
            final Iterator<? extends Map.Entry<K, ? extends x<V>>> q;
            {
                this.e0 = b8;
                this.q = b8.f0.g().n();
                this.c0 = null;
                this.d0 = G.g();
            }

            public Map.Entry<K, V> b() {
                Object object;
                if (!this.d0.hasNext()) {
                    object = this.q.next();
                    this.c0 = object.getKey();
                    this.d0 = ((x)object.getValue()).n();
                }
                object = this.c0;
                j.Objects.requireNonNull(object);
                return K.d(object, this.d0.next());
            }

            @Override
            public boolean hasNext() {
                return this.d0.hasNext() || this.q.hasNext();
                {
                }
            }
        };
    }

    @Override
    @Deprecated
    public final boolean put(K k8, V v8) {
        throw new UnsupportedOperationException();
    }

    public abstract x<V> q(K var1);

    j0<V> r() {
        return new j0<V>(this){
            Iterator<V> c0;
            final B d0;
            Iterator<? extends x<V>> q;
            {
                this.d0 = b8;
                this.q = b8.f0.l().n();
                this.c0 = G.g();
            }

            @Override
            public boolean hasNext() {
                return this.c0.hasNext() || this.q.hasNext();
                {
                }
            }

            @Override
            public V next() {
                if (!this.c0.hasNext()) {
                    this.c0 = this.q.next().n();
                }
                return this.c0.next();
            }
        };
    }

    @Override
    @Deprecated
    public final boolean remove(Object object, Object object2) {
        throw new UnsupportedOperationException();
    }

    public x<V> s() {
        return (x)super.values();
    }

    @Override
    public int size() {
        return this.g0;
    }

    public static class c<K, V> {
        Map<K, x.b<V>> a;
        Comparator<? super K> b;
        Comparator<? super V> c;
        int d = 4;
    }

    private static class d<K, V>
    extends x<Map.Entry<K, V>> {
        final B<K, V> c0;

        d(B<K, V> b8) {
            this.c0 = b8;
        }

        @Override
        public boolean contains(Object object) {
            if (object instanceof Map.Entry) {
                object = (Map.Entry)object;
                return this.c0.c(object.getKey(), object.getValue());
            }
            return false;
        }

        @Override
        public j0<Map.Entry<K, V>> n() {
            return this.c0.p();
        }

        @Override
        public int size() {
            return this.c0.size();
        }
    }

    private static final class e<K, V>
    extends x<V> {
        private final transient B<K, V> c0;

        e(B<K, V> b8) {
            this.c0 = b8;
        }

        @Override
        public boolean contains(Object object) {
            return this.c0.d(object);
        }

        @Override
        int g(Object[] objectArray, int n8) {
            j0 j02 = this.c0.f0.l().n();
            while (j02.hasNext()) {
                n8 = ((x)j02.next()).g(objectArray, n8);
            }
            return n8;
        }

        @Override
        public j0<V> n() {
            return this.c0.r();
        }

        @Override
        public int size() {
            return this.c0.size();
        }
    }
}

