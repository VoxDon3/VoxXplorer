package ax.H3;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class g extends ThreadPoolExecutor implements AutoCloseable {
    private final ConcurrentHashMap<String, WeakReference<Runnable>> q;

    public g(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory);
        this.q = new ConcurrentHashMap<>();
    }

    public Runnable a(String str) {
        WeakReference<Runnable> weakReference = this.q.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        this.q.remove(runnable.toString());
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        this.q.put(runnable.toString(), new WeakReference<>(runnable));
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        ax.Z.g.a(this);
    }
}
