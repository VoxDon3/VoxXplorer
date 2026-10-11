/*
 * Decompiled with CFR 0.152.
 */
package ax.wb;

import ax.Fb.p;
import ax.Gb.l;
import ax.wb.i;

public abstract class a
implements i.b {
    private final i.c<?> q;

    public a(i.c<?> c8) {
        l.f(c8, "key");
        this.q = c8;
    }

    @Override
    public <E extends i.b> E a(i.c<E> c8) {
        return i.b.a.b(this, c8);
    }

    @Override
    public i.c<?> getKey() {
        return this.q;
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

