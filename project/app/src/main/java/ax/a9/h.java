/*
 * Decompiled with CFR 0.152.
 */
package ax.a9;

import ax.a9.a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class h<T, V>
extends a<V> {
    private a.a<T, V> c0;
    private Future<T> q;

    public h(Future<T> future, a.a<T, V> a8) {
        this.q = future;
        this.c0 = a8;
    }

    @Override
    public boolean cancel(boolean bl) {
        return this.q.cancel(bl);
    }

    @Override
    public V get() throws InterruptedException, ExecutionException {
        return this.c0.apply(this.q.get());
    }

    @Override
    public V get(long l8, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.c0.apply(this.q.get(l8, timeUnit));
    }

    @Override
    public boolean isCancelled() {
        return this.q.isCancelled();
    }

    @Override
    public boolean isDone() {
        return this.q.isDone();
    }
}

