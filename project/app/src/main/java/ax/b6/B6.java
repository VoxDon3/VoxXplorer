/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.D6;
import ax.b6.V2;
import ax.b6.Y2;
import ax.b6.h3;

public final class B6
implements D6 {
    private static final Y2<Boolean> a;
    private static final Y2<Boolean> b;
    private static final Y2<Boolean> c;

    static {
        h3 h32 = new h3(V2.a("com.google.android.gms.measurement")).f().e();
        h32.d("measurement.client.ad_id_consent_fix", true);
        h32.d("measurement.service.consent.aiid_reset_fix", false);
        h32.d("measurement.service.consent.aiid_reset_fix2", true);
        a = h32.d("measurement.service.consent.app_start_fix", true);
        b = h32.d("measurement.service.consent.params_on_fx", true);
        c = h32.d("measurement.service.consent.pfo_on_fx", true);
    }

    @Override
    public final boolean a() {
        return a.f();
    }

    @Override
    public final boolean b() {
        return b.f();
    }

    @Override
    public final boolean c() {
        return c.f();
    }
}

