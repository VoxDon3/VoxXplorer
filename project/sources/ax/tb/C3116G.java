package ax.tb;

import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: ax.tb.G, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C3116G {
    public static final <K, V> V a(Map<K, ? extends V> map, K k) {
        ax.Gb.l.f(map, "<this>");
        if (map instanceof InterfaceC3114E) {
            return (V) ((InterfaceC3114E) map).h(k);
        }
        V v = map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        throw new NoSuchElementException("Key " + k + " is missing in the map.");
    }
}
