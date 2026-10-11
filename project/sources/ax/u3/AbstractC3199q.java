package ax.u3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ax.u3.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3199q<Params, Progress, Result> implements InterfaceC3185c {
    private static final d g = new d(Looper.getMainLooper());
    private final g<Params, Result> a;
    private final FutureTask<Result> b;
    private volatile f c = f.PENDING;
    private final AtomicBoolean d = new AtomicBoolean();
    private final AtomicBoolean e = new AtomicBoolean();
    private final e f;

    /* renamed from: ax.u3.q$a */
    class a extends g<Params, Result> {
        final /* synthetic */ e b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(null);
            this.b = eVar;
        }

        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            AbstractC3199q.this.e.set(true);
            Process.setThreadPriority(this.b.h());
            AbstractC3199q abstractC3199q = AbstractC3199q.this;
            return (Result) abstractC3199q.t(abstractC3199q.g(this.a));
        }
    }

    /* renamed from: ax.u3.q$b */
    class b extends FutureTask<Result> {
        b(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                AbstractC3199q.this.u(get());
            } catch (InterruptedException e) {
                Log.w("PriorityAsyncTask", e);
            } catch (CancellationException unused) {
                AbstractC3199q.this.u(null);
            } catch (ExecutionException e2) {
                if (e2.getCause() != null) {
                    ax.Ha.c.h().f().b("AsyncTask ExcecutionException").l(e2.getCause()).h();
                }
                throw new RuntimeException("An error occured while executing doInBackground()", e2.getCause());
            }
        }
    }

    /* renamed from: ax.u3.q$c */
    private static class c<Data> {
        final AbstractC3199q a;
        final Data[] b;

        c(AbstractC3199q abstractC3199q, Data... dataArr) {
            this.a = abstractC3199q;
            this.b = dataArr;
        }
    }

    /* renamed from: ax.u3.q$d */
    private static class d extends Handler {
        d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            c cVar = (c) message.obj;
            int i = message.what;
            if (i == 1) {
                cVar.a.k(cVar.b[0]);
            } else {
                if (i != 2) {
                    return;
                }
                cVar.a.s(cVar.b);
            }
        }
    }

    /* renamed from: ax.u3.q$e */
    public enum e {
        CONNECT(1),
        HIGHER(2),
        HIGH(4),
        NORMAL(6),
        LOW(8),
        IMAGE_CACHE_LOADER(9),
        IMAGE_LOADER(10),
        FILE_SCAN(7);

        private int q;

        e(int i) {
            this.q = i;
        }

        public int h() {
            return this.q;
        }
    }

    /* renamed from: ax.u3.q$f */
    public enum f {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: ax.u3.q$g */
    private static abstract class g<Params, Result> implements Callable<Result> {
        Params[] a;

        private g() {
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    public AbstractC3199q(e eVar) {
        this.f = eVar;
        a aVar = new a(eVar);
        this.a = aVar;
        this.b = new b(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(Result result) {
        f fVar = this.c;
        f fVar2 = f.FINISHED;
        if (fVar == fVar2) {
            ax.Ha.c.h().c("AsyncTask finish called twice!").g(Boolean.valueOf(isCancelled())).h();
            return;
        }
        if (isCancelled()) {
            p(result);
        } else {
            q(result);
        }
        this.c = fVar2;
    }

    public static boolean n(AbstractC3199q abstractC3199q) {
        return abstractC3199q != null && abstractC3199q.m() == f.RUNNING;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Result t(Result result) {
        g.obtainMessage(1, new c(this, result)).sendToTarget();
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(Result result) {
        if (this.e.get()) {
            return;
        }
        t(result);
    }

    public final boolean e() {
        return f(false);
    }

    public final boolean f(boolean z) {
        this.d.set(true);
        return this.b.cancel(z);
    }

    protected abstract Result g(Params... paramsArr);

    public final AbstractC3199q<Params, Progress, Result> h(Params... paramsArr) {
        return j(C3204v.e(this.f), paramsArr);
    }

    public final AbstractC3199q<Params, Progress, Result> i(Params... paramsArr) {
        return j(C3204v.f(this.f), paramsArr);
    }

    @Override // ax.u3.InterfaceC3185c
    public final boolean isCancelled() {
        return this.d.get();
    }

    public final AbstractC3199q<Params, Progress, Result> j(Executor executor, Params... paramsArr) {
        if (this.c != f.PENDING) {
            int ordinal = this.c.ordinal();
            if (ordinal == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (ordinal == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.c = f.RUNNING;
        r();
        this.a.a = paramsArr;
        executor.execute(this.b);
        return this;
    }

    public final Result l() throws InterruptedException, ExecutionException {
        return this.b.get();
    }

    public final f m() {
        return this.c;
    }

    protected void p(Result result) {
        o();
    }

    protected final void v(Progress... progressArr) {
        if (isCancelled()) {
            return;
        }
        g.obtainMessage(2, new c(this, progressArr)).sendToTarget();
    }

    protected void o() {
    }

    protected void r() {
    }

    protected void q(Result result) {
    }

    protected void s(Progress... progressArr) {
    }
}
