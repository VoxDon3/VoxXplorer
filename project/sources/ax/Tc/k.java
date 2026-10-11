package ax.Tc;

import java.text.ParseException;

/* loaded from: classes3.dex */
public class k extends b {
    public k(ax.Sc.f fVar) {
        super("(d|-){1}\\s+\\[([-A-Z]+)\\]\\s+(\\S+)\\s+(\\d+)\\s+(\\S+\\s+\\S+\\s+((\\d+:\\d+)|(\\d{4})))\\s+(.*)");
        f(fVar);
    }

    @Override // ax.Sc.j
    public ax.Sc.i c(String str) {
        ax.Sc.i iVar = new ax.Sc.i();
        if (!g(str)) {
            return null;
        }
        String e = e(1);
        String e2 = e(2);
        String e3 = e(3);
        String e4 = e(4);
        String e5 = e(5);
        String e6 = e(9);
        try {
            iVar.p(super.j(e5));
        } catch (ParseException unused) {
        }
        if (e.trim().equals(ax.ba.d.d)) {
            iVar.q(1);
        } else {
            iVar.q(0);
        }
        iVar.r(e3);
        iVar.l(e6.trim());
        iVar.o(Long.parseLong(e4.trim()));
        if (e2.indexOf(82) != -1) {
            iVar.m(0, 0, true);
        }
        if (e2.indexOf(87) != -1) {
            iVar.m(0, 1, true);
        }
        return iVar;
    }

    @Override // ax.Tc.b
    protected ax.Sc.f i() {
        return new ax.Sc.f("NETWARE", "MMM dd yyyy", "MMM dd HH:mm");
    }
}
