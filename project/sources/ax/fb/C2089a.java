package ax.fb;

import ax.cb.b;
import ax.db.h;
import ax.db.o;
import ax.db.p;

/* renamed from: ax.fb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2089a {
    public static o a(h hVar) {
        b.b(hVar, "event");
        if (hVar instanceof o) {
            return (o) hVar;
        }
        p pVar = (p) hVar;
        return o.a(pVar.e() == p.b.RECV ? o.b.RECEIVED : o.b.SENT, pVar.d()).d(pVar.f()).b(pVar.b()).a();
    }

    public static p b(h hVar) {
        b.b(hVar, "event");
        if (hVar instanceof p) {
            return (p) hVar;
        }
        o oVar = (o) hVar;
        return p.a(oVar.d() == o.b.RECEIVED ? p.b.RECV : p.b.SENT, oVar.c()).d(oVar.e()).b(oVar.b()).a();
    }
}
