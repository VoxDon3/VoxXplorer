package ax.v7;

import java.util.concurrent.Executor;

/* renamed from: ax.v7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
enum EnumC3288a implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
