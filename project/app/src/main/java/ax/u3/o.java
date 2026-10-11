/*
 * Decompiled with CFR 0.152.
 */
package ax.u3;

import android.app.AppOpsManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import ax.Ha.c;
import ax.Q.g;
import ax.X2.Q;
import ax.c3.u;
import ax.u3.B;
import ax.u3.n;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class o {
    public static Intent a(Context context) {
        Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
        intent.setData(Uri.fromParts((String)"package", (String)context.getPackageName(), null));
        return intent;
    }

    public static Intent b() {
        return new Intent("android.settings.USAGE_ACCESS_SETTINGS");
    }

    public static boolean c() {
        return n.a();
    }

    public static boolean d(Context context) {
        if (!Q.J1()) {
            return false;
        }
        int n8 = ((AppOpsManager)context.getSystemService("appops")).checkOpNoThrow("android:get_usage_stats", Process.myUid(), context.getPackageName());
        if (n8 == 3) {
            return context.checkCallingOrSelfPermission("android.permission.PACKAGE_USAGE_STATS") == 0;
        }
        return n8 == 0;
    }

    public static boolean e(Context context) {
        if (Q.z0()) {
            return o.c();
        }
        return o.h(context);
    }

    public static boolean f(Context context) {
        if (!Q.A1()) {
            return true;
        }
        return g.b(context, "android.permission.GET_ACCOUNTS") == 0;
    }

    public static boolean g(int[] nArray) {
        if (nArray.length < 1) {
            return false;
        }
        int n8 = nArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (nArray[i8] == 0) continue;
            return false;
        }
        return true;
    }

    public static boolean h(Context context) {
        if (!Q.A1()) {
            return true;
        }
        return g.b(context, "android.permission.READ_EXTERNAL_STORAGE") == 0 && g.b(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public static boolean i(Context context) {
        if (!Q.e0()) {
            return true;
        }
        return g.b(context, "android.permission.POST_NOTIFICATIONS") == 0;
    }

    public static boolean j(Fragment fragment) {
        return fragment.E2("android.permission.GET_ACCOUNTS");
    }

    public static boolean k(Fragment fragment) {
        return fragment.E2("android.permission.READ_EXTERNAL_STORAGE") || fragment.E2("android.permission.WRITE_EXTERNAL_STORAGE");
        {
        }
    }

    public static boolean l(Fragment fragment) {
        return fragment.E2("android.permission.POST_NOTIFICATIONS");
    }

    public static void m(Fragment fragment, int n8) {
        Intent intent = u.d(fragment.f0().getPackageName());
        try {
            u.r0(fragment, intent, n8);
            return;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            c.h().f().b("no app info activity").h();
            Toast.makeText((Context)fragment.f0(), (int)2131951927, (int)1).show();
            return;
        }
    }

    public static Snackbar n(View object, int n8, View.OnClickListener onClickListener) {
        object = B.S((View)object, n8, -2);
        ((Snackbar)object).q0(2131952303, onClickListener);
        ((TextView)((BaseTransientBottomBar)object).H().findViewById(2131362849)).setMaxLines(4);
        ((Snackbar)object).a0();
        return object;
    }

    public static void o(Fragment fragment, int n8) {
        try {
            fragment.m2(new String[]{"android.permission.GET_ACCOUNTS"}, n8);
            return;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            c.h().f().d("SHOW REQUEST PERMISSION 2").l(activityNotFoundException).h();
            Toast.makeText((Context)fragment.b(), (int)2131951927, (int)1).show();
            return;
        }
    }

    public static void p(Fragment fragment, int n8) {
        try {
            fragment.m2(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, n8);
            return;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            c.h().f().d("SHOW REQUEST PERMISSION 1").l(activityNotFoundException).h();
            Toast.makeText((Context)fragment.b(), (int)2131951927, (int)1).show();
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void q(Fragment fragment, int n8) {
        Throwable var2_4;
        try {
            fragment.m2(new String[]{"android.permission.POST_NOTIFICATIONS"}, n8);
            return;
        }
        catch (IllegalStateException illegalStateException) {
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            // empty catch block
        }
        c.h().f().d("SHOW REQUEST PERMISSION 3").l((Throwable)var2_4).h();
        Toast.makeText((Context)fragment.b(), (int)2131951927, (int)1).show();
    }
}

