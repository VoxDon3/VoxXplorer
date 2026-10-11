package ax.b6;

/* renamed from: ax.b6.v6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1689v6 implements InterfaceC1697w6 {
    private static final Y2<Boolean> a;
    private static final Y2<Boolean> b;

    static {
        C1571h3 e = new C1571h3(V2.a("com.google.android.gms.measurement")).f().e();
        e.d("measurement.dma_consent.client", true);
        e.d("measurement.dma_consent.client_bow_check2", true);
        e.d("measurement.dma_consent.separate_service_calls_fix", true);
        e.d("measurement.dma_consent.service", true);
        a = e.d("measurement.dma_consent.service_database_update_fix", true);
        e.d("measurement.dma_consent.service_dcu_event", true);
        b = e.d("measurement.dma_consent.service_dcu_event2", true);
        e.d("measurement.dma_consent.service_npa_remote_default", true);
        e.d("measurement.dma_consent.service_split_batch_on_consent", true);
        e.d("measurement.dma_consent.set_consent_inline_on_worker", true);
    }

    @Override // ax.b6.InterfaceC1697w6
    public final boolean a() {
        return a.f().booleanValue();
    }

    @Override // ax.b6.InterfaceC1697w6
    public final boolean b() {
        return b.f().booleanValue();
    }
}
