/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.os.Bundle;
import android.os.RemoteException;
import ax.M5.p;
import ax.b6.W0;

final class r1
extends W0.a {
    private final Long f0;
    private final String g0;
    private final String h0;
    private final Bundle i0;
    private final boolean j0;
    private final boolean k0;
    private final W0 l0;

    r1(W0 w02, Long l8, String string, String string2, Bundle bundle, boolean bl, boolean bl2) {
        this.f0 = l8;
        this.g0 = string;
        this.h0 = string2;
        this.i0 = bundle;
        this.j0 = bl;
        this.k0 = bl2;
        this.l0 = w02;
        super(w02);
    }

    @Override
    final void a() throws RemoteException {
        Long l8 = this.f0;
        long l9 = l8 == null ? this.q : l8;
        p.l(W0.d(this.l0)).logEvent(this.g0, this.h0, this.i0, this.j0, this.k0, l9);
    }
}

