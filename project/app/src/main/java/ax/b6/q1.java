/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.os.RemoteException;
import ax.M5.p;
import ax.b6.W0;

final class q1
extends W0.a {
    private final W0.b f0;
    private final W0 g0;

    q1(W0 w02, W0.b b8) {
        this.f0 = b8;
        this.g0 = w02;
        super(w02);
    }

    @Override
    final void a() throws RemoteException {
        p.l(W0.d(this.g0)).registerOnMeasurementEventListener(this.f0);
    }
}

