package ax.b6;

/* renamed from: ax.b6.i6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1583i6 implements InterfaceC1556f6 {
    private static final Y2<Boolean> a;
    private static final Y2<Boolean> b;

    static {
        C1571h3 e = new C1571h3(V2.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.consent_regional_defaults.client2", false);
        b = e.d("measurement.consent_regional_defaults.service", false);
        e.b("measurement.id.consent_regional_defaults.service", 0L);
    }

    @Override // ax.b6.InterfaceC1556f6
    public final boolean a() {
        return true;
    }

    @Override // ax.b6.InterfaceC1556f6
    public final boolean b() {
        return a.f().booleanValue();
    }

    @Override // ax.b6.InterfaceC1556f6
    public final boolean c() {
        return b.f().booleanValue();
    }
}
