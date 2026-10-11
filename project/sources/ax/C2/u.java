package ax.C2;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class u {
    private static final String a = ax.B2.i.i("Schedulers");

    static t a(Context context, D d) {
        if (Build.VERSION.SDK_INT >= 23) {
            ax.F2.l lVar = new ax.F2.l(context, d);
            ax.L2.r.a(context, SystemJobService.class, true);
            ax.B2.i.e().a(a, "Created SystemJobScheduler and enabled SystemJobService");
            return lVar;
        }
        t c = c(context);
        if (c != null) {
            return c;
        }
        androidx.work.impl.background.systemalarm.f fVar = new androidx.work.impl.background.systemalarm.f(context);
        ax.L2.r.a(context, SystemAlarmService.class, true);
        ax.B2.i.e().a(a, "Created SystemAlarmScheduler");
        return fVar;
    }

    public static void b(androidx.work.a aVar, WorkDatabase workDatabase, List<t> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        ax.K2.w I = workDatabase.I();
        workDatabase.e();
        try {
            List<ax.K2.v> e = I.e(aVar.h());
            List<ax.K2.v> t = I.t(200);
            if (e != null && e.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                Iterator<ax.K2.v> it = e.iterator();
                while (it.hasNext()) {
                    I.b(it.next().a, currentTimeMillis);
                }
            }
            workDatabase.A();
            workDatabase.i();
            if (e != null && e.size() > 0) {
                ax.K2.v[] vVarArr = (ax.K2.v[]) e.toArray(new ax.K2.v[e.size()]);
                for (t tVar : list) {
                    if (tVar.c()) {
                        tVar.a(vVarArr);
                    }
                }
            }
            if (t == null || t.size() <= 0) {
                return;
            }
            ax.K2.v[] vVarArr2 = (ax.K2.v[]) t.toArray(new ax.K2.v[t.size()]);
            for (t tVar2 : list) {
                if (!tVar2.c()) {
                    tVar2.a(vVarArr2);
                }
            }
        } catch (Throwable th) {
            workDatabase.i();
            throw th;
        }
    }

    private static t c(Context context) {
        try {
            t tVar = (t) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
            ax.B2.i.e().a(a, "Created androidx.work.impl.background.gcm.GcmScheduler");
            return tVar;
        } catch (Throwable th) {
            ax.B2.i.e().b(a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
