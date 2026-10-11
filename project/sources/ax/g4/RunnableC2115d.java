package ax.g4;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ax.g4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC2115d<R> implements InterfaceFutureC2112a<R>, Runnable {
    private static final a l0 = new a();
    private final int c0;
    private final int d0;
    private final boolean e0;
    private final a f0;
    private R g0;
    private InterfaceC2113b h0;
    private boolean i0;
    private boolean j0;
    private boolean k0;
    private final Handler q;

    /* renamed from: ax.g4.d$a */
    static class a {
        a() {
        }

        public void a(Object obj) {
            obj.notifyAll();
        }

        public void b(Object obj, long j) throws InterruptedException {
            obj.wait(j);
        }
    }

    public RunnableC2115d(Handler handler, int i, int i2) {
        this(handler, i, i2, true, l0);
    }

    private void m() {
        this.q.post(this);
    }

    private synchronized R n(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        try {
            if (this.e0 && !isDone()) {
                ax.k4.i.a();
            }
            if (this.i0) {
                throw new CancellationException();
            }
            if (this.k0) {
                throw new ExecutionException(new IllegalStateException("Load failed"));
            }
            if (this.j0) {
                return this.g0;
            }
            if (l == null) {
                this.f0.b(this, 0L);
            } else if (l.longValue() > 0) {
                this.f0.b(this, l.longValue());
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.k0) {
                throw new ExecutionException(new IllegalStateException("Load failed"));
            }
            if (this.i0) {
                throw new CancellationException();
            }
            if (!this.j0) {
                throw new TimeoutException();
            }
            return this.g0;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // ax.h4.e
    public synchronized void c(R r, ax.i4.b<? super R> bVar) {
        this.j0 = true;
        this.g0 = r;
        this.f0.a(this);
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean cancel(boolean z) {
        if (isDone()) {
            return false;
        }
        this.i0 = true;
        this.f0.a(this);
        if (z) {
            m();
        }
        return true;
    }

    @Override // ax.h4.e
    public void e(InterfaceC2113b interfaceC2113b) {
        this.h0 = interfaceC2113b;
    }

    @Override // ax.h4.e
    public void g(ax.h4.d dVar) {
        dVar.e(this.c0, this.d0);
    }

    @Override // java.util.concurrent.Future
    public R get() throws InterruptedException, ExecutionException {
        try {
            return n(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // ax.h4.e
    public synchronized void i(Drawable drawable) {
        this.k0 = true;
        this.f0.a(this);
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.i0;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z;
        if (!this.i0) {
            z = this.j0;
        }
        return z;
    }

    @Override // ax.h4.e
    public InterfaceC2113b k() {
        return this.h0;
    }

    @Override // java.lang.Runnable
    public void run() {
        InterfaceC2113b interfaceC2113b = this.h0;
        if (interfaceC2113b != null) {
            interfaceC2113b.clear();
            this.h0 = null;
        }
    }

    RunnableC2115d(Handler handler, int i, int i2, boolean z, a aVar) {
        this.q = handler;
        this.c0 = i;
        this.d0 = i2;
        this.e0 = z;
        this.f0 = aVar;
    }

    @Override // java.util.concurrent.Future
    public R get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return n(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // ax.d4.i
    public void a() {
    }

    @Override // ax.d4.i
    public void b() {
    }

    @Override // ax.d4.i
    public void f() {
    }

    @Override // ax.h4.e
    public void d(ax.h4.d dVar) {
    }

    @Override // ax.h4.e
    public void j(Drawable drawable) {
    }

    @Override // ax.h4.e
    public void l(Drawable drawable) {
    }
}
