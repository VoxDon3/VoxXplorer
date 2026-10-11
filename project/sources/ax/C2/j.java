package ax.C2;

import android.os.Build;
import ax.l2.AbstractC2464b;

/* loaded from: classes.dex */
public final class j extends AbstractC2464b {
    public static final j c = new j();

    private j() {
        super(3, 4);
    }

    @Override // ax.l2.AbstractC2464b
    public void a(ax.o2.g gVar) {
        ax.Gb.l.f(gVar, "db");
        if (Build.VERSION.SDK_INT >= 23) {
            gVar.C("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
        }
    }
}
