/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.app.PendingIntent;
import android.os.storage.StorageManager;

public final class e {
    public static /* bridge */ /* synthetic */ PendingIntent a(StorageManager storageManager, String string, int n8) {
        return storageManager.getManageSpaceActivityIntent(string, n8);
    }
}

