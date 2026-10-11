package ax.b6;

import java.util.List;

/* loaded from: classes3.dex */
public final class H7 extends AbstractC1619n {
    private C1513b d0;

    public H7(C1513b c1513b) {
        super("internal.registerCallback");
        this.d0 = c1513b;
    }

    @Override // ax.b6.AbstractC1619n
    public final InterfaceC1658s a(Z2 z2, List<InterfaceC1658s> list) {
        C1709y2.g(this.q, 3, list);
        String g = z2.b(list.get(0)).g();
        InterfaceC1658s b = z2.b(list.get(1));
        if (!(b instanceof C1666t)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        InterfaceC1658s b2 = z2.b(list.get(2));
        if (!(b2 instanceof r)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        r rVar = (r) b2;
        if (!rVar.l("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.d0.c(g, rVar.l("priority") ? C1709y2.i(rVar.h("priority").f().doubleValue()) : 1000, (C1666t) b, rVar.h("type").g());
        return InterfaceC1658s.f;
    }
}
