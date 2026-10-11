/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Gb.l;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealConnectionPool;

public final class ConnectionPool {
    private final RealConnectionPool delegate;

    public ConnectionPool() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    public ConnectionPool(int n8, long l8, TimeUnit timeUnit) {
        l.f((Object)timeUnit, "timeUnit");
        this(new RealConnectionPool(TaskRunner.INSTANCE, n8, l8, timeUnit));
    }

    public ConnectionPool(RealConnectionPool realConnectionPool) {
        l.f(realConnectionPool, "delegate");
        this.delegate = realConnectionPool;
    }

    public final int connectionCount() {
        return this.delegate.connectionCount();
    }

    public final void evictAll() {
        this.delegate.evictAll();
    }

    public final RealConnectionPool getDelegate$okhttp() {
        return this.delegate;
    }

    public final int idleConnectionCount() {
        return this.delegate.idleConnectionCount();
    }
}

