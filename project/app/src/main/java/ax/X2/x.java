/*
 * Decompiled with CFR 0.152.
 */
package ax.X2;

import android.content.Intent;
import android.os.storage.StorageVolume;

public final class x {
    public static /* bridge */ /* synthetic */ Intent a(StorageVolume storageVolume, String string) {
        return storageVolume.createAccessIntent(string);
    }
}

