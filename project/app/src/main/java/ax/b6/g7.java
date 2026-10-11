/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.V2;
import ax.b6.Y2;
import ax.b6.c7;
import ax.b6.h3;

public final class g7
implements c7 {
    private static final Y2<Boolean> a;
    private static final Y2<Long> b;
    private static final Y2<Double> c;
    private static final Y2<Long> d;
    private static final Y2<Long> e;
    private static final Y2<String> f;

    static {
        h3 h32 = new h3(V2.a("com.google.android.gms.measurement")).f().e();
        a = h32.d("measurement.test.boolean_flag", false);
        b = h32.b("measurement.test.cached_long_flag", -1L);
        c = h32.a("measurement.test.double_flag", -3.0);
        d = h32.b("measurement.test.int_flag", -2L);
        e = h32.b("measurement.test.long_flag", -1L);
        f = h32.c("measurement.test.string_flag", "---");
    }

    @Override
    public final double a() {
        return c.f();
    }

    @Override
    public final long b() {
        return b.f();
    }

    @Override
    public final long c() {
        return d.f();
    }

    @Override
    public final long e() {
        return e.f();
    }

    @Override
    public final String f() {
        return f.f();
    }

    @Override
    public final boolean g() {
        return a.f();
    }
}

