/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import android.os.storage.StorageManager;
import java.util.UUID;

public final class J {
    public static /* bridge */ /* synthetic */ long a(StorageManager storageManager, UUID uUID) {
        return storageManager.getAllocatableBytes(uUID);
    }
}

