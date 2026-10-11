/*
 * Decompiled with CFR 0.152.
 */
package ax.u3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import ax.u3.v;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class q<Params, Progress, Result>
implements ax.u3.c {
    private static final d g = new d(Looper.getMainLooper());
    private final g<Params, Result> a;
    private final FutureTask<Result> b;
    private volatile f c = ax.u3.q$f.q;
    private final AtomicBoolean d = new AtomicBoolean();
    private final AtomicBoolean e = new AtomicBoolean();
    private final e f;

    public q(e object) {
        this.f = object;
        object = new g<Params, Result>(this, (e)object){
            final e b;
            final q c;
            {
                this.c = q8;
                this.b = e8;
            }

            @Override
            public Result call() throws Exception {
                this.c.e.set(true);
                Process.setThreadPriority((int)this.b.h());
                q q8 = this.c;
                return q8.t(q8.g(this.a));
            }
        };
        this.a = object;
        this.b = new FutureTask<Result>(this, (Callable)object){
            final q q;
            {
                this.q = q8;
                super(callable);
            }

            @Override
            protected void done() {
                block6: {
                    InterruptedException interruptedException2;
                    block5: {
                        try {
                            this.q.u(this.get());
                            return;
                        }
                        catch (ExecutionException executionException) {
                        }
                        catch (InterruptedException interruptedException2) {
                            break block5;
                        }
                        catch (CancellationException cancellationException) {
                            this.q.u(null);
                            break block6;
                        }
                        if (executionException.getCause() != null) {
                            ax.Ha.c.h().f().b("AsyncTask ExcecutionException").l(executionException.getCause()).h();
                        }
                        throw new RuntimeException("An error occured while executing doInBackground()", executionException.getCause());
                    }
                    Log.w((String)"PriorityAsyncTask", (Throwable)interruptedException2);
                }
            }
        };
    }

    private void k(Result Result2) {
        f f8 = this.c;
        f f9 = ax.u3.q$f.d0;
        if (f8 == f9) {
            ax.Ha.c.h().c("AsyncTask finish called twice!").g(this.isCancelled()).h();
            return;
        }
        if (this.isCancelled()) {
            this.p(Result2);
        } else {
            this.q(Result2);
        }
        this.c = f9;
    }

    public static boolean n(q q8) {
        return q8 != null && q8.m() == ax.u3.q$f.c0;
    }

    private Result t(Result Result2) {
        g.obtainMessage(1, new c<Object>(this, Result2)).sendToTarget();
        return Result2;
    }

    private void u(Result Result2) {
        if (!this.e.get()) {
            this.t(Result2);
        }
    }

    public final boolean e() {
        return this.f(false);
    }

    public final boolean f(boolean bl) {
        this.d.set(true);
        return this.b.cancel(bl);
    }

    protected abstract Result g(Params ... var1);

    public final q<Params, Progress, Result> h(Params ... ParamsArray) {
        return this.j(v.e(this.f), ParamsArray);
    }

    public final q<Params, Progress, Result> i(Params ... ParamsArray) {
        return this.j(v.f(this.f), ParamsArray);
    }

    @Override
    public final boolean isCancelled() {
        return this.d.get();
    }

    public final q<Params, Progress, Result> j(Executor executor, Params ... ParamsArray) {
        if (this.c != ax.u3.q$f.q) {
            int n8 = this.c.ordinal();
            if (n8 != 1) {
                if (n8 == 2) {
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
            } else {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
        }
        this.c = ax.u3.q$f.c0;
        this.r();
        this.a.a = ParamsArray;
        executor.execute(this.b);
        return this;
    }

    public final Result l() throws InterruptedException, ExecutionException {
        return this.b.get();
    }

    public final f m() {
        return this.c;
    }

    protected void o() {
    }

    protected void p(Result Result2) {
        this.o();
    }

    protected void q(Result Result2) {
    }

    protected void r() {
    }

    protected void s(Progress ... ProgressArray) {
    }

    protected final void v(Progress ... ProgressArray) {
        if (!this.isCancelled()) {
            g.obtainMessage(2, new c<Progress>(this, ProgressArray)).sendToTarget();
        }
    }

    private static class c<Data> {
        final q a;
        final Data[] b;

        c(q q8, Data ... DataArray) {
            this.a = q8;
            this.b = DataArray;
        }
    }

    private static class d
    extends Handler {
        d(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            c c8 = (c)message.obj;
            int n8 = message.what;
            if (n8 != 1) {
                if (n8 != 2) {
                    return;
                }
                c8.a.s(c8.b);
                return;
            }
            c8.a.k(c8.b[0]);
        }
    }

    public static final class e
    extends Enum<e> {
        public static final /* enum */ e c0 = new e(1);
        public static final /* enum */ e d0 = new e(2);
        public static final /* enum */ e e0 = new e(4);
        public static final /* enum */ e f0 = new e(6);
        public static final /* enum */ e g0 = new e(8);
        public static final /* enum */ e h0 = new e(9);
        public static final /* enum */ e i0 = new e(10);
        public static final /* enum */ e j0 = new e(7);
        private static final e[] k0 = ax.u3.q$e.d();
        private int q;

        private e(int n9) {
            this.q = n9;
        }

        private static /* synthetic */ e[] d() {
            return new e[]{c0, d0, e0, f0, g0, h0, i0, j0};
        }

        public static e valueOf(String string) {
            return Enum.valueOf(e.class, string);
        }

        public static e[] values() {
            return (e[])k0.clone();
        }

        public int h() {
            return this.q;
        }
    }

    public static final class f
    extends Enum<f> {
        public static final /* enum */ f c0;
        public static final /* enum */ f d0;
        private static final f[] e0;
        public static final /* enum */ f q;

        static {
            q = new f();
            c0 = new f();
            d0 = new f();
            e0 = ax.u3.q$f.d();
        }

        private static /* synthetic */ f[] d() {
            return new f[]{q, c0, d0};
        }

        public static f valueOf(String string) {
            return Enum.valueOf(f.class, string);
        }

        public static f[] values() {
            return (f[])e0.clone();
        }
    }

    private static abstract class g<Params, Result>
    implements Callable<Result> {
        Params[] a;

        private g() {
        }
    }
}

