/*
 * Decompiled with CFR 0.152.
 */
package ax.t3;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.g;
import ax.Q2.e;
import ax.X2.Q;
import ax.t3.k;

public class j {
    public static boolean A(Context context) {
        return g.b(context).getBoolean("recycle_bin_confirmation_2", true);
    }

    public static boolean B(Context context) {
        return g.b(context).getBoolean("show_system", false);
    }

    public static boolean C(Context context) {
        return g.b(context).getBoolean("use_internal_image_viewer", true);
    }

    public static boolean D(Context context) {
        return g.b(context).getBoolean("use_internal_music_player", true);
    }

    public static boolean E(Context context) {
        return g.b(context).getBoolean("use_internal_text_editor", true);
    }

    public static boolean F(Context context) {
        if (!Q.N0()) {
            return false;
        }
        return g.b(context).getBoolean("use_internal_video_player", true);
    }

    public static boolean G(Context context) {
        return g.b(context).getBoolean("use_recycle_bin", true);
    }

    public static boolean H(Context context) {
        int n8;
        context = g.b(context);
        boolean bl = false;
        try {
            n8 = Integer.parseInt(context.getString("app_backup_storage", String.valueOf(0)));
        }
        catch (NumberFormatException numberFormatException) {
            n8 = 0;
        }
        if (n8 == 1) {
            bl = true;
        }
        return bl;
    }

    public static boolean I(Context context) {
        return j.l(context) < 100;
    }

    public static void a(Context context) {
        if (Q.O1()) {
            SharedPreferences sharedPreferences = g.b(context);
            if (j.i(context) == 1 && !j.j(context)) {
                sharedPreferences.edit().putString("night_mode", String.valueOf(-1)).apply();
                j.s(context, true);
            }
        }
    }

    public static boolean b(Context context) {
        return g.b(context).getBoolean("detect_usb_attached", true);
    }

    public static k.a c(Context context) {
        return k.a.d0;
    }

    public static int d(Context context) {
        if (!Q.b2()) {
            return 0;
        }
        context = g.b(context);
        try {
            int n8 = Integer.valueOf(context.getString("file_size_unit", String.valueOf(0)));
            return n8;
        }
        catch (NumberFormatException numberFormatException) {
            return 0;
        }
    }

    public static boolean e(Context context) {
        return g.b(context).getBoolean("finish_using_back_key", false);
    }

    public static long f(Context context) {
        return g.b(context).getLong("free_trial_activation_end", 0L);
    }

    public static int g(Context context) {
        context = g.b(context);
        try {
            int n8 = Integer.valueOf(context.getString("list_date_format", String.valueOf(0)));
            return n8;
        }
        catch (NumberFormatException numberFormatException) {
            return 0;
        }
    }

    public static int h(Context context) {
        context = g.b(context);
        try {
            int n8 = Integer.valueOf(context.getString("music_player_engine", String.valueOf(0)));
            return n8;
        }
        catch (NumberFormatException numberFormatException) {
            return 0;
        }
    }

    public static int i(Context context) {
        return 1;
    }

    public static boolean j(Context context) {
        return g.b(context).getBoolean("night_mode_auto_set", false);
    }

    public static boolean k(Context context) {
        return g.b(context).getBoolean("root_access_mode", false);
    }

    public static int l(Context context) {
        context = g.b(context);
        try {
            int n8 = Integer.valueOf(context.getString("storage_full_threshold", String.valueOf(97)));
            return n8;
        }
        catch (NumberFormatException numberFormatException) {
            return 97;
        }
    }

    public static int m(Context context) {
        return g.b(context).getInt("text_editor_font_size", 14);
    }

    public static boolean n(Context context) {
        try {
            boolean bl = g.b(context).getBoolean("usage_diagnostics", true);
            return bl;
        }
        catch (IllegalStateException | NullPointerException runtimeException) {
            return true;
        }
    }

    public static boolean o(Context context) {
        return g.b(context).getBoolean("user_debug_mode", false);
    }

    public static void p(Context context, boolean bl) {
        context = g.b(context).edit();
        context.putBoolean("detect_usb_attached", bl);
        context.apply();
    }

    public static void q(Context context, k.a a8) {
    }

    public static void r(Context context) {
        context = g.b(context).edit();
        context.putBoolean("finish_using_back_key", true);
        context.apply();
    }

    public static void s(Context context, boolean bl) {
        context = g.b(context).edit();
        context.putBoolean("night_mode_auto_set", bl);
        context.apply();
    }

    public static void t(Context context) {
        int n8 = e.A();
        context = g.b(context).edit();
        context.putString("storage_full_threshold", String.valueOf(n8));
        context.apply();
    }

    public static void u(Context context, int n8) {
        context = g.b(context).edit();
        context.putInt("text_editor_font_size", n8);
        context.apply();
    }

    public static void v(Context context, boolean bl) {
        context = g.b(context).edit();
        context.putBoolean("use_recycle_bin", bl);
        context.apply();
    }

    public static boolean w(Context context) {
        return g.b(context).getBoolean("show_dual_apps", false);
    }

    public static boolean x(Context context) {
        return g.b(context).getBoolean("show_add_to_home_screen", context.getResources().getBoolean(2131034115));
    }

    public static boolean y(Context context) {
        return g.b(context).getBoolean("show_hide_unhide", false);
    }

    public static boolean z(Context context) {
        return g.b(context).getBoolean("show_open_as", false);
    }
}

