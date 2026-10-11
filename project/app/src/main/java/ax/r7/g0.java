/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.n;
import ax.r7.T;
import ax.r7.f0;
import java.util.Comparator;
import java.util.SortedSet;

final class g0 {
    public static <E> Comparator<? super E> a(SortedSet<E> t8) {
        Comparator<E> comparator = t8.comparator();
        t8 = comparator;
        if (comparator == null) {
            t8 = T.d();
        }
        return t8;
    }

    public static boolean b(Comparator<?> comparator, Iterable<?> comparator2) {
        block4: {
            block3: {
                block2: {
                    n.n(comparator);
                    n.n(comparator2);
                    if (!(comparator2 instanceof SortedSet)) break block2;
                    comparator2 = g0.a((SortedSet)((Object)comparator2));
                    break block3;
                }
                if (!(comparator2 instanceof f0)) break block4;
                comparator2 = ((f0)((Object)comparator2)).comparator();
            }
            return comparator.equals(comparator2);
        }
        return false;
    }
}

