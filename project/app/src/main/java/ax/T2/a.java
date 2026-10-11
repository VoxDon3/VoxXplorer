/*
 * Decompiled with CFR 0.152.
 */
package ax.T2;

import android.os.storage.StorageManager;
import java.io.File;
import java.util.UUID;

public final class a {
    public static /* bridge */ /* synthetic */ UUID a(StorageManager storageManager, File file) {
        return storageManager.getUuidForPath(file);
    }
}

