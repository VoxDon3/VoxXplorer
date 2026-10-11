package ax.b6;

import android.os.RemoteException;
import ax.M5.C0821p;
import ax.b6.W0;

/* loaded from: classes3.dex */
final class Z0 extends W0.a {
    private final /* synthetic */ String f0;
    private final /* synthetic */ String g0;
    private final /* synthetic */ I0 h0;
    private final /* synthetic */ W0 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z0(W0 w0, String str, String str2, I0 i0) {
        super(w0);
        this.f0 = str;
        this.g0 = str2;
        this.h0 = i0;
        this.i0 = w0;
    }

    @Override // ax.b6.W0.a
    final void a() throws RemoteException {
        H0 h0;
        h0 = this.i0.i;
        ((H0) C0821p.l(h0)).getConditionalUserProperties(this.f0, this.g0, this.h0);
    }

    @Override // ax.b6.W0.a
    protected final void b() {
        this.h0.n(null);
    }
}
