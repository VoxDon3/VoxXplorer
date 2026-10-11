package ax.Xb;

import ax.Gb.v;
import ax.Qb.C0927c;
import ax.Qb.N;
import ax.Vb.A;
import ax.Vb.F;
import ax.sb.t;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes3.dex */
public final class a implements Executor, Closeable, AutoCloseable {
    public static final C0222a i0 = new C0222a(null);
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

    /* renamed from: ax.Xb.a$a, reason: collision with other inner class name */
    public static final class C0222a {
        public /* synthetic */ C0222a(ax.Gb.g gVar) {
            this();
        }

        private C0222a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i, int i2, long j, String str) {
        this.q = i;
        this.c0 = i2;
        this.d0 = j;
        this.e0 = str;
        if (i < 1) {
            throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f0 = new ax.Xb.d();
        this.g0 = new ax.Xb.d();
        this.h0 = new A<>((i + 1) * 2);
        this.controlState = i << 42;
        this._isTerminated = 0;
    }

    private final void H(long j, boolean z) {
        if (z || u0() || o0(j)) {
            return;
        }
        u0();
    }

    private final boolean b(h hVar) {
        return hVar.c0.b() == 1 ? this.g0.a(hVar) : this.f0.a(hVar);
    }

    private final int c() {
        synchronized (this.h0) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = k0;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int b2 = ax.Lb.f.b(i - ((int) ((j & 4398044413952L) >> 21)), 0);
                if (b2 >= this.q) {
                    return 0;
                }
                if (i >= this.c0) {
                    return 0;
                }
                int i2 = ((int) (k0.get(this) & 2097151)) + 1;
                if (i2 <= 0 || this.h0.b(i2) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i2);
                this.h0.c(i2, cVar);
                if (i2 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i3 = b2 + 1;
                cVar.start();
                return i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final h d0(c cVar, h hVar, boolean z) {
        if (cVar == null || cVar.d0 == d.TERMINATED) {
            return hVar;
        }
        if (hVar.c0.b() == 0 && cVar.d0 == d.BLOCKING) {
            return hVar;
        }
        cVar.h0 = true;
        return cVar.q.a(hVar, z);
    }

    private final c f() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !ax.Gb.l.a(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public static /* synthetic */ void m(a aVar, Runnable runnable, i iVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            iVar = l.g;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        aVar.g(runnable, iVar, z);
    }

    private final int o(c cVar) {
        Object i = cVar.i();
        while (i != m0) {
            if (i == null) {
                return 0;
            }
            c cVar2 = (c) i;
            int h = cVar2.h();
            if (h != 0) {
                return h;
            }
            i = cVar2.i();
        }
        return -1;
    }

    private final boolean o0(long j) {
        if (ax.Lb.f.b(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0) < this.q) {
            int c2 = c();
            if (c2 == 1 && this.q > 1) {
                c();
            }
            if (c2 > 0) {
                return true;
            }
        }
        return false;
    }

    private final c p() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = j0;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            c b2 = this.h0.b((int) (2097151 & j));
            if (b2 == null) {
                return null;
            }
            long j2 = (2097152 + j) & (-2097152);
            int o = o(b2);
            if (o >= 0 && j0.compareAndSet(this, j, o | j2)) {
                b2.r(m0);
                return b2;
            }
        }
    }

    static /* synthetic */ boolean s0(a aVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = k0.get(aVar);
        }
        return aVar.o0(j);
    }

    private final boolean u0() {
        c p;
        do {
            p = p();
            if (p == null) {
                return false;
            }
        } while (!c.j().compareAndSet(p, -1, 0));
        LockSupport.unpark(p);
        return true;
    }

    public final void A(h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            try {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
            } finally {
                C0927c.a();
            }
        }
    }

    public final void F(long j) {
        int i;
        h d2;
        if (l0.compareAndSet(this, 0, 1)) {
            c f = f();
            synchronized (this.h0) {
                i = (int) (k0.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    c b2 = this.h0.b(i2);
                    ax.Gb.l.c(b2);
                    c cVar = b2;
                    if (cVar != f) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j);
                        }
                        cVar.q.f(this.g0);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.g0.b();
            this.f0.b();
            while (true) {
                if (f != null) {
                    d2 = f.g(true);
                    if (d2 != null) {
                        continue;
                        A(d2);
                    }
                }
                d2 = this.f0.d();
                if (d2 == null && (d2 = this.g0.d()) == null) {
                    break;
                }
                A(d2);
            }
            if (f != null) {
                f.u(d.TERMINATED);
            }
            j0.set(this, 0L);
            k0.set(this, 0L);
        }
    }

