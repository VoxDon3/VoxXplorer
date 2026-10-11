/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import android.os.Bundle;
import ax.P0.P;
import ax.S0.a;
import ax.S0.d0;
import ax.r7.z;
import ax.u7.f;
import java.util.Collections;
import java.util.List;

public final class Q {
    private static final String c = d0.G0(0);
    private static final String d = d0.G0(1);
    public final P a;
    public final z<Integer> b;

    public Q(P p8, List<Integer> list) {
        if (!(list.isEmpty() || Collections.min(list) >= 0 && Collections.max(list) < p8.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = p8;
        this.b = z.u(list);
    }

    public static Q a(Bundle bundle) {
        return new Q(P.a(ax.S0.a.e(bundle.getBundle(c))), f.c(ax.S0.a.e(bundle.getIntArray(d))));
    }

    public int b() {
        return this.a.c;
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putBundle(c, this.a.g());
        bundle.putIntArray(d, f.o(this.b));
        return bundle;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && Q.class == object.getClass()) {
            object = (Q)object;
            if (this.a.equals(((Q)object).a) && this.b.equals(((Q)object).b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() + this.b.hashCode() * 31;
    }
}

