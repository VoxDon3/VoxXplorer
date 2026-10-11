/*
 * Decompiled with CFR 0.152.
 */
package ax.v7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class g {
    public static <V> V a(Future<V> future) throws ExecutionException {
        boolean bl = false;
        while (true) {
            V v8;
            block5: {
                try {
                    v8 = future.get();
                    if (!bl) break block5;
                    Thread.currentThread().interrupt();
                }
                catch (Throwable throwable) {
                    if (bl) {
                        Thread.currentThread().interrupt();
                    }
                    throw throwable;
                }
                catch (InterruptedException interruptedException) {
                    bl = true;
                    continue;
                }
            }
            return v8;
            break;
        }
    }
}

