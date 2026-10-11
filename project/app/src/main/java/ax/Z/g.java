/*
 * Decompiled with CFR 0.152.
 */
package ax.Z;

import android.os.Build;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public final class g {
    public static /* synthetic */ void a(ExecutorService executorService) {
        boolean bl;
        if (!(Build.VERSION.SDK_INT > 23 && executorService == ForkJoinPool.commonPool() || (bl = executorService.isTerminated()))) {
            boolean bl2;
            executorService.shutdown();
            boolean bl3 = false;
            while (!(bl2 = bl)) {
                try {
                    bl = executorService.awaitTermination(1L, TimeUnit.DAYS);
                }
                catch (InterruptedException interruptedException) {
                    bl = bl2;
                    if (bl3) continue;
                    executorService.shutdownNow();
                    bl3 = true;
                    bl = bl2;
                }
            }
            if (bl3) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

