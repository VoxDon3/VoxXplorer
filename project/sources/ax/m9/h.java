package ax.m9;

import ax.Q8.C0917a;
import ax.Q8.r;
import ax.l9.C2487e;

/* loaded from: classes3.dex */
public class h extends i {
    private static final ax.Xd.d c = ax.Xd.f.k(h.class);
    private C2487e b;

    public h(C2487e c2487e) {
        this.b = c2487e;
    }

    @Override // ax.m9.i
    protected void e(r rVar) throws ax.c9.e {
        long d = rVar.d();
        if (this.b.c(Long.valueOf(d)) || rVar.h()) {
            this.a.a(rVar);
        } else {
            c.t("Received response with unknown sequence number << {} >>", Long.valueOf(d));
            this.a.a(new C0917a(rVar.b()));
        }
    }
}
