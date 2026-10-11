/*
 * Decompiled with CFR 0.152.
 */
package ax.Xb;

import ax.Gb.g;
import ax.Gb.v;
import ax.Lb.f;
import ax.Qb.N;
import ax.Vb.A;
import ax.Vb.F;
import ax.Xb.h;
import ax.Xb.i;
import ax.Xb.k;
import ax.Xb.l;
import ax.Xb.n;
import ax.sb.t;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

public final class a
implements Executor,
Closeable,
AutoCloseable {
    public static final a i0 = new a(null);
    private static final AtomicLongFieldUpdater j0 = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");
    private static final AtomicLongFieldUpdater k0 = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");
    private static final AtomicIntegerFieldUpdater l0 = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");
    public static final F m0 = new F("NOT_IN_STACK");
    private volatile int _isTerminated;
    public final int c0;
    private volatile long controlState;
    public final long d0;
    public final String e0;
    public final ax.Xb.d f0;
    public final ax.Xb.d g0;
    public final A<c> h0;
    private volatile long parkedWorkersStack;
    public final int q;

    public a(int n8, int n9, long l8, String charSequence) {
        this.q = n8;
        this.c0 = n9;
        this.d0 = l8;
        this.e0 = charSequence;
        if (n8 >= 1) {
            if (n9 >= n8) {
                if (n9 <= 0x1FFFFE) {
                    if (l8 > 0L) {
                        this.f0 = new ax.Xb.d();
                        this.g0 = new ax.Xb.d();
                        this.h0 = new A((n8 + 1) * 2);
                        this.controlState = (long)n8 << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("Idle worker keep alive time ");
                    ((StringBuilder)charSequence).append(l8);
                    ((StringBuilder)charSequence).append(" must be positive");
                    throw new IllegalArgumentException(((StringBuilder)charSequence).toString().toString());
                }
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("Max pool size ");
                ((StringBuilder)charSequence).append(n9);
                ((StringBuilder)charSequence).append(" should not exceed maximal supported number of threads 2097150");
                throw new IllegalArgumentException(((StringBuilder)charSequence).toString().toString());
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Max pool size ");
            ((StringBuilder)charSequence).append(n9);
            ((StringBuilder)charSequence).append(" should be greater than or equals to core pool size ");
            ((StringBuilder)charSequence).append(n8);
            throw new IllegalArgumentException(((StringBuilder)charSequence).toString().toString());
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("Core pool size ");
        ((StringBuilder)charSequence).append(n8);
        ((StringBuilder)charSequence).append(" should be at least 1");
        throw new IllegalArgumentException(((StringBuilder)charSequence).toString().toString());
    }

    private final void H(long l8, boolean bl) {
        if (bl || this.u0() || this.o0(l8)) {
            return;
        }
        this.u0();
    }

    private final boolean b(h h8) {
        if (h8.c0.b() == 1) {
            return this.g0.a(h8);
        }
        return this.f0.a(h8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final int c() {
        A<c> a8 = this.h0;
        synchronized (a8) {
            Throwable throwable2;
            block13: {
                block12: {
                    int n8;
                    int n9;
                    long l8;
                    AtomicLongFieldUpdater atomicLongFieldUpdater;
                    block11: {
                        int n10;
                        block10: {
                            block9: {
                                try {
                                    boolean bl = this.isTerminated();
                                    if (!bl) break block9;
                                }
                                catch (Throwable throwable2) {}
                                return -1;
                            }
                            atomicLongFieldUpdater = k0;
                            l8 = atomicLongFieldUpdater.get(this);
                            n9 = (int)(l8 & 0x1FFFFFL);
                            n8 = f.b(n9 - (int)((l8 & 0x3FFFFE00000L) >> 21), 0);
                            n10 = this.q;
                            if (n8 < n10) break block10;
                            return 0;
                        }
                        n10 = this.c0;
                        if (n9 < n10) break block11;
                        return 0;
                    }
                    n9 = (int)(a.k0.get(this) & 0x1FFFFFL) + 1;
                    if (n9 <= 0 || this.h0.b(n9) != null) break block12;
                    Object object = new c(this, n9);
                    this.h0.c(n9, (c)object);
                    l8 = atomicLongFieldUpdater.incrementAndGet(this);
                    if (n9 == (int)(0x1FFFFFL & l8)) {
                        // MONITOREXIT @DISABLED, blocks:[6, 8] lbl30 : MonitorExitStatement: MONITOREXIT : var7_1
                        ((Thread)object).start();
                        return n8 + 1;
                    }
                    object = new IllegalArgumentException("Failed requirement.");
                    throw object;
                    break block13;
                }
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Failed requirement.");
                throw illegalArgumentException;
            }
            throw throwable2;
        }
    }

    private final h d0(c c8, h h8, boolean bl) {
        if (c8 == null || c8.d0 == d.f0) {
            return h8;
        }
        if (h8.c0.b() == 0 && c8.d0 == d.c0) {
            return h8;
        }
        c8.h0 = true;
        return c8.q.a(h8, bl);
    }

    private final c f() {
        Thread thread = Thread.currentThread();
        thread = thread instanceof c ? (c)thread : null;
        if (thread != null && ax.Gb.l.a(((c)thread).i0, this)) {
            return thread;
        }
        return null;
    }

    public static /* synthetic */ void m(a a8, Runnable runnable2, i i8, boolean bl, int n8, Object object) {
        if ((n8 & 2) != 0) {
            i8 = l.g;
        }
        if ((n8 & 4) != 0) {
            bl = false;
        }
        a8.g(runnable2, i8, bl);
    }

    private final int o(c object) {
        object = ((c)object).i();
        while (object != m0) {
            if (object == null) {
                return 0;
            }
            int n8 = ((c)(object = (c)object)).h();
            if (n8 != 0) {
                return n8;
            }
            object = ((c)object).i();
        }
        return -1;
    }

    private final boolean o0(long l8) {
        if (f.b((int)(0x1FFFFFL & l8) - (int)((l8 & 0x3FFFFE00000L) >> 21), 0) < this.q) {
            int n8 = this.c();
            if (n8 == 1 && this.q > 1) {
                this.c();
            }
            if (n8 > 0) {
                return true;
            }
        }
        return false;
    }

    private final c p() {
        long l8;
        c c8;
        int n8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = j0;
        do {
            if ((c8 = this.h0.b(n8 = (int)(0x1FFFFFL & (l8 = atomicLongFieldUpdater.get(this))))) != null) continue;
            return null;
        } while ((n8 = this.o(c8)) < 0 || !j0.compareAndSet(this, l8, (long)n8 | 0x200000L + l8 & 0xFFFFFFFFFFE00000L));
        c8.r(m0);
        return c8;
    }

    static /* synthetic */ boolean s0(a a8, long l8, int n8, Object object) {
        if ((n8 & 1) != 0) {
            l8 = k0.get(a8);
        }
        return a8.o0(l8);
    }

    private final boolean u0() {
        c c8;
        do {
            if ((c8 = this.p()) != null) continue;
            return false;
        } while (!c.j().compareAndSet(c8, -1, 0));
        LockSupport.unpark(c8);
        return true;
    }

    public final void A(h h8) {
        try {
            h8.run();
        }
        catch (Throwable throwable) {
            try {
                Thread thread = Thread.currentThread();
                thread.getUncaughtExceptionHandler().uncaughtException(thread, throwable);
                return;
            }
            finally {
                ax.Qb.c.a();
            }
        }
        ax.Qb.c.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void F(long l8) {
        if (!l0.compareAndSet(this, 0, 1)) {
            return;
        }
        c c8 = this.f();
        Object object = this.h0;
        // MONITORENTER : object
        long l9 = a.k0.get(this);
        int n8 = (int)(l9 & 0x1FFFFFL);
        // MONITOREXIT : object
        if (1 <= n8) {
            int n9 = 1;
            while (true) {
                object = this.h0.b(n9);
                ax.Gb.l.c(object);
                object = (c)object;
                if (object != c8) {
                    while (((Thread)object).isAlive()) {
                        LockSupport.unpark((Thread)object);
                        ((Thread)object).join(l8);
                    }
                    ((c)object).q.f(this.g0);
                }
                if (n9 == n8) break;
                ++n9;
            }
        }
        this.g0.b();
        this.f0.b();
        while (true) {
            block15: {
                h h8;
                block14: {
                    if (c8 == null) break block14;
                    h8 = c8.g(true);
                    object = h8;
                    if (h8 != null) break block15;
                }
                h8 = (h)this.f0.d();
                object = h8;
                if (h8 == null) {
                    h8 = (h)this.g0.d();
                    object = h8;
                    if (h8 == null) {
                        if (c8 != null) {
                            c8.u(d.f0);
                        }
                        j0.set(this, 0L);
                        k0.set(this, 0L);
                        return;
                    }
                }
            }
            this.A((h)object);
        }
    }

    public final void L() {
        if (this.u0() || a.s0(this, 0L, 1, null)) {
            return;
        }
        this.u0();
    }

    @Override
    public void close() {
        this.F(10000L);
    }

    public final h e(Runnable runnable2, i i8) {
        long l8 = l.f.a();
        if (runnable2 instanceof h) {
            runnable2 = (h)runnable2;
            ((h)runnable2).q = l8;
            ((h)runnable2).c0 = i8;
            return runnable2;
        }
        return new k(runnable2, l8, i8);
    }

    @Override
    public void execute(Runnable runnable2) {
        a.m(this, runnable2, null, false, 6, null);
    }

    public final void g(Runnable object, i object2, boolean bl) {
        ax.Qb.c.a();
        object2 = this.e((Runnable)object, (i)object2);
        int n8 = ((h)object2).c0.b();
        boolean bl2 = false;
        n8 = n8 == 1 ? 1 : 0;
        long l8 = n8 != 0 ? k0.addAndGet(this, 0x200000L) : 0L;
        object = this.f();
        object2 = this.d0((c)object, (h)object2, bl);
        if (object2 != null && !this.b((h)object2)) {
            object = new StringBuilder();
            ((StringBuilder)object).append(this.e0);
            ((StringBuilder)object).append(" was terminated");
            throw new RejectedExecutionException(((StringBuilder)object).toString());
        }
        boolean bl3 = bl2;
        if (bl) {
            bl3 = bl2;
            if (object != null) {
                bl3 = true;
            }
        }
        if (n8 != 0) {
            this.H(l8, bl3);
            return;
        }
        if (bl3) {
            return;
        }
        this.L();
    }

    public final boolean isTerminated() {
        return l0.get(this) != 0;
    }

    public final boolean q(c c8) {
        int n8;
        long l8;
        if (c8.i() != m0) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = j0;
        do {
            l8 = atomicLongFieldUpdater.get(this);
            int n9 = (int)(0x1FFFFFL & l8);
            n8 = c8.h();
            c8.r(this.h0.b(n9));
        } while (!j0.compareAndSet(this, l8, 0x200000L + l8 & 0xFFFFFFFFFFE00000L | (long)n8));
        return true;
    }

    public String toString() {
        Object object;
        ArrayList<String> arrayList = new ArrayList<String>();
        int n8 = this.h0.a();
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        int n13 = 0;
        for (int i8 = 1; i8 < n8; ++i8) {
            int n14;
            int n15;
            int n16;
            int n17;
            object = this.h0.b(i8);
            if (object == null) {
                n17 = n9;
                n16 = n10;
                n15 = n11;
                n14 = n13;
            } else {
                int n18 = ((c)object).q.e();
                object = ((c)object).d0;
                n17 = b.a[((Enum)object).ordinal()];
                if (n17 != 1) {
                    if (n17 != 2) {
                        if (n17 != 3) {
                            if (n17 != 4) {
                                if (n17 != 5) {
                                    n17 = n9;
                                    n16 = n10;
                                    n15 = n11;
                                    n14 = n13;
                                } else {
                                    n14 = n13 + 1;
                                    n17 = n9;
                                    n16 = n10;
                                    n15 = n11;
                                }
                            } else {
                                int n19 = n12 + 1;
                                n17 = n9;
                                n16 = n10;
                                n15 = n11;
                                n12 = n19;
                                n14 = n13;
                                if (n18 > 0) {
                                    object = new StringBuilder();
                                    ((StringBuilder)object).append(n18);
                                    ((StringBuilder)object).append('d');
                                    arrayList.add(((StringBuilder)object).toString());
                                    n17 = n9;
                                    n16 = n10;
                                    n15 = n11;
                                    n12 = n19;
                                    n14 = n13;
                                }
                            }
                        } else {
                            n17 = n9 + 1;
                            object = new StringBuilder();
                            ((StringBuilder)object).append(n18);
                            ((StringBuilder)object).append('c');
                            arrayList.add(((StringBuilder)object).toString());
                            n16 = n10;
                            n15 = n11;
                            n14 = n13;
                        }
                    } else {
                        n16 = n10 + 1;
                        object = new StringBuilder();
                        ((StringBuilder)object).append(n18);
                        ((StringBuilder)object).append('b');
                        arrayList.add(((StringBuilder)object).toString());
                        n17 = n9;
                        n15 = n11;
                        n14 = n13;
                    }
                } else {
                    n15 = n11 + 1;
                    n14 = n13;
                    n16 = n10;
                    n17 = n9;
                }
            }
            n9 = n17;
            n10 = n16;
            n11 = n15;
            n13 = n14;
        }
        long l8 = k0.get(this);
        object = new StringBuilder();
        ((StringBuilder)object).append(this.e0);
        ((StringBuilder)object).append('@');
        ((StringBuilder)object).append(N.b(this));
        ((StringBuilder)object).append("[Pool Size {core = ");
        ((StringBuilder)object).append(this.q);
        ((StringBuilder)object).append(", max = ");
        ((StringBuilder)object).append(this.c0);
        ((StringBuilder)object).append("}, Worker States {CPU = ");
        ((StringBuilder)object).append(n9);
        ((StringBuilder)object).append(", blocking = ");
        ((StringBuilder)object).append(n10);
        ((StringBuilder)object).append(", parked = ");
        ((StringBuilder)object).append(n11);
        ((StringBuilder)object).append(", dormant = ");
        ((StringBuilder)object).append(n12);
        ((StringBuilder)object).append(", terminated = ");
        ((StringBuilder)object).append(n13);
        ((StringBuilder)object).append("}, running workers queues = ");
        ((StringBuilder)object).append(arrayList);
        ((StringBuilder)object).append(", global CPU queue size = ");
        ((StringBuilder)object).append(this.f0.c());
        ((StringBuilder)object).append(", global blocking queue size = ");
        ((StringBuilder)object).append(this.g0.c());
        ((StringBuilder)object).append(", Control State {created workers= ");
        ((StringBuilder)object).append((int)(0x1FFFFFL & l8));
        ((StringBuilder)object).append(", blocking tasks = ");
        ((StringBuilder)object).append((int)((0x3FFFFE00000L & l8) >> 21));
        ((StringBuilder)object).append(", CPUs acquired = ");
        ((StringBuilder)object).append(this.q - (int)((0x7FFFFC0000000000L & l8) >> 42));
        ((StringBuilder)object).append("}]");
        return ((StringBuilder)object).toString();
    }

    public final void v(c c8, int n8, int n9) {
        long l8;
        int n10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = j0;
        do {
            int n11;
            l8 = atomicLongFieldUpdater.get(this);
            n10 = n11 = (int)(0x1FFFFFL & l8);
            if (n11 != n8) continue;
            n10 = n9 == 0 ? this.o(c8) : n9;
        } while (n10 < 0 || !j0.compareAndSet(this, l8, 0x200000L + l8 & 0xFFFFFFFFFFE00000L | (long)n10));
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

    public final class b {
        public static final int[] a;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        static {
            int[] nArray = new int[d.values().length];
            try {
                nArray[d.d0.ordinal()] = 1;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[d.c0.ordinal()] = 2;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[d.q.ordinal()] = 3;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[d.e0.ordinal()] = 4;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[d.f0.ordinal()] = 5;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            a = nArray;
        }
    }

    public final class c
    extends Thread {
        private static final AtomicIntegerFieldUpdater j0 = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");
        private final v<h> c0;
        public d d0;
        private long e0;
        private long f0;
        private int g0;
        public boolean h0;
        final a i0;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        public final n q;
        private volatile int workerCtl;

        private c(a a8) {
            this.i0 = a8;
            this.setDaemon(true);
            this.q = new n();
            this.c0 = new v();
            this.d0 = d.e0;
            this.nextParkedWorker = m0;
            this.g0 = ax.Jb.c.q.b();
        }

        public c(a a8, int n8) {
            this(a8);
            this.q(n8);
        }

        private final void b(int n8) {
            if (n8 != 0) {
                a a8 = this.i0;
                k0.addAndGet(a8, -2097152L);
                if (this.d0 != d.f0) {
                    this.d0 = d.e0;
                }
            }
        }

        private final void c(int n8) {
            if (n8 != 0 && this.u(d.c0)) {
                this.i0.L();
            }
        }

        private final void d(h h8) {
            int n8 = h8.c0.b();
            this.k(n8);
            this.c(n8);
            this.i0.A(h8);
            this.b(n8);
        }

        private final h e(boolean bl) {
            if (bl) {
                h h8;
                boolean bl2 = this.m(this.i0.q * 2) == 0;
                if (bl2 && (h8 = this.o()) != null) {
                    return h8;
                }
                h8 = this.q.g();
                if (h8 != null) {
                    return h8;
                }
                if (!bl2 && (h8 = this.o()) != null) {
                    return h8;
                }
            } else {
                h h9 = this.o();
                if (h9 != null) {
                    return h9;
                }
            }
            return this.v(3);
        }

        private final h f() {
            h h8;
            h h9 = h8 = this.q.h();
            if (h8 == null) {
                h9 = h8 = (h)this.i0.g0.d();
                if (h8 == null) {
                    h9 = this.v(1);
                }
            }
            return h9;
        }

        public static final AtomicIntegerFieldUpdater j() {
            return j0;
        }

        private final void k(int n8) {
            this.e0 = 0L;
            if (this.d0 == d.d0) {
                this.d0 = d.c0;
            }
        }

        private final boolean l() {
            return this.nextParkedWorker != m0;
        }

        private final void n() {
            if (this.e0 == 0L) {
                this.e0 = System.nanoTime() + this.i0.d0;
            }
            LockSupport.parkNanos(this.i0.d0);
            if (System.nanoTime() - this.e0 >= 0L) {
                this.e0 = 0L;
                this.w();
            }
        }

        private final h o() {
            if (this.m(2) == 0) {
                h h8 = (h)this.i0.f0.d();
                if (h8 != null) {
                    return h8;
                }
                return (h)this.i0.g0.d();
            }
            h h9 = (h)this.i0.g0.d();
            if (h9 != null) {
                return h9;
            }
            return (h)this.i0.f0.d();
        }

        private final void p() {
            block0: while (true) {
                boolean bl = false;
                while (!this.i0.isTerminated() && this.d0 != d.f0) {
                    h h8 = this.g(this.h0);
                    if (h8 != null) {
                        this.f0 = 0L;
                        this.d(h8);
                        continue block0;
                    }
                    this.h0 = false;
                    if (this.f0 != 0L) {
                        if (!bl) {
                            bl = true;
                            continue;
                        }
                        this.u(d.d0);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.f0);
                        this.f0 = 0L;
                        continue block0;
                    }
                    this.t();
                }
                break;
            }
            this.u(d.f0);
        }

        private final boolean s() {
            long l8;
            if (this.d0 == d.q) {
                return true;
            }
            a a8 = this.i0;
            AtomicLongFieldUpdater atomicLongFieldUpdater = k0;
            do {
                if ((int)((0x7FFFFC0000000000L & (l8 = atomicLongFieldUpdater.get(a8))) >> 42) != 0) continue;
                return false;
            } while (!k0.compareAndSet(a8, l8, l8 - 0x40000000000L));
            this.d0 = d.q;
            return true;
        }

        private final void t() {
            if (!this.l()) {
                this.i0.q(this);
                return;
            }
            j0.set(this, -1);
            while (this.l() && j0.get(this) == -1 && !this.i0.isTerminated() && this.d0 != d.f0) {
                this.u(d.d0);
                Thread.interrupted();
                this.n();
            }
        }

        private final h v(int n8) {
            v<h> v8 = this.i0;
            int n9 = (int)(k0.get(v8) & 0x1FFFFFL);
            if (n9 < 2) {
                return null;
            }
            int n10 = this.m(n9);
            Object object = this.i0;
            long l8 = Long.MAX_VALUE;
            for (int i8 = 0; i8 < n9; ++i8) {
                long l9;
                int n11;
                n10 = n11 = n10 + 1;
                if (n11 > n9) {
                    n10 = 1;
                }
                if ((v8 = ((a)object).h0.b(n10)) != null && v8 != this) {
                    long l10 = ((c)((Object)v8)).q.n(n8, this.c0);
                    if (l10 == -1L) {
                        v8 = this.c0;
                        object = (h)v8.q;
                        v8.q = null;
                        return object;
                    }
                    l9 = l8;
                    if (l10 > 0L) {
                        l9 = Math.min(l8, l10);
                    }
                } else {
                    l9 = l8;
                }
                l8 = l9;
            }
            if (l8 == Long.MAX_VALUE) {
                l8 = 0L;
            }
            this.f0 = l8;
            return null;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private final void w() {
            Object object = this.i0;
            A<c> a8 = ((a)object).h0;
            synchronized (a8) {
                int n8;
                int n9;
                Throwable throwable2;
                block9: {
                    boolean bl;
                    block8: {
                        block7: {
                            try {
                                bl = ((a)object).isTerminated();
                                if (!bl) break block7;
                            }
                            catch (Throwable throwable2) {}
                            return;
                        }
                        n9 = (int)(k0.get(object) & 0x1FFFFFL);
                        n8 = ((a)object).q;
                        if (n9 > n8) break block8;
                        return;
                    }
                    bl = j0.compareAndSet(this, -1, 1);
                    if (bl) break block9;
                    return;
                }
                n8 = this.indexInArray;
                this.q(0);
                ((a)object).v(this, n8, 0);
                n9 = (int)(0x1FFFFFL & k0.getAndDecrement(object));
                if (n9 != n8) {
                    c c8 = ((a)object).h0.b(n9);
                    ax.Gb.l.c(c8);
                    ((a)object).h0.c(n8, c8);
                    c8.q(n8);
                    ((a)object).v(c8, n9, n8);
                }
                ((a)object).h0.c(n9, null);
                object = t.a;
                // MONITOREXIT @DISABLED, blocks:[3, 4] lbl33 : MonitorExitStatement: MONITOREXIT : var4_3
                this.d0 = d.f0;
                return;
                throw throwable2;
            }
        }

        public final h g(boolean bl) {
            if (this.s()) {
                return this.e(bl);
            }
            return this.f();
        }

        public final int h() {
            return this.indexInArray;
        }

        public final Object i() {
            return this.nextParkedWorker;
        }

        public final int m(int n8) {
            int n9;
            int n10 = this.g0;
            n10 ^= n10 << 13;
            n10 ^= n10 >> 17;
            this.g0 = n9 = n10 ^ n10 << 5;
            n10 = n8 - 1;
            if ((n10 & n8) == 0) {
                return n9 & n10;
            }
            return (n9 & Integer.MAX_VALUE) % n8;
        }

        public final void q(int n8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.i0.e0);
            stringBuilder.append("-worker-");
            String string = n8 == 0 ? "TERMINATED" : String.valueOf(n8);
            stringBuilder.append(string);
            this.setName(stringBuilder.toString());
            this.indexInArray = n8;
        }

        public final void r(Object object) {
            this.nextParkedWorker = object;
        }

        @Override
        public void run() {
            this.p();
        }

        public final boolean u(d d8) {
            d d9 = this.d0;
            boolean bl = d9 == d.q;
            if (bl) {
                a a8 = this.i0;
                k0.addAndGet(a8, 0x40000000000L);
            }
            if (d9 != d8) {
                this.d0 = d8;
            }
            return bl;
        }
    }

    public static final class d
    extends Enum<d> {
        public static final /* enum */ d c0;
        public static final /* enum */ d d0;
        public static final /* enum */ d e0;
        public static final /* enum */ d f0;
        private static final d[] g0;
        public static final /* enum */ d q;

        static {
            q = new d();
            c0 = new d();
            d0 = new d();
            e0 = new d();
            f0 = new d();
            g0 = d.d();
        }

        private static final /* synthetic */ d[] d() {
            return new d[]{q, c0, d0, e0, f0};
        }

        public static d valueOf(String string) {
            return Enum.valueOf(d.class, string);
        }

        public static d[] values() {
            return (d[])g0.clone();
        }
    }
}

