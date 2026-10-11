package ax.Z;

import android.os.Handler;
import android.os.Process;
import ax.b0.InterfaceC1440a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
class l {

    private static class a implements ThreadFactory {
        private String a;
        private int b;

        /* renamed from: ax.Z.l$a$a, reason: collision with other inner class name */
        private static class C0229a extends Thread {
            private final int q;

            C0229a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.q = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.q);
                super.run();
            }
        }

        a(String str, int i) {
            this.a = str;
            this.b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0229a(runnable, this.a, this.b);
        }
    }

    private static class b<T> implements Runnable {
        private InterfaceC1440a<T> c0;
        private Handler d0;
        private Callable<T> q;

        class a implements Runnable {
            final /* synthetic */ Object c0;
            final /* synthetic */ InterfaceC1440a q;

            a(InterfaceC1440a interfaceC1440a, Object obj) {
                this.q = interfaceC1440a;
                this.c0 = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.q.accept(this.c0);
            }
        }

        b(Handler handler, Callable<T> callable, InterfaceC1440a<T> interfaceC1440a) {
            this.q = callable;
            this.c0 = interfaceC1440a;
            this.d0 = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t;
            try {
                t = this.q.call();
            } catch (Exception unused) {
                t = null;
            }
            this.d0.post(new a(this.c0, t));
        }
    }

    static ThreadPoolExecutor a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static <T> void b(Executor executor, Callable<T> callable, InterfaceC1440a<T> interfaceC1440a) {
        executor.execute(new b(ax.Z.b.a(), callable, interfaceC1440a));
    }

    static <T> T c(ExecutorService executorService, Callable<T> callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
