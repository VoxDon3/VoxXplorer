/*
 * Decompiled with CFR 0.152.
 */
package ax.T2;

import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.os.UserHandle;
import java.util.UUID;

public final class d {
    public static /* bridge */ /* synthetic */ StorageStats a(StorageStatsManager storageStatsManager, UUID uUID, String string, UserHandle userHandle) {
        return storageStatsManager.queryStatsForPackage(uUID, string, userHandle);
    }
}

