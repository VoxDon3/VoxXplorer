package ax.b6;

/* loaded from: classes3.dex */
public final class Z6 implements W6 {
    private static final Y2<Boolean> a;
    private static final Y2<Boolean> b;

    static {
        C1571h3 e = new C1571h3(V2.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.item_scoped_custom_parameters.client", true);
        b = e.d("measurement.item_scoped_custom_parameters.service", true);
    }

    @Override // ax.b6.W6
    public final boolean a() {
        return true;
    }

    @Override // ax.b6.W6
    public final boolean b() {
        return a.f().booleanValue();
    }

    @Override // ax.b6.W6
    public final boolean c() {
        return b.f().booleanValue();
    }
}
