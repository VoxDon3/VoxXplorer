package ax.hc;

import ax.cc.C1857d;

/* loaded from: classes3.dex */
public final class d extends AbstractC2182b {
    private final ax.jc.d[] c;

    public d(g gVar) {
        super(gVar);
        this.c = gVar.b().a().c();
    }

    private boolean e(Object obj) {
        ax.jc.d[] dVarArr = this.c;
        if (dVarArr == null) {
            return true;
        }
        for (ax.jc.d dVar : dVarArr) {
            if (!dVar.a(obj, b())) {
                return false;
            }
        }
        return true;
    }

    @Override // ax.hc.g
    public void a(C1857d c1857d, Object obj, Iterable iterable) {
        if (e(obj)) {
            d().a(c1857d, obj, iterable);
        }
    }
}
