package ax.b6;

/* loaded from: classes3.dex */
public final class O6 implements P6 {
    private static final Y2<Boolean> a;
    private static final Y2<Boolean> b;

    static {
        C1571h3 e = new C1571h3(V2.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.gbraid_campaign.gbraid.client.dev", false);
        b = e.d("measurement.gbraid_campaign.gbraid.service", false);
        e.b("measurement.id.gbraid_campaign.service", 0L);
    }

    @Override // ax.b6.P6
    public final boolean a() {
        return true;
    }

    @Override // ax.b6.P6
    public final boolean b() {
        return a.f().booleanValue();
    }

    @Override // ax.b6.P6
    public final boolean c() {
        return b.f().booleanValue();
    }
}
