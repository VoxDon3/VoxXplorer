package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import ax.B2.i;
import ax.C2.D;
import ax.G2.e;
import ax.Gb.l;
import ax.I2.o;
import ax.K2.v;
import ax.K2.w;
import ax.sb.t;
import ax.tb.C3139o;
import java.util.List;

/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends c implements ax.G2.c {
    private final WorkerParameters e;
    private final Object f;
    private volatile boolean g;
    private final ax.M2.c<c.a> h;
    private c i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        l.f(context, "appContext");
        l.f(workerParameters, "workerParameters");
        this.e = workerParameters;
        this.f = new Object();
        this.h = ax.M2.c.t();
    }

    private final void q() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (this.h.isCancelled()) {
            return;
        }
        String i = g().i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        i e = i.e();
        l.e(e, "get()");
        if (i == null || i.length() == 0) {
            str = ax.O2.c.a;
            e.c(str, "No worker to delegate to.");
            ax.M2.c<c.a> cVar = this.h;
            l.e(cVar, "future");
            ax.O2.c.d(cVar);
            return;
        }
        c b = h().b(a(), i, this.e);
        this.i = b;
        if (b == null) {
            str6 = ax.O2.c.a;
            e.a(str6, "No worker to delegate to.");
            ax.M2.c<c.a> cVar2 = this.h;
            l.e(cVar2, "future");
            ax.O2.c.d(cVar2);
            return;
        }
        D j = D.j(a());
        l.e(j, "getInstance(applicationContext)");
        w I = j.o().I();
        String uuid = e().toString();
        l.e(uuid, "id.toString()");
        v n = I.n(uuid);
        if (n == null) {
            ax.M2.c<c.a> cVar3 = this.h;
            l.e(cVar3, "future");
            ax.O2.c.d(cVar3);
            return;
        }
        o n2 = j.n();
        l.e(n2, "workManagerImpl.trackers");
        e eVar = new e(n2, this);
        eVar.b(C3139o.d(n));
        String uuid2 = e().toString();
        l.e(uuid2, "id.toString()");
        if (!eVar.e(uuid2)) {
            str2 = ax.O2.c.a;
            e.a(str2, "Constraints not met for delegate " + i + ". Requesting retry.");
            ax.M2.c<c.a> cVar4 = this.h;
            l.e(cVar4, "future");
            ax.O2.c.e(cVar4);
            return;
        }
        str3 = ax.O2.c.a;
        e.a(str3, "Constraints met for delegate " + i);
        try {
            c cVar5 = this.i;
            l.c(cVar5);
            final ax.v7.e<c.a> m = cVar5.m();
            l.e(m, "delegate!!.startWork()");
            m.h(new Runnable() { // from class: ax.O2.b
                @Override // java.lang.Runnable
                public final void run() {
                    ConstraintTrackingWorker.r(ConstraintTrackingWorker.this, m);
                }
            }, c());
        } catch (Throwable th) {
            str4 = ax.O2.c.a;
            e.b(str4, "Delegated worker " + i + " threw exception in startWork.", th);
            synchronized (this.f) {
                try {
                    if (!this.g) {
                        ax.M2.c<c.a> cVar6 = this.h;
                        l.e(cVar6, "future");
                        ax.O2.c.d(cVar6);
                    } else {
                        str5 = ax.O2.c.a;
                        e.a(str5, "Constraints were unmet, Retrying.");
                        ax.M2.c<c.a> cVar7 = this.h;
                        l.e(cVar7, "future");
                        ax.O2.c.e(cVar7);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(ConstraintTrackingWorker constraintTrackingWorker, ax.v7.e eVar) {
        l.f(constraintTrackingWorker, "this$0");
        l.f(eVar, "$innerFuture");
        synchronized (constraintTrackingWorker.f) {
            try {
                if (constraintTrackingWorker.g) {
                    ax.M2.c<c.a> cVar = constraintTrackingWorker.h;
                    l.e(cVar, "future");
                    ax.O2.c.e(cVar);
                } else {
                    constraintTrackingWorker.h.r(eVar);
                }
                t tVar = t.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(ConstraintTrackingWorker constraintTrackingWorker) {
        l.f(constraintTrackingWorker, "this$0");
        constraintTrackingWorker.q();
    }

    @Override // ax.G2.c
    public void b(List<v> list) {
        String str;
        l.f(list, "workSpecs");
        i e = i.e();
        str = ax.O2.c.a;
        e.a(str, "Constraints changed for " + list);
        synchronized (this.f) {
            this.g = true;
            t tVar = t.a;
        }
    }

    @Override // ax.G2.c
    public void f(List<v> list) {
        l.f(list, "workSpecs");
    }

    @Override // androidx.work.c
    public void k() {
        super.k();
        c cVar = this.i;
        if (cVar == null || cVar.i()) {
            return;
        }
        cVar.n();
    }

    @Override // androidx.work.c
    public ax.v7.e<c.a> m() {
        c().execute(new Runnable() { // from class: ax.O2.a
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintTrackingWorker.s(ConstraintTrackingWorker.this);
            }
        });
        ax.M2.c<c.a> cVar = this.h;
        l.e(cVar, "future");
        return cVar;
    }
}
