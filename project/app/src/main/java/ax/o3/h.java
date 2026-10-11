/*
 * Decompiled with CFR 0.152.
 */
package ax.o3;

import android.content.Context;
import android.content.SharedPreferences;
import ax.u3.B;

public class h {
    public static String a(Context context) {
        return context.getSharedPreferences("ServerPrefs", 0).getString("passcode", null);
    }

    public static int b(Context context) {
        return context.getSharedPreferences("ServerPrefs", 0).getInt("port", -1);
    }

    public static String c(Context object, String string) {
        SharedPreferences sharedPreferences = object.getSharedPreferences("ServerCertPrefs", 0);
        object = new StringBuilder();
        ((StringBuilder)object).append("ftps_tls_key_store_");
        ((StringBuilder)object).append(string);
        return sharedPreferences.getString(((StringBuilder)object).toString(), null);
    }

    public static int d(Context context) {
        int n8 = context.getSharedPreferences("ServerPrefs", 0).getInt("media_port", -1);
        if (n8 < 0) {
            int n9 = B.v();
            h.i(context, n9);
            return n9;
        }
        int n10 = n8;
        if (!B.M(n8)) {
            n10 = B.v();
            h.i(context, n10);
        }
        return n10;
    }

    public static void e(Context object, String string) {
        SharedPreferences.Editor editor = object.getSharedPreferences("ServerCertPrefs", 0).edit();
        object = new StringBuilder();
        ((StringBuilder)object).append("ftps_tls_key_store_");
        ((StringBuilder)object).append(string);
        editor.remove(((StringBuilder)object).toString()).apply();
    }

    public static void f(Context context, String string) {
        context.getSharedPreferences("ServerPrefs", 0).edit().putString("passcode", string).commit();
    }

    public static void g(Context context, int n8) {
        context.getSharedPreferences("ServerPrefs", 0).edit().putInt("port", n8).commit();
    }

    public static void h(Context context, String string, String string2) {
        context = context.getSharedPreferences("ServerCertPrefs", 0).edit();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ftps_tls_key_store_");
        stringBuilder.append(string);
        context.putString(stringBuilder.toString(), string2).apply();
    }

    public static void i(Context context, int n8) {
        context.getSharedPreferences("ServerPrefs", 0).edit().putInt("media_port", n8).commit();
    }

    public static void j(Context context, boolean bl) {
        context.getSharedPreferences("ServerPrefs", 0).edit().putBoolean("show_hidden_file", bl).apply();
    }

    public static boolean k(Context context) {
        return context.getSharedPreferences("ServerPrefs", 0).getBoolean("show_hidden_file", false);
    }
}

