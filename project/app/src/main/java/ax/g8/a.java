/*
 * Decompiled with CFR 0.152.
 */
package ax.g8;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import ax.Q.b;
import ax.Y7.c;

public class a {
    private final Context a;
    private final SharedPreferences b;
    private final c c;
    private boolean d;

    public a(Context context, String string, c c8) {
        this.a = context = ax.g8.a.a(context);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("com.google.firebase.common.prefs:");
        stringBuilder.append(string);
        this.b = context.getSharedPreferences(stringBuilder.toString(), 0);
        this.c = c8;
        this.d = this.c();
    }

    private static Context a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return context;
        }
        return ax.Q.b.b(context);
    }

    private boolean c() {
        if (this.b.contains("firebase_data_collection_default_enabled")) {
            return this.b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return this.d();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean d() {
        PackageManager packageManager;
        try {
            packageManager = this.a.getPackageManager();
            if (packageManager == null) return true;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return true;
        }
        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.a.getPackageName(), 128);
        if (applicationInfo == null) return true;
        packageManager = applicationInfo.metaData;
        if (packageManager == null) return true;
        if (!packageManager.containsKey("firebase_data_collection_default_enabled")) return true;
        return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean b() {
        synchronized (this) {
            return this.d;
        }
    }
}

