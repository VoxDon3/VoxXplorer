/*
 * Decompiled with CFR 0.152.
 */
package ax.o3;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import java.util.concurrent.Executor;

public final class i {
    public static /* bridge */ /* synthetic */ void a(NsdManager nsdManager, NsdServiceInfo nsdServiceInfo, Executor executor, NsdManager.ServiceInfoCallback serviceInfoCallback) {
        nsdManager.registerServiceInfoCallback(nsdServiceInfo, executor, serviceInfoCallback);
    }
}

