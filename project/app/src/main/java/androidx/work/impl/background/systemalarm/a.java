/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.b;
import ax.B2.i;
import ax.K2.j;
import ax.K2.l;
import ax.K2.m;
import ax.L2.k;

class a {
    private static final String a = i.i("Alarms");

    public static void a(Context object, WorkDatabase object2, m m8) {
        Object object3 = (object2 = ((WorkDatabase)object2).F()).c(m8);
        if (object3 != null) {
            androidx.work.impl.background.systemalarm.a.b((Context)object, m8, ((ax.K2.i)object3).c);
            object = i.e();
            String string = a;
            object3 = new StringBuilder();
            ((StringBuilder)object3).append("Removing SystemIdInfo for workSpecId (");
            ((StringBuilder)object3).append(m8);
            ((StringBuilder)object3).append(")");
            ((i)object).a(string, ((StringBuilder)object3).toString());
            object2.e(m8);
        }
    }

    private static void b(Context object, m m8, int n8) {
        int n9;
        AlarmManager alarmManager = (AlarmManager)object.getSystemService("alarm");
        Object object2 = b.b((Context)object, m8);
        PendingIntent pendingIntent = PendingIntent.getService((Context)object, (int)n8, (Intent)object2, (int)(n9 = Build.VERSION.SDK_INT >= 23 ? 0x24000000 : 0x20000000));
        if (pendingIntent != null && alarmManager != null) {
            object2 = i.e();
            String string = a;
            object = new StringBuilder();
            ((StringBuilder)object).append("Cancelling existing alarm with (workSpecId, systemId) (");
            ((StringBuilder)object).append(m8);
            ((StringBuilder)object).append(", ");
            ((StringBuilder)object).append(n8);
            ((StringBuilder)object).append(")");
            ((i)object2).a(string, ((StringBuilder)object).toString());
            alarmManager.cancel(pendingIntent);
        }
    }

    public static void c(Context context, WorkDatabase workDatabase, m m8, long l8) {
        j j8 = workDatabase.F();
        ax.K2.i i8 = j8.c(m8);
        if (i8 != null) {
            androidx.work.impl.background.systemalarm.a.b(context, m8, i8.c);
            androidx.work.impl.background.systemalarm.a.d(context, m8, i8.c, l8);
            return;
        }
        int n8 = new k(workDatabase).c();
        j8.b(l.a(m8, n8));
        androidx.work.impl.background.systemalarm.a.d(context, m8, n8, l8);
    }

    private static void d(Context context, m m8, int n8, long l8) {
        AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        int n9 = Build.VERSION.SDK_INT >= 23 ? 0xC000000 : 0x8000000;
        context = PendingIntent.getService((Context)context, (int)n8, (Intent)b.b(context, m8), (int)n9);
        if (alarmManager != null) {
            androidx.work.impl.background.systemalarm.a$a.a(alarmManager, 0, l8, (PendingIntent)context);
        }
    }

    static class a {
        static void a(AlarmManager alarmManager, int n8, long l8, PendingIntent pendingIntent) {
            alarmManager.setExact(n8, l8, pendingIntent);
        }
    }
}

