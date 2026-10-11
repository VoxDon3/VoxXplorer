package ax.Sb;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes3.dex */
public final /* synthetic */ class g {
    public static /* synthetic */ boolean a(AtomicReferenceArray atomicReferenceArray, int i, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i, obj, obj2)) {
            if (atomicReferenceArray.get(i) != obj) {
                return false;
            }
        }
        return true;
    }
}
