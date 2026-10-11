/*
 * Decompiled with CFR 0.152.
 */
package ax.j6;

import android.os.Handler;
import android.os.Looper;
import ax.c6.a;
import java.util.concurrent.Executor;

final class J
implements Executor {
    private final Handler q = new a(Looper.getMainLooper());

    @Override
    public final void execute(Runnable runnable2) {
        this.q.post(runnable2);
    }
}

