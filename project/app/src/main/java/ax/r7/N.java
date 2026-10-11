/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.n;
import ax.q7.u;
import ax.r7.H;
import ax.r7.L;
import ax.r7.c;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class N {
    static boolean a(L<?, ?> l8, Object object) {
        if (object == l8) {
            return true;
        }
        if (object instanceof L) {
            object = (L)object;
            return l8.b().equals(object.b());
        }
        return false;
    }

    public static <K, V> H<K, V> b(Map<K, Collection<V>> map, u<? extends List<V>> u8) {
        return new a<K, V>(map, u8);
    }

    private static class a<K, V>
    extends c<K, V> {
        transient u<? extends List<V>> h0;

        a(Map<K, Collection<V>> map, u<? extends List<V>> u8) {
            super(map);
            this.h0 = n.n(u8);
        }

        protected List<V> C() {
            return this.h0.get();
        }

        @Override
        Map<K, Collection<V>> e() {
            return this.u();
        }

        @Override
        Set<K> g() {
            return this.v();
        }
    }

    static abstract class b<K, V>
    extends AbstractCollection<Map.Entry<K, V>> {
        b() {
        }

        @Override
        public void clear() {
            this.e().clear();
        }

        @Override
        public boolean contains(Object object) {
            if (object instanceof Map.Entry) {
                object = (Map.Entry)object;
                return this.e().c(object.getKey(), object.getValue());
            }
            return false;
        }

        abstract L<K, V> e();

        @Override
        public boolean remove(Object object) {
            if (object instanceof Map.Entry) {
                object = (Map.Entry)object;
                return this.e().remove(object.getKey(), object.getValue());
            }
            return false;
        }

        @Override
        public int size() {
            return this.e().size();
        }
    }
}

