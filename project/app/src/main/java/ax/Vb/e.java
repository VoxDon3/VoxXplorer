/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

import ax.D.b;
import ax.Gb.l;
import ax.Vb.d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class e<N extends e<N>> {
    private static final AtomicReferenceFieldUpdater c0;
    private static final AtomicReferenceFieldUpdater q;
    private volatile Object _next;
    private volatile Object _prev;

    static {
        q = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_next");
        c0 = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_prev");
    }

    public e(N n8) {
        this._prev = n8;
    }

    private final N c() {
        Object object = this.g();
        while (object != null && ((e)object).h()) {
            object = (e)c0.get(object);
        }
        return object;
    }

    private final N d() {
        N n8;
        N n9 = this.e();
        l.c(n9);
        while (((e)n9).h() && (n8 = ((e)n9).e()) != null) {
            n9 = n8;
        }
        return n9;
    }

    private final Object f() {
        return q.get(this);
    }

    public final void b() {
        c0.lazySet(this, null);
    }

    public final N e() {
        Object object = this.f();
        if (object == d.a()) {
            return null;
        }
        return (N)((e)object);
    }

    public final N g() {
        return (N)((e)c0.get(this));
    }

    public abstract boolean h();

    public final boolean i() {
        return this.e() == null;
    }

    public final boolean j() {
        return b.a(q, this, null, d.a());
    }

    public final void k() {
        if (!this.i()) {
            N n8;
            N n9;
            do {
                Object var1_1;
                Object v8;
                n8 = this.c();
                n9 = this.d();
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c0;
                while (!b.a(atomicReferenceFieldUpdater, n9, v8, var1_1 = (e)(v8 = atomicReferenceFieldUpdater.get(n9)) == null ? null : n8)) {
                }
                if (n8 == null) continue;
                q.set(n8, n9);
            } while (((e)n9).h() && !((e)n9).i() || n8 != null && ((e)n8).h());
        }
    }

    public final boolean l(N n8) {
        return b.a(q, this, null, n8);
    }
}

