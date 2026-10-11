package ax.I2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

/* loaded from: classes.dex */
public final class k {
    private static final String a;

    static {
        String i = ax.B2.i.i("NetworkStateTracker");
        ax.Gb.l.e(i, "tagWithPrefix(\"NetworkStateTracker\")");
        a = i;
    }

    public static final h<ax.G2.b> a(Context context, ax.N2.c cVar) {
        ax.Gb.l.f(context, "context");
        ax.Gb.l.f(cVar, "taskExecutor");
        return Build.VERSION.SDK_INT >= 24 ? new j(context, cVar) : new l(context, cVar);
    }

    public static final ax.G2.b c(ConnectivityManager connectivityManager) {
        ax.Gb.l.f(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z = false;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean d = d(connectivityManager);
        boolean a2 = ax.X.a.a(connectivityManager);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z = true;
        }
        return new ax.G2.b(z2, d, a2, z);
    }

    public static final boolean d(ConnectivityManager connectivityManager) {
        ax.Gb.l.f(connectivityManager, "<this>");
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities a2 = ax.L2.m.a(connectivityManager, ax.L2.o.a(connectivityManager));
            if (a2 != null) {
                return ax.L2.m.b(a2, 16);
            }
            return false;
        } catch (SecurityException e) {
            ax.B2.i.e().d(a, "Unable to validate active network", e);
            return false;
        }
    }
}
