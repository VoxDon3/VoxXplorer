/*
 * Decompiled with CFR 0.152.
 */
package ax.L2;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import ax.K2.d;
import ax.o2.g;

public final class l {
    public static final /* synthetic */ int a(WorkDatabase workDatabase, String string) {
        return l.d(workDatabase, string);
    }

    public static final /* synthetic */ void b(WorkDatabase workDatabase, String string, int n8) {
        l.e(workDatabase, string, n8);
    }

    public static final void c(Context context, g g8) {
        ax.Gb.l.f(context, "context");
        ax.Gb.l.f(g8, "sqLiteDatabase");
        context = context.getSharedPreferences("androidx.work.util.id", 0);
        if (!context.contains("next_job_scheduler_id") && !context.contains("next_job_scheduler_id")) {
            return;
        }
        int n8 = context.getInt("next_job_scheduler_id", 0);
        int n9 = context.getInt("next_alarm_manager_id", 0);
        g8.r();
        try {
            g8.Z("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", n8});
            g8.Z("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", n9});
            context.edit().clear().apply();
            g8.Y();
            return;
        }
        finally {
            g8.j0();
        }
    }

    private static final int d(WorkDatabase workDatabase, String string) {
        Long l8 = workDatabase.E().a(string);
        int n8 = 0;
        int n9 = l8 != null ? (int)l8.longValue() : 0;
        if (n9 != Integer.MAX_VALUE) {
            n8 = n9 + 1;
        }
        l.e(workDatabase, string, n8);
        return n9;
    }

    private static final void e(WorkDatabase workDatabase, String string, int n8) {
        workDatabase.E().b(new d(string, Long.valueOf(n8)));
    }
}

