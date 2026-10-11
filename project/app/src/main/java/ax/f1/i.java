/*
 * Decompiled with CFR 0.152.
 */
package ax.f1;

import java.util.concurrent.atomic.AtomicReference;

public final class i {
    public static /* synthetic */ boolean a(AtomicReference atomicReference, Object object, Object object2) {
        do {
            if (!atomicReference.compareAndSet(object, object2)) continue;
            return true;
        } while (atomicReference.get() == object);
        return false;
    }
}

