/*
 * Decompiled with CFR 0.152.
 */
package ax.a9;

import ax.k9.d;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class b<V>
extends ax.a9.a<V> {
    private final a c0;
    private final AtomicBoolean d0 = new AtomicBoolean(false);
    private final ReentrantReadWriteLock e0 = new ReentrantReadWriteLock();
    private final ax.a9.a<V> q;

    public b(ax.a9.a<V> a8, a a9) {
        this.q = a8;
        this.c0 = a9;
    }

    @Override
    public boolean cancel(boolean bl) {
        Throwable throwable2;
        block5: {
            this.e0.writeLock().lock();
            try {
                if (!this.isDone() && !this.d0.getAndSet(true)) {
                    this.c0.cancel();
                    this.e0.writeLock().unlock();
                    return true;
                }
            }
            catch (Throwable throwable2) {
                break block5;
            }
            this.e0.writeLock().unlock();
            return false;
        }
        try {
            this.d0.set(false);
            throw d.q.a(throwable2);
        }
        catch (Throwable throwable3) {
            this.e0.writeLock().unlock();
            throw throwable3;
        }
    }

    @Override
    public V get() throws InterruptedException, ExecutionException {
        return this.q.get();
    }

    @Override
    public V get(long l8, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.q.get(l8, timeUnit);
    }

    @Override
    public boolean isCancelled() {
        this.e0.readLock().lock();
        try {
            boolean bl = this.d0.get();
            return bl;
        }
        finally {
            this.e0.readLock().unlock();
        }
    }

    @Override
    public boolean isDone() {
        Throwable throwable2;
        block4: {
            boolean bl;
            block3: {
                block2: {
                    this.e0.readLock().lock();
                    try {
                        if (this.d0.get() || (bl = this.q.isDone())) break block2;
                        bl = false;
                        break block3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                bl = true;
            }
            this.e0.readLock().unlock();
            return bl;
        }
        this.e0.readLock().unlock();
        throw throwable2;
    }

    public static interface a {
        public void cancel();
    }
}

