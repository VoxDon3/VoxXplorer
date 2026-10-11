package ax.q0;

import ax.Fb.p;
import ax.sb.C3083o;
import ax.sb.t;
import ax.xb.C3479b;
import ax.yb.l;

/* renamed from: ax.q0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2833b implements ax.n0.f<AbstractC2835d> {
    private final ax.n0.f<AbstractC2835d> a;

    @ax.yb.f(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {85}, m = "invokeSuspend")
    /* renamed from: ax.q0.b$a */
    static final class a extends l implements p<AbstractC2835d, ax.wb.e<? super AbstractC2835d>, Object> {
        int f0;
        /* synthetic */ Object g0;
        final /* synthetic */ p<AbstractC2835d, ax.wb.e<? super AbstractC2835d>, Object> h0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super AbstractC2835d, ? super ax.wb.e<? super AbstractC2835d>, ? extends Object> pVar, ax.wb.e<? super a> eVar) {
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
            if (i == 0) {
                C3083o.b(obj);
                AbstractC2835d abstractC2835d = (AbstractC2835d) this.g0;
                p<AbstractC2835d, ax.wb.e<? super AbstractC2835d>, Object> pVar = this.h0;
                this.f0 = 1;
                obj = pVar.j(abstractC2835d, this);
                if (obj == c) {
                    return c;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C3083o.b(obj);
            }
            AbstractC2835d abstractC2835d2 = (AbstractC2835d) obj;
            ((C2832a) abstractC2835d2).f();
            return abstractC2835d2;
        }

        @Override // ax.Fb.p
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(AbstractC2835d abstractC2835d, ax.wb.e<? super AbstractC2835d> eVar) {
            return ((a) a(abstractC2835d, eVar)).p(t.a);
        }
    }

    public C2833b(ax.n0.f<AbstractC2835d> fVar) {
        ax.Gb.l.f(fVar, "delegate");
        this.a = fVar;
    }

    @Override // ax.n0.f
    public Object a(p<? super AbstractC2835d, ? super ax.wb.e<? super AbstractC2835d>, ? extends Object> pVar, ax.wb.e<? super AbstractC2835d> eVar) {
        return this.a.a(new a(pVar, null), eVar);
    }

    @Override // ax.n0.f
    public ax.Tb.b<AbstractC2835d> b() {
        return this.a.b();
    }
}
