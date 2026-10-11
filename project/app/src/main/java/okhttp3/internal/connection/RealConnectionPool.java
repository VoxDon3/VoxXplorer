/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.connection;

import ax.Gb.g;
import ax.Gb.l;
import ax.i.s;
import ax.sb.t;
import ax.tb.o;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import okhttp3.Address;
import okhttp3.ConnectionPool;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RealConnectionPool;
import okhttp3.internal.platform.Platform;

public final class RealConnectionPool {
    public static final Companion Companion = new Companion(null);
    private final TaskQueue cleanupQueue;
    private final cleanupTask.1 cleanupTask;
    private final ConcurrentLinkedQueue<RealConnection> connections;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;

    public RealConnectionPool(TaskRunner object, int n8, long l8, TimeUnit timeUnit) {
        l.f(object, "taskRunner");
        l.f((Object)timeUnit, "timeUnit");
        this.maxIdleConnections = n8;
        this.keepAliveDurationNs = timeUnit.toNanos(l8);
        this.cleanupQueue = ((TaskRunner)object).newQueue();
        object = new StringBuilder();
        ((StringBuilder)object).append(Util.okHttpName);
        ((StringBuilder)object).append(" ConnectionPool");
        this.cleanupTask = new Task(this, ((StringBuilder)object).toString()){
            final RealConnectionPool this$0;
            {
                this.this$0 = realConnectionPool;
                super(string, false, 2, null);
            }

            public long runOnce() {
                return this.this$0.cleanup(System.nanoTime());
            }
        };
        this.connections = new ConcurrentLinkedQueue();
        if (l8 > 0L) {
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("keepAliveDuration <= 0: ");
        ((StringBuilder)object).append(l8);
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    private final int pruneAndGetAllocationCount(RealConnection realConnection, long l8) {
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Thread ");
            stringBuilder.append(Thread.currentThread().getName());
            stringBuilder.append(" MUST hold lock on ");
            stringBuilder.append(realConnection);
            throw new AssertionError((Object)stringBuilder.toString());
        }
        List<Reference<RealCall>> list = realConnection.getCalls();
        int n8 = 0;
        while (n8 < list.size()) {
            RealCall.CallReference callReference = list.get(n8);
            if (callReference.get() != null) {
                ++n8;
                continue;
            }
            l.d(callReference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
            callReference = callReference;
            CharSequence charSequence = new StringBuilder();
            charSequence.append("A connection to ");
            charSequence.append(realConnection.route().address().url());
            charSequence.append(" was leaked. Did you forget to close a response body?");
            charSequence = charSequence.toString();
            Platform.Companion.get().logCloseableLeak((String)charSequence, callReference.getCallStackTrace());
            list.remove(n8);
            realConnection.setNoNewExchanges(true);
            if (!list.isEmpty()) continue;
            realConnection.setIdleAtNs$okhttp(l8 - this.keepAliveDurationNs);
            return 0;
        }
        return list.size();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean callAcquirePooledConnection(Address address, RealCall realCall, List<Route> list, boolean bl) {
        Throwable throwable2;
        l.f(address, "address");
        l.f(realCall, "call");
        Iterator<RealConnection> iterator = this.connections.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                return false;
            }
            RealConnection realConnection = iterator.next();
            l.e(realConnection, "connection");
            synchronized (realConnection) {
                block7: {
                    if (bl) {
                        try {
                            if (!realConnection.isMultiplexed$okhttp()) break block7;
                        }
                        catch (Throwable throwable2) {
                            break;
                        }
                    }
                    if (realConnection.isEligible$okhttp(address, list)) {
                        realCall.acquireConnectionNoEvents(realConnection);
                        return true;
                    }
                }
                t t8 = t.a;
            }
        }
        {
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long cleanup(long l8) {
        long l9;
        Iterator<RealConnection> iterator = this.connections.iterator();
        int n8 = 0;
        long l10 = Long.MIN_VALUE;
        RealConnection realConnection = null;
        int n9 = 0;
        while (iterator.hasNext()) {
            RealConnection realConnection2 = iterator.next();
            l.e(realConnection2, "connection");
            synchronized (realConnection2) {
                if (this.pruneAndGetAllocationCount(realConnection2, l8) > 0) {
                    ++n9;
                } else {
                    ++n8;
                    long l11 = l8 - realConnection2.getIdleAtNs$okhttp();
                    l9 = l10;
                    if (l11 > l10) {
                        realConnection = realConnection2;
                        l9 = l11;
                    }
                    t t8 = t.a;
                    l10 = l9;
                }
            }
        }
        l9 = this.keepAliveDurationNs;
        if (l10 < l9 && n8 <= this.maxIdleConnections) {
            if (n8 > 0) {
                return l9 - l10;
            }
            if (n9 > 0) {
                return l9;
            }
            return -1L;
        }
        l.c(realConnection);
        synchronized (realConnection) {
            boolean bl = ((Collection)realConnection.getCalls()).isEmpty();
            if (!bl) {
                return 0L;
            }
            l9 = realConnection.getIdleAtNs$okhttp();
            if (l9 + l10 != l8) {
                return 0L;
            }
            realConnection.setNoNewExchanges(true);
            this.connections.remove(realConnection);
        }
        Util.closeQuietly(realConnection.socket());
        if (this.connections.isEmpty()) {
            this.cleanupQueue.cancelAll();
        }
        return 0L;
    }

    public final boolean connectionBecameIdle(RealConnection realConnection) {
        l.f(realConnection, "connection");
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Thread ");
            stringBuilder.append(Thread.currentThread().getName());
            stringBuilder.append(" MUST hold lock on ");
            stringBuilder.append(realConnection);
            throw new AssertionError((Object)stringBuilder.toString());
        }
        if (!realConnection.getNoNewExchanges() && this.maxIdleConnections != 0) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return false;
        }
        realConnection.setNoNewExchanges(true);
        this.connections.remove(realConnection);
        if (this.connections.isEmpty()) {
            this.cleanupQueue.cancelAll();
        }
        return true;
    }

    public final int connectionCount() {
        return this.connections.size();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void evictAll() {
        Iterator<RealConnection> iterator = this.connections.iterator();
        l.e(iterator, "connections.iterator()");
        while (true) {
            Socket socket;
            block6: {
                block5: {
                    if (!iterator.hasNext()) {
                        if (!this.connections.isEmpty()) return;
                        this.cleanupQueue.cancelAll();
                        return;
                    }
                    RealConnection realConnection = iterator.next();
                    l.e(realConnection, "connection");
                    // MONITORENTER : realConnection
                    if (!realConnection.getCalls().isEmpty()) break block5;
                    iterator.remove();
                    realConnection.setNoNewExchanges(true);
                    socket = realConnection.socket();
                    break block6;
                }
                socket = null;
            }
            // MONITOREXIT : realConnection
            if (socket == null) continue;
            Util.closeQuietly(socket);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int idleConnectionCount() {
        Object object = this.connections;
        boolean bl = s.a(object);
        int n8 = 0;
        if (bl && object.isEmpty()) {
            return 0;
        }
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            int n9;
            object = (RealConnection)iterator.next();
            l.e(object, "it");
            synchronized (object) {
                bl = ((RealConnection)object).getCalls().isEmpty();
                if (!bl) continue;
            }
            n8 = n9 = n8 + 1;
            if (n9 >= 0) continue;
            o.q();
            n8 = n9;
        }
        return n8;
    }

    public final void put(RealConnection realConnection) {
        l.f(realConnection, "connection");
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Thread ");
            stringBuilder.append(Thread.currentThread().getName());
            stringBuilder.append(" MUST hold lock on ");
            stringBuilder.append(realConnection);
            throw new AssertionError((Object)stringBuilder.toString());
        }
        this.connections.add(realConnection);
        TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public final RealConnectionPool get(ConnectionPool connectionPool) {
            l.f(connectionPool, "connectionPool");
            return connectionPool.getDelegate$okhttp();
        }
    }
}

