package androidx.lifecycle;

import androidx.lifecycle.d;
import ax.Gb.v;
import ax.Qb.C0939i;
import ax.Qb.InterfaceC0945l;
import ax.Qb.InterfaceC0959s0;
import ax.Qb.J;
import ax.sb.C3082n;
import ax.sb.C3083o;
import ax.sb.t;
import ax.xb.C3479b;

/* loaded from: classes.dex */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements f {
    final /* synthetic */ v<InterfaceC0959s0> c0;
    final /* synthetic */ J d0;
    final /* synthetic */ d.a e0;
    final /* synthetic */ InterfaceC0945l<t> f0;
    final /* synthetic */ ax.Zb.a g0;
    final /* synthetic */ ax.Fb.p<J, ax.wb.e<? super t>, Object> h0;
    final /* synthetic */ d.a q;

    @ax.yb.f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {171, ax.L.c.d3}, m = "invokeSuspend")
    static final class a extends ax.yb.l implements ax.Fb.p<J, ax.wb.e<? super t>, Object> {
        Object f0;
        Object g0;
        int h0;
        final /* synthetic */ ax.Zb.a i0;
        final /* synthetic */ ax.Fb.p<J, ax.wb.e<? super t>, Object> j0;

        @ax.yb.f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {111}, m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a$a, reason: collision with other inner class name */
        static final class C0019a extends ax.yb.l implements ax.Fb.p<J, ax.wb.e<? super t>, Object> {
            int f0;
            private /* synthetic */ Object g0;
            final /* synthetic */ ax.Fb.p<J, ax.wb.e<? super t>, Object> h0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0019a(ax.Fb.p<? super J, ? super ax.wb.e<? super t>, ? extends Object> pVar, ax.wb.e<? super C0019a> eVar) {
                super(2, eVar);
                this.h0 = pVar;
            }

            @Override // ax.yb.AbstractC3520a
            public final ax.wb.e<t> a(Object obj, ax.wb.e<?> eVar) {
                C0019a c0019a = new C0019a(this.h0, eVar);
                c0019a.g0 = obj;
                return c0019a;
            }

            @Override // ax.yb.AbstractC3520a
            public final Object p(Object obj) {
                Object c = C3479b.c();
                int i = this.f0;
                if (i == 0) {
                    C3083o.b(obj);
                    J j = (J) this.g0;
                    ax.Fb.p<J, ax.wb.e<? super t>, Object> pVar = this.h0;
                    this.f0 = 1;
                    if (pVar.j(j, this) == c) {
                        return c;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C3083o.b(obj);
                }
                return t.a;
            }

            @Override // ax.Fb.p
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object j(J j, ax.wb.e<? super t> eVar) {
                return ((C0019a) a(j, eVar)).p(t.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ax.Zb.a aVar, ax.Fb.p<? super J, ? super ax.wb.e<? super t>, ? extends Object> pVar, ax.wb.e<? super a> eVar) {
            super(2, eVar);
            this.i0 = aVar;
            this.j0 = pVar;
        }

        @Override // ax.yb.AbstractC3520a
        public final ax.wb.e<t> a(Object obj, ax.wb.e<?> eVar) {
            return new a(this.i0, this.j0, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
        
            if (r7.a(null, r6) == r0) goto L19;
         */
        @Override // ax.yb.AbstractC3520a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object p(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = ax.xb.C3479b.c()
                int r1 = r6.h0
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L2e
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r0 = r6.f0
                ax.Zb.a r0 = (ax.Zb.a) r0
                ax.sb.C3083o.b(r7)     // Catch: java.lang.Throwable -> L17
                goto L55
            L17:
                r7 = move-exception
                goto L61
            L19:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L21:
                java.lang.Object r1 = r6.g0
                ax.Fb.p r1 = (ax.Fb.p) r1
                java.lang.Object r3 = r6.f0
                ax.Zb.a r3 = (ax.Zb.a) r3
                ax.sb.C3083o.b(r7)
                r7 = r3
                goto L42
            L2e:
                ax.sb.C3083o.b(r7)
                ax.Zb.a r7 = r6.i0
                ax.Fb.p<ax.Qb.J, ax.wb.e<? super ax.sb.t>, java.lang.Object> r1 = r6.j0
                r6.f0 = r7
                r6.g0 = r1
                r6.h0 = r3
                java.lang.Object r3 = r7.a(r4, r6)
                if (r3 != r0) goto L42
                goto L53
            L42:
                androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a$a r3 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a$a     // Catch: java.lang.Throwable -> L5d
                r3.<init>(r1, r4)     // Catch: java.lang.Throwable -> L5d
                r6.f0 = r7     // Catch: java.lang.Throwable -> L5d
                r6.g0 = r4     // Catch: java.lang.Throwable -> L5d
                r6.h0 = r2     // Catch: java.lang.Throwable -> L5d
                java.lang.Object r1 = ax.Qb.K.b(r3, r6)     // Catch: java.lang.Throwable -> L5d
                if (r1 != r0) goto L54
            L53:
                return r0
            L54:
                r0 = r7
            L55:
                ax.sb.t r7 = ax.sb.t.a     // Catch: java.lang.Throwable -> L17
                r0.c(r4)
                ax.sb.t r7 = ax.sb.t.a
                return r7
            L5d:
                r0 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
            L61:
                r0.c(r4)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1.a.p(java.lang.Object):java.lang.Object");
        }

        @Override // ax.Fb.p
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(J j, ax.wb.e<? super t> eVar) {
            return ((a) a(j, eVar)).p(t.a);
        }
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [T, ax.Qb.s0] */
    @Override // androidx.lifecycle.f
    public final void b(ax.G0.h hVar, d.a aVar) {
        ?? d;
        ax.Gb.l.f(hVar, "<anonymous parameter 0>");
        ax.Gb.l.f(aVar, "event");
        if (aVar == this.q) {
            v<InterfaceC0959s0> vVar = this.c0;
            d = C0939i.d(this.d0, null, null, new a(this.g0, this.h0, null), 3, null);
            vVar.q = d;
            return;
        }
        if (aVar == this.e0) {
            InterfaceC0959s0 interfaceC0959s0 = this.c0.q;
            if (interfaceC0959s0 != null) {
                InterfaceC0959s0.a.a(interfaceC0959s0, null, 1, null);
            }
            this.c0.q = null;
        }
        if (aVar == d.a.ON_DESTROY) {
            InterfaceC0945l<t> interfaceC0945l = this.f0;
            C3082n.a aVar2 = C3082n.q;
            interfaceC0945l.f(C3082n.a(t.a));
        }
    }
}
