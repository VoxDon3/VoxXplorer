/*
 * Decompiled with CFR 0.152.
 */
package ax.c5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
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

public abstract class b<Params, Progress, Result> {
    private static final ThreadFactory f0;
    private static final BlockingQueue<Runnable> g0;
    public static final Executor h0;
    public static final Executor i0;
    private static e j0;
    private static volatile Executor k0;
    private final FutureTask<Result> c0;
    private volatile g d0 = g.q;
    private final AtomicBoolean e0 = new AtomicBoolean();
    private final h<Params, Result> q;

    static {
        Object object = new ThreadFactory(){
            private final AtomicInteger a = new AtomicInteger(1);

            @Override
            public Thread newThread(Runnable runnable2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ModernAsyncTask #");
                stringBuilder.append(this.a.getAndIncrement());
                return new Thread(runnable2, stringBuilder.toString());
            }
        };
        f0 = object;
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<Runnable>(10);
        g0 = linkedBlockingQueue;
        h0 = new f();
        i0 = object = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, (ThreadFactory)object);
        k0 = object;
    }

    public b() {
        h h8;
        this.q = h8 = new h<Params, Result>(this){
            final b b;
            {
                this.b = b8;
            }

            @Override
            public Result call() throws Exception {
                this.b.e0.set(true);
                Process.setThreadPriority((int)10);
                b b8 = this.b;
                return b8.p(b8.f(this.a));
            }
        };
        this.c0 = new FutureTask<Result>(this, h8){
            final b q;
            {
                this.q = b8;
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
                    this.q.q(v8);
                    return;
                }
                catch (ExecutionException executionException) {}
                catch (InterruptedException interruptedException) {}
                catch (CancellationException cancellationException) {
                    this.q.q(null);
                }
                finally {
                    Throwable throwable;
                    throw new RuntimeException("An error occurred while executing doInBackground()", throwable);
                }
            }
        };
    }

    private void h(Result Result2) {
        if (this.j()) {
            this.l(Result2);
        } else {
            this.m(Result2);
        }
        this.d0 = g.d0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Handler i() {
        synchronized (b.class) {
            try {
                e e8;
                if (j0 != null) return j0;
                j0 = e8 = new e();
                return j0;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private Result p(Result Result2) {
        b.i().obtainMessage(1, new d<Object>(this, Result2)).sendToTarget();
        return Result2;
    }

    private void q(Result Result2) {
        if (!this.e0.get()) {
            this.p(Result2);
        }
    }

    public final boolean e(boolean bl) {
        return this.c0.cancel(bl);
    }

    protected abstract Result f(Params ... var1);

    public final b<Params, Progress, Result> g(Executor executor, Params ... ParamsArray) {
        if (this.d0 != g.q) {
            int n8 = this.d0.ordinal();
            if (n8 != 1) {
                if (n8 == 2) {
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
            } else {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
        }
        this.d0 = g.c0;
        this.n();
        this.q.a = ParamsArray;
        executor.execute(this.c0);
        return this;
    }

    public final boolean j() {
        return this.c0.isCancelled();
    }

    protected void k() {
    }

    protected void l(Result Result2) {
        this.k();
    }

    protected void m(Result Result2) {
    }

    protected void n() {
    }

    protected void o(Progress ... ProgressArray) {
    }

    private static class d<Data> {
        final b a;
        final Data[] b;

        d(b b8, Data ... DataArray) {
            this.a = b8;
            this.b = DataArray;
        }
    }

    private static class e
    extends Handler {
        public e() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            d d8 = (d)message.obj;
            int n8 = message.what;
            if (n8 != 1) {
                if (n8 != 2) {
                    return;
                }
                d8.a.o(d8.b);
                return;
            }
            d8.a.h(d8.b[0]);
        }
    }

    private static class f
    implements Executor {
        Runnable c0;
        final ArrayDeque<Runnable> q = new ArrayDeque();

        private f() {
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected void a() {
            synchronized (this) {
                Throwable throwable2;
                block5: {
                    block4: {
                        try {
                            Runnable runnable2;
                            this.c0 = runnable2 = this.q.poll();
                            if (runnable2 == null) break block4;
                            i0.execute(runnable2);
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    return;
                }
                throw throwable2;
            }
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void execute(Runnable runnable2) {
            synchronized (this) {
                Throwable throwable2;
                block5: {
                    block4: {
                        try {
                            ArrayDeque<Runnable> arrayDeque = this.q;
                            Runnable runnable3 = new Runnable(){
                                final f c0;
                                final Runnable q;
                                {
                                    this.c0 = f8;
                                    this.q = runnable2;
                                }

                                @Override
                                public void run() {
                                    try {
                                        this.q.run();
                                        return;
                                    }
                                    finally {
                                        this.c0.a();
                                    }
                                }
                            };
                            arrayDeque.offer(runnable3);
                            if (this.c0 != null) break block4;
                            this.a();
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    return;
                }
                throw throwable2;
            }
        }
    }

    public static final class g
    extends Enum<g> {
        public static final /* enum */ g c0;
        public static final /* enum */ g d0;
        private static final g[] e0;
        public static final /* enum */ g q;

        static {
            q = new g();
            c0 = new g();
            d0 = new g();
            e0 = g.d();
        }

        private static /* synthetic */ g[] d() {
            return new g[]{q, c0, d0};
        }

        public static g valueOf(String string) {
            return Enum.valueOf(g.class, string);
        }

        public static g[] values() {
            return (g[])e0.clone();
        }
    }

    private static abstract class h<Params, Result>
    implements Callable<Result> {
        Params[] a;

        private h() {
        }
    }
}

