/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.V2;
import ax.b6.Y2;
import ax.b6.h3;
import ax.b6.k6;

public final class j6
implements k6 {
    private static final Y2<Long> a;

    static {
        h3 h32 = new h3(V2.a("com.google.android.gms.measurement")).f().e();
        h32.d("measurement.client.consent_state_v1", true);
        h32.d("measurement.client.3p_consent_state_v1", true);
        h32.d("measurement.service.consent_state_v1_W36", true);
        a = h32.b("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override
    public final long a() {
        return a.f();
    }
}

