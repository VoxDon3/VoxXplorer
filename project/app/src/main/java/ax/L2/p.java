/*
 * Decompiled with CFR 0.152.
 */
package ax.L2;

import android.net.ConnectivityManager;

public final class p {
    public static /* bridge */ /* synthetic */ void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}

