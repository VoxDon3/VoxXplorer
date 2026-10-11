/*
 * Decompiled with CFR 0.152.
 */
package ax.w;

import ax.w.b;
import java.util.HashMap;
import java.util.Map;

public class a<K, V>
extends b<K, V> {
    private final HashMap<K, b.c<K, V>> f0 = new HashMap();

    public boolean contains(K k8) {
        return this.f0.containsKey(k8);
    }

    @Override
    protected b.c<K, V> g(K k8) {
        return this.f0.get(k8);
    }

    @Override
    public V l(K k8, V v8) {
        b.c<K, V> c8 = this.g(k8);
        if (c8 != null) {
            return c8.c0;
        }
        this.f0.put(k8, this.k(k8, v8));
        return null;
    }

    @Override
    public V n(K k8) {
        Object v8 = super.n(k8);
        this.f0.remove(k8);
        return v8;
    }

    public Map.Entry<K, V> p(K k8) {
        if (this.contains(k8)) {
            return this.f0.get(k8).e0;
        }
        return null;
    }
}

