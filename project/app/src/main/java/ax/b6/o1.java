/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.os.RemoteException;
import ax.M5.p;
import ax.b6.I0;
import ax.b6.W0;

final class o1
extends W0.a {
    private final String f0;
    private final I0 g0;
    private final W0 h0;

    o1(W0 w02, String string, I0 i02) {
        this.f0 = string;
        this.g0 = i02;
        this.h0 = w02;
        super(w02);
    }

    @Override
    final void a() throws RemoteException {
        p.l(W0.d(this.h0)).getMaxUserProperties(this.f0, this.g0);
    }

    @Override
    protected final void b() {
        this.g0.n(null);
    }
}

