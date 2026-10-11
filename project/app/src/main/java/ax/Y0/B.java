/*
 * Decompiled with CFR 0.152.
 */
package ax.Y0;

import ax.S0.f;
import java.util.concurrent.Executor;

public final class B
implements Executor {
    public final f q;

    public /* synthetic */ B(f f8) {
        this.q = f8;
    }

    @Override
    public final void execute(Runnable runnable2) {
        this.q.e(runnable2);
    }
}

