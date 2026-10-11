/*
 * Decompiled with CFR 0.152.
 */
package ax.L2;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import ax.Gb.l;

public final class m {
    public static final NetworkCapabilities a(ConnectivityManager connectivityManager, Network network) {
        l.f(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    public static final boolean b(NetworkCapabilities networkCapabilities, int n8) {
        l.f(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(n8);
    }

    public static final void c(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        l.f(connectivityManager, "<this>");
        l.f(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}

