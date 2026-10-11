/*
 * Decompiled with CFR 0.152.
 */
package ax.Zb;

import ax.D.b;
import ax.Gb.l;
import ax.Qb.R0;
import ax.Sb.g;
import ax.Vb.C;
import ax.Vb.D;
import ax.Zb.e;
import ax.Zb.f;
import ax.sb.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class d {
    private static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "head");
    private static final AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(d.class, "deqIdx");
    private static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "tail");
    private static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(d.class, "enqIdx");
    private static final AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(d.class, "_availablePermits");
    private volatile int _availablePermits;
    private final int a;
    private final ax.Fb.l<Throwable, t> b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public d(int n8, int n9) {
        this.a = n8;
        if (n8 > 0) {
            if (n9 >= 0 && n9 <= n8) {
                f f8 = new f(0L, null, 2);
                this.head = f8;
                this.tail = f8;
                this._availablePermits = n8 - n9;
                this.b = new ax.Fb.l<Throwable, t>(this){
                    final d q;
                    {
                        this.q = d8;
                        super(1);
                    }

                    public final void a(Throwable throwable) {
                        this.q.i();
                    }
                };
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("The number of acquired permits should be in 0..");
            stringBuilder.append(n8);
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Semaphore should have at least 1 permit, but had ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    private final boolean e(R0 r02) {
        block7: {
            Object object;
            block10: {
                block9: {
                    block8: {
                        Object object2;
                        Object object3 = e;
                        Object object4 = (f)((AtomicReferenceFieldUpdater)object3).get(this);
                        long l8 = f.getAndIncrement(this);
                        a a8 = ax.Zb.d$a.k0;
                        long l9 = l8 / (long)ax.Zb.e.f();
                        block0: while (!D.c(object2 = ax.Vb.d.c(object4, l9, a8))) {
                            object = D.b(object2);
                            while (true) {
                                C c8 = (C)((AtomicReferenceFieldUpdater)object3).get(this);
                                if (c8.d0 >= ((C)object).d0) break block0;
                                if (!((C)object).q()) continue block0;
                                if (ax.D.b.a((AtomicReferenceFieldUpdater)object3, this, c8, object)) {
                                    if (!c8.m()) break block0;
                                    c8.k();
                                    break block0;
                                }
                                if (!((C)object).m()) continue;
                                ((ax.Vb.e)object).k();
                            }
                        }
                        object3 = (f)D.b(object2);
                        int n8 = (int)(l8 % (long)ax.Zb.e.f());
                        if (ax.Sb.g.a(((f)object3).r(), n8, null, r02)) {
                            r02.a((C<?>)object3, n8);
                            return true;
                        }
                        object4 = ax.Zb.e.e();
                        object = ax.Zb.e.g();
                        if (!ax.Sb.g.a(((f)object3).r(), n8, object4, object)) break block7;
                        if (!(r02 instanceof ax.Qb.l)) break block8;
                        l.d(r02, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                        ((ax.Qb.l)((Object)r02)).k(t.a, this.b);
                        break block9;
                    }
                    if (!(r02 instanceof ax.Yb.b)) break block10;
                    ((ax.Yb.b)((Object)r02)).e(t.a);
                }
                return true;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("unexpected: ");
            ((StringBuilder)object).append(r02);
            throw new IllegalStateException(((StringBuilder)object).toString().toString());
        }
        return false;
    }

    private final void f() {
        int n8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int n9;
        while ((n9 = (atomicIntegerFieldUpdater = g).get(this)) > (n8 = this.a) && !atomicIntegerFieldUpdater.compareAndSet(this, n9, n8)) {
        }
    }

    private final int g() {
        int n8;
        while ((n8 = g.getAndDecrement(this)) > this.a) {
        }
        return n8;
    }

    private final boolean k(Object object) {
        if (object instanceof ax.Qb.l) {
            l.d(object, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            object = (ax.Qb.l)object;
            Object object2 = object.l(t.a, null, this.b);
            if (object2 != null) {
                object.s(object2);
                return true;
            }
            return false;
        }
        if (object instanceof ax.Yb.b) {
            return ((ax.Yb.b)object).d(this, t.a);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("unexpected: ");
        stringBuilder.append(object);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    private final boolean l() {
        Object object;
        Object object2;
        Object object3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        f f8 = (f)atomicReferenceFieldUpdater.get(this);
        long l8 = d.getAndIncrement(this);
        long l9 = l8 / (long)ax.Zb.e.f();
        c c8 = ax.Zb.d$c.k0;
        block0: while (!D.c(object3 = ax.Vb.d.c(f8, l9, c8))) {
            object2 = D.b(object3);
            while (true) {
                object = (C)atomicReferenceFieldUpdater.get(this);
                if (((C)object).d0 >= ((C)object2).d0) break block0;
                if (!((C)object2).q()) continue block0;
                if (ax.D.b.a(atomicReferenceFieldUpdater, this, object, object2)) {
                    if (!((C)object).m()) break block0;
                    ((ax.Vb.e)object).k();
                    break block0;
                }
                if (!((C)object2).m()) continue;
                ((ax.Vb.e)object2).k();
            }
        }
        f8 = (f)D.b(object3);
        f8.b();
        long l10 = f8.d0;
        if (l10 > l9) {
            return false;
        }
        int n8 = (int)(l8 % (long)ax.Zb.e.f());
        object2 = ax.Zb.e.e();
        object2 = f8.r().getAndSet(n8, object2);
        if (object2 == null) {
            int n9 = ax.Zb.e.d();
            for (int i8 = 0; i8 < n9; ++i8) {
                if (f8.r().get(n8) != ax.Zb.e.g()) continue;
                return true;
            }
            object2 = ax.Zb.e.e();
            object = ax.Zb.e.b();
            return ax.Sb.g.a(f8.r(), n8, object2, object) ^ true;
        }
        if (object2 == ax.Zb.e.c()) {
            return false;
        }
        return this.k(object2);
    }

    protected final void d(ax.Qb.l<? super t> l8) {
        do {
            if (this.g() > 0) {
                l8.k(t.a, this.b);
                return;
            }
            l.d(l8, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
        } while (!this.e((R0)((Object)l8)));
    }

    public int h() {
        return Math.max(g.get(this), 0);
    }

    public void i() {
        int n8;
        while ((n8 = g.getAndIncrement(this)) < this.a) {
            if (n8 < 0 && !this.l()) continue;
            return;
        }
        this.f();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The number of released permits cannot be greater than ");
        stringBuilder.append(this.a);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    public boolean j() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
            int n8;
            if ((n8 = (atomicIntegerFieldUpdater = g).get(this)) > this.a) {
                this.f();
                continue;
            }
            if (n8 <= 0) {
                return false;
            }
            if (atomicIntegerFieldUpdater.compareAndSet(this, n8, n8 - 1)) break;
        }
        return true;
    }
}

