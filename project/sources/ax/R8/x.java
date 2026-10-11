package ax.R8;

import ax.Y8.c;
import ax.Z8.a;
import ax.h9.C2171b;
import java.util.Set;

/* loaded from: classes3.dex */
public class x extends ax.Q8.q {
    private byte e;
    private Set<ax.Q8.w> f;
    private Set<ax.Q8.v> g;
    private Set<ax.J8.a> h;

    @Override // ax.Q8.q
    protected void j(C2171b c2171b) throws a.b {
        c2171b.U(2);
        this.e = c2171b.z();
        c2171b.z();
        this.f = c.a.d(c2171b.N(), ax.Q8.w.class);
        this.g = c.a.d(c2171b.N(), ax.Q8.v.class);
        this.h = c.a.d(c2171b.N(), ax.J8.a.class);
    }

    public Set<ax.Q8.v> n() {
        return this.g;
    }

    public Set<ax.J8.a> o() {
        return this.h;
    }

    public Set<ax.Q8.w> p() {
        return this.f;
    }

    public boolean q() {
        return this.e == 1;
    }

    public boolean r() {
        return this.e == 2;
    }

    public boolean s() {
        return this.e == 3;
    }
}
