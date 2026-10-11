/*
 * Decompiled with CFR 0.152.
 */
package ax.o1;

import ax.S0.q;
import java.util.concurrent.Executor;

public final class r
implements Executor {
    public final q q;

    public /* synthetic */ r(q q8) {
        this.q = q8;
    }

    @Override
    public final void execute(Runnable runnable2) {
        this.q.c(runnable2);
    }
}

