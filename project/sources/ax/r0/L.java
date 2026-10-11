package ax.r0;

import ax.r0.C2904A;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class L<K, V> extends LinkedHashMap<K, V> {
    private static final L c0;
    private boolean q;

    static {
        L l = new L();
        c0 = l;
        l.m();
    }

    private L() {
        this.q = true;
    }

    static <K, V> int b(Map<K, V> map) {
        int i = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            i += c(entry.getValue()) ^ c(entry.getKey());
        }
        return i;
    }

    private static int c(Object obj) {
        if (obj instanceof byte[]) {
            return C2904A.d((byte[]) obj);
        }
        if (obj instanceof C2904A.c) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private static void d(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            C2904A.a(obj);
            C2904A.a(map.get(obj));
        }
    }

    public static <K, V> L<K, V> f() {
        return c0;
    }

    private void i() {
        if (!l()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean j(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    static <K, V> boolean k(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !j(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        i();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && k(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return b(this);
    }

    public boolean l() {
        return this.q;
    }

    public void m() {
        this.q = false;
    }

    public void n(L<K, V> l) {
        i();
        if (l.isEmpty()) {
            return;
        }
        putAll(l);
    }

    public L<K, V> o() {
        return isEmpty() ? new L<>() : new L<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        i();
        C2904A.a(k);
        C2904A.a(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        i();
        d(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        i();
        return (V) super.remove(obj);
    }

    private L(Map<K, V> map) {
        super(map);
        this.q = true;
    }
}
