/*
 * Decompiled with CFR 0.152.
 */
package ax.K0;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

abstract class d<Result> {
    private static Handler f0;
    private volatile e c0 = e.q;
    final AtomicBoolean d0 = new AtomicBoolean();
    final AtomicBoolean e0 = new AtomicBoolean();
    private final FutureTask<Result> q = new FutureTask<Result>(this, new Callable<Result>(this){
        final d a;
        {
            this.a = d8;
        }

        @Override
        public Result call() {
            Object Result;
            this.a.e0.set(true);
            Object Result2 = Result = null;
            try {
                Process.setThreadPriority((int)10);
                Result2 = Result;
            }
            catch (Throwable throwable) {
                try {
                    this.a.d0.set(true);
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    this.a.i(Result2);
                    throw throwable2;
                }
            }
            Result2 = Result = (Object)this.a.b();
            Binder.flushPendingCommands();
            this.a.i(Result);
            return Result;
        }
    }){
        final d q;
        {
            this.q = d8;
            super(callable);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        protected void done() {
            try {
                Object v8 = this.get();
                this.q.j(v8);
                return;
            }
            catch (ExecutionException executionException) {}
            catch (InterruptedException interruptedException) {}
            catch (CancellationException cancellationException) {
                this.q.j(null);
            }
            finally {
                Throwable throwable;
                throw new RuntimeException("An error occurred while executing doInBackground()", throwable);
            }
        }
    };

    d() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Handler e() {
        synchronized (d.class) {
            try {
                Handler handler;
                if (f0 != null) return f0;
                f0 = handler = new Handler(Looper.getMainLooper());
                return f0;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final boolean a(boolean bl) {
        this.d0.set(true);
        return this.q.cancel(bl);
    }

    protected abstract Result b();

    public final void c(Executor executor) {
        if (this.c0 != e.q) {
            int n8 = d.a[this.c0.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    throw new IllegalStateException("We should never reach this state");
                }
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        this.c0 = e.c0;
        executor.execute(this.q);
    }

    void d(Result Result) {
        if (this.f()) {
            this.g(Result);
        } else {
            this.h(Result);
        }
        this.c0 = e.d0;
    }

    public final boolean f() {
        return this.d0.get();
    }

    protected void g(Result Result) {
    }

    protected void h(Result Result) {
    }

    void i(Result Result) {
        d.e().post(new Runnable(this, Result){
            final d c0;
            final Object q;
            {
                this.c0 = d8;
                this.q = object;
            }

            @Override
            public void run() {
                this.c0.d(this.q);
            }
        });
    }

    void j(Result Result) {
        if (!this.e0.get()) {
            this.i(Result);
        }
    }

    public static final class e
    extends Enum<e> {
        public static final /* enum */ e c0;
        public static final /* enum */ e d0;
        private static final e[] e0;
        public static final /* enum */ e q;

        static {
            e e8;
            e e9;
            e e10;
            q = e10 = new e();
            c0 = e9 = new e();
            d0 = e8 = new e();
            e0 = new e[]{e10, e9, e8};
        }

        public static e valueOf(String string) {
            return Enum.valueOf(e.class, string);
        }

        public static e[] values() {
            return (e[])e0.clone();
        }
    }
}

