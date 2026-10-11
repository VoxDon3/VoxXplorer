/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.A7;
import ax.b6.V2;
import ax.b6.Y2;
import ax.b6.h3;

public final class z7
implements A7 {
    private static final Y2<Boolean> a = new h3(V2.a("com.google.android.gms.measurement")).f().e().d("measurement.collection.service.update_with_analytics_fix", false);

    @Override
    public final boolean a() {
        return a.f();
    }
}

