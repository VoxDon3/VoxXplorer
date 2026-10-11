/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.os.RemoteException;
import ax.M5.p;
import ax.b6.W0;

final class p1
extends W0.a {
    private final boolean f0;
    private final W0 g0;

    p1(W0 w02, boolean bl) {
        this.f0 = bl;
        this.g0 = w02;
        super(w02);
    }

    @Override
    final void a() throws RemoteException {
        p.l(W0.d(this.g0)).setDataCollectionEnabled(this.f0);
    }
}

