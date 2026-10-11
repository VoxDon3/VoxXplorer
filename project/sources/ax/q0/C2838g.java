package ax.q0;

import ax.Fb.p;
import ax.sb.C3083o;
import ax.sb.t;
import ax.xb.C3479b;
import ax.yb.l;

/* renamed from: ax.q0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2838g {

    @ax.yb.f(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {329}, m = "invokeSuspend")
    /* renamed from: ax.q0.g$a */
    static final class a extends l implements p<AbstractC2835d, ax.wb.e<? super AbstractC2835d>, Object> {
        int f0;
        /* synthetic */ Object g0;
        final /* synthetic */ p<C2832a, ax.wb.e<? super t>, Object> h0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super C2832a, ? super ax.wb.e<? super t>, ? extends Object> pVar, ax.wb.e<? super a> eVar) {
            super(2, eVar);
            this.h0 = pVar;
        }

        @Override // ax.yb.AbstractC3520a
        public final ax.wb.e<t> a(Object obj, ax.wb.e<?> eVar) {
            a aVar = new a(this.h0, eVar);
            aVar.g0 = obj;
            return aVar;
        }

        @Override // ax.yb.AbstractC3520a
        public final Object p(Object obj) {
            Object c = C3479b.c();
            int i = this.f0;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2832a c2832a = (C2832a) this.g0;
                C3083o.b(obj);
                return c2832a;
            }
            C3083o.b(obj);
            C2832a c2 = ((AbstractC2835d) this.g0).c();
            p<C2832a, ax.wb.e<? super t>, Object> pVar = this.h0;
            this.g0 = c2;
            this.f0 = 1;
            return pVar.j(c2, this) == c ? c : c2;
        }

        @Override // ax.Fb.p
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(AbstractC2835d abstractC2835d, ax.wb.e<? super AbstractC2835d> eVar) {
            return ((a) a(abstractC2835d, eVar)).p(t.a);
        }
    }

    public static final Object a(ax.n0.f<AbstractC2835d> fVar, p<? super C2832a, ? super ax.wb.e<? super t>, ? extends Object> pVar, ax.wb.e<? super AbstractC2835d> eVar) {
        return fVar.a(new a(pVar, null), eVar);
    }
}
