package ax.r7;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: ax.r7.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2985t<K, V> extends AbstractC2986u implements Map<K, V> {
    protected AbstractC2985t() {
    }

    @Override // java.util.Map
    public void clear() {
        g().clear();
    }

    public boolean containsKey(Object obj) {
        return g().containsKey(obj);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return g().entrySet();
    }

    protected abstract Map<K, V> g();

    public V get(Object obj) {
        return g().get(obj);
    }

    protected boolean i(Object obj) {
        return K.b(this, obj);
    }

    public boolean isEmpty() {
        return g().isEmpty();
    }

    protected boolean k(Object obj) {
        return K.c(this, obj);
    }

    public Set<K> keySet() {
        return g().keySet();
    }

    protected int l() {
        return d0.d(entrySet());
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        return g().put(k, v);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        g().putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return g().remove(obj);
    }

    public int size() {
        return g().size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return g().values();
    }
}
