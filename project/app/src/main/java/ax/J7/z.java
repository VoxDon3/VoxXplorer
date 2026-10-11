/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import android.annotation.SuppressLint;
import ax.G7.g;
import ax.J7.d;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class z {
    private static void a(String string, ExecutorService executorService) {
        z.b(string, executorService, 2L, TimeUnit.SECONDS);
    }

    @SuppressLint(value={"ThreadPoolCreation"})
    private static void b(String string, ExecutorService object, long l8, TimeUnit object2) {
        Runtime runtime = Runtime.getRuntime();
        object2 = new d(string, (ExecutorService)object, l8, (TimeUnit)((Object)object2)){
            final ExecutorService c0;
            final long d0;
            final TimeUnit e0;
            final String q;
            {
                this.q = string;
                this.c0 = executorService;
                this.d0 = l8;
                this.e0 = timeUnit;
            }

            @Override
            public void a() {
                try {
                    Object object = g.f();
                    Object object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Executing shutdown hook for ");
                    ((StringBuilder)object2).append(this.q);
                    ((g)object).b(((StringBuilder)object2).toString());
                    this.c0.shutdown();
                    if (!this.c0.awaitTermination(this.d0, this.e0)) {
                        object2 = g.f();
                        object = new StringBuilder();
                        ((StringBuilder)object).append(this.q);
                        ((StringBuilder)object).append(" did not shut down in the allocated time. Requesting immediate shutdown.");
                        ((g)object2).b(((StringBuilder)object).toString());
                        this.c0.shutdownNow();
                        return;
                    }
                }
                catch (InterruptedException interruptedException) {
                    g.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.q));
                    this.c0.shutdownNow();
                }
            }
        };
        object = new StringBuilder();
        ((StringBuilder)object).append("Crashlytics Shutdown Hook for ");
        ((StringBuilder)object).append(string);
        runtime.addShutdownHook(new Thread((Runnable)object2, ((StringBuilder)object).toString()));
    }

    public static ExecutorService c(String string) {
        ExecutorService executorService = z.e(z.d(string), new ThreadPoolExecutor.DiscardPolicy());
        z.a(string, executorService);
        return executorService;
    }

    public static ThreadFactory d(String string) {
        return new ThreadFactory(){
            final String a;
            final AtomicLong b;
            {
                this.a = string;
                this.b = atomicLong;
            }

            @Override
            public Thread newThread(Runnable object) {
                Thread thread = Executors.defaultThreadFactory().newThread(new d(this, (Runnable)object){
                    final a c0;
                    final Runnable q;
                    {
                        this.c0 = a8;
                        this.q = runnable2;
                    }

                    @Override
                    public void a() {
                        this.q.run();
                    }
                });
                object = new StringBuilder();
                ((StringBuilder)object).append(this.a);
                ((StringBuilder)object).append(this.b.getAndIncrement());
                thread.setName(((StringBuilder)object).toString());
                return thread;
            }
        };
    }

    @SuppressLint(value={"ThreadPoolCreation"})
    private static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(), threadFactory, rejectedExecutionHandler));
    }
}

