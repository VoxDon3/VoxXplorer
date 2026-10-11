package ax.b6;

import android.app.Activity;
import android.os.RemoteException;
import ax.M5.C0821p;
import ax.b6.W0;

/* renamed from: ax.b6.z1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1716z1 extends W0.a {
    private final /* synthetic */ Activity f0;
    private final /* synthetic */ I0 g0;
    private final /* synthetic */ W0.c h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1716z1(W0.c cVar, Activity activity, I0 i0) {
        super(W0.this);
        this.f0 = activity;
        this.g0 = i0;
        this.h0 = cVar;
    }

    @Override // ax.b6.W0.a
    final void a() throws RemoteException {
        H0 h0;
        h0 = W0.this.i;
        ((H0) C0821p.l(h0)).onActivitySaveInstanceState(ax.T5.b.a2(this.f0), this.g0, this.c0);
    }
}
