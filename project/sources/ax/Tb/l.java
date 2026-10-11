package ax.Tb;

import ax.sb.t;
import ax.xb.C3479b;

/* loaded from: classes3.dex */
final class l<T> extends a<T> {
    private final ax.Fb.p<c<? super T>, ax.wb.e<? super t>, Object> q;

    /* JADX WARN: Multi-variable type inference failed */
    public l(ax.Fb.p<? super c<? super T>, ? super ax.wb.e<? super t>, ? extends Object> pVar) {
        this.q = pVar;
    }

    @Override // ax.Tb.a
    public Object b(c<? super T> cVar, ax.wb.e<? super t> eVar) {
        Object j = this.q.j(cVar, eVar);
        return j == C3479b.c() ? j : t.a;
    }
}
