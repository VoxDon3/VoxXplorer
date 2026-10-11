package ax.j6;

import android.os.Handler;
import android.os.Looper;
import ax.c6.HandlerC1845a;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class J implements Executor {
    private final Handler q = new HandlerC1845a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.q.post(runnable);
    }
}
