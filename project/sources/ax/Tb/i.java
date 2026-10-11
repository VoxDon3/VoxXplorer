package ax.Tb;

import ax.sb.t;
import ax.xb.C3479b;
import ax.yb.AbstractC3523d;

/* loaded from: classes3.dex */
final /* synthetic */ class i {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements ax.Tb.b<T> {
        final /* synthetic */ ax.Fb.p c0;
        final /* synthetic */ ax.Tb.b q;

        public a(ax.Tb.b bVar, ax.Fb.p pVar) {
            this.q = bVar;
            this.c0 = pVar;
        }

        @Override // ax.Tb.b
        public Object a(c<? super T> cVar, ax.wb.e<? super t> eVar) {
            Object a = this.q.a(new b(new ax.Gb.t(), cVar, this.c0), eVar);
            return a == C3479b.c() ? a : t.a;
        }
    }

    static final class b<T> implements c {
        final /* synthetic */ c<T> c0;
        final /* synthetic */ ax.Fb.p<T, ax.wb.e<? super Boolean>, Object> d0;
        final /* synthetic */ ax.Gb.t q;

        @ax.yb.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {37, 38, 40}, m = "emit")
        static final class a extends AbstractC3523d {
            Object e0;
            Object f0;
            /* synthetic */ Object g0;
            final /* synthetic */ b<T> h0;
            int i0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(b<? super T> bVar, ax.wb.e<? super a> eVar) {
                super(eVar);
                this.h0 = bVar;
            }

            @Override // ax.yb.AbstractC3520a
            public final Object p(Object obj) {
                this.g0 = obj;
                this.i0 |= Integer.MIN_VALUE;
                return this.h0.e(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(ax.Gb.t tVar, c<? super T> cVar, ax.Fb.p<? super T, ? super ax.wb.e<? super Boolean>, ? extends Object> pVar) {
            this.q = tVar;
            this.c0 = cVar;
            this.d0 = pVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
        
            if (r8.e(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
        
            if (r8.e(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // ax.Tb.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object e(T r7, ax.wb.e<? super ax.sb.t> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof ax.Tb.i.b.a
                if (r0 == 0) goto L13
                r0 = r8
                ax.Tb.i$b$a r0 = (ax.Tb.i.b.a) r0
                int r1 = r0.i0
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.i0 = r1
                goto L18
            L13:
                ax.Tb.i$b$a r0 = new ax.Tb.i$b$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.g0
                java.lang.Object r1 = ax.xb.C3479b.c()
                int r2 = r0.i0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                ax.sb.C3083o.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f0
                java.lang.Object r2 = r0.e0
                ax.Tb.i$b r2 = (ax.Tb.i.b) r2
                ax.sb.C3083o.b(r8)
                goto L6c
            L41:
                ax.sb.C3083o.b(r8)
                goto L59
            L45:
                ax.sb.C3083o.b(r8)
                ax.Gb.t r8 = r6.q
                boolean r8 = r8.q
                if (r8 == 0) goto L5c
                ax.Tb.c<T> r8 = r6.c0
                r0.i0 = r5
                java.lang.Object r7 = r8.e(r7, r0)
                if (r7 != r1) goto L59
                goto L87
            L59:
                ax.sb.t r7 = ax.sb.t.a
                return r7
            L5c:
                ax.Fb.p<T, ax.wb.e<? super java.lang.Boolean>, java.lang.Object> r8 = r6.d0
                r0.e0 = r6
                r0.f0 = r7
                r0.i0 = r4
                java.lang.Object r8 = r8.j(r7, r0)
                if (r8 != r1) goto L6b
                goto L87
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                ax.Gb.t r8 = r2.q
                r8.q = r5
                ax.Tb.c<T> r8 = r2.c0
                r2 = 0
                r0.e0 = r2
                r0.f0 = r2
                r0.i0 = r3
                java.lang.Object r7 = r8.e(r7, r0)
                if (r7 != r1) goto L88
            L87:
                return r1
            L88:
                ax.sb.t r7 = ax.sb.t.a
                return r7
            L8b:
                ax.sb.t r7 = ax.sb.t.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.Tb.i.b.e(java.lang.Object, ax.wb.e):java.lang.Object");
        }
    }

    public static final <T> ax.Tb.b<T> a(ax.Tb.b<? extends T> bVar, ax.Fb.p<? super T, ? super ax.wb.e<? super Boolean>, ? extends Object> pVar) {
        return new a(bVar, pVar);
    }
}
