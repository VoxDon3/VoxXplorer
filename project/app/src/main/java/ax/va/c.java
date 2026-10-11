/*
 * Decompiled with CFR 0.152.
 */
package ax.va;

import ax.ra.e;
import ax.wa.b;
import java.io.IOException;

public abstract class c<T extends b>
extends e {
    private T b;
    private long c;
    private Long d;

    @Override
    public void d(ax.pa.c c8) throws IOException {
        T t8 = this.e();
        this.b = t8;
        c8.k(t8);
        c8.a(ax.qa.a.e0);
        this.c = c8.h();
        if (c8.j() != 0) {
            this.d = c8.h();
            return;
        }
        this.d = null;
    }

    abstract T e();

    public Long f() {
        return this.d;
    }

    public T g() {
        return this.b;
    }

    public static class a
    extends c<b.a> {
        b.a h() {
            return new b.a();
        }
    }
}

