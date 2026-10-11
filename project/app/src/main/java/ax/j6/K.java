/*
 * Decompiled with CFR 0.152.
 */
package ax.j6;

import ax.M5.p;
import ax.j6.B;
import ax.j6.D;
import ax.j6.F;
import ax.j6.G;
import ax.j6.H;
import ax.j6.b;
import ax.j6.c;
import ax.j6.d;
import ax.j6.e;
import ax.j6.f;
import ax.j6.g;
import ax.j6.h;
import ax.j6.i;
import ax.j6.j;
import ax.j6.l;
import ax.j6.t;
import ax.j6.v;
import ax.j6.x;
import ax.j6.z;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

final class K<TResult>
extends j<TResult> {
    private final Object a = new Object();
    private final H b = new H();
    private boolean c;
    private volatile boolean d;
    private Object e;
    private Exception f;

    K() {
    }

    private final void u() {
        p.p(this.c, "Task is not yet complete");
    }

    private final void v() {
        if (!this.d) {
            return;
        }
        throw new CancellationException("Task is already canceled.");
    }

    private final void w() {
        if (!this.c) {
            return;
        }
        throw ax.j6.c.a(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void x() {
        Object object = this.a;
        synchronized (object) {
            try {
                if (!this.c) {
                    return;
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl7 : MonitorExitStatement: MONITOREXIT : var1_1
                this.b.b(this);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public final j<TResult> a(Executor object, d d8) {
        object = new x((Executor)object, d8);
        this.b.a((G)object);
        this.x();
        return this;
    }

    @Override
    public final j<TResult> b(e<TResult> object) {
        object = new z(l.a, (e)object);
        this.b.a((G)object);
        this.x();
        return this;
    }

    @Override
    public final j<TResult> c(Executor object, e<TResult> e8) {
        object = new z((Executor)object, e8);
        this.b.a((G)object);
        this.x();
        return this;
    }

    @Override
    public final j<TResult> d(Executor object, f f8) {
        object = new B((Executor)object, f8);
        this.b.a((G)object);
        this.x();
        return this;
    }

    @Override
    public final j<TResult> e(Executor object, g<? super TResult> g8) {
        object = new D((Executor)object, g8);
        this.b.a((G)object);
        this.x();
        return this;
    }

    @Override
    public final <TContinuationResult> j<TContinuationResult> f(b<TResult, TContinuationResult> b8) {
        return ((j)this).g(l.a, b8);
    }

    @Override
    public final <TContinuationResult> j<TContinuationResult> g(Executor object, b<TResult, TContinuationResult> b8) {
        K<TResult> k8 = new K<TResult>();
        object = new t((Executor)object, b8, k8);
        this.b.a((G)object);
        this.x();
        return k8;
    }

    @Override
    public final <TContinuationResult> j<TContinuationResult> h(Executor object, b<TResult, j<TContinuationResult>> b8) {
        K<TResult> k8 = new K<TResult>();
        object = new v((Executor)object, b8, k8);
        this.b.a((G)object);
        this.x();
        return k8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Exception i() {
        Object object = this.a;
        synchronized (object) {
            return this.f;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final TResult j() {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                Exception exception;
                try {
                    this.u();
                    this.v();
                    exception = this.f;
                    if (exception == null) {
                        Object object2 = this.e;
                        return (TResult)object2;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                h h8 = new h(exception);
                throw h8;
            }
            throw throwable2;
        }
    }

    @Override
    public final boolean k() {
        return this.d;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean l() {
        Object object = this.a;
        synchronized (object) {
            return this.c;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean m() {
        Object object = this.a;
        synchronized (object) {
            try {
                boolean bl;
                boolean bl2 = this.c;
                boolean bl3 = bl = false;
                if (!bl2) return bl3;
                bl3 = bl;
                if (this.d) return bl3;
                bl3 = bl;
                if (this.f != null) return bl3;
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public final <TContinuationResult> j<TContinuationResult> n(i<TResult, TContinuationResult> object) {
        Executor executor = l.a;
        K<TResult> k8 = new K<TResult>();
        object = new F(executor, (i)object, k8);
        this.b.a((G)object);
        this.x();
        return k8;
    }

    @Override
    public final <TContinuationResult> j<TContinuationResult> o(Executor object, i<TResult, TContinuationResult> i8) {
        K<TResult> k8 = new K<TResult>();
        object = new F((Executor)object, i8, k8);
        this.b.a((G)object);
        this.x();
        return k8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void p(Exception exception) {
        p.m(exception, "Exception must not be null");
        Object object = this.a;
        synchronized (object) {
            this.w();
            this.c = true;
            this.f = exception;
        }
        this.b.b(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void q(Object object) {
        Object object2 = this.a;
        synchronized (object2) {
            this.w();
            this.c = true;
            this.e = object;
        }
        this.b.b(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean r() {
        Object object = this.a;
        synchronized (object) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.d = true;
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl9 : MonitorExitStatement: MONITOREXIT : var2_1
                this.b.b(this);
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean s(Exception exception) {
        p.m(exception, "Exception must not be null");
        Object object = this.a;
        synchronized (object) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.f = exception;
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl11 : MonitorExitStatement: MONITOREXIT : var2_3
                this.b.b(this);
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean t(Object object) {
        Object object2 = this.a;
        synchronized (object2) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.e = object;
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl9 : MonitorExitStatement: MONITOREXIT : var2_3
                this.b.b(this);
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

