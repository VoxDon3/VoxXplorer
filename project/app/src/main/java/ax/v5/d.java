/*
 * Decompiled with CFR 0.152.
 */
package ax.v5;

import ax.ib.a;
import ax.q5.e;
import ax.r5.b;
import ax.v5.c;
import ax.w5.x;
import java.util.concurrent.Executor;

public final class d
implements b<c> {
    private final a<Executor> a;
    private final a<e> b;
    private final a<x> c;
    private final a<ax.x5.d> d;
    private final a<ax.y5.b> e;

    public d(a<Executor> a8, a<e> a9, a<x> a10, a<ax.x5.d> a11, a<ax.y5.b> a12) {
        this.a = a8;
        this.b = a9;
        this.c = a10;
        this.d = a11;
        this.e = a12;
    }

    public static d a(a<Executor> a8, a<e> a9, a<x> a10, a<ax.x5.d> a11, a<ax.y5.b> a12) {
        return new d(a8, a9, a10, a11, a12);
    }

    public static c c(Executor executor, e e8, x x8, ax.x5.d d8, ax.y5.b b8) {
        return new c(executor, e8, x8, d8, b8);
    }

    public c b() {
        return ax.v5.d.c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}

