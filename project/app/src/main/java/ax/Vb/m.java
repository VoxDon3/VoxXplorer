/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

import ax.Qb.G;
import ax.Qb.I;
import ax.Qb.P;
import ax.Qb.T;
import ax.Vb.r;
import ax.wb.i;
import ax.wb.j;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class m
extends G
implements T {
    private static final AtomicIntegerFieldUpdater i0 = AtomicIntegerFieldUpdater.newUpdater(m.class, "runningWorkers");
    private final G d0;
    private final int e0;
    private final T f0;
    private final r<Runnable> g0;
    private final Object h0;
    private volatile int runningWorkers;

    public m(G object, int n8) {
        this.d0 = object;
        this.e0 = n8;
        object = object instanceof T ? (T)object : null;
        Object object2 = object;
        if (object == null) {
            object2 = P.a();
        }
        this.f0 = object2;
        this.g0 = new r(false);
        this.h0 = new Object();
    }

    private final Runnable b1() {
        Object object;
        while ((object = this.g0.d()) == null) {
            object = this.h0;
            synchronized (object) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
                block5: {
                    atomicIntegerFieldUpdater = i0;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    int n8 = this.g0.c();
                    if (n8 != 0) break block5;
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
        return object;
    }

    private final boolean c1() {
        Object object = this.h0;
        synchronized (object) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
            block4: {
                atomicIntegerFieldUpdater = i0;
                int n8 = atomicIntegerFieldUpdater.get(this);
                int n9 = this.e0;
                if (n8 < n9) break block4;
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override
    public void b(i object, Runnable runnable2) {
        this.g0.a(runnable2);
        if (i0.get(this) < this.e0 && this.c1() && (object = this.b1()) != null) {
            object = new a(this, (Runnable)object);
            this.d0.b(this, (Runnable)object);
        }
    }

    private final class a
    implements Runnable {
        final m c0;
        private Runnable q;

        public a(m m8, Runnable runnable2) {
            this.c0 = m8;
            this.q = runnable2;
        }

        @Override
        public void run() {
            int n8 = 0;
            while (true) {
                int n9;
                try {
                    this.q.run();
                }
                catch (Throwable throwable) {
                    I.a(j.q, throwable);
                }
                Runnable runnable2 = this.c0.b1();
                if (runnable2 == null) {
                    return;
                }
                this.q = runnable2;
                n8 = n9 = n8 + 1;
                if (n9 < 16) continue;
                n8 = n9;
                if (this.c0.d0.f(this.c0)) break;
            }
            this.c0.d0.b(this.c0, this);
        }
    }
}

