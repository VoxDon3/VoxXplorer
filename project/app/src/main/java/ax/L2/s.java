/*
 * Decompiled with CFR 0.152.
 */
package ax.L2;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import ax.K2.d;
import ax.o2.g;

public class s {
    private final WorkDatabase a;

    public s(WorkDatabase workDatabase) {
        this.a = workDatabase;
    }

    public static void c(Context context, g g8) {
        if (!(context = context.getSharedPreferences("androidx.work.util.preferences", 0)).contains("reschedule_needed") && !context.contains("last_cancel_all_time_ms")) {
            return;
        }
        long l8 = 0L;
        long l9 = context.getLong("last_cancel_all_time_ms", 0L);
        if (context.getBoolean("reschedule_needed", false)) {
            l8 = 1L;
        }
        g8.r();
        try {
            g8.Z("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", l9});
            g8.Z("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", l8});
            context.edit().clear().apply();
            g8.Y();
            return;
        }
        finally {
            g8.j0();
        }
    }

    public long a() {
        Long l8 = this.a.E().a("last_force_stop_ms");
        if (l8 != null) {
            return l8;
        }
        return 0L;
    }

    public boolean b() {
        Long l8 = this.a.E().a("reschedule_needed");
        return l8 != null && l8 == 1L;
    }

    public void d(long l8) {
        d d8 = new d("last_force_stop_ms", l8);
        this.a.E().b(d8);
    }

    public void e(boolean bl) {
        d d8 = new d("reschedule_needed", bl);
        this.a.E().b(d8);
    }
}

