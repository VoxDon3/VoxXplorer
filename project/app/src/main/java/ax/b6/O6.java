/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.P6;
import ax.b6.V2;
import ax.b6.Y2;
import ax.b6.h3;

public final class O6
implements P6 {
    private static final Y2<Boolean> a;
    private static final Y2<Boolean> b;

    static {
        h3 h32 = new h3(V2.a("com.google.android.gms.measurement")).f().e();
        a = h32.d("measurement.gbraid_campaign.gbraid.client.dev", false);
        b = h32.d("measurement.gbraid_campaign.gbraid.service", false);
        h32.b("measurement.id.gbraid_campaign.service", 0L);
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
}

