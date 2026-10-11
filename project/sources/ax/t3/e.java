package ax.t3;

import android.content.Context;
import android.content.SharedPreferences;
import ax.u3.C3184b;
import java.util.HashSet;

/* loaded from: classes.dex */
public class e {

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ax.Q2.f.values().length];
            a = iArr;
            try {
                iArr[ax.Q2.f.z0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ax.Q2.f.B0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ax.Q2.f.o1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ax.Q2.f.j1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ax.Q2.f.k1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ax.Q2.f.F0.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ax.Q2.f.n1.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ax.Q2.f.m1.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static void a(Context context, ax.Q2.f fVar, int i, boolean z, String str) {
        SharedPreferences g = g(context, fVar, i, z);
        SharedPreferences.Editor edit = g.edit();
        for (String str2 : new HashSet(g.getAll().keySet())) {
            if (str2 != null) {
                if (str2.contains(str + ":")) {
                    edit.remove(str2);
                }
            }
        }
        edit.apply();
    }

    public static int b(ax.Q2.f fVar) {
        switch (a.a[fVar.ordinal()]) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return 1;
            default:
                return 0;
        }
    }

    public static boolean c(Context context, ax.Q2.f fVar, int i, String str, boolean z) {
        SharedPreferences g = g(context, fVar, i, z);
        String e = e("hide_grid_filename", str, z);
        return g.contains(e) ? g.getBoolean(e, false) : g.getBoolean("hide_grid_filename", false);
    }

    public static int d(Context context, ax.Q2.f fVar, int i, String str, boolean z) {
        SharedPreferences g = g(context, fVar, i, z);
        String e = e("icon_size", str, z);
        return g.contains(e) ? g.getInt(e, 2) : g.getInt("icon_size", 2);
    }

    public static String e(String str, String str2, boolean z) {
        if (str2 == null || z) {
            return str;
        }
        return str + ":" + str2;
    }

    public static String f(ax.Q2.f fVar, int i, boolean z) {
        if (!z) {
            return "settings_" + fVar.I() + "_" + i;
        }
        return "settings_" + fVar.I() + "_" + i + "_analysis";
    }

    private static SharedPreferences g(Context context, ax.Q2.f fVar, int i, boolean z) {
        return context.getSharedPreferences(f(fVar, ax.Q2.f.F(fVar, i), z), 0);
    }

    public static boolean h(Context context, ax.Q2.f fVar, int i, String str, boolean z) {
        SharedPreferences g = g(context, fVar, i, z);
        String e = e("show_hidden", str, z);
        return g.contains(e) ? g.getBoolean(e, false) : g.getBoolean("show_hidden", false);
    }

    public static boolean i(Context context, ax.Q2.f fVar, int i, String str, boolean z) {
        if (!ax.Q2.f.C0(fVar)) {
            return true;
        }
        SharedPreferences g = g(context, fVar, i, z);
        String e = e("show_thumbnails", str, z);
        return g.contains(e) ? g.getBoolean(e, true) : g.getBoolean("show_thumbnails", true);
    }

    public static String j(Context context, ax.Q2.f fVar, int i, String str, boolean z) {
        String s = z ? "SizeDown" : fVar.s();
        SharedPreferences g = g(context, fVar, i, z);
        String e = e("sort_type", str, z);
        return g.contains(e) ? g.getString(e, s) : g.getString("sort_type", s);
    }

    public static int k(Context context, ax.Q2.f fVar, int i, String str, boolean z) {
        int i2 = a.a[fVar.ordinal()];
        int i3 = 2;
        if (i2 != 1 && i2 != 2) {
            i3 = 0;
        }
        SharedPreferences g = g(context, fVar, i, z);
        String e = e("view_type", str, z);
        return g.contains(e) ? g.getInt(e, i3) : g.getInt("view_type", i3);
    }

    public static void l(Context context, ax.Q2.f fVar, int i, String str, boolean z, boolean z2) {
        SharedPreferences.Editor edit = g(context, fVar, i, z).edit();
        edit.putBoolean(e("hide_grid_filename", str, z), z2);
        edit.apply();
    }

    public static void m(Context context, ax.Q2.f fVar, int i, String str, boolean z, int i2) {
        SharedPreferences.Editor edit = g(context, fVar, i, z).edit();
        edit.putInt(e("icon_size", str, z), i2);
        edit.apply();
    }

    public static void n(Context context, ax.Q2.f fVar, int i, String str, boolean z, boolean z2) {
        SharedPreferences.Editor edit = g(context, fVar, i, z).edit();
        edit.putBoolean(e("show_hidden", str, z), z2);
        edit.apply();
    }

    public static void o(Context context, ax.Q2.f fVar, int i, String str, boolean z, boolean z2) {
        if (ax.Q2.f.C0(fVar)) {
            SharedPreferences.Editor edit = g(context, fVar, i, z).edit();
            edit.putBoolean(e("show_thumbnails", str, z), z2);
            edit.apply();
        } else {
            C3184b.g("set thumbnail to " + fVar);
        }
    }

    public static void p(Context context, ax.Q2.f fVar, int i, String str, boolean z, String str2) {
        SharedPreferences.Editor edit = g(context, fVar, i, z).edit();
        edit.putString(e("sort_type", str, z), str2);
        edit.apply();
    }

    public static void q(Context context, ax.Q2.f fVar, int i, String str, boolean z, int i2) {
        SharedPreferences.Editor edit = g(context, fVar, i, z).edit();
        edit.putInt(e("view_type", str, z), i2);
        edit.apply();
    }
}
