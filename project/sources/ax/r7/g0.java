package ax.r7;

import java.util.Comparator;
import java.util.SortedSet;

/* loaded from: classes3.dex */
final class g0 {
    public static <E> Comparator<? super E> a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? T.d() : comparator;
    }

    public static boolean b(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        ax.q7.n.n(comparator);
        ax.q7.n.n(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else {
            if (!(iterable instanceof f0)) {
                return false;
            }
            comparator2 = ((f0) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
