/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Qb.r;
import ax.Qb.s0;
import ax.Qb.t;
import ax.Qb.u0;

public final class s
extends u0
implements r {
    public final t f0;

    public s(t t8) {
        this.f0 = t8;
    }

    @Override
    public s0 getParent() {
        return this.y();
    }

    @Override
    public boolean h(Throwable throwable) {
        return this.y().I(throwable);
    }

    @Override
    public void x(Throwable throwable) {
        this.f0.F0(this.y());
    }
}

