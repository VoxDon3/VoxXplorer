package ax.Vb;

/* loaded from: classes3.dex */
public final class p {
    private static final Object a = new F("CONDITION_FALSE");

    public static final Object a() {
        return a;
    }

    public static final q b(Object obj) {
        q qVar;
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar != null && (qVar = zVar.a) != null) {
            return qVar;
        }
        ax.Gb.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (q) obj;
    }
}
