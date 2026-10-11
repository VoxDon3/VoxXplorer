/*
 * Decompiled with CFR 0.152.
 */
package ax.H3;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class g
extends ThreadPoolExecutor
implements AutoCloseable {
    private final j.ConcurrentHashMap<String, WeakReference<Runnable>> q = new j.ConcurrentHashMap();

    public g(int n8, int n9, long l8, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(n8, n9, l8, timeUnit, blockingQueue, threadFactory);
    }

    public Runnable a(String object) {
        if ((object = (WeakReference)this.q.get(object)) == null) {
            return null;
        }
        return (Runnable)((Reference)object).get();
    }

    @Override
    protected void afterExecute(Runnable runnable2, Throwable throwable) {
        super.afterExecute(runnable2, throwable);
        this.q.remove((Object)runnable2.toString());
    }

    @Override
    protected void beforeExecute(Thread thread, Runnable runnable2) {
        super.beforeExecute(thread, runnable2);
        this.q.put((Object)runnable2.toString(), new WeakReference<Runnable>(runnable2));
    }

    @Override
    public /* synthetic */ void close() {
        ax.Z.g.a(this);
    }
}

