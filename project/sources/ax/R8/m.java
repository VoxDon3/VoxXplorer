package ax.R8;

import ax.Y8.c;
import ax.Z8.a;
import ax.h9.C2171b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes3.dex */
public class m extends ax.Q8.q {
    private int e;
    private ax.Q8.g f;
    private UUID g;
    private Set<ax.Q8.k> h = EnumSet.noneOf(ax.Q8.k.class);
    private int i;
    private int j;
    private int k;
    private ax.J8.b l;
    private ax.J8.b m;
    private byte[] n;
    private List<ax.S8.c> o;

    private int w(ax.Z8.a<?> aVar) throws a.b {
        if (this.f == ax.Q8.g.SMB_3_1_1) {
            return aVar.J();
        }
        aVar.U(2);
        return 0;
    }

    private List<ax.S8.c> x(C2171b c2171b, int i, int i2) {
        if (this.f != ax.Q8.g.SMB_3_1_1) {
            return Collections.EMPTY_LIST;
        }
        c2171b.T(i);
        try {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add(ax.S8.c.a(c2171b));
            }
            return arrayList;
        } catch (a.b e) {
            throw new IllegalArgumentException("unknown error when parse negotiateContext", e);
        }
    }

    private int y(C2171b c2171b) throws a.b {
        if (this.f == ax.Q8.g.SMB_3_1_1) {
            return c2171b.J();
        }
        c2171b.U(2);
        return 0;
    }

    private byte[] z(C2171b c2171b, int i, int i2) throws a.b {
        if (i2 <= 0) {
            return new byte[0];
        }
        c2171b.T(i);
        return c2171b.G(i2);
    }

    @Override // ax.Q8.q
    protected void j(C2171b c2171b) throws a.b {
        c2171b.U(2);
        this.e = c2171b.J();
        this.f = ax.Q8.g.l(c2171b.J());
        int w = w(c2171b);
        this.g = ax.J8.c.d(c2171b);
        this.h = c.a.d(c2171b.N(), ax.Q8.k.class);
        this.i = c2171b.P();
        this.j = c2171b.P();
        this.k = c2171b.P();
        this.l = ax.J8.c.c(c2171b);
        this.m = ax.J8.c.c(c2171b);
        int J = c2171b.J();
        int J2 = c2171b.J();
        int y = y(c2171b);
        this.n = z(c2171b, J, J2);
        this.o = x(c2171b, y, w);
    }

    public Set<ax.Q8.k> n() {
        return this.h;
    }

    public ax.Q8.g o() {
        return this.f;
    }

    public int p() {
        return this.j;
    }

    public int q() {
        return this.i;
    }

    public int r() {
        return this.k;
    }

    public List<ax.S8.c> s() {
        return this.o;
    }

    public int t() {
        return this.e;
    }

    public UUID u() {
        return this.g;
    }

    public ax.J8.b v() {
        return this.l;
    }
}
