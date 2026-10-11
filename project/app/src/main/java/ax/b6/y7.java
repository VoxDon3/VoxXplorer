/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.V2;
import ax.b6.Y2;
import ax.b6.h3;
import ax.b6.v7;

public final class y7
implements v7 {
    private static final Y2<Boolean> a = new h3(V2.a("com.google.android.gms.measurement")).f().e().d("measurement.integration.disable_firebase_instance_id", false);

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean b() {
        return a.f();
    }
}

