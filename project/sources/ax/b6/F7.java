package ax.b6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class F7 extends AbstractC1619n {
    private boolean d0;
    private boolean e0;
    private final /* synthetic */ C7 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F7(C7 c7, boolean z, boolean z2) {
        super("log");
        this.f0 = c7;
        this.d0 = z;
        this.e0 = z2;
    }

    @Override // ax.b6.AbstractC1619n
    public final InterfaceC1658s a(Z2 z2, List<InterfaceC1658s> list) {
        G7 g7;
        G7 g72;
        G7 g73;
        C1709y2.k("log", 1, list);
        if (list.size() == 1) {
            g73 = this.f0.d0;
            g73.a(D7.INFO, z2.b(list.get(0)).g(), Collections.EMPTY_LIST, this.d0, this.e0);
            return InterfaceC1658s.f;
        }
        D7 d = D7.d(C1709y2.i(z2.b(list.get(0)).f().doubleValue()));
        String g = z2.b(list.get(1)).g();
        if (list.size() == 2) {
            g72 = this.f0.d0;
            g72.a(d, g, Collections.EMPTY_LIST, this.d0, this.e0);
            return InterfaceC1658s.f;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 2; i < Math.min(list.size(), 5); i++) {
            arrayList.add(z2.b(list.get(i)).g());
        }
        g7 = this.f0.d0;
        g7.a(d, g, arrayList, this.d0, this.e0);
        return InterfaceC1658s.f;
    }
}
