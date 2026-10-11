package ax.K0;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
abstract class d<Result> {
    private static Handler f0;
    private volatile e c0 = e.PENDING;
    final AtomicBoolean d0 = new AtomicBoolean();
    final AtomicBoolean e0 = new AtomicBoolean();
    private final FutureTask<Result> q = new b(new a());

    class a implements Callable<Result> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() {
            d.this.e0.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) d.this.b();
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    class b extends FutureTask<Result> {
        b(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                d.this.j(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (CancellationException unused) {
                d.this.j(null);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    class c implements Runnable {
        final /* synthetic */ Object q;

        c(Object obj) {
            this.q = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            d.this.d(this.q);
        }
    }

    /* renamed from: ax.K0.d$d, reason: collision with other inner class name */
    static /* synthetic */ class C0103d {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.values().length];
            a = iArr;
            try {
                iArr[e.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum e {
        PENDING,
        RUNNING,
        FINISHED
    }

    d() {
    }

    private static Handler e() {
        Handler handler;
        synchronized (d.class) {
            try {
                if (f0 == null) {
                    f0 = new Handler(Looper.getMainLooper());
                }
                handler = f0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final boolean a(boolean z) {
        this.d0.set(true);
        return this.q.cancel(z);
    }

    protected abstract Result b();

    public final void c(Executor executor) {
        if (this.c0 == e.PENDING) {
            this.c0 = e.RUNNING;
            executor.execute(this.q);
            return;
        }
        int i = C0103d.a[this.c0.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    void d(Result result) {
        if (f()) {
            g(result);
        } else {
            h(result);
        }
        this.c0 = e.FINISHED;
    }

    public final boolean f() {
        return this.d0.get();
    }

    void i(Result result) {
        e().post(new c(result));
    }

    void j(Result result) {
        if (this.e0.get()) {
            return;
        }
        i(result);
    }

    protected void g(Result result) {
    }

    protected void h(Result result) {
    }
}
