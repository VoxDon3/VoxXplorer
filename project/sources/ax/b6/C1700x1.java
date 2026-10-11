package ax.b6;

import android.app.Activity;
import android.os.RemoteException;
import ax.M5.C0821p;
import ax.b6.W0;

/* renamed from: ax.b6.x1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1700x1 extends W0.a {
    private final /* synthetic */ Activity f0;
    private final /* synthetic */ W0.c g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1700x1(W0.c cVar, Activity activity) {
        super(W0.this);
        this.f0 = activity;
        this.g0 = cVar;
    }

    @Override // ax.b6.W0.a
    final void a() throws RemoteException {
        H0 h0;
        h0 = W0.this.i;
        ((H0) C0821p.l(h0)).onActivityPaused(ax.T5.b.a2(this.f0), this.c0);
    }
}
