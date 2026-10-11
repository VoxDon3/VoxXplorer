/*
 * Decompiled with CFR 0.152.
 */
package ax.L2;

import android.net.ConnectivityManager;
import android.net.Network;

public final class n {
    public static /* bridge */ /* synthetic */ Network a(ConnectivityManager connectivityManager) {
        return connectivityManager.getActiveNetwork();
    }
}

