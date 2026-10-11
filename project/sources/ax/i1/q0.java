package ax.i1;

import android.os.Bundle;
import ax.S0.C0974g;
import ax.S0.C0987u;
import ax.q7.InterfaceC2879f;
import ax.r7.AbstractC2991z;
import java.util.ArrayList;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class q0 {
    public static final q0 d = new q0(new ax.P0.P[0]);
    private static final String e = ax.S0.d0.G0(0);
    public final int a;
    private final AbstractC2991z<ax.P0.P> b;
    private int c;

    public q0(ax.P0.P... pArr) {
        this.b = AbstractC2991z.w(pArr);
        this.a = pArr.length;
        g();
    }

    public static q0 b(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(e);
        return parcelableArrayList == null ? new q0(new ax.P0.P[0]) : new q0((ax.P0.P[]) C0974g.b(new InterfaceC2879f() { // from class: ax.i1.o0
            @Override // ax.q7.InterfaceC2879f
            public final Object apply(Object obj) {
                return ax.P0.P.a((Bundle) obj);
            }
        }, parcelableArrayList).toArray(new ax.P0.P[0]));
    }

    private void g() {
        int i = 0;
        while (i < this.b.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.b.size(); i3++) {
                if (this.b.get(i).equals(this.b.get(i3))) {
                    C0987u.d("TrackGroupArray", HttpUrl.FRAGMENT_ENCODE_SET, new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public ax.P0.P c(int i) {
        return this.b.get(i);
    }

    public AbstractC2991z<Integer> d() {
        return AbstractC2991z.u(ax.r7.I.i(this.b, new InterfaceC2879f() { // from class: ax.i1.p0
            @Override // ax.q7.InterfaceC2879f
            public final Object apply(Object obj) {
                Integer valueOf;
                valueOf = Integer.valueOf(((ax.P0.P) obj).c);
                return valueOf;
            }
        }));
    }

    public int e(ax.P0.P p) {
        int indexOf = this.b.indexOf(p);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q0.class == obj.getClass()) {
            q0 q0Var = (q0) obj;
            if (this.a == q0Var.a && this.b.equals(q0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(e, C0974g.d(this.b, new InterfaceC2879f() { // from class: ax.i1.n0
            @Override // ax.q7.InterfaceC2879f
            public final Object apply(Object obj) {
                return ((ax.P0.P) obj).g();
            }
        }));
        return bundle;
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }

    public String toString() {
        return this.b.toString();
    }
}
