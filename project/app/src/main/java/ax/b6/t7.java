/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.V2;
import ax.b6.Y2;
import ax.b6.h3;
import ax.b6.u7;

public final class t7
implements u7 {
    private static final Y2<Boolean> a;
    private static final Y2<Boolean> b;
    private static final Y2<Boolean> c;
    private static final Y2<Boolean> d;

    static {
        h3 h32 = new h3(V2.a("com.google.android.gms.measurement")).f().e();
        a = h32.d("measurement.sgtm.google_signal.enable", false);
        b = h32.d("measurement.sgtm.preview_mode_enabled", true);
        c = h32.d("measurement.sgtm.service", true);
        d = h32.d("measurement.sgtm.upload_queue", false);
        h32.b("measurement.id.sgtm", 0L);
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean b() {
        return a.f();
    }

    @Override
    public final boolean c() {
        return b.f();
    }

    @Override
    public final boolean e() {
        return c.f();
    }

    @Override
    public final boolean f() {
        return d.f();
    }
}

