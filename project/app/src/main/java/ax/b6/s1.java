/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import ax.M5.p;
import ax.T5.b;
import ax.b6.W0;

final class s1
extends W0.a {
    private final Bundle f0;
    private final Activity g0;
    private final W0.c h0;

    s1(W0.c c8, Bundle bundle, Activity activity) {
        this.f0 = bundle;
        this.g0 = activity;
        this.h0 = c8;
        super(c8.a);
    }

    @Override
    final void a() throws RemoteException {
        Bundle bundle;
        if (this.f0 != null) {
            Bundle bundle2;
            bundle = bundle2 = new Bundle();
            if (this.f0.containsKey("com.google.app_measurement.screen_service")) {
                Object object = this.f0.get("com.google.app_measurement.screen_service");
                bundle = bundle2;
                if (object instanceof Bundle) {
                    bundle2.putBundle("com.google.app_measurement.screen_service", (Bundle)object);
                    bundle = bundle2;
                }
            }
        } else {
            bundle = null;
        }
        p.l(W0.d(this.h0.a)).onActivityCreated(b.a2(this.g0), bundle, this.c0);
    }
}

