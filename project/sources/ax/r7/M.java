package ax.r7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public abstract class M<K0, V0> {

    class a extends e<Object> {
        final /* synthetic */ int a;

        a(int i) {
            this.a = i;
        }

        @Override // ax.r7.M.e
        <K, V> Map<K, Collection<V>> c() {
            return U.c(this.a);
        }
    }

    class b extends e<K0> {
        final /* synthetic */ Comparator a;

        b(Comparator comparator) {
            this.a = comparator;
        }

        @Override // ax.r7.M.e
        <K extends K0, V> Map<K, Collection<V>> c() {
            return new TreeMap(this.a);
        }
    }

    private static final class c<V> implements ax.q7.u<List<V>>, Serializable {
        private final int q;

        c(int i) {
            this.q = C2975i.b(i, "expectedValuesPerKey");
        }

        @Override // ax.q7.u
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<V> get() {
            return new ArrayList(this.q);
        }
    }

    public static abstract class d<K0, V0> extends M<K0, V0> {
        d() {
            super(null);
        }

        public abstract <K extends K0, V extends V0> H<K, V> e();
    }

    public static abstract class e<K0> {

        class a extends d<K0, Object> {
            final /* synthetic */ int a;
            final /* synthetic */ e b;

            a(e eVar, int i) {
                this.a = i;
                this.b = eVar;
            }

            @Override // ax.r7.M.d
            public <K extends K0, V> H<K, V> e() {
                return N.b(this.b.c(), new c(this.a));
            }
        }

        e() {
        }

        public d<K0, Object> a() {
            return b(2);
        }

        public d<K0, Object> b(int i) {
            C2975i.b(i, "expectedValuesPerKey");
            return new a(this, i);
        }

        abstract <K extends K0, V> Map<K, Collection<V>> c();
    }

    /* synthetic */ M(a aVar) {
        this();
    }

    public static e<Object> a() {
        return b(8);
    }

    public static e<Object> b(int i) {
        C2975i.b(i, "expectedKeys");
        return new a(i);
    }

    public static e<Comparable> c() {
        return d(T.d());
    }

    public static <K0> e<K0> d(Comparator<K0> comparator) {
        ax.q7.n.n(comparator);
        return new b(comparator);
    }

    private M() {
    }
}
