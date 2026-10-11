package ax.b6;

import android.os.Bundle;
import android.os.RemoteException;
import ax.M5.C0821p;
import ax.b6.W0;

/* renamed from: ax.b6.r1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1652r1 extends W0.a {
    private final /* synthetic */ Long f0;
    private final /* synthetic */ String g0;
    private final /* synthetic */ String h0;
    private final /* synthetic */ Bundle i0;
    private final /* synthetic */ boolean j0;
    private final /* synthetic */ boolean k0;
    private final /* synthetic */ W0 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1652r1(W0 w0, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(w0);
        this.f0 = l;
        this.g0 = str;
        this.h0 = str2;
        this.i0 = bundle;
        this.j0 = z;
        this.k0 = z2;
        this.l0 = w0;
    }

    @Override // ax.b6.W0.a
    final void a() throws RemoteException {
        H0 h0;
        Long l = this.f0;
        long longValue = l == null ? this.q : l.longValue();
        h0 = this.l0.i;
        ((H0) C0821p.l(h0)).logEvent(this.g0, this.h0, this.i0, this.j0, this.k0, longValue);
    }
}
