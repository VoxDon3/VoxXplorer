package ax.P0;

import android.os.Bundle;
import ax.S0.C0968a;
import ax.S0.d0;
import ax.r7.AbstractC2991z;
import ax.u7.C3218f;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class Q {
    private static final String c = d0.G0(0);
    private static final String d = d0.G0(1);
    public final P a;
    public final AbstractC2991z<Integer> b;

    public Q(P p, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= p.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = p;
        this.b = AbstractC2991z.u(list);
    }

    public static Q a(Bundle bundle) {
        return new Q(P.a((Bundle) C0968a.e(bundle.getBundle(c))), C3218f.c((int[]) C0968a.e(bundle.getIntArray(d))));
    }

    public int b() {
        return this.a.c;
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putBundle(c, this.a.g());
        bundle.putIntArray(d, C3218f.o(this.b));
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Q.class == obj.getClass()) {
            Q q = (Q) obj;
            if (this.a.equals(q.a) && this.b.equals(q.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }
}
