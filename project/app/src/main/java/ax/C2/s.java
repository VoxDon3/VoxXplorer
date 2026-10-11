/*
 * Decompiled with CFR 0.152.
 */
package ax.C2;

import android.content.Context;
import ax.Gb.l;
import ax.l2.b;
import ax.o2.g;

public final class s
extends b {
    private final Context c;

    public s(Context context, int n8, int n9) {
        l.f(context, "mContext");
        super(n8, n9);
        this.c = context;
    }

    @Override
    public void a(g g8) {
        l.f(g8, "db");
        if (this.b >= 10) {
            g8.Z("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            return;
        }
        this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
    }
}

