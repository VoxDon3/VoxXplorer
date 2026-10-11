/*
 * Decompiled with CFR 0.152.
 */
package ax.X2;

import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import java.io.File;

public final class f {
    public static /* bridge */ /* synthetic */ StorageVolume a(StorageManager storageManager, File file) {
        return storageManager.getStorageVolume(file);
    }
}

