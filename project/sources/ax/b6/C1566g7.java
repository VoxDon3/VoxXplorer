package ax.b6;

/* renamed from: ax.b6.g7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1566g7 implements InterfaceC1530c7 {
    private static final Y2<Boolean> a;
    private static final Y2<Long> b;
    private static final Y2<Double> c;
    private static final Y2<Long> d;
    private static final Y2<Long> e;
    private static final Y2<String> f;

    static {
        C1571h3 e2 = new C1571h3(V2.a("com.google.android.gms.measurement")).f().e();
        a = e2.d("measurement.test.boolean_flag", false);
        b = e2.b("measurement.test.cached_long_flag", -1L);
        c = e2.a("measurement.test.double_flag", -3.0d);
        d = e2.b("measurement.test.int_flag", -2L);
        e = e2.b("measurement.test.long_flag", -1L);
        f = e2.c("measurement.test.string_flag", "---");
    }

    @Override // ax.b6.InterfaceC1530c7
    public final double a() {
        return c.f().doubleValue();
    }

    @Override // ax.b6.InterfaceC1530c7
    public final long b() {
        return b.f().longValue();
    }

    @Override // ax.b6.InterfaceC1530c7
    public final long c() {
        return d.f().longValue();
    }

    @Override // ax.b6.InterfaceC1530c7
    public final long e() {
        return e.f().longValue();
    }

    @Override // ax.b6.InterfaceC1530c7
    public final String f() {
        return f.f();
    }

    @Override // ax.b6.InterfaceC1530c7
    public final boolean g() {
        return a.f().booleanValue();
    }
}
