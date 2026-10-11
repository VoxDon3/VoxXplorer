/*
 * Decompiled with CFR 0.152.
 */
package ax.S5;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import ax.R5.l;
import ax.S5.b;
import ax.S5.c;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

public class d {
    protected final Context a;

    public d(Context context) {
        this.a = context;
    }

    public int a(String string) {
        return this.a.checkCallingOrSelfPermission(string);
    }

    @ResultIgnorabilityUnspecified
    public ApplicationInfo b(String string, int n8) throws PackageManager.NameNotFoundException {
        return this.a.getPackageManager().getApplicationInfo(string, n8);
    }

    public CharSequence c(String string) throws PackageManager.NameNotFoundException {
        Context context = this.a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(string, 0));
    }

    @ResultIgnorabilityUnspecified
    public PackageInfo d(String string, int n8) throws PackageManager.NameNotFoundException {
        return this.a.getPackageManager().getPackageInfo(string, n8);
    }

    public boolean e() {
        String string;
        if (Binder.getCallingUid() == Process.myUid()) {
            return b.a(this.a);
        }
        if (l.h() && (string = this.a.getPackageManager().getNameForUid(Binder.getCallingUid())) != null) {
            return c.a(this.a.getPackageManager(), string);
        }
        return false;
    }

    @TargetApi(value=19)
    public final boolean f(int n8, String object) {
        if (l.d()) {
            block7: {
                AppOpsManager appOpsManager;
                try {
                    appOpsManager = (AppOpsManager)this.a.getSystemService("appops");
                    if (appOpsManager == null) break block7;
                }
                catch (SecurityException securityException) {
                    return false;
                }
                appOpsManager.checkPackage(n8, (String)object);
                return true;
            }
            object = new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            throw object;
        }
        String[] stringArray = this.a.getPackageManager().getPackagesForUid(n8);
        if (object != null && stringArray != null) {
            for (n8 = 0; n8 < stringArray.length; ++n8) {
                if (!((String)object).equals(stringArray[n8])) continue;
                return true;
            }
        }
        return false;
    }
}

