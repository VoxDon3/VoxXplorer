package ax.b6;

/* renamed from: ax.b6.a7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1512a7 implements InterfaceC1521b7 {
    private static final Y2<Boolean> a;

    static {
        C1571h3 e = new C1571h3(V2.a("com.google.android.gms.measurement")).f().e();
        e.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        e.d("measurement.sdk.collection.last_deep_link_referrer2", true);
        a = e.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        e.b("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // ax.b6.InterfaceC1521b7
    public final boolean a() {
        return a.f().booleanValue();
    }
}
