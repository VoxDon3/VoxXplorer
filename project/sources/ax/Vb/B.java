package ax.Vb;

import ax.Qb.AbstractC0923a;
import ax.xb.C3479b;

/* loaded from: classes3.dex */
public class B<T> extends AbstractC0923a<T> implements ax.yb.e {
    public final ax.wb.e<T> e0;

    /* JADX WARN: Multi-variable type inference failed */
    public B(ax.wb.i iVar, ax.wb.e<? super T> eVar) {
        super(iVar, true, true);
        this.e0 = eVar;
    }

    @Override // ax.Qb.AbstractC0923a
    protected void I0(Object obj) {
        ax.wb.e<T> eVar = this.e0;
        eVar.f(ax.Qb.D.a(obj, eVar));
    }

    @Override // ax.Qb.z0
    protected final boolean b0() {
        return true;
    }

    @Override // ax.yb.e
    public final ax.yb.e d() {
        ax.wb.e<T> eVar = this.e0;
        if (eVar instanceof ax.yb.e) {
            return (ax.yb.e) eVar;
        }
        return null;
    }

    @Override // ax.Qb.z0
    protected void w(Object obj) {
        C1004k.c(C3479b.b(this.e0), ax.Qb.D.a(obj, this.e0), null, 2, null);
    }
}
