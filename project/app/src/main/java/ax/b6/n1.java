/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.os.RemoteException;
import ax.M5.p;
import ax.T5.b;
import ax.b6.W0;

final class n1
extends W0.a {
    private final int f0;
    private final String g0;
    private final Object h0;
    private final Object i0;
    private final Object j0;
    private final W0 k0;

    n1(W0 w02, boolean bl, int n8, String string, Object object, Object object2, Object object3) {
        this.f0 = 5;
        this.g0 = string;
        this.h0 = object;
        this.i0 = null;
        this.j0 = null;
        this.k0 = w02;
        super(w02, false);
    }

    @Override
    final void a() throws RemoteException {
        p.l(W0.d(this.k0)).logHealthData(this.f0, this.g0, b.a2(this.h0), b.a2(null), b.a2(null));
    }
}

