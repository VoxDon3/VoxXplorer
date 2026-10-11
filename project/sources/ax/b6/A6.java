package ax.b6;

/* loaded from: classes3.dex */
public final class A6 implements InterfaceC1705x6 {
    private static final Y2<Boolean> a;
    private static final Y2<Boolean> b;

    static {
        C1571h3 e = new C1571h3(V2.a("com.google.android.gms.measurement")).f().e();
        e.d("measurement.collection.event_safelist", true);
        a = e.d("measurement.service.store_null_safelist", true);
        b = e.d("measurement.service.store_safelist", true);
    }

    @Override // ax.b6.InterfaceC1705x6
    public final boolean a() {
        return true;
    }

    @Override // ax.b6.InterfaceC1705x6
    public final boolean b() {
        return a.f().booleanValue();
    }

    @Override // ax.b6.InterfaceC1705x6
    public final boolean c() {
        return b.f().booleanValue();
    }
}
