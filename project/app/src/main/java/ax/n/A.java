/*
 * Decompiled with CFR 0.152.
 */
package ax.n;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.IBinder;

public final class A
extends Service {
    public static ServiceInfo a(Context context) throws PackageManager.NameNotFoundException {
        int n8 = Build.VERSION.SDK_INT >= 24 ? a.a() | 0x80 : 640;
        return context.getPackageManager().getServiceInfo(new ComponentName(context, A.class), n8);
    }

    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    private static class a {
        static int a() {
            return 512;
        }
    }
}

