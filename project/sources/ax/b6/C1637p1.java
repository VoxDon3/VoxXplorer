package ax.b6;

import android.os.RemoteException;
import ax.M5.C0821p;
import ax.b6.W0;

/* renamed from: ax.b6.p1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1637p1 extends W0.a {
    private final /* synthetic */ boolean f0;
    private final /* synthetic */ W0 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1637p1(W0 w0, boolean z) {
        super(w0);
        this.f0 = z;
        this.g0 = w0;
    }

    @Override // ax.b6.W0.a
    final void a() throws RemoteException {
        H0 h0;
        h0 = this.g0.i;
        ((H0) C0821p.l(h0)).setDataCollectionEnabled(this.f0);
    }
}
