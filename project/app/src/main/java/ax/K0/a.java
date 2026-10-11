/*
 * Decompiled with CFR 0.152.
 */
package ax.K0;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import ax.K0.c;
import ax.K0.d;
import ax.Y.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public abstract class a<D>
extends c<D> {
    private Executor i;
    private volatile a j;
    private volatile a k;
    private long l;
    private long m = -10000L;
    private Handler n;

    public a(Context context) {
        super(context);
    }

    public void C() {
    }

    void D(a a8, D d8) {
        this.J(d8);
        if (this.k == a8) {
            this.x();
            this.m = SystemClock.uptimeMillis();
            this.k = null;
            this.g();
            this.F();
        }
    }

    void E(a a8, D d8) {
        if (this.j != a8) {
            this.D(a8, d8);
            return;
        }
        if (this.l()) {
            this.J(d8);
            return;
        }
        this.e();
        this.m = SystemClock.uptimeMillis();
        this.j = null;
        this.h(d8);
    }

    void F() {
        if (this.k == null && this.j != null) {
            if (this.j.g0) {
                this.j.g0 = false;
                this.n.removeCallbacks((Runnable)this.j);
            }
            if (this.l > 0L && SystemClock.uptimeMillis() < this.m + this.l) {
                this.j.g0 = true;
                this.n.postAtTime((Runnable)this.j, this.m + this.l);
                return;
            }
            if (this.i == null) {
                this.i = this.G();
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

    public void J(D d8) {
    }

    protected D K() {
        return this.I();
    }

    @Override
    @Deprecated
    public void i(String charSequence, FileDescriptor object, PrintWriter printWriter, String[] stringArray) {
        super.i((String)charSequence, (FileDescriptor)object, printWriter, stringArray);
        if (this.j != null) {
            printWriter.print((String)charSequence);
            printWriter.print("mTask=");
            printWriter.print(this.j);
            printWriter.print(" waiting=");
            printWriter.println(this.j.g0);
        }
        if (this.k != null) {
            printWriter.print((String)charSequence);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.k);
            printWriter.print(" waiting=");
            printWriter.println(this.k.g0);
        }
        if (this.l != 0L) {
            printWriter.print((String)charSequence);
            printWriter.print("mUpdateThrottle=");
            object = TimeUnit.MILLISECONDS;
            printWriter.print(DateUtils.formatElapsedTime((long)((TimeUnit)((Object)object)).toSeconds(this.l)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.m == -10000L) {
                charSequence = "--";
            } else {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("-");
                ((StringBuilder)charSequence).append(DateUtils.formatElapsedTime((long)((TimeUnit)((Object)object)).toSeconds(SystemClock.uptimeMillis() - this.m)));
                charSequence = ((StringBuilder)charSequence).toString();
            }
            printWriter.print((String)charSequence);
            printWriter.println();
        }
    }

    @Override
    protected boolean p() {
        if (this.j != null) {
            if (!this.n()) {
                this.q();
            }
            if (this.k != null) {
                if (this.j.g0) {
                    this.j.g0 = false;
                    this.n.removeCallbacks((Runnable)this.j);
                }
                this.j = null;
                return false;
            }
            if (this.j.g0) {
                this.j.g0 = false;
                this.n.removeCallbacks((Runnable)this.j);
                this.j = null;
                return false;
            }
            boolean bl = this.j.a(false);
            if (bl) {
                this.k = this.j;
                this.C();
            }
            this.j = null;
            return bl;
        }
        return false;
    }

    @Override
    protected void r() {
        super.r();
        this.d();
        this.j = new a(this);
        this.F();
    }

    final class a
    extends d<D>
    implements Runnable {
        boolean g0;
        final a h0;

        a(a a8) {
            this.h0 = a8;
        }

        @Override
        protected D b() {
            Object d8;
            try {
                d8 = this.h0.K();
            }
            catch (r r8) {
                if (this.f()) {
                    return null;
                }
                throw r8;
            }
            return d8;
        }

        @Override
        protected void g(D d8) {
            this.h0.D(this, d8);
        }

        @Override
        protected void h(D d8) {
            this.h0.E(this, d8);
        }

        @Override
        public void run() {
            this.g0 = false;
            this.h0.F();
        }
    }
}

