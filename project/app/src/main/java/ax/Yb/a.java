/*
 * Decompiled with CFR 0.152.
 */
package ax.Yb;

import ax.Fb.q;
import ax.Gb.l;
import ax.Qb.R0;
import ax.Qb.Z;
import ax.Qb.j;
import ax.Vb.C;
import ax.Yb.b;
import ax.Yb.c;
import ax.Yb.d;
import ax.sb.t;
import ax.tb.o;
import ax.wb.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class a<R>
extends j
implements b,
R0 {
    private static final AtomicReferenceFieldUpdater g0 = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "state");
    private List<a> c0;
    private Object d0;
    private int e0;
    private Object f0;
    private final i q;
    private volatile Object state;

    private final a h(Object object) {
        Object object2 = this.c0;
        Object var3_3 = null;
        if (object2 == null) {
            return null;
        }
        Iterator iterator = ((Iterable)object2).iterator();
        do {
            object2 = var3_3;
            if (!iterator.hasNext()) break;
            object2 = iterator.next();
        } while (((a)object2).a != object);
        if ((object2 = (a)object2) != null) {
            return object2;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Clause with object ");
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(" is not found");
        throw new IllegalStateException(((StringBuilder)object2).toString().toString());
    }

    private final int l(Object object, Object object2) {
        Object v8;
        block6: {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
                if ((v8 = (atomicReferenceFieldUpdater = g0).get(this)) instanceof ax.Qb.l) {
                    a a8 = this.h(object);
                    if (a8 == null) continue;
                    ax.Fb.l<Throwable, t> l8 = a8.a(this, object2);
                    if (!ax.D.b.a(atomicReferenceFieldUpdater, this, v8, a8)) continue;
                    object = (ax.Qb.l)v8;
                    this.f0 = object2;
                    if (c.g((ax.Qb.l)object, l8)) {
                        return 0;
                    }
                    this.f0 = null;
                    return 2;
                }
                boolean bl = l.a(v8, c.e()) ? true : v8 instanceof a;
                if (bl) {
                    return 3;
                }
                if (l.a(v8, c.d())) {
                    return 2;
                }
                if (l.a(v8, c.f())) {
                    if (!ax.D.b.a(atomicReferenceFieldUpdater, this, v8, o.d(object))) continue;
                    return 1;
                }
                if (!(v8 instanceof List)) break block6;
                if (ax.D.b.a(atomicReferenceFieldUpdater, this, v8, o.P((Collection)v8, object))) break;
            }
            return 1;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Unexpected state: ");
        ((StringBuilder)object).append(v8);
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }

    @Override
    public void a(C<?> c8, int n8) {
        this.d0 = c8;
        this.e0 = n8;
    }

    @Override
    public i b() {
        return this.q;
    }

    @Override
    public boolean d(Object object, Object object2) {
        return this.l(object, object2) == 0;
    }

    @Override
    public void e(Object object) {
        this.f0 = object;
    }

    @Override
    public void f(Throwable object) {
        block2: {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g0;
            while ((object = atomicReferenceFieldUpdater.get(this)) != c.e()) {
                if (!ax.D.b.a(atomicReferenceFieldUpdater, this, object, c.d())) continue;
                object = this.c0;
                if (object != null) break block2;
            }
            return;
        }
        object = ((Iterable)object).iterator();
        while (object.hasNext()) {
            ((a)object.next()).b();
        }
        this.f0 = c.c();
        this.c0 = null;
    }

    public final d k(Object object, Object object2) {
        return c.b(this.l(object, object2));
    }

    public final class a {
        public final Object a;
        private final Object b;
        public final q<b<?>, Object, Object, ax.Fb.l<Throwable, t>> c;
        public Object d;
        public int e;
        final a<R> f;

        public final ax.Fb.l<Throwable, t> a(b<?> b8, Object object) {
            q<b<?>, Object, Object, ax.Fb.l<Throwable, t>> q8 = this.c;
            if (q8 != null) {
                return q8.c(b8, this.b, object);
            }
            return null;
        }

        public final void b() {
            Object object = this.d;
            a a8 = this.f;
            boolean bl = object instanceof C;
            Z z8 = null;
            if (bl) {
                ((C)object).o(this.e, null, a8.b());
                return;
            }
            if (object instanceof Z) {
                z8 = (Z)object;
            }
            if (z8 != null) {
                z8.d();
            }
        }
    }
}

