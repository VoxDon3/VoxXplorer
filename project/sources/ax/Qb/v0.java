package ax.Qb;

/* loaded from: classes3.dex */
public class v0 extends z0 implements InterfaceC0964x {
    private final boolean d0;

    public v0(InterfaceC0959s0 interfaceC0959s0) {
        super(true);
        Z(interfaceC0959s0);
        this.d0 = I0();
    }

    private final boolean I0() {
        z0 y;
        r V = V();
        C0958s c0958s = V instanceof C0958s ? (C0958s) V : null;
        if (c0958s != null && (y = c0958s.y()) != null) {
            while (!y.S()) {
                r V2 = y.V();
                C0958s c0958s2 = V2 instanceof C0958s ? (C0958s) V2 : null;
                if (c0958s2 != null && (y = c0958s2.y()) != null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // ax.Qb.z0
    public boolean S() {
        return this.d0;
    }

    @Override // ax.Qb.z0
    public boolean T() {
        return true;
    }
}
