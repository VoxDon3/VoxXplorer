package ax.S3;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import ax.Z.g;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.File;
import java.io.FilenameFilter;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a extends ThreadPoolExecutor implements AutoCloseable {
    private static final long c0 = TimeUnit.SECONDS.toMillis(10);
    private final boolean q;

    /* renamed from: ax.S3.a$a, reason: collision with other inner class name */
    static class C0189a implements FilenameFilter {
        final /* synthetic */ Pattern q;

        C0189a(Pattern pattern) {
            this.q = pattern;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.q.matcher(str).matches();
        }
    }

    private static final class b implements ThreadFactory {
        private final String a;
        final c b;
        final boolean c;
        private int d;

        /* renamed from: ax.S3.a$b$a, reason: collision with other inner class name */
        class C0190a extends Thread {
            C0190a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                if (b.this.c) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    b.this.b.d(th);
                }
            }
        }

        b(String str, c cVar, boolean z) {
            this.a = str;
            this.b = cVar;
            this.c = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            C0190a c0190a;
            c0190a = new C0190a(runnable, "glide-" + this.a + "-thread-" + this.d);
            this.d = this.d + 1;
            return c0190a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static class c {
        public static final c c0;
        public static final c d0;
        public static final c e0;
        private static final /* synthetic */ c[] f0;
        public static final c q;

        /* renamed from: ax.S3.a$c$a, reason: collision with other inner class name */
        enum C0191a extends c {
            C0191a(String str, int i) {
                super(str, i, null);
            }

            @Override // ax.S3.a.c
            protected void d(Throwable th) {
                if (th == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }

        enum b extends c {
            b(String str, int i) {
                super(str, i, null);
            }

            @Override // ax.S3.a.c
            protected void d(Throwable th) {
                super.d(th);
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            c cVar = new c("IGNORE", 0);
            q = cVar;
            C0191a c0191a = new C0191a("LOG", 1);
            c0 = c0191a;
            b bVar = new b("THROW", 2);
            d0 = bVar;
            f0 = new c[]{cVar, c0191a, bVar};
            e0 = c0191a;
        }

        private c(String str, int i) {
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f0.clone();
        }

        /* synthetic */ c(String str, int i, C0189a c0189a) {
            this(str, i);
        }

        protected void d(Throwable th) {
        }
    }

    a(int i, String str, c cVar, boolean z, boolean z2) {
        this(i, i, 0L, str, cVar, z, z2);
    }

    public static int a() {
        File[] fileArr;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileArr = new File("/sys/devices/system/cpu/").listFiles(new C0189a(Pattern.compile("cpu[0-9]+")));
        } catch (Throwable th) {
            try {
                if (Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Failed to calculate accurate cpu count", th);
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                fileArr = null;
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        }
        return Math.min(4, Math.max(Math.max(1, Runtime.getRuntime().availableProcessors()), fileArr != null ? fileArr.length : 0));
    }

    private <T> Future<T> b(Future<T> future) {
        if (this.q) {
            boolean z = false;
            while (!future.isDone()) {
                try {
                    try {
                        future.get();
                    } catch (InterruptedException unused) {
                        z = true;
                    } catch (ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        return future;
    }

    public static a c() {
        return e(1, "disk-cache", c.e0);
    }

    public static a e(int i, String str, c cVar) {
        return new a(i, str, cVar, true, false);
    }

    public static a f() {
        return g(a(), "source", c.e0);
    }

    public static a g(int i, String str, c cVar) {
        return new a(i, str, cVar, false, false);
    }

    public static a m() {
        return new a(0, SubsamplingScaleImageView.TILE_SIZE_AUTO, c0, "source-unlimited", c.e0, false, false, new SynchronousQueue());
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        g.a(this);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (this.q) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return b(super.submit(runnable));
    }

    a(int i, int i2, long j, String str, c cVar, boolean z, boolean z2) {
        this(i, i2, j, str, cVar, z, z2, new PriorityBlockingQueue());
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return b(super.submit(runnable, t));
    }

    a(int i, int i2, long j, String str, c cVar, boolean z, boolean z2, BlockingQueue<Runnable> blockingQueue) {
        super(i, i2, j, TimeUnit.MILLISECONDS, blockingQueue, new b(str, cVar, z));
        this.q = z2;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return b(super.submit(callable));
    }
}
