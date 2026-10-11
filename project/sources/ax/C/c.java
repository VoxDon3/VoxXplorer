package ax.C;

import ax.Gb.l;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class c<K, V> {
    private final LinkedHashMap<K, V> a;

    public c(int i, float f) {
        this.a = new LinkedHashMap<>(i, f, true);
    }

    public final V a(K k) {
        l.f(k, "key");
        return this.a.get(k);
    }

    public final Set<Map.Entry<K, V>> b() {
        Set<Map.Entry<K, V>> entrySet = this.a.entrySet();
        l.e(entrySet, "map.entries");
        return entrySet;
    }

    public final boolean c() {
        return this.a.isEmpty();
    }

    public final V d(K k, V v) {
        l.f(k, "key");
        l.f(v, "value");
        return this.a.put(k, v);
    }

    public final V e(K k) {
        l.f(k, "key");
        return this.a.remove(k);
    }
}
