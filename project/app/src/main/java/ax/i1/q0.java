/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import android.os.Bundle;
import ax.P0.P;
import ax.S0.d0;
import ax.S0.g;
import ax.S0.u;
import ax.i1.n0;
import ax.i1.o0;
import ax.i1.p0;
import ax.r7.I;
import ax.r7.z;
import java.util.List;

public final class q0 {
    public static final q0 d = new q0(new P[0]);
    private static final String e = d0.G0(0);
    public final int a;
    private final z<P> b;
    private int c;

    public q0(P ... pArray) {
        this.b = z.w(pArray);
        this.a = pArray.length;
        this.g();
    }

    public static /* synthetic */ Integer a(P p8) {
        return p8.c;
    }

    public static q0 b(Bundle object) {
        if ((object = object.getParcelableArrayList(e)) == null) {
            return new q0(new P[0]);
        }
        return new q0(g.b(new o0(), (List<Bundle>)object).toArray(new P[0]));
    }

    private void g() {
        int n8 = 0;
        while (n8 < this.b.size()) {
            int n9;
            for (int i8 = n9 = n8 + 1; i8 < this.b.size(); ++i8) {
                if (!((P)this.b.get(n8)).equals(this.b.get(i8))) continue;
                u.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
            }
            n8 = n9;
        }
    }

    public P c(int n8) {
        return (P)this.b.get(n8);
    }

    public z<Integer> d() {
        return z.u(I.i(this.b, new p0()));
    }

    public int e(P p8) {
        int n8 = this.b.indexOf(p8);
        if (n8 >= 0) {
            return n8;
        }
        return -1;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && q0.class == object.getClass()) {
            object = (q0)object;
            if (this.a == ((q0)object).a && this.b.equals(((q0)object).b)) {
                return true;
            }
        }
        return false;
    }

    public Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(e, g.d(this.b, new n0()));
        return bundle;
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }

    public String toString() {
        return ((Object)this.b).toString();
    }
}

