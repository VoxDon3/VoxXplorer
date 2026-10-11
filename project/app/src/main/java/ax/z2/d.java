/*
 * Decompiled with CFR 0.152.
 */
package ax.z2;

import android.app.Activity;
import android.content.Context;
import ax.A2.m;
import ax.A2.v;
import ax.Gb.g;
import ax.Gb.l;
import ax.c0.F0;
import ax.tb.o;
import ax.z2.a;
import ax.z2.c;
import java.util.ArrayList;

public final class d
implements c {
    private final m b;
    private final ArrayList<Integer> c;

    public d(m m8) {
        l.f(m8, "densityCompatHelper");
        this.b = m8;
        this.c = o.f(F0.m.g(), F0.m.f(), F0.m.a(), F0.m.c(), F0.m.i(), F0.m.e(), F0.m.j(), F0.m.b());
    }

    public /* synthetic */ d(m m8, int n8, g g8) {
        if ((n8 & 1) != 0) {
            m8 = m.a.a();
        }
        this(m8);
    }

    @Override
    public a a(Context context) {
        l.f(context, "context");
        return v.a.a().a(context, this.b);
    }

    @Override
    public a b(Activity activity) {
        l.f(activity, "activity");
        return v.a.a().b(activity, this.b);
    }
}

