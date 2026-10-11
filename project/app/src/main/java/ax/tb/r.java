/*
 * Decompiled with CFR 0.152.
 */
package ax.tb;

import ax.Gb.l;
import ax.tb.q;
import java.util.Collection;

class r
extends q {
    public static <T> int s(Iterable<? extends T> iterable, int n8) {
        l.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection)iterable).size();
        }
        return n8;
    }
}

