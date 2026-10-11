/*
 * Decompiled with CFR 0.152.
 */
package ax.D;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class b {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object object, Object object2, Object object3) {
        do {
            if (!atomicReferenceFieldUpdater.compareAndSet(object, object2, object3)) continue;
            return true;
        } while (atomicReferenceFieldUpdater.get(object) == object2);
        return false;
    }
}

