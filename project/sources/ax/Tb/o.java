package ax.Tb;

import ax.Qb.C0947m;
import ax.Vb.F;
import ax.sb.C3082n;
import ax.sb.t;
import ax.xb.C3479b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
final class o extends ax.Ub.d<m<?>> {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_state");
    private volatile Object _state;

    @Override // ax.Ub.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(m<?> mVar) {
        F f;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        f = n.a;
        atomicReferenceFieldUpdater.set(this, f);
        return true;
    }

    public final Object e(ax.wb.e<? super t> eVar) {
        F f;
        C0947m c0947m = new C0947m(C3479b.b(eVar), 1);
        c0947m.C();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        f = n.a;
        if (!ax.D.b.a(atomicReferenceFieldUpdater, this, f, c0947m)) {
            C3082n.a aVar = C3082n.q;
            c0947m.f(C3082n.a(t.a));
        }
        Object z = c0947m.z();
        if (z == C3479b.c()) {
            ax.yb.h.c(eVar);
        }
        return z == C3479b.c() ? z : t.a;
    }

    @Override // ax.Ub.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public ax.wb.e<t>[] b(m<?> mVar) {
        a.set(this, null);
        return ax.Ub.c.a;
    }

    public final void g() {
        F f;
        F f2;
        F f3;
        F f4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return;
            }
            f = n.b;
            if (obj == f) {
                return;
            }
            f2 = n.a;
            if (obj == f2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                f3 = n.b;
                if (ax.D.b.a(atomicReferenceFieldUpdater2, this, obj, f3)) {
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = a;
                f4 = n.a;
                if (ax.D.b.a(atomicReferenceFieldUpdater3, this, obj, f4)) {
                    C3082n.a aVar = C3082n.q;
                    ((C0947m) obj).f(C3082n.a(t.a));
                    return;
                }
            }
        }
    }

    public final boolean h() {
        F f;
        F f2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        f = n.a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, f);
        ax.Gb.l.c(andSet);
        f2 = n.b;
        return andSet == f2;
    }
}
