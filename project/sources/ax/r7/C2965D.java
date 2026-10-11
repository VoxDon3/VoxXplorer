package ax.r7;

import ax.q7.C2881h;
import ax.r7.AbstractC2962A;
import ax.r7.AbstractC2963B;
import ax.r7.AbstractC2964C;
import ax.r7.AbstractC2989x;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

/* renamed from: ax.r7.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2965D<K, V> extends AbstractC2963B<K, V> implements b0<K, V> {
    private final transient AbstractC2964C<V> h0;
    private transient AbstractC2964C<Map.Entry<K, V>> i0;

    /* renamed from: ax.r7.D$a */
    public static final class a<K, V> extends AbstractC2963B.c<K, V> {
        public C2965D<K, V> a() {
            Map<K, AbstractC2989x.b<V>> map = this.a;
            if (map == null) {
                return C2965D.x();
            }
            Collection entrySet = map.entrySet();
            Comparator<? super K> comparator = this.b;
            if (comparator != null) {
                entrySet = T.b(comparator).e().c(entrySet);
            }
            return C2965D.v(entrySet, this.c);
        }
    }

    /* renamed from: ax.r7.D$b */
    private static final class b<K, V> extends AbstractC2964C<Map.Entry<K, V>> {
        private final transient C2965D<K, V> d0;

        b(C2965D<K, V> c2965d) {
            this.d0 = c2965d;
        }

        @Override // ax.r7.AbstractC2989x, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.d0.c(entry.getKey(), entry.getValue());
        }

        @Override // ax.r7.AbstractC2989x
        boolean l() {
            return false;
        }

        @Override // ax.r7.AbstractC2964C, ax.r7.AbstractC2989x, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: n */
        public j0<Map.Entry<K, V>> iterator() {
            return this.d0.i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.d0.size();
        }
    }

    C2965D(AbstractC2962A<K, AbstractC2964C<V>> abstractC2962A, int i, Comparator<? super V> comparator) {
        super(abstractC2962A, i);
        this.h0 = t(comparator);
    }

    private static <V> AbstractC2964C<V> t(Comparator<? super V> comparator) {
        return comparator == null ? AbstractC2964C.y() : AbstractC2966E.O(comparator);
    }

    static <K, V> C2965D<K, V> v(Collection<? extends Map.Entry<K, AbstractC2989x.b<V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return x();
        }
        AbstractC2962A.a aVar = new AbstractC2962A.a(collection.size());
        int i = 0;
        for (Map.Entry<K, AbstractC2989x.b<V>> entry : collection) {
            K key = entry.getKey();
            AbstractC2964C y = y(comparator, ((AbstractC2964C.a) entry.getValue()).l());
            if (!y.isEmpty()) {
                aVar.f(key, y);
                i += y.size();
            }
        }
        return new C2965D<>(aVar.c(), i, comparator);
    }

    public static <K, V> C2965D<K, V> x() {
        return C2982p.j0;
    }

    private static <V> AbstractC2964C<V> y(Comparator<? super V> comparator, Collection<? extends V> collection) {
        return comparator == null ? AbstractC2964C.t(collection) : AbstractC2966E.J(comparator, collection);
    }

    @Override // ax.r7.AbstractC2963B
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public AbstractC2964C<Map.Entry<K, V>> a() {
        AbstractC2964C<Map.Entry<K, V>> abstractC2964C = this.i0;
        if (abstractC2964C != null) {
            return abstractC2964C;
        }
        b bVar = new b(this);
        this.i0 = bVar;
        return bVar;
    }

    @Override // ax.r7.AbstractC2963B
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public AbstractC2964C<V> get(K k) {
        return (AbstractC2964C) C2881h.a((AbstractC2964C) this.f0.get(k), this.h0);
    }
}
