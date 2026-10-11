package ax.t3;

import android.content.Context;
import android.content.SharedPreferences;
import ax.X2.Q;
import ax.t3.k;
import com.voxdon.xplorer.R;

/* loaded from: classes.dex */
public class j {
    public static boolean A(Context context) {
        return androidx.preference.g.b(context).getBoolean("recycle_bin_confirmation_2", true);
    }

    public static boolean B(Context context) {
        return androidx.preference.g.b(context).getBoolean("show_system", false);
    }

    public static boolean C(Context context) {
        return androidx.preference.g.b(context).getBoolean("use_internal_image_viewer", true);
    }

    public static boolean D(Context context) {
        return androidx.preference.g.b(context).getBoolean("use_internal_music_player", true);
    }

    public static boolean E(Context context) {
        return androidx.preference.g.b(context).getBoolean("use_internal_text_editor", true);
    }

    public static boolean F(Context context) {
        if (Q.N0()) {
            return androidx.preference.g.b(context).getBoolean("use_internal_video_player", true);
        }
        return false;
    }

    public static boolean G(Context context) {
        return androidx.preference.g.b(context).getBoolean("use_recycle_bin", true);
    }

    public static boolean H(Context context) {
        int i;
        try {
            i = Integer.parseInt(androidx.preference.g.b(context).getString("app_backup_storage", String.valueOf(0)));
        } catch (NumberFormatException unused) {
            i = 0;
        }
        return i == 1;
    }

    public static boolean I(Context context) {
        return l(context) < 100;
    }

    public static void a(Context context) {
        if (Q.O1()) {
            SharedPreferences b = androidx.preference.g.b(context);
            if (i(context) != 1 || j(context)) {
                return;
            }
            b.edit().putString("night_mode", String.valueOf(-1)).apply();
            s(context, true);
        }
    }

    public static boolean b(Context context) {
        return androidx.preference.g.b(context).getBoolean("detect_usb_attached", true);
    }

    public static k.a c(Context context) {
        return k.a.DRAWER_NONE;
    }

    public static int d(Context context) {
        if (!Q.b2()) {
            return 0;
        }
        try {
            return Integer.valueOf(androidx.preference.g.b(context).getString("file_size_unit", String.valueOf(0))).intValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static boolean e(Context context) {
        return androidx.preference.g.b(context).getBoolean("finish_using_back_key", false);
    }

    public static long f(Context context) {
        return androidx.preference.g.b(context).getLong("free_trial_activation_end", 0L);
    }

    public static int g(Context context) {
        try {
            return Integer.valueOf(androidx.preference.g.b(context).getString("list_date_format", String.valueOf(0))).intValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static int h(Context context) {
        try {
            return Integer.valueOf(androidx.preference.g.b(context).getString("music_player_engine", String.valueOf(0))).intValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static int i(Context context) {
        return 1;
    }

    public static boolean j(Context context) {
        return androidx.preference.g.b(context).getBoolean("night_mode_auto_set", false);
    }

    public static boolean k(Context context) {
        return androidx.preference.g.b(context).getBoolean("root_access_mode", false);
    }

    public static int l(Context context) {
        try {
            return Integer.valueOf(androidx.preference.g.b(context).getString("storage_full_threshold", String.valueOf(97))).intValue();
        } catch (NumberFormatException unused) {
            return 97;
        }
    }

    public static int m(Context context) {
        return androidx.preference.g.b(context).getInt("text_editor_font_size", 14);
    }

    public static boolean n(Context context) {
        try {
            return androidx.preference.g.b(context).getBoolean("usage_diagnostics", true);
        } catch (IllegalStateException | NullPointerException unused) {
            return true;
        }
    }

    public static boolean o(Context context) {
        return androidx.preference.g.b(context).getBoolean("user_debug_mode", false);
    }

    public static void p(Context context, boolean z) {
        SharedPreferences.Editor edit = androidx.preference.g.b(context).edit();
        edit.putBoolean("detect_usb_attached", z);
        edit.apply();
    }

    public static void r(Context context) {
        SharedPreferences.Editor edit = androidx.preference.g.b(context).edit();
        edit.putBoolean("finish_using_back_key", true);
        edit.apply();
    }

    public static void s(Context context, boolean z) {
        SharedPreferences.Editor edit = androidx.preference.g.b(context).edit();
        edit.putBoolean("night_mode_auto_set", z);
        edit.apply();
    }

    public static void t(Context context) {
        int A = ax.Q2.e.A();
        SharedPreferences.Editor edit = androidx.preference.g.b(context).edit();
        edit.putString("storage_full_threshold", String.valueOf(A));
        edit.apply();
    }

    public static void u(Context context, int i) {
        SharedPreferences.Editor edit = androidx.preference.g.b(context).edit();
        edit.putInt("text_editor_font_size", i);
        edit.apply();
    }

    public static void v(Context context, boolean z) {
        SharedPreferences.Editor edit = androidx.preference.g.b(context).edit();
        edit.putBoolean("use_recycle_bin", z);
        edit.apply();
    }

    public static boolean w(Context context) {
        return androidx.preference.g.b(context).getBoolean("show_dual_apps", false);
    }

    public static boolean x(Context context) {
        return androidx.preference.g.b(context).getBoolean("show_add_to_home_screen", context.getResources().getBoolean(R.bool.default_show_add_to_home_screen));
    }

    public static boolean y(Context context) {
        return androidx.preference.g.b(context).getBoolean("show_hide_unhide", false);
    }

    public static boolean z(Context context) {
        return androidx.preference.g.b(context).getBoolean("show_open_as", false);
    }

    public static void q(Context context, k.a aVar) {
    }
}
