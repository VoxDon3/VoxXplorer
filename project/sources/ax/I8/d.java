package ax.I8;

import ax.I8.a;
import ax.Y8.c;
import ax.Z8.a;
import ax.h9.C2171b;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class d extends a {
    d() {
    }

    @Override // ax.I8.a
    protected void l(C2171b c2171b, int i) throws a.b {
        this.b = c2171b.P();
        if (!c.a.c(this.d, a.EnumC0092a.NameListReferral)) {
            this.f = k(c2171b, i, c2171b.J());
            this.g = k(c2171b, i, c2171b.J());
            this.e = k(c2171b, i, c2171b.J());
            c2171b.U(16);
            return;
        }
        this.h = k(c2171b, i, c2171b.J());
        int J = c2171b.J();
        int J2 = c2171b.J();
        this.i = new ArrayList(J);
        int S = c2171b.S();
        c2171b.T(i + J2);
        for (int i2 = 0; i2 < J; i2++) {
            this.i.add(c2171b.C(ax.Y8.b.d));
        }
        c2171b.T(S);
    }
}
