/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.os.RemoteException;
import ax.M5.p;
import ax.b6.I0;
import ax.b6.W0;

final class Z0
extends W0.a {
    private final String f0;
    private final String g0;
    private final I0 h0;
    private final W0 i0;

    Z0(W0 w02, String string, String string2, I0 i02) {
        this.f0 = string;
        this.g0 = string2;
        this.h0 = i02;
        this.i0 = w02;
        super(w02);
    }

    @Override
    final void a() throws RemoteException {
        p.l(W0.d(this.i0)).getConditionalUserProperties(this.f0, this.g0, this.h0);
    }

    @Override
    protected final void b() {
        this.h0.n(null);
    }
}

