package ax.Tb;

import ax.Gb.v;
import ax.Qb.InterfaceC0959s0;
import ax.sb.t;
import ax.yb.AbstractC3523d;

/* loaded from: classes3.dex */
final /* synthetic */ class h {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements ax.Tb.b<T> {
        final /* synthetic */ ax.Fb.q c0;
        final /* synthetic */ ax.Tb.b q;

        @ax.yb.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {114, 115}, m = "collect")
        /* renamed from: ax.Tb.h$a$a, reason: collision with other inner class name */
        public static final class C0199a extends AbstractC3523d {
            /* synthetic */ Object e0;
            int f0;
            Object h0;
            Object i0;

            public C0199a(ax.wb.e eVar) {
                super(eVar);
            }

            @Override // ax.yb.AbstractC3520a
            public final Object p(Object obj) {
                this.e0 = obj;
                this.f0 |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(ax.Tb.b bVar, ax.Fb.q qVar) {
            this.q = bVar;
            this.c0 = qVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
        
            if (r6 == r1) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // ax.Tb.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(ax.Tb.c<? super T> r6, ax.wb.e<? super ax.sb.t> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof ax.Tb.h.a.C0199a
                if (r0 == 0) goto L13
                r0 = r7
                ax.Tb.h$a$a r0 = (ax.Tb.h.a.C0199a) r0
                int r1 = r0.f0
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f0 = r1
                goto L18
            L13:
                ax.Tb.h$a$a r0 = new ax.Tb.h$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.e0
                java.lang.Object r1 = ax.xb.C3479b.c()
                int r2 = r0.f0
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                ax.sb.C3083o.b(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.i0
                ax.Tb.c r6 = (ax.Tb.c) r6
                java.lang.Object r2 = r0.h0
                ax.Tb.h$a r2 = (ax.Tb.h.a) r2
                ax.sb.C3083o.b(r7)
                goto L53
            L40:
                ax.sb.C3083o.b(r7)
                ax.Tb.b r7 = r5.q
                r0.h0 = r5
                r0.i0 = r6
                r0.f0 = r4
                java.lang.Object r7 = ax.Tb.d.b(r7, r6, r0)
                if (r7 != r1) goto L52
                goto L6e
            L52:
                r2 = r5
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                ax.Fb.q r2 = r2.c0
                r4 = 0
                r0.h0 = r4
                r0.i0 = r4
                r0.f0 = r3
                r3 = 6
                ax.Gb.k.c(r3)
                java.lang.Object r6 = r2.c(r6, r7, r0)
                r7 = 7
                ax.Gb.k.c(r7)
                if (r6 != r1) goto L6f
            L6e:
                return r1
            L6f:
                ax.sb.t r6 = ax.sb.t.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.Tb.h.a.a(ax.Tb.c, ax.wb.e):java.lang.Object");
        }
    }

    @ax.yb.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {156}, m = "catchImpl")
    static final class b<T> extends AbstractC3523d {
        Object e0;
        /* synthetic */ Object f0;
        int g0;

        b(ax.wb.e<? super b> eVar) {
            super(eVar);
        }

        @Override // ax.yb.AbstractC3520a
        public final Object p(Object obj) {
            this.f0 = obj;
            this.g0 |= Integer.MIN_VALUE;
            return d.b(null, null, this);
        }
    }

    static final class c<T> implements ax.Tb.c {
        final /* synthetic */ v<Throwable> c0;
        final /* synthetic */ ax.Tb.c<T> q;

        @ax.yb.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {158}, m = "emit")
        static final class a extends AbstractC3523d {
            Object e0;
            /* synthetic */ Object f0;
            final /* synthetic */ c<T> g0;
            int h0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(c<? super T> cVar, ax.wb.e<? super a> eVar) {
                super(eVar);
                this.g0 = cVar;
            }

            @Override // ax.yb.AbstractC3520a
            public final Object p(Object obj) {
                this.f0 = obj;
                this.h0 |= Integer.MIN_VALUE;
                return this.g0.e(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(ax.Tb.c<? super T> cVar, v<Throwable> vVar) {
            this.q = cVar;
            this.c0 = vVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // ax.Tb.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object e(T r5, ax.wb.e<? super ax.sb.t> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof ax.Tb.h.c.a
                if (r0 == 0) goto L13
                r0 = r6
                ax.Tb.h$c$a r0 = (ax.Tb.h.c.a) r0
                int r1 = r0.h0
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.h0 = r1
                goto L18
            L13:
                ax.Tb.h$c$a r0 = new ax.Tb.h$c$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f0
                java.lang.Object r1 = ax.xb.C3479b.c()
                int r2 = r0.h0
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.e0
                ax.Tb.h$c r5 = (ax.Tb.h.c) r5
                ax.sb.C3083o.b(r6)     // Catch: java.lang.Throwable -> L2d
                goto L47
            L2d:
                r6 = move-exception
                goto L4c
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                ax.sb.C3083o.b(r6)
                ax.Tb.c<T> r6 = r4.q     // Catch: java.lang.Throwable -> L4a
                r0.e0 = r4     // Catch: java.lang.Throwable -> L4a
                r0.h0 = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.e(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                ax.sb.t r5 = ax.sb.t.a
                return r5
            L4a:
                r6 = move-exception
                r5 = r4
            L4c:
                ax.Gb.v<java.lang.Throwable> r5 = r5.c0
                r5.q = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.Tb.h.c.e(java.lang.Object, ax.wb.e):java.lang.Object");
        }
    }

    public static final <T> ax.Tb.b<T> a(ax.Tb.b<? extends T> bVar, ax.Fb.q<? super ax.Tb.c<? super T>, ? super Throwable, ? super ax.wb.e<? super t>, ? extends Object> qVar) {
        return new a(bVar, qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(ax.Tb.b<? extends T> r4, ax.Tb.c<? super T> r5, ax.wb.e<? super java.lang.Throwable> r6) {
        /*
            boolean r0 = r6 instanceof ax.Tb.h.b
            if (r0 == 0) goto L13
            r0 = r6
            ax.Tb.h$b r0 = (ax.Tb.h.b) r0
            int r1 = r0.g0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g0 = r1
            goto L18
        L13:
            ax.Tb.h$b r0 = new ax.Tb.h$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f0
            java.lang.Object r1 = ax.xb.C3479b.c()
            int r2 = r0.g0
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.e0
            ax.Gb.v r4 = (ax.Gb.v) r4
            ax.sb.C3083o.b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            ax.sb.C3083o.b(r6)
            ax.Gb.v r6 = new ax.Gb.v
            r6.<init>()
            ax.Tb.h$c r2 = new ax.Tb.h$c     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.e0 = r6     // Catch: java.lang.Throwable -> L51
            r0.g0 = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            T r4 = r4.q
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L76
            ax.wb.i r6 = r0.b()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            ax.sb.C3069a.a(r4, r5)
            throw r4
        L72:
            ax.sb.C3069a.a(r5, r4)
            throw r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Tb.h.b(ax.Tb.b, ax.Tb.c, ax.wb.e):java.lang.Object");
    }

    private static final boolean c(Throwable th, ax.wb.i iVar) {
        InterfaceC0959s0 interfaceC0959s0 = (InterfaceC0959s0) iVar.a(InterfaceC0959s0.c);
        if (interfaceC0959s0 == null || !interfaceC0959s0.isCancelled()) {
            return false;
        }
        return d(th, interfaceC0959s0.o());
    }

    private static final boolean d(Throwable th, Throwable th2) {
        return th2 != null && ax.Gb.l.a(th2, th);
    }
}
