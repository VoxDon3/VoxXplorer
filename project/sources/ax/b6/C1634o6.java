package ax.b6;

/* renamed from: ax.b6.o6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1634o6 implements InterfaceC1610l6 {
    private static final Y2<Boolean> a;
    private static final Y2<Boolean> b;
    private static final Y2<Boolean> c;
    private static final Y2<Boolean> d;

    static {
        C1571h3 e = new C1571h3(V2.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.consent.stop_reset_on_storage_denied.client", true);
        b = e.d("measurement.consent.stop_reset_on_storage_denied.service", true);
        e.b("measurement.id.consent.stop_reset_on_storage_denied.service", 0L);
        c = e.d("measurement.consent.scrub_audience_data_analytics_consent", true);
        d = e.d("measurement.consent.fix_first_open_count_from_snapshot", true);
    }

    @Override // ax.b6.InterfaceC1610l6
    public final boolean a() {
        return true;
    }

    @Override // ax.b6.InterfaceC1610l6
    public final boolean b() {
        return a.f().booleanValue();
    }

    @Override // ax.b6.InterfaceC1610l6
    public final boolean c() {
        return b.f().booleanValue();
    }

    @Override // ax.b6.InterfaceC1610l6
    public final boolean e() {
        return c.f().booleanValue();
    }

    @Override // ax.b6.InterfaceC1610l6
    public final boolean f() {
        return d.f().booleanValue();
    }
}
