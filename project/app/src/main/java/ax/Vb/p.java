/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

import ax.Gb.l;
import ax.Vb.F;
import ax.Vb.q;
import ax.Vb.z;

public final class p {
    private static final Object a = new F("CONDITION_FALSE");

    public static final Object a() {
        return a;
    }

    public static final q b(Object object) {
        Object object2 = object instanceof z ? (z)object : null;
        if (object2 != null && (object2 = ((z)object2).a) != null) {
            return object2;
        }
        l.d(object, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (q)object;
    }
}

