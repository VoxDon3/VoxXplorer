/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.os.RemoteException;
import ax.M5.p;
import ax.b6.W0;

final class g1
extends W0.a {
    private final String f0;
    private final W0 g0;

    g1(W0 w02, String string) {
        this.f0 = string;
        this.g0 = w02;
        super(w02);
    }

    @Override
    final void a() throws RemoteException {
        p.l(W0.d(this.g0)).beginAdUnitExposure(this.f0, this.c0);
    }
}

