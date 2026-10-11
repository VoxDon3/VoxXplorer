/*
 * Decompiled with CFR 0.152.
 */
package ax.R5;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import ax.J5.n;
import ax.S5.e;

public final class p {
    public static boolean a(Context context, int n8) {
        block3: {
            if (p.b(context, n8, "com.google.android.gms")) {
                PackageManager packageManager = context.getPackageManager();
                try {
                    packageManager = packageManager.getPackageInfo("com.google.android.gms", 64);
                    return n.a(context).b((PackageInfo)packageManager);
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    if (!Log.isLoggable((String)"UidVerifier", (int)3)) break block3;
                    Log.d((String)"UidVerifier", (String)"Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    @TargetApi(value=19)
    public static boolean b(Context context, int n8, String string) {
        return e.a(context).f(n8, string);
    }
}

