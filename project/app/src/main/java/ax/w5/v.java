/*
 * Decompiled with CFR 0.152.
 */
package ax.w5;

import ax.p5.p;
import ax.w5.t;
import ax.w5.u;
import ax.w5.x;
import ax.x5.d;
import ax.y5.b;
import java.util.concurrent.Executor;

public class v {
    private final Executor a;
    private final d b;
    private final x c;
    private final b d;

    v(Executor executor, d d8, x x8, b b8) {
        this.a = executor;
        this.b = d8;
        this.c = x8;
        this.d = b8;
    }

    public static /* synthetic */ Object a(v v8) {
        for (p p8 : v8.b.Q()) {
            v8.c.a(p8, 1);
        }
        return null;
    }

    public static /* synthetic */ void b(v v8) {
        v8.d.a(new u(v8));
    }

    public void c() {
        this.a.execute(new t(this));
    }
}

