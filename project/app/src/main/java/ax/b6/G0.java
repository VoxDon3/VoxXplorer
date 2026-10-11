/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.A0;
import java.util.concurrent.Callable;

final class G0
implements A0 {
    G0() {
    }

    @Override
    public final <V> Callable<V> a(Callable<V> callable) {
        return callable;
    }

    @Override
    public final Runnable b(Runnable runnable2) {
        return runnable2;
    }
}

