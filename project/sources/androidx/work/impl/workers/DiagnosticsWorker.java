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
import ax.K2.w;
import ax.O2.d;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        l.f(context, "context");
        l.f(workerParameters, "parameters");
    }

    @Override // androidx.work.Worker
    public c.a o() {
        String str;
        String str2;
        String d;
        String str3;
        String str4;
        String d2;
        String str5;
        String str6;
        String d3;
        D j = D.j(a());
        l.e(j, "getInstance(applicationContext)");
        WorkDatabase o = j.o();
        l.e(o, "workManager.workDatabase");
        w I = o.I();
        o G = o.G();
        A J = o.J();
        j F = o.F();
        List<v> d4 = I.d(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<v> i = I.i();
        List<v> t = I.t(200);
        if (!d4.isEmpty()) {
            i e = i.e();
            str5 = d.a;
            e.f(str5, "Recently completed work:\n\n");
            i e2 = i.e();
            str6 = d.a;
            d3 = d.d(G, J, F, d4);
            e2.f(str6, d3);
        }
        if (!i.isEmpty()) {
            i e3 = i.e();
            str3 = d.a;
            e3.f(str3, "Running work:\n\n");
            i e4 = i.e();
            str4 = d.a;
            d2 = d.d(G, J, F, i);
            e4.f(str4, d2);
        }
        if (!t.isEmpty()) {
            i e5 = i.e();
            str = d.a;
            e5.f(str, "Enqueued work:\n\n");
            i e6 = i.e();
            str2 = d.a;
            d = d.d(G, J, F, t);
            e6.f(str2, d);
        }
        c.a c = c.a.c();
        l.e(c, "success()");
        return c;
    }
}
