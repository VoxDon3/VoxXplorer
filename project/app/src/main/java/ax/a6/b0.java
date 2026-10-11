/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import ax.a6.a0;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

final class b0
implements Executor {
    private final ThreadPoolExecutor c0;
    private WeakReference d0;
    private final AtomicInteger q = new AtomicInteger(1);

    b0(String object) {
        this.d0 = new WeakReference<Object>(null);
        object = new a0(this, "Google consent worker");
        this.c0 = object = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), (ThreadFactory)object);
        ((ThreadPoolExecutor)object).allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ Thread a(b0 b02, String object, Runnable runnable2) {
        int n8 = b02.q.getAndIncrement();
        object = new StringBuilder();
        ((StringBuilder)object).append("Google consent worker #");
        ((StringBuilder)object).append(n8);
        object = new Thread(runnable2, ((StringBuilder)object).toString());
        b02.d0 = new WeakReference<Object>(object);
        return object;
    }

    @Override
    public final void execute(Runnable runnable2) {
        if (Thread.currentThread() == this.d0.get()) {
            runnable2.run();
            return;
        }
        this.c0.execute(runnable2);
    }
}

