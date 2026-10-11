/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import ax.S0.d0;
import java.util.concurrent.Executor;

public final class b {
    private static Executor a;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Executor a() {
        synchronized (b.class) {
            try {
                if (a != null) return a;
                a = d0.b1("ExoPlayer:BackgroundExecutor");
                return a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

