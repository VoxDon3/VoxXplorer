package ax.b6;

import android.os.Bundle;
import android.os.RemoteException;
import ax.M5.C0821p;
import ax.b6.W0;

/* loaded from: classes3.dex */
final class X0 extends W0.a {
    private final /* synthetic */ Bundle f0;
    private final /* synthetic */ W0 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    X0(W0 w0, Bundle bundle) {
        super(w0);
        this.f0 = bundle;
        this.g0 = w0;
    }

    @Override // ax.b6.W0.a
    final void a() throws RemoteException {
        H0 h0;
        h0 = this.g0.i;
        ((H0) C0821p.l(h0)).setConditionalUserProperty(this.f0, this.q);
    }
}
