/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.A;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class L<K, V>
extends LinkedHashMap<K, V> {
    private static final L c0;
    private boolean q = true;

    static {
        L l8;
        c0 = l8 = new L();
        l8.m();
    }

    private L() {
    }

    private L(Map<K, V> map) {
        super(map);
    }

    static <K, V> int b(Map<K, V> object) {
        object = object.entrySet().iterator();
        int n8 = 0;
        while (object.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            int n9 = L.c(entry.getKey());
            n8 += L.c(entry.getValue()) ^ n9;
        }
        return n8;
    }

    private static int c(Object object) {
        if (object instanceof byte[]) {
            return A.d((byte[])object);
        }
        if (!(object instanceof A.c)) {
            return object.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    private static void d(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            A.a(obj);
            A.a(map.get(obj));
        }
    }

    public static <K, V> L<K, V> f() {
        return c0;
    }

    private void i() {
        if (this.l()) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    private static boolean j(Object object, Object object2) {
        if (object instanceof byte[] && object2 instanceof byte[]) {
            return Arrays.equals((byte[])object, (byte[])object2);
        }
        return object.equals(object2);
    }

    static <K, V> boolean k(Map<K, V> object, Map<K, V> map) {
        if (object == map) {
            return true;
        }
        if (object.size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : object.entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            if (L.j(entry.getValue(), map.get(entry.getKey()))) continue;
            return false;
        }
        return true;
    }

    @Override
    public void clear() {
        this.i();
        super.clear();
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        if (((AbstractMap)this).isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return super.entrySet();
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof Map && L.k(this, (Map)object);
    }

    @Override
    public int hashCode() {
        return L.b(this);
    }

    public boolean l() {
        return this.q;
    }

    public void m() {
        this.q = false;
    }

    public void n(L<K, V> l8) {
        this.i();
        if (!((AbstractMap)l8).isEmpty()) {
            this.putAll(l8);
        }
    }

    public L<K, V> o() {
        if (((AbstractMap)this).isEmpty()) {
            return new L<K, V>();
        }
        return new L<K, V>(this);
    }

    @Override
    public V put(K k8, V v8) {
        this.i();
        A.a(k8);
        A.a(v8);
        return super.put(k8, v8);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> map) {
        this.i();
        L.d(map);
        super.putAll(map);
    }

    @Override
    public V remove(Object object) {
        this.i();
        return super.remove(object);
    }
}

