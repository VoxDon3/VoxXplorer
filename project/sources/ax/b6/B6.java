package ax.b6;

/* loaded from: classes3.dex */
public final class B6 implements D6 {
    private static final Y2<Boolean> a;
    private static final Y2<Boolean> b;
    private static final Y2<Boolean> c;

    static {
        C1571h3 e = new C1571h3(V2.a("com.google.android.gms.measurement")).f().e();
        e.d("measurement.client.ad_id_consent_fix", true);
        e.d("measurement.service.consent.aiid_reset_fix", false);
        e.d("measurement.service.consent.aiid_reset_fix2", true);
        a = e.d("measurement.service.consent.app_start_fix", true);
        b = e.d("measurement.service.consent.params_on_fx", true);
        c = e.d("measurement.service.consent.pfo_on_fx", true);
    }

    @Override // ax.b6.D6
    public final boolean a() {
        return a.f().booleanValue();
    }

    @Override // ax.b6.D6
    public final boolean b() {
        return b.f().booleanValue();
    }

    @Override // ax.b6.D6
    public final boolean c() {
        return c.f().booleanValue();
    }
}
