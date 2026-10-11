/*
 * Decompiled with CFR 0.152.
 */
package ax.C2;

import android.os.Build;
import ax.Gb.l;
import ax.l2.b;
import ax.o2.g;

public final class j
extends b {
    public static final j c = new j();

    private j() {
        super(3, 4);
    }

    @Override
    public void a(g g8) {
        l.f(g8, "db");
        if (Build.VERSION.SDK_INT >= 23) {
            g8.C("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
        }
    }
}

