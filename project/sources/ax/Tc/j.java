package ax.Tc;

import java.text.ParseException;

/* loaded from: classes3.dex */
public class j extends b {
    private final e e;

    public j(ax.Sc.f fVar) {
        super("(\\S+)\\s+(\\S+)\\s+(?:(<DIR>)|([0-9]+))\\s+(\\S.*)", 32);
        f(fVar);
        ax.Sc.f fVar2 = new ax.Sc.f("WINDOWS", "MM-dd-yy kk:mm", null);
        fVar2.k("MM-dd-yy kk:mm");
        f fVar3 = new f();
        this.e = fVar3;
        fVar3.f(fVar2);
    }

    @Override // ax.Sc.j
    public ax.Sc.i c(String str) {
        ax.Sc.i iVar = new ax.Sc.i();
        iVar.n(str);
        if (g(str)) {
            String str2 = e(1) + " " + e(2);
            String e = e(3);
            String e2 = e(4);
            String e3 = e(5);
            try {
                try {
                    iVar.p(super.j(str2));
                } catch (ParseException unused) {
                    iVar.p(this.e.a(str2));
                }
            } catch (ParseException unused2) {
            }
            if (e3 != null && !e3.equals(".") && !e3.equals("..")) {
                iVar.l(e3);
                if ("<DIR>".equals(e)) {
                    iVar.q(1);
                    iVar.o(0L);
                } else {
                    iVar.q(0);
                    if (e2 != null) {
                        iVar.o(Long.parseLong(e2));
                    }
                }
                return iVar;
            }
        }
        return null;
    }

    @Override // ax.Tc.b
    public ax.Sc.f i() {
        return new ax.Sc.f("WINDOWS", "MM-dd-yy hh:mma", null);
    }
}
