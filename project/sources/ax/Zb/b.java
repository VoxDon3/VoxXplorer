package ax.Zb;

import ax.Fb.l;
import ax.Fb.q;
import ax.Gb.m;
import ax.Qb.C0947m;
import ax.Qb.C0951o;
import ax.Qb.InterfaceC0945l;
import ax.Qb.N;
import ax.Qb.R0;
import ax.Vb.C;
import ax.Vb.F;
import ax.sb.t;
import ax.wb.i;
import ax.xb.C3479b;
import ax.yb.h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public class b extends d implements ax.Zb.a {
    private static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "owner");
    private final q<ax.Yb.b<?>, Object, Object, l<Throwable, t>> h;
    private volatile Object owner;

    private final class a implements InterfaceC0945l<t>, R0 {
        public final Object c0;
        public final C0947m<t> q;

        /* renamed from: ax.Zb.b$a$a, reason: collision with other inner class name */
        static final class C0237a extends m implements l<Throwable, t> {
            final /* synthetic */ a c0;
            final /* synthetic */ b q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0237a(b bVar, a aVar) {
                super(1);
                this.q = bVar;
                this.c0 = aVar;
            }

            public final void a(Throwable th) {
                this.q.c(this.c0.c0);
            }

            @Override // ax.Fb.l
            public /* bridge */ /* synthetic */ t invoke(Throwable th) {
                a(th);
                return t.a;
            }
        }

        /* renamed from: ax.Zb.b$a$b, reason: collision with other inner class name */
        static final class C0238b extends m implements l<Throwable, t> {
            final /* synthetic */ a c0;
            final /* synthetic */ b q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0238b(b bVar, a aVar) {
                super(1);
                this.q = bVar;
                this.c0 = aVar;
            }

            public final void a(Throwable th) {
                b.i.set(this.q, this.c0.c0);
                this.q.c(this.c0.c0);
            }

            @Override // ax.Fb.l
            public /* bridge */ /* synthetic */ t invoke(Throwable th) {
                a(th);
                return t.a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(C0947m<? super t> c0947m, Object obj) {
            this.q = c0947m;
            this.c0 = obj;
        }

        @Override // ax.Qb.R0
        public void a(C<?> c, int i) {
            this.q.a(c, i);
        }

        @Override // ax.wb.e
        public i b() {
            return this.q.b();
        }

        @Override // ax.Qb.InterfaceC0945l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void k(t tVar, l<? super Throwable, t> lVar) {
            b.i.set(b.this, this.c0);
            this.q.k(tVar, new C0237a(b.this, this));
        }

        @Override // ax.Qb.InterfaceC0945l
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Object l(t tVar, Object obj, l<? super Throwable, t> lVar) {
            Object l = this.q.l(tVar, obj, new C0238b(b.this, this));
            if (l != null) {
                b.i.set(b.this, this.c0);
            }
            return l;
        }

        @Override // ax.wb.e
        public void f(Object obj) {
            this.q.f(obj);
        }

        @Override // ax.Qb.InterfaceC0945l
        public boolean n(Throwable th) {
            return this.q.n(th);
        }

        @Override // ax.Qb.InterfaceC0945l
        public void r(l<? super Throwable, t> lVar) {
            this.q.r(lVar);
        }

        @Override // ax.Qb.InterfaceC0945l
        public void s(Object obj) {
            this.q.s(obj);
        }
    }

    /* renamed from: ax.Zb.b$b, reason: collision with other inner class name */
    static final class C0239b extends m implements q<ax.Yb.b<?>, Object, Object, l<? super Throwable, ? extends t>> {

        /* renamed from: ax.Zb.b$b$a */
        static final class a extends m implements l<Throwable, t> {
            final /* synthetic */ Object c0;
            final /* synthetic */ b q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, Object obj) {
                super(1);
                this.q = bVar;
                this.c0 = obj;
            }

            public final void a(Throwable th) {
                this.q.c(this.c0);
            }

            @Override // ax.Fb.l
            public /* bridge */ /* synthetic */ t invoke(Throwable th) {
                a(th);
                return t.a;
            }
        }

        C0239b() {
            super(3);
        }

        @Override // ax.Fb.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l<Throwable, t> c(ax.Yb.b<?> bVar, Object obj, Object obj2) {
            return new a(b.this, obj);
        }
    }

    public b(boolean z) {
        super(1, z ? 1 : 0);
        this.owner = z ? null : c.a;
        this.h = new C0239b();
    }

    private final int n(Object obj) {
        F f;
        while (b()) {
            Object obj2 = i.get(this);
            f = c.a;
            if (obj2 != f) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    static /* synthetic */ Object o(b bVar, Object obj, ax.wb.e<? super t> eVar) {
        if (bVar.q(obj)) {
            return t.a;
        }
        Object p = bVar.p(obj, eVar);
        return p == C3479b.c() ? p : t.a;
    }

    private final Object p(Object obj, ax.wb.e<? super t> eVar) {
        C0947m b = C0951o.b(C3479b.b(eVar));
        try {
            d(new a(b, obj));
            Object z = b.z();
            if (z == C3479b.c()) {
                h.c(eVar);
            }
            return z == C3479b.c() ? z : t.a;
        } catch (Throwable th) {
            b.L();
            throw th;
        }
    }

    private final int r(Object obj) {
        while (!j()) {
            if (obj == null) {
                return 1;
            }
            int n = n(obj);
            if (n == 1) {
                return 2;
            }
            if (n == 2) {
                return 1;
            }
        }
        i.set(this, obj);
        return 0;
    }

    @Override // ax.Zb.a
    public Object a(Object obj, ax.wb.e<? super t> eVar) {
        return o(this, obj, eVar);
    }

    @Override // ax.Zb.a
    public boolean b() {
        return h() == 0;
    }

    @Override // ax.Zb.a
    public void c(Object obj) {
        F f;
        F f2;
        while (b()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            f = c.a;
            if (obj2 != f) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                f2 = c.a;
                if (ax.D.b.a(atomicReferenceFieldUpdater, this, obj2, f2)) {
                    i();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public boolean q(Object obj) {
        int r = r(obj);
        if (r == 0) {
            return true;
        }
        if (r == 1) {
            return false;
        }
        if (r != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public String toString() {
        return "Mutex@" + N.b(this) + "[isLocked=" + b() + ",owner=" + i.get(this) + ']';
    }
}
