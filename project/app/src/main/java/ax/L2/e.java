/*
 * Decompiled with CFR 0.152.
 */
package ax.L2;

import android.app.ActivityManager;
import java.util.List;

public final class e {
    public static /* bridge */ /* synthetic */ List a(ActivityManager activityManager, String string, int n8, int n9) {
        return activityManager.getHistoricalProcessExitReasons(string, n8, n9);
    }
}

