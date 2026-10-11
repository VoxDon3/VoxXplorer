/*
 * Decompiled with CFR 0.152.
 */
package ax.l3;

import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.ProxyFileDescriptorCallback;
import android.os.storage.StorageManager;

public final class c {
    public static /* bridge */ /* synthetic */ ParcelFileDescriptor a(StorageManager storageManager, int n8, ProxyFileDescriptorCallback proxyFileDescriptorCallback, Handler handler) {
        return storageManager.openProxyFileDescriptor(n8, proxyFileDescriptorCallback, handler);
    }
}

