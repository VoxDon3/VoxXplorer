/*
 * Decompiled with CFR 0.152.
 */
package ax.Sb;

import ax.Fb.p;
import ax.Fb.q;
import ax.Gb.z;
import ax.Qb.R0;
import ax.Qb.m;
import ax.Sb.c;
import ax.Sb.d;
import ax.Sb.f;
import ax.Sb.h;
import ax.Sb.i;
import ax.Sb.j;
import ax.Sb.l;
import ax.Sb.o;
import ax.Vb.C;
import ax.Vb.D;
import ax.Vb.E;
import ax.Vb.F;
import ax.Vb.O;
import ax.Vb.e;
import ax.Vb.x;
import ax.sb.n;
import ax.sb.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class b<E>
implements d<E> {
    private static final AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");
    private static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");
    private static final AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");
    private static final AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");
    private static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");
    private static final AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");
    private static final AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");
    private static final AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");
    private static final AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;
    private final int b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    public final ax.Fb.l<E, t> c;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private final q<ax.Yb.b<?>, Object, Object, ax.Fb.l<Throwable, t>> d;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public b(int n8, ax.Fb.l<? super E, t> q8) {
        this.b = n8;
        this.c = q8;
        if (n8 >= 0) {
            h h8;
            this.bufferEnd = ax.Sb.c.s(n8);
            this.completedExpandBuffersAndPauseFlag = this.C();
            this.sendSegment = h8 = new h(0L, null, this, 3);
            this.receiveSegment = h8;
            if (this.T()) {
                h8 = ax.Sb.c.m();
                ax.Gb.l.d(h8, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = h8;
            q8 = q8 != null ? new q<ax.Yb.b<?>, Object, Object, ax.Fb.l<? super Throwable, ? extends t>>(this){
                final b<E> q;
                {
                    this.q = b8;
                    super(3);
                }

                public final ax.Fb.l<Throwable, t> a(ax.Yb.b<?> b8, Object object, Object object2) {
                    return new ax.Fb.l<Throwable, t>(object2, this.q, b8){
                        final b<E> c0;
                        final ax.Yb.b<?> d0;
                        final Object q;
                        {
                            this.q = object;
                            this.c0 = b8;
                            this.d0 = b9;
                            super(1);
                        }

                        public final void a(Throwable throwable) {
                            if (this.q != ax.Sb.c.y()) {
                                x.b(this.c0.c, this.q, this.d0.b());
                            }
                        }
                    };
                }
            } : null;
            this.d = q8;
            this._closeCause = ax.Sb.c.l();
            return;
        }
        q8 = new StringBuilder();
        ((StringBuilder)((Object)q8)).append("Invalid channel capacity: ");
        ((StringBuilder)((Object)q8)).append(n8);
        ((StringBuilder)((Object)q8)).append(", should be >=0");
        throw new IllegalArgumentException(((StringBuilder)((Object)q8)).toString().toString());
    }

    private final h<E> A(long l8, h<E> c8) {
        long l9;
        Object object;
        Object object2 = j;
        Object object3 = (p)((Object)ax.Sb.c.x());
        block0: while (!D.c(object = ax.Vb.d.c(c8, l8, object3))) {
            Object s8 = D.b(object);
            while (true) {
                C c9 = (C)((AtomicReferenceFieldUpdater)object2).get(this);
                if (c9.d0 >= ((C)s8).d0) break block0;
                if (!((C)s8).q()) continue block0;
                if (ax.D.b.a((AtomicReferenceFieldUpdater)object2, this, c9, s8)) {
                    if (!c9.m()) break block0;
                    c9.k();
                    break block0;
                }
                if (!((C)s8).m()) continue;
                ((e)s8).k();
            }
        }
        if (D.c(object)) {
            this.w();
            if (c8.d0 * (long)ax.Sb.c.b < this.H()) {
                c8.b();
            }
            return null;
        }
        object2 = (h)D.b(object);
        if (!this.T() && l8 <= this.C() / (long)ax.Sb.c.b) {
            object3 = k;
            while (true) {
                c8 = (C)((AtomicReferenceFieldUpdater)object3).get(this);
                if (c8.d0 >= ((C)object2).d0 || !((C)object2).q()) break;
                if (ax.D.b.a((AtomicReferenceFieldUpdater)object3, this, c8, object2)) {
                    if (!c8.m()) break;
                    c8.k();
                    break;
                }
                if (!((C)object2).m()) continue;
                ((e)object2).k();
            }
        }
        if ((l9 = ((C)object2).d0) > l8) {
            int n8 = ax.Sb.c.b;
            this.u0(l9 * (long)n8);
            if (((C)object2).d0 * (long)n8 < this.H()) {
                ((e)object2).b();
            }
            return null;
        }
        return object2;
    }

    private final h<E> B(long l8, h<E> h8) {
        Object object;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        p p8 = (p)((Object)ax.Sb.c.x());
        block0: while (!D.c(object = ax.Vb.d.c(h8, l8, p8))) {
            Object s8 = D.b(object);
            while (true) {
                C c8 = (C)atomicReferenceFieldUpdater.get(this);
                if (c8.d0 >= ((C)s8).d0) break block0;
                if (!((C)s8).q()) continue block0;
                if (ax.D.b.a(atomicReferenceFieldUpdater, this, c8, s8)) {
                    if (!c8.m()) break block0;
                    c8.k();
                    break block0;
                }
                if (!((C)s8).m()) continue;
                ((e)s8).k();
            }
        }
        if (D.c(object)) {
            this.w();
            if (h8.d0 * (long)ax.Sb.c.b < this.F()) {
                h8.b();
            }
            return null;
        }
        h8 = (h)D.b(object);
        long l9 = h8.d0;
        if (l9 > l8) {
            int n8 = ax.Sb.c.b;
            this.v0(l9 * (long)n8);
            if (h8.d0 * (long)n8 < this.F()) {
                h8.b();
            }
            return null;
        }
        return h8;
    }

    private final long C() {
        return g.get(this);
    }

    private final Throwable E() {
        Throwable throwable;
        Throwable throwable2 = throwable = this.D();
        if (throwable == null) {
            throwable2 = new i("Channel was closed");
        }
        return throwable2;
    }

    private final void J(long l8) {
        if ((h.addAndGet(this, l8) & 0x4000000000000000L) != 0L) {
            while ((h.get(this) & 0x4000000000000000L) != 0L) {
            }
        }
    }

    static /* synthetic */ void K(b b8, long l8, int n8, Object object) {
        if (object == null) {
            if ((n8 & 1) != 0) {
                l8 = 1L;
            }
            b8.J(l8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
    }

    private final void L() {
        Object object;
        Object v8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
        while (!ax.D.b.a(atomicReferenceFieldUpdater, this, v8, object = (v8 = atomicReferenceFieldUpdater.get(this)) == null ? ax.Sb.c.d() : ax.Sb.c.e())) {
        }
        if (v8 == null) {
            return;
        }
        object = (ax.Fb.l)z.c(v8, 1);
        ((ax.Fb.l)v8).invoke(this.D());
    }

    private final boolean M(h<E> h8, int n8, long l8) {
        Object object;
        do {
            if ((object = h8.w(n8)) == null || object == ax.Sb.c.k()) continue;
            if (object == ax.Sb.c.d) {
                return true;
            }
            if (object == ax.Sb.c.j()) {
                return false;
            }
            if (object == ax.Sb.c.y()) {
                return false;
            }
            if (object == ax.Sb.c.f()) {
                return false;
            }
            if (object == ax.Sb.c.n()) {
                return false;
            }
            if (object == ax.Sb.c.o()) {
                return true;
            }
            if (object == ax.Sb.c.p()) {
                return false;
            }
            return l8 == this.F();
        } while (!h8.r(n8, object, ax.Sb.c.n()));
        this.y();
        return false;
    }

    private final boolean N(long l8, boolean bl) {
        int n8 = (int)(l8 >> 60);
        if (n8 != 0 && n8 != 1) {
            if (n8 != 2) {
                if (n8 == 3) {
                    this.u(l8 & 0xFFFFFFFFFFFFFFFL);
                    return true;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unexpected close status: ");
                stringBuilder.append(n8);
                throw new IllegalStateException(stringBuilder.toString().toString());
            }
            this.v(l8 & 0xFFFFFFFFFFFFFFFL);
            if (bl) {
                return !this.I();
            }
            return true;
        }
        return false;
    }

    private final boolean P(long l8) {
        return this.N(l8, true);
    }

    private final boolean R(long l8) {
        return this.N(l8, false);
    }

    private final boolean T() {
        long l8 = this.C();
        return l8 == 0L || l8 == Long.MAX_VALUE;
        {
        }
    }

    private final long U(h<E> h8) {
        Object object;
        do {
            block1: for (int i8 = ax.Sb.c.b - 1; -1 < i8; --i8) {
                long l8 = h8.d0 * (long)ax.Sb.c.b + (long)i8;
                if (l8 < this.F()) {
                    return -1L;
                }
                do {
                    if ((object = h8.w(i8)) == null || object == ax.Sb.c.k()) continue;
                    if (object != ax.Sb.c.d) continue block1;
                    return l8;
                } while (!h8.r(i8, object, ax.Sb.c.y()));
                h8.p();
            }
            object = (h)h8.g();
            h8 = object;
        } while (object != null);
        return -1L;
    }

    private final void V() {
        long l8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        while ((int)((l8 = atomicLongFieldUpdater.get(this)) >> 60) == 0 && !atomicLongFieldUpdater.compareAndSet(this, l8, ax.Sb.c.b(0xFFFFFFFFFFFFFFFL & l8, 1))) {
        }
    }

    private final void W() {
        long l8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        while (!atomicLongFieldUpdater.compareAndSet(this, l8 = atomicLongFieldUpdater.get(this), ax.Sb.c.b(0xFFFFFFFFFFFFFFFL & l8, 3))) {
        }
    }

    private final void X() {
        long l8;
        long l9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        do {
            int n8;
            if ((n8 = (int)((l9 = atomicLongFieldUpdater.get(this)) >> 60)) != 0) {
                if (n8 != 1) break;
                l8 = ax.Sb.c.b(0xFFFFFFFFFFFFFFFL & l9, 3);
                continue;
            }
            l8 = ax.Sb.c.b(0xFFFFFFFFFFFFFFFL & l9, 2);
        } while (!atomicLongFieldUpdater.compareAndSet(this, l9, l8));
    }

    /*
     * Unable to fully structure code
     */
    private final void Y(long var1_1, h<E> var3_2) {
        while (true) {
            var4_3 = var3_2;
            if (var3_2.d0 >= var1_1) break;
            var4_3 = (h)var3_2.e();
            if (var4_3 == null) {
                var4_3 = var3_2;
                break;
            }
            var3_2 = var4_3;
        }
        block1: while (true) {
            if (var4_3.h() && (var3_2 = (h)var4_3.e()) != null) {
                var4_3 = var3_2;
                continue;
            }
            var5_4 = ax.Sb.b.k;
            while (true) {
                var3_2 = (C)var5_4.get(this);
                if (var3_2.d0 >= var4_3.d0) {
                    return;
                }
                if (var4_3.q()) ** break;
                continue block1;
                if (ax.D.b.a(var5_4, this, var3_2, var4_3)) {
                    if (var3_2.m()) {
                        var3_2.k();
                    }
                    return;
                }
                if (!var4_3.m()) continue;
                var4_3.k();
            }
            break;
        }
    }

    private final void a0(ax.Qb.l<? super E> l8) {
        n.a a8 = n.q;
        l8.f(n.a(ax.sb.o.a(this.E())));
    }

    private final void d0(R0 r02, h<E> h8, int n8) {
        this.c0();
        r02.a(h8, n8);
    }

    private final void e0(R0 r02, h<E> h8, int n8) {
        r02.a(h8, n8 + ax.Sb.c.b);
    }

    static /* synthetic */ <E> Object f0(b<E> object, ax.wb.e<? super E> e8) {
        Object object2 = (h)ax.Sb.b.j.get(object);
        b<E> b8 = object;
        object = object2;
        while (!b8.O()) {
            long l8 = ax.Sb.b.f.getAndIncrement(b8);
            int n8 = ax.Sb.c.b;
            long l9 = l8 / (long)n8;
            n8 = (int)(l8 % (long)n8);
            if (((C)object).d0 != l9) {
                object2 = ((b)b8).A(l9, (h)object);
                if (object2 == null) continue;
                object = object2;
            }
            if ((object2 = ((b)b8).q0((h)object, n8, l8, null)) != ax.Sb.c.q()) {
                if (object2 == ax.Sb.c.h()) {
                    if (l8 >= b8.H()) continue;
                    ((e)object).b();
                    continue;
                }
                if (object2 == ax.Sb.c.r()) {
                    return super.g0((h<E>)object, n8, l8, (ax.wb.e<E>)e8);
                }
                ((e)object).b();
                return object2;
            }
            throw new IllegalStateException("unexpected");
        }
        throw E.a(super.E());
    }

    /*
     * Exception decompiling
     */
    private final Object g0(h<E> var1_1, int var2_3, long var3_4, ax.wb.e<? super E> var5_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [1 : 44->49)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private final void h0(h<E> object) {
        int n8;
        Object object2;
        h h8;
        ax.Fb.l<E, t> l8 = this.c;
        Object object3 = null;
        Object object4 = ax.Vb.l.b(null, 1, null);
        h h9 = object;
        block0: do {
            object2 = object4;
            object = object3;
            block1: for (n8 = ax.Sb.c.b - 1; -1 < n8; --n8) {
                long l9 = h9.d0 * (long)ax.Sb.c.b + (long)n8;
                while ((object4 = h9.w(n8)) != ax.Sb.c.f()) {
                    if (object4 == ax.Sb.c.d) {
                        if (l9 < this.F()) break block0;
                        if (!h9.r(n8, object4, ax.Sb.c.y())) continue;
                        object4 = object;
                        if (l8 != null) {
                            object4 = x.c(l8, h9.v(n8), (O)object);
                        }
                        h9.s(n8);
                        h9.p();
                        object = object4;
                        continue block1;
                    }
                    if (object4 != ax.Sb.c.k() && object4 != null) {
                        if (!(object4 instanceof R0) && !(object4 instanceof o)) {
                            if (object4 == ax.Sb.c.o() || object4 == ax.Sb.c.p()) break block0;
                            if (object4 == ax.Sb.c.o()) continue;
                            continue block1;
                        }
                        if (l9 < this.F()) break block0;
                        object3 = object4 instanceof o ? ((o)object4).a : (R0)object4;
                        if (!h9.r(n8, object4, ax.Sb.c.y())) continue;
                        object4 = object;
                        if (l8 != null) {
                            object4 = x.c(l8, h9.v(n8), (O)object);
                        }
                        object2 = ax.Vb.l.c(object2, object3);
                        h9.s(n8);
                        h9.p();
                        object = object4;
                        continue block1;
                    }
                    if (!h9.r(n8, object4, ax.Sb.c.y())) continue;
                    h9.p();
                    continue block1;
                }
                break block0;
            }
            h8 = (h)h9.g();
            object3 = object;
            object4 = object2;
            h9 = h8;
        } while (h8 != null);
        if (object2 != null) {
            if (!(object2 instanceof ArrayList)) {
                this.j0((R0)object2);
            } else {
                ax.Gb.l.d(object2, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
                object4 = (ArrayList)object2;
                for (n8 = ((ArrayList)object4).size() - 1; -1 < n8; --n8) {
                    this.j0((R0)((ArrayList)object4).get(n8));
                }
            }
        }
        if (object == null) {
            return;
        }
        throw object;
    }

    private final void i0(R0 r02) {
        this.k0(r02, true);
    }

    private final void j0(R0 r02) {
        this.k0(r02, false);
    }

    private final void k0(R0 object, boolean bl) {
        if (object instanceof b) {
            object = ((b)object).b();
            n.a a8 = n.q;
            object.f(n.a(Boolean.FALSE));
            return;
        }
        if (object instanceof ax.Qb.l) {
            ax.wb.e e8 = (ax.wb.e)object;
            object = n.q;
            object = bl ? this.E() : this.G();
            e8.f(n.a(ax.sb.o.a((Throwable)object)));
            return;
        }
        if (object instanceof l) {
            m m8 = ((l)object).q;
            object = n.q;
            m8.f(n.a(ax.Sb.f.b(ax.Sb.f.b.a(this.D()))));
            return;
        }
        if (object instanceof a) {
            ((a)object).c();
            return;
        }
        if (object instanceof ax.Yb.b) {
            ((ax.Yb.b)object).d(this, ax.Sb.c.y());
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected waiter: ");
        stringBuilder.append(object);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    public static final /* synthetic */ void l(b b8, ax.Qb.l l8) {
        b8.a0(l8);
    }

    private final boolean l0(long l8) {
        if (this.R(l8)) {
            return false;
        }
        return this.q(l8 & 0xFFFFFFFFFFFFFFFL) ^ true;
    }

    private final boolean m0(Object l8, E object) {
        if (l8 instanceof ax.Yb.b) {
            return ((ax.Yb.b)((Object)l8)).d(this, object);
        }
        boolean bl = l8 instanceof l;
        f f8 = null;
        ax.Qb.l l9 = null;
        if (bl) {
            ax.Gb.l.d(l8, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            l l10 = (l)((Object)l8);
            m m8 = l10.q;
            f8 = ax.Sb.f.b(ax.Sb.f.b.c(object));
            ax.Fb.l<E, t> l11 = this.c;
            l8 = l9;
            if (l11 != null) {
                l8 = x.a(l11, object, l10.q.b());
            }
            return ax.Sb.c.t(m8, f8, l8);
        }
        if (l8 instanceof a) {
            ax.Gb.l.d(l8, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a)((Object)l8)).b(object);
        }
        if (l8 instanceof ax.Qb.l) {
            ax.Gb.l.d(l8, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            l9 = (ax.Qb.l)((Object)l8);
            ax.Fb.l<E, t> l12 = this.c;
            l8 = f8;
            if (l12 != null) {
                l8 = x.a(l12, object, l9.b());
            }
            return ax.Sb.c.t(l9, object, l8);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Unexpected receiver type: ");
        ((StringBuilder)object).append(l8);
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }

    private final boolean n0(Object object, h<E> object2, int n8) {
        if (object instanceof ax.Qb.l) {
            ax.Gb.l.d(object, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return ax.Sb.c.B((ax.Qb.l)object, t.a, null, 2, null);
        }
        if (object instanceof ax.Yb.b) {
            ax.Gb.l.d(object, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            object = ((ax.Yb.a)object).k(this, t.a);
            if (object == ax.Yb.d.c0) {
                ((h)object2).s(n8);
            }
            return object == ax.Yb.d.q;
        }
        if (object instanceof b) {
            return ax.Sb.c.B(((b)object).b(), Boolean.TRUE, null, 2, null);
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Unexpected waiter: ");
        ((StringBuilder)object2).append(object);
        throw new IllegalStateException(((StringBuilder)object2).toString().toString());
    }

    private final boolean o0(h<E> h8, int n8, long l8) {
        Object object = h8.w(n8);
        if (object instanceof R0 && l8 >= f.get(this) && h8.r(n8, object, ax.Sb.c.o())) {
            if (this.n0(object, h8, n8)) {
                h8.A(n8, ax.Sb.c.d);
                return true;
            }
            h8.A(n8, ax.Sb.c.j());
            h8.x(n8, false);
            return false;
        }
        return this.p0(h8, n8, l8);
    }

    private final boolean p0(h<E> object, int n8, long l8) {
        block8: {
            Object object2;
            while (true) {
                if ((object2 = ((h)object).w(n8)) instanceof R0) {
                    if (l8 < f.get(this)) {
                        if (!((h)object).r(n8, object2, new o((R0)object2))) continue;
                        return true;
                    }
                    if (!((h)object).r(n8, object2, ax.Sb.c.o())) continue;
                    if (this.n0(object2, (h<E>)object, n8)) {
                        ((h)object).A(n8, ax.Sb.c.d);
                        return true;
                    }
                    ((h)object).A(n8, ax.Sb.c.j());
                    ((h)object).x(n8, false);
                    return false;
                }
                if (object2 == ax.Sb.c.j()) {
                    return false;
                }
                if (object2 == null) {
                    if (!((h)object).r(n8, object2, ax.Sb.c.k())) continue;
                    return true;
                }
                if (object2 == ax.Sb.c.d) {
                    return true;
                }
                if (object2 == ax.Sb.c.n() || object2 == ax.Sb.c.f() || object2 == ax.Sb.c.i()) break block8;
                if (object2 == ax.Sb.c.y()) {
                    return true;
                }
                if (object2 != ax.Sb.c.p()) break;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Unexpected cell state: ");
            ((StringBuilder)object).append(object2);
            throw new IllegalStateException(((StringBuilder)object).toString().toString());
        }
        return true;
    }

    private final boolean q(long l8) {
        return l8 < this.C() || l8 < this.F() + (long)this.b;
        {
        }
    }

    private final Object q0(h<E> h8, int n8, long l8, Object object) {
        Object object2 = h8.w(n8);
        if (object2 == null) {
            if (l8 >= (e.get(this) & 0xFFFFFFFFFFFFFFFL)) {
                if (object == null) {
                    return ax.Sb.c.r();
                }
                if (h8.r(n8, object2, object)) {
                    this.y();
                    return ax.Sb.c.q();
                }
            }
        } else if (object2 == ax.Sb.c.d && h8.r(n8, object2, ax.Sb.c.f())) {
            this.y();
            return h8.y(n8);
        }
        return this.r0(h8, n8, l8, object);
    }

    /*
     * Unable to fully structure code
     */
    private final void r(h<E> var1_1, long var2_2) {
        var5_3 = ax.Vb.l.b(null, 1, null);
        var6_4 = var1_1;
        var1_1 = var5_3;
        block0: while (true) {
            var5_3 = var1_1;
            if (var6_4 == null) break;
            for (var4_5 = ax.Sb.c.b - 1; -1 < var4_5; --var4_5) {
                block6: {
                    var5_3 = var1_1;
                    if (var6_4.d0 * (long)ax.Sb.c.b + (long)var4_5 < var2_2) break block0;
                    do lbl-1000:
                    // 4 sources

                    {
                        block7: {
                            if ((var7_6 = var6_4.w(var4_5)) == null || var7_6 == ax.Sb.c.k()) continue;
                            if (!(var7_6 instanceof o)) break block7;
                            if (!var6_4.r(var4_5, var7_6, ax.Sb.c.y())) ** GOTO lbl-1000
                            var5_3 = ax.Vb.l.c(var1_1, ((o)var7_6).a);
                            var6_4.x(var4_5, true);
                            break block6;
                        }
                        var5_3 = var1_1;
                        if (!(var7_6 instanceof R0)) break block6;
                        if (!var6_4.r(var4_5, var7_6, ax.Sb.c.y())) ** GOTO lbl-1000
                        var5_3 = ax.Vb.l.c(var1_1, var7_6);
                        var6_4.x(var4_5, true);
                        break block6;
                    } while (!var6_4.r(var4_5, var7_6, ax.Sb.c.y()));
                    var6_4.p();
                    var5_3 = var1_1;
                }
                var1_1 = var5_3;
            }
            var6_4 = (h)var6_4.g();
        }
        if (var5_3 != null) {
            if (!(var5_3 instanceof ArrayList)) {
                this.i0((R0)var5_3);
                return;
            }
            ax.Gb.l.d(var5_3, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            var1_1 = (ArrayList)var5_3;
            for (var4_5 = var1_1.size() - 1; -1 < var4_5; --var4_5) {
                this.i0((R0)var1_1.get(var4_5));
            }
        }
    }

    private final Object r0(h<E> h8, int n8, long l8, Object object) {
        while (true) {
            Object object2;
            if ((object2 = h8.w(n8)) != null && object2 != ax.Sb.c.k()) {
                if (object2 == ax.Sb.c.d) {
                    if (!h8.r(n8, object2, ax.Sb.c.f())) continue;
                    this.y();
                    return h8.y(n8);
                }
                if (object2 == ax.Sb.c.j()) {
                    return ax.Sb.c.h();
                }
                if (object2 == ax.Sb.c.n()) {
                    return ax.Sb.c.h();
                }
                if (object2 == ax.Sb.c.y()) {
                    this.y();
                    return ax.Sb.c.h();
                }
                if (object2 == ax.Sb.c.o() || !h8.r(n8, object2, ax.Sb.c.p())) continue;
                boolean bl = object2 instanceof o;
                object = object2;
                if (bl) {
                    object = ((o)object2).a;
                }
                if (this.n0(object, h8, n8)) {
                    h8.A(n8, ax.Sb.c.f());
                    this.y();
                    return h8.y(n8);
                }
                h8.A(n8, ax.Sb.c.j());
                h8.x(n8, false);
                if (bl) {
                    this.y();
                }
                return ax.Sb.c.h();
            }
            if (l8 < (e.get(this) & 0xFFFFFFFFFFFFFFFL)) {
                if (!h8.r(n8, object2, ax.Sb.c.n())) continue;
                this.y();
                return ax.Sb.c.h();
            }
            if (object == null) {
                return ax.Sb.c.r();
            }
            if (h8.r(n8, object2, object)) break;
        }
        this.y();
        return ax.Sb.c.q();
    }

    private final h<E> s() {
        Object object = k.get(this);
        h<Object> h8 = (h)i.get(this);
        Object object2 = object;
        if (h8.d0 > ((h)object).d0) {
            object2 = h8;
        }
        object = (h)j.get(this);
        h8 = object2;
        if (((C)object).d0 > ((h)object2).d0) {
            h8 = object;
        }
        return (h)ax.Vb.d.b((e)h8);
    }

    private final int s0(h<E> h8, int n8, E e8, long l8, Object object, boolean bl) {
        h8.B(n8, e8);
        if (bl) {
            return this.t0(h8, n8, e8, l8, object, bl);
        }
        Object object2 = h8.w(n8);
        if (object2 == null) {
            if (this.q(l8)) {
                if (h8.r(n8, null, ax.Sb.c.d)) {
                    return 1;
                }
            } else {
                if (object == null) {
                    return 3;
                }
                if (h8.r(n8, null, object)) {
                    return 2;
                }
            }
        } else if (object2 instanceof R0) {
            h8.s(n8);
            if (this.m0(object2, e8)) {
                h8.A(n8, ax.Sb.c.f());
                this.b0();
                return 0;
            }
            if (h8.t(n8, ax.Sb.c.i()) != ax.Sb.c.i()) {
                h8.x(n8, true);
            }
            return 5;
        }
        return this.t0(h8, n8, e8, l8, object, bl);
    }

    private final int t0(h<E> h8, int n8, E e8, long l8, Object object, boolean bl) {
        Object object2;
        block11: {
            while (true) {
                if ((object2 = h8.w(n8)) == null) {
                    if (this.q(l8) && !bl) {
                        if (!h8.r(n8, null, ax.Sb.c.d)) continue;
                        return 1;
                    }
                    if (bl) {
                        if (!h8.r(n8, null, ax.Sb.c.j())) continue;
                        h8.x(n8, false);
                        return 4;
                    }
                    if (object == null) {
                        return 3;
                    }
                    if (!h8.r(n8, null, object)) continue;
                    return 2;
                }
                if (object2 != ax.Sb.c.k()) break block11;
                if (h8.r(n8, object2, ax.Sb.c.d)) break;
            }
            return 1;
        }
        if (object2 == ax.Sb.c.i()) {
            h8.s(n8);
            return 5;
        }
        if (object2 == ax.Sb.c.n()) {
            h8.s(n8);
            return 5;
        }
        if (object2 == ax.Sb.c.y()) {
            h8.s(n8);
            this.w();
            return 4;
        }
        h8.s(n8);
        object = object2;
        if (object2 instanceof o) {
            object = ((o)object2).a;
        }
        if (this.m0(object, e8)) {
            h8.A(n8, ax.Sb.c.f());
            this.b0();
            return 0;
        }
        if (h8.t(n8, ax.Sb.c.i()) != ax.Sb.c.i()) {
            h8.x(n8, true);
        }
        return 5;
    }

    private final void u(long l8) {
        this.h0(this.v(l8));
    }

    private final void u0(long l8) {
        long l9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f;
        while ((l9 = atomicLongFieldUpdater.get(this)) < l8 && !f.compareAndSet(this, l9, l8)) {
        }
    }

    private final h<E> v(long l8) {
        long l9;
        h<E> h8 = this.s();
        if (this.S() && (l9 = this.U(h8)) != -1L) {
            this.x(l9);
        }
        this.r(h8, l8);
        return h8;
    }

    private final void v0(long l8) {
        long l9;
        long l10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        while ((l10 = 0xFFFFFFFFFFFFFFFL & (l9 = atomicLongFieldUpdater.get(this))) < l8 && !e.compareAndSet(this, l9, l10 = ax.Sb.c.b(l10, (int)(l9 >> 60)))) {
        }
    }

    private final void w() {
        this.Q();
    }

    private final void y() {
        if (this.T()) {
            return;
        }
        h<E> h8 = (h<E>)k.get(this);
        while (true) {
            long l8 = g.getAndIncrement(this);
            int n8 = ax.Sb.c.b;
            long l9 = l8 / (long)n8;
            if (this.H() <= l8) {
                if (h8.d0 < l9 && h8.e() != null) {
                    this.Y(l9, h8);
                }
                ax.Sb.b.K(this, 0L, 1, null);
                return;
            }
            if (h8.d0 != l9) {
                h<E> h9 = this.z(l9, h8, l8);
                if (h9 == null) continue;
                h8 = h9;
            }
            if (this.o0(h8, (int)(l8 % (long)n8), l8)) {
                ax.Sb.b.K(this, 0L, 1, null);
                return;
            }
            ax.Sb.b.K(this, 0L, 1, null);
        }
    }

    private final h<E> z(long l8, h<E> h8, long l9) {
        Object object;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        p p8 = (p)((Object)ax.Sb.c.x());
        block0: while (!D.c(object = ax.Vb.d.c(h8, l8, p8))) {
            Object s8 = D.b(object);
            while (true) {
                C c8 = (C)atomicReferenceFieldUpdater.get(this);
                if (c8.d0 >= ((C)s8).d0) break block0;
                if (!((C)s8).q()) continue block0;
                if (ax.D.b.a(atomicReferenceFieldUpdater, this, c8, s8)) {
                    if (!c8.m()) break block0;
                    c8.k();
                    break block0;
                }
                if (!((C)s8).m()) continue;
                ((e)s8).k();
            }
        }
        if (D.c(object)) {
            this.w();
            this.Y(l8, h8);
            ax.Sb.b.K(this, 0L, 1, null);
            return null;
        }
        h8 = (h)D.b(object);
        long l10 = h8.d0;
        if (l10 > l8) {
            object = g;
            int n8 = ax.Sb.c.b;
            if (((AtomicLongFieldUpdater)object).compareAndSet(this, l9 + 1L, l10 * (long)n8)) {
                this.J(h8.d0 * (long)n8 - l9);
            } else {
                ax.Sb.b.K(this, 0L, 1, null);
            }
            return null;
        }
        return h8;
    }

    protected final Throwable D() {
        return (Throwable)l.get(this);
    }

    public final long F() {
        return f.get(this);
    }

    protected final Throwable G() {
        Throwable throwable;
        Throwable throwable2 = throwable = this.D();
        if (throwable == null) {
            throwable2 = new j("Channel was closed");
        }
        return throwable2;
    }

    public final long H() {
        return e.get(this) & 0xFFFFFFFFFFFFFFFL;
    }

    public final boolean I() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            h<E> h8 = (h<E>)atomicReferenceFieldUpdater.get(this);
            long l8 = this.F();
            if (this.H() <= l8) {
                return false;
            }
            int n8 = ax.Sb.c.b;
            long l9 = l8 / (long)n8;
            h<E> h9 = h8;
            if (h8.d0 != l9) {
                h9 = h8 = this.A(l9, h8);
                if (h8 == null) {
                    if (((h)atomicReferenceFieldUpdater.get(this)).d0 >= l9) continue;
                    return false;
                }
            }
            h9.b();
            if (this.M(h9, (int)(l8 % (long)n8), l8)) {
                return true;
            }
            f.compareAndSet(this, l8, l8 + 1L);
        }
    }

    public boolean O() {
        return this.P(e.get(this));
    }

    public boolean Q() {
        return this.R(e.get(this));
    }

    protected boolean S() {
        return false;
    }

    protected void Z() {
    }

    @Override
    public Object a(ax.wb.e<? super E> e8) {
        return ax.Sb.b.f0(this, e8);
    }

    @Override
    public Object b() {
        h h8;
        long l8 = f.get(this);
        long l9 = e.get(this);
        if (this.P(l9)) {
            return ax.Sb.f.b.a(this.D());
        }
        if (l8 >= (l9 & 0xFFFFFFFFFFFFFFFL)) {
            return ax.Sb.f.b.b();
        }
        F f8 = ax.Sb.c.i();
        Object object = (h)ax.Sb.b.j.get(this);
        while (true) {
            if (this.O()) {
                return ax.Sb.f.b.a(this.D());
            }
            l8 = ax.Sb.b.f.getAndIncrement(this);
            int n8 = ax.Sb.c.b;
            l9 = l8 / (long)n8;
            n8 = (int)(l8 % (long)n8);
            if (((C)object).d0 != l9) {
                h h9;
                h8 = h9 = this.A(l9, (h)object);
                if (h9 == null) {
                    continue;
                }
            } else {
                h8 = object;
            }
            object = this.q0(h8, n8, l8, f8);
            if (object == ax.Sb.c.q()) {
                object = f8 instanceof R0 ? (R0)((Object)f8) : null;
                if (object != null) {
                    this.d0((R0)object, h8, n8);
                }
                this.w0(l8);
                h8.p();
                return ax.Sb.f.b.b();
            }
            if (object != ax.Sb.c.h()) break;
            if (l8 < this.H()) {
                h8.b();
            }
            object = h8;
        }
        if (object != ax.Sb.c.r()) {
            h8.b();
            return ax.Sb.f.b.c(object);
        }
        throw new IllegalStateException("unexpected");
    }

    protected void b0() {
    }

    @Override
    public boolean c(Throwable throwable) {
        return this.t(throwable, false);
    }

    protected void c0() {
    }

    @Override
    public Object d(E object) {
        block7: {
            block8: {
                int n8;
                boolean bl;
                Object object2;
                F f8;
                block9: {
                    block10: {
                        long l8;
                        if (this.l0(e.get(this))) {
                            return ax.Sb.f.b.b();
                        }
                        f8 = ax.Sb.c.j();
                        h h8 = (h)ax.Sb.b.i.get(this);
                        object2 = object;
                        object = h8;
                        while (true) {
                            long l9 = ax.Sb.b.e.getAndIncrement(this);
                            l8 = 0xFFFFFFFFFFFFFFFL & l9;
                            bl = this.R(l9);
                            int n9 = ax.Sb.c.b;
                            l9 = l8 / (long)n9;
                            n8 = (int)(l8 % (long)n9);
                            if (((C)object).d0 != l9) {
                                h8 = this.B(l9, object);
                                if (h8 == null) {
                                    if (!bl) continue;
                                    return ax.Sb.f.b.a(this.G());
                                }
                                object = h8;
                            }
                            n9 = this.s0(object, n8, object2, l8, f8, bl);
                            if (n9 == 0) break block7;
                            if (n9 == 1) break block8;
                            if (n9 == 2) break block9;
                            if (n9 == 3) break block10;
                            if (n9 == 4) break;
                            if (n9 != 5) continue;
                            ((e)object).b();
                        }
                        if (l8 < this.F()) {
                            ((e)object).b();
                        }
                        return ax.Sb.f.b.a(this.G());
                    }
                    throw new IllegalStateException("unexpected");
                }
                if (bl) {
                    ((C)object).p();
                    return ax.Sb.f.b.a(this.G());
                }
                object2 = f8 instanceof R0 ? (R0)((Object)f8) : null;
                if (object2 != null) {
                    this.e0(object2, (h)object, n8);
                }
                ((C)object).p();
                return ax.Sb.f.b.b();
            }
            return ax.Sb.f.b.c(t.a);
        }
        ((e)object).b();
        return ax.Sb.f.b.c(t.a);
    }

    protected boolean t(Throwable throwable, boolean bl) {
        if (bl) {
            this.V();
        }
        boolean bl2 = ax.D.b.a(l, this, ax.Sb.c.l(), throwable);
        if (bl) {
            this.W();
        } else {
            this.X();
        }
        this.w();
        this.Z();
        if (bl2) {
            this.L();
        }
        return bl2;
    }

    public String toString() {
        Object object;
        StringBuilder stringBuilder = new StringBuilder();
        int n8 = (int)(e.get(this) >> 60);
        if (n8 != 2) {
            if (n8 == 3) {
                stringBuilder.append("cancelled,");
            }
        } else {
            stringBuilder.append("closed,");
        }
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append("capacity=");
        ((StringBuilder)object2).append(this.b);
        ((StringBuilder)object2).append(',');
        stringBuilder.append(((StringBuilder)object2).toString());
        stringBuilder.append("data=[");
        Object object3 = ax.tb.o.l(j.get(this), i.get(this), k.get(this));
        object2 = new ArrayList();
        object3 = object3.iterator();
        while (object3.hasNext()) {
            object = object3.next();
            if ((h)object == ax.Sb.c.m()) continue;
            object2.add(object);
        }
        Iterator iterator = object2.iterator();
        if (iterator.hasNext()) {
            long l8;
            long l9;
            long l10;
            object3 = iterator.next();
            if (!iterator.hasNext()) {
                object2 = object3;
            } else {
                l10 = ((h)object3).d0;
                do {
                    object = iterator.next();
                    l9 = ((h)object).d0;
                    object2 = object3;
                    l8 = l10;
                    if (l10 > l9) {
                        object2 = object;
                        l8 = l9;
                    }
                    object3 = object2;
                    l10 = l8;
                } while (iterator.hasNext());
            }
            object3 = (h)object2;
            l8 = this.F();
            l10 = this.H();
            block2: do {
                int n9 = ax.Sb.c.b;
                for (n8 = 0; n8 < n9; ++n8) {
                    long l11;
                    l9 = ((C)object3).d0 * (long)ax.Sb.c.b + (long)n8;
                    long l12 = l9 - l10;
                    long l13 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                    if (l13 >= 0 && l9 >= l8) break block2;
                    iterator = ((h)object3).w(n8);
                    object = ((h)object3).v(n8);
                    if (iterator instanceof ax.Qb.l) {
                        l11 = l9 == l8 ? 0 : (l9 < l8 ? -1 : 1);
                        object2 = l11 < 0 && l13 >= 0 ? "receive" : (l13 < 0 && l11 >= 0 ? "send" : "cont");
                    } else if (iterator instanceof ax.Yb.b) {
                        l11 = l9 == l8 ? 0 : (l9 < l8 ? -1 : 1);
                        object2 = l11 < 0 && l13 >= 0 ? "onReceive" : (l13 < 0 && l11 >= 0 ? "onSend" : "select");
                    } else if (iterator instanceof l) {
                        object2 = "receiveCatching";
                    } else if (iterator instanceof b) {
                        object2 = "sendBroadcast";
                    } else if (iterator instanceof o) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("EB(");
                        ((StringBuilder)object2).append(iterator);
                        ((StringBuilder)object2).append(')');
                        object2 = ((StringBuilder)object2).toString();
                    } else {
                        boolean bl = ax.Gb.l.a(iterator, ax.Sb.c.p()) ? true : ax.Gb.l.a(iterator, ax.Sb.c.o());
                        if (bl) {
                            object2 = "resuming_sender";
                        } else {
                            bl = iterator == null ? true : ax.Gb.l.a(iterator, ax.Sb.c.k());
                            bl = bl ? true : ax.Gb.l.a(iterator, ax.Sb.c.f());
                            bl = bl ? true : ax.Gb.l.a(iterator, ax.Sb.c.n());
                            bl = bl ? true : ax.Gb.l.a(iterator, ax.Sb.c.i());
                            bl = bl ? true : ax.Gb.l.a(iterator, ax.Sb.c.j());
                            if (bl = bl ? true : ax.Gb.l.a(iterator, ax.Sb.c.y())) continue;
                            object2 = iterator.toString();
                        }
                    }
                    if (object != null) {
                        iterator = new StringBuilder();
                        ((StringBuilder)((Object)iterator)).append('(');
                        ((StringBuilder)((Object)iterator)).append((String)object2);
                        ((StringBuilder)((Object)iterator)).append(',');
                        ((StringBuilder)((Object)iterator)).append(object);
                        ((StringBuilder)((Object)iterator)).append("),");
                        stringBuilder.append(((StringBuilder)((Object)iterator)).toString());
                        continue;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append((String)object2);
                    ((StringBuilder)object).append(',');
                    stringBuilder.append(((StringBuilder)object).toString());
                }
            } while ((object3 = (h)((e)object3).e()) != null);
            if (ax.Ob.h.C0(stringBuilder) == ',') {
                ax.Gb.l.e(stringBuilder.deleteCharAt(stringBuilder.length() - 1), "this.deleteCharAt(index)");
            }
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
        throw new NoSuchElementException();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void w0(long l8) {
        int n8;
        if (this.T()) return;
        while (this.C() <= l8) {
        }
        int n9 = ax.Sb.c.g();
        for (n8 = 0; n8 < n9; ++n8) {
            l8 = this.C();
            if (l8 == (0x3FFFFFFFFFFFFFFFL & h.get(this)) && l8 == this.C()) return;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = h;
        while (!atomicLongFieldUpdater.compareAndSet(this, l8 = atomicLongFieldUpdater.get(this), ax.Sb.c.a(l8 & 0x3FFFFFFFFFFFFFFFL, true))) {
        }
        while (true) {
            long l9 = this.C();
            atomicLongFieldUpdater = h;
            long l10 = atomicLongFieldUpdater.get(this);
            l8 = l10 & 0x3FFFFFFFFFFFFFFFL;
            n8 = (0x4000000000000000L & l10) != 0L ? 1 : 0;
            if (l9 == l8 && l9 == this.C()) {
                while (!atomicLongFieldUpdater.compareAndSet(this, l8 = atomicLongFieldUpdater.get(this), ax.Sb.c.a(l8 & 0x3FFFFFFFFFFFFFFFL, false))) {
                }
                return;
            }
            if (n8 != 0) continue;
            atomicLongFieldUpdater.compareAndSet(this, l10, ax.Sb.c.a(l8, true));
        }
    }

    protected final void x(long l8) {
        Object object = (h)j.get(this);
        h<E> h8;
        long l9;
        while (l8 >= Math.max((long)this.b + (l9 = ((AtomicLongFieldUpdater)((Object)(h8 = f))).get(this)), this.C())) {
            if (!((AtomicLongFieldUpdater)((Object)h8)).compareAndSet(this, l9, 1L + l9)) continue;
            int n8 = ax.Sb.c.b;
            long l10 = l9 / (long)n8;
            n8 = (int)(l9 % (long)n8);
            h8 = object;
            if (((C)object).d0 != l10 && (h8 = this.A(l10, (h<E>)object)) == null) continue;
            Object object2 = this.q0(h8, n8, l9, null);
            if (object2 == ax.Sb.c.h()) {
                if (l9 < this.H()) {
                    h8.b();
                }
            } else {
                h8.b();
                object = this.c;
                if (object != null && (object = x.d(object, object2, null, 2, null)) != null) {
                    throw object;
                }
            }
            object = h8;
        }
        return;
    }

    private final class a
    implements R0 {
        private m<? super Boolean> c0;
        final b<E> d0;
        private Object q;

        @Override
        public void a(C<?> c8, int n8) {
            m<? super Boolean> m8 = this.c0;
            if (m8 != null) {
                m8.a(c8, n8);
            }
        }

        public final boolean b(E e8) {
            m<? super Boolean> m8 = this.c0;
            ax.Gb.l.c(m8);
            ax.Fb.l<Throwable, t> l8 = null;
            this.c0 = null;
            this.q = e8;
            Boolean bl = Boolean.TRUE;
            ax.Fb.l l9 = this.d0.c;
            if (l9 != null) {
                l8 = x.a(l9, e8, m8.b());
            }
            return ax.Sb.c.t(m8, bl, l8);
        }

        public final void c() {
            m<? super Boolean> m8 = this.c0;
            ax.Gb.l.c(m8);
            this.c0 = null;
            this.q = ax.Sb.c.y();
            Object object = this.d0.D();
            if (object == null) {
                object = n.q;
                m8.f(n.a(Boolean.FALSE));
                return;
            }
            n.a a8 = n.q;
            m8.f(n.a(ax.sb.o.a((Throwable)object)));
        }
    }

    private static final class b
    implements R0 {
        private final m<Boolean> c0;
        private final ax.Qb.l<Boolean> q;

        @Override
        public void a(C<?> c8, int n8) {
            this.c0.a(c8, n8);
        }

        public final ax.Qb.l<Boolean> b() {
            return this.q;
        }
    }
}

