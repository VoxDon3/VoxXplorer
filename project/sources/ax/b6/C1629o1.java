package ax.b6;

import android.os.RemoteException;
import ax.M5.C0821p;
import ax.b6.W0;

/* renamed from: ax.b6.o1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1629o1 extends W0.a {
    private final /* synthetic */ String f0;
    private final /* synthetic */ I0 g0;
    private final /* synthetic */ W0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1629o1(W0 w0, String str, I0 i0) {
        super(w0);
        this.f0 = str;
        this.g0 = i0;
        this.h0 = w0;
    }

    @Override // ax.b6.W0.a
    final void a() throws RemoteException {
        H0 h0;
        h0 = this.h0.i;
        ((H0) C0821p.l(h0)).getMaxUserProperties(this.f0, this.g0);
    }

    @Override // ax.b6.W0.a
    protected final void b() {
        this.g0.n(null);
    }
}
