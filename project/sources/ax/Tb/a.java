package ax.Tb;

import ax.sb.t;
import ax.yb.AbstractC3523d;

/* loaded from: classes3.dex */
public abstract class a<T> implements b<T> {

    @ax.yb.f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {230}, m = "collect")
    /* renamed from: ax.Tb.a$a, reason: collision with other inner class name */
    static final class C0198a extends AbstractC3523d {
        Object e0;
        /* synthetic */ Object f0;
        final /* synthetic */ a<T> g0;
        int h0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0198a(a<T> aVar, ax.wb.e<? super C0198a> eVar) {
            super(eVar);
            this.g0 = aVar;
        }

        @Override // ax.yb.AbstractC3520a
        public final Object p(Object obj) {
            this.f0 = obj;
            this.h0 |= Integer.MIN_VALUE;
            return this.g0.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ax.Tb.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ax.Tb.c<? super T> r6, ax.wb.e<? super ax.sb.t> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ax.Tb.a.C0198a
            if (r0 == 0) goto L13
            r0 = r7
            ax.Tb.a$a r0 = (ax.Tb.a.C0198a) r0
            int r1 = r0.h0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h0 = r1
            goto L18
        L13:
            ax.Tb.a$a r0 = new ax.Tb.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f0
            java.lang.Object r1 = ax.xb.C3479b.c()
            int r2 = r0.h0
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.e0
            ax.Ub.i r6 = (ax.Ub.i) r6
            ax.sb.C3083o.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            ax.sb.C3083o.b(r7)
            ax.Ub.i r7 = new ax.Ub.i
            ax.wb.i r2 = r0.b()
            r7.<init>(r6, r2)
            r0.e0 = r7     // Catch: java.lang.Throwable -> L55
            r0.h0 = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.b(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.q()
            ax.sb.t r6 = ax.sb.t.a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.q()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Tb.a.a(ax.Tb.c, ax.wb.e):java.lang.Object");
    }

    public abstract Object b(c<? super T> cVar, ax.wb.e<? super t> eVar);
}
