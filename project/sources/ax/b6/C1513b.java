package ax.b6;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: ax.b6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1513b {
    private final TreeMap<Integer, C1666t> a = new TreeMap<>();
    private final TreeMap<Integer, C1666t> b = new TreeMap<>();

    private static int a(Z2 z2, C1666t c1666t, InterfaceC1658s interfaceC1658s) {
        InterfaceC1658s a = c1666t.a(z2, Collections.singletonList(interfaceC1658s));
        if (a instanceof C1594k) {
            return C1709y2.i(a.f().doubleValue());
        }
        return -1;
    }

    public final void b(Z2 z2, C1531d c1531d) {
        C1520b6 c1520b6 = new C1520b6(c1531d);
        for (Integer num : this.a.keySet()) {
            C1540e c1540e = (C1540e) c1531d.d().clone();
            int a = a(z2, this.a.get(num), c1520b6);
            if (a == 2 || a == -1) {
                c1531d.e(c1540e);
            }
        }
        Iterator<Integer> it = this.b.keySet().iterator();
        while (it.hasNext()) {
            a(z2, this.b.get(it.next()), c1520b6);
        }
    }

    public final void c(String str, int i, C1666t c1666t, String str2) {
        TreeMap<Integer, C1666t> treeMap;
        if ("create".equals(str2)) {
            treeMap = this.b;
        } else {
            if (!"edit".equals(str2)) {
                throw new IllegalStateException("Unknown callback type: " + str2);
            }
            treeMap = this.a;
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = treeMap.lastKey().intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), c1666t);
    }
}
