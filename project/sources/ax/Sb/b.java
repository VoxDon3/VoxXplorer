package ax.Sb;

import ax.Fb.p;
import ax.Fb.q;
import ax.Qb.C0947m;
import ax.Qb.C0951o;
import ax.Qb.InterfaceC0945l;
import ax.Qb.R0;
import ax.Vb.AbstractC0998e;
import ax.Vb.C;
import ax.Vb.C0997d;
import ax.Vb.C1005l;
import ax.Vb.D;
import ax.Vb.E;
import ax.Vb.F;
import ax.Vb.O;
import ax.Vb.x;
import ax.i.s;
import ax.sb.C3082n;
import ax.sb.C3083o;
import ax.sb.t;
import ax.xb.C3479b;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public class b<E> implements d<E> {
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

    private final class a implements R0 {
        private C0947m<? super Boolean> c0;
        final /* synthetic */ b<E> d0;
        private Object q;

        @Override // ax.Qb.R0
        public void a(C<?> c, int i) {
            C0947m<? super Boolean> c0947m = this.c0;
            if (c0947m != null) {
                c0947m.a(c, i);
            }
        }

        public final boolean b(E e) {
            boolean A;
            C0947m<? super Boolean> c0947m = this.c0;
            ax.Gb.l.c(c0947m);
            this.c0 = null;
            this.q = e;
            Boolean bool = Boolean.TRUE;
            ax.Fb.l<E, t> lVar = this.d0.c;
            A = ax.Sb.c.A(c0947m, bool, lVar != null ? x.a(lVar, e, c0947m.b()) : null);
            return A;
        }

        public final void c() {
            C0947m<? super Boolean> c0947m = this.c0;
            ax.Gb.l.c(c0947m);
            this.c0 = null;
            this.q = ax.Sb.c.y();
            Throwable D = this.d0.D();
            if (D == null) {
                C3082n.a aVar = C3082n.q;
                c0947m.f(C3082n.a(Boolean.FALSE));
            } else {
                C3082n.a aVar2 = C3082n.q;
                c0947m.f(C3082n.a(C3083o.a(D)));
            }
        }
    }

    /* renamed from: ax.Sb.b$b, reason: collision with other inner class name */
    private static final class C0192b implements R0 {
        private final /* synthetic */ C0947m<Boolean> c0;
        private final InterfaceC0945l<Boolean> q;

        @Override // ax.Qb.R0
        public void a(C<?> c, int i) {
            this.c0.a(c, i);
        }

        public final InterfaceC0945l<Boolean> b() {
            return this.q;
        }
    }

    static final class c extends ax.Gb.m implements q<ax.Yb.b<?>, Object, Object, ax.Fb.l<? super Throwable, ? extends t>> {
        final /* synthetic */ b<E> q;

        static final class a extends ax.Gb.m implements ax.Fb.l<Throwable, t> {
            final /* synthetic */ b<E> c0;
            final /* synthetic */ ax.Yb.b<?> d0;
            final /* synthetic */ Object q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, b<E> bVar, ax.Yb.b<?> bVar2) {
                super(1);
                this.q = obj;
                this.c0 = bVar;
                this.d0 = bVar2;
            }

            public final void a(Throwable th) {
                if (this.q != ax.Sb.c.y()) {
                    x.b(this.c0.c, this.q, this.d0.b());
                }
            }

            @Override // ax.Fb.l
            public /* bridge */ /* synthetic */ t invoke(Throwable th) {
                a(th);
                return t.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b<E> bVar) {
            super(3);
            this.q = bVar;
        }

        @Override // ax.Fb.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ax.Fb.l<Throwable, t> c(ax.Yb.b<?> bVar, Object obj, Object obj2) {
            return new a(obj2, this.q, bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(int i2, ax.Fb.l<? super E, t> lVar) {
        long z;
        F f2;
        this.b = i2;
        this.c = lVar;
        if (i2 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i2 + ", should be >=0").toString());
        }
        z = ax.Sb.c.z(i2);
        this.bufferEnd = z;
        this.completedExpandBuffersAndPauseFlag = C();
        h hVar = new h(0L, null, this, 3);
        this.sendSegment = hVar;
        this.receiveSegment = hVar;
        if (T()) {
            hVar = ax.Sb.c.a;
            ax.Gb.l.d(hVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = hVar;
        this.d = lVar != 0 ? new c(this) : null;
        f2 = ax.Sb.c.s;
        this._closeCause = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h<E> A(long j2, h<E> hVar) {
        Object c2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        p pVar = (p) ax.Sb.c.x();
        loop0: while (true) {
            c2 = C0997d.c(hVar, j2, pVar);
            if (!D.c(c2)) {
                C b = D.b(c2);
                while (true) {
                    C c3 = (C) atomicReferenceFieldUpdater.get(this);
                    if (c3.d0 >= b.d0) {
                        break loop0;
                    }
                    if (!b.q()) {
                        break;
                    }
                    if (ax.D.b.a(atomicReferenceFieldUpdater, this, c3, b)) {
                        if (c3.m()) {
                            c3.k();
                        }
                    } else if (b.m()) {
                        b.k();
                    }
                }
            } else {
                break;
            }
        }
        if (D.c(c2)) {
            w();
            if (hVar.d0 * ax.Sb.c.b < H()) {
                hVar.b();
            }
            return null;
        }
        h<E> hVar2 = (h) D.b(c2);
        if (!T() && j2 <= C() / ax.Sb.c.b) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k;
            while (true) {
                C c4 = (C) atomicReferenceFieldUpdater2.get(this);
                if (c4.d0 >= hVar2.d0 || !hVar2.q()) {
                    break;
                }
                if (ax.D.b.a(atomicReferenceFieldUpdater2, this, c4, hVar2)) {
                    if (c4.m()) {
                        c4.k();
                    }
                } else if (hVar2.m()) {
                    hVar2.k();
                }
            }
        }
        long j3 = hVar2.d0;
        if (j3 <= j2) {
            return hVar2;
        }
        int i2 = ax.Sb.c.b;
        u0(j3 * i2);
        if (hVar2.d0 * i2 < H()) {
            hVar2.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h<E> B(long j2, h<E> hVar) {
        Object c2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        p pVar = (p) ax.Sb.c.x();
        loop0: while (true) {
            c2 = C0997d.c(hVar, j2, pVar);
            if (!D.c(c2)) {
                C b = D.b(c2);
                while (true) {
                    C c3 = (C) atomicReferenceFieldUpdater.get(this);
                    if (c3.d0 >= b.d0) {
                        break loop0;
                    }
                    if (!b.q()) {
                        break;
                    }
                    if (ax.D.b.a(atomicReferenceFieldUpdater, this, c3, b)) {
                        if (c3.m()) {
                            c3.k();
                        }
                    } else if (b.m()) {
                        b.k();
                    }
                }
            } else {
                break;
            }
        }
        if (D.c(c2)) {
            w();
            if (hVar.d0 * ax.Sb.c.b < F()) {
                hVar.b();
            }
            return null;
        }
        h<E> hVar2 = (h) D.b(c2);
        long j3 = hVar2.d0;
        if (j3 <= j2) {
            return hVar2;
        }
        int i2 = ax.Sb.c.b;
        v0(j3 * i2);
        if (hVar2.d0 * i2 < F()) {
            hVar2.b();
        }
        return null;
    }

    private final long C() {
        return g.get(this);
    }

    private final Throwable E() {
        Throwable D = D();
        return D == null ? new i("Channel was closed") : D;
    }

    private final void J(long j2) {
        if ((h.addAndGet(this, j2) & 4611686018427387904L) != 0) {
            while ((h.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    static /* synthetic */ void K(b bVar, long j2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i2 & 1) != 0) {
            j2 = 1;
        }
        bVar.J(j2);
    }

    private final void L() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!ax.D.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? ax.Sb.c.q : ax.Sb.c.r));
        if (obj == null) {
            return;
        }
        ((ax.Fb.l) obj).invoke(D());
    }

    private final boolean M(h<E> hVar, int i2, long j2) {
        Object w;
        F f2;
        F f3;
        F f4;
        F f5;
        F f6;
        F f7;
        F f8;
        do {
            w = hVar.w(i2);
            if (w != null) {
                f3 = ax.Sb.c.e;
                if (w != f3) {
                    if (w == ax.Sb.c.d) {
                        return true;
                    }
                    f4 = ax.Sb.c.j;
                    if (w == f4 || w == ax.Sb.c.y()) {
                        return false;
                    }
                    f5 = ax.Sb.c.i;
                    if (w == f5) {
                        return false;
                    }
                    f6 = ax.Sb.c.h;
                    if (w == f6) {
                        return false;
                    }
                    f7 = ax.Sb.c.g;
                    if (w == f7) {
                        return true;
                    }
                    f8 = ax.Sb.c.f;
                    return w != f8 && j2 == F();
                }
            }
            f2 = ax.Sb.c.h;
        } while (!hVar.r(i2, w, f2));
        y();
        return false;
    }

    private final boolean N(long j2, boolean z) {
        int i2 = (int) (j2 >> 60);
        if (i2 == 0 || i2 == 1) {
            return false;
        }
        if (i2 == 2) {
            v(j2 & 1152921504606846975L);
            return (z && I()) ? false : true;
        }
        if (i2 == 3) {
            u(j2 & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i2).toString());
    }

    private final boolean P(long j2) {
        return N(j2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean R(long j2) {
        return N(j2, false);
    }

    private final boolean T() {
        long C = C();
        return C == 0 || C == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        r9 = (ax.Sb.h) r9.g();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long U(ax.Sb.h<E> r9) {
        /*
            r8 = this;
        L0:
            int r0 = ax.Sb.c.b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3d
            long r3 = r9.d0
            int r5 = ax.Sb.c.b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r8.F()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L1b
            return r1
        L1b:
            java.lang.Object r1 = r9.w(r0)
            if (r1 == 0) goto L2d
            ax.Vb.F r2 = ax.Sb.c.k()
            if (r1 != r2) goto L28
            goto L2d
        L28:
            ax.Vb.F r2 = ax.Sb.c.d
            if (r1 != r2) goto L3a
            return r3
        L2d:
            ax.Vb.F r2 = ax.Sb.c.y()
            boolean r1 = r9.r(r0, r1, r2)
            if (r1 == 0) goto L1b
            r9.p()
        L3a:
            int r0 = r0 + (-1)
            goto L4
        L3d:
            ax.Vb.e r9 = r9.g()
            ax.Sb.h r9 = (ax.Sb.h) r9
            if (r9 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Sb.b.U(ax.Sb.h):long");
    }

    private final void V() {
        long j2;
        long v;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            if (((int) (j2 >> 60)) != 0) {
                return;
            } else {
                v = ax.Sb.c.v(1152921504606846975L & j2, 1);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, v));
    }

    private final void W() {
        long j2;
        long v;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            v = ax.Sb.c.v(1152921504606846975L & j2, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, v));
    }

    private final void X() {
        long j2;
        long v;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            int i2 = (int) (j2 >> 60);
            if (i2 == 0) {
                v = ax.Sb.c.v(1152921504606846975L & j2, 2);
            } else if (i2 != 1) {
                return;
            } else {
                v = ax.Sb.c.v(1152921504606846975L & j2, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, v));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0011, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Y(long r6, ax.Sb.h<E> r8) {
        /*
            r5 = this;
        L0:
            long r0 = r8.d0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L11
            ax.Vb.e r0 = r8.e()
            ax.Sb.h r0 = (ax.Sb.h) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r8 = r0
            goto L0
        L11:
            boolean r6 = r8.h()
            if (r6 == 0) goto L22
            ax.Vb.e r6 = r8.e()
            ax.Sb.h r6 = (ax.Sb.h) r6
            if (r6 != 0) goto L20
            goto L22
        L20:
            r8 = r6
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = ax.Sb.b.k
        L24:
            java.lang.Object r7 = r6.get(r5)
            ax.Vb.C r7 = (ax.Vb.C) r7
            long r0 = r7.d0
            long r2 = r8.d0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L33
            return
        L33:
            boolean r0 = r8.q()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = ax.D.b.a(r6, r5, r7, r8)
            if (r0 == 0) goto L4a
            boolean r6 = r7.m()
            if (r6 == 0) goto L49
            r7.k()
        L49:
            return
        L4a:
            boolean r7 = r8.m()
            if (r7 == 0) goto L24
            r8.k()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Sb.b.Y(long, ax.Sb.h):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(InterfaceC0945l<? super E> interfaceC0945l) {
        C3082n.a aVar = C3082n.q;
        interfaceC0945l.f(C3082n.a(C3083o.a(E())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(R0 r0, h<E> hVar, int i2) {
        c0();
        r0.a(hVar, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0(R0 r0, h<E> hVar, int i2) {
        r0.a(hVar, i2 + ax.Sb.c.b);
    }

    static /* synthetic */ <E> Object f0(b<E> bVar, ax.wb.e<? super E> eVar) {
        h<E> hVar;
        F f2;
        F f3;
        F f4;
        h<E> hVar2 = (h) j.get(bVar);
        while (!bVar.O()) {
            long andIncrement = f.getAndIncrement(bVar);
            int i2 = ax.Sb.c.b;
            long j2 = andIncrement / i2;
            int i3 = (int) (andIncrement % i2);
            if (hVar2.d0 != j2) {
                h<E> A = bVar.A(j2, hVar2);
                if (A == null) {
                    continue;
                } else {
                    hVar = A;
                }
            } else {
                hVar = hVar2;
            }
            b<E> bVar2 = bVar;
            Object q0 = bVar2.q0(hVar, i3, andIncrement, null);
            f2 = ax.Sb.c.m;
            if (q0 == f2) {
                throw new IllegalStateException("unexpected");
            }
            f3 = ax.Sb.c.o;
            if (q0 != f3) {
                f4 = ax.Sb.c.n;
                if (q0 == f4) {
                    return bVar2.g0(hVar, i3, andIncrement, eVar);
                }
                hVar.b();
                return q0;
            }
            if (andIncrement < bVar2.H()) {
                hVar.b();
            }
            bVar = bVar2;
            hVar2 = hVar;
        }
        throw E.a(bVar.E());
    }

    private final Object g0(h<E> hVar, int i2, long j2, ax.wb.e<? super E> eVar) {
        F f2;
        F f3;
        h hVar2;
        F f4;
        F f5;
        F f6;
        C0947m b = C0951o.b(C3479b.b(eVar));
        try {
            Object q0 = q0(hVar, i2, j2, b);
            f2 = ax.Sb.c.m;
            if (q0 == f2) {
                d0(b, hVar, i2);
            } else {
                f3 = ax.Sb.c.o;
                ax.Fb.l<Throwable, t> lVar = null;
                lVar = null;
                if (q0 == f3) {
                    if (j2 < H()) {
                        hVar.b();
                    }
                    h hVar3 = (h) j.get(this);
                    while (true) {
                        if (O()) {
                            a0(b);
                            break;
                        }
                        long andIncrement = f.getAndIncrement(this);
                        int i3 = ax.Sb.c.b;
                        long j3 = andIncrement / i3;
                        int i4 = (int) (andIncrement % i3);
                        if (hVar3.d0 != j3) {
                            h A = A(j3, hVar3);
                            if (A != null) {
                                hVar2 = A;
                            }
                        } else {
                            hVar2 = hVar3;
                        }
                        q0 = q0(hVar2, i4, andIncrement, b);
                        h hVar4 = hVar2;
                        f4 = ax.Sb.c.m;
                        if (q0 == f4) {
                            C0947m c0947m = s.a(b) ? b : null;
                            if (c0947m != null) {
                                d0(c0947m, hVar4, i4);
                            }
                        } else {
                            f5 = ax.Sb.c.o;
                            if (q0 == f5) {
                                if (andIncrement < H()) {
                                    hVar4.b();
                                }
                                hVar3 = hVar4;
                            } else {
                                f6 = ax.Sb.c.n;
                                if (q0 == f6) {
                                    throw new IllegalStateException("unexpected");
                                }
                                hVar4.b();
                                ax.Fb.l<E, t> lVar2 = this.c;
                                if (lVar2 != null) {
                                    lVar = x.a(lVar2, q0, b.b());
                                }
                            }
                        }
                    }
                } else {
                    hVar.b();
                    ax.Fb.l<E, t> lVar3 = this.c;
                    if (lVar3 != null) {
                        lVar = x.a(lVar3, q0, b.b());
                    }
                }
                b.k(q0, lVar);
            }
            Object z = b.z();
            if (z == C3479b.c()) {
                ax.yb.h.c(eVar);
            }
            return z;
        } catch (Throwable th) {
            b.L();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b4, code lost:
    
        r13 = (ax.Sb.h) r13.g();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void h0(ax.Sb.h<E> r13) {
        /*
            r12 = this;
            ax.Fb.l<E, ax.sb.t> r0 = r12.c
            r1 = 0
            r2 = 1
            java.lang.Object r3 = ax.Vb.C1005l.b(r1, r2, r1)
        L8:
            int r4 = ax.Sb.c.b
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb4
            long r6 = r13.d0
            int r8 = ax.Sb.c.b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L17:
            java.lang.Object r8 = r13.w(r4)
            ax.Vb.F r9 = ax.Sb.c.f()
            if (r8 == r9) goto Lbc
            ax.Vb.F r9 = ax.Sb.c.d
            if (r8 != r9) goto L49
            long r9 = r12.F()
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto Lbc
            ax.Vb.F r9 = ax.Sb.c.y()
            boolean r8 = r13.r(r4, r8, r9)
            if (r8 == 0) goto L17
            if (r0 == 0) goto L41
            java.lang.Object r5 = r13.v(r4)
            ax.Vb.O r1 = ax.Vb.x.c(r0, r5, r1)
        L41:
            r13.s(r4)
            r13.p()
            goto Lb0
        L49:
            ax.Vb.F r9 = ax.Sb.c.k()
            if (r8 == r9) goto La3
            if (r8 != 0) goto L52
            goto La3
        L52:
            boolean r9 = r8 instanceof ax.Qb.R0
            if (r9 != 0) goto L6f
            boolean r9 = r8 instanceof ax.Sb.o
            if (r9 == 0) goto L5b
            goto L6f
        L5b:
            ax.Vb.F r9 = ax.Sb.c.o()
            if (r8 == r9) goto Lbc
            ax.Vb.F r9 = ax.Sb.c.p()
            if (r8 != r9) goto L68
            goto Lbc
        L68:
            ax.Vb.F r9 = ax.Sb.c.o()
            if (r8 == r9) goto L17
            goto Lb0
        L6f:
            long r9 = r12.F()
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto Lbc
            boolean r9 = r8 instanceof ax.Sb.o
            if (r9 == 0) goto L81
            r9 = r8
            ax.Sb.o r9 = (ax.Sb.o) r9
            ax.Qb.R0 r9 = r9.a
            goto L84
        L81:
            r9 = r8
            ax.Qb.R0 r9 = (ax.Qb.R0) r9
        L84:
            ax.Vb.F r10 = ax.Sb.c.y()
            boolean r8 = r13.r(r4, r8, r10)
            if (r8 == 0) goto L17
            if (r0 == 0) goto L98
            java.lang.Object r5 = r13.v(r4)
            ax.Vb.O r1 = ax.Vb.x.c(r0, r5, r1)
        L98:
            java.lang.Object r3 = ax.Vb.C1005l.c(r3, r9)
            r13.s(r4)
            r13.p()
            goto Lb0
        La3:
            ax.Vb.F r9 = ax.Sb.c.y()
            boolean r8 = r13.r(r4, r8, r9)
            if (r8 == 0) goto L17
            r13.p()
        Lb0:
            int r4 = r4 + (-1)
            goto Lb
        Lb4:
            ax.Vb.e r13 = r13.g()
            ax.Sb.h r13 = (ax.Sb.h) r13
            if (r13 != 0) goto L8
        Lbc:
            if (r3 == 0) goto Le2
            boolean r13 = r3 instanceof java.util.ArrayList
            if (r13 != 0) goto Lc8
            ax.Qb.R0 r3 = (ax.Qb.R0) r3
            r12.j0(r3)
            goto Le2
        Lc8:
            java.lang.String r13 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            ax.Gb.l.d(r3, r13)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r13 = r3.size()
            int r13 = r13 - r2
        Ld4:
            if (r5 >= r13) goto Le2
            java.lang.Object r0 = r3.get(r13)
            ax.Qb.R0 r0 = (ax.Qb.R0) r0
            r12.j0(r0)
            int r13 = r13 + (-1)
            goto Ld4
        Le2:
            if (r1 != 0) goto Le5
            return
        Le5:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Sb.b.h0(ax.Sb.h):void");
    }

    private final void i0(R0 r0) {
        k0(r0, true);
    }

    private final void j0(R0 r0) {
        k0(r0, false);
    }

    private final void k0(R0 r0, boolean z) {
        if (r0 instanceof C0192b) {
            InterfaceC0945l<Boolean> b = ((C0192b) r0).b();
            C3082n.a aVar = C3082n.q;
            b.f(C3082n.a(Boolean.FALSE));
            return;
        }
        if (r0 instanceof InterfaceC0945l) {
            ax.wb.e eVar = (ax.wb.e) r0;
            C3082n.a aVar2 = C3082n.q;
            eVar.f(C3082n.a(C3083o.a(z ? E() : G())));
        } else if (r0 instanceof l) {
            C0947m<f<? extends E>> c0947m = ((l) r0).q;
            C3082n.a aVar3 = C3082n.q;
            c0947m.f(C3082n.a(f.b(f.b.a(D()))));
        } else if (r0 instanceof a) {
            ((a) r0).c();
        } else {
            if (r0 instanceof ax.Yb.b) {
                ((ax.Yb.b) r0).d(this, ax.Sb.c.y());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + r0).toString());
        }
    }

    private final boolean l0(long j2) {
        if (R(j2)) {
            return false;
        }
        return !q(j2 & 1152921504606846975L);
    }

    private final boolean m0(Object obj, E e2) {
        boolean A;
        boolean A2;
        if (obj instanceof ax.Yb.b) {
            return ((ax.Yb.b) obj).d(this, e2);
        }
        if (obj instanceof l) {
            ax.Gb.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            l lVar = (l) obj;
            C0947m<f<? extends E>> c0947m = lVar.q;
            f b = f.b(f.b.c(e2));
            ax.Fb.l<E, t> lVar2 = this.c;
            A2 = ax.Sb.c.A(c0947m, b, lVar2 != null ? x.a(lVar2, e2, lVar.q.b()) : null);
            return A2;
        }
        if (obj instanceof a) {
            ax.Gb.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).b(e2);
        }
        if (!(obj instanceof InterfaceC0945l)) {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        ax.Gb.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
        InterfaceC0945l interfaceC0945l = (InterfaceC0945l) obj;
        ax.Fb.l<E, t> lVar3 = this.c;
        A = ax.Sb.c.A(interfaceC0945l, e2, lVar3 != null ? x.a(lVar3, e2, interfaceC0945l.b()) : null);
        return A;
    }

    private final boolean n0(Object obj, h<E> hVar, int i2) {
        if (obj instanceof InterfaceC0945l) {
            ax.Gb.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return ax.Sb.c.B((InterfaceC0945l) obj, t.a, null, 2, null);
        }
        if (obj instanceof ax.Yb.b) {
            ax.Gb.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            ax.Yb.d k2 = ((ax.Yb.a) obj).k(this, t.a);
            if (k2 == ax.Yb.d.REREGISTER) {
                hVar.s(i2);
            }
            return k2 == ax.Yb.d.SUCCESSFUL;
        }
        if (obj instanceof C0192b) {
            return ax.Sb.c.B(((C0192b) obj).b(), Boolean.TRUE, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    private final boolean o0(h<E> hVar, int i2, long j2) {
        F f2;
        F f3;
        Object w = hVar.w(i2);
        if ((w instanceof R0) && j2 >= f.get(this)) {
            f2 = ax.Sb.c.g;
            if (hVar.r(i2, w, f2)) {
                if (n0(w, hVar, i2)) {
                    hVar.A(i2, ax.Sb.c.d);
                    return true;
                }
                f3 = ax.Sb.c.j;
                hVar.A(i2, f3);
                hVar.x(i2, false);
                return false;
            }
        }
        return p0(hVar, i2, j2);
    }

    private final boolean p0(h<E> hVar, int i2, long j2) {
        F f2;
        F f3;
        F f4;
        F f5;
        F f6;
        F f7;
        F f8;
        F f9;
        while (true) {
            Object w = hVar.w(i2);
            if (!(w instanceof R0)) {
                f4 = ax.Sb.c.j;
                if (w != f4) {
                    if (w != null) {
                        if (w != ax.Sb.c.d) {
                            f6 = ax.Sb.c.h;
                            if (w == f6) {
                                break;
                            }
                            f7 = ax.Sb.c.i;
                            if (w == f7) {
                                break;
                            }
                            f8 = ax.Sb.c.k;
                            if (w == f8 || w == ax.Sb.c.y()) {
                                return true;
                            }
                            f9 = ax.Sb.c.f;
                            if (w != f9) {
                                throw new IllegalStateException(("Unexpected cell state: " + w).toString());
                            }
                        } else {
                            return true;
                        }
                    } else {
                        f5 = ax.Sb.c.e;
                        if (hVar.r(i2, w, f5)) {
                            return true;
                        }
                    }
                } else {
                    return false;
                }
            } else if (j2 >= f.get(this)) {
                f2 = ax.Sb.c.g;
                if (hVar.r(i2, w, f2)) {
                    if (n0(w, hVar, i2)) {
                        hVar.A(i2, ax.Sb.c.d);
                        return true;
                    }
                    f3 = ax.Sb.c.j;
                    hVar.A(i2, f3);
                    hVar.x(i2, false);
                    return false;
                }
            } else if (hVar.r(i2, w, new o((R0) w))) {
                return true;
            }
        }
    }

    private final boolean q(long j2) {
        return j2 < C() || j2 < F() + ((long) this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q0(h<E> hVar, int i2, long j2, Object obj) {
        F f2;
        F f3;
        F f4;
        Object w = hVar.w(i2);
        if (w == null) {
            if (j2 >= (e.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    f4 = ax.Sb.c.n;
                    return f4;
                }
                if (hVar.r(i2, w, obj)) {
                    y();
                    f3 = ax.Sb.c.m;
                    return f3;
                }
            }
        } else if (w == ax.Sb.c.d) {
            f2 = ax.Sb.c.i;
            if (hVar.r(i2, w, f2)) {
                y();
                return hVar.y(i2);
            }
        }
        return r0(hVar, i2, j2, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void r(h<E> hVar, long j2) {
        F f2;
        Object b = C1005l.b(null, 1, null);
        loop0: while (hVar != null) {
            for (int i2 = ax.Sb.c.b - 1; -1 < i2; i2--) {
                if ((hVar.d0 * ax.Sb.c.b) + i2 < j2) {
                    break loop0;
                }
                while (true) {
                    Object w = hVar.w(i2);
                    if (w != null) {
                        f2 = ax.Sb.c.e;
                        if (w != f2) {
                            if (!(w instanceof o)) {
                                if (!(w instanceof R0)) {
                                    break;
                                }
                                if (hVar.r(i2, w, ax.Sb.c.y())) {
                                    b = C1005l.c(b, w);
                                    hVar.x(i2, true);
                                    break;
                                }
                            } else {
                                if (hVar.r(i2, w, ax.Sb.c.y())) {
                                    b = C1005l.c(b, ((o) w).a);
                                    hVar.x(i2, true);
                                    break;
                                }
                            }
                        }
                    }
                    if (hVar.r(i2, w, ax.Sb.c.y())) {
                        hVar.p();
                        break;
                    }
                }
            }
            hVar = (h) hVar.g();
        }
        if (b != null) {
            if (!(b instanceof ArrayList)) {
                i0((R0) b);
                return;
            }
            ax.Gb.l.d(b, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ArrayList arrayList = (ArrayList) b;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                i0((R0) arrayList.get(size));
            }
        }
    }

    private final Object r0(h<E> hVar, int i2, long j2, Object obj) {
        F f2;
        F f3;
        F f4;
        F f5;
        F f6;
        F f7;
        F f8;
        F f9;
        F f10;
        F f11;
        F f12;
        F f13;
        F f14;
        F f15;
        F f16;
        F f17;
        while (true) {
            Object w = hVar.w(i2);
            if (w != null) {
                f6 = ax.Sb.c.e;
                if (w != f6) {
                    if (w == ax.Sb.c.d) {
                        f7 = ax.Sb.c.i;
                        if (hVar.r(i2, w, f7)) {
                            y();
                            return hVar.y(i2);
                        }
                    } else {
                        f8 = ax.Sb.c.j;
                        if (w == f8) {
                            f9 = ax.Sb.c.o;
                            return f9;
                        }
                        f10 = ax.Sb.c.h;
                        if (w == f10) {
                            f11 = ax.Sb.c.o;
                            return f11;
                        }
                        if (w == ax.Sb.c.y()) {
                            y();
                            f12 = ax.Sb.c.o;
                            return f12;
                        }
                        f13 = ax.Sb.c.g;
                        if (w != f13) {
                            f14 = ax.Sb.c.f;
                            if (hVar.r(i2, w, f14)) {
                                boolean z = w instanceof o;
                                if (z) {
                                    w = ((o) w).a;
                                }
                                if (n0(w, hVar, i2)) {
                                    f17 = ax.Sb.c.i;
                                    hVar.A(i2, f17);
                                    y();
                                    return hVar.y(i2);
                                }
                                f15 = ax.Sb.c.j;
                                hVar.A(i2, f15);
                                hVar.x(i2, false);
                                if (z) {
                                    y();
                                }
                                f16 = ax.Sb.c.o;
                                return f16;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            if (j2 < (e.get(this) & 1152921504606846975L)) {
                f2 = ax.Sb.c.h;
                if (hVar.r(i2, w, f2)) {
                    y();
                    f3 = ax.Sb.c.o;
                    return f3;
                }
            } else {
                if (obj == null) {
                    f4 = ax.Sb.c.n;
                    return f4;
                }
                if (hVar.r(i2, w, obj)) {
                    y();
                    f5 = ax.Sb.c.m;
                    return f5;
                }
            }
        }
    }

    private final h<E> s() {
        Object obj = k.get(this);
        h hVar = (h) i.get(this);
        if (hVar.d0 > ((h) obj).d0) {
            obj = hVar;
        }
        h hVar2 = (h) j.get(this);
        if (hVar2.d0 > ((h) obj).d0) {
            obj = hVar2;
        }
        return (h) C0997d.b((AbstractC0998e) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int s0(h<E> hVar, int i2, E e2, long j2, Object obj, boolean z) {
        F f2;
        F f3;
        F f4;
        hVar.B(i2, e2);
        if (z) {
            return t0(hVar, i2, e2, j2, obj, z);
        }
        Object w = hVar.w(i2);
        if (w == null) {
            if (q(j2)) {
                if (hVar.r(i2, null, ax.Sb.c.d)) {
                    return 1;
                }
            } else {
                if (obj == null) {
                    return 3;
                }
                if (hVar.r(i2, null, obj)) {
                    return 2;
                }
            }
        } else if (w instanceof R0) {
            hVar.s(i2);
            if (m0(w, e2)) {
                f4 = ax.Sb.c.i;
                hVar.A(i2, f4);
                b0();
                return 0;
            }
            f2 = ax.Sb.c.k;
            Object t = hVar.t(i2, f2);
            f3 = ax.Sb.c.k;
            if (t == f3) {
                return 5;
            }
            hVar.x(i2, true);
            return 5;
        }
        return t0(hVar, i2, e2, j2, obj, z);
    }

    private final int t0(h<E> hVar, int i2, E e2, long j2, Object obj, boolean z) {
        F f2;
        F f3;
        F f4;
        F f5;
        F f6;
        F f7;
        F f8;
        while (true) {
            Object w = hVar.w(i2);
            if (w != null) {
                f3 = ax.Sb.c.e;
                if (w != f3) {
                    f4 = ax.Sb.c.k;
                    if (w == f4) {
                        hVar.s(i2);
                        return 5;
                    }
                    f5 = ax.Sb.c.h;
                    if (w == f5) {
                        hVar.s(i2);
                        return 5;
                    }
                    if (w == ax.Sb.c.y()) {
                        hVar.s(i2);
                        w();
                        return 4;
                    }
                    hVar.s(i2);
                    if (w instanceof o) {
                        w = ((o) w).a;
                    }
                    if (m0(w, e2)) {
                        f8 = ax.Sb.c.i;
                        hVar.A(i2, f8);
                        b0();
                        return 0;
                    }
                    f6 = ax.Sb.c.k;
                    Object t = hVar.t(i2, f6);
                    f7 = ax.Sb.c.k;
                    if (t != f7) {
                        hVar.x(i2, true);
                    }
                    return 5;
                }
                if (hVar.r(i2, w, ax.Sb.c.d)) {
                    return 1;
                }
            } else if (!q(j2) || z) {
                if (z) {
                    f2 = ax.Sb.c.j;
                    if (hVar.r(i2, null, f2)) {
                        hVar.x(i2, false);
                        return 4;
                    }
                } else {
                    if (obj == null) {
                        return 3;
                    }
                    if (hVar.r(i2, null, obj)) {
                        return 2;
                    }
                }
            } else if (hVar.r(i2, null, ax.Sb.c.d)) {
                return 1;
            }
        }
    }

    private final void u(long j2) {
        h0(v(j2));
    }

    private final void u0(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f;
        while (true) {
            long j3 = atomicLongFieldUpdater.get(this);
            if (j3 >= j2) {
                return;
            }
            long j4 = j2;
            if (f.compareAndSet(this, j3, j4)) {
                return;
            } else {
                j2 = j4;
            }
        }
    }

    private final h<E> v(long j2) {
        h<E> s = s();
        if (S()) {
            long U = U(s);
            if (U != -1) {
                x(U);
            }
        }
        r(s, j2);
        return s;
    }

    private final void v0(long j2) {
        long j3;
        long v;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            long j4 = 1152921504606846975L & j3;
            if (j4 >= j2) {
                return;
            } else {
                v = ax.Sb.c.v(j4, (int) (j3 >> 60));
            }
        } while (!e.compareAndSet(this, j3, v));
    }

    private final void w() {
        Q();
    }

    private final void y() {
        if (T()) {
            return;
        }
        h<E> hVar = (h) k.get(this);
        while (true) {
            long andIncrement = g.getAndIncrement(this);
            int i2 = ax.Sb.c.b;
            long j2 = andIncrement / i2;
            if (H() <= andIncrement) {
                if (hVar.d0 < j2 && hVar.e() != 0) {
                    Y(j2, hVar);
                }
                K(this, 0L, 1, null);
                return;
            }
            if (hVar.d0 != j2) {
                h<E> z = z(j2, hVar, andIncrement);
                if (z == null) {
                    continue;
                } else {
                    hVar = z;
                }
            }
            if (o0(hVar, (int) (andIncrement % i2), andIncrement)) {
                K(this, 0L, 1, null);
                return;
            }
            K(this, 0L, 1, null);
        }
    }

    private final h<E> z(long j2, h<E> hVar, long j3) {
        Object c2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        p pVar = (p) ax.Sb.c.x();
        loop0: while (true) {
            c2 = C0997d.c(hVar, j2, pVar);
            if (!D.c(c2)) {
                C b = D.b(c2);
                while (true) {
                    C c3 = (C) atomicReferenceFieldUpdater.get(this);
                    if (c3.d0 >= b.d0) {
                        break loop0;
                    }
                    if (!b.q()) {
                        break;
                    }
                    if (ax.D.b.a(atomicReferenceFieldUpdater, this, c3, b)) {
                        if (c3.m()) {
                            c3.k();
                        }
                    } else if (b.m()) {
                        b.k();
                    }
                }
            } else {
                break;
            }
        }
        if (D.c(c2)) {
            w();
            Y(j2, hVar);
            K(this, 0L, 1, null);
            return null;
        }
        h<E> hVar2 = (h) D.b(c2);
        long j4 = hVar2.d0;
        if (j4 <= j2) {
            return hVar2;
        }
        int i2 = ax.Sb.c.b;
        if (g.compareAndSet(this, j3 + 1, j4 * i2)) {
            J((hVar2.d0 * i2) - j3);
        } else {
            K(this, 0L, 1, null);
        }
        return null;
    }

    protected final Throwable D() {
        return (Throwable) l.get(this);
    }

    public final long F() {
        return f.get(this);
    }

    protected final Throwable G() {
        Throwable D = D();
        return D == null ? new j("Channel was closed") : D;
    }

    public final long H() {
        return e.get(this) & 1152921504606846975L;
    }

    public final boolean I() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            h<E> hVar = (h) atomicReferenceFieldUpdater.get(this);
            long F = F();
            if (H() <= F) {
                return false;
            }
            int i2 = ax.Sb.c.b;
            long j2 = F / i2;
            if (hVar.d0 == j2 || (hVar = A(j2, hVar)) != null) {
                hVar.b();
                if (M(hVar, (int) (F % i2), F)) {
                    return true;
                }
                f.compareAndSet(this, F, F + 1);
            } else if (((h) atomicReferenceFieldUpdater.get(this)).d0 < j2) {
                return false;
            }
        }
    }

    public boolean O() {
        return P(e.get(this));
    }

    public boolean Q() {
        return R(e.get(this));
    }

    protected boolean S() {
        return false;
    }

    @Override // ax.Sb.m
    public Object a(ax.wb.e<? super E> eVar) {
        return f0(this, eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.Sb.m
    public Object b() {
        Object obj;
        h hVar;
        F f2;
        F f3;
        F f4;
        long j2 = f.get(this);
        long j3 = e.get(this);
        if (P(j3)) {
            return f.b.a(D());
        }
        if (j2 >= (j3 & 1152921504606846975L)) {
            return f.b.b();
        }
        obj = ax.Sb.c.k;
        h hVar2 = (h) j.get(this);
        while (!O()) {
            long andIncrement = f.getAndIncrement(this);
            int i2 = ax.Sb.c.b;
            long j4 = andIncrement / i2;
            int i3 = (int) (andIncrement % i2);
            if (hVar2.d0 != j4) {
                hVar = A(j4, hVar2);
                if (hVar == null) {
                    continue;
                }
            } else {
                hVar = hVar2;
            }
            Object q0 = q0(hVar, i3, andIncrement, obj);
            f2 = ax.Sb.c.m;
            if (q0 == f2) {
                R0 r0 = obj instanceof R0 ? (R0) obj : null;
                if (r0 != null) {
                    d0(r0, hVar, i3);
                }
                w0(andIncrement);
                hVar.p();
                return f.b.b();
            }
            f3 = ax.Sb.c.o;
            if (q0 != f3) {
                f4 = ax.Sb.c.n;
                if (q0 == f4) {
                    throw new IllegalStateException("unexpected");
                }
                hVar.b();
                return f.b.c(q0);
            }
            if (andIncrement < H()) {
                hVar.b();
            }
            hVar2 = hVar;
        }
        return f.b.a(D());
    }

    @Override // ax.Sb.n
    public boolean c(Throwable th) {
        return t(th, false);
    }

    @Override // ax.Sb.n
    public Object d(E e2) {
        Object obj;
        h hVar;
        long j2;
        b<E> bVar;
        if (l0(e.get(this))) {
            return f.b.b();
        }
        obj = ax.Sb.c.j;
        h hVar2 = (h) i.get(this);
        while (true) {
            long andIncrement = e.getAndIncrement(this);
            long j3 = 1152921504606846975L & andIncrement;
            boolean R = R(andIncrement);
            int i2 = ax.Sb.c.b;
            long j4 = j3 / i2;
            int i3 = (int) (j3 % i2);
            if (hVar2.d0 != j4) {
                hVar = B(j4, hVar2);
                if (hVar != null) {
                    bVar = this;
                    j2 = j3;
                } else if (R) {
                    return f.b.a(G());
                }
            } else {
                hVar = hVar2;
                j2 = j3;
                bVar = this;
            }
            E e3 = e2;
            int s0 = bVar.s0(hVar, i3, e3, j2, obj, R);
            hVar2 = hVar;
            if (s0 == 0) {
                hVar2.b();
                return f.b.c(t.a);
            }
            if (s0 == 1) {
                return f.b.c(t.a);
            }
            if (s0 == 2) {
                if (R) {
                    hVar2.p();
                    return f.b.a(G());
                }
                R0 r0 = obj instanceof R0 ? (R0) obj : null;
                if (r0 != null) {
                    e0(r0, hVar2, i3);
                }
                hVar2.p();
                return f.b.b();
            }
            if (s0 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (s0 == 4) {
                if (j2 < F()) {
                    hVar2.b();
                }
                return f.b.a(G());
            }
            if (s0 == 5) {
                hVar2.b();
            }
            e2 = e3;
        }
    }

    protected boolean t(Throwable th, boolean z) {
        F f2;
        if (z) {
            V();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
        f2 = ax.Sb.c.s;
        boolean a2 = ax.D.b.a(atomicReferenceFieldUpdater, this, f2, th);
        if (z) {
            W();
        } else {
            X();
        }
        w();
        Z();
        if (a2) {
            L();
        }
        return a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e4, code lost:
    
        r3 = (ax.Sb.h) r3.e();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Sb.b.toString():java.lang.String");
    }

    public final void w0(long j2) {
        int i2;
        long u;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long u2;
        long u3;
        b<E> bVar = this;
        if (bVar.T()) {
            return;
        }
        while (bVar.C() <= j2) {
            bVar = this;
        }
        i2 = ax.Sb.c.c;
        for (int i3 = 0; i3 < i2; i3++) {
            long C = bVar.C();
            if (C == (4611686018427387903L & h.get(bVar)) && C == bVar.C()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = h;
        while (true) {
            long j3 = atomicLongFieldUpdater2.get(bVar);
            u = ax.Sb.c.u(j3 & 4611686018427387903L, true);
            if (atomicLongFieldUpdater2.compareAndSet(bVar, j3, u)) {
                break;
            } else {
                bVar = this;
            }
        }
        while (true) {
            long C2 = bVar.C();
            atomicLongFieldUpdater = h;
            long j4 = atomicLongFieldUpdater.get(bVar);
            long j5 = j4 & 4611686018427387903L;
            boolean z = (4611686018427387904L & j4) != 0;
            if (C2 == j5 && C2 == bVar.C()) {
                break;
            }
            if (z) {
                bVar = this;
            } else {
                u2 = ax.Sb.c.u(j5, true);
                bVar = this;
                atomicLongFieldUpdater.compareAndSet(bVar, j4, u2);
            }
        }
        while (true) {
            long j6 = atomicLongFieldUpdater.get(bVar);
            u3 = ax.Sb.c.u(j6 & 4611686018427387903L, false);
            if (atomicLongFieldUpdater.compareAndSet(bVar, j6, u3)) {
                return;
            } else {
                bVar = this;
            }
        }
    }

    protected final void x(long j2) {
        F f2;
        O d;
        h<E> hVar = (h) j.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.b + j3, C())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, 1 + j3)) {
                int i2 = ax.Sb.c.b;
                long j4 = j3 / i2;
                int i3 = (int) (j3 % i2);
                if (hVar.d0 != j4) {
                    h<E> A = A(j4, hVar);
                    if (A == null) {
                        continue;
                    } else {
                        hVar = A;
                    }
                }
                h<E> hVar2 = hVar;
                Object q0 = q0(hVar2, i3, j3, null);
                f2 = ax.Sb.c.o;
                if (q0 != f2) {
                    hVar2.b();
                    ax.Fb.l<E, t> lVar = this.c;
                    if (lVar != null && (d = x.d(lVar, q0, null, 2, null)) != null) {
                        throw d;
                    }
                } else if (j3 < H()) {
                    hVar2.b();
                }
                hVar = hVar2;
            }
        }
    }

    protected void Z() {
    }

    protected void b0() {
    }

    protected void c0() {
    }
}
