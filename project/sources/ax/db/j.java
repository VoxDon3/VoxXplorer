package ax.db;

import java.util.Map;

/* loaded from: classes3.dex */
public final class j extends q {
    public static final j e = new j();

    private j() {
        super(s.f, null);
    }

    @Override // ax.db.q
    public void b(String str, Map<String, AbstractC1955a> map) {
        ax.cb.b.b(str, "description");
        ax.cb.b.b(map, "attributes");
    }

    @Override // ax.db.q
    public void d(o oVar) {
        ax.cb.b.b(oVar, "messageEvent");
    }

    @Override // ax.db.q
    public void g(n nVar) {
        ax.cb.b.b(nVar, "options");
    }

    @Override // ax.db.q
    public void i(String str, AbstractC1955a abstractC1955a) {
        ax.cb.b.b(str, "key");
        ax.cb.b.b(abstractC1955a, "value");
    }

    @Override // ax.db.q
    public void j(Map<String, AbstractC1955a> map) {
        ax.cb.b.b(map, "attributes");
    }

    public String toString() {
        return "BlankSpan";
    }

    @Override // ax.db.q
    @Deprecated
    public void e(p pVar) {
    }
}
