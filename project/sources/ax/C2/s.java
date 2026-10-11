package ax.C2;

import android.content.Context;
import ax.l2.AbstractC2464b;

/* loaded from: classes.dex */
public final class s extends AbstractC2464b {
    private final Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, int i, int i2) {
        super(i, i2);
        ax.Gb.l.f(context, "mContext");
        this.c = context;
    }

    @Override // ax.l2.AbstractC2464b
    public void a(ax.o2.g gVar) {
        ax.Gb.l.f(gVar, "db");
        if (this.b >= 10) {
            gVar.Z("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
        } else {
            this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
