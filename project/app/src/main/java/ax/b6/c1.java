/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.os.RemoteException;
import ax.M5.p;
import ax.b6.W0;

final class c1
extends W0.a {
    private final Boolean f0;
    private final W0 g0;

    c1(W0 w02, Boolean bl) {
        this.f0 = bl;
        this.g0 = w02;
        super(w02);
    }

    @Override
    final void a() throws RemoteException {
        if (this.f0 != null) {
            p.l(W0.d(this.g0)).setMeasurementEnabled(this.f0, this.q);
            return;
        }
        p.l(W0.d(this.g0)).clearMeasurementEnabled(this.q);
    }
}

