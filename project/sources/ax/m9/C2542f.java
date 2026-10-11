package ax.m9;

import ax.Q8.r;
import ax.Z8.a;
import ax.h9.AbstractC2174e;

/* renamed from: ax.m9.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2542f extends i {
    @Override // ax.m9.i, ax.m9.AbstractC2537a
    public boolean b(AbstractC2174e<?> abstractC2174e) {
        return super.b(abstractC2174e) && ((r) abstractC2174e).e();
    }

    @Override // ax.m9.i
    protected void e(r rVar) throws ax.c9.e {
        do {
            this.a.a(rVar);
            try {
                rVar = rVar.j();
            } catch (a.b e) {
                throw new ax.c9.e("Missing compounded message data", e);
            }
        } while (rVar != null);
    }
}
