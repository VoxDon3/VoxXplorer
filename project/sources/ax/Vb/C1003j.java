package ax.Vb;

import ax.Qb.AbstractC0928c0;
import ax.Qb.C0947m;
import ax.Qb.InterfaceC0945l;
import ax.Qb.N0;
import ax.Qb.V;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: ax.Vb.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1003j<T> extends V<T> implements ax.yb.e, ax.wb.e<T> {
    private static final AtomicReferenceFieldUpdater i0 = AtomicReferenceFieldUpdater.newUpdater(C1003j.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;
    public final ax.Qb.G e0;
    public final ax.wb.e<T> f0;
    public Object g0;
    public final Object h0;

    /* JADX WARN: Multi-variable type inference failed */
    public C1003j(ax.Qb.G g, ax.wb.e<? super T> eVar) {
        super(-1);
        F f;
        this.e0 = g;
        this.f0 = eVar;
        f = C1004k.a;
        this.g0 = f;
        this.h0 = J.b(b());
    }

    private final C0947m<?> p() {
        Object obj = i0.get(this);
        if (obj instanceof C0947m) {
            return (C0947m) obj;
        }
        return null;
    }

    @Override // ax.wb.e
    public ax.wb.i b() {
        return this.f0.b();
    }

    @Override // ax.Qb.V
    public void c(Object obj, Throwable th) {
        if (obj instanceof ax.Qb.A) {
            ((ax.Qb.A) obj).b.invoke(th);
        }
    }

    @Override // ax.yb.e
    public ax.yb.e d() {
        ax.wb.e<T> eVar = this.f0;
        if (eVar instanceof ax.yb.e) {
            return (ax.yb.e) eVar;
        }
        return null;
    }

    @Override // ax.wb.e
    public void f(Object obj) {
        ax.wb.i b = this.f0.b();
        Object d = ax.Qb.D.d(obj, null, 1, null);
        if (this.e0.f(b)) {
            this.g0 = d;
            this.d0 = 0;
            this.e0.b(b, this);
            return;
        }
        AbstractC0928c0 b2 = N0.a.b();
        if (b2.g1()) {
            this.g0 = d;
            this.d0 = 0;
            b2.c1(this);
            return;
        }
        b2.e1(true);
        try {
            ax.wb.i b3 = b();
            Object c = J.c(b3, this.h0);
            try {
                this.f0.f(obj);
                ax.sb.t tVar = ax.sb.t.a;
                while (b2.j1()) {
                }
            } finally {
                J.a(b3, c);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // ax.Qb.V
    public Object j() {
        F f;
        Object obj = this.g0;
        f = C1004k.a;
        this.g0 = f;
        return obj;
    }

    public final void m() {
        while (i0.get(this) == C1004k.b) {
        }
    }

    public final C0947m<T> o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i0;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                i0.set(this, C1004k.b);
                return null;
            }
            if (obj instanceof C0947m) {
                if (ax.D.b.a(i0, this, obj, C1004k.b)) {
                    return (C0947m) obj;
                }
            } else if (obj != C1004k.b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final boolean q() {
        return i0.get(this) != null;
    }

    public final boolean t(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i0;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            F f = C1004k.b;
            if (ax.Gb.l.a(obj, f)) {
                if (ax.D.b.a(i0, this, f, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (ax.D.b.a(i0, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.e0 + ", " + ax.Qb.N.c(this.f0) + ']';
    }

    public final void u() {
        m();
        C0947m<?> p = p();
        if (p != null) {
            p.u();
        }
    }

    public final Throwable v(InterfaceC0945l<?> interfaceC0945l) {
        F f;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i0;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            f = C1004k.b;
            if (obj != f) {
                if (obj instanceof Throwable) {
                    if (ax.D.b.a(i0, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!ax.D.b.a(i0, this, f, interfaceC0945l));
        return null;
    }

    @Override // ax.Qb.V
    public ax.wb.e<T> e() {
        return this;
    }
}
