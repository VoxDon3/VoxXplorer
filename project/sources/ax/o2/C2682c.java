package ax.o2;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;
import ax.Gb.l;

/* renamed from: ax.o2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2682c {
    public static final C2682c a = new C2682c();

    private C2682c() {
    }

    public static final Uri a(Cursor cursor) {
        l.f(cursor, "cursor");
        Uri notificationUri = cursor.getNotificationUri();
        l.e(notificationUri, "cursor.notificationUri");
        return notificationUri;
    }

    public static final boolean b(ActivityManager activityManager) {
        l.f(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }
}
