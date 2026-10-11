package ax.m9;

import ax.Q8.r;
import ax.l9.C2487e;

/* renamed from: ax.m9.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2541e extends i {
    private static final ax.Xd.d c = ax.Xd.f.k(C2541e.class);
    private C2487e b;

    public C2541e(C2487e c2487e) {
        this.b = c2487e;
    }

    @Override // ax.m9.i
    protected void e(r rVar) throws ax.c9.e {
        ax.l9.h a = this.b.a(Long.valueOf(rVar.b().i()));
        ax.Xd.d dVar = c;
        dVar.i("Send/Recv of packet {} took << {} ms >>", rVar, Long.valueOf(System.currentTimeMillis() - a.g().getTime()));
        if (!rVar.g()) {
            this.a.a(rVar);
        } else {
            dVar.d("Received ASYNC packet {} with AsyncId << {} >>", rVar, Long.valueOf(rVar.b().d()));
            a.h(rVar.b().d());
        }
    }
}
