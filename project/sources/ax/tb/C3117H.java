package ax.tb;

import ax.sb.C3081m;
import ax.ub.C3230d;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ax.tb.H, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3117H extends C3116G {
    public static <K, V> Map<K, V> b(Map<K, V> map) {
        ax.Gb.l.f(map, "builder");
        return ((C3230d) map).l();
    }

    public static <K, V> Map<K, V> c() {
        return new C3230d();
    }

    public static int d(int i) {
        return i < 0 ? i : i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : SubsamplingScaleImageView.TILE_SIZE_AUTO;
    }

    public static final <K, V> Map<K, V> e(C3081m<? extends K, ? extends V> c3081m) {
        ax.Gb.l.f(c3081m, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(c3081m.c(), c3081m.d());
        ax.Gb.l.e(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static final <K, V> Map<K, V> f(Map<? extends K, ? extends V> map) {
        ax.Gb.l.f(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        ax.Gb.l.e(singletonMap, "with(...)");
        return singletonMap;
    }
}
