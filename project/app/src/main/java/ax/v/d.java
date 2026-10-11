/*
 * Decompiled with CFR 0.152.
 */
package ax.v;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import ax.v.e;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class d
extends e {
    private final Object a = new Object();
    private final ExecutorService b = Executors.newFixedThreadPool(4, new ThreadFactory(this){
        private final AtomicInteger a;
        final d b;
        {
            this.b = d8;
            this.a = new AtomicInteger(0);
        }

        @Override
        public Thread newThread(Runnable object) {
            Thread thread = new Thread((Runnable)object);
            object = new StringBuilder();
            ((StringBuilder)object).append("arch_disk_io_");
            ((StringBuilder)object).append(this.a.getAndIncrement());
            thread.setName(((StringBuilder)object).toString());
            return thread;
        }
    });
    private volatile Handler c;

    private static Handler d(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ax.v.d$b.a(looper);
        }
        try {
            Handler handler = (Handler)Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            return handler;
        }
        catch (InvocationTargetException invocationTargetException) {
            return new Handler(looper);
        }
        catch (IllegalAccessException | InstantiationException | NoSuchMethodException reflectiveOperationException) {
            return new Handler(looper);
        }
    }

    @Override
    public void a(Runnable runnable2) {
        this.b.execute(runnable2);
    }

    @Override
    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void c(Runnable runnable2) {
        block6: {
            if (this.c == null) {
                Object object = this.a;
                synchronized (object) {
                    Throwable throwable2;
                    block5: {
                        block4: {
                            try {
                                if (this.c != null) break block4;
                                this.c = d.d(Looper.getMainLooper());
                            }
                            catch (Throwable throwable2) {
                                break block5;
                            }
                        }
                        break block6;
                    }
                    throw throwable2;
                }
            }
        }
        this.c.post(runnable2);
    }

    private static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync((Looper)looper);
        }
    }
}

