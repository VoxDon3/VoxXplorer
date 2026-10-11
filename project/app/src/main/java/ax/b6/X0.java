/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.os.Bundle;
import android.os.RemoteException;
import ax.M5.p;
import ax.b6.W0;

final class X0
extends W0.a {
    private final Bundle f0;
    private final W0 g0;

    X0(W0 w02, Bundle bundle) {
        this.f0 = bundle;
        this.g0 = w02;
        super(w02);
    }

    @Override
    final void a() throws RemoteException {
        p.l(W0.d(this.g0)).setConditionalUserProperty(this.f0, this.q);
    }
}

