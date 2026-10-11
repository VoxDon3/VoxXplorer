/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.V2;
import ax.b6.Y2;
import ax.b6.h3;
import ax.b6.x6;

public final class A6
implements x6 {
    private static final Y2<Boolean> a;
    private static final Y2<Boolean> b;

    static {
        h3 h32 = new h3(V2.a("com.google.android.gms.measurement")).f().e();
        h32.d("measurement.collection.event_safelist", true);
        a = h32.d("measurement.service.store_null_safelist", true);
        b = h32.d("measurement.service.store_safelist", true);
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

