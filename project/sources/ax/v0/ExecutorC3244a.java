package ax.v0;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: ax.v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC3244a implements Executor {
    public final /* synthetic */ Handler q;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.q.post(runnable);
    }
}
