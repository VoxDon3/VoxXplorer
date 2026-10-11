/*
 * Decompiled with CFR 0.152.
 */
package ax.Ub;

import ax.Fb.p;
import ax.wb.i;

public final class e
implements i {
    private final i c0;
    public final Throwable q;

    public e(Throwable throwable, i i8) {
        this.q = throwable;
        this.c0 = i8;
    }

    @Override
    public <E extends i.b> E a(i.c<E> c8) {
        return this.c0.a(c8);
    }

    @Override
    public i m(i.c<?> c8) {
        return this.c0.m(c8);
    }

    @Override
    public i p(i i8) {
        return this.c0.p(i8);
    }

    @Override
    public <R> R v(R r8, p<? super R, ? super i.b, ? extends R> p8) {
        return this.c0.v(r8, p8);
    }
}

