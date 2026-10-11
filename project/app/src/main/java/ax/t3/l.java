/*
 * Decompiled with CFR 0.152.
 */
package ax.t3;

import android.content.Context;

public class l {
    public static boolean a(Context context) {
        return context.getSharedPreferences("video_player_prefs", 0).getBoolean("show_control_buttons_expanded", false);
    }

    public static int b(Context object) {
        object = object.getSharedPreferences("video_player_prefs", 0).getString("controls_timeout", "5");
        try {
            int n8 = Integer.parseInt((String)object);
            return n8;
        }
        catch (Exception exception) {
            return 5;
        }
    }

    public static int c(Context object) {
        object = object.getSharedPreferences("video_player_prefs", 0).getString("double_tap_seek_time", "10");
        try {
            int n8 = Integer.parseInt((String)object);
            return n8;
        }
        catch (Exception exception) {
            return 10;
        }
    }

    public static int d(Context context) {
        return context.getSharedPreferences("video_player_prefs", 0).getInt("repeat_mode", 0);
    }

    public static String e() {
        return "video_player_prefs";
    }

    public static boolean f(Context context) {
        return context.getSharedPreferences("video_player_prefs", 0).getBoolean("shuffle_mode", false);
    }

    public static String g(Context object) {
        if ("true".equals(object = object.getSharedPreferences("video_player_prefs", 0).getString("subtitle_language", "default"))) {
            return "default";
        }
        return object;
    }

    public static int h(Context context) {
        return context.getSharedPreferences("video_player_prefs", 0).getInt("subtitle_size", 22);
    }

    public static boolean i(Context context) {
        return context.getSharedPreferences("video_player_prefs", 0).getBoolean("subtitles_on_default", true);
    }

    public static void j(Context context, boolean bl) {
        context.getSharedPreferences("video_player_prefs", 0).edit().putBoolean("show_control_buttons_expanded", bl).apply();
    }

    public static void k(Context context, int n8) {
        context.getSharedPreferences("video_player_prefs", 0).edit().putInt("repeat_mode", n8).apply();
    }

    public static void l(Context context, boolean bl) {
        context.getSharedPreferences("video_player_prefs", 0).edit().putBoolean("shuffle_mode", bl).apply();
    }

    public static void m(Context context, int n8) {
        context.getSharedPreferences("video_player_prefs", 0).edit().putInt("subtitle_size", n8).apply();
    }

    public static void n(Context context, boolean bl) {
        context.getSharedPreferences("video_player_prefs", 0).edit().putBoolean("use_custom_codec", bl).apply();
    }

    public static boolean o(Context context) {
        return context.getSharedPreferences("video_player_prefs", 0).getBoolean("use_brightness_gesture", true);
    }

    public static boolean p(Context context) {
        return false;
    }

    public static boolean q(Context context) {
        return context.getSharedPreferences("video_player_prefs", 0).getBoolean("use_double_speed_gesture", true);
    }

    public static boolean r(Context context) {
        return context.getSharedPreferences("video_player_prefs", 0).getBoolean("use_half_speed_gesture", true);
    }

    public static boolean s(Context context) {
        return context.getSharedPreferences("video_player_prefs", 0).getBoolean("use_seek_double_tap", true);
    }

    public static boolean t(Context context) {
        return context.getSharedPreferences("video_player_prefs", 0).getBoolean("use_seek_swipe", true);
    }

    public static boolean u(Context context) {
        return context.getSharedPreferences("video_player_prefs", 0).getBoolean("use_volume_gesture", true);
    }

    public static boolean v(Context context) {
        return context.getSharedPreferences("video_player_prefs", 0).getBoolean("use_zoom_gesture", true);
    }
}

