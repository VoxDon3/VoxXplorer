/*
 * Decompiled with CFR 0.152.
 */
package ax.I8;

import ax.I8.a;
import ax.Y8.c;
import ax.Z8.a;
import ax.h9.b;
import java.util.ArrayList;

public class d
extends a {
    d() {
    }

    @Override
    protected void l(b b8, int n8) throws a.b {
        this.b = b8.P();
        if (!c.a.c(this.d, a.a.c0)) {
            this.f = this.k(b8, n8, b8.J());
            this.g = this.k(b8, n8, b8.J());
            this.e = this.k(b8, n8, b8.J());
            b8.U(16);
            return;
        }
        this.h = this.k(b8, n8, b8.J());
        int n9 = b8.J();
        int n10 = b8.J();
        this.i = new ArrayList<String>(n9);
        int n11 = b8.S();
        b8.T(n8 + n10);
        for (n8 = 0; n8 < n9; ++n8) {
            this.i.add(b8.C(ax.Y8.b.d));
        }
        b8.T(n11);
    }
}

