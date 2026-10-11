/*
 * Decompiled with CFR 0.152.
 */
package ax.y1;

import ax.q1.D;
import ax.q1.N;
import ax.q1.O;
import ax.q1.U;
import ax.q1.t;

public final class e
implements t {
    private final t c0;
    private final long q;

    public e(long l8, t t8) {
        this.q = l8;
        this.c0 = t8;
    }

    @Override
    public void h(N n8) {
        this.c0.h(new D(this, n8, n8){
            final N b;
            final e c;
            {
                this.c = e8;
                this.b = n9;
                super(n8);
            }

            @Override
            public N.a l(long l8) {
                Object object = this.b.l(l8);
                O o8 = ((N.a)object).a;
                o8 = new O(o8.a, o8.b + this.c.q);
                object = ((N.a)object).b;
                return new N.a(o8, new O(((O)object).a, ((O)object).b + this.c.q));
            }
        });
    }

    @Override
    public void o() {
        this.c0.o();
    }

    @Override
    public U u(int n8, int n9) {
        return this.c0.u(n8, n9);
    }
}

