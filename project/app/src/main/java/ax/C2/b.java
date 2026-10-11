/*
 * Decompiled with CFR 0.152.
 */
package ax.C2;

import android.content.ContentValues;
import ax.Gb.l;
import ax.l2.a;
import ax.o2.g;

public final class b
implements a {
    @Override
    public void a(g g8) {
        l.f(g8, "db");
        g8.C("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        g8.b0("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}

