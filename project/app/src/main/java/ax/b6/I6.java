/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.J6;
import ax.b6.V2;
import ax.b6.Y2;
import ax.b6.h3;

public final class I6
implements J6 {
    private static final Y2<Boolean> a = new h3(V2.a("com.google.android.gms.measurement")).f().e().d("measurement.fix_engagement_on_reset_analytics_data", true);

    @Override
    public final boolean a() {
        return a.f();
    }
}

