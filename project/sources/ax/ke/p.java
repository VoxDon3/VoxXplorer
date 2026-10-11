package ax.ke;

import ax.Qb.C0947m;
import ax.Qb.InterfaceC0945l;
import ax.sb.C3073e;
import ax.sb.C3082n;
import ax.sb.C3083o;
import ax.xb.C3479b;
import ax.yb.AbstractC3523d;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class p {

    static final class a extends ax.Gb.m implements ax.Fb.l<Throwable, ax.sb.t> {
        final /* synthetic */ InterfaceC2430b q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC2430b interfaceC2430b) {
            super(1);
            this.q = interfaceC2430b;
        }

        public final void a(Throwable th) {
            this.q.cancel();
        }

        @Override // ax.Fb.l
        public /* bridge */ /* synthetic */ ax.sb.t invoke(Throwable th) {
            a(th);
            return ax.sb.t.a;
        }
    }

    static final class b extends ax.Gb.m implements ax.Fb.l<Throwable, ax.sb.t> {
        final /* synthetic */ InterfaceC2430b q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC2430b interfaceC2430b) {
            super(1);
            this.q = interfaceC2430b;
        }

        public final void a(Throwable th) {
            this.q.cancel();
        }

        @Override // ax.Fb.l
        public /* bridge */ /* synthetic */ ax.sb.t invoke(Throwable th) {
            a(th);
            return ax.sb.t.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class c<T> implements InterfaceC2432d<T> {
        final /* synthetic */ InterfaceC0945l a;

        c(InterfaceC0945l interfaceC0945l) {
            this.a = interfaceC0945l;
        }

        @Override // ax.ke.InterfaceC2432d
        public void a(InterfaceC2430b<T> interfaceC2430b, D<T> d) {
            ax.Gb.l.g(interfaceC2430b, "call");
            ax.Gb.l.g(d, "response");
            if (!d.e()) {
                InterfaceC0945l interfaceC0945l = this.a;
                m mVar = new m(d);
                C3082n.a aVar = C3082n.q;
                interfaceC0945l.f(C3082n.a(C3083o.a(mVar)));
                return;
            }
            T a = d.a();
            if (a != null) {
                this.a.f(C3082n.a(a));
                return;
            }
            Object tag = interfaceC2430b.request().tag(o.class);
            if (tag == null) {
                ax.Gb.l.p();
            }
            ax.Gb.l.b(tag, "call.request().tag(Invocation::class.java)!!");
            Method a2 = ((o) tag).a();
            StringBuilder sb = new StringBuilder();
            sb.append("Response from ");
            ax.Gb.l.b(a2, "method");
            Class<?> declaringClass = a2.getDeclaringClass();
            ax.Gb.l.b(declaringClass, "method.declaringClass");
            sb.append(declaringClass.getName());
            sb.append('.');
            sb.append(a2.getName());
            sb.append(" was null but response body type was declared as non-null");
            C3073e c3073e = new C3073e(sb.toString());
            InterfaceC0945l interfaceC0945l2 = this.a;
            C3082n.a aVar2 = C3082n.q;
            interfaceC0945l2.f(C3082n.a(C3083o.a(c3073e)));
        }

        @Override // ax.ke.InterfaceC2432d
        public void b(InterfaceC2430b<T> interfaceC2430b, Throwable th) {
            ax.Gb.l.g(interfaceC2430b, "call");
            ax.Gb.l.g(th, "t");
            InterfaceC0945l interfaceC0945l = this.a;
            C3082n.a aVar = C3082n.q;
            interfaceC0945l.f(C3082n.a(C3083o.a(th)));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class d<T> implements InterfaceC2432d<T> {
        final /* synthetic */ InterfaceC0945l a;

        d(InterfaceC0945l interfaceC0945l) {
            this.a = interfaceC0945l;
        }

        @Override // ax.ke.InterfaceC2432d
        public void a(InterfaceC2430b<T> interfaceC2430b, D<T> d) {
            ax.Gb.l.g(interfaceC2430b, "call");
            ax.Gb.l.g(d, "response");
            if (d.e()) {
                this.a.f(C3082n.a(d.a()));
                return;
            }
            InterfaceC0945l interfaceC0945l = this.a;
            m mVar = new m(d);
            C3082n.a aVar = C3082n.q;
            interfaceC0945l.f(C3082n.a(C3083o.a(mVar)));
        }

        @Override // ax.ke.InterfaceC2432d
        public void b(InterfaceC2430b<T> interfaceC2430b, Throwable th) {
            ax.Gb.l.g(interfaceC2430b, "call");
            ax.Gb.l.g(th, "t");
            InterfaceC0945l interfaceC0945l = this.a;
            C3082n.a aVar = C3082n.q;
            interfaceC0945l.f(C3082n.a(C3083o.a(th)));
        }
    }

    static final class e extends ax.Gb.m implements ax.Fb.l<Throwable, ax.sb.t> {
        final /* synthetic */ InterfaceC2430b q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC2430b interfaceC2430b) {
            super(1);
            this.q = interfaceC2430b;
        }

        public final void a(Throwable th) {
            this.q.cancel();
        }

        @Override // ax.Fb.l
        public /* bridge */ /* synthetic */ ax.sb.t invoke(Throwable th) {
            a(th);
            return ax.sb.t.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class f<T> implements InterfaceC2432d<T> {
        final /* synthetic */ InterfaceC0945l a;

        f(InterfaceC0945l interfaceC0945l) {
            this.a = interfaceC0945l;
        }

        @Override // ax.ke.InterfaceC2432d
        public void a(InterfaceC2430b<T> interfaceC2430b, D<T> d) {
            ax.Gb.l.g(interfaceC2430b, "call");
            ax.Gb.l.g(d, "response");
            this.a.f(C3082n.a(d));
        }

        @Override // ax.ke.InterfaceC2432d
        public void b(InterfaceC2430b<T> interfaceC2430b, Throwable th) {
            ax.Gb.l.g(interfaceC2430b, "call");
            ax.Gb.l.g(th, "t");
            InterfaceC0945l interfaceC0945l = this.a;
            C3082n.a aVar = C3082n.q;
            interfaceC0945l.f(C3082n.a(C3083o.a(th)));
        }
    }

    static final class g implements Runnable {
        final /* synthetic */ Exception c0;
        final /* synthetic */ ax.wb.e q;

        g(ax.wb.e eVar, Exception exc) {
            this.q = eVar;
            this.c0 = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ax.wb.e b = C3479b.b(this.q);
            Exception exc = this.c0;
            C3082n.a aVar = C3082n.q;
            b.f(C3082n.a(C3083o.a(exc)));
        }
    }

    @ax.yb.f(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {113}, m = "suspendAndThrow")
    static final class h extends AbstractC3523d {
        /* synthetic */ Object e0;
        int f0;
        Object g0;

        h(ax.wb.e eVar) {
            super(eVar);
        }

        @Override // ax.yb.AbstractC3520a
        public final Object p(Object obj) {
            this.e0 = obj;
            this.f0 |= Integer.MIN_VALUE;
            return p.d(null, this);
        }
    }

    public static final <T> Object a(InterfaceC2430b<T> interfaceC2430b, ax.wb.e<? super T> eVar) {
        C0947m c0947m = new C0947m(C3479b.b(eVar), 1);
        c0947m.r(new a(interfaceC2430b));
        interfaceC2430b.u(new c(c0947m));
        Object z = c0947m.z();
        if (z == C3479b.c()) {
            ax.yb.h.c(eVar);
        }
        return z;
    }

    public static final <T> Object b(InterfaceC2430b<T> interfaceC2430b, ax.wb.e<? super T> eVar) {
        C0947m c0947m = new C0947m(C3479b.b(eVar), 1);
        c0947m.r(new b(interfaceC2430b));
        interfaceC2430b.u(new d(c0947m));
        Object z = c0947m.z();
        if (z == C3479b.c()) {
            ax.yb.h.c(eVar);
        }
        return z;
    }

    public static final <T> Object c(InterfaceC2430b<T> interfaceC2430b, ax.wb.e<? super D<T>> eVar) {
        C0947m c0947m = new C0947m(C3479b.b(eVar), 1);
        c0947m.r(new e(interfaceC2430b));
        interfaceC2430b.u(new f(c0947m));
        Object z = c0947m.z();
        if (z == C3479b.c()) {
            ax.yb.h.c(eVar);
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(java.lang.Exception r4, ax.wb.e<?> r5) {
        /*
            boolean r0 = r5 instanceof ax.ke.p.h
            if (r0 == 0) goto L13
            r0 = r5
            ax.ke.p$h r0 = (ax.ke.p.h) r0
            int r1 = r0.f0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f0 = r1
            goto L18
        L13:
            ax.ke.p$h r0 = new ax.ke.p$h
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.e0
            java.lang.Object r1 = ax.xb.C3479b.c()
            int r2 = r0.f0
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.g0
            java.lang.Exception r4 = (java.lang.Exception) r4
            ax.sb.C3083o.b(r5)
            goto L5c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            ax.sb.C3083o.b(r5)
            r0.g0 = r4
            r0.f0 = r3
            ax.Qb.G r5 = ax.Qb.Y.a()
            ax.wb.i r2 = r0.b()
            ax.ke.p$g r3 = new ax.ke.p$g
            r3.<init>(r0, r4)
            r5.b(r2, r3)
            java.lang.Object r4 = ax.xb.C3479b.c()
            java.lang.Object r5 = ax.xb.C3479b.c()
            if (r4 != r5) goto L59
            ax.yb.h.c(r0)
        L59:
            if (r4 != r1) goto L5c
            return r1
        L5c:
            ax.sb.t r4 = ax.sb.t.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.ke.p.d(java.lang.Exception, ax.wb.e):java.lang.Object");
    }
}
