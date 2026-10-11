package ax.b6;

/* loaded from: classes3.dex */
public final class T6 implements Q6 {
    private static final Y2<Boolean> a = new C1571h3(V2.a("com.google.android.gms.measurement")).f().e().d("measurement.gmscore_feature_tracking", true);

    @Override // ax.b6.Q6
    public final boolean a() {
        return true;
    }

    @Override // ax.b6.Q6
    public final boolean b() {
        return a.f().booleanValue();
    }
}
