package ax.b6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class K7 extends AbstractC1619n {
    private final C1510a5 d0;
    private final Map<String, AbstractC1619n> e0;

    public K7(C1510a5 c1510a5) {
        super("require");
        this.e0 = new HashMap();
        this.d0 = c1510a5;
    }

    @Override // ax.b6.AbstractC1619n
    public final InterfaceC1658s a(Z2 z2, List<InterfaceC1658s> list) {
        C1709y2.g("require", 1, list);
        String g = z2.b(list.get(0)).g();
        if (this.e0.containsKey(g)) {
            return this.e0.get(g);
        }
        InterfaceC1658s a = this.d0.a(g);
        if (a instanceof AbstractC1619n) {
            this.e0.put(g, (AbstractC1619n) a);
        }
        return a;
    }
}
