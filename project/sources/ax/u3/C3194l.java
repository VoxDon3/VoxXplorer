package ax.u3;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import ax.X2.Q;

/* renamed from: ax.u3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3194l {
    public static PendingIntent a(Context context, int i, Intent intent, int i2, boolean z) {
        ActivityOptions makeBasic;
        if (Q.Y0()) {
            i2 |= 67108864;
        }
        if (!Q.j0() || !z) {
            return PendingIntent.getActivity(context, i, intent, i2);
        }
        makeBasic = ActivityOptions.makeBasic();
        makeBasic.setPendingIntentCreatorBackgroundActivityStartMode(1);
        return PendingIntent.getActivity(context, i, intent, i2, makeBasic.toBundle());
    }

    public static PendingIntent b(Context context, int i, Intent intent, int i2) {
        if (Q.n1()) {
            i2 |= 33554432;
        }
        return PendingIntent.getBroadcast(context, i, intent, i2);
    }
}
