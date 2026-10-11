/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.n;
import ax.q7.u;
import ax.r7.H;
import ax.r7.N;
import ax.r7.T;
import ax.r7.U;
import ax.r7.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class M<K0, V0> {
    private M() {
    }

    public static e<Object> a() {
        return M.b(8);
    }

    public static e<Object> b(int n8) {
        i.b(n8, "expectedKeys");
        return new e<Object>(n8){
            final int a;
            {
                this.a = n8;
            }

            @Override
            <K, V> Map<K, Collection<V>> c() {
                return U.c(this.a);
            }
        };
    }

    public static e<Comparable> c() {
        return M.d(T.d());
    }

    public static <K0> e<K0> d(Comparator<K0> comparator) {
        n.n(comparator);
        return new e<K0>(comparator){
            final Comparator a;
            {
                this.a = comparator;
            }

            @Override
            <K extends K0, V> Map<K, Collection<V>> c() {
                return new TreeMap(this.a);
            }
        };
    }

    private static final class c<V>
    implements u<List<V>>,
    Serializable {
        private final int q;

        c(int n8) {
            this.q = i.b(n8, "expectedValuesPerKey");
        }

        public List<V> a() {
            return new ArrayList(this.q);
        }
    }

    public static abstract class d<K0, V0>
    extends M<K0, V0> {
        d() {
        }

        public abstract <K extends K0, V extends V0> H<K, V> e();
    }

    public static abstract class e<K0> {
        e() {
        }

        public d<K0, Object> a() {
            return this.b(2);
        }

        public d<K0, Object> b(int n8) {
            i.b(n8, "expectedValuesPerKey");
            return new d<K0, Object>(this, n8){
                final int a;
                final e b;
                {
                    this.a = n8;
                    this.b = e8;
                }

                @Override
                public <K extends K0, V> H<K, V> e() {
                    return N.b(this.b.c(), new c(this.a));
                }
            };
        }

        abstract <K extends K0, V> Map<K, Collection<V>> c();
    }
}

