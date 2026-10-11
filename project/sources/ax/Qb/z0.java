package ax.Qb;

import ax.Qb.InterfaceC0959s0;
import ax.Vb.q;
import ax.sb.C3069a;
import ax.wb.i;
import ax.xb.C3479b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public class z0 implements InterfaceC0959s0, InterfaceC0960t, H0 {
    private volatile Object _parentHandle;
    private volatile Object _state;
    private static final AtomicReferenceFieldUpdater q = AtomicReferenceFieldUpdater.newUpdater(z0.class, Object.class, "_state");
    private static final AtomicReferenceFieldUpdater c0 = AtomicReferenceFieldUpdater.newUpdater(z0.class, Object.class, "_parentHandle");

    private static final class a<T> extends C0947m<T> {
        private final z0 j0;

        public a(ax.wb.e<? super T> eVar, z0 z0Var) {
            super(eVar, 1);
            this.j0 = z0Var;
        }

        @Override // ax.Qb.C0947m
        protected String J() {
            return "AwaitContinuation";
        }

        @Override // ax.Qb.C0947m
        public Throwable x(InterfaceC0959s0 interfaceC0959s0) {
            Throwable f;
            Object W = this.j0.W();
            return (!(W instanceof c) || (f = ((c) W).f()) == null) ? W instanceof C0966z ? ((C0966z) W).a : interfaceC0959s0.o() : f;
        }
    }

    private static final class b extends y0 {
        private final z0 f0;
        private final c g0;
        private final C0958s h0;
        private final Object i0;

        public b(z0 z0Var, c cVar, C0958s c0958s, Object obj) {
            this.f0 = z0Var;
            this.g0 = cVar;
            this.h0 = c0958s;
            this.i0 = obj;
        }

        @Override // ax.Fb.l
        public /* bridge */ /* synthetic */ ax.sb.t invoke(Throwable th) {
            x(th);
            return ax.sb.t.a;
        }

        @Override // ax.Qb.B
        public void x(Throwable th) {
            this.f0.K(this.g0, this.h0, this.i0);
        }
    }

    private static final class c implements InterfaceC0950n0 {
        private static final AtomicIntegerFieldUpdater c0 = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting");
        private static final AtomicReferenceFieldUpdater d0 = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause");
        private static final AtomicReferenceFieldUpdater e0 = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder");
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;
        private final E0 q;

        public c(E0 e02, boolean z, Throwable th) {
            this.q = e02;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        private final Object d() {
            return e0.get(this);
        }

        private final void l(Object obj) {
            e0.set(this, obj);
        }

        @Override // ax.Qb.InterfaceC0950n0
        public E0 a() {
            return this.q;
        }

        public final void b(Throwable th) {
            Throwable f = f();
            if (f == null) {
                m(th);
                return;
            }
            if (th == f) {
                return;
            }
            Object d = d();
            if (d == null) {
                l(th);
                return;
            }
            if (d instanceof Throwable) {
                if (th == d) {
                    return;
                }
                ArrayList<Throwable> c = c();
                c.add(d);
                c.add(th);
                l(c);
                return;
            }
            if (d instanceof ArrayList) {
                ((ArrayList) d).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + d).toString());
        }

        @Override // ax.Qb.InterfaceC0950n0
        public boolean e() {
            return f() == null;
        }

        public final Throwable f() {
            return (Throwable) d0.get(this);
        }

        public final boolean g() {
            return f() != null;
        }

        public final boolean h() {
            return c0.get(this) != 0;
        }

        public final boolean i() {
            ax.Vb.F f;
            Object d = d();
            f = A0.e;
            return d == f;
        }

        public final List<Throwable> j(Throwable th) {
            ArrayList<Throwable> arrayList;
            ax.Vb.F f;
            Object d = d();
            if (d == null) {
                arrayList = c();
            } else if (d instanceof Throwable) {
                ArrayList<Throwable> c = c();
                c.add(d);
                arrayList = c;
            } else {
                if (!(d instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + d).toString());
                }
                arrayList = (ArrayList) d;
            }
            Throwable f2 = f();
            if (f2 != null) {
                arrayList.add(0, f2);
            }
            if (th != null && !ax.Gb.l.a(th, f2)) {
                arrayList.add(th);
            }
            f = A0.e;
            l(f);
            return arrayList;
        }

        public final void k(boolean z) {
            c0.set(this, z ? 1 : 0);
        }

        public final void m(Throwable th) {
            d0.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + g() + ", completing=" + h() + ", rootCause=" + f() + ", exceptions=" + d() + ", list=" + a() + ']';
        }
    }

    public static final class d extends q.a {
        final /* synthetic */ z0 d;
        final /* synthetic */ Object e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ax.Vb.q qVar, z0 z0Var, Object obj) {
            super(qVar);
            this.d = z0Var;
            this.e = obj;
        }

        @Override // ax.Vb.AbstractC0995b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Object d(ax.Vb.q qVar) {
            if (this.d.W() == this.e) {
                return null;
            }
            return ax.Vb.p.a();
        }
    }

    public z0(boolean z) {
        this._state = z ? A0.g : A0.f;
    }

    private final boolean B0(InterfaceC0950n0 interfaceC0950n0, Object obj) {
        if (!ax.D.b.a(q, this, interfaceC0950n0, A0.g(obj))) {
            return false;
        }
        l0(null);
        m0(obj);
        J(interfaceC0950n0, obj);
        return true;
    }

    private final boolean C0(InterfaceC0950n0 interfaceC0950n0, Throwable th) {
        E0 U = U(interfaceC0950n0);
        if (U == null) {
            return false;
        }
        if (!ax.D.b.a(q, this, interfaceC0950n0, new c(U, false, th))) {
            return false;
        }
        j0(U, th);
        return true;
    }

    private final Object D(Object obj) {
        ax.Vb.F f;
        Object E0;
        ax.Vb.F f2;
        do {
            Object W = W();
            if (!(W instanceof InterfaceC0950n0) || ((W instanceof c) && ((c) W).h())) {
                f = A0.a;
                return f;
            }
            E0 = E0(W, new C0966z(M(obj), false, 2, null));
            f2 = A0.c;
        } while (E0 == f2);
        return E0;
    }

    private final boolean E(Throwable th) {
        if (b0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        r V = V();
        return (V == null || V == F0.q) ? z : V.h(th) || z;
    }

    private final Object E0(Object obj, Object obj2) {
        ax.Vb.F f;
        ax.Vb.F f2;
        if (!(obj instanceof InterfaceC0950n0)) {
            f2 = A0.a;
            return f2;
        }
        if ((!(obj instanceof C0926b0) && !(obj instanceof y0)) || (obj instanceof C0958s) || (obj2 instanceof C0966z)) {
            return G0((InterfaceC0950n0) obj, obj2);
        }
        if (B0((InterfaceC0950n0) obj, obj2)) {
            return obj2;
        }
        f = A0.c;
        return f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private final Object G0(InterfaceC0950n0 interfaceC0950n0, Object obj) {
        ax.Vb.F f;
        ax.Vb.F f2;
        ax.Vb.F f3;
        E0 U = U(interfaceC0950n0);
        if (U == null) {
            f3 = A0.c;
            return f3;
        }
        c cVar = interfaceC0950n0 instanceof c ? (c) interfaceC0950n0 : null;
        if (cVar == null) {
            cVar = new c(U, false, null);
        }
        ax.Gb.v vVar = new ax.Gb.v();
        synchronized (cVar) {
            if (cVar.h()) {
                f2 = A0.a;
                return f2;
            }
            cVar.k(true);
            if (cVar != interfaceC0950n0 && !ax.D.b.a(q, this, interfaceC0950n0, cVar)) {
                f = A0.c;
                return f;
            }
            boolean g = cVar.g();
            C0966z c0966z = obj instanceof C0966z ? (C0966z) obj : null;
            if (c0966z != null) {
                cVar.b(c0966z.a);
            }
            ?? f4 = g ? 0 : cVar.f();
            vVar.q = f4;
            ax.sb.t tVar = ax.sb.t.a;
            if (f4 != 0) {
                j0(U, f4);
            }
            C0958s O = O(interfaceC0950n0);
            return (O == null || !H0(cVar, O, obj)) ? N(cVar, obj) : A0.b;
        }
    }

    private final boolean H0(c cVar, C0958s c0958s, Object obj) {
        while (InterfaceC0959s0.a.d(c0958s.f0, false, false, new b(this, cVar, c0958s, obj), 1, null) == F0.q) {
            c0958s = i0(c0958s);
            if (c0958s == null) {
                return false;
            }
        }
        return true;
    }

    private final void J(InterfaceC0950n0 interfaceC0950n0, Object obj) {
        r V = V();
        if (V != null) {
            V.d();
            t0(F0.q);
        }
        C0966z c0966z = obj instanceof C0966z ? (C0966z) obj : null;
        Throwable th = c0966z != null ? c0966z.a : null;
        if (!(interfaceC0950n0 instanceof y0)) {
            E0 a2 = interfaceC0950n0.a();
            if (a2 != null) {
                k0(a2, th);
                return;
            }
            return;
        }
        try {
            ((y0) interfaceC0950n0).x(th);
        } catch (Throwable th2) {
            Y(new C("Exception in completion handler " + interfaceC0950n0 + " for " + this, th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(c cVar, C0958s c0958s, Object obj) {
        C0958s i0 = i0(c0958s);
        if (i0 == null || !H0(cVar, i0, obj)) {
            w(N(cVar, obj));
        }
    }

    private final Throwable M(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new t0(G(), null, this) : th;
        }
        ax.Gb.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((H0) obj).D0();
    }

    private final Object N(c cVar, Object obj) {
        boolean g;
        Throwable R;
        C0966z c0966z = obj instanceof C0966z ? (C0966z) obj : null;
        Throwable th = c0966z != null ? c0966z.a : null;
        synchronized (cVar) {
            g = cVar.g();
            List<Throwable> j = cVar.j(th);
            R = R(cVar, j);
            if (R != null) {
                u(R, j);
            }
        }
        if (R != null && R != th) {
            obj = new C0966z(R, false, 2, null);
        }
        if (R != null && (E(R) || X(R))) {
            ax.Gb.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C0966z) obj).b();
        }
        if (!g) {
            l0(R);
        }
        m0(obj);
        ax.D.b.a(q, this, cVar, A0.g(obj));
        J(cVar, obj);
        return obj;
    }

    private final C0958s O(InterfaceC0950n0 interfaceC0950n0) {
        C0958s c0958s = interfaceC0950n0 instanceof C0958s ? (C0958s) interfaceC0950n0 : null;
        if (c0958s != null) {
            return c0958s;
        }
        E0 a2 = interfaceC0950n0.a();
        if (a2 != null) {
            return i0(a2);
        }
        return null;
    }

    private final Throwable Q(Object obj) {
        C0966z c0966z = obj instanceof C0966z ? (C0966z) obj : null;
        if (c0966z != null) {
            return c0966z.a;
        }
        return null;
    }

    private final Throwable R(c cVar, List<? extends Throwable> list) {
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.g()) {
                return new t0(G(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                obj = next;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        return th != null ? th : list.get(0);
    }

    private final E0 U(InterfaceC0950n0 interfaceC0950n0) {
        E0 a2 = interfaceC0950n0.a();
        if (a2 != null) {
            return a2;
        }
        if (interfaceC0950n0 instanceof C0926b0) {
            return new E0();
        }
        if (interfaceC0950n0 instanceof y0) {
            q0((y0) interfaceC0950n0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC0950n0).toString());
    }

    private final Object c0(Object obj) {
        ax.Vb.F f;
        ax.Vb.F f2;
        ax.Vb.F f3;
        ax.Vb.F f4;
        ax.Vb.F f5;
        ax.Vb.F f6;
        Throwable th = null;
        while (true) {
            Object W = W();
            if (W instanceof c) {
                synchronized (W) {
                    if (((c) W).i()) {
                        f2 = A0.d;
                        return f2;
                    }
                    boolean g = ((c) W).g();
                    if (obj != null || !g) {
                        if (th == null) {
                            th = M(obj);
                        }
                        ((c) W).b(th);
                    }
                    Throwable f7 = g ? null : ((c) W).f();
                    if (f7 != null) {
                        j0(((c) W).a(), f7);
                    }
                    f = A0.a;
                    return f;
                }
            }
            if (!(W instanceof InterfaceC0950n0)) {
                f3 = A0.d;
                return f3;
            }
            if (th == null) {
                th = M(obj);
            }
            InterfaceC0950n0 interfaceC0950n0 = (InterfaceC0950n0) W;
            if (!interfaceC0950n0.e()) {
                Object E0 = E0(W, new C0966z(th, false, 2, null));
                f5 = A0.a;
                if (E0 == f5) {
                    throw new IllegalStateException(("Cannot happen in " + W).toString());
                }
                f6 = A0.c;
                if (E0 != f6) {
                    return E0;
                }
            } else if (C0(interfaceC0950n0, th)) {
                f4 = A0.a;
                return f4;
            }
        }
    }

    private final y0 g0(ax.Fb.l<? super Throwable, ax.sb.t> lVar, boolean z) {
        y0 y0Var;
        if (z) {
            y0Var = lVar instanceof u0 ? (u0) lVar : null;
            if (y0Var == null) {
                y0Var = new C0956q0(lVar);
            }
        } else {
            y0Var = lVar instanceof y0 ? (y0) lVar : null;
            if (y0Var == null) {
                y0Var = new C0957r0(lVar);
            }
        }
        y0Var.z(this);
        return y0Var;
    }

    private final C0958s i0(ax.Vb.q qVar) {
        while (qVar.s()) {
            qVar = qVar.r();
        }
        while (true) {
            qVar = qVar.q();
            if (!qVar.s()) {
                if (qVar instanceof C0958s) {
                    return (C0958s) qVar;
                }
                if (qVar instanceof E0) {
                    return null;
                }
            }
        }
    }

    private final void j0(E0 e0, Throwable th) {
        l0(th);
        Object p = e0.p();
        ax.Gb.l.d(p, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C c2 = null;
        for (ax.Vb.q qVar = (ax.Vb.q) p; !ax.Gb.l.a(qVar, e0); qVar = qVar.q()) {
            if (qVar instanceof u0) {
                y0 y0Var = (y0) qVar;
                try {
                    y0Var.x(th);
                } catch (Throwable th2) {
                    if (c2 != null) {
                        C3069a.a(c2, th2);
                    } else {
                        c2 = new C("Exception in completion handler " + y0Var + " for " + this, th2);
                        ax.sb.t tVar = ax.sb.t.a;
                    }
                }
            }
        }
        if (c2 != null) {
            Y(c2);
        }
        E(th);
    }

    private final void k0(E0 e0, Throwable th) {
        Object p = e0.p();
        ax.Gb.l.d(p, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C c2 = null;
        for (ax.Vb.q qVar = (ax.Vb.q) p; !ax.Gb.l.a(qVar, e0); qVar = qVar.q()) {
            if (qVar instanceof y0) {
                y0 y0Var = (y0) qVar;
                try {
                    y0Var.x(th);
                } catch (Throwable th2) {
                    if (c2 != null) {
                        C3069a.a(c2, th2);
                    } else {
                        c2 = new C("Exception in completion handler " + y0Var + " for " + this, th2);
                        ax.sb.t tVar = ax.sb.t.a;
                    }
                }
            }
        }
        if (c2 != null) {
            Y(c2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [ax.Qb.m0] */
    private final void p0(C0926b0 c0926b0) {
        E0 e0 = new E0();
        if (!c0926b0.e()) {
            e0 = new C0948m0(e0);
        }
        ax.D.b.a(q, this, c0926b0, e0);
    }

    private final void q0(y0 y0Var) {
        y0Var.k(new E0());
        ax.D.b.a(q, this, y0Var, y0Var.q());
    }

    private final boolean t(Object obj, E0 e0, y0 y0Var) {
        int w;
        d dVar = new d(y0Var, this, obj);
        do {
            w = e0.r().w(y0Var, e0, dVar);
            if (w == 1) {
                return true;
            }
        } while (w != 2);
        return false;
    }

    private final void u(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th2 : list) {
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                C3069a.a(th, th2);
            }
        }
    }

    private final int v0(Object obj) {
        C0926b0 c0926b0;
        if (!(obj instanceof C0926b0)) {
            if (!(obj instanceof C0948m0)) {
                return 0;
            }
            if (!ax.D.b.a(q, this, obj, ((C0948m0) obj).a())) {
                return -1;
            }
            n0();
            return 1;
        }
        if (((C0926b0) obj).e()) {
            return 0;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q;
        c0926b0 = A0.g;
        if (!ax.D.b.a(atomicReferenceFieldUpdater, this, obj, c0926b0)) {
            return -1;
        }
        n0();
        return 1;
    }

    private final String w0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof InterfaceC0950n0 ? ((InterfaceC0950n0) obj).e() ? "Active" : "New" : obj instanceof C0966z ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.g() ? "Cancelling" : cVar.h() ? "Completing" : "Active";
    }

    private final Object y(ax.wb.e<Object> eVar) {
        a aVar = new a(C3479b.b(eVar), this);
        aVar.C();
        C0951o.a(aVar, F(new I0(aVar)));
        Object z = aVar.z();
        if (z == C3479b.c()) {
            ax.yb.h.c(eVar);
        }
        return z;
    }

    public static /* synthetic */ CancellationException y0(z0 z0Var, Throwable th, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return z0Var.x0(th, str);
    }

    @Override // ax.Qb.InterfaceC0959s0
    public final Z A0(boolean z, boolean z2, ax.Fb.l<? super Throwable, ax.sb.t> lVar) {
        y0 g0 = g0(lVar, z);
        while (true) {
            Object W = W();
            if (W instanceof C0926b0) {
                C0926b0 c0926b0 = (C0926b0) W;
                if (!c0926b0.e()) {
                    p0(c0926b0);
                } else if (ax.D.b.a(q, this, W, g0)) {
                    break;
                }
            } else {
                if (!(W instanceof InterfaceC0950n0)) {
                    if (z2) {
                        C0966z c0966z = W instanceof C0966z ? (C0966z) W : null;
                        lVar.invoke(c0966z != null ? c0966z.a : null);
                    }
                    return F0.q;
                }
                E0 a2 = ((InterfaceC0950n0) W).a();
                if (a2 == null) {
                    ax.Gb.l.d(W, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    q0((y0) W);
                } else {
                    Z z3 = F0.q;
                    if (z && (W instanceof c)) {
                        synchronized (W) {
                            try {
                                r3 = ((c) W).f();
                                if (r3 != null) {
                                    if ((lVar instanceof C0958s) && !((c) W).h()) {
                                    }
                                    ax.sb.t tVar = ax.sb.t.a;
                                }
                                if (t(W, a2, g0)) {
                                    if (r3 == null) {
                                        return g0;
                                    }
                                    z3 = g0;
                                    ax.sb.t tVar2 = ax.sb.t.a;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (r3 != null) {
                        if (z2) {
                            lVar.invoke(r3);
                        }
                        return z3;
                    }
                    if (t(W, a2, g0)) {
                        break;
                    }
                }
            }
        }
        return g0;
    }

    public final boolean B(Object obj) {
        Object obj2;
        ax.Vb.F f;
        ax.Vb.F f2;
        ax.Vb.F f3;
        obj2 = A0.a;
        if (T() && (obj2 = D(obj)) == A0.b) {
            return true;
        }
        f = A0.a;
        if (obj2 == f) {
            obj2 = c0(obj);
        }
        f2 = A0.a;
        if (obj2 == f2 || obj2 == A0.b) {
            return true;
        }
        f3 = A0.d;
        if (obj2 == f3) {
            return false;
        }
        w(obj2);
        return true;
    }

    public void C(Throwable th) {
        B(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // ax.Qb.H0
    public CancellationException D0() {
        CancellationException cancellationException;
        Object W = W();
        if (W instanceof c) {
            cancellationException = ((c) W).f();
        } else if (W instanceof C0966z) {
            cancellationException = ((C0966z) W).a;
        } else {
            if (W instanceof InterfaceC0950n0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + W).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        return new t0("Parent job is " + w0(W), cancellationException, this);
    }

    @Override // ax.Qb.InterfaceC0959s0
    public final Z F(ax.Fb.l<? super Throwable, ax.sb.t> lVar) {
        return A0(false, true, lVar);
    }

    @Override // ax.Qb.InterfaceC0960t
    public final void F0(H0 h0) {
        B(h0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String G() {
        return "Job was cancelled";
    }

    public boolean I(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return B(th) && S();
    }

    @Override // ax.Qb.InterfaceC0959s0
    public void L0(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new t0(G(), null, this);
        }
        C(cancellationException);
    }

    public final Object P() {
        Object W = W();
        if (W instanceof InterfaceC0950n0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (W instanceof C0966z) {
            throw ((C0966z) W).a;
        }
        return A0.h(W);
    }

    public boolean S() {
        return true;
    }

    public boolean T() {
        return false;
    }

    public final r V() {
        return (r) c0.get(this);
    }

    public final Object W() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof ax.Vb.y)) {
                return obj;
            }
            ((ax.Vb.y) obj).a(this);
        }
    }

    protected boolean X(Throwable th) {
        return false;
    }

    protected final void Z(InterfaceC0959s0 interfaceC0959s0) {
        if (interfaceC0959s0 == null) {
            t0(F0.q);
            return;
        }
        interfaceC0959s0.start();
        r q2 = interfaceC0959s0.q(this);
        t0(q2);
        if (a0()) {
            q2.d();
            t0(F0.q);
        }
    }

    @Override // ax.wb.i.b, ax.wb.i
    public <E extends i.b> E a(i.c<E> cVar) {
        return (E) InterfaceC0959s0.a.c(this, cVar);
    }

    public final boolean a0() {
        return !(W() instanceof InterfaceC0950n0);
    }

    protected boolean b0() {
        return false;
    }

    @Override // ax.Qb.InterfaceC0959s0
    public boolean e() {
        Object W = W();
        return (W instanceof InterfaceC0950n0) && ((InterfaceC0950n0) W).e();
    }

    public final boolean e0(Object obj) {
        Object E0;
        ax.Vb.F f;
        ax.Vb.F f2;
        do {
            E0 = E0(W(), obj);
            f = A0.a;
            if (E0 == f) {
                return false;
            }
            if (E0 == A0.b) {
                return true;
            }
            f2 = A0.c;
        } while (E0 == f2);
        w(E0);
        return true;
    }

    public final Object f0(Object obj) {
        Object E0;
        ax.Vb.F f;
        ax.Vb.F f2;
        do {
            E0 = E0(W(), obj);
            f = A0.a;
            if (E0 == f) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, Q(obj));
            }
            f2 = A0.c;
        } while (E0 == f2);
        return E0;
    }

    @Override // ax.wb.i.b
    public final i.c<?> getKey() {
        return InterfaceC0959s0.c;
    }

    @Override // ax.Qb.InterfaceC0959s0
    public InterfaceC0959s0 getParent() {
        r V = V();
        if (V != null) {
            return V.getParent();
        }
        return null;
    }

    public String h0() {
        return N.a(this);
    }

    @Override // ax.Qb.InterfaceC0959s0
    public final boolean isCancelled() {
        Object W = W();
        if (W instanceof C0966z) {
            return true;
        }
        return (W instanceof c) && ((c) W).g();
    }

    @Override // ax.wb.i
    public ax.wb.i m(i.c<?> cVar) {
        return InterfaceC0959s0.a.e(this, cVar);
    }

    @Override // ax.Qb.InterfaceC0959s0
    public final CancellationException o() {
        Object W = W();
        if (!(W instanceof c)) {
            if (W instanceof InterfaceC0950n0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (W instanceof C0966z) {
                return y0(this, ((C0966z) W).a, null, 1, null);
            }
            return new t0(N.a(this) + " has completed normally", null, this);
        }
        Throwable f = ((c) W).f();
        if (f != null) {
            CancellationException x0 = x0(f, N.a(this) + " is cancelling");
            if (x0 != null) {
                return x0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // ax.wb.i
    public ax.wb.i p(ax.wb.i iVar) {
        return InterfaceC0959s0.a.f(this, iVar);
    }

    @Override // ax.Qb.InterfaceC0959s0
    public final r q(InterfaceC0960t interfaceC0960t) {
        Z d2 = InterfaceC0959s0.a.d(this, true, false, new C0958s(interfaceC0960t), 2, null);
        ax.Gb.l.d(d2, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (r) d2;
    }

    public final void r0(y0 y0Var) {
        Object W;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0926b0 c0926b0;
        do {
            W = W();
            if (!(W instanceof y0)) {
                if (!(W instanceof InterfaceC0950n0) || ((InterfaceC0950n0) W).a() == null) {
                    return;
                }
                y0Var.t();
                return;
            }
            if (W != y0Var) {
                return;
            }
            atomicReferenceFieldUpdater = q;
            c0926b0 = A0.g;
        } while (!ax.D.b.a(atomicReferenceFieldUpdater, this, W, c0926b0));
    }

    @Override // ax.Qb.InterfaceC0959s0
    public final boolean start() {
        int v0;
        do {
            v0 = v0(W());
            if (v0 == 0) {
                return false;
            }
        } while (v0 != 1);
        return true;
    }

    public final void t0(r rVar) {
        c0.set(this, rVar);
    }

    public String toString() {
        return z0() + '@' + N.b(this);
    }

    @Override // ax.wb.i
    public <R> R v(R r, ax.Fb.p<? super R, ? super i.b, ? extends R> pVar) {
        return (R) InterfaceC0959s0.a.b(this, r, pVar);
    }

    protected final Object x(ax.wb.e<Object> eVar) {
        Object W;
        do {
            W = W();
            if (!(W instanceof InterfaceC0950n0)) {
                if (W instanceof C0966z) {
                    throw ((C0966z) W).a;
                }
                return A0.h(W);
            }
        } while (v0(W) < 0);
        return y(eVar);
    }

    protected final CancellationException x0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = G();
            }
            cancellationException = new t0(str, th, this);
        }
        return cancellationException;
    }

    public final boolean z(Throwable th) {
        return B(th);
    }

    public final String z0() {
        return h0() + '{' + w0(W()) + '}';
    }

    protected void n0() {
    }

    public void Y(Throwable th) {
        throw th;
    }

    protected void l0(Throwable th) {
    }

    protected void m0(Object obj) {
    }

    protected void w(Object obj) {
    }
}
