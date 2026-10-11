package ax.R8;

import ax.Q8.EnumC0919c;
import ax.Y8.c;
import ax.Z8.a;
import ax.h9.C2171b;
import java.util.Set;

/* loaded from: classes3.dex */
public class e extends ax.Q8.q {
    private EnumC0919c e;
    private ax.J8.b f;
    private ax.J8.b g;
    private ax.J8.b h;
    private ax.J8.b i;
    private Set<ax.L8.a> j;
    private ax.Q8.i k;

    @Override // ax.Q8.q
    protected void j(C2171b c2171b) throws a.b {
        c2171b.J();
        c2171b.z();
        c2171b.z();
        this.e = (EnumC0919c) c.a.f(c2171b.N(), EnumC0919c.class, null);
        this.f = ax.J8.c.c(c2171b);
        this.g = ax.J8.c.c(c2171b);
        this.h = ax.J8.c.c(c2171b);
        this.i = ax.J8.c.c(c2171b);
        c2171b.G(8);
        c2171b.G(8);
        this.j = c.a.d(c2171b.N(), ax.L8.a.class);
        c2171b.U(4);
        this.k = ax.Q8.i.a(c2171b);
        c2171b.N();
        c2171b.N();
    }

    public Set<ax.L8.a> n() {
        return this.j;
    }

    public ax.Q8.i o() {
        return this.k;
    }
}
