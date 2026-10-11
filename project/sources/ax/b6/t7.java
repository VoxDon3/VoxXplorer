package ax.b6;

/* loaded from: classes3.dex */
public final class t7 implements u7 {
    private static final Y2<Boolean> a;
    private static final Y2<Boolean> b;
    private static final Y2<Boolean> c;
    private static final Y2<Boolean> d;

    static {
        C1571h3 e = new C1571h3(V2.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.sgtm.google_signal.enable", false);
        b = e.d("measurement.sgtm.preview_mode_enabled", true);
        c = e.d("measurement.sgtm.service", true);
        d = e.d("measurement.sgtm.upload_queue", false);
        e.b("measurement.id.sgtm", 0L);
    }

    @Override // ax.b6.u7
    public final boolean a() {
        return true;
    }

    @Override // ax.b6.u7
    public final boolean b() {
        return a.f().booleanValue();
    }

    @Override // ax.b6.u7
    public final boolean c() {
        return b.f().booleanValue();
    }

    @Override // ax.b6.u7
    public final boolean e() {
        return c.f().booleanValue();
    }

    @Override // ax.b6.u7
    public final boolean f() {
        return d.f().booleanValue();
    }
}
