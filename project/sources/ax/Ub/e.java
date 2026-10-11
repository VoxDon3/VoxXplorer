package ax.Ub;

import ax.Fb.p;
import ax.wb.i;

/* loaded from: classes3.dex */
public final class e implements ax.wb.i {
    private final /* synthetic */ ax.wb.i c0;
    public final Throwable q;

    public e(Throwable th, ax.wb.i iVar) {
        this.q = th;
        this.c0 = iVar;
    }

    @Override // ax.wb.i
    public <E extends i.b> E a(i.c<E> cVar) {
        return (E) this.c0.a(cVar);
    }

    @Override // ax.wb.i
    public ax.wb.i m(i.c<?> cVar) {
        return this.c0.m(cVar);
    }

    @Override // ax.wb.i
    public ax.wb.i p(ax.wb.i iVar) {
        return this.c0.p(iVar);
    }

    @Override // ax.wb.i
    public <R> R v(R r, p<? super R, ? super i.b, ? extends R> pVar) {
        return (R) this.c0.v(r, pVar);
    }
}
