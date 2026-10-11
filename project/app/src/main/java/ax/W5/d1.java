/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.O0;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class d1
extends LinkedHashMap {
    private static final d1 c0;
    private boolean q = true;

    static {
        d1 d12;
        c0 = d12 = new d1();
        d12.q = false;
    }

    private d1() {
    }

    private d1(Map map) {
        super(map);
    }

    public static d1 b() {
        return c0;
    }

    private static int j(Object object) {
        if (object instanceof byte[]) {
            int n8;
            byte[] byArray = (byte[])object;
            object = O0.d;
            int n9 = byArray.length;
            n9 = n8 = O0.b(n9, byArray, 0, n9);
            if (n8 == 0) {
                n9 = 1;
            }
            return n9;
        }
        return object.hashCode();
    }

    private final void k() {
        if (this.q) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final d1 c() {
        if (((AbstractMap)this).isEmpty()) {
            return new d1();
        }
        return new d1((Map)this);
    }

    @Override
    public final void clear() {
        this.k();
        super.clear();
    }

    public final void d() {
        this.q = false;
    }

    @Override
    public final Set entrySet() {
        if (((AbstractMap)this).isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return super.entrySet();
    }

    @Override
    public final boolean equals(Object iterator) {
        if (iterator instanceof Map) {
            Map map = (Map)((Object)iterator);
            if (this != map) {
                if (this.size() == map.size()) {
                    for (Map.Entry entry : this.entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            Object v8 = entry.getValue();
                            entry = map.get(entry.getKey());
                            boolean bl = v8 instanceof byte[] && entry instanceof byte[] ? Arrays.equals((byte[])v8, (byte[])entry) : v8.equals(entry);
                            if (bl) continue;
                        }
                        break;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final void f(d1 d12) {
        this.k();
        if (!((AbstractMap)d12).isEmpty()) {
            this.putAll((Map)d12);
        }
    }

    @Override
    public final int hashCode() {
        Iterator iterator = this.entrySet().iterator();
        int n8 = 0;
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            int n9 = d1.j(entry.getKey());
            n8 += d1.j(entry.getValue()) ^ n9;
        }
        return n8;
    }

    public final boolean i() {
        return this.q;
    }

    @Override
    public final Object put(Object object, Object object2) {
        this.k();
        byte[] byArray = O0.d;
        object.getClass();
        object2.getClass();
        return super.put(object, object2);
    }

    @Override
    public final void putAll(Map map) {
        this.k();
        for (Object k8 : map.keySet()) {
            byte[] byArray = O0.d;
            k8.getClass();
            map.get(k8).getClass();
        }
        super.putAll(map);
    }

    @Override
    public final Object remove(Object object) {
        this.k();
        return super.remove(object);
    }
}

