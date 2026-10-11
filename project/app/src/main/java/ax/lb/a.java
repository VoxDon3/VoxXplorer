/*
 * Decompiled with CFR 0.152.
 */
package ax.lb;

import ax.lb.d;
import ax.mb.c;
import ax.pb.h;
import ax.pb.j0;

public class a
extends d.f {
    public a(String object) {
        super((String)object, 200, 65535, new d.c(), new c(0));
        object = this.l;
        ((d.c)object).b = this.j;
        ((d.c)object).c = new d.b();
        this.b = 0;
        this.c = 3;
    }

    public h[] j() {
        d.b b8 = (d.b)this.l.c;
        h[] hArray = new j0[b8.b];
        for (int i8 = 0; i8 < b8.b; ++i8) {
            hArray[i8] = new j0(b8.c[i8].b, 0, null);
        }
        return hArray;
    }
}

