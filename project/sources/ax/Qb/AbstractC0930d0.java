package ax.Qb;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: ax.Qb.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0930d0 extends AbstractC0932e0 implements T {
    private static final AtomicReferenceFieldUpdater g0 = AtomicReferenceFieldUpdater.newUpdater(AbstractC0930d0.class, Object.class, "_queue");
    private static final AtomicReferenceFieldUpdater h0 = AtomicReferenceFieldUpdater.newUpdater(AbstractC0930d0.class, Object.class, "_delayed");
    private static final AtomicIntegerFieldUpdater i0 = AtomicIntegerFieldUpdater.newUpdater(AbstractC0930d0.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    /* renamed from: ax.Qb.d0$a */
    public static abstract class a implements Runnable, Comparable<a>, Z, ax.Vb.M {
        private volatile Object _heap;
        private int c0;
        public long q;

        @Override // ax.Qb.Z
        public final void d() {
            ax.Vb.F f;
            ax.Vb.F f2;
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    f = C0936g0.a;
                    if (obj == f) {
                        return;
                    }
                    b bVar = obj instanceof b ? (b) obj : null;
                    if (bVar != null) {
                        bVar.g(this);
                    }
                    f2 = C0936g0.a;
                    this._heap = f2;
                    ax.sb.t tVar = ax.sb.t.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // ax.Vb.M
        public ax.Vb.L<?> j() {
            Object obj = this._heap;
            if (obj instanceof ax.Vb.L) {
                return (ax.Vb.L) obj;
            }
            return null;
        }

        @Override // ax.Vb.M
        public void l(ax.Vb.L<?> l) {
            ax.Vb.F f;
            Object obj = this._heap;
            f = C0936g0.a;
            if (obj == f) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = l;
        }

        @Override // ax.Vb.M
        public void n(int i) {
            this.c0 = i;
        }

        @Override // ax.Vb.M
        public int p() {
            return this.c0;
        }

        @Override // java.lang.Comparable
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            long j = this.q - aVar.q;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        public final int r(long j, b bVar, AbstractC0930d0 abstractC0930d0) {
            ax.Vb.F f;
            synchronized (this) {
                Object obj = this._heap;
                f = C0936g0.a;
                if (obj == f) {
                    return 2;
                }
                synchronized (bVar) {
                    try {
                        a b = bVar.b();
                        if (abstractC0930d0.t1()) {
                            return 1;
                        }
                        if (b == null) {
                            bVar.c = j;
                        } else {
                            long j2 = b.q;
                            if (j2 - j < 0) {
                                j = j2;
                            }
                            if (j - bVar.c > 0) {
                                bVar.c = j;
                            }
                        }
                        long j3 = this.q;
                        long j4 = bVar.c;
                        if (j3 - j4 < 0) {
                            this.q = j4;
                        }
                        bVar.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public final boolean s(long j) {
            return j - this.q >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.q + ']';
        }
    }

    /* renamed from: ax.Qb.d0$b */
    public static final class b extends ax.Vb.L<a> {
        public long c;

        public b(long j) {
            this.c = j;
        }
    }

    private final boolean A1(a aVar) {
        b bVar = (b) h0.get(this);
        return (bVar != null ? bVar.e() : null) == aVar;
    }

    private final void p1() {
        ax.Vb.F f;
        ax.Vb.F f2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g0;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = g0;
                f = C0936g0.b;
                if (ax.D.b.a(atomicReferenceFieldUpdater2, this, null, f)) {
                    return;
                }
            } else {
                if (obj instanceof ax.Vb.s) {
                    ((ax.Vb.s) obj).d();
                    return;
                }
                f2 = C0936g0.b;
                if (obj == f2) {
                    return;
                }
                ax.Vb.s sVar = new ax.Vb.s(8, true);
                ax.Gb.l.d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                sVar.a((Runnable) obj);
                if (ax.D.b.a(g0, this, obj, sVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable q1() {
        ax.Vb.F f;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g0;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof ax.Vb.s) {
                ax.Gb.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                ax.Vb.s sVar = (ax.Vb.s) obj;
                Object j = sVar.j();
                if (j != ax.Vb.s.h) {
                    return (Runnable) j;
                }
                ax.D.b.a(g0, this, obj, sVar.i());
            } else {
                f = C0936g0.b;
                if (obj == f) {
                    return null;
                }
                if (ax.D.b.a(g0, this, obj, null)) {
                    ax.Gb.l.d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean s1(Runnable runnable) {
        ax.Vb.F f;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g0;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (t1()) {
                return false;
            }
            if (obj == null) {
                if (ax.D.b.a(g0, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof ax.Vb.s) {
                ax.Gb.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                ax.Vb.s sVar = (ax.Vb.s) obj;
                int a2 = sVar.a(runnable);
                if (a2 == 0) {
                    return true;
                }
                if (a2 == 1) {
                    ax.D.b.a(g0, this, obj, sVar.i());
                } else if (a2 == 2) {
                    return false;
                }
            } else {
                f = C0936g0.b;
                if (obj == f) {
                    return false;
                }
                ax.Vb.s sVar2 = new ax.Vb.s(8, true);
                ax.Gb.l.d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                sVar2.a((Runnable) obj);
                sVar2.a(runnable);
                if (ax.D.b.a(g0, this, obj, sVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean t1() {
        return i0.get(this) != 0;
    }

    private final void v1() {
        a i;
        C0927c.a();
        long nanoTime = System.nanoTime();
        while (true) {
            b bVar = (b) h0.get(this);
            if (bVar == null || (i = bVar.i()) == null) {
                return;
            } else {
                m1(nanoTime, i);
            }
        }
    }

    private final int y1(long j, a aVar) {
        if (t1()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h0;
        b bVar = (b) atomicReferenceFieldUpdater.get(this);
        if (bVar == null) {
            ax.D.b.a(atomicReferenceFieldUpdater, this, null, new b(j));
            Object obj = atomicReferenceFieldUpdater.get(this);
            ax.Gb.l.c(obj);
            bVar = (b) obj;
        }
        return aVar.r(j, bVar, this);
    }

    private final void z1(boolean z) {
        i0.set(this, z ? 1 : 0);
    }

    @Override // ax.Qb.G
    public final void b(ax.wb.i iVar, Runnable runnable) {
        r1(runnable);
    }

    @Override // ax.Qb.AbstractC0928c0
    protected long d1() {
        a e;
        ax.Vb.F f;
        if (super.d1() == 0) {
            return 0L;
        }
        Object obj = g0.get(this);
        if (obj != null) {
            if (!(obj instanceof ax.Vb.s)) {
                f = C0936g0.b;
                return obj == f ? Long.MAX_VALUE : 0L;
            }
            if (!((ax.Vb.s) obj).g()) {
                return 0L;
            }
        }
        b bVar = (b) h0.get(this);
        if (bVar == null || (e = bVar.e()) == null) {
            return Long.MAX_VALUE;
        }
        long j = e.q;
        C0927c.a();
        return ax.Lb.f.c(j - System.nanoTime(), 0L);
    }

    @Override // ax.Qb.AbstractC0928c0
    public long i1() {
        a aVar;
        if (j1()) {
            return 0L;
        }
        b bVar = (b) h0.get(this);
        if (bVar != null && !bVar.d()) {
            C0927c.a();
            long nanoTime = System.nanoTime();
            do {
                synchronized (bVar) {
                    try {
                        a b2 = bVar.b();
                        if (b2 != null) {
                            a aVar2 = b2;
                            aVar = aVar2.s(nanoTime) ? s1(aVar2) : false ? bVar.h(0) : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (aVar != null);
        }
        Runnable q1 = q1();
        if (q1 == null) {
            return d1();
        }
        q1.run();
        return 0L;
    }

    public void r1(Runnable runnable) {
        if (s1(runnable)) {
            n1();
        } else {
            O.j0.r1(runnable);
        }
    }

    @Override // ax.Qb.AbstractC0928c0
    public void shutdown() {
        N0.a.c();
        z1(true);
        p1();
        while (i1() <= 0) {
        }
        v1();
    }

    protected boolean u1() {
        ax.Vb.F f;
        if (!h1()) {
            return false;
        }
        b bVar = (b) h0.get(this);
        if (bVar != null && !bVar.d()) {
            return false;
        }
        Object obj = g0.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof ax.Vb.s) {
            return ((ax.Vb.s) obj).g();
        }
        f = C0936g0.b;
        return obj == f;
    }

    protected final void w1() {
        g0.set(this, null);
        h0.set(this, null);
    }

    public final void x1(long j, a aVar) {
        int y1 = y1(j, aVar);
        if (y1 == 0) {
            if (A1(aVar)) {
                n1();
            }
        } else if (y1 == 1) {
            m1(j, aVar);
        } else if (y1 != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }
}
