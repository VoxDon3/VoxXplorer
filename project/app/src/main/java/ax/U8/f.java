/*
 * Decompiled with CFR 0.152.
 */
package ax.U8;

import ax.U8.a;
import ax.U8.b;
import ax.Z8.a;

public class f
extends b<Long> {
    f() {
        super(ax.U8.a.i0);
    }

    public f(long l8) {
        super(ax.U8.a.i0, l8);
    }

    @Override
    public void c(ax.Z8.a<?> a8) {
        a8.s((int)this.a.getValue());
        a8.s(4);
        a8.u((Long)this.b);
    }

    public b<Long> d(ax.Z8.a<?> a8) throws a.b {
        a8.J();
        this.b = a8.N();
        return this;
    }
}

