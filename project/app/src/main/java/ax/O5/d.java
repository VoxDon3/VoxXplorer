/*
 * Decompiled with CFR 0.152.
 */
package ax.O5;

import android.content.Context;
import ax.K5.a;
import ax.K5.f;
import ax.M5.t;
import ax.M5.v;
import ax.M5.w;
import ax.O5.b;
import ax.O5.c;
import ax.j6.j;
import com.google.android.gms.common.api.internal.d;

public final class d
extends f
implements v {
    private static final a.g k;
    private static final a.a l;
    private static final a m;
    public static final int n = 0;

    static {
        a.g g8;
        k = g8 = new a.g();
        c c8 = new c();
        l = c8;
        m = new a("ClientTelemetry.API", c8, g8);
    }

    public d(Context context, w w8) {
        super(context, m, w8, f.a.c);
    }

    @Override
    public final j<Void> b(t t8) {
        d.a a8 = com.google.android.gms.common.api.internal.d.a();
        a8.d(ax.Y5.f.a);
        a8.c(false);
        a8.b(new b(t8));
        return this.f(a8.a());
    }
}

