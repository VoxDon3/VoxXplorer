/*
 * Decompiled with CFR 0.152.
 */
package ax.I2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import ax.B2.i;
import ax.G2.b;
import ax.I2.h;
import ax.I2.j;
import ax.I2.l;
import ax.L2.m;
import ax.L2.o;
import ax.N2.c;
import ax.X.a;

public final class k {
    private static final String a;

    static {
        String string = i.i("NetworkStateTracker");
        ax.Gb.l.e(string, "tagWithPrefix(\"NetworkStateTracker\")");
        a = string;
    }

    public static final h<b> a(Context context, c c8) {
        ax.Gb.l.f(context, "context");
        ax.Gb.l.f(c8, "taskExecutor");
        if (Build.VERSION.SDK_INT >= 24) {
            return new j(context, c8);
        }
        return new l(context, c8);
    }

    public static final /* synthetic */ String b() {
        return a;
    }

    public static final b c(ConnectivityManager connectivityManager) {
        ax.Gb.l.f(connectivityManager, "<this>");
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        boolean bl = false;
        boolean bl2 = networkInfo != null && networkInfo.isConnected();
        boolean bl3 = k.d(connectivityManager);
        boolean bl4 = ax.X.a.a(connectivityManager);
        boolean bl5 = bl;
        if (networkInfo != null) {
            bl5 = bl;
            if (!networkInfo.isRoaming()) {
                bl5 = true;
            }
        }
        return new b(bl2, bl3, bl4, bl5);
    }

    public static final boolean d(ConnectivityManager connectivityManager) {
        boolean bl;
        block4: {
            ax.Gb.l.f(connectivityManager, "<this>");
            int n8 = Build.VERSION.SDK_INT;
            boolean bl2 = false;
            if (n8 < 23) {
                return false;
            }
            connectivityManager = m.a(connectivityManager, o.a(connectivityManager));
            bl = bl2;
            if (connectivityManager == null) break block4;
            try {
                bl = m.b((NetworkCapabilities)connectivityManager, 16);
            }
            catch (SecurityException securityException) {
                i.e().d(a, "Unable to validate active network", securityException);
                bl = bl2;
            }
        }
        return bl;
    }
}

