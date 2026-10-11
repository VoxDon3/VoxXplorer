/*
 * Decompiled with CFR 0.152.
 */
package ax.tb;

import ax.tb.l;
import ax.tb.q;
import ax.tb.u;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

class v
extends u {
    public static <T> boolean v(Collection<? super T> collection, Iterable<? extends T> object) {
        ax.Gb.l.f(collection, "<this>");
        ax.Gb.l.f(object, "elements");
        if (object instanceof Collection) {
            return collection.addAll((Collection)object);
        }
        object = object.iterator();
        boolean bl = false;
        while (object.hasNext()) {
            if (!collection.add(object.next())) continue;
            bl = true;
        }
        return bl;
    }

    public static <T> boolean w(Collection<? super T> collection, T[] TArray) {
        ax.Gb.l.f(collection, "<this>");
        ax.Gb.l.f(TArray, "elements");
        return collection.addAll((Collection)l.c(TArray));
    }

    public static <T> T x(List<T> list) {
        ax.Gb.l.f(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(q.k(list));
        }
        throw new NoSuchElementException("List is empty.");
    }
}

