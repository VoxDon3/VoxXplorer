/*
 * Decompiled with CFR 0.152.
 */
package ax.o3;

import android.net.nsd.NsdManager;

public final class k {
    public static /* bridge */ /* synthetic */ void a(NsdManager nsdManager, NsdManager.ServiceInfoCallback serviceInfoCallback) {
        nsdManager.unregisterServiceInfoCallback(serviceInfoCallback);
    }
}

