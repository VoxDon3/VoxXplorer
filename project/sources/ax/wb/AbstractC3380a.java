package ax.wb;

import ax.Fb.p;
import ax.Gb.l;
import ax.wb.i;

/* renamed from: ax.wb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3380a implements i.b {
    private final i.c<?> q;

    public AbstractC3380a(i.c<?> cVar) {
        l.f(cVar, "key");
        this.q = cVar;
    }

    @Override // ax.wb.i.b, ax.wb.i
    public <E extends i.b> E a(i.c<E> cVar) {
        return (E) i.b.a.b(this, cVar);
    }

    @Override // ax.wb.i.b
    public i.c<?> getKey() {
        return this.q;
    }

    @Override // ax.wb.i
    public i m(i.c<?> cVar) {
        return i.b.a.c(this, cVar);
    }

    @Override // ax.wb.i
    public i p(i iVar) {
        return i.b.a.d(this, iVar);
    }

    @Override // ax.wb.i
    public <R> R v(R r, p<? super R, ? super i.b, ? extends R> pVar) {
        return (R) i.b.a.a(this, r, pVar);
    }
}
