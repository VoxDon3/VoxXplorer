/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Qb.O;
import ax.Qb.c;
import ax.Qb.c0;
import ax.Qb.d0;
import java.util.concurrent.locks.LockSupport;

public abstract class e0
extends c0 {
    protected abstract Thread l1();

    protected void m1(long l8, d0.a a8) {
        O.j0.x1(l8, a8);
    }

    protected final void n1() {
        Thread thread = this.l1();
        if (Thread.currentThread() != thread) {
            c.a();
            LockSupport.unpark(thread);
        }
    }
}

