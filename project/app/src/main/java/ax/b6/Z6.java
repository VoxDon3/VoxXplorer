/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.V2;
import ax.b6.W6;
import ax.b6.Y2;
import ax.b6.h3;

public final class Z6
implements W6 {
    private static final Y2<Boolean> a;
    private static final Y2<Boolean> b;

    static {
        h3 h32 = new h3(V2.a("com.google.android.gms.measurement")).f().e();
        a = h32.d("measurement.item_scoped_custom_parameters.client", true);
        b = h32.d("measurement.item_scoped_custom_parameters.service", true);
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

