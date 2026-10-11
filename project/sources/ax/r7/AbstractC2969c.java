package ax.r7;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: ax.r7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC2969c<K, V> extends AbstractC2970d<K, V> implements H<K, V> {
    protected AbstractC2969c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // ax.r7.AbstractC2970d, ax.r7.L
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public List<V> get(K k) {
        return (List) super.get(k);
    }

    @Override // ax.r7.AbstractC2972f, ax.r7.L
    public Map<K, Collection<V>> b() {
        return super.b();
    }

    @Override // ax.r7.AbstractC2972f
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // ax.r7.AbstractC2970d, ax.r7.L
    public boolean put(K k, V v) {
        return super.put(k, v);
    }

    @Override // ax.r7.AbstractC2970d
    <E> Collection<E> y(Collection<E> collection) {
        return DesugarCollections.unmodifiableList((List) collection);
    }

    @Override // ax.r7.AbstractC2970d
    Collection<V> z(K k, Collection<V> collection) {
        return A(k, (List) collection, null);
    }
}
