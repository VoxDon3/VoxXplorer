/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.r7.H;
import ax.r7.d;
import java.util.Collection;
import java.util.List;
import java.util.Map;

abstract class c<K, V>
extends d<K, V>
implements H<K, V> {
    protected c(Map<K, Collection<V>> map) {
        super(map);
    }

    public List<V> B(K k8) {
        return (List)super.get(k8);
    }

    @Override
    public Map<K, Collection<V>> b() {
        return super.b();
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public boolean put(K k8, V v8) {
        return super.put(k8, v8);
    }

    @Override
    <E> Collection<E> y(Collection<E> collection) {
        return java.util.DesugarCollections.unmodifiableList((List)((List)collection));
    }

    @Override
    Collection<V> z(K k8, Collection<V> collection) {
        return this.A(k8, (List)collection, null);
    }
}

