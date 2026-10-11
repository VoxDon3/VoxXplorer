/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import ax.B2.i;
import ax.C2.D;
import ax.Gb.l;
import ax.K2.A;
import ax.K2.j;
import ax.K2.o;
import ax.K2.v;
import ax.O2.d;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class DiagnosticsWorker
extends Worker {
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        l.f(context, "context");
        l.f(workerParameters, "parameters");
        super(context, workerParameters);
    }

    @Override
    public c.a o() {
        Object object = D.j(this.a());
        l.e(object, "getInstance(applicationContext)");
        Object object2 = ((D)object).o();
        l.e(object2, "workManager.workDatabase");
        Object object3 = ((WorkDatabase)object2).I();
        o o8 = ((WorkDatabase)object2).G();
        object = ((WorkDatabase)object2).J();
        object2 = ((WorkDatabase)object2).F();
        List<v> list = object3.d(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<v> list2 = object3.i();
        object3 = object3.t(200);
        if (!((Collection)list).isEmpty()) {
            i.e().f(d.a(), "Recently completed work:\n\n");
            i.e().f(d.a(), d.b(o8, (A)object, (j)object2, list));
        }
        if (!((Collection)list2).isEmpty()) {
            i.e().f(d.a(), "Running work:\n\n");
            i.e().f(d.a(), d.b(o8, (A)object, (j)object2, list2));
        }
        if (!((Collection)object3).isEmpty()) {
            i.e().f(d.a(), "Enqueued work:\n\n");
            i.e().f(d.a(), d.b(o8, (A)object, (j)object2, (List)object3));
        }
        object = c.a.c();
        l.e(object, "success()");
        return object;
    }
}

