/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Qb.T;
import ax.Qb.Y;
import ax.Qb.c;
import ax.Qb.h0;
import ax.Qb.i0;
import ax.Qb.w0;
import ax.wb.i;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

public final class j0
extends i0
implements T {
    private final Executor e0;

    public j0(Executor executor) {
        this.e0 = executor;
        ax.Vb.c.a(this.a1());
    }

    private final void Z0(i i8, RejectedExecutionException rejectedExecutionException) {
        w0.c(i8, h0.a("The task was rejected", rejectedExecutionException));
    }

    public Executor a1() {
        return this.e0;
    }

    @Override
    public void b(i i8, Runnable runnable2) {
        try {
            Executor executor = this.a1();
            c.a();
            executor.execute(runnable2);
            return;
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            c.a();
            this.Z0(i8, rejectedExecutionException);
            Y.b().b(i8, runnable2);
            return;
        }
    }

    @Override
    public void close() {
        Executor executor = this.a1();
        executor = executor instanceof ExecutorService ? (ExecutorService)executor : null;
        if (executor != null) {
            executor.shutdown();
        }
    }

    public boolean equals(Object object) {
        return object instanceof j0 && ((j0)object).a1() == this.a1();
    }

    public int hashCode() {
        return System.identityHashCode(this.a1());
    }

    @Override
    public String toString() {
        return this.a1().toString();
    }
}

