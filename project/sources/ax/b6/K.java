package ax.b6;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes3.dex */
final class K implements Comparator<InterfaceC1658s> {
    private final /* synthetic */ Z2 c0;
    private final /* synthetic */ AbstractC1619n q;

    K(AbstractC1619n abstractC1619n, Z2 z2) {
        this.q = abstractC1619n;
        this.c0 = z2;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(InterfaceC1658s interfaceC1658s, InterfaceC1658s interfaceC1658s2) {
        InterfaceC1658s interfaceC1658s3 = interfaceC1658s;
        InterfaceC1658s interfaceC1658s4 = interfaceC1658s2;
        AbstractC1619n abstractC1619n = this.q;
        Z2 z2 = this.c0;
        if (interfaceC1658s3 instanceof C1714z) {
            return !(interfaceC1658s4 instanceof C1714z) ? 1 : 0;
        }
        if (interfaceC1658s4 instanceof C1714z) {
            return -1;
        }
        return abstractC1619n == null ? interfaceC1658s3.g().compareTo(interfaceC1658s4.g()) : (int) C1709y2.a(abstractC1619n.a(z2, Arrays.asList(interfaceC1658s3, interfaceC1658s4)).f().doubleValue());
    }
}
