/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import ax.q7.k;

public final class W2 {
    private static volatile k<Boolean> a = k.a();
    private static final Object b = new Object();

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(Context context) {
        block3: {
            context = context.getPackageManager();
            try {
                context = context.getApplicationInfo("com.google.android.gms", 0);
                if ((context.flags & 0x81) == 0) break block3;
                return true;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                return false;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean b(Context object, Uri object2) {
        object2 = object2.getAuthority();
        boolean bl = "com.google.android.gms.phenotype".equals(object2);
        boolean bl2 = false;
        if (!bl) {
            object = new StringBuilder();
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            Log.e((String)"PhenotypeClientHelper", (String)((StringBuilder)object).toString());
            return false;
        }
        if (a.c()) {
            return a.b();
        }
        object2 = b;
        synchronized (object2) {
            try {
                block12: {
                    block11: {
                        if (a.c()) {
                            return a.b();
                        }
                        if ("com.google.android.gms".equals(object.getPackageName())) break block11;
                        PackageManager packageManager = object.getPackageManager();
                        int n8 = Build.VERSION.SDK_INT < 29 ? 0 : 0x10000000;
                        packageManager = packageManager.resolveContentProvider("com.google.android.gms.phenotype", n8);
                        bl = bl2;
                        if (packageManager == null) break block12;
                        bl = bl2;
                        if (!"com.google.android.gms".equals(packageManager.packageName)) break block12;
                    }
                    bl = bl2;
                    if (W2.a((Context)object)) {
                        bl = true;
                    }
                }
                a = k.d(bl);
                return a.b();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

