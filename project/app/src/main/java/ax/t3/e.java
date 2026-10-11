/*
 * Decompiled with CFR 0.152.
 */
package ax.t3;

import android.content.Context;
import android.content.SharedPreferences;
import ax.Q2.f;
import ax.u3.b;
import java.util.HashSet;

public class e {
    public static void a(Context context, f object, int n8, boolean bl, String string) {
        object = e.g(context, (f)((Object)object), n8, bl);
        context = object.edit();
        for (String string2 : new HashSet(object.getAll().keySet())) {
            if (string2 == null) continue;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(":");
            if (!string2.contains(stringBuilder.toString())) continue;
            context.remove(string2);
        }
        context.apply();
    }

    public static int b(f f8) {
        switch (a.a[f8.ordinal()]) {
            default: {
                return 0;
            }
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
        }
        return 1;
    }

    public static boolean c(Context context, f object, int n8, String string, boolean bl) {
        if ((context = e.g(context, object, n8, bl)).contains((String)(object = e.e("hide_grid_filename", string, bl)))) {
            return context.getBoolean((String)object, false);
        }
        return context.getBoolean("hide_grid_filename", false);
    }

    public static int d(Context context, f object, int n8, String string, boolean bl) {
        if ((context = e.g(context, object, n8, bl)).contains((String)(object = e.e("icon_size", string, bl)))) {
            return context.getInt((String)object, 2);
        }
        return context.getInt("icon_size", 2);
    }

    public static String e(String string, String string2, boolean bl) {
        CharSequence charSequence = string;
        if (string2 != null) {
            if (bl) {
                charSequence = string;
            } else {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(string);
                ((StringBuilder)charSequence).append(":");
                ((StringBuilder)charSequence).append(string2);
                charSequence = ((StringBuilder)charSequence).toString();
            }
        }
        return charSequence;
    }

    public static String f(f f8, int n8, boolean bl) {
        if (!bl) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("settings_");
            stringBuilder.append(f8.I());
            stringBuilder.append("_");
            stringBuilder.append(n8);
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("settings_");
        stringBuilder.append(f8.I());
        stringBuilder.append("_");
        stringBuilder.append(n8);
        stringBuilder.append("_analysis");
        return stringBuilder.toString();
    }

    private static SharedPreferences g(Context context, f f8, int n8, boolean bl) {
        return context.getSharedPreferences(e.f(f8, f.F(f8, n8), bl), 0);
    }

    public static boolean h(Context context, f object, int n8, String string, boolean bl) {
        if ((context = e.g(context, object, n8, bl)).contains((String)(object = e.e("show_hidden", string, bl)))) {
            return context.getBoolean((String)object, false);
        }
        return context.getBoolean("show_hidden", false);
    }

    public static boolean i(Context context, f object, int n8, String string, boolean bl) {
        if (!f.C0(object)) {
            return true;
        }
        if ((context = e.g(context, object, n8, bl)).contains((String)(object = e.e("show_thumbnails", string, bl)))) {
            return context.getBoolean((String)object, true);
        }
        return context.getBoolean("show_thumbnails", true);
    }

    public static String j(Context context, f object, int n8, String string, boolean bl) {
        String string2 = bl ? "SizeDown" : object.s();
        if ((context = e.g(context, object, n8, bl)).contains((String)(object = e.e("sort_type", string, bl)))) {
            return context.getString((String)object, string2);
        }
        return context.getString("sort_type", string2);
    }

    public static int k(Context context, f object, int n8, String string, boolean bl) {
        int n9;
        int n10 = a.a[object.ordinal()];
        int n11 = n9 = 2;
        if (n10 != 1) {
            n11 = n9;
            if (n10 != 2) {
                n11 = 0;
            }
        }
        if ((context = e.g(context, object, n8, bl)).contains((String)(object = e.e("view_type", string, bl)))) {
            return context.getInt((String)object, n11);
        }
        return context.getInt("view_type", n11);
    }

    public static void l(Context context, f f8, int n8, String string, boolean bl, boolean bl2) {
        context = e.g(context, f8, n8, bl).edit();
        context.putBoolean(e.e("hide_grid_filename", string, bl), bl2);
        context.apply();
    }

    public static void m(Context context, f f8, int n8, String string, boolean bl, int n9) {
        context = e.g(context, f8, n8, bl).edit();
        context.putInt(e.e("icon_size", string, bl), n9);
        context.apply();
    }

    public static void n(Context context, f f8, int n8, String string, boolean bl, boolean bl2) {
        context = e.g(context, f8, n8, bl).edit();
        context.putBoolean(e.e("show_hidden", string, bl), bl2);
        context.apply();
    }

    public static void o(Context object, f f8, int n8, String string, boolean bl, boolean bl2) {
        if (!f.C0(f8)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("set thumbnail to ");
            ((StringBuilder)object).append((Object)f8);
            b.g(((StringBuilder)object).toString());
            return;
        }
        object = e.g((Context)object, f8, n8, bl).edit();
        object.putBoolean(e.e("show_thumbnails", string, bl), bl2);
        object.apply();
    }

    public static void p(Context context, f f8, int n8, String string, boolean bl, String string2) {
        context = e.g(context, f8, n8, bl).edit();
        context.putString(e.e("sort_type", string, bl), string2);
        context.apply();
    }

    public static void q(Context context, f f8, int n8, String string, boolean bl, int n9) {
        context = e.g(context, f8, n8, bl).edit();
        context.putInt(e.e("view_type", string, bl), n9);
        context.apply();
    }
}

