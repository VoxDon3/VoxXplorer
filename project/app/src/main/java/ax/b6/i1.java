/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.os.RemoteException;
import ax.M5.p;
import ax.b6.I0;
import ax.b6.W0;

final class i1
extends W0.a {
    private final I0 f0;
    private final W0 g0;

    i1(W0 w02, I0 i02) {
        this.f0 = i02;
        this.g0 = w02;
        super(w02);
    }

    @Override
    final void a() throws RemoteException {
        p.l(W0.d(this.g0)).getGmpAppId(this.f0);
    }

    @Override
    protected final void b() {
        this.f0.n(null);
    }
}

