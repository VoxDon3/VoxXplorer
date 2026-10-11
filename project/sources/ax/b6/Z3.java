package ax.b6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Z3 {
    public static InterfaceC1658s a(C1653r2 c1653r2) {
        if (c1653r2 == null) {
            return InterfaceC1658s.f;
        }
        int i = A3.a[c1653r2.J().ordinal()];
        if (i == 1) {
            return c1653r2.R() ? new C1674u(c1653r2.M()) : InterfaceC1658s.m;
        }
        if (i == 2) {
            return c1653r2.Q() ? new C1594k(Double.valueOf(c1653r2.I())) : new C1594k(null);
        }
        if (i == 3) {
            return c1653r2.P() ? new C1567h(Boolean.valueOf(c1653r2.O())) : new C1567h(null);
        }
        if (i != 4) {
            if (i == 5) {
                throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
            }
            throw new IllegalStateException("Invalid entity: " + String.valueOf(c1653r2));
        }
        List<C1653r2> N = c1653r2.N();
        ArrayList arrayList = new ArrayList();
        Iterator<C1653r2> it = N.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return new C1682v(c1653r2.L(), arrayList);
    }

    public static InterfaceC1658s b(Object obj) {
        if (obj == null) {
            return InterfaceC1658s.g;
        }
        if (obj instanceof String) {
            return new C1674u((String) obj);
        }
        if (obj instanceof Double) {
            return new C1594k((Double) obj);
        }
        if (obj instanceof Long) {
            return new C1594k(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C1594k(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C1567h((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C1558g c1558g = new C1558g();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c1558g.s(b(it.next()));
            }
            return c1558g;
        }
        r rVar = new r();
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            InterfaceC1658s b = b(map.get(obj2));
            if (obj2 != null) {
                if (!(obj2 instanceof String)) {
                    obj2 = obj2.toString();
                }
                rVar.n((String) obj2, b);
            }
        }
        return rVar;
    }
}
