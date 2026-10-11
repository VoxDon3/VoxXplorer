package ax.b6;

/* loaded from: classes3.dex */
public final class n7 implements o7 {
    private static final Y2<Boolean> a;

    static {
        C1571h3 e = new C1571h3(V2.a("com.google.android.gms.measurement")).f().e();
        e.d("measurement.collection.enable_session_stitching_token.client.dev", true);
        e.d("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        a = e.d("measurement.session_stitching_token_enabled", false);
        e.d("measurement.link_sst_to_sid", true);
    }

    @Override // ax.b6.o7
    public final boolean a() {
        return true;
    }

    @Override // ax.b6.o7
    public final boolean b() {
        return a.f().booleanValue();
    }
}
