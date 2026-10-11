/*
 * Decompiled with CFR 0.152.
 */
package ax.R8;

import ax.J8.a;
import ax.Q8.q;
import ax.Q8.v;
import ax.Q8.w;
import ax.Y8.c;
import ax.Z8.a;
import ax.h9.b;
import java.util.Set;

public class x
extends q {
    private byte e;
    private Set<w> f;
    private Set<v> g;
    private Set<a> h;

    @Override
    protected void j(b b8) throws a.b {
        b8.U(2);
        this.e = b8.z();
        b8.z();
        this.f = c.a.d(b8.N(), w.class);
        this.g = c.a.d(b8.N(), v.class);
        this.h = c.a.d(b8.N(), a.class);
    }

    public Set<v> n() {
        return this.g;
    }

    public Set<a> o() {
        return this.h;
    }

    public Set<w> p() {
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

