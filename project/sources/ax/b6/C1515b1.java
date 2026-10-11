package ax.b6;

import android.app.Activity;
import android.os.RemoteException;
import ax.M5.C0821p;
import ax.b6.W0;

/* renamed from: ax.b6.b1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1515b1 extends W0.a {
    private final /* synthetic */ Activity f0;
    private final /* synthetic */ String g0;
    private final /* synthetic */ String h0;
    private final /* synthetic */ W0 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1515b1(W0 w0, Activity activity, String str, String str2) {
        super(w0);
        this.f0 = activity;
        this.g0 = str;
        this.h0 = str2;
        this.i0 = w0;
    }

    @Override // ax.b6.W0.a
    final void a() throws RemoteException {
        H0 h0;
        h0 = this.i0.i;
        ((H0) C0821p.l(h0)).setCurrentScreen(ax.T5.b.a2(this.f0), this.g0, this.h0, this.q);
    }
}
