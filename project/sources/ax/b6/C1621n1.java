package ax.b6;

import android.os.RemoteException;
import ax.M5.C0821p;
import ax.b6.W0;

/* renamed from: ax.b6.n1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1621n1 extends W0.a {
    private final /* synthetic */ String g0;
    private final /* synthetic */ Object h0;
    private final /* synthetic */ W0 k0;
    private final /* synthetic */ int f0 = 5;
    private final /* synthetic */ Object i0 = null;
    private final /* synthetic */ Object j0 = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1621n1(W0 w0, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.g0 = str;
        this.h0 = obj;
        this.k0 = w0;
    }

    @Override // ax.b6.W0.a
    final void a() throws RemoteException {
        H0 h0;
        h0 = this.k0.i;
        ((H0) C0821p.l(h0)).logHealthData(this.f0, this.g0, ax.T5.b.a2(this.h0), ax.T5.b.a2(null), ax.T5.b.a2(null));
    }
}