    public final void L() {
        if (u0() || s0(this, 0L, 1, null)) {
            return;
        }
        u0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        F(10000L);
    }

    public final h e(Runnable runnable, i iVar) {
        long a = l.f.a();
        if (!(runnable instanceof h)) {
            return new k(runnable, a, iVar);
        }
        h hVar = (h) runnable;
        hVar.q = a;
        hVar.c0 = iVar;
        return hVar;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m(this, runnable, null, false, 6, null);
    }

    public final void g(Runnable runnable, i iVar, boolean z) {
        C0927c.a();
        h e = e(runnable, iVar);
        boolean z2 = false;
        boolean z3 = e.c0.b() == 1;
        long addAndGet = z3 ? k0.addAndGet(this, 2097152L) : 0L;
        c f = f();
        h d0 = d0(f, e, z);
        if (d0 != null && !b(d0)) {
            throw new RejectedExecutionException(this.e0 + " was terminated");
        }
        if (z && f != null) {
            z2 = true;
        }
        if (z3) {
            H(addAndGet, z2);
        } else {
            if (z2) {
                return;
            }
            L();
        }
    }

    public final boolean isTerminated() {
        return l0.get(this) != 0;
    }

    public final boolean q(c cVar) {
        long j;
        int h;
        if (cVar.i() != m0) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = j0;
        do {
            j = atomicLongFieldUpdater.get(this);
            h = cVar.h();
            cVar.r(this.h0.b((int) (2097151 & j)));
        } while (!j0.compareAndSet(this, j, ((2097152 + j) & (-2097152)) | h));
        return true;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a = this.h0.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            c b2 = this.h0.b(i6);
            if (b2 != null) {
                int e = b2.q.e();
                int i7 = b.a[b2.d0.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(e);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(e);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (e > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(e);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i7 == 5) {
                    i5++;
                }
            }
        }
        long j = k0.get(this);
        return this.e0 + '@' + N.b(this) + "[Pool Size {core = " + this.q + ", max = " + this.c0 + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f0.c() + ", global blocking queue size = " + this.g0.c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.q - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    public final void v(c cVar, int i, int i2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = j0;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                i3 = i2 == 0 ? o(cVar) : i2;
            }
            if (i3 >= 0 && j0.compareAndSet(this, j, j2 | i3)) {
                return;
            }
        }
    }

    public final class c extends Thread {
        private static final AtomicIntegerFieldUpdater j0 = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");
        private final v<h> c0;
        public d d0;
        private long e0;
        private long f0;
        private int g0;
        public boolean h0;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        public final n q;
        private volatile int workerCtl;

        private c() {
            setDaemon(true);
            this.q = new n();
            this.c0 = new v<>();
            this.d0 = d.DORMANT;
            this.nextParkedWorker = a.m0;
            this.g0 = ax.Jb.c.q.b();
        }

        private final void b(int i) {
            if (i == 0) {
                return;
            }
            a.k0.addAndGet(a.this, -2097152L);
            if (this.d0 != d.TERMINATED) {
                this.d0 = d.DORMANT;
            }
        }

        private final void c(int i) {
            if (i != 0 && u(d.BLOCKING)) {
                a.this.L();
            }
        }

        private final void d(h hVar) {
            int b = hVar.c0.b();
            k(b);
            c(b);
            a.this.A(hVar);
            b(b);
        }

        private final h e(boolean z) {
            h o;
            h o2;
            if (z) {
                boolean z2 = m(a.this.q * 2) == 0;
                if (z2 && (o2 = o()) != null) {
                    return o2;
                }
                h g = this.q.g();
                if (g != null) {
                    return g;
                }
                if (!z2 && (o = o()) != null) {
                    return o;
                }
            } else {
                h o3 = o();
                if (o3 != null) {
                    return o3;
                }
            }
            return v(3);
        }

        private final h f() {
            h h = this.q.h();
            if (h != null) {
                return h;
            }
            h d = a.this.g0.d();
            return d == null ? v(1) : d;
        }

        public static final AtomicIntegerFieldUpdater j() {
            return j0;
        }

        private final void k(int i) {
            this.e0 = 0L;
            if (this.d0 == d.PARKING) {
                this.d0 = d.BLOCKING;
            }
        }

        private final boolean l() {
            return this.nextParkedWorker != a.m0;
        }

        private final void n() {
            if (this.e0 == 0) {
                this.e0 = System.nanoTime() + a.this.d0;
            }
            LockSupport.parkNanos(a.this.d0);
            if (System.nanoTime() - this.e0 >= 0) {
                this.e0 = 0L;
                w();
            }
        }

        private final h o() {
            if (m(2) == 0) {
                h d = a.this.f0.d();
                return d != null ? d : a.this.g0.d();
            }
            h d2 = a.this.g0.d();
            return d2 != null ? d2 : a.this.f0.d();
        }

        private final void p() {
            loop0: while (true) {
                boolean z = false;
                while (!a.this.isTerminated() && this.d0 != d.TERMINATED) {
                    h g = g(this.h0);
                    if (g != null) {
                        this.f0 = 0L;
                        d(g);
                    } else {
                        this.h0 = false;
                        if (this.f0 == 0) {
                            t();
                        } else if (z) {
                            u(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f0);
                            this.f0 = 0L;
                        } else {
                            z = true;
                        }
                    }
                }
            }
            u(d.TERMINATED);
        }

        private final boolean s() {
            long j;
            if (this.d0 == d.CPU_ACQUIRED) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdater = a.k0;
            do {
                j = atomicLongFieldUpdater.get(aVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    return false;
                }
            } while (!a.k0.compareAndSet(aVar, j, j - 4398046511104L));
            this.d0 = d.CPU_ACQUIRED;
            return true;
        }

        private final void t() {
            if (!l()) {
                a.this.q(this);
                return;
            }
            j0.set(this, -1);
            while (l() && j0.get(this) == -1 && !a.this.isTerminated() && this.d0 != d.TERMINATED) {
                u(d.PARKING);
                Thread.interrupted();
                n();
            }
        }

        private final h v(int i) {
            int i2 = (int) (a.k0.get(a.this) & 2097151);
            if (i2 < 2) {
                return null;
            }
            int m = m(i2);
            a aVar = a.this;
            long j = Long.MAX_VALUE;
            for (int i3 = 0; i3 < i2; i3++) {
                m++;
                if (m > i2) {
                    m = 1;
                }
                c b = aVar.h0.b(m);
                if (b != null && b != this) {
                    long n = b.q.n(i, this.c0);
                    if (n == -1) {
                        v<h> vVar = this.c0;
                        h hVar = vVar.q;
                        vVar.q = null;
                        return hVar;
                    }
                    if (n > 0) {
                        j = Math.min(j, n);
                    }
                }
            }
            if (j == Long.MAX_VALUE) {
                j = 0;
            }
            this.f0 = j;
            return null;
        }

        private final void w() {
            a aVar = a.this;
            synchronized (aVar.h0) {
                try {
                    if (aVar.isTerminated()) {
                        return;
                    }
                    if (((int) (a.k0.get(aVar) & 2097151)) <= aVar.q) {
                        return;
                    }
                    if (j0.compareAndSet(this, -1, 1)) {
                        int i = this.indexInArray;
                        q(0);
                        aVar.v(this, i, 0);
                        int andDecrement = (int) (2097151 & a.k0.getAndDecrement(aVar));
                        if (andDecrement != i) {
                            c b = aVar.h0.b(andDecrement);
                            ax.Gb.l.c(b);
                            c cVar = b;
                            aVar.h0.c(i, cVar);
                            cVar.q(i);
                            aVar.v(cVar, andDecrement, i);
                        }
                        aVar.h0.c(andDecrement, null);
                        t tVar = t.a;
                        this.d0 = d.TERMINATED;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final h g(boolean z) {
            return s() ? e(z) : f();
        }

        public final int h() {
            return this.indexInArray;
        }

        public final Object i() {
            return this.nextParkedWorker;
        }

        public final int m(int i) {
            int i2 = this.g0;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.g0 = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & SubsamplingScaleImageView.TILE_SIZE_AUTO) % i;
        }

        public final void q(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.e0);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public final void r(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            p();
        }

        public final boolean u(d dVar) {
            d dVar2 = this.d0;
            boolean z = dVar2 == d.CPU_ACQUIRED;
            if (z) {
                a.k0.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.d0 = dVar;
            }
            return z;
        }

        public c(a aVar, int i) {
            this();
            q(i);
        }
    }
}
