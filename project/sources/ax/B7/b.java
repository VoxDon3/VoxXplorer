package ax.B7;

import android.os.Bundle;
import ax.A7.a;
import ax.M5.C0821p;
import ax.f6.C2066n;
import ax.f6.C2069q;
import ax.f6.C2071s;
import ax.f6.C2078z;
import ax.r7.AbstractC2964C;
import ax.r7.AbstractC2991z;

/* loaded from: classes3.dex */
public final class b {
    private static final AbstractC2964C<String> a = AbstractC2964C.D("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
    private static final AbstractC2991z<String> b = AbstractC2991z.E("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
    private static final AbstractC2991z<String> c = AbstractC2991z.C("auto", "app", "am");
    private static final AbstractC2991z<String> d = AbstractC2991z.B("_r", "_dbg");
    private static final AbstractC2991z<String> e = new AbstractC2991z.a().i(C2071s.a).i(C2071s.b).k();
    private static final AbstractC2991z<String> f = AbstractC2991z.B("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static Bundle a(a.c cVar) {
        Bundle bundle = new Bundle();
        String str = cVar.a;
        if (str != null) {
            bundle.putString("origin", str);
        }
        String str2 = cVar.b;
        if (str2 != null) {
            bundle.putString("name", str2);
        }
        Object obj = cVar.c;
        if (obj != null) {
            C2066n.b(bundle, obj);
        }
        String str3 = cVar.d;
        if (str3 != null) {
            bundle.putString("trigger_event_name", str3);
        }
        bundle.putLong("trigger_timeout", cVar.e);
        String str4 = cVar.f;
        if (str4 != null) {
            bundle.putString("timed_out_event_name", str4);
        }
        Bundle bundle2 = cVar.g;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str5 = cVar.h;
        if (str5 != null) {
            bundle.putString("triggered_event_name", str5);
        }
        Bundle bundle3 = cVar.i;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", cVar.j);
        String str6 = cVar.k;
        if (str6 != null) {
            bundle.putString("expired_event_name", str6);
        }
        Bundle bundle4 = cVar.l;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", cVar.m);
        bundle.putBoolean("active", cVar.n);
        bundle.putLong("triggered_timestamp", cVar.o);
        return bundle;
    }

    public static a.c b(Bundle bundle) {
        C0821p.l(bundle);
        a.c cVar = new a.c();
        cVar.a = (String) C0821p.l((String) C2066n.a(bundle, "origin", String.class, null));
        cVar.b = (String) C0821p.l((String) C2066n.a(bundle, "name", String.class, null));
        cVar.c = C2066n.a(bundle, "value", Object.class, null);
        cVar.d = (String) C2066n.a(bundle, "trigger_event_name", String.class, null);
        cVar.e = ((Long) C2066n.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
        cVar.f = (String) C2066n.a(bundle, "timed_out_event_name", String.class, null);
        cVar.g = (Bundle) C2066n.a(bundle, "timed_out_event_params", Bundle.class, null);
        cVar.h = (String) C2066n.a(bundle, "triggered_event_name", String.class, null);
        cVar.i = (Bundle) C2066n.a(bundle, "triggered_event_params", Bundle.class, null);
        cVar.j = ((Long) C2066n.a(bundle, "time_to_live", Long.class, 0L)).longValue();
        cVar.k = (String) C2066n.a(bundle, "expired_event_name", String.class, null);
        cVar.l = (Bundle) C2066n.a(bundle, "expired_event_params", Bundle.class, null);
        cVar.n = ((Boolean) C2066n.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
        cVar.m = ((Long) C2066n.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
        cVar.o = ((Long) C2066n.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        return cVar;
    }

    public static String c(String str) {
        String a2 = C2069q.a(str);
        return a2 != null ? a2 : str;
    }

    public static void d(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static boolean e(String str, Bundle bundle) {
        if (b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        AbstractC2991z<String> abstractC2991z = d;
        int size = abstractC2991z.size();
        int i = 0;
        while (i < size) {
            String str2 = abstractC2991z.get(i);
            i++;
            if (bundle.containsKey(str2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (e.contains(str2)) {
            return false;
        }
        AbstractC2991z<String> abstractC2991z = f;
        int size = abstractC2991z.size();
        int i = 0;
        while (i < size) {
            String str3 = abstractC2991z.get(i);
            i++;
            if (str2.matches(str3)) {
                return false;
            }
        }
        return true;
    }

    public static boolean g(a.c cVar) {
        String str;
        if (cVar == null || (str = cVar.a) == null || str.isEmpty()) {
            return false;
        }
        Object obj = cVar.c;
        if ((obj != null && C2078z.a(obj) == null) || !j(str) || !f(str, cVar.b)) {
            return false;
        }
        String str2 = cVar.k;
        if (str2 != null && (!e(str2, cVar.l) || !h(str, cVar.k, cVar.l))) {
            return false;
        }
        String str3 = cVar.h;
        if (str3 != null && (!e(str3, cVar.i) || !h(str, cVar.h, cVar.i))) {
            return false;
        }
        String str4 = cVar.f;
        if (str4 != null) {
            return e(str4, cVar.g) && h(str, cVar.f, cVar.g);
        }
        return true;
    }

    public static boolean h(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!j(str) || bundle == null) {
            return false;
        }
        AbstractC2991z<String> abstractC2991z = d;
        int size = abstractC2991z.size();
        int i = 0;
        while (i < size) {
            String str3 = abstractC2991z.get(i);
            i++;
            if (bundle.containsKey(str3)) {
                return false;
            }
        }
        str.getClass();
        switch (str) {
            case "fcm":
                bundle.putString("_cis", "fcm_integration");
                return true;
            case "fdl":
                bundle.putString("_cis", "fdl_integration");
                return true;
            case "fiam":
                bundle.putString("_cis", "fiam_integration");
                return true;
            default:
                return false;
        }
    }

    public static boolean i(String str) {
        return !a.contains(str);
    }

    public static boolean j(String str) {
        return !c.contains(str);
    }
}
