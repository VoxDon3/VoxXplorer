package ax.b6;

/* loaded from: classes3.dex */
public final class s7 implements p7 {
    private static final Y2<Boolean> a;
    private static final Y2<Boolean> b;

    static {
        C1571h3 e = new C1571h3(V2.a("com.google.android.gms.measurement")).f().e();
        e.d("measurement.client.sessions.background_sessions_enabled", true);
        a = e.d("measurement.client.sessions.enable_fix_background_engagement", false);
        e.d("measurement.client.sessions.immediate_start_enabled_foreground", true);
        b = e.d("measurement.client.sessions.enable_pause_engagement_in_background", true);
        e.d("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        e.d("measurement.client.sessions.session_id_enabled", true);
        e.b("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // ax.b6.p7
    public final boolean a() {
        return a.f().booleanValue();
    }

    @Override // ax.b6.p7
    public final boolean b() {
        return b.f().booleanValue();
    }
}
