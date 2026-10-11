package ax.b6;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import ax.M5.C0821p;
import ax.b6.W0;

/* renamed from: ax.b6.s1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1660s1 extends W0.a {
    private final /* synthetic */ Bundle f0;
    private final /* synthetic */ Activity g0;
    private final /* synthetic */ W0.c h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1660s1(W0.c cVar, Bundle bundle, Activity activity) {
        super(W0.this);
        this.f0 = bundle;
        this.g0 = activity;
        this.h0 = cVar;
    }

    @Override // ax.b6.W0.a
    final void a() throws RemoteException {
        Bundle bundle;
        H0 h0;
        if (this.f0 != null) {
            bundle = new Bundle();
            if (this.f0.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f0.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        h0 = W0.this.i;
        ((H0) C0821p.l(h0)).onActivityCreated(ax.T5.b.a2(this.g0), bundle, this.c0);
    }
}
