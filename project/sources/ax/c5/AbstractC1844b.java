package ax.c5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ax.c5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1844b<Params, Progress, Result> {
    private static final ThreadFactory f0;
    private static final BlockingQueue<Runnable> g0;
    public static final Executor h0;
    public static final Executor i0;
    private static e j0;
    private static volatile Executor k0;
    private final FutureTask<Result> c0;
    private volatile g d0 = g.PENDING;
    private final AtomicBoolean e0 = new AtomicBoolean();
    private final h<Params, Result> q;

    /* renamed from: ax.c5.b$a */
    class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.a.getAndIncrement());
        }
    }

    /* renamed from: ax.c5.b$b, reason: collision with other inner class name */
    class C0270b extends h<Params, Result> {
        C0270b() {
            super(null);
        }

        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            AbstractC1844b.this.e0.set(true);
            Process.setThreadPriority(10);
            AbstractC1844b abstractC1844b = AbstractC1844b.this;
            return (Result) abstractC1844b.p(abstractC1844b.f(this.a));
        }
    }

    /* renamed from: ax.c5.b$c */
    class c extends FutureTask<Result> {
        c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                AbstractC1844b.this.q(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (CancellationException unused) {
                AbstractC1844b.this.q(null);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* renamed from: ax.c5.b$d */
    private static class d<Data> {
        final AbstractC1844b a;
        final Data[] b;

        d(AbstractC1844b abstractC1844b, Data... dataArr) {
            this.a = abstractC1844b;
            this.b = dataArr;
        }
    }

    /* renamed from: ax.c5.b$e */
    private static class e extends Handler {
        public e() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            d dVar = (d) message.obj;
            int i = message.what;
            if (i == 1) {
                dVar.a.h(dVar.b[0]);
            } else {
                if (i != 2) {
                    return;
                }
                dVar.a.o(dVar.b);
            }
        }
    }

    /* renamed from: ax.c5.b$g */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: ax.c5.b$h */
    private static abstract class h<Params, Result> implements Callable<Result> {
        Params[] a;

        private h() {
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    static {
        a aVar = new a();
        f0 = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        g0 = linkedBlockingQueue;
        h0 = new f(null);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        i0 = threadPoolExecutor;
        k0 = threadPoolExecutor;
    }

    public AbstractC1844b() {
        C0270b c0270b = new C0270b();
        this.q = c0270b;
        this.c0 = new c(c0270b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(Result result) {
        if (j()) {
            l(result);
        } else {
            m(result);
        }
        this.d0 = g.FINISHED;
    }

    private static Handler i() {
        e eVar;
        synchronized (AbstractC1844b.class) {
            try {
                if (j0 == null) {
                    j0 = new e();
                }
                eVar = j0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Result p(Result result) {
        i().obtainMessage(1, new d(this, result)).sendToTarget();
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(Result result) {
        if (this.e0.get()) {
            return;
        }
        p(result);
    }

    public final boolean e(boolean z) {
        return this.c0.cancel(z);
    }

    protected abstract Result f(Params... paramsArr);

    public final AbstractC1844b<Params, Progress, Result> g(Executor executor, Params... paramsArr) {
        if (this.d0 != g.PENDING) {
            int ordinal = this.d0.ordinal();
            if (ordinal == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (ordinal == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.d0 = g.RUNNING;
        n();
        this.q.a = paramsArr;
        executor.execute(this.c0);
        return this;
    }

    public final boolean j() {
        return this.c0.isCancelled();
    }

    protected void l(Result result) {
        k();
    }

    /* renamed from: ax.c5.b$f */
    private static class f implements Executor {
        Runnable c0;
        final ArrayDeque<Runnable> q;

        /* renamed from: ax.c5.b$f$a */
        class a implements Runnable {
            final /* synthetic */ Runnable q;

            a(Runnable runnable) {
                this.q = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.q.run();
                } finally {
                    f.this.a();
                }
            }
        }

        private f() {
            this.q = new ArrayDeque<>();
        }

        protected synchronized void a() {
            Runnable poll = this.q.poll();
            this.c0 = poll;
            if (poll != null) {
                AbstractC1844b.i0.execute(poll);
            }
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(Runnable runnable) {
            this.q.offer(new a(runnable));
            if (this.c0 == null) {
                a();
            }
        }

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    protected void k() {
    }

    protected void n() {
    }

    protected void m(Result result) {
    }

    protected void o(Progress... progressArr) {
    }
}
