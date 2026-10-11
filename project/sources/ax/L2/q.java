package ax.L2;

import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public final class q {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        ax.Gb.l.f(connectivityManager, "<this>");
        ax.Gb.l.f(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
