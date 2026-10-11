/*
 * Decompiled with CFR 0.152.
 */
package ax.Z;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class l {
    static ThreadPoolExecutor a(String object, int n8, int n9) {
        object = new a((String)object, n8);
        object = new ThreadPoolExecutor(0, 1, (long)n9, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<Runnable>(), (ThreadFactory)object);
        ((ThreadPoolExecutor)object).allowCoreThreadTimeOut(true);
        return object;
    }

    static <T> void b(Executor executor, Callable<T> callable, ax.b0.a<T> a8) {
        executor.execute(new b<T>(ax.Z.b.a(), callable, a8));
    }

    static <T> T c(ExecutorService object, Callable<T> callable, int n8) throws InterruptedException {
        object = object.submit(callable);
        long l8 = n8;
        try {
            object = object.get(l8, TimeUnit.MILLISECONDS);
        }
        catch (TimeoutException timeoutException) {
            throw new InterruptedException("timeout");
        }
        catch (InterruptedException interruptedException) {
            throw interruptedException;
        }
        catch (ExecutionException executionException) {
            throw new RuntimeException(executionException);
        }
        return (T)object;
    }

    private static class ax.Z.l$a
    implements ThreadFactory {
        private String a;
        private int b;

        ax.Z.l$a(String string, int n8) {
            this.a = string;
            this.b = n8;
        }

        @Override
        public Thread newThread(Runnable runnable2) {
            return new a(runnable2, this.a, this.b);
        }

        private static class a
        extends Thread {
            private final int q;

            a(Runnable runnable2, String string, int n8) {
                super(runnable2, string);
                this.q = n8;
            }

            @Override
            public void run() {
                Process.setThreadPriority((int)this.q);
                super.run();
            }
        }
    }

    private static class b<T>
    implements Runnable {
        private ax.b0.a<T> c0;
        private Handler d0;
        private Callable<T> q;

        b(Handler handler, Callable<T> callable, ax.b0.a<T> a8) {
            this.q = callable;
            this.c0 = a8;
            this.d0 = handler;
        }

        @Override
        public void run() {
            T t8;
            try {
                t8 = this.q.call();
            }
            catch (Exception exception) {
                t8 = null;
            }
            ax.b0.a<T> a8 = this.c0;
            this.d0.post(new Runnable(){
                final Object c0;
                final b d0;
                final ax.b0.a q;
                {
                    this.d0 = b8;
                    this.q = a8;
                    this.c0 = object;
                }

                @Override
                public void run() {
                    this.q.accept(this.c0);
                }
            });
        }
    }
}

