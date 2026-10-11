/*
 * Decompiled with CFR 0.152.
 */
package ax.t3;

import android.content.Context;

public class d {
    public static int a(Context context) {
        return context.getSharedPreferences("internal_prefs", 0).getInt("slideshow_interval", 4000);
    }

    public static boolean b(Context context) {
        return context.getSharedPreferences("internal_prefs", 0).getInt("slideshow_repeat", 0) == 1;
    }

    public static boolean c(Context context) {
        return context.getSharedPreferences("internal_prefs", 0).getBoolean("slideshow_shuffle", false);
    }

    public static boolean d(Context context) {
        return context.getSharedPreferences("internal_prefs", 0).getBoolean("slideshow_video_play_full", false);
    }

    public static void e(Context context, int n8) {
        context.getSharedPreferences("internal_prefs", 0).edit().putInt("slideshow_interval", n8).apply();
    }

    public static void f(Context context, boolean bl) {
        context.getSharedPreferences("internal_prefs", 0).edit().putInt("slideshow_repeat", bl ? 1 : 0).apply();
    }

    public static void g(Context context, boolean bl) {
        context.getSharedPreferences("internal_prefs", 0).edit().putBoolean("slideshow_shuffle", bl).apply();
    }

    public static void h(Context context, boolean bl) {
        context.getSharedPreferences("internal_prefs", 0).edit().putBoolean("slideshow_video_play_full", bl).apply();
    }
}

