package ax.ac;

import java.util.concurrent.Executor;

/* renamed from: ax.ac.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class ExecutorC1436a implements Executor {
    public static final ExecutorC1436a q = new ExecutorC1436a();

    private ExecutorC1436a() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
