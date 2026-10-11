package ax.Tc;

import java.text.ParseException;

/* loaded from: classes3.dex */
public class l extends b {
    public l(ax.Sc.f fVar) {
        super("\\s*([0-9]+)\\s*(\\s+|[A-Z]+)\\s*(DIR|\\s+)\\s*(\\S+)\\s+(\\S+)\\s+(\\S.*)");
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
        String str2 = e(4) + " " + e(5);
        String e4 = e(6);
        try {
            iVar.p(super.j(str2));
        } catch (ParseException unused) {
        }
        if (e3.trim().equals("DIR") || e2.trim().equals("DIR")) {
            iVar.q(1);
        } else {
            iVar.q(0);
        }
        iVar.l(e4.trim());
        iVar.o(Long.parseLong(e.trim()));
        return iVar;
    }

    @Override // ax.Tc.b
    protected ax.Sc.f i() {
        return new ax.Sc.f("OS/2", "MM-dd-yy HH:mm", null);
    }
}
