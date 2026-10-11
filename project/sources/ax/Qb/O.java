package ax.Qb;

import ax.Qb.AbstractC0930d0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes3.dex */
public final class O extends AbstractC0930d0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final O j0;
    private static final long k0;

    static {
        Long l;
        O o = new O();
        j0 = o;
        AbstractC0928c0.f1(o, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        k0 = timeUnit.toNanos(l.longValue());
    }

    private O() {
    }

    private final synchronized void B1() {
        if (E1()) {
            debugStatus = 3;
            w1();
            ax.Gb.l.d(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread C1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean D1() {
        return debugStatus == 4;
    }

    private final boolean E1() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    private final synchronized boolean F1() {
        if (E1()) {
            return false;
        }
        debugStatus = 1;
        ax.Gb.l.d(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void G1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // ax.Qb.AbstractC0932e0
    protected Thread l1() {
        Thread thread = _thread;
        return thread == null ? C1() : thread;
    }

    @Override // ax.Qb.AbstractC0932e0
    protected void m1(long j, AbstractC0930d0.a aVar) {
        G1();
    }

    @Override // ax.Qb.AbstractC0930d0
    public void r1(Runnable runnable) {
        if (D1()) {
            G1();
        }
        super.r1(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean u1;
        N0.a.d(this);
        C0927c.a();
        try {
            if (!F1()) {
                if (u1) {
                    return;
                } else {
                    return;
                }
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long i1 = i1();
                if (i1 == Long.MAX_VALUE) {
                    C0927c.a();
                    long nanoTime = System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = k0 + nanoTime;
                    }
                    long j2 = j - nanoTime;
                    if (j2 <= 0) {
                        _thread = null;
                        B1();
                        C0927c.a();
                        if (u1()) {
                            return;
                        }
                        l1();
                        return;
                    }
                    i1 = ax.Lb.f.e(i1, j2);
                } else {
                    j = Long.MAX_VALUE;
                }
                if (i1 > 0) {
                    if (E1()) {
                        _thread = null;
                        B1();
                        C0927c.a();
                        if (u1()) {
                            return;
                        }
                        l1();
                        return;
                    }
                    C0927c.a();
                    LockSupport.parkNanos(this, i1);
                }
            }
        } finally {
            _thread = null;
            B1();
            C0927c.a();
            if (!u1()) {
                l1();
            }
        }
    }

    @Override // ax.Qb.AbstractC0930d0, ax.Qb.AbstractC0928c0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
