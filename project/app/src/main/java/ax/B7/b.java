/*
 * Decompiled with CFR 0.152.
 */
package ax.B7;

import android.os.Bundle;
import ax.A7.a;
import ax.M5.p;
import ax.f6.n;
import ax.f6.q;
import ax.f6.s;
import ax.f6.z;
import ax.r7.C;
import ax.r7.z;
import java.util.AbstractCollection;

public final class b {
    private static final C<String> a = C.D("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
    private static final ax.r7.z<String> b = ax.r7.z.E("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
    private static final ax.r7.z<String> c = ax.r7.z.C("auto", "app", "am");
    private static final ax.r7.z<String> d = ax.r7.z.B("_r", "_dbg");
    private static final ax.r7.z<String> e = new z.a<String>().i(s.a).i((String[])s.b).k();
    private static final ax.r7.z<String> f = ax.r7.z.B("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static Bundle a(a.c c8) {
        Bundle bundle = new Bundle();
        Object object = c8.a;
        if (object != null) {
            bundle.putString("origin", (String)object);
        }
        if ((object = c8.b) != null) {
            bundle.putString("name", (String)object);
        }
        if ((object = c8.c) != null) {
            n.b(bundle, object);
        }
        if ((object = c8.d) != null) {
            bundle.putString("trigger_event_name", (String)object);
        }
        bundle.putLong("trigger_timeout", c8.e);
        object = c8.f;
        if (object != null) {
            bundle.putString("timed_out_event_name", (String)object);
        }
        if ((object = c8.g) != null) {
            bundle.putBundle("timed_out_event_params", (Bundle)object);
        }
        if ((object = c8.h) != null) {
            bundle.putString("triggered_event_name", (String)object);
        }
        if ((object = c8.i) != null) {
            bundle.putBundle("triggered_event_params", (Bundle)object);
        }
        bundle.putLong("time_to_live", c8.j);
        object = c8.k;
        if (object != null) {
            bundle.putString("expired_event_name", (String)object);
        }
        if ((object = c8.l) != null) {
            bundle.putBundle("expired_event_params", (Bundle)object);
        }
        bundle.putLong("creation_timestamp", c8.m);
        bundle.putBoolean("active", c8.n);
        bundle.putLong("triggered_timestamp", c8.o);
        return bundle;
    }

    public static a.c b(Bundle bundle) {
        p.l(bundle);
        a.c c8 = new a.c();
        c8.a = p.l(n.a(bundle, "origin", String.class, null));
        c8.b = p.l(n.a(bundle, "name", String.class, null));
        c8.c = n.a(bundle, "value", Object.class, null);
        c8.d = n.a(bundle, "trigger_event_name", String.class, null);
        Long l8 = 0L;
        c8.e = n.a(bundle, "trigger_timeout", Long.class, l8);
        c8.f = n.a(bundle, "timed_out_event_name", String.class, null);
        c8.g = n.a(bundle, "timed_out_event_params", Bundle.class, null);
        c8.h = n.a(bundle, "triggered_event_name", String.class, null);
        c8.i = n.a(bundle, "triggered_event_params", Bundle.class, null);
        c8.j = n.a(bundle, "time_to_live", Long.class, l8);
        c8.k = n.a(bundle, "expired_event_name", String.class, null);
        c8.l = n.a(bundle, "expired_event_params", Bundle.class, null);
        c8.n = n.a(bundle, "active", Boolean.class, Boolean.FALSE);
        c8.m = n.a(bundle, "creation_timestamp", Long.class, l8);
        c8.o = n.a(bundle, "triggered_timestamp", Long.class, l8);
        return c8;
    }

    public static String c(String string) {
        String string2 = q.a(string);
        if (string2 != null) {
            return string2;
        }
        return string;
    }

    public static void d(String string, String string2, Bundle bundle) {
        if ("clx".equals(string) && "_ae".equals(string2)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static boolean e(String object, Bundle bundle) {
        if (b.contains(object)) {
            return false;
        }
        if (bundle != null) {
            object = d;
            int n8 = ((AbstractCollection)object).size();
            for (int i8 = 0; i8 < n8; ++i8) {
                Object e8 = object.get(i8);
                if (!bundle.containsKey((String)e8)) continue;
                return false;
            }
        }
        return true;
    }

    public static boolean f(String string, String string2) {
        if (!"_ce1".equals(string2) && !"_ce2".equals(string2)) {
            if ("_ln".equals(string2)) {
                return string.equals("fcm") || string.equals("fiam");
                {
                }
            }
            if (e.contains(string2)) {
                return false;
            }
            ax.r7.z<String> z8 = f;
            int n8 = z8.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                string = z8.get(i8);
                if (!string2.matches(string)) continue;
                return false;
            }
            return true;
        }
        return string.equals("fcm") || string.equals("frc");
        {
        }
    }

    public static boolean g(a.c c8) {
        if (c8 == null) {
            return false;
        }
        String string = c8.a;
        if (string != null && !string.isEmpty()) {
            Object object = c8.c;
            if (object != null && z.a(object) == null) {
                return false;
            }
            if (!ax.B7.b.j(string)) {
                return false;
            }
            if (!ax.B7.b.f(string, c8.b)) {
                return false;
            }
            object = c8.k;
            if (object != null) {
                if (!ax.B7.b.e((String)object, c8.l)) {
                    return false;
                }
                if (!ax.B7.b.h(string, c8.k, c8.l)) {
                    return false;
                }
            }
            if ((object = c8.h) != null) {
                if (!ax.B7.b.e((String)object, c8.i)) {
                    return false;
                }
                if (!ax.B7.b.h(string, c8.h, c8.i)) {
                    return false;
                }
            }
            if ((object = c8.f) != null) {
                if (!ax.B7.b.e((String)object, c8.g)) {
                    return false;
                }
                if (!ax.B7.b.h(string, c8.f, c8.g)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean h(String string, String string2, Bundle bundle) {
        int n8;
        if (!"_cmp".equals(string2)) {
            return true;
        }
        if (!ax.B7.b.j(string)) {
            return false;
        }
        if (bundle == null) {
            return false;
        }
        ax.r7.z<String> z8 = d;
        int n9 = z8.size();
        for (n8 = 0; n8 < n9; ++n8) {
            string2 = z8.get(n8);
            if (!bundle.containsKey(string2)) continue;
            return false;
        }
        string.getClass();
        n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 0x2FF42F: {
                if (!string.equals("fiam")) break;
                n8 = 2;
                break;
            }
            case 101230: {
                if (!string.equals("fdl")) break;
                n8 = 1;
                break;
            }
            case 101200: {
                if (!string.equals("fcm")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return false;
            }
            case 2: {
                bundle.putString("_cis", "fiam_integration");
                return true;
            }
            case 1: {
                bundle.putString("_cis", "fdl_integration");
                return true;
            }
            case 0: 
        }
        bundle.putString("_cis", "fcm_integration");
        return true;
    }

    public static boolean i(String string) {
        return !a.contains(string);
    }

    public static boolean j(String string) {
        return !c.contains(string);
    }
}

