/*
 * Decompiled with CFR 0.152.
 */
package ax.vb;

import ax.Gb.l;
import ax.vb.e;
import java.util.Comparator;

class b {
    public static <T extends Comparable<?>> int a(T t8, T t9) {
        if (t8 == t9) {
            return 0;
        }
        if (t8 == null) {
            return -1;
        }
        if (t9 == null) {
            return 1;
        }
        return t8.compareTo(t9);
    }

    public static <T extends Comparable<? super T>> Comparator<T> b() {
        e e8 = e.q;
        l.d(e8, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return e8;
    }
}

