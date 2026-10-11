/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import android.util.Base64;
import ax.W5.C;
import ax.W5.K;
import ax.W5.O;
import ax.W5.g2;
import ax.W5.l2;
import ax.W5.m2;

public final class n2
implements l2 {
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
        K k8 = new K(C.a("com.google.android.gms.auth_account")).b().a();
        a = k8.c("getTokenRefactor__account_data_service_sample_percentage", 0.0);
        b = k8.e("getTokenRefactor__account_data_service_tokenAPI_usable", true);
        c = k8.d("getTokenRefactor__account_manager_timeout_seconds", 20L);
        d = k8.d("getTokenRefactor__android_id_shift", 0L);
        try {
            e = k8.f("getTokenRefactor__blocked_packages", g2.r(Base64.decode((String)"ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", (int)3)), m2.a);
            f = k8.e("getTokenRefactor__chimera_get_token_evolved", true);
            g = k8.d("getTokenRefactor__clear_token_timeout_seconds", 20L);
            h = k8.d("getTokenRefactor__default_task_timeout_seconds", 20L);
            i = k8.e("getTokenRefactor__gaul_accounts_api_evolved", false);
            j = k8.e("getTokenRefactor__gaul_token_api_evolved", false);
            k = k8.d("getTokenRefactor__get_token_timeout_seconds", 120L);
            l = k8.e("getTokenRefactor__gms_account_authenticator_evolved", true);
            m = k8.c("getTokenRefactor__gms_account_authenticator_sample_percentage", 0.0);
            return;
        }
        catch (Exception exception) {
            throw new AssertionError((Object)exception);
        }
    }

    @Override
    public final g2 a() {
        return (g2)e.b();
    }

    @Override
    public final boolean c() {
        return (Boolean)j.b();
    }
}

