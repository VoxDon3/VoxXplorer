/*
 * Decompiled with CFR 0.152.
 */
package ax.u3;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ax.X2.Q;
import ax.d3.f;
import ax.u3.k;

public class l {
    public static PendingIntent a(Context context, int n8, Intent intent, int n9, boolean bl) {
        int n10 = n9;
        if (Q.Y0()) {
            n10 = n9 | 0x4000000;
        }
        if (Q.j0() && bl) {
            ActivityOptions activityOptions = f.a();
            k.a(activityOptions, 1);
            return PendingIntent.getActivity((Context)context, (int)n8, (Intent)intent, (int)n10, (Bundle)activityOptions.toBundle());
        }
        return PendingIntent.getActivity((Context)context, (int)n8, (Intent)intent, (int)n10);
    }

    public static PendingIntent b(Context context, int n8, Intent intent, int n9) {
        int n10 = n9;
        if (Q.n1()) {
            n10 = n9 | 0x2000000;
        }
        return PendingIntent.getBroadcast((Context)context, (int)n8, (Intent)intent, (int)n10);
    }
}

