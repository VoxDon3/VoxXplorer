package ax.a6;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ax.a6.b0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class ExecutorC1390b0 implements Executor {
    private final ThreadPoolExecutor c0;
    private final AtomicInteger q = new AtomicInteger(1);
    private WeakReference d0 = new WeakReference(null);

    ExecutorC1390b0(String str) {
        final String str2 = "Google consent worker";
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory(str2) { // from class: ax.a6.a0
            public final /* synthetic */ String b = "Google consent worker";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return ExecutorC1390b0.a(ExecutorC1390b0.this, this.b, runnable);
            }
        });
        this.c0 = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ Thread a(ExecutorC1390b0 executorC1390b0, String str, Runnable runnable) {
        Thread thread = new Thread(runnable, "Google consent worker #" + executorC1390b0.q.getAndIncrement());
        executorC1390b0.d0 = new WeakReference(thread);
        return thread;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.d0.get()) {
            runnable.run();
        } else {
            this.c0.execute(runnable);
        }
    }
}
