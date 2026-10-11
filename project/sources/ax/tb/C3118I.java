package ax.tb;

import ax.sb.C3081m;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ax.tb.I, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3118I extends C3117H {
    public static <K, V> Map<K, V> g() {
        C3111B c3111b = C3111B.q;
        ax.Gb.l.d(c3111b, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c3111b;
    }

    public static <K, V> V h(Map<K, ? extends V> map, K k) {
        ax.Gb.l.f(map, "<this>");
        return (V) C3116G.a(map, k);
    }

    public static <K, V> Map<K, V> i(C3081m<? extends K, ? extends V>... c3081mArr) {
        ax.Gb.l.f(c3081mArr, "pairs");
        return c3081mArr.length > 0 ? q(c3081mArr, new LinkedHashMap(C3117H.d(c3081mArr.length))) : g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> j(Map<K, ? extends V> map) {
        ax.Gb.l.f(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : C3117H.f(map) : g();
    }

    public static <K, V> Map<K, V> k(Map<? extends K, ? extends V> map, C3081m<? extends K, ? extends V> c3081m) {
        ax.Gb.l.f(map, "<this>");
        ax.Gb.l.f(c3081m, "pair");
        if (map.isEmpty()) {
            return C3117H.e(c3081m);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(c3081m.c(), c3081m.d());
        return linkedHashMap;
    }

    public static final <K, V> void l(Map<? super K, ? super V> map, Iterable<? extends C3081m<? extends K, ? extends V>> iterable) {
        ax.Gb.l.f(map, "<this>");
        ax.Gb.l.f(iterable, "pairs");
        for (C3081m<? extends K, ? extends V> c3081m : iterable) {
            map.put(c3081m.a(), c3081m.b());
        }
    }

    public static final <K, V> void m(Map<? super K, ? super V> map, C3081m<? extends K, ? extends V>[] c3081mArr) {
        ax.Gb.l.f(map, "<this>");
        ax.Gb.l.f(c3081mArr, "pairs");
        for (C3081m<? extends K, ? extends V> c3081m : c3081mArr) {
            map.put(c3081m.a(), c3081m.b());
        }
    }

    public static <K, V> Map<K, V> n(Iterable<? extends C3081m<? extends K, ? extends V>> iterable) {
        ax.Gb.l.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return j(o(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return g();
        }
        if (size != 1) {
            return o(iterable, new LinkedHashMap(C3117H.d(collection.size())));
        }
        return C3117H.e((C3081m) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M o(Iterable<? extends C3081m<? extends K, ? extends V>> iterable, M m) {
        ax.Gb.l.f(iterable, "<this>");
        ax.Gb.l.f(m, "destination");
        l(m, iterable);
        return m;
    }

    public static <K, V> Map<K, V> p(Map<? extends K, ? extends V> map) {
        ax.Gb.l.f(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? r(map) : C3117H.f(map) : g();
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M q(C3081m<? extends K, ? extends V>[] c3081mArr, M m) {
        ax.Gb.l.f(c3081mArr, "<this>");
        ax.Gb.l.f(m, "destination");
        m(m, c3081mArr);
        return m;
    }

    public static <K, V> Map<K, V> r(Map<? extends K, ? extends V> map) {
        ax.Gb.l.f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
