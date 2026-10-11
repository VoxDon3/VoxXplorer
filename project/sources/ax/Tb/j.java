package ax.Tb;

import ax.Gb.v;
import ax.sb.t;
import ax.yb.AbstractC3523d;

/* loaded from: classes3.dex */
final /* synthetic */ class j {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements c<T> {
        final /* synthetic */ v q;

        public a(v vVar) {
            this.q = vVar;
        }

        @Override // ax.Tb.c
        public Object e(T t, ax.wb.e<? super t> eVar) {
            this.q.q = t;
            throw new ax.Ub.a(this);
        }
    }

    @ax.yb.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "first")
    static final class b<T> extends AbstractC3523d {
        Object e0;
        Object f0;
        /* synthetic */ Object g0;
        int h0;

        b(ax.wb.e<? super b> eVar) {
            super(eVar);
        }

        @Override // ax.yb.AbstractC3520a
        public final Object p(Object obj) {
            this.g0 = obj;
            this.h0 |= Integer.MIN_VALUE;
            return d.f(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object a(ax.Tb.b<? extends T> r4, ax.wb.e<? super T> r5) {
        /*
            boolean r0 = r5 instanceof ax.Tb.j.b
            if (r0 == 0) goto L13
            r0 = r5
            ax.Tb.j$b r0 = (ax.Tb.j.b) r0
            int r1 = r0.h0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h0 = r1
            goto L18
        L13:
            ax.Tb.j$b r0 = new ax.Tb.j$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.g0
            java.lang.Object r1 = ax.xb.C3479b.c()
            int r2 = r0.h0
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f0
            ax.Tb.j$a r4 = (ax.Tb.j.a) r4
            java.lang.Object r0 = r0.e0
            ax.Gb.v r0 = (ax.Gb.v) r0
            ax.sb.C3083o.b(r5)     // Catch: ax.Ub.a -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            ax.sb.C3083o.b(r5)
            ax.Gb.v r5 = new ax.Gb.v
            r5.<init>()
            ax.Vb.F r2 = ax.Ub.h.a
            r5.q = r2
            ax.Tb.j$a r2 = new ax.Tb.j$a
            r2.<init>(r5)
            r0.e0 = r5     // Catch: ax.Ub.a -> L5b
            r0.f0 = r2     // Catch: ax.Ub.a -> L5b
            r0.h0 = r3     // Catch: ax.Ub.a -> L5b
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: ax.Ub.a -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            ax.Ub.f.a(r5, r4)
        L62:
            T r4 = r0.q
            ax.Vb.F r5 = ax.Ub.h.a
            if (r4 == r5) goto L69
            return r4
        L69:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Tb.j.a(ax.Tb.b, ax.wb.e):java.lang.Object");
    }
}
