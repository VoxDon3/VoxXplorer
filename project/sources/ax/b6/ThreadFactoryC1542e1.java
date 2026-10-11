package ax.b6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: ax.b6.e1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class ThreadFactoryC1542e1 implements ThreadFactory {
    private ThreadFactory a = Executors.defaultThreadFactory();

    ThreadFactoryC1542e1(W0 w0) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
