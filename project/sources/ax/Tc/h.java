package ax.Tc;

import java.text.ParseException;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class h extends b {
    private int e;
    private q f;

    public h() {
        super(HttpUrl.FRAGMENT_ENCODE_SET);
        this.e = -1;
        super.f(null);
    }

    private ax.Sc.i k(String str) {
        if (!g(str)) {
            return null;
        }
        ax.Sc.i iVar = new ax.Sc.i();
        iVar.n(str);
        String e = e(2);
        String e2 = e(1);
        iVar.l(e);
        if ("PS".equals(e2)) {
            iVar.q(0);
            return iVar;
        }
        if (!"PO".equals(e2) && !"PO-E".equals(e2)) {
            return null;
        }
        iVar.q(1);
        return iVar;
    }

    private ax.Sc.i l(String str) {
        if (!g(str)) {
            return null;
        }
        ax.Sc.i iVar = new ax.Sc.i();
        if (!e(3).equalsIgnoreCase("OUTPUT")) {
            return null;
        }
        iVar.n(str);
        iVar.l(e(2));
        iVar.q(0);
        return iVar;
    }

    private ax.Sc.i m(String str) {
        if (!g(str)) {
            return null;
        }
        ax.Sc.i iVar = new ax.Sc.i();
        if (!e(4).equalsIgnoreCase("OUTPUT")) {
            return null;
        }
        iVar.n(str);
        iVar.l(e(2));
        iVar.q(0);
        return iVar;
    }

    private ax.Sc.i n(String str) {
        ax.Sc.i iVar = new ax.Sc.i();
        if (!g(str)) {
            if (str == null || str.trim().isEmpty()) {
                return null;
            }
            iVar.n(str);
            iVar.l(str.split(" ")[0]);
            iVar.q(0);
            return iVar;
        }
        iVar.n(str);
        String e = e(1);
        String str2 = e(2) + " " + e(3);
        iVar.l(e);
        iVar.q(0);
        try {
            iVar.p(super.j(str2));
        } catch (ParseException unused) {
        }
        return iVar;
    }

    @Override // ax.Sc.k, ax.Sc.j
    public List<String> b(List<String> list) {
        if (list != null && !list.isEmpty()) {
            String str = list.get(0);
            if (str.contains("Volume") && str.contains("Dsname")) {
                o(0);
                super.h("\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s+(?:\\S+\\s+)?(?:F|FB|V|VB|U)\\s+\\S+\\s+\\S+\\s+(PS|PO|PO-E)\\s+(\\S+)\\s*");
            } else if (str.contains("Name") && str.contains("Id")) {
                o(1);
                super.h("(\\S+)\\s+\\S+\\s+\\S+\\s+(\\S+)\\s+(\\S+)\\s+\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s*");
            } else if (str.indexOf("total") == 0) {
                o(2);
                this.f = new q();
            } else if (str.indexOf("Spool Files") >= 30) {
                o(3);
                super.h("(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s*");
            } else if (str.indexOf("JOBNAME") != 0 || str.indexOf("JOBID") <= 8) {
                o(-1);
            } else {
                o(4);
                super.h("(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+).*");
            }
            if (this.e != 3) {
                list.remove(0);
            }
        }
        return list;
    }

    @Override // ax.Sc.j
    public ax.Sc.i c(String str) {
        int i = this.e;
        if (i == 0) {
            return k(str);
        }
        if (i == 1) {
            return n(str);
        }
        if (i == 2) {
            return this.f.c(str);
        }
        if (i == 3) {
            return l(str);
        }
        if (i != 4) {
            return null;
        }
        return m(str);
    }

    @Override // ax.Tc.b
    protected ax.Sc.f i() {
        return new ax.Sc.f("MVS", "yyyy/MM/dd HH:mm", null);
    }

    void o(int i) {
        this.e = i;
    }
}
