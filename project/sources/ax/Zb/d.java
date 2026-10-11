package ax.Zb;

import ax.Fb.l;
import ax.Fb.p;
import ax.Gb.j;
import ax.Gb.m;
import ax.Qb.InterfaceC0945l;
import ax.Qb.R0;
import ax.Sb.g;
import ax.Vb.C;
import ax.Vb.C0997d;
import ax.Vb.D;
import ax.Vb.F;
import ax.sb.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public class d {
    private static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "head");
    private static final AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(d.class, "deqIdx");
    private static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "tail");
    private static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(d.class, "enqIdx");
    private static final AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(d.class, "_availablePermits");
    private volatile int _availablePermits;
    private final int a;
    private final l<Throwable, t> b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    /* synthetic */ class a extends j implements p<Long, f, f> {
        public static final a k0 = new a();

        a() {
            super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // ax.Fb.p
        public /* bridge */ /* synthetic */ f j(Long l, f fVar) {
            return l(l.longValue(), fVar);
        }

        public final f l(long j, f fVar) {
            f h;
            h = e.h(j, fVar);
            return h;
        }
    }

    static final class b extends m implements l<Throwable, t> {
        b() {
            super(1);
        }

        public final void a(Throwable th) {
            d.this.i();
        }

        @Override // ax.Fb.l
        public /* bridge */ /* synthetic */ t invoke(Throwable th) {
            a(th);
            return t.a;
        }
    }

    /* synthetic */ class c extends j implements p<Long, f, f> {
        public static final c k0 = new c();

        c() {
            super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // ax.Fb.p
        public /* bridge */ /* synthetic */ f j(Long l, f fVar) {
            return l(l.longValue(), fVar);
        }

        public final f l(long j, f fVar) {
            f h;
            h = e.h(j, fVar);
            return h;
        }
    }

    public d(int i, int i2) {
        this.a = i;
        if (i <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i).toString());
        }
        if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i).toString());
        }
        f fVar = new f(0L, null, 2);
        this.head = fVar;
        this.tail = fVar;
        this._availablePermits = i - i2;
        this.b = new b();
    }

    private final boolean e(R0 r0) {
        int i;
        Object c2;
        int i2;
        F f2;
        F f3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        f fVar = (f) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f.getAndIncrement(this);
        a aVar = a.k0;
        i = e.f;
        long j = andIncrement / i;
        loop0: while (true) {
            c2 = C0997d.c(fVar, j, aVar);
            if (!D.c(c2)) {
                C b2 = D.b(c2);
                while (true) {
                    C c3 = (C) atomicReferenceFieldUpdater.get(this);
                    if (c3.d0 >= b2.d0) {
                        break loop0;
                    }
                    if (!b2.q()) {
                        break;
                    }
                    if (ax.D.b.a(atomicReferenceFieldUpdater, this, c3, b2)) {
                        if (c3.m()) {
                            c3.k();
                        }
                    } else if (b2.m()) {
                        b2.k();
                    }
                }
            } else {
                break;
            }
        }
        f fVar2 = (f) D.b(c2);
        i2 = e.f;
        int i3 = (int) (andIncrement % i2);
        if (g.a(fVar2.r(), i3, null, r0)) {
            r0.a(fVar2, i3);
            return true;
        }
        f2 = e.b;
        f3 = e.c;
        if (!g.a(fVar2.r(), i3, f2, f3)) {
            return false;
        }
        if (r0 instanceof InterfaceC0945l) {
            ax.Gb.l.d(r0, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((InterfaceC0945l) r0).k(t.a, this.b);
        } else {
            if (!(r0 instanceof ax.Yb.b)) {
                throw new IllegalStateException(("unexpected: " + r0).toString());
            }
            ((ax.Yb.b) r0).e(t.a);
        }
        return true;
    }

    private final void f() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        int i2;
        do {
            atomicIntegerFieldUpdater = g;
            i = atomicIntegerFieldUpdater.get(this);
            i2 = this.a;
            if (i <= i2) {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
    }

    private final int g() {
        int andDecrement;
        do {
            andDecrement = g.getAndDecrement(this);
        } while (andDecrement > this.a);
        return andDecrement;
    }

    private final boolean k(Object obj) {
        if (!(obj instanceof InterfaceC0945l)) {
            if (obj instanceof ax.Yb.b) {
                return ((ax.Yb.b) obj).d(this, t.a);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        ax.Gb.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC0945l interfaceC0945l = (InterfaceC0945l) obj;
        Object l = interfaceC0945l.l(t.a, null, this.b);
        if (l == null) {
            return false;
        }
        interfaceC0945l.s(l);
        return true;
    }

    private final boolean l() {
        int i;
        Object c2;
        int i2;
        F f2;
        F f3;
        int i3;
        F f4;
        F f5;
        F f6;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        f fVar = (f) atomicReferenceFieldUpdater.get(this);
        long andIncrement = d.getAndIncrement(this);
        i = e.f;
        long j = andIncrement / i;
        c cVar = c.k0;
        loop0: while (true) {
            c2 = C0997d.c(fVar, j, cVar);
            if (D.c(c2)) {
                break;
            }
            C b2 = D.b(c2);
            while (true) {
                C c3 = (C) atomicReferenceFieldUpdater.get(this);
                if (c3.d0 >= b2.d0) {
                    break loop0;
                }
                if (!b2.q()) {
                    break;
                }
                if (ax.D.b.a(atomicReferenceFieldUpdater, this, c3, b2)) {
                    if (c3.m()) {
                        c3.k();
                    }
                } else if (b2.m()) {
                    b2.k();
                }
            }
        }
        f fVar2 = (f) D.b(c2);
        fVar2.b();
        if (fVar2.d0 > j) {
            return false;
        }
        i2 = e.f;
        int i4 = (int) (andIncrement % i2);
        f2 = e.b;
        Object andSet = fVar2.r().getAndSet(i4, f2);
        if (andSet != null) {
            f3 = e.e;
            if (andSet == f3) {
                return false;
            }
            return k(andSet);
        }
        i3 = e.a;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = fVar2.r().get(i4);
            f6 = e.c;
            if (obj == f6) {
                return true;
            }
        }
        f4 = e.b;
        f5 = e.d;
        return !g.a(fVar2.r(), i4, f4, f5);
    }

    protected final void d(InterfaceC0945l<? super t> interfaceC0945l) {
        while (g() <= 0) {
            ax.Gb.l.d(interfaceC0945l, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (e((R0) interfaceC0945l)) {
                return;
            }
        }
        interfaceC0945l.k(t.a, this.b);
    }

    public int h() {
        return Math.max(g.get(this), 0);
    }

    public void i() {
        do {
            int andIncrement = g.getAndIncrement(this);
            if (andIncrement >= this.a) {
                f();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!l());
    }

    public boolean j() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i > this.a) {
                f();
            } else {
                if (i <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i, i - 1)) {
                    return true;
                }
            }
        }
    }
}
