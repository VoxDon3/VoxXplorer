/*
 * Decompiled with CFR 0.152.
 */
package ax.C;

import ax.Gb.l;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class c<K, V> {
    private final LinkedHashMap<K, V> a;

    public c(int n8, float f8) {
        this.a = new LinkedHashMap(n8, f8, true);
    }

    public final V a(K k8) {
        l.f(k8, "key");
        return this.a.get(k8);
    }

    public final Set<Map.Entry<K, V>> b() {
        Set<Map.Entry<K, V>> set = this.a.entrySet();
        l.e(set, "map.entries");
        return set;
    }

    public final boolean c() {
        return ((AbstractMap)this.a).isEmpty();
    }

    public final V d(K k8, V v8) {
        l.f(k8, "key");
        l.f(v8, "value");
        return ((AbstractMap)this.a).put(k8, v8);
    }

    public final V e(K k8) {
        l.f(k8, "key");
        return ((AbstractMap)this.a).remove(k8);
    }
}

