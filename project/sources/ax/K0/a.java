package ax.K0;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import ax.Y.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class a<D> extends c<D> {
    private Executor i;
    private volatile a<D>.RunnableC0102a j;
    private volatile a<D>.RunnableC0102a k;
    private long l;
    private long m;
    private Handler n;

    /* renamed from: ax.K0.a$a, reason: collision with other inner class name */
    final class RunnableC0102a extends d<D> implements Runnable {
        boolean g0;

        RunnableC0102a() {
        }

        @Override // ax.K0.d
        protected D b() {
            try {
                return (D) a.this.K();
            } catch (r e) {
                if (f()) {
                    return null;
                }
                throw e;
            }
        }

        @Override // ax.K0.d
        protected void g(D d) {
            a.this.D(this, d);
        }

        @Override // ax.K0.d
        protected void h(D d) {
            a.this.E(this, d);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.g0 = false;
            a.this.F();
        }
    }

    public a(Context context) {
        super(context);
        this.m = -10000L;
    }

    void D(a<D>.RunnableC0102a runnableC0102a, D d) {
        J(d);
        if (this.k == runnableC0102a) {
            x();
            this.m = SystemClock.uptimeMillis();
            this.k = null;
            g();
            F();
        }
    }

    void E(a<D>.RunnableC0102a runnableC0102a, D d) {
        if (this.j != runnableC0102a) {
            D(runnableC0102a, d);
            return;
        }
        if (l()) {
            J(d);
            return;
        }
        e();
        this.m = SystemClock.uptimeMillis();
        this.j = null;
        h(d);
    }

    void F() {
        if (this.k != null || this.j == null) {
            return;
        }
        if (this.j.g0) {
            this.j.g0 = false;
            this.n.removeCallbacks(this.j);
        }
        if (this.l > 0 && SystemClock.uptimeMillis() < this.m + this.l) {
            this.j.g0 = true;
            this.n.postAtTime(this.j, this.m + this.l);
        } else {
            if (this.i == null) {
                this.i = G();
            }
            this.j.c(this.i);
        }
    }

    protected Executor G() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public boolean H() {
        return this.k != null;
    }

    public abstract D I();

    protected D K() {
        return I();
    }

    @Override // ax.K0.c
    @Deprecated
    public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.i(str, fileDescriptor, printWriter, strArr);
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.j);
            printWriter.print(" waiting=");
            printWriter.println(this.j.g0);
        }
        if (this.k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.k);
            printWriter.print(" waiting=");
            printWriter.println(this.k.g0);
        }
        if (this.l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            printWriter.print(DateUtils.formatElapsedTime(timeUnit.toSeconds(this.l)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.m == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + DateUtils.formatElapsedTime(timeUnit.toSeconds(SystemClock.uptimeMillis() - this.m));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    @Override // ax.K0.c
    protected boolean p() {
        if (this.j == null) {
            return false;
        }
        if (!n()) {
            q();
        }
        if (this.k != null) {
            if (this.j.g0) {
                this.j.g0 = false;
                this.n.removeCallbacks(this.j);
            }
            this.j = null;
            return false;
        }
        if (this.j.g0) {
            this.j.g0 = false;
            this.n.removeCallbacks(this.j);
            this.j = null;
            return false;
        }
        boolean a = this.j.a(false);
        if (a) {
            this.k = this.j;
            C();
        }
        this.j = null;
        return a;
    }

    @Override // ax.K0.c
    protected void r() {
        super.r();
        d();
        this.j = new RunnableC0102a();
        F();
    }

    public void C() {
    }

    public void J(D d) {
    }
}
