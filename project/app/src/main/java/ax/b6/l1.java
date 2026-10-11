/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.os.RemoteException;
import ax.M5.p;
import ax.b6.I0;
import ax.b6.W0;

final class l1
extends W0.a {
    private final String f0;
    private final String g0;
    private final boolean h0;
    private final I0 i0;
    private final W0 j0;

    l1(W0 w02, String string, String string2, boolean bl, I0 i02) {
        this.f0 = string;
        this.g0 = string2;
        this.h0 = bl;
        this.i0 = i02;
        this.j0 = w02;
        super(w02);
    }

    @Override
    final void a() throws RemoteException {
        p.l(W0.d(this.j0)).getUserProperties(this.f0, this.g0, this.h0, this.i0);
    }

    @Override
    protected final void b() {
        this.i0.n(null);
    }
}

