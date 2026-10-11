package ax.Qb;

import ax.wb.i;

/* loaded from: classes3.dex */
final class Q0 implements i.b, i.c<Q0> {
    public static final Q0 q = new Q0();

    private Q0() {
    }

    @Override // ax.wb.i.b, ax.wb.i
    public <E extends i.b> E a(i.c<E> cVar) {
        return (E) i.b.a.b(this, cVar);
    }

    @Override // ax.wb.i
    public ax.wb.i m(i.c<?> cVar) {
        return i.b.a.c(this, cVar);
    }

    @Override // ax.wb.i
    public ax.wb.i p(ax.wb.i iVar) {
        return i.b.a.d(this, iVar);
    }

    @Override // ax.wb.i
    public <R> R v(R r, ax.Fb.p<? super R, ? super i.b, ? extends R> pVar) {
        return (R) i.b.a.a(this, r, pVar);
    }

    @Override // ax.wb.i.b
    public i.c<?> getKey() {
        return this;
    }
}
