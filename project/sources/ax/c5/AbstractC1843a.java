package ax.c5;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import ax.K0.c;
import ax.Y.r;
import ax.b0.C1448i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: ax.c5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1843a<D> extends c<D> {
    private final Executor i;
    volatile AbstractC1843a<D>.RunnableC0269a j;
    volatile AbstractC1843a<D>.RunnableC0269a k;
    long l;
    long m;
    Handler n;

    /* renamed from: ax.c5.a$a, reason: collision with other inner class name */
    final class RunnableC0269a extends AbstractC1844b<Void, Void, D> implements Runnable {
        private final CountDownLatch l0 = new CountDownLatch(1);
        boolean m0;

        RunnableC0269a() {
        }

        @Override // ax.c5.AbstractC1844b
        protected void l(D d) {
            try {
                AbstractC1843a.this.D(this, d);
            } finally {
                this.l0.countDown();
            }
        }

        @Override // ax.c5.AbstractC1844b
        protected void m(D d) {
            try {
                AbstractC1843a.this.E(this, d);
            } finally {
                this.l0.countDown();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.c5.AbstractC1844b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public D f(Void... voidArr) {
            try {
                return (D) AbstractC1843a.this.J();
            } catch (r e) {
                if (j()) {
                    return null;
                }
                throw e;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.m0 = false;
            AbstractC1843a.this.F();
        }
    }

    public AbstractC1843a(Context context, Executor executor) {
        super(context);
        this.m = -10000L;
        if (executor != null) {
            this.i = executor;
        } else {
            this.i = AbstractC1844b.i0;
        }
    }

    void D(AbstractC1843a<D>.RunnableC0269a runnableC0269a, D d) {
        I(d);
        if (this.k == runnableC0269a) {
            x();
            this.m = SystemClock.uptimeMillis();
            this.k = null;
            g();
            F();
        }
    }

    void E(AbstractC1843a<D>.RunnableC0269a runnableC0269a, D d) {
        if (this.j != runnableC0269a) {
            D(runnableC0269a, d);
            return;
        }
        if (l()) {
            I(d);
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
        if (this.j.m0) {
            this.j.m0 = false;
            this.n.removeCallbacks(this.j);
        }
        if (this.l <= 0 || SystemClock.uptimeMillis() >= this.m + this.l) {
            this.j.g(this.i, null);
        } else {
            this.j.m0 = true;
            this.n.postAtTime(this.j, this.m + this.l);
        }
    }

    public boolean G() {
        return this.k != null;
    }

    public abstract D H();

    protected D J() {
        return H();
    }

    @Override // ax.K0.c
    public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.i(str, fileDescriptor, printWriter, strArr);
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.j);
            printWriter.print(" waiting=");
            printWriter.println(this.j.m0);
        }
        if (this.k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.k);
            printWriter.print(" waiting=");
            printWriter.println(this.k.m0);
        }
        if (this.l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C1448i.c(this.l, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C1448i.b(this.m, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // ax.K0.c
    protected boolean p() {
        if (this.j == null) {
            return false;
        }
        if (this.k != null) {
            if (this.j.m0) {
                this.j.m0 = false;
                this.n.removeCallbacks(this.j);
            }
            this.j = null;
            return false;
        }
        if (this.j.m0) {
            this.j.m0 = false;
            this.n.removeCallbacks(this.j);
            this.j = null;
            return false;
        }
        boolean e = this.j.e(false);
        if (e) {
            this.k = this.j;
            C();
        }
        this.j = null;
        return e;
    }

    @Override // ax.K0.c
    protected void r() {
        super.r();
        d();
        this.j = new RunnableC0269a();
        F();
    }

    public void C() {
    }

    public void I(D d) {
    }
}
