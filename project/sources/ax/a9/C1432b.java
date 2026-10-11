package ax.a9;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: ax.a9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1432b<V> extends AbstractFutureC1431a<V> {
    private final a c0;
    private final AtomicBoolean d0 = new AtomicBoolean(false);
    private final ReentrantReadWriteLock e0 = new ReentrantReadWriteLock();
    private final AbstractFutureC1431a<V> q;

    /* renamed from: ax.a9.b$a */
    public interface a {
        void cancel();
    }

    public C1432b(AbstractFutureC1431a<V> abstractFutureC1431a, a aVar) {
        this.q = abstractFutureC1431a;
        this.c0 = aVar;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        this.e0.writeLock().lock();
        try {
            if (!isDone() && !this.d0.getAndSet(true)) {
                this.c0.cancel();
                return true;
            }
            return false;
        } finally {
        }
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        return this.q.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        this.e0.readLock().lock();
        try {
            return this.d0.get();
        } finally {
            this.e0.readLock().unlock();
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        boolean z;
        this.e0.readLock().lock();
        try {
            if (!this.d0.get()) {
                if (!this.q.isDone()) {
                    z = false;
                    return z;
                }
            }
            z = true;
            return z;
        } finally {
            this.e0.readLock().unlock();
        }
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.q.get(j, timeUnit);
    }
}
