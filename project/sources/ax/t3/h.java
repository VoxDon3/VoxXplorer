package ax.t3;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import ax.X2.Q;
import ax.c3.C1809B;
import ax.c3.C1832u;
import ax.c3.C1833v;
import ax.u3.C3180B;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class h {
    public static void a(Context context, ComponentName componentName, int i) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("ResolverFrequencyPrefs", 0);
        int i2 = sharedPreferences.getInt(componentName.flattenToString(), 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(componentName.flattenToString(), i2 + i);
        edit.apply();
    }

    public static Map<String, List<ax.Z2.c>> b(Context context) {
        SharedPreferences h = h(context);
        HashMap hashMap = new HashMap();
        Map<String, ?> all = h.getAll();
        if (all != null) {
            for (String str : all.keySet()) {
                Set<String> stringSet = h.getStringSet(str, null);
                if (stringSet != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<String> it = stringSet.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList.add(ax.Z2.c.c(it.next()));
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    hashMap.put(str, arrayList);
                }
            }
        }
        return hashMap;
    }

    public static Map<String, ?> c(Context context) {
        return context.getSharedPreferences("ResolverFrequencyPrefs", 0).getAll();
    }

    public static String d(String str, String str2) {
        if (!C1833v.j(str)) {
            return str;
        }
        String f = C1833v.f(str2);
        return f != null ? f : C1809B.o(str2);
    }

    public static ComponentName e(Context context, String str, String str2, String str3) {
        String string = context.getSharedPreferences("ResolverLastSelectedPrefs", 0).getString(f(str, str2, str3), null);
        if (string == null) {
            return null;
        }
        return ComponentName.unflattenFromString(string);
    }

    private static String f(String str, String str2, String str3) {
        return str + ":" + str2 + ":" + str3;
    }

    public static List<ax.Z2.c> g(Context context, String str) {
        Set<String> stringSet = h(context).getStringSet(str, null);
        if (stringSet == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = stringSet.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(ax.Z2.c.c(it.next()));
            } catch (IllegalArgumentException unused) {
            }
        }
        return arrayList;
    }

    private static SharedPreferences h(Context context) {
        return context.getSharedPreferences("ResolverDefaultPrefs", 0);
    }

    public static boolean i(Context context) {
        if (!Q.N()) {
            return false;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("ResolverGeneralPrefs", 0);
        if (C1832u.Q(context)) {
            return sharedPreferences.getBoolean("use_compatibility_mode", true);
        }
        if (sharedPreferences.contains("use_compatibility_mode")) {
            sharedPreferences.edit().remove("use_compatibility_mode").apply();
        }
        return false;
    }

    public static void j(Context context, String str, String str2, String str3, ComponentName componentName) {
        context.getSharedPreferences("ResolverLastSelectedPrefs", 0).edit().putString(f(str, str2, str3), componentName.flattenToString()).apply();
    }

    public static void k(Context context, String str, ax.Z2.c cVar, boolean z) {
        SharedPreferences h = h(context);
        Set<String> stringSet = h.getStringSet(str, null);
        ax.B.b bVar = (stringSet == null || z) ? new ax.B.b() : new ax.B.b(stringSet);
        Iterator<String> it = bVar.iterator();
        while (it.hasNext()) {
            try {
                ax.Z2.c c = ax.Z2.c.c(it.next());
                if (C3180B.j(c.b, cVar.b) && C3180B.j(c.a, cVar.a)) {
                    it.remove();
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        bVar.add(cVar.b());
        SharedPreferences.Editor edit = h.edit();
        edit.putStringSet(str, bVar);
        edit.apply();
    }

    public static void l(Context context, String str) {
        h(context).edit().remove(str).apply();
    }

    public static void m(Context context, String str, ComponentName componentName) {
        SharedPreferences h = h(context);
        Set<String> stringSet = h.getStringSet(str, null);
        ax.B.b bVar = stringSet == null ? new ax.B.b() : new ax.B.b(stringSet);
        Iterator<String> it = bVar.iterator();
        while (it.hasNext()) {
            try {
                if (C3180B.j(ax.Z2.c.c(it.next()).e, componentName)) {
                    it.remove();
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        if (bVar.size() <= 0) {
            h.edit().remove(str).apply();
            return;
        }
        SharedPreferences.Editor edit = h.edit();
        edit.putStringSet(str, bVar);
        edit.apply();
    }

    public static void n(Context context, boolean z) {
        context.getSharedPreferences("ResolverGeneralPrefs", 0).edit().putBoolean("use_compatibility_mode", z).apply();
    }
}
