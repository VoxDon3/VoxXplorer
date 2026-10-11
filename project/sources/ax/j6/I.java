package ax.j6;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class I implements Executor {
    I() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
