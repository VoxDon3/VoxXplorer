/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

import ax.D.b;
import ax.Gb.l;
import ax.Qb.A;
import ax.Qb.D;
import ax.Qb.G;
import ax.Qb.N;
import ax.Qb.N0;
import ax.Qb.V;
import ax.Qb.c0;
import ax.Qb.m;
import ax.Vb.F;
import ax.Vb.J;
import ax.Vb.k;
import ax.sb.t;
import ax.wb.i;
import ax.yb.e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class j<T>
extends V<T>
implements e,
ax.wb.e<T> {
    private static final AtomicReferenceFieldUpdater i0 = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;
    public final G e0;
    public final ax.wb.e<T> f0;
    public Object g0;
    public final Object h0;

    public j(G g8, ax.wb.e<? super T> e8) {
        super(-1);
        this.e0 = g8;
        this.f0 = e8;
        this.g0 = k.a();
        this.h0 = J.b(this.b());
    }

    private final m<?> p() {
        Object v8 = i0.get(this);
        if (v8 instanceof m) {
            return (m)v8;
        }
        return null;
    }

    @Override
    public i b() {
        return this.f0.b();
    }

    @Override
    public void c(Object object, Throwable throwable) {
        if (object instanceof A) {
            ((A)object).b.invoke(throwable);
        }
    }

    @Override
    public e d() {
        ax.wb.e<T> e8 = this.f0;
        if (e8 instanceof e) {
            return (e)((Object)e8);
        }
        return null;
    }

    @Override
    public ax.wb.e<T> e() {
        return this;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void f(Object object) {
        Throwable throwable222222;
        boolean bl;
        i i8 = this.f0.b();
        Object object2 = D.d(object, null, 1, null);
        if (this.e0.f(i8)) {
            this.g0 = object2;
            this.d0 = 0;
            this.e0.b(i8, this);
            return;
        }
        i8 = N0.a.b();
        if (((c0)i8).g1()) {
            this.g0 = object2;
            this.d0 = 0;
            ((c0)i8).c1(this);
            return;
        }
        ((c0)i8).e1(true);
        i i9 = this.b();
        object2 = J.c(i9, this.h0);
        this.f0.f(object);
        object = t.a;
        J.a(i9, object2);
        while (bl = ((c0)i8).j1()) {
        }
        return;
        {
            catch (Throwable throwable222222) {}
        }
        catch (Throwable throwable3) {
            J.a(i9, object2);
            throw throwable3;
        }
        try {
            this.i(throwable222222, null);
            return;
        }
        finally {
            ((c0)i8).Z0(true);
        }
    }

    @Override
    public Object j() {
        Object object = this.g0;
        this.g0 = k.a();
        return object;
    }

    public final void m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i0;
        while (atomicReferenceFieldUpdater.get(this) == k.b) {
        }
    }

    public final m<T> o() {
        Object v8;
        Object object = i0;
        while (true) {
            if ((v8 = ((AtomicReferenceFieldUpdater)object).get(this)) == null) {
                i0.set(this, k.b);
                return null;
            }
            if (v8 instanceof m) {
                if (!b.a(i0, this, v8, k.b)) continue;
                return (m)v8;
            }
            if (v8 != k.b && !(v8 instanceof Throwable)) break;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Inconsistent state ");
        ((StringBuilder)object).append(v8);
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }

    public final boolean q() {
        return i0.get(this) != null;
    }

    public final boolean t(Throwable throwable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i0;
        while (true) {
            F f8;
            Object v8;
            if (l.a(v8 = atomicReferenceFieldUpdater.get(this), f8 = k.b)) {
                if (!b.a(i0, this, f8, throwable)) continue;
                return true;
            }
            if (v8 instanceof Throwable) {
                return true;
            }
            if (b.a(i0, this, v8, null)) break;
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DispatchedContinuation[");
        stringBuilder.append(this.e0);
        stringBuilder.append(", ");
        stringBuilder.append(N.c(this.f0));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final void u() {
        this.m();
        m<?> m8 = this.p();
        if (m8 != null) {
            m8.u();
        }
    }

    public final Throwable v(ax.Qb.l<?> object) {
        F f8;
        Object v8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i0;
        while ((v8 = atomicReferenceFieldUpdater.get(this)) == (f8 = k.b)) {
            if (!b.a(i0, this, f8, object)) continue;
            return null;
        }
        if (v8 instanceof Throwable) {
            if (b.a(i0, this, v8, null)) {
                return (Throwable)v8;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Inconsistent state ");
        ((StringBuilder)object).append(v8);
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }
}

