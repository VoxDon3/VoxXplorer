/*
 * Decompiled with CFR 0.152.
 */
package ax.tb;

import ax.Gb.l;
import ax.tb.t;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class u
extends t {
    public static <T extends Comparable<? super T>> void t(List<T> list) {
        l.f(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static final <T> void u(List<T> list, Comparator<? super T> comparator) {
        l.f(list, "<this>");
        l.f(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}

