/*
 * Decompiled with CFR 0.152.
 */
package ax.Tb;

import ax.Gb.l;
import ax.Tb.m;
import ax.Tb.n;
import ax.Ub.c;
import ax.Ub.d;
import ax.Vb.F;
import ax.sb.n;
import ax.sb.t;
import ax.wb.e;
import ax.xb.b;
import ax.yb.h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class o
extends d<m<?>> {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_state");
    private volatile Object _state;

    public boolean d(m<?> object) {
        object = a;
        if (((AtomicReferenceFieldUpdater)object).get(this) != null) {
            return false;
        }
        ((AtomicReferenceFieldUpdater)object).set(this, n.b());
        return true;
    }

    public final Object e(e<? super t> e8) {
        Object object = new ax.Qb.m<t>(b.b(e8), 1);
        ((ax.Qb.m)object).C();
        if (!ax.D.b.a(o.a, this, n.b(), object)) {
            n.a a8 = ax.sb.n.q;
            object.f(ax.sb.n.a(t.a));
        }
        if ((object = ((ax.Qb.m)object).z()) == b.c()) {
            h.c(e8);
        }
        if (object == b.c()) {
            return object;
        }
        return t.a;
    }

    public e<t>[] f(m<?> m8) {
        a.set(this, null);
        return c.a;
    }

    public final void g() {
        Object object;
        Object object2 = a;
        while (true) {
            if ((object = ((AtomicReferenceFieldUpdater)object2).get(this)) != null && object != n.c()) {
                if (object == n.b()) {
                    if (!ax.D.b.a(a, this, object, n.c())) continue;
                }
            } else {
                return;
            }
            if (ax.D.b.a(a, this, object, n.b())) break;
        }
        object = (ax.Qb.m)object;
        object2 = ax.sb.n.q;
        object.f(ax.sb.n.a(t.a));
    }

    public final boolean h() {
        F f8 = a.getAndSet(this, n.b());
        l.c(f8);
        return f8 == n.c();
    }
}

