package ax.t3;

import android.content.Context;

/* loaded from: classes.dex */
public class f {
    public static boolean a(Context context) {
        return context.getSharedPreferences("musicplayer", 0).getBoolean("show_control_buttons_expanded", false);
    }

    public static void b(Context context, boolean z) {
        context.getSharedPreferences("musicplayer", 0).edit().putBoolean("show_control_buttons_expanded", z).apply();
    }
}
