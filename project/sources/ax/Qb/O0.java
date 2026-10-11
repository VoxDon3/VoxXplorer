package ax.Qb;

/* loaded from: classes3.dex */
public final class O0 extends G {
    public static final O0 d0 = new O0();

    private O0() {
    }

    @Override // ax.Qb.G
    public void b(ax.wb.i iVar, Runnable runnable) {
        S0 s0 = (S0) iVar.a(S0.d0);
        if (s0 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        s0.c0 = true;
    }

    @Override // ax.Qb.G
    public boolean f(ax.wb.i iVar) {
        return false;
    }

    @Override // ax.Qb.G
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
