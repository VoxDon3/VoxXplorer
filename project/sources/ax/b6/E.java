package ax.b6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class E {
    private Map<String, AbstractC1501A> a = new HashMap();
    private U b = new U();

    public E() {
        b(new C1706y());
        b(new D());
        b(new F());
        b(new J());
        b(new L());
        b(new S());
        b(new X());
    }

    private final void b(AbstractC1501A abstractC1501A) {
        Iterator<Z> it = abstractC1501A.a.iterator();
        while (it.hasNext()) {
            this.a.put(it.next().toString(), abstractC1501A);
        }
    }

    public final InterfaceC1658s a(Z2 z2, InterfaceC1658s interfaceC1658s) {
        C1709y2.b(z2);
        if (!(interfaceC1658s instanceof C1682v)) {
            return interfaceC1658s;
        }
        C1682v c1682v = (C1682v) interfaceC1658s;
        ArrayList<InterfaceC1658s> b = c1682v.b();
        String a = c1682v.a();
        return (this.a.containsKey(a) ? this.a.get(a) : this.b).b(a, z2, b);
    }
}
