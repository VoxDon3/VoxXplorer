/*
 * Decompiled with CFR 0.152.
 */
package ax.L5;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class p
implements Executor {
    public final Handler q;

    public /* synthetic */ p(Handler handler) {
        this.q = handler;
    }

    @Override
    public final void execute(Runnable runnable2) {
        this.q.post(runnable2);
    }
}

