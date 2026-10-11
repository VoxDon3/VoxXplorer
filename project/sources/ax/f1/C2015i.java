package ax.f1;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ax.f1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2015i {
    public static /* synthetic */ boolean a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
