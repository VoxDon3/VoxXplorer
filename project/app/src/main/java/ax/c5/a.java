/*
 * Decompiled with CFR 0.152.
 */
package ax.c5;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import ax.K0.c;
import ax.Y.r;
import ax.b0.i;
import ax.c5.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

public abstract class a<D>
extends c<D> {
    private final Executor i;
    volatile a j;
    volatile a k;
    long l;
    long m = -10000L;
    Handler n;

    public a(Context context, Executor executor) {
        super(context);
        if (executor != null) {
            this.i = executor;
            return;
        }
        this.i = b.i0;
    }

    public void C() {
    }

    void D(a a8, D d8) {
        this.I(d8);
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
            this.I(d8);
            return;
        }
        this.e();
        this.m = SystemClock.uptimeMillis();
        this.j = null;
        this.h(d8);
    }

    void F() {
        if (this.k == null && this.j != null) {
            if (this.j.m0) {
                this.j.m0 = false;
                this.n.removeCallbacks((Runnable)this.j);
            }
            if (this.l > 0L && SystemClock.uptimeMillis() < this.m + this.l) {
                this.j.m0 = true;
                this.n.postAtTime((Runnable)this.j, this.m + this.l);
                return;
            }
            this.j.g(this.i, null);
        }
    }

    public boolean G() {
        return this.k != null;
    }

    public abstract D H();

    public void I(D d8) {
    }

    protected D J() {
        return this.H();
    }

    @Override
    public void i(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
        super.i(string, fileDescriptor, printWriter, stringArray);
        if (this.j != null) {
            printWriter.print(string);
            printWriter.print("mTask=");
            printWriter.print(this.j);
            printWriter.print(" waiting=");
            printWriter.println(this.j.m0);
        }
        if (this.k != null) {
            printWriter.print(string);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.k);
            printWriter.print(" waiting=");
            printWriter.println(this.k.m0);
        }
        if (this.l != 0L) {
            printWriter.print(string);
            printWriter.print("mUpdateThrottle=");
            ax.b0.i.c(this.l, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            ax.b0.i.b(this.m, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override
    protected boolean p() {
        if (this.j != null) {
            if (this.k != null) {
                if (this.j.m0) {
                    this.j.m0 = false;
                    this.n.removeCallbacks((Runnable)this.j);
                }
                this.j = null;
                return false;
            }
            if (this.j.m0) {
                this.j.m0 = false;
                this.n.removeCallbacks((Runnable)this.j);
                this.j = null;
                return false;
            }
            boolean bl = this.j.e(false);
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
    extends b<Void, Void, D>
    implements Runnable {
        private final CountDownLatch l0;
        boolean m0;
        final a n0;

        a(a a8) {
            this.n0 = a8;
            this.l0 = new CountDownLatch(1);
        }

        @Override
        protected void l(D d8) {
            try {
                this.n0.D(this, d8);
                return;
            }
            finally {
                this.l0.countDown();
            }
        }

        @Override
        protected void m(D d8) {
            try {
                this.n0.E(this, d8);
                return;
            }
            finally {
                this.l0.countDown();
            }
        }

        protected D r(Void ... object) {
            try {
                object = this.n0.J();
            }
            catch (r r8) {
                if (this.j()) {
                    return null;
                }
                throw r8;
            }
            return object;
        }

        @Override
        public void run() {
            this.m0 = false;
            this.n0.F();
        }
    }
}

