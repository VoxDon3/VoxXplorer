/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.C;
import ax.W5.K;
import ax.W5.O;
import ax.W5.i2;

public final class j2
implements i2 {
    public static final O a;
    public static final O b;
    public static final O c;
    public static final O d;
    public static final O e;

    static {
        K k8 = new K(C.a("com.google.android.gms.auth_account")).b().a();
        a = k8.e("Aang__create_auth_exception_with_pending_intent", false);
        b = k8.e("Aang__enable_add_account_restrictions", false);
        c = k8.e("Aang__log_missing_gaia_id_event", true);
        d = k8.e("Aang__log_obfuscated_gaiaid_status", true);
        e = k8.e("Aang__switch_clear_token_to_aang", false);
    }

    @Override
    public final boolean a() {
        return (Boolean)a.b();
    }
}

