package ax.r7;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class N {

    private static class a<K, V> extends AbstractC2969c<K, V> {
        transient ax.q7.u<? extends List<V>> h0;

        a(Map<K, Collection<V>> map, ax.q7.u<? extends List<V>> uVar) {
            super(map);
            this.h0 = (ax.q7.u) ax.q7.n.n(uVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.r7.AbstractC2970d
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public List<V> s() {
            return this.h0.get();
        }

        @Override // ax.r7.AbstractC2972f
        Map<K, Collection<V>> e() {
            return u();
        }

        @Override // ax.r7.AbstractC2972f
        Set<K> g() {
            return v();
        }
    }

    static abstract class b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return e().c(entry.getKey(), entry.getValue());
        }

        abstract L<K, V> e();

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return e().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return e().size();
        }
    }

    static boolean a(L<?, ?> l, Object obj) {
        if (obj == l) {
            return true;
        }
        if (obj instanceof L) {
            return l.b().equals(((L) obj).b());
        }
        return false;
    }

    public static <K, V> H<K, V> b(Map<K, Collection<V>> map, ax.q7.u<? extends List<V>> uVar) {
        return new a(map, uVar);
    }
}
