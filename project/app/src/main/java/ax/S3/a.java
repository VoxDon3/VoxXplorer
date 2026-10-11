/*
 * Decompiled with CFR 0.152.
 */
package ax.S3;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import ax.Z.g;
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

public final class a
extends ThreadPoolExecutor
implements AutoCloseable {
    private static final long c0 = TimeUnit.SECONDS.toMillis(10L);
    private final boolean q;

    a(int n8, int n9, long l8, String string, c c8, boolean bl, boolean bl2) {
        this(n8, n9, l8, string, c8, bl, bl2, new PriorityBlockingQueue<Runnable>());
    }

    a(int n8, int n9, long l8, String string, c c8, boolean bl, boolean bl2, BlockingQueue<Runnable> blockingQueue) {
        super(n8, n9, l8, TimeUnit.MILLISECONDS, blockingQueue, new b(string, c8, bl));
        this.q = bl2;
    }

    a(int n8, String string, c c8, boolean bl, boolean bl2) {
        this(n8, n8, 0L, string, c8, bl, bl2);
    }

    public static int a() {
        Throwable throwable3;
        StrictMode.ThreadPolicy threadPolicy;
        block5: {
            File[] fileArray;
            threadPolicy = StrictMode.allowThreadDiskReads();
            try {
                fileArray = new File("/sys/devices/system/cpu/");
                Pattern pattern = Pattern.compile("cpu[0-9]+");
                FilenameFilter filenameFilter = new FilenameFilter(pattern){
                    final Pattern q;
                    {
                        this.q = pattern;
                    }

                    @Override
                    public boolean accept(File file, String string) {
                        return this.q.matcher(string).matches();
                    }
                };
                fileArray = fileArray.listFiles(filenameFilter);
            }
            catch (Throwable throwable2) {
                block4: {
                    try {
                        if (!Log.isLoggable((String)"GlideExecutor", (int)6)) break block4;
                        Log.e((String)"GlideExecutor", (String)"Failed to calculate accurate cpu count", (Throwable)throwable2);
                    }
                    catch (Throwable throwable3) {
                        break block5;
                    }
                }
                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
                fileArray = null;
            }
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
            int n8 = fileArray != null ? fileArray.length : 0;
            return Math.min(4, Math.max(Math.max(1, Runtime.getRuntime().availableProcessors()), n8));
        }
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        throw throwable3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private <T> Future<T> b(Future<T> var1_1) {
        if (this.q == false) return var1_1;
        var2_3 = false;
        try {
            while (true) lbl-1000:
            // 3 sources

            {
                if (var3_4 = var1_1.isDone()) {
                    if (var2_3 == false) return var1_1;
                    Thread.currentThread().interrupt();
                    return var1_1;
                }
                try {
                    var1_1.get();
                }
                catch (InterruptedException var4_5) {
                    var2_3 = true;
                    continue;
                }
                catch (ExecutionException var4_6) {
                    var1_1 = new RuntimeException(var4_6);
                    throw var1_1;
                }
                break;
            }
        }
        catch (Throwable var1_2) {}
        ** GOTO lbl-1000
        if (var2_3 == false) throw var1_2;
        Thread.currentThread().interrupt();
        throw var1_2;
    }

    public static a c() {
        return a.e(1, "disk-cache", c.e0);
    }

    public static a e(int n8, String string, c c8) {
        return new a(n8, string, c8, true, false);
    }

    public static a f() {
        return a.g(a.a(), "source", c.e0);
    }

    public static a g(int n8, String string, c c8) {
        return new a(n8, string, c8, false, false);
    }

    public static a m() {
        return new a(0, Integer.MAX_VALUE, c0, "source-unlimited", c.e0, false, false, new SynchronousQueue<Runnable>());
    }

    @Override
    public /* synthetic */ void close() {
        g.a(this);
    }

    @Override
    public void execute(Runnable runnable2) {
        if (this.q) {
            runnable2.run();
            return;
        }
        super.execute(runnable2);
    }

    @Override
    public Future<?> submit(Runnable runnable2) {
        return this.b(super.submit(runnable2));
    }

    @Override
    public <T> Future<T> submit(Runnable runnable2, T t8) {
        return this.b(super.submit(runnable2, t8));
    }

    @Override
    public <T> Future<T> submit(Callable<T> callable) {
        return this.b(super.submit(callable));
    }

    private static final class b
    implements ThreadFactory {
        private final String a;
        final c b;
        final boolean c;
        private int d;

        b(String string, c c8, boolean bl) {
            this.a = string;
            this.b = c8;
            this.c = bl;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public Thread newThread(Runnable runnable2) {
            synchronized (this) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("glide-");
                stringBuilder.append(this.a);
                stringBuilder.append("-thread-");
                stringBuilder.append(this.d);
                Thread thread = new Thread(this, runnable2, stringBuilder.toString()){
                    final b q;
                    {
                        this.q = b8;
                        super(runnable2, string);
                    }

                    @Override
                    public void run() {
                        Process.setThreadPriority((int)9);
                        if (this.q.c) {
                            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                        }
                        try {
                            super.run();
                            return;
                        }
                        catch (Throwable throwable) {
                            this.q.b.d(throwable);
                            return;
                        }
                    }
                };
                ++this.d;
                return thread;
            }
        }
    }

    public static class c
    extends Enum<c> {
        public static final /* enum */ c c0;
        public static final /* enum */ c d0;
        public static final c e0;
        private static final c[] f0;
        public static final /* enum */ c q;

        static {
            c c8;
            c c9;
            c c10;
            q = c10 = new c();
            c0 = c9 = new c(){

                @Override
                protected void d(Throwable throwable) {
                    if (throwable != null && Log.isLoggable((String)"GlideExecutor", (int)6)) {
                        Log.e((String)"GlideExecutor", (String)"Request threw uncaught throwable", (Throwable)throwable);
                    }
                }
            };
            d0 = c8 = new c(){

                @Override
                protected void d(Throwable throwable) {
                    super.d(throwable);
                    if (throwable == null) {
                        return;
                    }
                    throw new RuntimeException("Request threw uncaught throwable", throwable);
                }
            };
            f0 = new c[]{c10, c9, c8};
            e0 = c9;
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])f0.clone();
        }

        protected void d(Throwable throwable) {
        }
    }
}

