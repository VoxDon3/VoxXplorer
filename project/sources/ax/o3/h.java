package ax.o3;

import android.content.Context;
import ax.u3.C3180B;

/* loaded from: classes.dex */
public class h {
    public static String a(Context context) {
        return context.getSharedPreferences("ServerPrefs", 0).getString("passcode", null);
    }

    public static int b(Context context) {
        return context.getSharedPreferences("ServerPrefs", 0).getInt("port", -1);
    }

    public static String c(Context context, String str) {
        return context.getSharedPreferences("ServerCertPrefs", 0).getString("ftps_tls_key_store_" + str, null);
    }

    public static int d(Context context) {
        int i = context.getSharedPreferences("ServerPrefs", 0).getInt("media_port", -1);
        if (i < 0) {
            int v = C3180B.v();
            i(context, v);
            return v;
        }
        if (C3180B.M(i)) {
            return i;
        }
        int v2 = C3180B.v();
        i(context, v2);
        return v2;
    }

    public static void e(Context context, String str) {
        context.getSharedPreferences("ServerCertPrefs", 0).edit().remove("ftps_tls_key_store_" + str).apply();
    }

    public static void f(Context context, String str) {
        context.getSharedPreferences("ServerPrefs", 0).edit().putString("passcode", str).commit();
    }

    public static void g(Context context, int i) {
        context.getSharedPreferences("ServerPrefs", 0).edit().putInt("port", i).commit();
    }

    public static void h(Context context, String str, String str2) {
        context.getSharedPreferences("ServerCertPrefs", 0).edit().putString("ftps_tls_key_store_" + str, str2).apply();
    }

    public static void i(Context context, int i) {
        context.getSharedPreferences("ServerPrefs", 0).edit().putInt("media_port", i).commit();
    }

    public static void j(Context context, boolean z) {
        context.getSharedPreferences("ServerPrefs", 0).edit().putBoolean("show_hidden_file", z).apply();
    }

    public static boolean k(Context context) {
        return context.getSharedPreferences("ServerPrefs", 0).getBoolean("show_hidden_file", false);
    }
}
