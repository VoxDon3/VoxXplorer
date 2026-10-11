package ax.g8;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import ax.Q.b;
import ax.Y7.c;

/* renamed from: ax.g8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2130a {
    private final Context a;
    private final SharedPreferences b;
    private final c c;
    private boolean d;

    public C2130a(Context context, String str, c cVar) {
        Context a = a(context);
        this.a = a;
        this.b = a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.c = cVar;
        this.d = c();
    }

    private static Context a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : b.b(context);
    }

    private boolean c() {
        return this.b.contains("firebase_data_collection_default_enabled") ? this.b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized boolean b() {
        return this.d;
    }
}
