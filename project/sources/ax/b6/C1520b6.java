package ax.b6;

import java.util.List;
import java.util.Map;

/* renamed from: ax.b6.b6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1520b6 extends r {
    private final C1531d c0;

    public C1520b6(C1531d c1531d) {
        this.c0 = c1531d;
    }

    @Override // ax.b6.r, ax.b6.InterfaceC1658s
    public final InterfaceC1658s k(String str, Z2 z2, List<InterfaceC1658s> list) {
        str.getClass();
        switch (str) {
            case "getEventName":
                C1709y2.g("getEventName", 0, list);
                return new C1674u(this.c0.d().e());
            case "getTimestamp":
                C1709y2.g("getTimestamp", 0, list);
                return new C1594k(Double.valueOf(this.c0.d().a()));
            case "getParamValue":
                C1709y2.g("getParamValue", 1, list);
                return Z3.b(this.c0.d().b(z2.b(list.get(0)).g()));
            case "getParams":
                C1709y2.g("getParams", 0, list);
                Map<String, Object> g = this.c0.d().g();
                r rVar = new r();
                for (String str2 : g.keySet()) {
                    rVar.n(str2, Z3.b(g.get(str2)));
                }
                return rVar;
            case "setParamValue":
                C1709y2.g("setParamValue", 2, list);
                String g2 = z2.b(list.get(0)).g();
                InterfaceC1658s b = z2.b(list.get(1));
                this.c0.d().d(g2, C1709y2.d(b));
                return b;
            case "setEventName":
                C1709y2.g("setEventName", 1, list);
                InterfaceC1658s b2 = z2.b(list.get(0));
                if (InterfaceC1658s.f.equals(b2) || InterfaceC1658s.g.equals(b2)) {
                    throw new IllegalArgumentException("Illegal event name");
                }
                this.c0.d().f(b2.g());
                return new C1674u(b2.g());
            default:
                return super.k(str, z2, list);
        }
    }
}
