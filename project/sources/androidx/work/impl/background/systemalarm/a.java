package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import ax.B2.i;
import ax.K2.j;
import ax.K2.l;
import ax.K2.m;
import ax.L2.k;

/* loaded from: classes.dex */
class a {
    private static final String a = i.i("Alarms");

    /* renamed from: androidx.work.impl.background.systemalarm.a$a, reason: collision with other inner class name */
    static class C0048a {
        static void a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setExact(i, j, pendingIntent);
        }
    }

    public static void a(Context context, WorkDatabase workDatabase, m mVar) {
        j F = workDatabase.F();
        ax.K2.i c = F.c(mVar);
        if (c != null) {
            b(context, mVar, c.c);
            i.e().a(a, "Removing SystemIdInfo for workSpecId (" + mVar + ")");
            F.e(mVar);
        }
    }

    private static void b(Context context, m mVar, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, b.b(context, mVar), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        i.e().a(a, "Cancelling existing alarm with (workSpecId, systemId) (" + mVar + ", " + i + ")");
        alarmManager.cancel(service);
    }

    public static void c(Context context, WorkDatabase workDatabase, m mVar, long j) {
        j F = workDatabase.F();
        ax.K2.i c = F.c(mVar);
        if (c != null) {
            b(context, mVar, c.c);
            d(context, mVar, c.c, j);
        } else {
            int c2 = new k(workDatabase).c();
            F.b(l.a(mVar, c2));
            d(context, mVar, c2, j);
        }
    }

    private static void d(Context context, m mVar, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, b.b(context, mVar), Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            C0048a.a(alarmManager, 0, j, service);
        }
    }
}
