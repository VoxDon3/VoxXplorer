/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Gb.l;
import ax.Lb.f;
import ax.Qb.N0;
import ax.Qb.c;
import ax.Qb.c0;
import ax.Qb.d0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public final class O
extends d0
implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final O j0;
    private static final long k0;

    static {
        Object object = new O();
        j0 = object;
        ax.Qb.c0.f1((c0)object, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            object = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        }
        catch (SecurityException securityException) {
            object = 1000L;
        }
        k0 = timeUnit.toNanos((Long)object);
    }

    private O() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void B1() {
        synchronized (this) {
            boolean bl = this.E1();
            if (!bl) {
                return;
            }
            debugStatus = 3;
            this.w1();
            l.d(this, "null cannot be cast to non-null type java.lang.Object");
            this.notifyAll();
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Thread C1() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Thread thread;
                block4: {
                    try {
                        Thread thread2;
                        thread = thread2 = _thread;
                        if (thread2 != null) break block4;
                        _thread = thread = new Thread((Runnable)this, "kotlinx.coroutines.DefaultExecutor");
                        thread.setDaemon(true);
                        thread.start();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return thread;
            }
            throw throwable2;
        }
    }

    private final boolean D1() {
        return debugStatus == 4;
    }

    private final boolean E1() {
        int n8 = debugStatus;
        return n8 == 2 || n8 == 3;
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean F1() {
        synchronized (this) {
            boolean bl = this.E1();
            if (bl) {
                return false;
            }
            debugStatus = 1;
            l.d(this, "null cannot be cast to non-null type java.lang.Object");
            this.notifyAll();
            return true;
        }
    }

    private final void G1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override
    protected Thread l1() {
        Thread thread;
        Thread thread2 = thread = _thread;
        if (thread == null) {
            thread2 = this.C1();
        }
        return thread2;
    }

    @Override
    protected void m1(long l8, d0.a a8) {
        this.G1();
    }

    @Override
    public void r1(Runnable runnable2) {
        if (this.D1()) {
            this.G1();
        }
        super.r1(runnable2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        block11: {
            N0.a.d(this);
            c.a();
            try {
                var9_1 = this.F1();
                if (var9_1) break block11;
                O._thread = null;
                this.B1();
            }
            catch (Throwable var10_6) {}
            c.a();
            if (this.u1()) return;
            this.l1();
            return;
        }
        var3_2 = 0x7FFFFFFFFFFFFFFFL;
        while (true) {
            Thread.interrupted();
            var5_4 = this.i1();
            if (var5_4 != 0x7FFFFFFFFFFFFFFFL) ** GOTO lbl44
            c.a();
            var7_5 = System.nanoTime();
            var1_3 = var3_2;
            if (var3_2 != 0x7FFFFFFFFFFFFFFFL) ** break block12
            var1_3 = O.k0;
            var1_3 += var7_5;
            break;
        }
        {
            block13: {
                block14: {
                    if ((var3_2 = var1_3 - var7_5) <= 0L) {
                        O._thread = null;
                        this.B1();
                        c.a();
                        if (this.u1()) return;
                        this.l1();
                        return;
                    }
                    var5_4 = f.e(var5_4, var3_2);
                    break block14;
lbl44:
                    // 1 sources

                    var1_3 = 0x7FFFFFFFFFFFFFFFL;
                }
                var3_2 = var1_3;
                if (var5_4 <= 0L) continue;
                var9_1 = this.E1();
                if (!var9_1) break block13;
                O._thread = null;
                this.B1();
                c.a();
                if (this.u1()) return;
                this.l1();
                return;
            }
            c.a();
            LockSupport.parkNanos(this, var5_4);
            var3_2 = var1_3;
            continue;
        }
        O._thread = null;
        this.B1();
        c.a();
        if (this.u1()) throw var10_6;
        this.l1();
        throw var10_6;
    }

    @Override
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}

