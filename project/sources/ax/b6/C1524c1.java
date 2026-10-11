package ax.b6;

import android.os.RemoteException;
import ax.M5.C0821p;
import ax.b6.W0;

/* renamed from: ax.b6.c1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1524c1 extends W0.a {
    private final /* synthetic */ Boolean f0;
    private final /* synthetic */ W0 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1524c1(W0 w0, Boolean bool) {
        super(w0);
        this.f0 = bool;
        this.g0 = w0;
    }

    @Override // ax.b6.W0.a
    final void a() throws RemoteException {
        H0 h0;
        H0 h02;
        if (this.f0 != null) {
            h02 = this.g0.i;
            ((H0) C0821p.l(h02)).setMeasurementEnabled(this.f0.booleanValue(), this.q);
        } else {
            h0 = this.g0.i;
            ((H0) C0821p.l(h0)).clearMeasurementEnabled(this.q);
        }
    }
}
