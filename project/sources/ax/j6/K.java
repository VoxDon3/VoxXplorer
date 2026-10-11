package ax.j6;

import ax.M5.C0821p;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class K<TResult> extends AbstractC2327j<TResult> {
    private final Object a = new Object();
    private final H b = new H();
    private boolean c;
    private volatile boolean d;
    private Object e;
    private Exception f;

    K() {
    }

    private final void u() {
        C0821p.p(this.c, "Task is not yet complete");
    }

    private final void v() {
        if (this.d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void w() {
        if (this.c) {
            throw C2320c.a(this);
        }
    }

    private final void x() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ax.j6.AbstractC2327j
    public final AbstractC2327j<TResult> a(Executor executor, InterfaceC2321d interfaceC2321d) {
        this.b.a(new x(executor, interfaceC2321d));
        x();
        return this;
    }

    @Override // ax.j6.AbstractC2327j
    public final AbstractC2327j<TResult> b(InterfaceC2322e<TResult> interfaceC2322e) {
        this.b.a(new z(C2329l.a, interfaceC2322e));
        x();
        return this;
    }

    @Override // ax.j6.AbstractC2327j
    public final AbstractC2327j<TResult> c(Executor executor, InterfaceC2322e<TResult> interfaceC2322e) {
        this.b.a(new z(executor, interfaceC2322e));
        x();
        return this;
    }

    @Override // ax.j6.AbstractC2327j
    public final AbstractC2327j<TResult> d(Executor executor, InterfaceC2323f interfaceC2323f) {
        this.b.a(new B(executor, interfaceC2323f));
        x();
        return this;
    }

    @Override // ax.j6.AbstractC2327j
    public final AbstractC2327j<TResult> e(Executor executor, InterfaceC2324g<? super TResult> interfaceC2324g) {
        this.b.a(new D(executor, interfaceC2324g));
        x();
        return this;
    }

    @Override // ax.j6.AbstractC2327j
    public final <TContinuationResult> AbstractC2327j<TContinuationResult> f(InterfaceC2319b<TResult, TContinuationResult> interfaceC2319b) {
        return g(C2329l.a, interfaceC2319b);
    }

    @Override // ax.j6.AbstractC2327j
    public final <TContinuationResult> AbstractC2327j<TContinuationResult> g(Executor executor, InterfaceC2319b<TResult, TContinuationResult> interfaceC2319b) {
        K k = new K();
        this.b.a(new t(executor, interfaceC2319b, k));
        x();
        return k;
    }

    @Override // ax.j6.AbstractC2327j
    public final <TContinuationResult> AbstractC2327j<TContinuationResult> h(Executor executor, InterfaceC2319b<TResult, AbstractC2327j<TContinuationResult>> interfaceC2319b) {
        K k = new K();
        this.b.a(new v(executor, interfaceC2319b, k));
        x();
        return k;
    }

    @Override // ax.j6.AbstractC2327j
    public final Exception i() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // ax.j6.AbstractC2327j
    public final TResult j() {
        TResult tresult;
        synchronized (this.a) {
            try {
                u();
                v();
                Exception exc = this.f;
                if (exc != null) {
                    throw new C2325h(exc);
                }
                tresult = (TResult) this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }

    @Override // ax.j6.AbstractC2327j
    public final boolean k() {
        return this.d;
    }

    @Override // ax.j6.AbstractC2327j
    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // ax.j6.AbstractC2327j
    public final boolean m() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // ax.j6.AbstractC2327j
    public final <TContinuationResult> AbstractC2327j<TContinuationResult> n(InterfaceC2326i<TResult, TContinuationResult> interfaceC2326i) {
        Executor executor = C2329l.a;
        K k = new K();
        this.b.a(new F(executor, interfaceC2326i, k));
        x();
        return k;
    }

    @Override // ax.j6.AbstractC2327j
    public final <TContinuationResult> AbstractC2327j<TContinuationResult> o(Executor executor, InterfaceC2326i<TResult, TContinuationResult> interfaceC2326i) {
        K k = new K();
        this.b.a(new F(executor, interfaceC2326i, k));
        x();
        return k;
    }

    public final void p(Exception exc) {
        C0821p.m(exc, "Exception must not be null");
        synchronized (this.a) {
            w();
            this.c = true;
            this.f = exc;
        }
        this.b.b(this);
    }

    public final void q(Object obj) {
        synchronized (this.a) {
            w();
            this.c = true;
            this.e = obj;
        }
        this.b.b(this);
    }

    public final boolean r() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.d = true;
                this.b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean s(Exception exc) {
        C0821p.m(exc, "Exception must not be null");
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.f = exc;
                this.b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean t(Object obj) {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.e = obj;
                this.b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
