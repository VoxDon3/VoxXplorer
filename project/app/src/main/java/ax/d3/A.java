/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.app.ActivityManager;
import android.content.ComponentName;

public final class A {
    public static /* bridge */ /* synthetic */ ComponentName a(ActivityManager.RecentTaskInfo recentTaskInfo) {
        return recentTaskInfo.baseActivity;
    }
}

