package ax.Qb;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ax.Qb.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0937h {
    public static final <T> T a(ax.wb.i iVar, ax.Fb.p<? super J, ? super ax.wb.e<? super T>, ? extends Object> pVar) throws InterruptedException {
        AbstractC0928c0 a;
        ax.wb.i d;
        Thread currentThread = Thread.currentThread();
        ax.wb.f fVar = (ax.wb.f) iVar.a(ax.wb.f.b0);
        if (fVar == null) {
            a = N0.a.b();
            d = F.d(C0946l0.q, iVar.p(a));
        } else {
            AbstractC0928c0 abstractC0928c0 = fVar instanceof AbstractC0928c0 ? (AbstractC0928c0) fVar : null;
            if (abstractC0928c0 != null) {
                AbstractC0928c0 abstractC0928c02 = abstractC0928c0.k1() ? abstractC0928c0 : null;
                if (abstractC0928c02 != null) {
                    a = abstractC0928c02;
                    d = F.d(C0946l0.q, iVar);
                }
            }
            a = N0.a.a();
            d = F.d(C0946l0.q, iVar);
        }
        C0931e c0931e = new C0931e(d, currentThread, a);
        c0931e.N0(L.DEFAULT, c0931e, pVar);
        return (T) c0931e.O0();
    }

    public static /* synthetic */ Object b(ax.wb.i iVar, ax.Fb.p pVar, int i, Object obj) throws InterruptedException {
        if ((i & 1) != 0) {
            iVar = ax.wb.j.q;
        }
        return C0935g.e(iVar, pVar);
    }
}
