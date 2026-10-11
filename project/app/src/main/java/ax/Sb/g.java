/*
 * Decompiled with CFR 0.152.
 */
package ax.Sb;

import java.util.concurrent.atomic.AtomicReferenceArray;

public final class g {
    public static /* synthetic */ boolean a(AtomicReferenceArray atomicReferenceArray, int n8, Object object, Object object2) {
        do {
            if (!atomicReferenceArray.compareAndSet(n8, object, object2)) continue;
            return true;
        } while (atomicReferenceArray.get(n8) == object);
        return false;
    }
}

