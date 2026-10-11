/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.h;
import ax.r7.A;
import ax.r7.B;
import ax.r7.C;
import ax.r7.E;
import ax.r7.T;
import ax.r7.b0;
import ax.r7.j0;
import ax.r7.p;
import ax.r7.x;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

public class D<K, V>
extends B<K, V>
implements b0<K, V> {
    private final transient C<V> h0;
    private transient C<Map.Entry<K, V>> i0;

    D(A<K, C<V>> a8, int n8, Comparator<? super V> comparator) {
        super(a8, n8);
        this.h0 = D.t(comparator);
    }

    private static <V> C<V> t(Comparator<? super V> comparator) {
        if (comparator == null) {
            return C.y();
        }
        return E.O(comparator);
    }

    static <K, V> D<K, V> v(Collection<? extends Map.Entry<K, x.b<V>>> object, Comparator<? super V> comparator) {
        if (object.isEmpty()) {
            return D.x();
        }
        A.a a8 = new A.a(object.size());
        object = object.iterator();
        int n8 = 0;
        while (object.hasNext()) {
            Object object2 = (Map.Entry)object.next();
            Object k8 = object2.getKey();
            if (((AbstractCollection)(object2 = D.y(comparator, ((C.a)object2.getValue()).l()))).isEmpty()) continue;
            a8.f(k8, object2);
            n8 += ((AbstractCollection)object2).size();
        }
        return new D(a8.c(), n8, comparator);
    }

    public static <K, V> D<K, V> x() {
        return p.j0;
    }

    private static <V> C<V> y(Comparator<? super V> comparator, Collection<? extends V> collection) {
        if (comparator == null) {
            return C.t(collection);
        }
        return E.J(comparator, collection);
    }

    public C<Map.Entry<K, V>> u() {
        C<Map.Entry<K, V>> c8;
        C<Map.Entry<K, V>> c9 = c8 = this.i0;
        if (c8 == null) {
            this.i0 = c9 = new b(this);
        }
        return c9;
    }

    public C<V> w(K k8) {
        return h.a((C)this.f0.get(k8), this.h0);
    }

    public static final class a<K, V>
    extends B.c<K, V> {
        public D<K, V> a() {
            Object object = this.a;
            if (object == null) {
                return D.x();
            }
            Set set = object.entrySet();
            Comparator comparator = this.b;
            object = set;
            if (comparator != null) {
                object = T.b(comparator).e().c(set);
            }
            return D.v(object, this.c);
        }
    }

    private static final class b<K, V>
    extends C<Map.Entry<K, V>> {
        private final transient D<K, V> d0;

        b(D<K, V> d8) {
            this.d0 = d8;
        }

        @Override
        public boolean contains(Object object) {
            if (object instanceof Map.Entry) {
                object = (Map.Entry)object;
                return this.d0.c(object.getKey(), object.getValue());
            }
            return false;
        }

        @Override
        boolean l() {
            return false;
        }

        @Override
        public j0<Map.Entry<K, V>> n() {
            return this.d0.p();
        }

        @Override
        public int size() {
            return this.d0.size();
        }
    }
}

