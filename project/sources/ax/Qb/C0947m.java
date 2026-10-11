package ax.Qb;

import ax.Qb.InterfaceC0959s0;
import ax.Vb.C1003j;
import ax.sb.C3072d;
import ax.xb.C3479b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: ax.Qb.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0947m<T> extends V<T> implements InterfaceC0945l<T>, ax.yb.e, R0 {
    private static final AtomicIntegerFieldUpdater g0 = AtomicIntegerFieldUpdater.newUpdater(C0947m.class, "_decisionAndIndex");
    private static final AtomicReferenceFieldUpdater h0 = AtomicReferenceFieldUpdater.newUpdater(C0947m.class, Object.class, "_state");
    private static final AtomicReferenceFieldUpdater i0 = AtomicReferenceFieldUpdater.newUpdater(C0947m.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;
    private final ax.wb.e<T> e0;
    private final ax.wb.i f0;

    /* JADX WARN: Multi-variable type inference failed */
    public C0947m(ax.wb.e<? super T> eVar, int i) {
        super(i);
        this.e0 = eVar;
        this.f0 = eVar.b();
        this._decisionAndIndex = 536870911;
        this._state = C0929d.q;
    }

    private final String B() {
        Object A = A();
        return A instanceof G0 ? "Active" : A instanceof C0953p ? "Cancelled" : "Completed";
    }

    private final Z D() {
        InterfaceC0959s0 interfaceC0959s0 = (InterfaceC0959s0) b().a(InterfaceC0959s0.c);
        if (interfaceC0959s0 == null) {
            return null;
        }
        Z d = InterfaceC0959s0.a.d(interfaceC0959s0, true, false, new C0955q(this), 2, null);
        ax.D.b.a(i0, this, null, d);
        return d;
    }

    private final void E(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h0;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof C0929d)) {
                if (obj2 instanceof AbstractC0941j ? true : obj2 instanceof ax.Vb.C) {
                    I(obj, obj2);
                } else {
                    if (obj2 instanceof C0966z) {
                        C0966z c0966z = (C0966z) obj2;
                        if (!c0966z.b()) {
                            I(obj, obj2);
                        }
                        if (obj2 instanceof C0953p) {
                            if (!ax.i.s.a(obj2)) {
                                c0966z = null;
                            }
                            Throwable th = c0966z != null ? c0966z.a : null;
                            if (obj instanceof AbstractC0941j) {
                                o((AbstractC0941j) obj, th);
                                return;
                            } else {
                                ax.Gb.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                q((ax.Vb.C) obj, th);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj2 instanceof C0965y) {
                        C0965y c0965y = (C0965y) obj2;
                        if (c0965y.b != null) {
                            I(obj, obj2);
                        }
                        if (obj instanceof ax.Vb.C) {
                            return;
                        }
                        ax.Gb.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        AbstractC0941j abstractC0941j = (AbstractC0941j) obj;
                        if (c0965y.c()) {
                            o(abstractC0941j, c0965y.e);
                            return;
                        } else {
                            if (ax.D.b.a(h0, this, obj2, C0965y.b(c0965y, null, abstractC0941j, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (obj instanceof ax.Vb.C) {
                            return;
                        }
                        ax.Gb.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (ax.D.b.a(h0, this, obj2, new C0965y(obj2, (AbstractC0941j) obj, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            } else if (ax.D.b.a(h0, this, obj2, obj)) {
                return;
            }
        }
    }

    private final boolean G() {
        if (!W.c(this.d0)) {
            return false;
        }
        ax.wb.e<T> eVar = this.e0;
        ax.Gb.l.d(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C1003j) eVar).q();
    }

    private final AbstractC0941j H(ax.Fb.l<? super Throwable, ax.sb.t> lVar) {
        return lVar instanceof AbstractC0941j ? (AbstractC0941j) lVar : new C0954p0(lVar);
    }

    private final void I(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    private final void N(Object obj, int i, ax.Fb.l<? super Throwable, ax.sb.t> lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h0;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof G0)) {
                Object obj3 = obj;
                ax.Fb.l<? super Throwable, ax.sb.t> lVar2 = lVar;
                if (obj2 instanceof C0953p) {
                    C0953p c0953p = (C0953p) obj2;
                    if (c0953p.c()) {
                        if (lVar2 != null) {
                            p(lVar2, c0953p.a);
                            return;
                        }
                        return;
                    }
                }
                m(obj3);
                throw new C3072d();
            }
            Object obj4 = obj;
            int i2 = i;
            ax.Fb.l<? super Throwable, ax.sb.t> lVar3 = lVar;
            if (ax.D.b.a(h0, this, obj2, P((G0) obj2, obj4, i2, lVar3, null))) {
                v();
                w(i2);
                return;
            } else {
                obj = obj4;
                i = i2;
                lVar = lVar3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void O(C0947m c0947m, Object obj, int i, ax.Fb.l lVar, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        c0947m.N(obj, i, lVar);
    }

    private final Object P(G0 g02, Object obj, int i, ax.Fb.l<? super Throwable, ax.sb.t> lVar, Object obj2) {
        if (obj instanceof C0966z) {
            return obj;
        }
        if ((W.b(i) || obj2 != null) && !(lVar == null && !(g02 instanceof AbstractC0941j) && obj2 == null)) {
            return new C0965y(obj, g02 instanceof AbstractC0941j ? (AbstractC0941j) g02 : null, lVar, obj2, null, 16, null);
        }
        return obj;
    }

    private final boolean Q() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g0;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!g0.compareAndSet(this, i, 1073741824 + (536870911 & i)));
        return true;
    }

    private final ax.Vb.F R(Object obj, Object obj2, ax.Fb.l<? super Throwable, ax.sb.t> lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h0;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof G0)) {
                Object obj4 = obj2;
                if ((obj3 instanceof C0965y) && obj4 != null && ((C0965y) obj3).d == obj4) {
                    return C0949n.a;
                }
                return null;
            }
            Object obj5 = obj;
            Object obj6 = obj2;
            ax.Fb.l<? super Throwable, ax.sb.t> lVar2 = lVar;
            if (ax.D.b.a(h0, this, obj3, P((G0) obj3, obj5, this.d0, lVar2, obj6))) {
                v();
                return C0949n.a;
            }
            obj = obj5;
            lVar = lVar2;
            obj2 = obj6;
        }
    }

    private final boolean S() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g0;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!g0.compareAndSet(this, i, 536870912 + (536870911 & i)));
        return true;
    }

    private final Void m(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void q(ax.Vb.C<?> c, Throwable th) {
        int i = g0.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            c.o(i, th, b());
        } catch (Throwable th2) {
            I.a(b(), new C("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final boolean t(Throwable th) {
        if (!G()) {
            return false;
        }
        ax.wb.e<T> eVar = this.e0;
        ax.Gb.l.d(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C1003j) eVar).t(th);
    }

    private final void v() {
        if (G()) {
            return;
        }
        u();
    }

    private final void w(int i) {
        if (Q()) {
            return;
        }
        W.a(this, i);
    }

    private final Z y() {
        return (Z) i0.get(this);
    }

    public final Object A() {
        return h0.get(this);
    }

    public void C() {
        Z D = D();
        if (D != null && F()) {
            D.d();
            i0.set(this, F0.q);
        }
    }

    public boolean F() {
        return !(A() instanceof G0);
    }

    protected String J() {
        return "CancellableContinuation";
    }

    public final void K(Throwable th) {
        if (t(th)) {
            return;
        }
        n(th);
        v();
    }

    public final void L() {
        Throwable v;
        ax.wb.e<T> eVar = this.e0;
        C1003j c1003j = eVar instanceof C1003j ? (C1003j) eVar : null;
        if (c1003j == null || (v = c1003j.v(this)) == null) {
            return;
        }
        u();
        n(v);
    }

    public final boolean M() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h0;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if ((obj instanceof C0965y) && ((C0965y) obj).d != null) {
            u();
            return false;
        }
        g0.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, C0929d.q);
        return true;
    }

    @Override // ax.Qb.R0
    public void a(ax.Vb.C<?> c, int i) {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g0;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        E(c);
    }

    @Override // ax.wb.e
    public ax.wb.i b() {
        return this.f0;
    }

    @Override // ax.Qb.V
    public void c(Object obj, Throwable th) {
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h0;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof G0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0966z) {
                return;
            }
            if (obj2 instanceof C0965y) {
                C0965y c0965y = (C0965y) obj2;
                if (c0965y.c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th3 = th;
                th2 = th3;
                if (ax.D.b.a(h0, this, obj2, C0965y.b(c0965y, null, null, null, null, th3, 15, null))) {
                    c0965y.d(this, th2);
                    return;
                }
            } else {
                th2 = th;
                if (ax.D.b.a(h0, this, obj2, new C0965y(obj2, null, null, null, th2, 14, null))) {
                    return;
                }
            }
            th = th2;
        }
    }

    @Override // ax.yb.e
    public ax.yb.e d() {
        ax.wb.e<T> eVar = this.e0;
        if (eVar instanceof ax.yb.e) {
            return (ax.yb.e) eVar;
        }
        return null;
    }

    @Override // ax.Qb.V
    public final ax.wb.e<T> e() {
        return this.e0;
    }

    @Override // ax.wb.e
    public void f(Object obj) {
        O(this, D.c(obj, this), this.d0, null, 4, null);
    }

    @Override // ax.Qb.V
    public Throwable g(Object obj) {
        Throwable g = super.g(obj);
        if (g != null) {
            return g;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.Qb.V
    public <T> T h(Object obj) {
        return obj instanceof C0965y ? (T) ((C0965y) obj).a : obj;
    }

    @Override // ax.Qb.V
    public Object j() {
        return A();
    }

    @Override // ax.Qb.InterfaceC0945l
    public void k(T t, ax.Fb.l<? super Throwable, ax.sb.t> lVar) {
        N(t, this.d0, lVar);
    }

    @Override // ax.Qb.InterfaceC0945l
    public Object l(T t, Object obj, ax.Fb.l<? super Throwable, ax.sb.t> lVar) {
        return R(t, obj, lVar);
    }

    @Override // ax.Qb.InterfaceC0945l
    public boolean n(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h0;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof G0)) {
                return false;
            }
        } while (!ax.D.b.a(h0, this, obj, new C0953p(this, th, (obj instanceof AbstractC0941j) || (obj instanceof ax.Vb.C))));
        G0 g02 = (G0) obj;
        if (g02 instanceof AbstractC0941j) {
            o((AbstractC0941j) obj, th);
        } else if (g02 instanceof ax.Vb.C) {
            q((ax.Vb.C) obj, th);
        }
        v();
        w(this.d0);
        return true;
    }

    public final void o(AbstractC0941j abstractC0941j, Throwable th) {
        try {
            abstractC0941j.f(th);
        } catch (Throwable th2) {
            I.a(b(), new C("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void p(ax.Fb.l<? super Throwable, ax.sb.t> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            I.a(b(), new C("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // ax.Qb.InterfaceC0945l
    public void r(ax.Fb.l<? super Throwable, ax.sb.t> lVar) {
        E(H(lVar));
    }

    @Override // ax.Qb.InterfaceC0945l
    public void s(Object obj) {
        w(this.d0);
    }

    public String toString() {
        return J() + '(' + N.c(this.e0) + "){" + B() + "}@" + N.b(this);
    }

    public final void u() {
        Z y = y();
        if (y == null) {
            return;
        }
        y.d();
        i0.set(this, F0.q);
    }

    public Throwable x(InterfaceC0959s0 interfaceC0959s0) {
        return interfaceC0959s0.o();
    }

    public final Object z() {
        InterfaceC0959s0 interfaceC0959s0;
        boolean G = G();
        if (S()) {
            if (y() == null) {
                D();
            }
            if (G) {
                L();
            }
            return C3479b.c();
        }
        if (G) {
            L();
        }
        Object A = A();
        if (A instanceof C0966z) {
            throw ((C0966z) A).a;
        }
        if (!W.b(this.d0) || (interfaceC0959s0 = (InterfaceC0959s0) b().a(InterfaceC0959s0.c)) == null || interfaceC0959s0.e()) {
            return h(A);
        }
        CancellationException o = interfaceC0959s0.o();
        c(A, o);
        throw o;
    }
}
