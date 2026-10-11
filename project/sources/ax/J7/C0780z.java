package ax.J7;

import android.annotation.SuppressLint;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ax.J7.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0780z {

    /* renamed from: ax.J7.z$a */
    class a implements ThreadFactory {
        final /* synthetic */ String a;
        final /* synthetic */ AtomicLong b;

        /* renamed from: ax.J7.z$a$a, reason: collision with other inner class name */
        class C0098a extends AbstractRunnableC0759d {
            final /* synthetic */ Runnable q;

            C0098a(Runnable runnable) {
                this.q = runnable;
            }

            @Override // ax.J7.AbstractRunnableC0759d
            public void a() {
                this.q.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.a = str;
            this.b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C0098a(runnable));
            newThread.setName(this.a + this.b.getAndIncrement());
            return newThread;
        }
    }

    /* renamed from: ax.J7.z$b */
    class b extends AbstractRunnableC0759d {
        final /* synthetic */ ExecutorService c0;
        final /* synthetic */ long d0;
        final /* synthetic */ TimeUnit e0;
        final /* synthetic */ String q;

        b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
            this.q = str;
            this.c0 = executorService;
            this.d0 = j;
            this.e0 = timeUnit;
        }

        @Override // ax.J7.AbstractRunnableC0759d
        public void a() {
            try {
                ax.G7.g.f().b("Executing shutdown hook for " + this.q);
                this.c0.shutdown();
                if (this.c0.awaitTermination(this.d0, this.e0)) {
                    return;
                }
                ax.G7.g.f().b(this.q + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.c0.shutdownNow();
            } catch (InterruptedException unused) {
                ax.G7.g.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.q));
                this.c0.shutdownNow();
            }
        }
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static void b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService e = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, e);
        return e;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
