/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import ax.B2.i;
import ax.C2.D;
import ax.G2.e;
import ax.Gb.l;
import ax.K2.v;
import ax.O2.a;
import ax.O2.b;
import ax.sb.t;
import ax.tb.o;
import java.util.List;

public final class ConstraintTrackingWorker
extends c
implements ax.G2.c {
    private final WorkerParameters e;
    private final Object f;
    private volatile boolean g;
    private final ax.M2.c<c.a> h;
    private c i;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        l.f(context, "appContext");
        l.f(workerParameters, "workerParameters");
        super(context, workerParameters);
        this.e = workerParameters;
        this.f = new Object();
        this.h = ax.M2.c.t();
    }

    public static /* synthetic */ void o(ConstraintTrackingWorker constraintTrackingWorker) {
        ConstraintTrackingWorker.s(constraintTrackingWorker);
    }

    public static /* synthetic */ void p(ConstraintTrackingWorker constraintTrackingWorker, ax.v7.e e8) {
        ConstraintTrackingWorker.r(constraintTrackingWorker, e8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private final void q() {
        if (this.h.isCancelled()) {
            return;
        }
        Object object = this.g().i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        ax.M2.c<c.a> c8 = ax.B2.i.e();
        l.e(c8, "get()");
        if (object != null && object.length() != 0) {
            ax.v7.e<c.a> e8 = this.h().b(this.a(), (String)object, this.e);
            this.i = e8;
            if (e8 == null) {
                ((i)((Object)c8)).a(ax.O2.c.a(), "No worker to delegate to.");
                c8 = this.h;
                l.e(c8, "future");
                ax.O2.c.b(c8);
                return;
            }
            Object object2 = D.j(this.a());
            l.e(object2, "getInstance(applicationContext)");
            Object object3 = ((D)object2).o().I();
            e8 = this.e().toString();
            l.e(e8, "id.toString()");
            e8 = object3.n((String)((Object)e8));
            if (e8 == null) {
                c8 = this.h;
                l.e(c8, "future");
                ax.O2.c.b(c8);
                return;
            }
            object2 = ((D)object2).n();
            l.e(object2, "workManagerImpl.trackers");
            object2 = new e((ax.I2.o)object2, this);
            ((e)object2).b((Iterable<v>)o.d(e8));
            e8 = this.e().toString();
            l.e(e8, "id.toString()");
            if (!((e)object2).e((String)((Object)e8))) {
                object2 = ax.O2.c.a();
                e8 = new StringBuilder();
                ((StringBuilder)((Object)e8)).append("Constraints not met for delegate ");
                ((StringBuilder)((Object)e8)).append((String)object);
                ((StringBuilder)((Object)e8)).append(". Requesting retry.");
                ((i)((Object)c8)).a((String)object2, ((StringBuilder)((Object)e8)).toString());
                c8 = this.h;
                l.e(c8, "future");
                ax.O2.c.c(c8);
                return;
            }
            object2 = ax.O2.c.a();
            e8 = new StringBuilder();
            ((StringBuilder)((Object)e8)).append("Constraints met for delegate ");
            ((StringBuilder)((Object)e8)).append((String)object);
            ((i)((Object)c8)).a((String)object2, ((StringBuilder)((Object)e8)).toString());
            try {
                e8 = this.i;
                l.c(e8);
                e8 = ((c)((Object)e8)).m();
                l.e(e8, "delegate!!.startWork()");
                object2 = new b(this, e8);
                e8.h((Runnable)object2, this.c());
                return;
            }
            catch (Throwable throwable) {
                object2 = ax.O2.c.a();
                object3 = new StringBuilder();
                ((StringBuilder)object3).append("Delegated worker ");
                ((StringBuilder)object3).append((String)object);
                ((StringBuilder)object3).append(" threw exception in startWork.");
                ((i)((Object)c8)).b((String)object2, ((StringBuilder)object3).toString(), throwable);
                object = this.f;
                // MONITORENTER : object
                if (this.g) {
                    ((i)((Object)c8)).a(ax.O2.c.a(), "Constraints were unmet, Retrying.");
                    c8 = this.h;
                    l.e(c8, "future");
                    ax.O2.c.c(c8);
                    return;
                }
                c8 = this.h;
                l.e(c8, "future");
                ax.O2.c.b(c8);
                // MONITOREXIT : object
                return;
            }
        }
        ((i)((Object)c8)).c(ax.O2.c.a(), "No worker to delegate to.");
        c8 = this.h;
        l.e(c8, "future");
        ax.O2.c.b(c8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final void r(ConstraintTrackingWorker object, ax.v7.e e8) {
        l.f(object, "this$0");
        l.f(e8, "$innerFuture");
        Object object2 = ((ConstraintTrackingWorker)object).f;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                block4: {
                    block3: {
                        try {
                            if (!((ConstraintTrackingWorker)object).g) break block3;
                            object = ((ConstraintTrackingWorker)object).h;
                            l.e(object, "future");
                            ax.O2.c.c((ax.M2.c)object);
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    ((ConstraintTrackingWorker)object).h.r(e8);
                }
                object = t.a;
                return;
            }
            throw throwable2;
        }
    }

    private static final void s(ConstraintTrackingWorker constraintTrackingWorker) {
        l.f(constraintTrackingWorker, "this$0");
        constraintTrackingWorker.q();
    }

    @Override
    public void b(List<v> object) {
        l.f(object, "workSpecs");
        i i8 = ax.B2.i.e();
        String string = ax.O2.c.a();
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append("Constraints changed for ");
        ((StringBuilder)object2).append(object);
        i8.a(string, ((StringBuilder)object2).toString());
        object = this.f;
        synchronized (object) {
            this.g = true;
            object2 = t.a;
            return;
        }
    }

    @Override
    public void f(List<v> list) {
        l.f(list, "workSpecs");
    }

    @Override
    public void k() {
        super.k();
        c c8 = this.i;
        if (c8 != null && !c8.i()) {
            c8.n();
        }
    }

    @Override
    public ax.v7.e<c.a> m() {
        this.c().execute(new a(this));
        ax.M2.c<c.a> c8 = this.h;
        l.e(c8, "future");
        return c8;
    }
}

