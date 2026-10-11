/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.os.RemoteException;
import ax.M5.p;
import ax.T5.b;
import ax.b6.W0;

final class Y0
extends W0.a {
    private final String f0;
    private final String g0;
    private final Object h0;
    private final boolean i0;
    private final W0 j0;

    Y0(W0 w02, String string, String string2, Object object, boolean bl) {
        this.f0 = string;
        this.g0 = string2;
        this.h0 = object;
        this.i0 = bl;
        this.j0 = w02;
        super(w02);
    }

    @Override
    final void a() throws RemoteException {
        p.l(W0.d(this.j0)).setUserProperty(this.f0, this.g0, b.a2(this.h0), this.i0, this.q);
    }
}

