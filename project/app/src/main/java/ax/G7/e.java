/*
 * Decompiled with CFR 0.152.
 */
package ax.G7;

import ax.G7.g;
import ax.Gb.l;
import ax.K7.i;
import ax.K7.m;
import ax.m8.d;
import ax.m8.f;
import ax.tb.o;
import java.util.ArrayList;
import java.util.List;

public final class e
implements f {
    private final m a;

    public e(m m8) {
        l.f(m8, "userMetadata");
        this.a = m8;
    }

    @Override
    public void a(ax.m8.e object) {
        l.f(object, "rolloutsState");
        m m8 = this.a;
        Object object2 = ((ax.m8.e)object).b();
        l.e(object2, "rolloutsState.rolloutAssignments");
        object = new ArrayList(o.s(object2, 10));
        object2 = object2.iterator();
        while (object2.hasNext()) {
            d d8 = (d)object2.next();
            object.add(i.b(d8.d(), d8.b(), d8.c(), d8.f(), d8.e()));
        }
        m8.n((List<i>)object);
        g.f().b("Updated Crashlytics Rollout State");
    }
}

