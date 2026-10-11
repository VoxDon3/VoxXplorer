/*
 * Decompiled with CFR 0.152.
 */
package ax.t3;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import ax.B.b;
import ax.X2.Q;
import ax.Z2.c;
import ax.c3.u;
import ax.c3.v;
import ax.u3.B;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class h {
    public static void a(Context context, ComponentName componentName, int n8) {
        context = context.getSharedPreferences("ResolverFrequencyPrefs", 0);
        int n9 = context.getInt(componentName.flattenToString(), 0);
        context = context.edit();
        context.putInt(componentName.flattenToString(), n9 + n8);
        context.apply();
    }

    public static Map<String, List<c>> b(Context object) {
        SharedPreferences sharedPreferences = h.h((Context)object);
        object = new HashMap();
        Object object2 = sharedPreferences.getAll();
        if (object2 != null) {
            for (String string : object2.keySet()) {
                Object object3 = sharedPreferences.getStringSet(string, null);
                if (object3 == null) continue;
                object2 = new ArrayList();
                object3 = object3.iterator();
                while (object3.hasNext()) {
                    String string2 = (String)object3.next();
                    try {
                        object2.add(c.c(string2));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {}
                }
                object.put(string, object2);
            }
        }
        return object;
    }

    public static Map<String, ?> c(Context context) {
        return context.getSharedPreferences("ResolverFrequencyPrefs", 0).getAll();
    }

    public static String d(String string, String string2) {
        String string3 = string;
        if (v.j(string)) {
            string = v.f(string2);
            if (string != null) {
                return string;
            }
            string3 = ax.c3.B.o(string2);
        }
        return string3;
    }

    public static ComponentName e(Context object, String string, String string2, String string3) {
        if ((object = object.getSharedPreferences("ResolverLastSelectedPrefs", 0).getString(h.f(string, string2, string3), null)) == null) {
            return null;
        }
        return ComponentName.unflattenFromString((String)object);
    }

    private static String f(String string, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(":");
        stringBuilder.append(string2);
        stringBuilder.append(":");
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    public static List<c> g(Context object, String object2) {
        object2 = h.h((Context)object).getStringSet((String)object2, null);
        if (object2 == null) {
            return null;
        }
        object = new ArrayList();
        object2 = object2.iterator();
        while (object2.hasNext()) {
            String string = (String)object2.next();
            try {
                object.add(c.c(string));
            }
            catch (IllegalArgumentException illegalArgumentException) {}
        }
        return object;
    }

    private static SharedPreferences h(Context context) {
        return context.getSharedPreferences("ResolverDefaultPrefs", 0);
    }

    public static boolean i(Context context) {
        if (!Q.N()) {
            return false;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("ResolverGeneralPrefs", 0);
        if (!u.Q(context)) {
            if (sharedPreferences.contains("use_compatibility_mode")) {
                sharedPreferences.edit().remove("use_compatibility_mode").apply();
            }
            return false;
        }
        return sharedPreferences.getBoolean("use_compatibility_mode", true);
    }

    public static void j(Context context, String string, String string2, String string3, ComponentName componentName) {
        context.getSharedPreferences("ResolverLastSelectedPrefs", 0).edit().putString(h.f(string, string2, string3), componentName.flattenToString()).apply();
    }

    public static void k(Context object, String string, c c8, boolean bl) {
        SharedPreferences sharedPreferences = h.h((Context)object);
        object = (object = sharedPreferences.getStringSet(string, null)) != null && !bl ? new b(object) : new b();
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            Object object2 = (String)iterator.next();
            try {
                object2 = c.c((String)object2);
                if (!B.j(((c)object2).b, c8.b) || !B.j((Object)((c)object2).a, (Object)c8.a)) continue;
                iterator.remove();
            }
            catch (IllegalArgumentException illegalArgumentException) {}
        }
        object.add(c8.b());
        c8 = sharedPreferences.edit();
        c8.putStringSet(string, (Set)object);
        c8.apply();
    }

    public static void l(Context context, String string) {
        h.h(context).edit().remove(string).apply();
    }

    public static void m(Context object, String string, ComponentName componentName) {
        SharedPreferences sharedPreferences = h.h((Context)object);
        object = (object = sharedPreferences.getStringSet(string, null)) == null ? new b() : new b(object);
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            String string2 = (String)iterator.next();
            try {
                if (!B.j(c.c((String)string2).e, componentName)) continue;
                iterator.remove();
            }
            catch (IllegalArgumentException illegalArgumentException) {}
        }
        if (object.size() > 0) {
            componentName = sharedPreferences.edit();
            componentName.putStringSet(string, (Set)object);
            componentName.apply();
        } else {
            sharedPreferences.edit().remove(string).apply();
        }
    }

    public static void n(Context context, boolean bl) {
        context.getSharedPreferences("ResolverGeneralPrefs", 0).edit().putBoolean("use_compatibility_mode", bl).apply();
    }
}

