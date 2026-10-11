/*
 * Decompiled with CFR 0.152.
 */
package ax.x5;

import ax.r5.b;
import ax.x5.M;
import ax.x5.W;
import ax.x5.e;
import ax.z5.a;

public final class N
implements b<M> {
    private final ax.ib.a<a> a;
    private final ax.ib.a<a> b;
    private final ax.ib.a<e> c;
    private final ax.ib.a<W> d;
    private final ax.ib.a<String> e;

    public N(ax.ib.a<a> a8, ax.ib.a<a> a9, ax.ib.a<e> a10, ax.ib.a<W> a11, ax.ib.a<String> a12) {
        this.a = a8;
        this.b = a9;
        this.c = a10;
        this.d = a11;
        this.e = a12;
    }

    public static N a(ax.ib.a<a> a8, ax.ib.a<a> a9, ax.ib.a<e> a10, ax.ib.a<W> a11, ax.ib.a<String> a12) {
        return new N(a8, a9, a10, a11, a12);
    }

    public static M c(a a8, a a9, Object object, Object object2, ax.ib.a<String> a10) {
        return new M(a8, a9, (e)object, (W)((Object)object2), a10);
    }

    public M b() {
        return N.c(this.a.get(), this.b.get(), this.c.get(), (Object)this.d.get(), this.e);
    }
}

