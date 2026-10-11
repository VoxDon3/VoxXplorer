/*
 * Decompiled with CFR 0.152.
 */
package ax.tb;

import ax.Gb.l;
import ax.sb.m;
import ax.tb.B;
import ax.tb.G;
import ax.tb.H;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class I
extends H {
    public static <K, V> Map<K, V> g() {
        B b8 = B.q;
        l.d(b8, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return b8;
    }

    public static <K, V> V h(Map<K, ? extends V> map, K k8) {
        l.f(map, "<this>");
        return G.a(map, k8);
    }

    public static <K, V> Map<K, V> i(m<? extends K, ? extends V> ... mArray) {
        l.f(mArray, "pairs");
        if (mArray.length > 0) {
            return I.q(mArray, new LinkedHashMap(H.d(mArray.length)));
        }
        return I.g();
    }

    public static final <K, V> Map<K, V> j(Map<K, ? extends V> map) {
        l.f(map, "<this>");
        int n8 = map.size();
        if (n8 != 0) {
            if (n8 != 1) {
                return map;
            }
            return H.f(map);
        }
        return I.g();
    }

    public static <K, V> Map<K, V> k(Map<? extends K, ? extends V> map, m<? extends K, ? extends V> m8) {
        l.f(map, "<this>");
        l.f(m8, "pair");
        if (map.isEmpty()) {
            return H.e(m8);
        }
        map = new LinkedHashMap<K, V>(map);
        ((AbstractMap)map).put(m8.c(), m8.d());
        return map;
    }

    public static final <K, V> void l(Map<? super K, ? super V> map, Iterable<? extends m<? extends K, ? extends V>> object) {
        l.f(map, "<this>");
        l.f(object, "pairs");
        object = object.iterator();
        while (object.hasNext()) {
            m m8 = (m)object.next();
            map.put(m8.a(), m8.b());
        }
    }

    public static final <K, V> void m(Map<? super K, ? super V> map, m<? extends K, ? extends V>[] mArray) {
        l.f(map, "<this>");
        l.f(mArray, "pairs");
        for (m<K, V> m8 : mArray) {
            map.put(m8.a(), m8.b());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static <K, V> Map<K, V> n(Iterable<? extends m<? extends K, ? extends V>> object) {
        l.f(object, "<this>");
        if (!(object instanceof Collection)) return I.j(I.o(object, new LinkedHashMap()));
        Collection collection = (Collection)object;
        int n8 = collection.size();
        if (n8 == 0) return I.g();
        if (n8 != 1) {
            return I.o(object, new LinkedHashMap(H.d(collection.size())));
        }
        object = object instanceof List ? ((List)object).get(0) : collection.iterator().next();
        object = (m)object;
        return H.e(object);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M o(Iterable<? extends m<? extends K, ? extends V>> iterable, M m8) {
        l.f(iterable, "<this>");
        l.f(m8, "destination");
        I.l(m8, iterable);
        return m8;
    }

    public static <K, V> Map<K, V> p(Map<? extends K, ? extends V> map) {
        l.f(map, "<this>");
        int n8 = map.size();
        if (n8 != 0) {
            if (n8 != 1) {
                return I.r(map);
            }
            return H.f(map);
        }
        return I.g();
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M q(m<? extends K, ? extends V>[] mArray, M m8) {
        l.f(mArray, "<this>");
        l.f(m8, "destination");
        I.m(m8, mArray);
        return m8;
    }

    public static <K, V> Map<K, V> r(Map<? extends K, ? extends V> map) {
        l.f(map, "<this>");
        return new LinkedHashMap<K, V>(map);
    }
}

