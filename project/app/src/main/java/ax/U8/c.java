/*
 * Decompiled with CFR 0.152.
 */
package ax.U8;

import ax.U8.a;
import ax.U8.b;
import ax.Z8.a;

public class c
extends b<byte[]> {
    c() {
        super(ax.U8.a.m0);
    }

    @Override
    public void c(ax.Z8.a<?> a8) {
        a8.s((int)this.a.getValue());
        a8.s(((byte[])this.b).length);
        a8.o((byte[])this.b);
    }

    public b<byte[]> d(ax.Z8.a<?> a8) throws a.b {
        this.b = a8.G(a8.J());
        return this;
    }
}

