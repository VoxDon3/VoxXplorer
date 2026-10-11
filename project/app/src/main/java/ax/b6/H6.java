/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.E6;
import ax.b6.V2;
import ax.b6.Y2;
import ax.b6.h3;

public final class H6
implements E6 {
    private static final Y2<Boolean> a;
    private static final Y2<Boolean> b;
    private static final Y2<Boolean> c;

    static {
        h3 h32 = new h3(V2.a("com.google.android.gms.measurement")).f().e();
        h32.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        a = h32.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = h32.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = h32.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean b() {
        return a.f();
    }

    @Override
    public final boolean c() {
        return b.f();
    }

    @Override
    public final boolean e() {
        return c.f();
    }
}

