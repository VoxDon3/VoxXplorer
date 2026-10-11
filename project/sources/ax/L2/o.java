package ax.L2;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes.dex */
public final class o {
    public static final Network a(ConnectivityManager connectivityManager) {
        Network activeNetwork;
        ax.Gb.l.f(connectivityManager, "<this>");
        activeNetwork = connectivityManager.getActiveNetwork();
        return activeNetwork;
    }
}
