/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.V2;
import ax.b6.Y2;
import ax.b6.h3;
import ax.b6.o7;

public final class n7
implements o7 {
    private static final Y2<Boolean> a;

    static {
        h3 h32 = new h3(V2.a("com.google.android.gms.measurement")).f().e();
        h32.d("measurement.collection.enable_session_stitching_token.client.dev", true);
        h32.d("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        a = h32.d("measurement.session_stitching_token_enabled", false);
        h32.d("measurement.link_sst_to_sid", true);
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean b() {
        return a.f();
    }
}

