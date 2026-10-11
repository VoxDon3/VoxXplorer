/*
 * Decompiled with CFR 0.152.
 */
package ax.tb;

import ax.Gb.l;
import ax.tb.C;
import ax.tb.H;
import ax.tb.M;
import ax.tb.m;
import java.util.LinkedHashSet;
import java.util.Set;

class N
extends M {
    public static <T> Set<T> d() {
        return C.q;
    }

    public static <T> Set<T> e(T ... TArray) {
        l.f(TArray, "elements");
        return m.D(TArray, new LinkedHashSet(H.d(TArray.length)));
    }

    public static final <T> Set<T> f(Set<? extends T> set) {
        l.f(set, "<this>");
        int n8 = set.size();
        if (n8 != 0) {
            if (n8 != 1) {
                return set;
            }
            return M.c(set.iterator().next());
        }
        return N.d();
    }
}

