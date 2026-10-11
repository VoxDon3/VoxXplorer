/*
 * Decompiled with CFR 0.152.
 */
package ax.ba;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import ax.Y9.b;
import ax.ca.g;
import ax.ka.d;
import ax.ka.f;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class a {
    public static ax.fa.a a() {
        return new ax.fa.b();
    }

    public static ax.V9.a b(Context context, ax.Y9.a a8, long l8, int n8) {
        File file = a.h(context);
        if (l8 > 0L || n8 > 0) {
            Object object = f.d(context);
            try {
                object = new ax.X9.b((File)object, file, a8, l8, n8);
                return object;
            }
            catch (IOException iOException) {
                d.c(iOException);
            }
        }
        return new ax.W9.b(f.a(context), file, a8);
    }

    public static Executor c(int n8, int n9, g object) {
        object = object == g.c0 ? new ax.da.a() : new LinkedBlockingQueue();
        return new ThreadPoolExecutor(n8, n8, 0L, TimeUnit.MILLISECONDS, (BlockingQueue<Runnable>)object, a.j(n9, "uil-pool-"));
    }

    public static ax.Y9.a d() {
        return new b();
    }

    public static ax.ea.b e(boolean bl) {
        return new ax.ea.a(bl);
    }

    public static ax.ga.b f(Context context) {
        return new ax.ga.a(context);
    }

    public static ax.Z9.a g(Context context, int n8) {
        int n9 = n8;
        if (n8 == 0) {
            ActivityManager activityManager = (ActivityManager)context.getSystemService("activity");
            n8 = n9 = activityManager.getMemoryClass();
            if (a.l()) {
                n8 = n9;
                if (a.m(context)) {
                    n8 = a.k(activityManager);
                }
            }
            n9 = n8 * 0x100000 / 8;
        }
        return new ax.aa.b(n9);
    }

    private static File h(Context object) {
        File file = f.b((Context)object, false);
        if (!((File)(object = new File(file, "uil-images"))).exists() && !((File)object).mkdir()) {
            return file;
        }
        return object;
    }

    public static Executor i() {
        return Executors.newCachedThreadPool(a.j(5, "uil-pool-d-"));
    }

    private static ThreadFactory j(int n8, String string) {
        return new a(n8, string);
    }

    @TargetApi(value=11)
    private static int k(ActivityManager activityManager) {
        return activityManager.getLargeMemoryClass();
    }

    private static boolean l() {
        return true;
    }

    @TargetApi(value=11)
    private static boolean m(Context context) {
        return (context.getApplicationInfo().flags & 0x100000) != 0;
    }

    private static class a
    implements ThreadFactory {
        private static final AtomicInteger e = new AtomicInteger(1);
        private final ThreadGroup a;
        private final AtomicInteger b = new AtomicInteger(1);
        private final String c;
        private final int d;

        a(int n8, String string) {
            this.d = n8;
            this.a = Thread.currentThread().getThreadGroup();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(e.getAndIncrement());
            stringBuilder.append("-thread-");
            this.c = stringBuilder.toString();
        }

        @Override
        public Thread newThread(Runnable runnable2) {
            ThreadGroup threadGroup = this.a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.c);
            stringBuilder.append(this.b.getAndIncrement());
            runnable2 = new Thread(threadGroup, runnable2, stringBuilder.toString(), 0L);
            if (((Thread)runnable2).isDaemon()) {
                ((Thread)runnable2).setDaemon(false);
            }
            ((Thread)runnable2).setPriority(this.d);
            return runnable2;
        }
    }
}

