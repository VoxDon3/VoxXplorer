package ax.W5;

import android.util.Base64;

/* loaded from: classes3.dex */
public final class n2 implements l2 {
    public static final O a;
    public static final O b;
    public static final O c;
    public static final O d;
    public static final O e;
    public static final O f;
    public static final O g;
    public static final O h;
    public static final O i;
    public static final O j;
    public static final O k;
    public static final O l;
    public static final O m;

    static {
        K a2 = new K(C.a("com.google.android.gms.auth_account")).b().a();
        a = a2.c("getTokenRefactor__account_data_service_sample_percentage", 0.0d);
        b = a2.e("getTokenRefactor__account_data_service_tokenAPI_usable", true);
        c = a2.d("getTokenRefactor__account_manager_timeout_seconds", 20L);
        d = a2.d("getTokenRefactor__android_id_shift", 0L);
        try {
            e = a2.f("getTokenRefactor__blocked_packages", g2.r(Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3)), m2.a);
            f = a2.e("getTokenRefactor__chimera_get_token_evolved", true);
            g = a2.d("getTokenRefactor__clear_token_timeout_seconds", 20L);
            h = a2.d("getTokenRefactor__default_task_timeout_seconds", 20L);
            i = a2.e("getTokenRefactor__gaul_accounts_api_evolved", false);
            j = a2.e("getTokenRefactor__gaul_token_api_evolved", false);
            k = a2.d("getTokenRefactor__get_token_timeout_seconds", 120L);
            l = a2.e("getTokenRefactor__gms_account_authenticator_evolved", true);
            m = a2.c("getTokenRefactor__gms_account_authenticator_sample_percentage", 0.0d);
        } catch (Exception e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // ax.W5.l2
    public final g2 a() {
        return (g2) e.b();
    }

    @Override // ax.W5.l2
    public final boolean c() {
        return ((Boolean) j.b()).booleanValue();
    }
}
