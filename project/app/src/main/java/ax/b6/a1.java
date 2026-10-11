/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.os.Bundle;
import android.os.RemoteException;
import ax.M5.p;
import ax.b6.W0;

final class a1
extends W0.a {
    private final String f0;
    private final String g0;
    private final Bundle h0;
    private final W0 i0;

    a1(W0 w02, String string, String string2, Bundle bundle) {
        this.f0 = string;
        this.g0 = string2;
        this.h0 = bundle;
        this.i0 = w02;
        super(w02);
    }

    @Override
    final void a() throws RemoteException {
        p.l(W0.d(this.i0)).clearConditionalUserProperty(this.f0, this.g0, this.h0);
    }
}

