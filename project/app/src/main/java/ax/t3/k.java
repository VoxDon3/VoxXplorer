/*
 * Decompiled with CFR 0.152.
 */
package ax.t3;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import ax.Ha.c;
import ax.X2.Q;
import ax.t3.j;
import ax.u3.b;
import java.util.Random;

public class k {
    static Context a;
    static long b = 0L;
    static int c = -1;
    static String d;

    public static void A(Context context, int n8) {
        context = a.getSharedPreferences("USER_SETTINGS", 0).edit();
        context.putInt("storage_permission_result", n8);
        context.apply();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void B(Context context, SharedPreferences sharedPreferences) {
        sharedPreferences = sharedPreferences.edit();
        sharedPreferences.putLong("first_launch_time", System.currentTimeMillis());
        int n8 = 0;
        try {
            int n9;
            n8 = n9 = context.getPackageManager().getPackageInfo((String)context.getPackageName(), (int)0).versionCode;
        }
        catch (PackageManager.NameNotFoundException | ClassCastException throwable) {}
        sharedPreferences.putInt("install_version_code", n8);
        sharedPreferences.apply();
    }

    public static void C(Context context, int n8) {
        context = a.getSharedPreferences("USER_SETTINGS", 0).edit();
        context.putInt("last_desktop2_tab_index", n8);
        context.apply();
    }

    public static void D(long l8) {
        SharedPreferences.Editor editor = a.getSharedPreferences("USER_SETTINGS", 0).edit();
        editor.putLong("new_files_threshold", l8);
        editor.apply();
    }

    public static void E(Context context, int n8) {
        context = a.getSharedPreferences("USER_SETTINGS", 0).edit();
        context.putInt("notification_permission_result", n8);
        context.apply();
    }

    private static void F(SharedPreferences sharedPreferences) {
        sharedPreferences = sharedPreferences.edit();
        sharedPreferences.putString("navigation_type", String.valueOf(1));
        sharedPreferences.apply();
        c = 1;
    }

    public static void G() {
        SharedPreferences.Editor editor = a.getSharedPreferences("USER_SETTINGS", 0).edit();
        editor.putLong("rewarded_time", System.currentTimeMillis());
        editor.apply();
    }

    public static void H(boolean bl) {
        SharedPreferences.Editor editor = a.getSharedPreferences("USER_SETTINGS", 0).edit();
        editor.putBoolean("ump_consent_update_required", bl);
        editor.apply();
    }

    public static boolean I() {
        return true;
    }

    public static boolean J() {
        return false;
    }

    public static boolean K() {
        return k.k() == 2;
    }

    public static void a() {
        c = -1;
    }

    public static boolean b() {
        return true;
    }

    private static String c() {
        int n8 = new Random().nextInt(4);
        return (new String[]{"A", "A", "B", "C"})[n8];
    }

    public static int d(Context context) {
        return a.getSharedPreferences("USER_SETTINGS", 0).getInt("account_permission_result", 0);
    }

    public static boolean e() {
        return a.getSharedPreferences("USER_SETTINGS", 0).getBoolean("bookmark_added", false);
    }

    public static a f() {
        return ax.t3.k$a.d0;
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
        int n8 = c;
        if (n8 >= 0) {
            return n8;
        }
        String string = a.getSharedPreferences("USER_SETTINGS", 0).getString("navigation_type", a.getString(2131951806));
        try {
            c = Integer.valueOf(string);
        }
        catch (NumberFormatException numberFormatException) {
            c = 1;
        }
        return c;
    }

    public static String l() {
        String[] stringArray;
        try {
            stringArray = a.getResources().getStringArray(2130903047);
        }
        catch (RuntimeException runtimeException) {
            stringArray = new String[]{"WINDOW", "WINDOW_UP_BUTTON_TO_HOME", "NO_DRAWER", "DRAWER_ONLY_HOME", "NO_UP_BUTTON", "ALTERNATIVE"};
        }
        return stringArray[k.k() - 1];
    }

    public static long m() {
        return a.getSharedPreferences("USER_SETTINGS", 0).getLong("new_files_threshold", 0L);
    }

    public static int n(Context context) {
        return a.getSharedPreferences("USER_SETTINGS", 0).getInt("notification_permission_result", 0);
    }

    public static int o(int n8) {
        return 2;
    }

    public static long p() {
        return a.getSharedPreferences("USER_SETTINGS", 0).getLong("rewarded_time", 0L);
    }

    public static int q(Context context) {
        return a.getSharedPreferences("USER_SETTINGS", 0).getInt("sdcard_cancel_count", 0);
    }

    public static String r() {
        String string = d;
        if (string != null) {
            return string;
        }
        string = a.getSharedPreferences("USER_SETTINGS", 0);
        if (!string.contains("user_group")) {
            String string2;
            string = string.edit();
            d = string2 = k.c();
            string.putString("user_group", string2);
            string.apply();
            return d;
        }
        d = string = string.getString("user_group", null);
        if (string == null) {
            ax.u3.b.f();
            d = "A";
        }
        return d;
    }

    public static void s(Context context) {
        context = a.getSharedPreferences("USER_SETTINGS", 0);
        int n8 = context.getInt("sdcard_cancel_count", 0);
        context = context.edit();
        context.putInt("sdcard_cancel_count", n8 + 1);
        context.apply();
    }

    public static void t(Context context) {
        a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("USER_SETTINGS", 0);
        b = sharedPreferences.getLong("launch_count", 1L);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putLong("launch_count", b + 1L);
        editor.apply();
        if (k.v()) {
            k.F(sharedPreferences);
            k.B(context, sharedPreferences);
            j.t(context);
            j.v(context, k.x());
            j.q(context, k.f());
        }
    }

    public static boolean u() {
        return a.getSharedPreferences("USER_SETTINGS", 0).getBoolean("admin_mode", false);
    }

    public static boolean v() {
        return b == 1L;
    }

    public static boolean w(Context object) {
        if (b >= 30L && (object = object.getPackageName()) != null && !((String)object).startsWith("com.cx")) {
            ax.Ha.c.h().b("piracy detected").h();
            return true;
        }
        return false;
    }

    private static boolean x() {
        return Q.I0();
    }

    public static void y(Context context, int n8) {
        context = a.getSharedPreferences("USER_SETTINGS", 0).edit();
        context.putInt("account_permission_result", n8);
        context.apply();
    }

    public static void z() {
        SharedPreferences.Editor editor = a.getSharedPreferences("USER_SETTINGS", 0).edit();
        editor.putBoolean("bookmark_added", true);
        editor.apply();
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        private static final a[] e0;
        public static final /* enum */ a q;

        static {
            q = new a();
            c0 = new a();
            d0 = new a();
            e0 = ax.t3.k$a.d();
        }

        private static /* synthetic */ a[] d() {
            return new a[]{q, c0, d0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])e0.clone();
        }
    }
}

