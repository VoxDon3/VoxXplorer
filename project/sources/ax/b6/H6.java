package ax.b6;

/* loaded from: classes3.dex */
public final class H6 implements E6 {
    private static final Y2<Boolean> a;
    private static final Y2<Boolean> b;
    private static final Y2<Boolean> c;

    static {
        C1571h3 e = new C1571h3(V2.a("com.google.android.gms.measurement")).f().e();
        e.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        a = e.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = e.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = e.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // ax.b6.E6
    public final boolean a() {
        return true;
    }

    @Override // ax.b6.E6
    public final boolean b() {
        return a.f().booleanValue();
    }

    @Override // ax.b6.E6
    public final boolean c() {
        return b.f().booleanValue();
    }

    @Override // ax.b6.E6
    public final boolean e() {
        return c.f().booleanValue();
    }
}
