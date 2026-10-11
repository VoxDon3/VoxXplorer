/*
 * Decompiled with CFR 0.152.
 */
package ax.U8;

import ax.U8.a;
import ax.U8.b;
import ax.Z8.a;

public class h
extends b<String> {
    h(a a8) {
        super(a8);
    }

    public h(a a8, String string) {
        super(a8, string);
    }

    @Override
    public void c(ax.Z8.a<?> a8) {
        a8.s((int)this.a.getValue());
        a8.s(((String)this.b).length() * 2);
        a8.q((String)this.b, ax.Y8.b.c);
    }

    public h d(ax.Z8.a<?> a8) throws a.b {
        int n8 = a8.J();
        this.b = a8.H(ax.Y8.b.c, n8 / 2);
        return this;
    }
}

