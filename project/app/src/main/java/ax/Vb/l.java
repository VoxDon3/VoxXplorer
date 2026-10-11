/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

import ax.Gb.g;
import java.util.ArrayList;

public final class l<E> {
    public static <E> Object a(Object object) {
        return object;
    }

    public static /* synthetic */ Object b(Object object, int n8, g g8) {
        if ((n8 & 1) != 0) {
            object = null;
        }
        return l.a(object);
    }

    public static final Object c(Object object, E e8) {
        if (object == null) {
            return l.a(e8);
        }
        if (object instanceof ArrayList) {
            ax.Gb.l.d(object, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList)object).add(e8);
            return l.a(object);
        }
        ArrayList<Object> arrayList = new ArrayList<Object>(4);
        arrayList.add(object);
        arrayList.add(e8);
        return l.a(arrayList);
    }
}

