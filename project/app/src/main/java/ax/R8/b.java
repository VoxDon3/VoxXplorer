/*
 * Decompiled with CFR 0.152.
 */
package ax.R8;

import ax.M8.a;
import ax.Q8.q;
import ax.Q8.t;
import ax.Z8.a;
import java.util.ArrayList;
import java.util.List;

public class b
extends q {
    List<a> e = new ArrayList<a>();

    private List<a> n(ax.h9.b b8, int n8) throws a.b {
        ArrayList<a> arrayList = new ArrayList<a>();
        b8.T(((t)this.a).a() + n8);
        while (true) {
            n8 = b8.S();
            a a8 = new a();
            a8.b(b8);
            arrayList.add(a8);
            if (a8.a() == 0) {
                return arrayList;
            }
            b8.T(n8 + a8.a());
        }
    }

    @Override
    protected void j(ax.h9.b b8) throws a.b {
        b8.U(2);
        int n8 = b8.J();
        int n9 = b8.P();
        if (n8 > 0 && n9 > 0) {
            this.e = this.n(b8, n8);
        }
        b8.T(((t)this.a).a() + n8 + n9);
    }
}

