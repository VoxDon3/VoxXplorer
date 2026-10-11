/*
 * Decompiled with CFR 0.152.
 */
package ax.U8;

import ax.U8.a;
import ax.U8.b;
import ax.Z8.a;

public class g
extends b<byte[]> {
    private byte[] c;

    g() {
        super(ax.U8.a.k0);
    }

    @Override
    public void c(ax.Z8.a<?> a8) {
        a8.s((int)this.a.getValue());
        a8.s(48);
        a8.u(48L);
        a8.u(0L);
        a8.o((byte[])this.b);
        a8.o(this.c);
    }

    public g d(ax.Z8.a<?> a8) throws a.b {
        a8.J();
        a8.N();
        a8.U(4);
        this.b = a8.G(8);
        this.c = a8.G(32);
        return this;
    }
}

