package ax.Vb;

import ax.Vb.AbstractC0998e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: ax.Vb.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0998e<N extends AbstractC0998e<N>> {
    private volatile Object _next;
    private volatile Object _prev;
    private static final AtomicReferenceFieldUpdater q = AtomicReferenceFieldUpdater.newUpdater(AbstractC0998e.class, Object.class, "_next");
    private static final AtomicReferenceFieldUpdater c0 = AtomicReferenceFieldUpdater.newUpdater(AbstractC0998e.class, Object.class, "_prev");

    public AbstractC0998e(N n) {
        this._prev = n;
    }

    private final N c() {
        N g = g();
        while (g != null && g.h()) {
            g = (N) c0.get(g);
        }
        return g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [ax.Vb.e] */
    private final N d() {
        ?? e;
        N e2 = e();
        ax.Gb.l.c(e2);
        while (e2.h() && (e = e2.e()) != 0) {
            e2 = e;
        }
        return e2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f() {
        return q.get(this);
    }

    public final void b() {
        c0.lazySet(this, null);
    }

    public final N e() {
        Object f = f();
        if (f == C0997d.a) {
            return null;
        }
        return (N) f;
    }

    public final N g() {
        return (N) c0.get(this);
    }

    public abstract boolean h();

    public final boolean i() {
        return e() == null;
    }

    public final boolean j() {
        return ax.D.b.a(q, this, null, C0997d.a);
    }

    public final void k() {
        Object obj;
        if (i()) {
            return;
        }
        while (true) {
            N c = c();
            N d = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c0;
            do {
                obj = atomicReferenceFieldUpdater.get(d);
            } while (!ax.D.b.a(atomicReferenceFieldUpdater, d, obj, ((AbstractC0998e) obj) == null ? null : c));
            if (c != null) {
                q.set(c, d);
            }
            if (!d.h() || d.i()) {
                if (c == null || !c.h()) {
                    return;
                }
            }
        }
    }

    public final boolean l(N n) {
        return ax.D.b.a(q, this, null, n);
    }
}
