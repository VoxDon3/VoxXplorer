/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.V2;
import ax.b6.Y2;
import ax.b6.h3;
import ax.b6.p7;

public final class s7
implements p7 {
    private static final Y2<Boolean> a;
    private static final Y2<Boolean> b;

    static {
        h3 h32 = new h3(V2.a("com.google.android.gms.measurement")).f().e();
        h32.d("measurement.client.sessions.background_sessions_enabled", true);
        a = h32.d("measurement.client.sessions.enable_fix_background_engagement", false);
        h32.d("measurement.client.sessions.immediate_start_enabled_foreground", true);
        b = h32.d("measurement.client.sessions.enable_pause_engagement_in_background", true);
        h32.d("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        h32.d("measurement.client.sessions.session_id_enabled", true);
        h32.b("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override
    public final boolean a() {
        return a.f();
    }

    @Override
    public final boolean b() {
        return b.f();
    }
}

