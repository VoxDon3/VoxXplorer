package ax.u3;

import android.app.AppOpsManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.os.Process;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import ax.X2.Q;
import ax.c3.C1832u;
import com.voxdon.xplorer.R;
import com.google.android.material.snackbar.Snackbar;

/* renamed from: ax.u3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3197o {
    public static Intent a(Context context) {
        Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        return intent;
    }

    public static Intent b() {
        return new Intent("android.settings.USAGE_ACCESS_SETTINGS");
    }

    public static boolean c() {
        boolean isExternalStorageManager;
        isExternalStorageManager = Environment.isExternalStorageManager();
        return isExternalStorageManager;
    }

    public static boolean d(Context context) {
        if (!Q.J1()) {
            return false;
        }
        int checkOpNoThrow = ((AppOpsManager) context.getSystemService("appops")).checkOpNoThrow("android:get_usage_stats", Process.myUid(), context.getPackageName());
        return checkOpNoThrow == 3 ? context.checkCallingOrSelfPermission("android.permission.PACKAGE_USAGE_STATS") == 0 : checkOpNoThrow == 0;
    }

    public static boolean e(Context context) {
        return Q.z0() ? c() : h(context);
    }

    public static boolean f(Context context) {
        return !Q.A1() || ax.Q.g.b(context, "android.permission.GET_ACCOUNTS") == 0;
    }

    public static boolean g(int[] iArr) {
        if (iArr.length < 1) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(Context context) {
        if (Q.A1()) {
            return ax.Q.g.b(context, "android.permission.READ_EXTERNAL_STORAGE") == 0 && ax.Q.g.b(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        }
        return true;
    }

    public static boolean i(Context context) {
        return !Q.e0() || ax.Q.g.b(context, "android.permission.POST_NOTIFICATIONS") == 0;
    }

    public static boolean j(Fragment fragment) {
        return fragment.E2("android.permission.GET_ACCOUNTS");
    }

    public static boolean k(Fragment fragment) {
        return fragment.E2("android.permission.READ_EXTERNAL_STORAGE") || fragment.E2("android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public static boolean l(Fragment fragment) {
        return fragment.E2("android.permission.POST_NOTIFICATIONS");
    }

    public static void m(Fragment fragment, int i) {
        try {
            C1832u.r0(fragment, C1832u.d(fragment.f0().getPackageName()), i);
        } catch (ActivityNotFoundException unused) {
            ax.Ha.c.h().f().b("no app info activity").h();
            Toast.makeText(fragment.f0(), R.string.error, 1).show();
        }
    }

    public static Snackbar n(View view, int i, View.OnClickListener onClickListener) {
        Snackbar S = C3180B.S(view, i, -2);
        S.q0(R.string.menu_settings, onClickListener);
        ((TextView) S.H().findViewById(R.id.snackbar_text)).setMaxLines(4);
        S.a0();
        return S;
    }

    public static void o(Fragment fragment, int i) {
        try {
            fragment.m2(new String[]{"android.permission.GET_ACCOUNTS"}, i);
        } catch (ActivityNotFoundException e) {
            ax.Ha.c.h().f().d("SHOW REQUEST PERMISSION 2").l(e).h();
            Toast.makeText(fragment.b(), R.string.error, 1).show();
        }
    }

    public static void p(Fragment fragment, int i) {
        try {
            fragment.m2(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, i);
        } catch (ActivityNotFoundException e) {
            ax.Ha.c.h().f().d("SHOW REQUEST PERMISSION 1").l(e).h();
            Toast.makeText(fragment.b(), R.string.error, 1).show();
        }
    }

    public static void q(Fragment fragment, int i) {
        try {
            fragment.m2(new String[]{"android.permission.POST_NOTIFICATIONS"}, i);
        } catch (ActivityNotFoundException | IllegalStateException e) {
            ax.Ha.c.h().f().d("SHOW REQUEST PERMISSION 3").l(e).h();
            Toast.makeText(fragment.b(), R.string.error, 1).show();
        }
    }
}
