package ax.w;

import ax.w.b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ax.w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3320a<K, V> extends b<K, V> {
    private final HashMap<K, b.c<K, V>> f0 = new HashMap<>();

    public boolean contains(K k) {
        return this.f0.containsKey(k);
    }

    @Override // ax.w.b
    protected b.c<K, V> g(K k) {
        return this.f0.get(k);
    }

    @Override // ax.w.b
    public V l(K k, V v) {
        b.c<K, V> g = g(k);
        if (g != null) {
            return g.c0;
        }
        this.f0.put(k, k(k, v));
        return null;
    }

    @Override // ax.w.b
    public V n(K k) {
        V v = (V) super.n(k);
        this.f0.remove(k);
        return v;
    }

    public Map.Entry<K, V> p(K k) {
        if (contains(k)) {
            return this.f0.get(k).e0;
        }
        return null;
    }
}
