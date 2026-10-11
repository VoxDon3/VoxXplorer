package ax.xb;

import ax.Fb.p;
import ax.Gb.l;
import ax.Gb.z;
import ax.sb.C3083o;
import ax.sb.t;
import ax.wb.e;
import ax.wb.i;
import ax.yb.AbstractC3520a;
import ax.yb.AbstractC3523d;
import ax.yb.h;
import ax.yb.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ax.xb.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3480c {

    /* renamed from: ax.xb.c$a */
    public static final class a extends j {
        private int c0;
        final /* synthetic */ p d0;
        final /* synthetic */ Object e0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, p pVar, Object obj) {
            super(eVar);
            this.d0 = pVar;
            this.e0 = obj;
            l.d(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // ax.yb.AbstractC3520a
        protected Object p(Object obj) {
            int i = this.c0;
            if (i == 0) {
                this.c0 = 1;
                C3083o.b(obj);
                l.d(this.d0, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((p) z.c(this.d0, 2)).j(this.e0, this);
            }
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.c0 = 2;
            C3083o.b(obj);
            return obj;
        }
    }

    /* renamed from: ax.xb.c$b */
    public static final class b extends AbstractC3523d {
        private int e0;
        final /* synthetic */ p f0;
        final /* synthetic */ Object g0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, i iVar, p pVar, Object obj) {
            super(eVar, iVar);
            this.f0 = pVar;
            this.g0 = obj;
            l.d(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // ax.yb.AbstractC3520a
        protected Object p(Object obj) {
            int i = this.e0;
            if (i == 0) {
                this.e0 = 1;
                C3083o.b(obj);
                l.d(this.f0, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((p) z.c(this.f0, 2)).j(this.g0, this);
            }
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.e0 = 2;
            C3083o.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, T> e<t> a(p<? super R, ? super e<? super T>, ? extends Object> pVar, R r, e<? super T> eVar) {
        l.f(pVar, "<this>");
        l.f(eVar, "completion");
        e<?> a2 = h.a(eVar);
        if (pVar instanceof AbstractC3520a) {
            return ((AbstractC3520a) pVar).a(r, a2);
        }
        i b2 = a2.b();
        return b2 == ax.wb.j.q ? new a(a2, pVar, r) : new b(a2, b2, pVar, r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> e<T> b(e<? super T> eVar) {
        e<T> eVar2;
        l.f(eVar, "<this>");
        AbstractC3523d abstractC3523d = eVar instanceof AbstractC3523d ? (AbstractC3523d) eVar : null;
        return (abstractC3523d == null || (eVar2 = (e<T>) abstractC3523d.t()) == null) ? eVar : eVar2;
    }
}
