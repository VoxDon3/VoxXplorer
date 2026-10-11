package ax.b6;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: ax.b6.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1635p {
    public static InterfaceC1658s a(InterfaceC1611m interfaceC1611m, InterfaceC1658s interfaceC1658s, Z2 z2, List<InterfaceC1658s> list) {
        if (interfaceC1611m.l(interfaceC1658s.g())) {
            InterfaceC1658s h = interfaceC1611m.h(interfaceC1658s.g());
            if (h instanceof AbstractC1619n) {
                return ((AbstractC1619n) h).a(z2, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", interfaceC1658s.g()));
        }
        if (!"hasOwnProperty".equals(interfaceC1658s.g())) {
            throw new IllegalArgumentException(String.format("Object has no function %s", interfaceC1658s.g()));
        }
        C1709y2.g("hasOwnProperty", 1, list);
        return interfaceC1611m.l(z2.b(list.get(0)).g()) ? InterfaceC1658s.k : InterfaceC1658s.l;
    }

    public static Iterator<InterfaceC1658s> b(Map<String, InterfaceC1658s> map) {
        return new C1627o(map.keySet().iterator());
    }
}
