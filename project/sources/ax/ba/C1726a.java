package ax.ba;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import ax.da.C1952a;
import ax.ea.C1992a;
import ax.ea.InterfaceC1993b;
import ax.fa.C2088b;
import ax.fa.InterfaceC2087a;
import ax.ga.C2132a;
import ax.ga.InterfaceC2133b;
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

/* renamed from: ax.ba.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1726a {

    /* renamed from: ax.ba.a$a, reason: collision with other inner class name */
    private static class ThreadFactoryC0261a implements ThreadFactory {
        private static final AtomicInteger e = new AtomicInteger(1);
        private final String c;
        private final int d;
        private final AtomicInteger b = new AtomicInteger(1);
        private final ThreadGroup a = Thread.currentThread().getThreadGroup();

        ThreadFactoryC0261a(int i, String str) {
            this.d = i;
            this.c = str + e.getAndIncrement() + "-thread-";
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.a, runnable, this.c + this.b.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            thread.setPriority(this.d);
            return thread;
        }
    }

    public static InterfaceC2087a a() {
        return new C2088b();
    }

    public static ax.V9.a b(Context context, ax.Y9.a aVar, long j, int i) {
        ax.Y9.a aVar2;
        File h = h(context);
        if (j > 0 || i > 0) {
            try {
                aVar2 = aVar;
            } catch (IOException e) {
                e = e;
                aVar2 = aVar;
            }
            try {
                return new ax.X9.b(ax.ka.f.d(context), h, aVar2, j, i);
            } catch (IOException e2) {
                e = e2;
                ax.ka.d.c(e);
                return new ax.W9.b(ax.ka.f.a(context), h, aVar2);
            }
        }
        aVar2 = aVar;
        return new ax.W9.b(ax.ka.f.a(context), h, aVar2);
    }

    public static Executor c(int i, int i2, ax.ca.g gVar) {
        return new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, (BlockingQueue<Runnable>) (gVar == ax.ca.g.LIFO ? new C1952a() : new LinkedBlockingQueue()), j(i2, "uil-pool-"));
    }

    public static ax.Y9.a d() {
        return new ax.Y9.b();
    }

    public static InterfaceC1993b e(boolean z) {
        return new C1992a(z);
    }

    public static InterfaceC2133b f(Context context) {
        return new C2132a(context);
    }

    public static ax.Z9.a g(Context context, int i) {
        if (i == 0) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            int memoryClass = activityManager.getMemoryClass();
            if (l() && m(context)) {
                memoryClass = k(activityManager);
            }
            i = (memoryClass * 1048576) / 8;
        }
        return new ax.aa.b(i);
    }

    private static File h(Context context) {
        File b = ax.ka.f.b(context, false);
        File file = new File(b, "uil-images");
        return (file.exists() || file.mkdir()) ? file : b;
    }

    public static Executor i() {
        return Executors.newCachedThreadPool(j(5, "uil-pool-d-"));
    }

    private static ThreadFactory j(int i, String str) {
        return new ThreadFactoryC0261a(i, str);
    }

    @TargetApi(11)
    private static int k(ActivityManager activityManager) {
        return activityManager.getLargeMemoryClass();
    }

    private static boolean l() {
        return true;
    }

    @TargetApi(11)
    private static boolean m(Context context) {
        return (context.getApplicationInfo().flags & 1048576) != 0;
    }
}
