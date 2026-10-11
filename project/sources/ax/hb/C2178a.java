package ax.hb;

import ax.db.k;

/* renamed from: ax.hb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C2178a implements k {
    private final ax.Za.b a;

    public C2178a(ax.Za.b bVar) {
        this.a = bVar;
    }

    @Override // ax.db.k
    public void a(k kVar) {
        this.a.g(((C2178a) kVar).a);
    }

    @Override // ax.db.k
    public k b() {
        return new C2178a(this.a.a());
    }

    ax.Za.b c() {
        return this.a;
    }
}
