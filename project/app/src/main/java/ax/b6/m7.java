/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.V2;
import ax.b6.Y2;
import ax.b6.h3;
import ax.b6.j7;

public final class m7
implements j7 {
    private static final Y2<Boolean> a;
    private static final Y2<Boolean> b;
    private static final Y2<Boolean> c;
    private static final Y2<Boolean> d;
    private static final Y2<Boolean> e;
    private static final Y2<Boolean> f;
    private static final Y2<Boolean> g;
    private static final Y2<Boolean> h;

    static {
        h3 h32 = new h3(V2.a("com.google.android.gms.measurement")).f().e();
        a = h32.d("measurement.rb.attribution.ad_campaign_info", false);
        b = h32.d("measurement.rb.attribution.client2", true);
        h32.d("measurement.rb.attribution.dma_fix", true);
        c = h32.d("measurement.rb.attribution.followup1.service", false);
        h32.d("measurement.rb.attribution.index_out_of_bounds_fix", true);
        d = h32.d("measurement.rb.attribution.registration_regardless_consent", false);
        e = h32.d("measurement.rb.attribution.service", true);
        f = h32.d("measurement.rb.attribution.enable_trigger_redaction", true);
        g = h32.d("measurement.rb.attribution.uuid_generation", true);
        h32.b("measurement.id.rb.attribution.improved_retry", 0L);
        h = h32.d("measurement.rb.attribution.improved_retry", true);
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
    public final boolean d() {
        return h.f();
    }

    @Override
    public final boolean e() {
        return c.f();
    }

    @Override
    public final boolean f() {
        return d.f();
    }

    @Override
    public final boolean g() {
        return e.f();
    }

    @Override
    public final boolean i() {
        return g.f();
    }

    @Override
    public final boolean j() {
        return f.f();
    }
}

