/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Qb.C;
import ax.Qb.D;
import ax.Qb.F0;
import ax.Qb.G0;
import ax.Qb.I;
import ax.Qb.N;
import ax.Qb.R0;
import ax.Qb.V;
import ax.Qb.W;
import ax.Qb.Z;
import ax.Qb.d;
import ax.Qb.j;
import ax.Qb.l;
import ax.Qb.n;
import ax.Qb.p;
import ax.Qb.p0;
import ax.Qb.q;
import ax.Qb.s0;
import ax.Qb.y;
import ax.Qb.z;
import ax.Vb.F;
import ax.i.s;
import ax.sb.t;
import ax.wb.i;
import ax.xb.b;
import ax.yb.e;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class m<T>
extends V<T>
implements l<T>,
e,
R0 {
    private static final AtomicIntegerFieldUpdater g0 = AtomicIntegerFieldUpdater.newUpdater(m.class, "_decisionAndIndex");
    private static final AtomicReferenceFieldUpdater h0 = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state");
    private static final AtomicReferenceFieldUpdater i0 = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;
    private final ax.wb.e<T> e0;
    private final i f0;

    public m(ax.wb.e<? super T> e8, int n8) {
        super(n8);
        this.e0 = e8;
        this.f0 = e8.b();
        this._decisionAndIndex = 0x1FFFFFFF;
        this._state = d.q;
    }

    private final String B() {
        Object object = this.A();
        if (object instanceof G0) {
            return "Active";
        }
        if (object instanceof p) {
            return "Cancelled";
        }
        return "Completed";
    }

    private final Z D() {
        Object object = this.b().a(s0.c);
        if (object == null) {
            return null;
        }
        object = s0.a.d((s0)object, true, false, new q(this), 2, null);
        ax.D.b.a(i0, this, null, object);
        return object;
    }

    private final void E(Object object) {
        Object object2 = h0;
        while (true) {
            y y8;
            Object object3;
            if ((object3 = ((AtomicReferenceFieldUpdater)object2).get(this)) instanceof d) {
                if (!ax.D.b.a(h0, this, object3, object)) continue;
                break;
            }
            boolean bl = object3 instanceof j ? true : object3 instanceof ax.Vb.C;
            if (bl) {
                this.I(object, object3);
                continue;
            }
            if (object3 instanceof z) {
                object2 = (z)object3;
                if (!((z)object2).b()) {
                    this.I(object, object3);
                }
                if (!(object3 instanceof p)) break;
                bl = s.a(object3);
                object3 = null;
                if (!bl) {
                    object2 = null;
                }
                if (object2 != null) {
                    object3 = ((z)object2).a;
                }
                if (object instanceof j) {
                    this.o((j)object, (Throwable)object3);
                    return;
                }
                ax.Gb.l.d(object, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                this.q((ax.Vb.C)object, (Throwable)object3);
                return;
            }
            if (object3 instanceof y) {
                y8 = (y)object3;
                if (y8.b != null) {
                    this.I(object, object3);
                }
                if (object instanceof ax.Vb.C) {
                    return;
                }
                ax.Gb.l.d(object, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                j j8 = (j)object;
                if (y8.c()) {
                    this.o(j8, y8.e);
                    return;
                }
                if (!ax.D.b.a(h0, this, object3, y8 = y.b(y8, null, j8, null, null, null, 29, null))) continue;
                break;
            }
            if (object instanceof ax.Vb.C) {
                return;
            }
            ax.Gb.l.d(object, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            y8 = new y(object3, (j)object, null, null, null, 28, null);
            if (ax.D.b.a(h0, this, object3, y8)) break;
        }
    }

    private final boolean G() {
        if (W.c(this.d0)) {
            ax.wb.e<T> e8 = this.e0;
            ax.Gb.l.d(e8, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((ax.Vb.j)e8).q()) {
                return true;
            }
        }
        return false;
    }

    private final j H(ax.Fb.l<? super Throwable, t> l8) {
        if (l8 instanceof j) {
            return (j)l8;
        }
        return new p0(l8);
    }

    private final void I(Object object, Object object2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("It's prohibited to register multiple handlers, tried to register ");
        stringBuilder.append(object);
        stringBuilder.append(", already has ");
        stringBuilder.append(object2);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    private final void N(Object object, int n8, ax.Fb.l<? super Throwable, t> l8) {
        Object v8;
        Object object2 = h0;
        while ((v8 = ((AtomicReferenceFieldUpdater)object2).get(this)) instanceof G0) {
            Object object3 = this.P((G0)v8, object, n8, l8, null);
            if (!ax.D.b.a(h0, this, v8, object3)) continue;
            this.v();
            this.w(n8);
            return;
        }
        if (v8 instanceof p && ((p)(object2 = (p)v8)).c()) {
            if (l8 != null) {
                this.p(l8, ((z)object2).a);
            }
            return;
        }
        this.m(object);
        throw new ax.sb.d();
    }

    static /* synthetic */ void O(m m8, Object object, int n8, ax.Fb.l l8, int n9, Object object2) {
        if (object2 == null) {
            if ((n9 & 4) != 0) {
                l8 = null;
            }
            m8.N(object, n8, l8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    private final Object P(G0 g02, Object object, int n8, ax.Fb.l<? super Throwable, t> l8, Object object2) {
        if (object instanceof z) {
            return object;
        }
        if (!W.b(n8) && object2 == null || l8 == null && !(g02 instanceof j) && object2 == null) {
            return object;
        }
        g02 = g02 instanceof j ? (j)g02 : null;
        return new y(object, (j)g02, l8, object2, null, 16, null);
    }

    private final boolean Q() {
        int n8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g0;
        do {
            int n9;
            if ((n9 = (n8 = atomicIntegerFieldUpdater.get(this)) >> 29) == 0) continue;
            if (n9 == 1) {
                return false;
            }
            throw new IllegalStateException("Already resumed");
        } while (!g0.compareAndSet(this, n8, 0x40000000 + (0x1FFFFFFF & n8)));
        return true;
    }

    private final F R(Object object, Object object2, ax.Fb.l<? super Throwable, t> l8) {
        Object v8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h0;
        while ((v8 = atomicReferenceFieldUpdater.get(this)) instanceof G0) {
            Object object3 = this.P((G0)v8, object, this.d0, l8, object2);
            if (!ax.D.b.a(h0, this, v8, object3)) continue;
            this.v();
            return n.a;
        }
        if (v8 instanceof y && object2 != null && ((y)v8).d == object2) {
            return n.a;
        }
        return null;
    }

    private final boolean S() {
        int n8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g0;
        do {
            int n9;
            if ((n9 = (n8 = atomicIntegerFieldUpdater.get(this)) >> 29) == 0) continue;
            if (n9 == 2) {
                return false;
            }
            throw new IllegalStateException("Already suspended");
        } while (!g0.compareAndSet(this, n8, 0x20000000 + (0x1FFFFFFF & n8)));
        return true;
    }

    private final Void m(Object object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Already resumed, but proposed with update ");
        stringBuilder.append(object);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    private final void q(ax.Vb.C<?> c8, Throwable serializable) {
        int n8 = g0.get(this) & 0x1FFFFFFF;
        if (n8 != 0x1FFFFFFF) {
            try {
                c8.o(n8, (Throwable)serializable, this.b());
                return;
            }
            catch (Throwable throwable) {
                i i8 = this.b();
                serializable = new StringBuilder();
                ((StringBuilder)serializable).append("Exception in invokeOnCancellation handler for ");
                ((StringBuilder)serializable).append(this);
                I.a(i8, new C(((StringBuilder)serializable).toString(), throwable));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
    }

    private final boolean t(Throwable throwable) {
        if (!this.G()) {
            return false;
        }
        ax.wb.e<T> e8 = this.e0;
        ax.Gb.l.d(e8, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((ax.Vb.j)e8).t(throwable);
    }

    private final void v() {
        if (!this.G()) {
            this.u();
        }
    }

    private final void w(int n8) {
        if (this.Q()) {
            return;
        }
        W.a(this, n8);
    }

    private final Z y() {
        return (Z)i0.get(this);
    }

    public final Object A() {
        return h0.get(this);
    }

    public void C() {
        Z z8 = this.D();
        if (z8 != null && this.F()) {
            z8.d();
            i0.set(this, F0.q);
        }
    }

    public boolean F() {
        return this.A() instanceof G0 ^ true;
    }

    protected String J() {
        return "CancellableContinuation";
    }

    public final void K(Throwable throwable) {
        if (this.t(throwable)) {
            return;
        }
        this.n(throwable);
        this.v();
    }

    public final void L() {
        ax.Vb.j j8 = this.e0;
        j8 = j8 instanceof ax.Vb.j ? (ax.Vb.j)j8 : null;
        if (j8 != null && (j8 = j8.v(this)) != null) {
            this.u();
            this.n((Throwable)((Object)j8));
        }
    }

    public final boolean M() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h0;
        Object v8 = atomicReferenceFieldUpdater.get(this);
        if (v8 instanceof y && ((y)v8).d != null) {
            this.u();
            return false;
        }
        g0.set(this, 0x1FFFFFFF);
        atomicReferenceFieldUpdater.set(this, d.q);
        return true;
    }

    @Override
    public void a(ax.Vb.C<?> c8, int n8) {
        int n9;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g0;
        while (((n9 = atomicIntegerFieldUpdater.get(this)) & 0x1FFFFFFF) == 0x1FFFFFFF) {
            if (!atomicIntegerFieldUpdater.compareAndSet(this, n9, (n9 >> 29 << 29) + n8)) continue;
            this.E(c8);
            return;
        }
        throw new IllegalStateException("invokeOnCancellation should be called at most once");
    }

    @Override
    public i b() {
        return this.f0;
    }

    @Override
    public void c(Object object, Throwable throwable) {
        Object v8;
        object = h0;
        while (!((v8 = ((AtomicReferenceFieldUpdater)object).get(this)) instanceof G0)) {
            if (!(v8 instanceof z)) {
                if (v8 instanceof y) {
                    y y8 = (y)v8;
                    if (!y8.c()) {
                        y y9 = y.b(y8, null, null, null, null, throwable, 15, null);
                        if (!ax.D.b.a(h0, this, v8, y9)) continue;
                        y8.d(this, throwable);
                        return;
                    }
                    throw new IllegalStateException("Must be called at most once");
                }
                if (!ax.D.b.a(h0, this, v8, new y(v8, null, null, null, throwable, 14, null))) continue;
            }
            return;
        }
        throw new IllegalStateException("Not completed");
    }

    @Override
    public e d() {
        ax.wb.e<T> e8 = this.e0;
        if (e8 instanceof e) {
            return (e)((Object)e8);
        }
        return null;
    }

    @Override
    public final ax.wb.e<T> e() {
        return this.e0;
    }

    @Override
    public void f(Object object) {
        m.O(this, D.c(object, this), this.d0, null, 4, null);
    }

    @Override
    public Throwable g(Object object) {
        if ((object = super.g(object)) != null) {
            return object;
        }
        return null;
    }

    @Override
    public <T> T h(Object object) {
        Object object2 = object;
        if (object instanceof y) {
            object2 = ((y)object).a;
        }
        return (T)object2;
    }

    @Override
    public Object j() {
        return this.A();
    }

    @Override
    public void k(T t8, ax.Fb.l<? super Throwable, t> l8) {
        this.N(t8, this.d0, l8);
    }

    @Override
    public Object l(T t8, Object object, ax.Fb.l<? super Throwable, t> l8) {
        return this.R(t8, object, l8);
    }

    @Override
    public boolean n(Throwable throwable) {
        boolean bl;
        Object object;
        Object v8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h0;
        do {
            v8 = atomicReferenceFieldUpdater.get(this);
            boolean bl2 = v8 instanceof G0;
            bl = false;
            if (!bl2) {
                return false;
            }
            if (!(v8 instanceof j) && !(v8 instanceof ax.Vb.C)) continue;
            bl = true;
        } while (!ax.D.b.a(h0, this, v8, object = new p(this, throwable, bl)));
        object = (G0)v8;
        if (object instanceof j) {
            this.o((j)v8, throwable);
        } else if (object instanceof ax.Vb.C) {
            this.q((ax.Vb.C)v8, throwable);
        }
        this.v();
        this.w(this.d0);
        return true;
    }

    public final void o(j j8, Throwable object) {
        try {
            j8.f((Throwable)object);
            return;
        }
        catch (Throwable throwable) {
            object = this.b();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Exception in invokeOnCancellation handler for ");
            stringBuilder.append(this);
            I.a((i)object, new C(stringBuilder.toString(), throwable));
            return;
        }
    }

    public final void p(ax.Fb.l<? super Throwable, t> object, Throwable serializable) {
        try {
            object.invoke((Throwable)serializable);
            return;
        }
        catch (Throwable throwable) {
            object = this.b();
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append("Exception in resume onCancellation handler for ");
            ((StringBuilder)serializable).append(this);
            I.a((i)object, new C(((StringBuilder)serializable).toString(), throwable));
            return;
        }
    }

    @Override
    public void r(ax.Fb.l<? super Throwable, t> l8) {
        this.E(this.H(l8));
    }

    @Override
    public void s(Object object) {
        this.w(this.d0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.J());
        stringBuilder.append('(');
        stringBuilder.append(N.c(this.e0));
        stringBuilder.append("){");
        stringBuilder.append(this.B());
        stringBuilder.append("}@");
        stringBuilder.append(N.b(this));
        return stringBuilder.toString();
    }

    public final void u() {
        Z z8 = this.y();
        if (z8 == null) {
            return;
        }
        z8.d();
        i0.set(this, F0.q);
    }

    public Throwable x(s0 s02) {
        return s02.o();
    }

    public final Object z() {
        Object object;
        boolean bl = this.G();
        if (this.S()) {
            if (this.y() == null) {
                this.D();
            }
            if (bl) {
                this.L();
            }
            return b.c();
        }
        if (bl) {
            this.L();
        }
        if (!((object = this.A()) instanceof z)) {
            Object object2;
            if (W.b(this.d0) && (object2 = this.b().a(s0.c)) != null && !object2.e()) {
                object2 = object2.o();
                this.c(object, (Throwable)object2);
                throw object2;
            }
            return this.h(object);
        }
        throw ((z)object).a;
    }
}

