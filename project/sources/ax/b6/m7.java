package ax.b6;

/* loaded from: classes3.dex */
public final class m7 implements InterfaceC1593j7 {
    private static final Y2<Boolean> a;
    private static final Y2<Boolean> b;
    private static final Y2<Boolean> c;
    private static final Y2<Boolean> d;
    private static final Y2<Boolean> e;
    private static final Y2<Boolean> f;
    private static final Y2<Boolean> g;
    private static final Y2<Boolean> h;

    static {
        C1571h3 e2 = new C1571h3(V2.a("com.google.android.gms.measurement")).f().e();
        a = e2.d("measurement.rb.attribution.ad_campaign_info", false);
        b = e2.d("measurement.rb.attribution.client2", true);
        e2.d("measurement.rb.attribution.dma_fix", true);
        c = e2.d("measurement.rb.attribution.followup1.service", false);
        e2.d("measurement.rb.attribution.index_out_of_bounds_fix", true);
        d = e2.d("measurement.rb.attribution.registration_regardless_consent", false);
        e = e2.d("measurement.rb.attribution.service", true);
        f = e2.d("measurement.rb.attribution.enable_trigger_redaction", true);
        g = e2.d("measurement.rb.attribution.uuid_generation", true);
        e2.b("measurement.id.rb.attribution.improved_retry", 0L);
        h = e2.d("measurement.rb.attribution.improved_retry", true);
    }

    @Override // ax.b6.InterfaceC1593j7
    public final boolean a() {
        return true;
    }

    @Override // ax.b6.InterfaceC1593j7
    public final boolean b() {
        return a.f().booleanValue();
    }

    @Override // ax.b6.InterfaceC1593j7
    public final boolean c() {
        return b.f().booleanValue();
    }

    @Override // ax.b6.InterfaceC1593j7
    public final boolean d() {
        return h.f().booleanValue();
    }

    @Override // ax.b6.InterfaceC1593j7
    public final boolean e() {
        return c.f().booleanValue();
    }

    @Override // ax.b6.InterfaceC1593j7
    public final boolean f() {
        return d.f().booleanValue();
    }

    @Override // ax.b6.InterfaceC1593j7
    public final boolean g() {
        return e.f().booleanValue();
    }

    @Override // ax.b6.InterfaceC1593j7
    public final boolean i() {
        return g.f().booleanValue();
    }

    @Override // ax.b6.InterfaceC1593j7
    public final boolean j() {
        return f.f().booleanValue();
    }
}
