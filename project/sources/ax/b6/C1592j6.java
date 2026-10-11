package ax.b6;

/* renamed from: ax.b6.j6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1592j6 implements InterfaceC1601k6 {
    private static final Y2<Long> a;

    static {
        C1571h3 e = new C1571h3(V2.a("com.google.android.gms.measurement")).f().e();
        e.d("measurement.client.consent_state_v1", true);
        e.d("measurement.client.3p_consent_state_v1", true);
        e.d("measurement.service.consent_state_v1_W36", true);
        a = e.b("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // ax.b6.InterfaceC1601k6
    public final long a() {
        return a.f().longValue();
    }
}
