/*
 * Decompiled with CFR 0.152.
 */
package ax.g4;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import ax.g4.b;
import ax.k4.i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class d<R>
implements ax.g4.a<R>,
Runnable {
    private static final a l0 = new a();
    private final int c0;
    private final int d0;
    private final boolean e0;
    private final a f0;
    private R g0;
    private b h0;
    private boolean i0;
    private boolean j0;
    private boolean k0;
    private final Handler q;

    public d(Handler handler, int n8, int n9) {
        this(handler, n8, n9, true, l0);
    }

    d(Handler handler, int n8, int n9, boolean bl, a a8) {
        this.q = handler;
        this.c0 = n8;
        this.d0 = n9;
        this.e0 = bl;
        this.f0 = a8;
    }

    private void m() {
        this.q.post((Runnable)this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private R n(Long serializable) throws ExecutionException, InterruptedException, TimeoutException {
        synchronized (this) {
            Throwable throwable2;
            block14: {
                block13: {
                    try {
                        if (!this.e0 || this.isDone()) break block13;
                        i.a();
                    }
                    catch (Throwable throwable2) {
                        break block14;
                    }
                }
                if (this.i0) {
                    serializable = new CancellationException();
                    throw serializable;
                }
                if (this.k0) {
                    serializable = new IllegalStateException("Load failed");
                    ExecutionException executionException = new ExecutionException((Throwable)serializable);
                    throw executionException;
                }
                if (this.j0) {
                    serializable = this.g0;
                    return (R)serializable;
                }
                if (serializable == null) {
                    this.f0.b(this, 0L);
                } else if (serializable > 0L) {
                    this.f0.b(this, (long)serializable);
                }
                if (Thread.interrupted()) {
                    serializable = new InterruptedException();
                    throw serializable;
                }
                if (this.k0) {
                    serializable = new IllegalStateException("Load failed");
                    ExecutionException executionException = new ExecutionException((Throwable)serializable);
                    throw executionException;
                }
                if (this.i0) {
                    serializable = new CancellationException();
                    throw serializable;
                }
                if (this.j0) {
                    serializable = this.g0;
                    return (R)serializable;
                }
                serializable = new TimeoutException();
                throw serializable;
            }
            throw throwable2;
        }
    }

    @Override
    public void a() {
    }

    @Override
    public void b() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void c(R r8, ax.i4.b<? super R> b8) {
        synchronized (this) {
            this.j0 = true;
            this.g0 = r8;
            this.f0.a(this);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean cancel(boolean bl) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        boolean bl2 = this.isDone();
                        if (!bl2) break block5;
                    }
                    catch (Throwable throwable2) {}
                    return false;
                }
                this.i0 = true;
                this.f0.a(this);
                if (!bl) break block6;
                this.m();
            }
            return true;
            throw throwable2;
        }
    }

    @Override
    public void d(ax.h4.d d8) {
    }

    @Override
    public void e(b b8) {
        this.h0 = b8;
    }

    @Override
    public void f() {
    }

    @Override
    public void g(ax.h4.d d8) {
        d8.e(this.c0, this.d0);
    }

    @Override
    public R get() throws InterruptedException, ExecutionException {
        R r8;
        try {
            r8 = this.n(null);
        }
        catch (TimeoutException timeoutException) {
            throw new AssertionError((Object)timeoutException);
        }
        return r8;
    }

    @Override
    public R get(long l8, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.n(timeUnit.toMillis(l8));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void i(Drawable drawable) {
        synchronized (this) {
            this.k0 = true;
            this.f0.a(this);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean isCancelled() {
        synchronized (this) {
            return this.i0;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean isDone() {
        synchronized (this) {
            try {
                if (this.i0) return true;
                boolean bl = this.j0;
                if (!bl) return false;
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public void j(Drawable drawable) {
    }

    @Override
    public b k() {
        return this.h0;
    }

    @Override
    public void l(Drawable drawable) {
    }

    @Override
    public void run() {
        b b8 = this.h0;
        if (b8 != null) {
            b8.clear();
            this.h0 = null;
        }
    }

    static class a {
        a() {
        }

        public void a(Object object) {
            object.notifyAll();
        }

        public void b(Object object, long l8) throws InterruptedException {
            object.wait(l8);
        }
    }
}

