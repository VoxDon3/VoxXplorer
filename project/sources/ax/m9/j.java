package ax.m9;

import ax.Q8.n;
import ax.Q8.q;
import ax.Q8.r;
import ax.Z8.a;
import ax.l9.C2487e;

/* loaded from: classes3.dex */
public class j extends i {
    private static final ax.Xd.d d = ax.Xd.f.k(j.class);
    private final n b;
    private final C2487e c;

    public j(n nVar, C2487e c2487e) {
        this.b = nVar;
        this.c = c2487e;
    }

    @Override // ax.m9.i
    protected void e(r rVar) throws ax.c9.e {
        try {
            q c = this.b.c(this.c.a(Long.valueOf(rVar.b().i())).e(), rVar);
            this.c.d(Long.valueOf(c.c().i())).f().a(c);
        } catch (a.b e) {
            d.t("Failed to deserialize SMB2 Packet Data of {}", rVar);
            throw new ax.c9.e("Unable to deserialize SMB2 Packet Data : " + e.getMessage(), e);
        }
    }
}
