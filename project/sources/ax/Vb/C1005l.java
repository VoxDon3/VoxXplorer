package ax.Vb;

import java.util.ArrayList;

/* renamed from: ax.Vb.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1005l<E> {
    public static /* synthetic */ Object b(Object obj, int i, ax.Gb.g gVar) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    public static final Object c(Object obj, E e) {
        if (obj == null) {
            return a(e);
        }
        if (obj instanceof ArrayList) {
            ax.Gb.l.d(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList) obj).add(e);
            return a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e);
        return a(arrayList);
    }

    public static <E> Object a(Object obj) {
        return obj;
    }
}
