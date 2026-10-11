/*
 * Decompiled with CFR 0.152.
 */
package ax.p5;

import ax.p5.u;
import ax.r5.b;
import ax.v5.e;
import ax.w5.r;
import ax.w5.v;
import ax.z5.a;

public final class w
implements b<u> {
    private final ax.ib.a<a> a;
    private final ax.ib.a<a> b;
    private final ax.ib.a<e> c;
    private final ax.ib.a<r> d;
    private final ax.ib.a<v> e;

    public w(ax.ib.a<a> a8, ax.ib.a<a> a9, ax.ib.a<e> a10, ax.ib.a<r> a11, ax.ib.a<v> a12) {
        this.a = a8;
        this.b = a9;
        this.c = a10;
        this.d = a11;
        this.e = a12;
    }

    public static w a(ax.ib.a<a> a8, ax.ib.a<a> a9, ax.ib.a<e> a10, ax.ib.a<r> a11, ax.ib.a<v> a12) {
        return new w(a8, a9, a10, a11, a12);
    }

    public static u c(a a8, a a9, e e8, r r8, v v8) {
        return new u(a8, a9, e8, r8, v8);
    }

    public u b() {
        return w.c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}

