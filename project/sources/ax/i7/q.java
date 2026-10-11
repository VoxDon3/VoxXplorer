package ax.i7;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class q {
    private final w a;
    private final r b;

    q(w wVar, r rVar) {
        this.a = wVar;
        this.b = rVar;
    }

    public p a(g gVar) throws IOException {
        return c("GET", gVar, null);
    }

    public p b(g gVar, i iVar) throws IOException {
        return c("PUT", gVar, iVar);
    }

    public p c(String str, g gVar, i iVar) throws IOException {
        p a = this.a.a();
        if (gVar != null) {
            a.E(gVar);
        }
        r rVar = this.b;
        if (rVar != null) {
            rVar.b(a);
        }
        a.z(str);
        if (iVar != null) {
            a.t(iVar);
        }
        return a;
    }

    public r d() {
        return this.b;
    }

    public w e() {
        return this.a;
    }
}
