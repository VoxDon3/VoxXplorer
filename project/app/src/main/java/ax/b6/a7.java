/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.V2;
import ax.b6.Y2;
import ax.b6.b7;
import ax.b6.h3;

public final class a7
implements b7 {
    private static final Y2<Boolean> a;

    static {
        h3 h32 = new h3(V2.a("com.google.android.gms.measurement")).f().e();
        h32.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        h32.d("measurement.sdk.collection.last_deep_link_referrer2", true);
        a = h32.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        h32.b("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override
    public final boolean a() {
        return a.f();
    }
}

