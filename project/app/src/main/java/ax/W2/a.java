/*
 * Decompiled with CFR 0.152.
 */
package ax.W2;

import ax.U2.f;
import ax.W2.b;
import ax.W2.h;
import ax.W2.j;
import java.util.List;

public class a
extends h {
    private List<f> d;
    private boolean e;

    public static a m() {
        return new a();
    }

    @Override
    protected j b() {
        b b8 = new b(this.f(), this.d, this.e);
        this.k();
        return b8;
    }

    public void k() {
        this.d = null;
        this.e = false;
    }

    public void l(List<f> list, boolean bl, h.a a8) {
        this.d = list;
        this.e = bl;
        this.i(a8);
        this.j(h.c.c0);
    }
}

