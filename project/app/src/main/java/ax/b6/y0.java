/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.B0;
import ax.b6.w0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class y0
implements w0 {
    private y0() {
    }

    /* synthetic */ y0(B0 b02) {
        this();
    }

    @Override
    public final ExecutorService a(ThreadFactory object, int n8) {
        object = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), (ThreadFactory)object);
        ((ThreadPoolExecutor)object).allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService((ExecutorService)object);
    }
}

