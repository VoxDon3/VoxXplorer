/*
 * Decompiled with CFR 0.152.
 */
package ax.w5;

import ax.ib.a;
import ax.r5.b;
import ax.w5.v;
import ax.w5.x;
import ax.x5.d;
import java.util.concurrent.Executor;

public final class w
implements b<v> {
    private final a<Executor> a;
    private final a<d> b;
    private final a<x> c;
    private final a<ax.y5.b> d;

    public w(a<Executor> a8, a<d> a9, a<x> a10, a<ax.y5.b> a11) {
        this.a = a8;
        this.b = a9;
        this.c = a10;
        this.d = a11;
    }

    public static w a(a<Executor> a8, a<d> a9, a<x> a10, a<ax.y5.b> a11) {
        return new w(a8, a9, a10, a11);
    }

    public static v c(Executor executor, d d8, x x8, ax.y5.b b8) {
        return new v(executor, d8, x8, b8);
    }

    public v b() {
        return w.c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}

