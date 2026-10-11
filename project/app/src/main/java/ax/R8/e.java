/*
 * Decompiled with CFR 0.152.
 */
package ax.R8;

import ax.J8.c;
import ax.L8.a;
import ax.Q8.i;
import ax.Q8.q;
import ax.Y8.c;
import ax.Z8.a;
import ax.h9.b;
import java.util.Set;

public class e
extends q {
    private ax.Q8.c e;
    private ax.J8.b f;
    private ax.J8.b g;
    private ax.J8.b h;
    private ax.J8.b i;
    private Set<a> j;
    private i k;

    @Override
    protected void j(b b8) throws a.b {
        b8.J();
        b8.z();
        b8.z();
        this.e = c.a.f(b8.N(), ax.Q8.c.class, null);
        this.f = ax.J8.c.c(b8);
        this.g = ax.J8.c.c(b8);
        this.h = ax.J8.c.c(b8);
        this.i = ax.J8.c.c(b8);
        b8.G(8);
        b8.G(8);
        this.j = c.a.d(b8.N(), a.class);
        b8.U(4);
        this.k = ax.Q8.i.a(b8);
        b8.N();
        b8.N();
    }

    public Set<a> n() {
        return this.j;
    }

    public i o() {
        return this.k;
    }
}

