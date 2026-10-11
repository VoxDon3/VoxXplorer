/*
 * Decompiled with CFR 0.152.
 */
package ax.X2;

import android.os.storage.StorageManager;
import java.util.concurrent.Executor;

public final class G {
    public static /* bridge */ /* synthetic */ void a(StorageManager storageManager, Executor executor, StorageManager.StorageVolumeCallback storageVolumeCallback) {
        storageManager.registerStorageVolumeCallback(executor, storageVolumeCallback);
    }
}

