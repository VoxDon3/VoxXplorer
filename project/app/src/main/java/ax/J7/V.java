/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import ax.J7.Z;
import ax.j6.k;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class V
implements Runnable {
    public final Executor c0;
    public final k d0;
    public final Callable q;

    public /* synthetic */ V(Callable callable, Executor executor, k k8) {
        this.q = callable;
        this.c0 = executor;
        this.d0 = k8;
    }

    @Override
    public final void run() {
        Z.e(this.q, this.c0, this.d0);
    }
}

