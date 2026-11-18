package ax.t3;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import ax.X2.Q;
import ax.u3.C3184b;
import com.voxdon.xplorer.R;
import java.util.Random;

/* loaded from: classes.dex */
public class k {
    static Context a = null;
    static long b = 0;
    static int c = -1;
    static String d;

    public enum a {
        DRAWER_ONLY_HOME,
        DRAWER_ALWAYS,
        DRAWER_NONE
    }

    public static void A(Context context, int i) {
        SharedPreferences.Editor edit = a.getSharedPreferences("USER_SETTINGS", 0).edit();
        edit.putInt("storage_permission_result", i);
        edit.apply();
    }

    private static void B(Context context, SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong("first_launch_time", System.currentTimeMillis());
        int i = 0;
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException | ClassCastException unused) {
        }
        edit.putInt("install_version_code", i);
        edit.apply();
    }

    public static void C(Context context, int i) {
        SharedPreferences.Editor edit = a.getSharedPreferences("USER_SETTINGS", 0).edit();
        edit.putInt("last_desktop2_tab_index", i);
        edit.apply();
    }

    public static void D(long j) {
        SharedPreferences.Editor edit = a.getSharedPreferences("USER_SETTINGS", 0).edit();
        edit.putLong("new_files_threshold", j);
        edit.apply();
    }

    public static void E(Context context, int i) {
        SharedPreferences.Editor edit = a.getSharedPreferences("USER_SETTINGS", 0).edit();
        edit.putInt("notification_permission_result", i);
        edit.apply();
    }

    private static void F(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("navigation_type", String.valueOf(1));
        edit.apply();
        c = 1;
    }

    public static void G() {
        SharedPreferences.Editor edit = a.getSharedPreferences("USER_SETTINGS", 0).edit();
        edit.putLong("rewarded_time", System.currentTimeMillis());
        edit.apply();
    }

    public static void H(boolean z) {
        SharedPreferences.Editor edit = a.getSharedPreferences("USER_SETTINGS", 0).edit();
        edit.putBoolean("ump_consent_update_required", z);
        edit.apply();
    }

    public static boolean I() {
        return true;
    }

    public static boolean J() {
        return false;
    }

    public static boolean K() {
        return k() == 2;
    }

    public static void a() {
        c = -1;
    }

    public static boolean b() {
        return true;
    }

    private static String c() {
        return new String[]{"A", "A", "B", "C"}[new Random().nextInt(4)];
    }

    public static int d(Context context) {
        return a.getSharedPreferences("USER_SETTINGS", 0).getInt("account_permission_result", 0);
    }

    public static boolean e() {
        return a.getSharedPreferences("USER_SETTINGS", 0).getBoolean("bookmark_added", false);
    }

    public static a f() {
        return a.DRAWER_NONE;
    }

    public static int g(Context context) {
        return a.getSharedPreferences("USER_SETTINGS", 0).getInt("storage_permission_result", 0);
    }

    public static long h() {
        return a.getSharedPreferences("USER_SETTINGS", 0).getLong("first_launch_time", 0L);
    }

    public static int i(Context context) {
        return a.getSharedPreferences("USER_SETTINGS", 0).getInt("last_desktop2_tab_index", 0);
    }

    public static long j() {
        return b;
    }

    public static int k() {
        int i = c;
        if (i >= 0) {
            return i;
        }
        try {
            c = Integer.valueOf(a.getSharedPreferences("USER_SETTINGS", 0).getString("navigation_type", a.getString(R.string.dev_settings_navigation_default))).intValue();
        } catch (NumberFormatException unused) {
            c = 1;
        }
        return c;
    }

    public static String l() {
        String[] strArr;
        try {
            strArr = a.getResources().getStringArray(R.array.dev_settings_navigation_type_string);
        } catch (RuntimeException unused) {
            strArr = new String[]{"WINDOW", "WINDOW_UP_BUTTON_TO_HOME", "NO_DRAWER", "DRAWER_ONLY_HOME", "NO_UP_BUTTON", "ALTERNATIVE"};
        }
        return strArr[k() - 1];
    }

    public static long m() {
        return a.getSharedPreferences("USER_SETTINGS", 0).getLong("new_files_threshold", 0L);
    }

    public static int n(Context context) {
        return a.getSharedPreferences("USER_SETTINGS", 0).getInt("notification_permission_result", 0);
    }

    public static int o(int i) {
        return 2;
    }

    public static long p() {
        return a.getSharedPreferences("USER_SETTINGS", 0).getLong("rewarded_time", 0L);
    }

    public static int q(Context context) {
        return a.getSharedPreferences("USER_SETTINGS", 0).getInt("sdcard_cancel_count", 0);
    }

    public static String r() {
        String str = d;
        if (str != null) {
            return str;
        }
        SharedPreferences sharedPreferences = a.getSharedPreferences("USER_SETTINGS", 0);
        if (sharedPreferences.contains("user_group")) {
            String string = sharedPreferences.getString("user_group", null);
            d = string;
            if (string == null) {
                C3184b.f();
                d = "A";
            }
            return d;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String c2 = c();
        d = c2;
        edit.putString("user_group", c2);
        edit.apply();
        return d;
    }

    public static void s(Context context) {
        SharedPreferences sharedPreferences = a.getSharedPreferences("USER_SETTINGS", 0);
        int i = sharedPreferences.getInt("sdcard_cancel_count", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("sdcard_cancel_count", i + 1);
        edit.apply();
    }

    public static void t(Context context) {
        a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("USER_SETTINGS", 0);
        b = sharedPreferences.getLong("launch_count", 1L);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong("launch_count", b + 1);
        edit.apply();
        if (v()) {
            F(sharedPreferences);
            B(context, sharedPreferences);
            j.t(context);
            j.v(context, x());
            j.q(context, f());
        }
    }

    public static boolean u() {
        return a.getSharedPreferences("USER_SETTINGS", 0).getBoolean("admin_mode", false);
    }

    public static boolean v() {
        return b == 1;
    }

    public static boolean w(Context context) {
        String packageName;
        if (b < 30 || (packageName = context.getPackageName()) == null || packageName.startsWith("com.voxdon")) {
            return false;
        }
        ax.Ha.c.h().b("piracy detected").h();
        return true;
    }

    private static boolean x() {
        return Q.I0();
    }

    public static void y(Context context, int i) {
        SharedPreferences.Editor edit = a.getSharedPreferences("USER_SETTINGS", 0).edit();
        edit.putInt("account_permission_result", i);
        edit.apply();
    }

    public static void z() {
        SharedPreferences.Editor edit = a.getSharedPreferences("USER_SETTINGS", 0).edit();
        edit.putBoolean("bookmark_added", true);
        edit.apply();
    }
}
