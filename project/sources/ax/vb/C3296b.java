package ax.vb;

import ax.Gb.l;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ax.vb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3296b {
    public static <T extends Comparable<?>> int a(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    public static <T extends Comparable<? super T>> Comparator<T> b() {
        C3299e c3299e = C3299e.q;
        l.d(c3299e, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return c3299e;
    }
}
