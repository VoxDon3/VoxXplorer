/*
 * Decompiled with CFR 0.152.
 */
package ax.va;

import ax.pa.d;
import ax.va.c;
import ax.wa.b;
import java.io.IOException;

public abstract class b<T extends ax.wa.b>
extends ax.ra.d<c<T>> {
    private final long b;
    private final Long c;

    public b(long l8, Long l9) {
        super(ax.va.a.j0.h());
        this.b = l8;
        this.c = l9;
    }

    @Override
    public void a(d d8) throws IOException {
        d8.f();
        d8.c(this.e().h());
        d8.c(this.e().h());
        d8.g();
        d8.c(0);
        d8.f();
        d8.d(this.b);
        if (d8.h(this.c)) {
            d8.d(this.c);
        }
    }

    public abstract ax.wa.a e();

    public static class a
    extends b<b.a> {
        public a(long l8, Long l9) {
            super(l8, l9);
        }

        @Override
        public ax.wa.a e() {
            return ax.wa.a.d0;
        }

        public c<b.a> f() {
            return new c.a();
        }
    }
}

