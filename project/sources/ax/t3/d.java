package ax.t3;

import android.content.Context;

/* loaded from: classes.dex */
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

    public static void e(Context context, int i) {
        context.getSharedPreferences("internal_prefs", 0).edit().putInt("slideshow_interval", i).apply();
    }

    public static void f(Context context, boolean z) {
        context.getSharedPreferences("internal_prefs", 0).edit().putInt("slideshow_repeat", z ? 1 : 0).apply();
    }

    public static void g(Context context, boolean z) {
        context.getSharedPreferences("internal_prefs", 0).edit().putBoolean("slideshow_shuffle", z).apply();
    }

    public static void h(Context context, boolean z) {
        context.getSharedPreferences("internal_prefs", 0).edit().putBoolean("slideshow_video_play_full", z).apply();
    }
}
