/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Fb.l;
import ax.Qb.u0;
import ax.sb.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

final class q0
extends u0 {
    private static final AtomicIntegerFieldUpdater g0 = AtomicIntegerFieldUpdater.newUpdater(q0.class, "_invoked");
    private volatile int _invoked;
    private final l<Throwable, t> f0;

    public q0(l<? super Throwable, t> l8) {
        this.f0 = l8;
    }

    @Override
    public void x(Throwable throwable) {
        if (g0.compareAndSet(this, 0, 1)) {
            this.f0.invoke(throwable);
        }
    }
}

