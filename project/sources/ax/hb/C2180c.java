package ax.hb;

import ax.db.k;
import ax.db.l;
import ax.db.q;

/* renamed from: ax.hb.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2180c implements l {
    protected C2180c() {
    }

    private static ax.Za.b d(k kVar) {
        return ((C2178a) kVar).c();
    }

    private static k e(ax.Za.b bVar) {
        return new C2178a(bVar);
    }

    @Override // ax.db.l
    public q a(k kVar) {
        return d.a(d(kVar));
    }

    @Override // ax.db.l
    public k b(k kVar, q qVar) {
        return e(d.b(d(kVar), qVar));
    }

    @Override // ax.db.l
    public k c() {
        return e(ax.Za.b.f());
    }
}
