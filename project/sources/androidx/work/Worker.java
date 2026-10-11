package androidx.work;

import android.content.Context;
import androidx.work.c;
import ax.v7.e;

/* loaded from: classes.dex */
public abstract class Worker extends c {
    ax.M2.c<c.a> e;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.e.p(Worker.this.o());
            } catch (Throwable th) {
                Worker.this.e.q(th);
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ ax.M2.c q;

        b(ax.M2.c cVar) {
            this.q = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.q.p(Worker.this.p());
            } catch (Throwable th) {
                this.q.q(th);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.c
    public e<ax.B2.e> d() {
        ax.M2.c t = ax.M2.c.t();
        c().execute(new b(t));
        return t;
    }

    @Override // androidx.work.c
    public final e<c.a> m() {
        this.e = ax.M2.c.t();
        c().execute(new a());
        return this.e;
    }

    public abstract c.a o();

    public ax.B2.e p() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }
}
