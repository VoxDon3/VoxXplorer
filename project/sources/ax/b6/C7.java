package ax.b6;

import java.util.List;

/* loaded from: classes3.dex */
public final class C7 extends AbstractC1619n {
    private final G7 d0;

    public C7(G7 g7) {
        super("internal.logger");
        this.d0 = g7;
        this.c0.put("log", new F7(this, false, true));
        this.c0.put("silent", new B7(this, "silent"));
        ((AbstractC1619n) this.c0.get("silent")).n("log", new F7(this, true, true));
        this.c0.put("unmonitored", new E7(this, "unmonitored"));
        ((AbstractC1619n) this.c0.get("unmonitored")).n("log", new F7(this, false, false));
    }

    @Override // ax.b6.AbstractC1619n
    public final InterfaceC1658s a(Z2 z2, List<InterfaceC1658s> list) {
        return InterfaceC1658s.f;
    }
}
