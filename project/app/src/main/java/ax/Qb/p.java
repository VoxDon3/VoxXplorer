/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Qb.z;
import ax.wb.e;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class p
extends z {
    private static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(p.class, "_resumed");
    private volatile int _resumed;

    public p(e<?> e8, Throwable serializable, boolean bl) {
        Throwable throwable = serializable;
        if (serializable == null) {
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append("Continuation ");
            ((StringBuilder)serializable).append(e8);
            ((StringBuilder)serializable).append(" was cancelled normally");
            throwable = new CancellationException(((StringBuilder)serializable).toString());
        }
        super(throwable, bl);
        this._resumed = 0;
    }

    public final boolean c() {
        return c.compareAndSet(this, 0, 1);
    }
}

