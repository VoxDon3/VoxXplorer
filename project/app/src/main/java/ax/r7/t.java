/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.r7.K;
import ax.r7.d0;
import ax.r7.u;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class t<K, V>
extends u
implements Map<K, V> {
    protected t() {
    }

    @Override
    public void clear() {
        this.g().clear();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.g().containsKey(object);
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return this.g().entrySet();
    }

    protected abstract Map<K, V> g();

    @Override
    public V get(Object object) {
        return this.g().get(object);
    }

    protected boolean i(Object object) {
        return K.b(this, object);
    }

    @Override
    public boolean isEmpty() {
        return this.g().isEmpty();
    }

    protected boolean k(Object object) {
        return K.c(this, object);
    }

    @Override
    public Set<K> keySet() {
        return this.g().keySet();
    }

    protected int l() {
        return d0.d(this.entrySet());
    }

    @Override
    public V put(K k8, V v8) {
        return this.g().put(k8, v8);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> map) {
        this.g().putAll(map);
    }

    @Override
    public V remove(Object object) {
        return this.g().remove(object);
    }

    @Override
    public int size() {
        return this.g().size();
    }

    @Override
    public Collection<V> values() {
        return this.g().values();
    }
}

