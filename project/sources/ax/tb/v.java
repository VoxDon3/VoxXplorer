package ax.tb;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class v extends u {
    public static <T> boolean v(Collection<? super T> collection, Iterable<? extends T> iterable) {
        ax.Gb.l.f(collection, "<this>");
        ax.Gb.l.f(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z = true;
            }
        }
        return z;
    }

    public static <T> boolean w(Collection<? super T> collection, T[] tArr) {
        ax.Gb.l.f(collection, "<this>");
        ax.Gb.l.f(tArr, "elements");
        return collection.addAll(C3136l.c(tArr));
    }

    public static <T> T x(List<T> list) {
        ax.Gb.l.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(C3141q.k(list));
    }
}
