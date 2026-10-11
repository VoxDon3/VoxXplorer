/*
 * Decompiled with CFR 0.152.
 */
package ax.a9;

import ax.a9.a;
import ax.a9.e;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class f<V>
extends a<V> {
    private e<V, ?> q;

    public f(e<V, ?> e8) {
        this.q = e8;
    }

    @Override
    public boolean cancel(boolean bl) {
        return false;
    }

    @Override
    public V get() throws ExecutionException {
        V v8;
        try {
            v8 = this.q.e();
        }
        catch (Throwable throwable) {
            throw new ExecutionException(throwable);
        }
        return v8;
    }

    @Override
    public V get(long l8, TimeUnit timeUnit) throws ExecutionException {
        try {
            timeUnit = this.q.f(l8, timeUnit);
        }
        catch (Throwable throwable) {
            throw new ExecutionException(throwable);
        }
        return (V)((Object)timeUnit);
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public boolean isDone() {
        return this.q.d();
    }
}

