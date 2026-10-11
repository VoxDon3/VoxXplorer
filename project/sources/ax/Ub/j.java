package ax.Ub;

import ax.Fb.q;
import ax.Gb.l;
import ax.Gb.z;
import ax.sb.t;

/* loaded from: classes3.dex */
public final class j {
    private static final q<ax.Tb.c<Object>, Object, ax.wb.e<? super t>, Object> a;

    /* synthetic */ class a extends ax.Gb.j implements q<ax.Tb.c<? super Object>, Object, ax.wb.e<? super t>, Object> {
        public static final a k0 = new a();

        a() {
            super(3, ax.Tb.c.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // ax.Fb.q
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public final Object c(ax.Tb.c<Object> cVar, Object obj, ax.wb.e<? super t> eVar) {
            return cVar.e(obj, eVar);
        }
    }

    static {
        a aVar = a.k0;
        l.d(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        a = (q) z.c(aVar, 3);
    }
}
