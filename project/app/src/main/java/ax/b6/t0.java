/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

public final class t0 {
    public static final int a;

    static {
        int n8 = Build.VERSION.SDK_INT >= 31 ? 0x2000000 : 0;
        a = n8;
    }

    public static PendingIntent a(Context context, int n8, Intent intent, int n9) {
        return PendingIntent.getBroadcast((Context)context, (int)0, (Intent)intent, (int)n9);
    }
}

