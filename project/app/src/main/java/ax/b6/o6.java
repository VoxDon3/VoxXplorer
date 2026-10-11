/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.V2;
import ax.b6.Y2;
import ax.b6.h3;
import ax.b6.l6;

public final class o6
implements l6 {
    private static final Y2<Boolean> a;
    private static final Y2<Boolean> b;
    private static final Y2<Boolean> c;
    private static final Y2<Boolean> d;

    static {
        h3 h32 = new h3(V2.a("com.google.android.gms.measurement")).f().e();
        a = h32.d("measurement.consent.stop_reset_on_storage_denied.client", true);
        b = h32.d("measurement.consent.stop_reset_on_storage_denied.service", true);
        h32.b("measurement.id.consent.stop_reset_on_storage_denied.service", 0L);
        c = h32.d("measurement.consent.scrub_audience_data_analytics_consent", true);
        d = h32.d("measurement.consent.fix_first_open_count_from_snapshot", true);
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

    @Override
    public final boolean f() {
        return d.f();
    }
}

