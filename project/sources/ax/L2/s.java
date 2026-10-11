package ax.L2;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public class s {
    private final WorkDatabase a;

    public s(WorkDatabase workDatabase) {
        this.a = workDatabase;
    }

    public static void c(Context context, ax.o2.g gVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            gVar.r();
            try {
                gVar.Z("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                gVar.Z("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                gVar.Y();
            } finally {
                gVar.j0();
            }
        }
    }

    public long a() {
        Long a = this.a.E().a("last_force_stop_ms");
        if (a != null) {
            return a.longValue();
        }
        return 0L;
    }

    public boolean b() {
        Long a = this.a.E().a("reschedule_needed");
        return a != null && a.longValue() == 1;
    }

    public void d(long j) {
        this.a.E().b(new ax.K2.d("last_force_stop_ms", Long.valueOf(j)));
    }

    public void e(boolean z) {
        this.a.E().b(new ax.K2.d("reschedule_needed", z));
    }
}
