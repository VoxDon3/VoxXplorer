package ax.Tb;

import ax.sb.t;
import ax.yb.AbstractC3523d;

/* loaded from: classes3.dex */
public final class p<T> implements c<T> {
    private final ax.Fb.p<c<? super T>, ax.wb.e<? super t>, Object> c0;
    private final c<T> q;

    @ax.yb.f(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {419, 423}, m = "onSubscription")
    static final class a extends AbstractC3523d {
        Object e0;
        Object f0;
        /* synthetic */ Object g0;
        final /* synthetic */ p<T> h0;
        int i0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p<T> pVar, ax.wb.e<? super a> eVar) {
            super(eVar);
            this.h0 = pVar;
        }

        @Override // ax.yb.AbstractC3520a
        public final Object p(Object obj) {
            this.g0 = obj;
            this.i0 |= Integer.MIN_VALUE;
            return this.h0.a(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        if (((ax.Tb.p) r7).a(r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [ax.Ub.i] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ax.wb.e<? super ax.sb.t> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ax.Tb.p.a
            if (r0 == 0) goto L13
            r0 = r7
            ax.Tb.p$a r0 = (ax.Tb.p.a) r0
            int r1 = r0.i0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i0 = r1
            goto L18
        L13:
            ax.Tb.p$a r0 = new ax.Tb.p$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.g0
            java.lang.Object r1 = ax.xb.C3479b.c()
            int r2 = r0.i0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            ax.sb.C3083o.b(r7)
            goto L79
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f0
            ax.Ub.i r2 = (ax.Ub.i) r2
            java.lang.Object r4 = r0.e0
            ax.Tb.p r4 = (ax.Tb.p) r4
            ax.sb.C3083o.b(r7)     // Catch: java.lang.Throwable -> L40
            goto L60
        L40:
            r7 = move-exception
            goto L7f
        L42:
            ax.sb.C3083o.b(r7)
            ax.Ub.i r2 = new ax.Ub.i
            ax.Tb.c<T> r7 = r6.q
            ax.wb.i r5 = r0.b()
            r2.<init>(r7, r5)
            ax.Fb.p<ax.Tb.c<? super T>, ax.wb.e<? super ax.sb.t>, java.lang.Object> r7 = r6.c0     // Catch: java.lang.Throwable -> L40
            r0.e0 = r6     // Catch: java.lang.Throwable -> L40
            r0.f0 = r2     // Catch: java.lang.Throwable -> L40
            r0.i0 = r4     // Catch: java.lang.Throwable -> L40
            java.lang.Object r7 = r7.j(r2, r0)     // Catch: java.lang.Throwable -> L40
            if (r7 != r1) goto L5f
            goto L78
        L5f:
            r4 = r6
        L60:
            r2.q()
            ax.Tb.c<T> r7 = r4.q
            boolean r2 = r7 instanceof ax.Tb.p
            if (r2 == 0) goto L7c
            ax.Tb.p r7 = (ax.Tb.p) r7
            r2 = 0
            r0.e0 = r2
            r0.f0 = r2
            r0.i0 = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L79
        L78:
            return r1
        L79:
            ax.sb.t r7 = ax.sb.t.a
            return r7
        L7c:
            ax.sb.t r7 = ax.sb.t.a
            return r7
        L7f:
            r2.q()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Tb.p.a(ax.wb.e):java.lang.Object");
    }

    @Override // ax.Tb.c
    public Object e(T t, ax.wb.e<? super t> eVar) {
        return this.q.e(t, eVar);
    }
}
