/*
 * Decompiled with CFR 0.152.
 */
package ax.tb;

import ax.Gb.l;
import ax.sb.m;
import ax.tb.G;
import ax.ub.d;
import java.util.Collections;
import java.util.Map;

class H
extends G {
    public static <K, V> Map<K, V> b(Map<K, V> map) {
        l.f(map, "builder");
        return ((d)map).l();
    }

    public static <K, V> Map<K, V> c() {
        return new d();
    }

    public static int d(int n8) {
        if (n8 < 0) {
            return n8;
        }
        if (n8 < 3) {
            return n8 + 1;
        }
        if (n8 < 0x40000000) {
            return (int)((float)n8 / 0.75f + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final <K, V> Map<K, V> e(m<? extends K, ? extends V> object) {
        l.f(object, "pair");
        object = Collections.singletonMap(((m)object).c(), ((m)object).d());
        l.e(object, "singletonMap(...)");
        return object;
    }

    public static final <K, V> Map<K, V> f(Map<? extends K, ? extends V> map) {
        l.f(map, "<this>");
        map = map.entrySet().iterator().next();
        map = Collections.singletonMap(map.getKey(), map.getValue());
        l.e(map, "with(...)");
        return map;
    }
}

