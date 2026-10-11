package ax.M5;

import ax.K5.h;
import ax.M5.C0820o;
import ax.j6.C2328k;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class K implements h.a {
    final /* synthetic */ ax.K5.h a;
    final /* synthetic */ C2328k b;
    final /* synthetic */ C0820o.a c;
    final /* synthetic */ M d;

    K(ax.K5.h hVar, C2328k c2328k, C0820o.a aVar, M m) {
        this.a = hVar;
        this.b = c2328k;
        this.c = aVar;
        this.d = m;
    }

    @Override // ax.K5.h.a
    public final void a(Status status) {
        if (!status.C()) {
            this.b.b(C0807b.a(status));
        } else {
            this.b.c(this.c.a(this.a.b(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
