package ax.m9;

import ax.Q8.r;

/* renamed from: ax.m9.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2543g extends i {
    private static final ax.Xd.d c = ax.Xd.f.k(C2543g.class);
    private ax.l9.l b;

    public C2543g(ax.l9.l lVar) {
        this.b = lVar;
    }

    @Override // ax.m9.i
    protected void e(r rVar) throws ax.c9.e {
        this.b.b(rVar.b().f());
        c.u("Server granted us {} credits for {}, now available: {} credits", Integer.valueOf(rVar.b().f()), rVar, Integer.valueOf(this.b.a()));
        this.a.a(rVar);
    }
}
