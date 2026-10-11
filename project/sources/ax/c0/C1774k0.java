package ax.c0;

import android.view.View;

/* renamed from: ax.c0.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1774k0 {

    @ax.yb.f(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {409, 411}, m = "invokeSuspend")
    /* renamed from: ax.c0.k0$a */
    static final class a extends ax.yb.k implements ax.Fb.p<ax.Nb.g<? super View>, ax.wb.e<? super ax.sb.t>, Object> {
        int d0;
        private /* synthetic */ Object e0;
        final /* synthetic */ View f0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, ax.wb.e<? super a> eVar) {
            super(2, eVar);
            this.f0 = view;
        }

        @Override // ax.yb.AbstractC3520a
        public final ax.wb.e<ax.sb.t> a(Object obj, ax.wb.e<?> eVar) {
            a aVar = new a(this.f0, eVar);
            aVar.e0 = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
        
            if (r1.e(r5, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        
            if (r1.c(r5, r4) == r0) goto L17;
         */
        @Override // ax.yb.AbstractC3520a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object p(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = ax.xb.C3479b.c()
                int r1 = r4.d0
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                ax.sb.C3083o.b(r5)
                goto L4f
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.e0
                ax.Nb.g r1 = (ax.Nb.g) r1
                ax.sb.C3083o.b(r5)
                goto L37
            L22:
                ax.sb.C3083o.b(r5)
                java.lang.Object r5 = r4.e0
                r1 = r5
                ax.Nb.g r1 = (ax.Nb.g) r1
                android.view.View r5 = r4.f0
                r4.e0 = r1
                r4.d0 = r3
                java.lang.Object r5 = r1.c(r5, r4)
                if (r5 != r0) goto L37
                goto L4e
            L37:
                android.view.View r5 = r4.f0
                boolean r3 = r5 instanceof android.view.ViewGroup
                if (r3 == 0) goto L4f
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                ax.Nb.e r5 = ax.c0.C1772j0.b(r5)
                r3 = 0
                r4.e0 = r3
                r4.d0 = r2
                java.lang.Object r5 = r1.e(r5, r4)
                if (r5 != r0) goto L4f
            L4e:
                return r0
            L4f:
                ax.sb.t r5 = ax.sb.t.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.c0.C1774k0.a.p(java.lang.Object):java.lang.Object");
        }

        @Override // ax.Fb.p
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public final Object j(ax.Nb.g<? super View> gVar, ax.wb.e<? super ax.sb.t> eVar) {
            return ((a) a(gVar, eVar)).p(ax.sb.t.a);
        }
    }

    public static final ax.Nb.e<View> a(View view) {
        return ax.Nb.h.b(new a(view, null));
    }
}
