/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import ax.W5.U;

public final class B {
    static volatile U a = U.c();
    private static final Object b = new Object();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean a(Context context, Uri object) {
        object = object.getAuthority();
        boolean bl = "com.google.android.gms.phenotype".equals(object);
        boolean bl2 = false;
        if (!bl) {
            Log.e((String)"PhenotypeClientHelper", (String)String.valueOf(object).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        }
        if (a.b()) {
            return (Boolean)a.a();
        }
        object = b;
        synchronized (object) {
            try {
                block12: {
                    block11: {
                        if (a.b()) {
                            return (Boolean)a.a();
                        }
                        if ("com.google.android.gms".equals(context.getPackageName())) break block11;
                        PackageManager packageManager = context.getPackageManager();
                        int n8 = Build.VERSION.SDK_INT < 29 ? 0 : 0x10000000;
                        packageManager = packageManager.resolveContentProvider("com.google.android.gms.phenotype", n8);
                        bl = bl2;
                        if (packageManager == null) break block12;
                        bl = bl2;
                        if (!"com.google.android.gms".equals(packageManager.packageName)) break block12;
                    }
                    context = context.getPackageManager();
                    try {
                        context = context.getApplicationInfo("com.google.android.gms", 0);
                        bl = bl2;
                        if ((context.flags & 0x81) != 0) {
                            bl = true;
                        }
                    }
                    catch (PackageManager.NameNotFoundException nameNotFoundException) {
                        bl = bl2;
                    }
                }
                a = U.d(bl);
                return (Boolean)a.a();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

