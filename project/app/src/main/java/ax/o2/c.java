/*
 * Decompiled with CFR 0.152.
 */
package ax.o2;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;
import ax.Gb.l;

public final class c {
    public static final c a = new c();

    private c() {
    }

    public static final Uri a(Cursor cursor) {
        l.f(cursor, "cursor");
        cursor = cursor.getNotificationUri();
        l.e(cursor, "cursor.notificationUri");
        return cursor;
    }

    public static final boolean b(ActivityManager activityManager) {
        l.f(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }
}

