/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.V2;
import ax.b6.Y2;
import ax.b6.h3;
import ax.b6.w6;

public final class v6
implements w6 {
    private static final Y2<Boolean> a;
    private static final Y2<Boolean> b;

    static {
        h3 h32 = new h3(V2.a("com.google.android.gms.measurement")).f().e();
        h32.d("measurement.dma_consent.client", true);
        h32.d("measurement.dma_consent.client_bow_check2", true);
        h32.d("measurement.dma_consent.separate_service_calls_fix", true);
        h32.d("measurement.dma_consent.service", true);
        a = h32.d("measurement.dma_consent.service_database_update_fix", true);
        h32.d("measurement.dma_consent.service_dcu_event", true);
        b = h32.d("measurement.dma_consent.service_dcu_event2", true);
        h32.d("measurement.dma_consent.service_npa_remote_default", true);
        h32.d("measurement.dma_consent.service_split_batch_on_consent", true);
        h32.d("measurement.dma_consent.set_consent_inline_on_worker", true);
    }

    @Override
    public final boolean a() {
        return a.f();
    }

    @Override
    public final boolean b() {
        return b.f();
    }
}

