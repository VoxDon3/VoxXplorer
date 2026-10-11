/*
 * Decompiled with CFR 0.152.
 */
package ax.J5;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.UserManager;
import android.util.Log;
import ax.J5.c;
import ax.J5.i;
import ax.J5.j;
import ax.J5.k;
import ax.J5.n;
import ax.J5.o;
import ax.M5.Z;
import ax.R5.l;
import ax.R5.p;
import ax.R5.q;
import ax.S5.e;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.concurrent.atomic.AtomicBoolean;

public class m {
    @Deprecated
    public static final int a = 12451000;
    @Deprecated
    static final AtomicBoolean b = new AtomicBoolean();
    private static boolean c = false;
    static boolean d = false;
    private static final AtomicBoolean e = new AtomicBoolean();

    @Deprecated
    public static void a(Context object, int n8) throws k, j {
        n8 = i.f().h((Context)object, n8);
        if (n8 != 0) {
            Intent intent = i.f().b((Context)object, n8, "e");
            object = new StringBuilder();
            ((StringBuilder)object).append("GooglePlayServices not available due to error ");
            ((StringBuilder)object).append(n8);
            Log.e((String)"GooglePlayServicesUtil", (String)((StringBuilder)object).toString());
            if (intent == null) {
                throw new j(n8);
            }
            throw new k(n8, "Google Play Services not available", intent);
        }
    }

    @Deprecated
    public static int b(Context context) {
        try {
            context = context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return context.versionCode;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            Log.w((String)"GooglePlayServicesUtil", (String)"Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static String c(int n8) {
        return ax.J5.c.D(n8);
    }

    public static Context d(Context context) {
        try {
            context = context.createPackageContext("com.google.android.gms", 3);
            return context;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return null;
        }
    }

    public static Resources e(Context context) {
        try {
            context = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            return context;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean f(Context context) {
        block5: {
            if (!d) {
                Throwable throwable2;
                block6: {
                    try {
                        PackageInfo packageInfo = ax.S5.e.a(context).d("com.google.android.gms", 64);
                        n.a(context);
                        c = packageInfo != null && !n.e(packageInfo, false) && n.e(packageInfo, true);
                        d = true;
                        break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    catch (PackageManager.NameNotFoundException nameNotFoundException) {}
                    Log.w((String)"GooglePlayServicesUtil", (String)"Cannot find Google Play services package name.", (Throwable)nameNotFoundException);
                    d = true;
                    break block5;
                }
                d = true;
                throw throwable2;
            }
        }
        if (c) return true;
        if (ax.R5.i.b()) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Deprecated
    public static int g(Context object, int n8) {
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        int n9;
        try {
            object.getResources().getString(o.a);
        }
        catch (Throwable throwable) {
            Log.e((String)"GooglePlayServicesUtil", (String)"The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(object.getPackageName()) && !e.get()) {
            n9 = Z.a((Context)object);
            if (n9 == 0) throw new GooglePlayServicesMissingManifestValueException();
            if (n9 != a) throw new GooglePlayServicesIncorrectManifestValueException(n9);
        }
        boolean bl = ax.R5.i.d((Context)object);
        int n10 = 1;
        n9 = !bl && !ax.R5.i.f((Context)object) ? 1 : 0;
        bl = n8 >= 0;
        ax.M5.p.a(bl);
        String string = object.getPackageName();
        PackageManager packageManager = object.getPackageManager();
        if (n9 != 0) {
            try {
                packageInfo2 = packageManager.getPackageInfo("com.android.vending", 8256);
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                Log.w((String)"GooglePlayServicesUtil", (String)String.valueOf(string).concat(" requires the Google Play Store, but it is missing."));
                return 9;
            }
        } else {
            packageInfo2 = null;
        }
        try {
            packageInfo = packageManager.getPackageInfo("com.google.android.gms", 64);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            Log.w((String)"GooglePlayServicesUtil", (String)String.valueOf(string).concat(" requires Google Play services, but they are missing."));
            return n10;
        }
        n.a((Context)object);
        if (!n.e(packageInfo, true)) {
            Log.w((String)"GooglePlayServicesUtil", (String)String.valueOf(string).concat(" requires Google Play services, but their signature is invalid."));
            return 9;
        }
        if (n9 != 0) {
            ax.M5.p.l(packageInfo2);
            if (!n.e(packageInfo2, true)) {
                Log.w((String)"GooglePlayServicesUtil", (String)String.valueOf(string).concat(" requires Google Play Store, but its signature is invalid."));
                return 9;
            }
        }
        if (n9 != 0 && packageInfo2 != null && !packageInfo2.signatures[0].equals((Object)packageInfo.signatures[0])) {
            Log.w((String)"GooglePlayServicesUtil", (String)String.valueOf(string).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
            return 9;
        }
        if (q.a(packageInfo.versionCode) < q.a(n8)) {
            n9 = packageInfo.versionCode;
            object = new StringBuilder();
            ((StringBuilder)object).append("Google Play services out of date for ");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(".  Requires ");
            ((StringBuilder)object).append(n8);
            ((StringBuilder)object).append(" but found ");
            ((StringBuilder)object).append(n9);
            Log.w((String)"GooglePlayServicesUtil", (String)((StringBuilder)object).toString());
            return 2;
        }
        packageInfo2 = packageInfo.applicationInfo;
        object = packageInfo2;
        if (packageInfo2 == null) {
            try {
                object = packageManager.getApplicationInfo("com.google.android.gms", 0);
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                Log.wtf((String)"GooglePlayServicesUtil", (String)String.valueOf(string).concat(" requires Google Play services, but they're missing when getting application info."), (Throwable)nameNotFoundException);
                return n10;
            }
        }
        if (((ApplicationInfo)object).enabled) return 0;
        return 3;
    }

    @Deprecated
    public static boolean h(Context context, int n8) {
        if (n8 == 18) {
            return true;
        }
        if (n8 == 1) {
            return m.l(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi(value=18)
    public static boolean i(Context context) {
        if (l.c()) {
            Object object = context.getSystemService("user");
            ax.M5.p.l(object);
            context = ((UserManager)object).getApplicationRestrictions(context.getPackageName());
            if (context != null && "true".equals(context.getString("restricted_profile"))) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public static boolean j(int n8) {
        return n8 == 1 || n8 == 2 || n8 == 3 || n8 == 9;
    }

    @Deprecated
    @TargetApi(value=19)
    public static boolean k(Context context, int n8, String string) {
        return p.b(context, n8, string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @TargetApi(value=21)
    static boolean l(Context context, String string) {
        Object object;
        boolean bl = string.equals("com.google.android.gms");
        if (l.f()) {
            try {
                object = context.getPackageManager().getPackageInstaller().getAllSessions();
                object = object.iterator();
            }
            catch (Exception exception) {
                return false;
            }
            while (object.hasNext()) {
                if (!string.equals(((PackageInstaller.SessionInfo)object.next()).getAppPackageName())) continue;
                return true;
            }
        }
        object = context.getPackageManager();
        try {
            string = object.getApplicationInfo(string, 8192);
            if (bl) {
                return ((ApplicationInfo)string).enabled;
            }
            if (!((ApplicationInfo)string).enabled) return false;
            bl = m.i(context);
            if (bl) return false;
            return true;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return false;
        }
    }
}

