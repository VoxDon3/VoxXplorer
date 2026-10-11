/*
 * Decompiled with CFR 0.152.
 */
package ax.n0;

import ax.Gb.l;
import ax.n0.n;

final class h<T>
extends n<T> {
    private final Throwable a;

    public h(Throwable throwable) {
        l.f(throwable, "finalException");
        super(null);
        this.a = throwable;
    }

    public final Throwable a() {
        return this.a;
    }
}

