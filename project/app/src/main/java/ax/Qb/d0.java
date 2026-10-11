/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Gb.l;
import ax.Lb.f;
import ax.Qb.N0;
import ax.Qb.O;
import ax.Qb.T;
import ax.Qb.Z;
import ax.Qb.c;
import ax.Qb.e0;
import ax.Qb.g0;
import ax.Vb.F;
import ax.Vb.L;
import ax.Vb.M;
import ax.Vb.s;
import ax.sb.t;
import ax.wb.i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class d0
extends e0
implements T {
    private static final AtomicReferenceFieldUpdater g0 = AtomicReferenceFieldUpdater.newUpdater(d0.class, Object.class, "_queue");
    private static final AtomicReferenceFieldUpdater h0 = AtomicReferenceFieldUpdater.newUpdater(d0.class, Object.class, "_delayed");
    private static final AtomicIntegerFieldUpdater i0 = AtomicIntegerFieldUpdater.newUpdater(d0.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    private final boolean A1(a a8) {
        Object object = (b)h0.get(this);
        object = object != null ? (a)((L)object).e() : null;
        return object == a8;
    }

    public static final /* synthetic */ boolean o1(d0 d02) {
        return d02.t1();
    }

    private final void p1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g0;
        while (true) {
            Object v8;
            if ((v8 = atomicReferenceFieldUpdater.get(this)) == null) {
                if (!ax.D.b.a(g0, this, null, ax.Qb.g0.a())) continue;
                break;
            }
            if (v8 instanceof s) {
                ((s)v8).d();
                return;
            }
            if (v8 == ax.Qb.g0.a()) break;
            s<Runnable> s8 = new s<Runnable>(8, true);
            l.d(v8, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
            s8.a((Runnable)v8);
            if (ax.D.b.a(g0, this, v8, s8)) break;
        }
    }

    private final Runnable q1() {
        Object v8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g0;
        while (true) {
            if ((v8 = atomicReferenceFieldUpdater.get(this)) == null) {
                return null;
            }
            if (v8 instanceof s) {
                l.d(v8, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                s s8 = (s)v8;
                Object object = s8.j();
                if (object != s.h) {
                    return (Runnable)object;
                }
                ax.D.b.a(g0, this, v8, s8.i());
                continue;
            }
            if (v8 == ax.Qb.g0.a()) {
                return null;
            }
            if (ax.D.b.a(g0, this, v8, null)) break;
        }
        l.d(v8, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
        return (Runnable)v8;
    }

    private final boolean s1(Runnable runnable2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g0;
        while (true) {
            s<Runnable> s8;
            Object v8 = atomicReferenceFieldUpdater.get(this);
            if (this.t1()) {
                return false;
            }
            if (v8 == null) {
                if (!ax.D.b.a(g0, this, null, runnable2)) continue;
                return true;
            }
            if (v8 instanceof s) {
                l.d(v8, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                s8 = (s<Runnable>)v8;
                int n8 = s8.a(runnable2);
                if (n8 != 0) {
                    if (n8 != 1) {
                        if (n8 != 2) continue;
                        return false;
                    }
                    ax.D.b.a(g0, this, v8, s8.i());
                    continue;
                }
                return true;
            }
            if (v8 == ax.Qb.g0.a()) {
                return false;
            }
            s8 = new s<Runnable>(8, true);
            l.d(v8, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
            s8.a((Runnable)v8);
            s8.a(runnable2);
            if (ax.D.b.a(g0, this, v8, s8)) break;
        }
        return true;
    }

    private final boolean t1() {
        return i0.get(this) != 0;
    }

    private final void v1() {
        Object object;
        c.a();
        long l8 = System.nanoTime();
        while ((object = (b)h0.get(this)) != null && (object = (a)((L)object).i()) != null) {
            this.m1(l8, (a)object);
        }
    }

    private final int y1(long l8, a a8) {
        b b8;
        if (this.t1()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h0;
        b b9 = b8 = (b)atomicReferenceFieldUpdater.get(this);
        if (b8 == null) {
            ax.D.b.a(atomicReferenceFieldUpdater, this, null, new b(l8));
            b9 = atomicReferenceFieldUpdater.get(this);
            l.c(b9);
        }
        return a8.r(l8, b9, this);
    }

    private final void z1(boolean bl) {
        i0.set(this, bl ? 1 : 0);
    }

    @Override
    public final void b(i i8, Runnable runnable2) {
        this.r1(runnable2);
    }

    @Override
    protected long d1() {
        if (super.d1() == 0L) {
            return 0L;
        }
        Object object = g0.get(this);
        if (object != null) {
            if (object instanceof s) {
                if (!((s)object).g()) {
                    return 0L;
                }
            } else {
                if (object == ax.Qb.g0.a()) {
                    return Long.MAX_VALUE;
                }
                return 0L;
            }
        }
        if ((object = (b)h0.get(this)) != null && (object = (a)((L)object).e()) != null) {
            long l8 = ((a)object).q;
            c.a();
            return f.c(l8 - System.nanoTime(), 0L);
        }
        return Long.MAX_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public long i1() {
        Runnable runnable2;
        if (this.j1()) {
            return 0L;
        }
        b b8 = (b)h0.get(this);
        if (b8 != null && !b8.d()) {
            c.a();
            long l8 = System.nanoTime();
            do {
                a a8;
                Object t8;
                block8: {
                    // MONITORENTER : b8
                    t8 = b8.b();
                    a8 = null;
                    runnable2 = null;
                    if (t8 != null) break block8;
                    runnable2 = a8;
                    continue;
                }
                a8 = (a)t8;
                boolean bl = a8.s(l8) ? this.s1(a8) : false;
                if (bl) {
                    runnable2 = b8.h(0);
                }
                // MONITOREXIT : b8
            } while ((a)runnable2 != null);
        }
        if ((runnable2 = this.q1()) == null) return this.d1();
        runnable2.run();
        return 0L;
    }

    public void r1(Runnable runnable2) {
        if (this.s1(runnable2)) {
            this.n1();
            return;
        }
        O.j0.r1(runnable2);
    }

    @Override
    public void shutdown() {
        N0.a.c();
        this.z1(true);
        this.p1();
        while (this.i1() <= 0L) {
        }
        this.v1();
    }

    protected boolean u1() {
        if (!this.h1()) {
            return false;
        }
        b b8 = (b)h0.get(this);
        if (b8 != null && !b8.d()) {
            return false;
        }
        b8 = g0.get(this);
        if (b8 == null) {
            return true;
        }
        if (b8 instanceof s) {
            return ((s)((Object)b8)).g();
        }
        return b8 == ax.Qb.g0.a();
    }

    protected final void w1() {
        g0.set(this, null);
        h0.set(this, null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void x1(long l8, a a8) {
        int n8 = this.y1(l8, a8);
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 == 2) return;
                throw new IllegalStateException("unexpected result");
            }
            this.m1(l8, a8);
            return;
        }
        if (!this.A1(a8)) return;
        this.n1();
    }

    public static abstract class a
    implements Runnable,
    Comparable<a>,
    Z,
    M {
        private volatile Object _heap;
        private int c0;
        public long q;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public final void d() {
            synchronized (this) {
                Throwable throwable2;
                block6: {
                    Object object;
                    block5: {
                        try {
                            object = this._heap;
                            F f8 = ax.Qb.g0.b();
                            if (object != f8) break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                        return;
                    }
                    if ((object = object instanceof b ? (b)object : null) != null) {
                        ((L)object).g(this);
                    }
                    this._heap = ax.Qb.g0.b();
                    object = t.a;
                    return;
                }
                throw throwable2;
            }
        }

        @Override
        public L<?> j() {
            Object object = this._heap;
            if (object instanceof L) {
                return (L)object;
            }
            return null;
        }

        @Override
        public void l(L<?> l8) {
            if (this._heap != ax.Qb.g0.b()) {
                this._heap = l8;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }

        @Override
        public void n(int n8) {
            this.c0 = n8;
        }

        @Override
        public int p() {
            return this.c0;
        }

        public int q(a a8) {
            long l8 = this.q - a8.q - 0L;
            long l9 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (l9 > 0) {
                return 1;
            }
            if (l9 < 0) {
                return -1;
            }
            return 0;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final int r(long var1_1, b var3_2, d0 var4_4) {
            synchronized (this) {
                block15: {
                    try {
                        var8_6 = this._heap;
                        var9_7 = ax.Qb.g0.b();
                        if (var8_6 == var9_7) {
                        }
                        ** GOTO lbl-1000
                    }
                    catch (Throwable var3_3) {
                        break block15;
                    }
                    return 2;
lbl-1000:
                    // 1 sources

                    {
                        ** synchronized (var3_2)
                    }
lbl-1000:
                    // 1 sources

                    {
                        block16: {
                            block14: {
                                try {
                                    var8_6 = (a)var3_2.b();
                                    var7_8 = d0.o1(var4_4);
                                    if (!var7_8) break block14;
                                }
                                catch (Throwable var4_5) {
                                    ** GOTO lbl-1000
                                }
                                return 1;
                            }
                            if (var8_6 != null) break block16;
                            var3_2.c = var1_1;
                            ** GOTO lbl30
                        }
                        var5_9 = var8_6.q;
                        if (var5_9 - var1_1 >= 0L) ** GOTO lbl-1000
                        var1_1 = var5_9;
lbl-1000:
                        // 2 sources

                        {
                            if (var1_1 - var3_2.c > 0L) {
                                var3_2.c = var1_1;
                            }
lbl30:
                            // 4 sources

                            var1_1 = this.q;
                            var5_9 = var3_2.c;
                            if (var1_1 - var5_9 >= 0L) ** GOTO lbl34
                        }
                        {
                            this.q = var5_9;
lbl34:
                            // 2 sources

                            var3_2.a(this);
                            return 0;
                        }
lbl-1000:
                        // 1 sources

                        {
                            throw var4_5;
                        }
                    }
                }
                throw var3_3;
            }
        }

        public final boolean s(long l8) {
            return l8 - this.q >= 0L;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Delayed[nanos=");
            stringBuilder.append(this.q);
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }

    public static final class b
    extends L<a> {
        public long c;

        public b(long l8) {
            this.c = l8;
        }
    }
}

