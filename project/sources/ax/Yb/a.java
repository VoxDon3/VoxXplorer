package ax.Yb;

import ax.Fb.l;
import ax.Fb.q;
import ax.Qb.AbstractC0941j;
import ax.Qb.InterfaceC0945l;
import ax.Qb.R0;
import ax.Qb.Z;
import ax.Vb.C;
import ax.Vb.F;
import ax.sb.t;
import ax.tb.C3139o;
import ax.wb.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public class a<R> extends AbstractC0941j implements b, R0 {
    private static final AtomicReferenceFieldUpdater g0 = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "state");
    private List<a<R>.C0227a> c0;
    private Object d0;
    private int e0;
    private Object f0;
    private final i q;
    private volatile Object state;

    /* renamed from: ax.Yb.a$a, reason: collision with other inner class name */
    public final class C0227a {
        public final Object a;
        private final Object b;
        public final q<b<?>, Object, Object, l<Throwable, t>> c;
        public Object d;
        public int e;
        final /* synthetic */ a<R> f;

        public final l<Throwable, t> a(b<?> bVar, Object obj) {
            q<b<?>, Object, Object, l<Throwable, t>> qVar = this.c;
            if (qVar != null) {
                return qVar.c(bVar, this.b, obj);
            }
            return null;
        }

        public final void b() {
            Object obj = this.d;
            a<R> aVar = this.f;
            if (obj instanceof C) {
                ((C) obj).o(this.e, null, aVar.b());
                return;
            }
            Z z = obj instanceof Z ? (Z) obj : null;
            if (z != null) {
                z.d();
            }
        }
    }

    private final a<R>.C0227a h(Object obj) {
        List<a<R>.C0227a> list = this.c0;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C0227a) next).a == obj) {
                obj2 = next;
                break;
            }
        }
        a<R>.C0227a c0227a = (C0227a) obj2;
        if (c0227a != null) {
            return c0227a;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    private final int l(Object obj, Object obj2) {
        boolean h;
        F f;
        F f2;
        F f3;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g0;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof InterfaceC0945l) {
                a<R>.C0227a h2 = h(obj);
                if (h2 == null) {
                    continue;
                } else {
                    l<Throwable, t> a = h2.a(this, obj2);
                    if (ax.D.b.a(atomicReferenceFieldUpdater, this, obj3, h2)) {
                        this.f0 = obj2;
                        h = c.h((InterfaceC0945l) obj3, a);
                        if (h) {
                            return 0;
                        }
                        this.f0 = null;
                        return 2;
                    }
                }
            } else {
                f = c.c;
                if (ax.Gb.l.a(obj3, f) ? true : obj3 instanceof C0227a) {
                    return 3;
                }
                f2 = c.d;
                if (ax.Gb.l.a(obj3, f2)) {
                    return 2;
                }
                f3 = c.b;
                if (ax.Gb.l.a(obj3, f3)) {
                    if (ax.D.b.a(atomicReferenceFieldUpdater, this, obj3, C3139o.d(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    if (ax.D.b.a(atomicReferenceFieldUpdater, this, obj3, C3139o.P((Collection) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    @Override // ax.Qb.R0
    public void a(C<?> c, int i) {
        this.d0 = c;
        this.e0 = i;
    }

    @Override // ax.Yb.b
    public i b() {
        return this.q;
    }

    @Override // ax.Yb.b
    public boolean d(Object obj, Object obj2) {
        return l(obj, obj2) == 0;
    }

    @Override // ax.Yb.b
    public void e(Object obj) {
        this.f0 = obj;
    }

    @Override // ax.Qb.AbstractC0943k
    public void f(Throwable th) {
        Object obj;
        F f;
        F f2;
        F f3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g0;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            f = c.c;
            if (obj == f) {
                return;
            } else {
                f2 = c.d;
            }
        } while (!ax.D.b.a(atomicReferenceFieldUpdater, this, obj, f2));
        List<a<R>.C0227a> list = this.c0;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((C0227a) it.next()).b();
        }
        f3 = c.e;
        this.f0 = f3;
        this.c0 = null;
    }

    @Override // ax.Fb.l
    public /* bridge */ /* synthetic */ t invoke(Throwable th) {
        f(th);
        return t.a;
    }

    public final d k(Object obj, Object obj2) {
        d a;
        a = c.a(l(obj, obj2));
        return a;
    }
}
