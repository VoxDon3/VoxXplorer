/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Fb.p;
import ax.wb.i;

final class Q0
implements i.b,
i.c<Q0> {
    public static final Q0 q = new Q0();

    private Q0() {
    }

    @Override
    public <E extends i.b> E a(i.c<E> c8) {
        return i.b.a.b(this, c8);
    }

    @Override
    public i.c<?> getKey() {
        return this;
    }

    @Override
    public i m(i.c<?> c8) {
        return i.b.a.c(this, c8);
    }

    @Override
    public i p(i i8) {
        return i.b.a.d(this, i8);
    }

    @Override
    public <R> R v(R r8, p<? super R, ? super i.b, ? extends R> p8) {
        return i.b.a.a(this, r8, p8);
    }
}

