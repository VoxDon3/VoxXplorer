package ax.b6;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class A4 extends AbstractC1619n {
    private final C1531d d0;

    public A4(C1531d c1531d) {
        super("internal.eventLogger");
        this.d0 = c1531d;
    }

    @Override // ax.b6.AbstractC1619n
    public final InterfaceC1658s a(Z2 z2, List<InterfaceC1658s> list) {
        C1709y2.g(this.q, 3, list);
        String g = z2.b(list.get(0)).g();
        long a = (long) C1709y2.a(z2.b(list.get(1)).f().doubleValue());
        InterfaceC1658s b = z2.b(list.get(2));
        this.d0.c(g, a, b instanceof r ? C1709y2.e((r) b) : new HashMap<>());
        return InterfaceC1658s.f;
    }
}
