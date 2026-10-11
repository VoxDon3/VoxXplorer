/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Gb.l;
import ax.sb.t;
import ax.tb.o;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Dispatcher {
    private ExecutorService executorServiceOrNull;
    private Runnable idleCallback;
    private int maxRequests;
    private int maxRequestsPerHost;
    private final ArrayDeque<RealCall.AsyncCall> readyAsyncCalls;
    private final ArrayDeque<RealCall.AsyncCall> runningAsyncCalls;
    private final ArrayDeque<RealCall> runningSyncCalls;

    public Dispatcher() {
        this.maxRequests = 64;
        this.maxRequestsPerHost = 5;
        this.readyAsyncCalls = new ArrayDeque();
        this.runningAsyncCalls = new ArrayDeque();
        this.runningSyncCalls = new ArrayDeque();
    }

    public Dispatcher(ExecutorService executorService) {
        l.f(executorService, "executorService");
        this();
        this.executorServiceOrNull = executorService;
    }

    private final RealCall.AsyncCall findExistingCallWithHost(String string) {
        for (RealCall.AsyncCall asyncCall : this.runningAsyncCalls) {
            if (!l.a(asyncCall.getHost(), string)) continue;
            return asyncCall;
        }
        for (RealCall.AsyncCall asyncCall : this.readyAsyncCalls) {
            if (!l.a(asyncCall.getHost(), string)) continue;
            return asyncCall;
        }
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final <T> void finished(Deque<T> object, T object2) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                try {
                    if (object.remove(object2)) {
                        object2 = this.idleCallback;
                        object = t.a;
                        // MONITOREXIT @DISABLED, blocks:[0, 2, 5] lbl6 : MonitorExitStatement: MONITOREXIT : this
                        if (!this.promoteAndExecute() && object2 != null) {
                            object2.run();
                        }
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                {
                    object = new AssertionError((Object)"Call wasn't in-flight!");
                    throw object;
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private final boolean promoteAndExecute() {
        Object object;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Thread ");
            stringBuilder.append(Thread.currentThread().getName());
            stringBuilder.append(" MUST NOT hold lock on ");
            stringBuilder.append(this);
            throw new AssertionError((Object)stringBuilder.toString());
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        // MONITORENTER : this
        Iterator<RealCall.AsyncCall> iterator = this.readyAsyncCalls.iterator();
        l.e(iterator, "readyAsyncCalls.iterator()");
        while (iterator.hasNext()) {
            object = iterator.next();
            if (this.runningAsyncCalls.size() < this.maxRequests) {
                if (((RealCall.AsyncCall)object).getCallsPerHost().get() >= this.maxRequestsPerHost) continue;
                iterator.remove();
                ((RealCall.AsyncCall)object).getCallsPerHost().incrementAndGet();
                l.e(object, "asyncCall");
                arrayList.add(object);
                this.runningAsyncCalls.add((RealCall.AsyncCall)object);
                continue;
            }
            break;
        }
        int n8 = this.runningCallsCount();
        int n9 = 0;
        boolean bl = n8 > 0;
        object = t.a;
        // MONITOREXIT : this
        n8 = arrayList.size();
        while (n9 < n8) {
            ((RealCall.AsyncCall)arrayList.get(n9)).executeOn(this.executorService());
            ++n9;
        }
        return bl;
    }

    public final ExecutorService -deprecated_executorService() {
        return this.executorService();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void cancelAll() {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                Iterator<Object> iterator;
                try {
                    iterator = this.readyAsyncCalls.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().getCall().cancel();
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                iterator = this.runningAsyncCalls.iterator();
                while (iterator.hasNext()) {
                    iterator.next().getCall().cancel();
                }
                iterator = this.runningSyncCalls.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    ((RealCall)iterator.next()).cancel();
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void enqueue$okhttp(RealCall.AsyncCall object) {
        l.f(object, "call");
        synchronized (this) {
            try {
                RealCall.AsyncCall asyncCall;
                this.readyAsyncCalls.add((RealCall.AsyncCall)object);
                if (!((RealCall.AsyncCall)object).getCall().getForWebSocket() && (asyncCall = this.findExistingCallWithHost(((RealCall.AsyncCall)object).getHost())) != null) {
                    ((RealCall.AsyncCall)object).reuseCallsPerHostFrom(asyncCall);
                }
                object = t.a;
                // MONITOREXIT @DISABLED, blocks:[0, 1] lbl9 : MonitorExitStatement: MONITOREXIT : this
                this.promoteAndExecute();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void executed$okhttp(RealCall realCall) {
        synchronized (this) {
            l.f(realCall, "call");
            this.runningSyncCalls.add(realCall);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ExecutorService executorService() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                Object object;
                block3: {
                    try {
                        if (this.executorServiceOrNull != null) break block3;
                        object = TimeUnit.SECONDS;
                        SynchronousQueue<Runnable> synchronousQueue = new SynchronousQueue<Runnable>();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(Util.okHttpName);
                        stringBuilder.append(" Dispatcher");
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, (TimeUnit)((Object)object), synchronousQueue, Util.threadFactory(stringBuilder.toString(), false));
                        this.executorServiceOrNull = threadPoolExecutor;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = this.executorServiceOrNull;
                l.c(object);
                return object;
            }
            throw throwable2;
        }
    }

    public final void finished$okhttp(RealCall.AsyncCall asyncCall) {
        l.f(asyncCall, "call");
        asyncCall.getCallsPerHost().decrementAndGet();
        this.finished(this.runningAsyncCalls, asyncCall);
    }

    public final void finished$okhttp(RealCall realCall) {
        l.f(realCall, "call");
        this.finished(this.runningSyncCalls, realCall);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Runnable getIdleCallback() {
        synchronized (this) {
            return this.idleCallback;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int getMaxRequests() {
        synchronized (this) {
            return this.maxRequests;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int getMaxRequestsPerHost() {
        synchronized (this) {
            return this.maxRequestsPerHost;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List<Call> queuedCalls() {
        synchronized (this) {
            try {
                Object object = this.readyAsyncCalls;
                ArrayList<Call> arrayList = new ArrayList<Call>(o.s(object, 10));
                object = object.iterator();
                while (true) {
                    if (!object.hasNext()) {
                        arrayList = java.util.DesugarCollections.unmodifiableList(arrayList);
                        l.e(arrayList, "unmodifiableList(readyAsyncCalls.map { it.call })");
                        return arrayList;
                    }
                    arrayList.add(((RealCall.AsyncCall)object.next()).getCall());
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int queuedCallsCount() {
        synchronized (this) {
            return this.readyAsyncCalls.size();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List<Call> runningCalls() {
        synchronized (this) {
            try {
                ArrayDeque<RealCall> arrayDeque = this.runningSyncCalls;
                Object object = this.runningAsyncCalls;
                ArrayList<Call> arrayList = new ArrayList<Call>(o.s(object, 10));
                object = object.iterator();
                while (true) {
                    if (!object.hasNext()) {
                        arrayList = java.util.DesugarCollections.unmodifiableList(o.O(arrayDeque, arrayList));
                        l.e(arrayList, "unmodifiableList(running\u2026yncCalls.map { it.call })");
                        return arrayList;
                    }
                    arrayList.add(((RealCall.AsyncCall)object.next()).getCall());
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int runningCallsCount() {
        synchronized (this) {
            int n8 = this.runningAsyncCalls.size();
            int n9 = this.runningSyncCalls.size();
            return n8 + n9;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void setIdleCallback(Runnable runnable2) {
        synchronized (this) {
            this.idleCallback = runnable2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void setMaxRequests(int n8) {
        if (n8 >= 1) {
            synchronized (this) {
                this.maxRequests = n8;
                t t8 = t.a;
            }
            this.promoteAndExecute();
            return;
        }
        StringBuilder throwable = new StringBuilder();
        throwable.append("max < 1: ");
        throwable.append(n8);
        throw new IllegalArgumentException(throwable.toString().toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void setMaxRequestsPerHost(int n8) {
        if (n8 >= 1) {
            synchronized (this) {
                this.maxRequestsPerHost = n8;
                t t8 = t.a;
            }
            this.promoteAndExecute();
            return;
        }
        StringBuilder throwable = new StringBuilder();
        throwable.append("max < 1: ");
        throwable.append(n8);
        throw new IllegalArgumentException(throwable.toString().toString());
    }
}

